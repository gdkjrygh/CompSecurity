// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.nrdp.media.SubtitleData;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.XmlDomUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// Referenced classes of package com.netflix.mediaclient.service.player.subtitles:
//            SubtitleBlock, TextStyle, Region, CellResolution, 
//            SubtitleScreen

public class SubtitleParser
{

    private static final int MILLISECONDS_PER_SECOND = 1000;
    private static final int START_TIME_TRASHOLD = 30000;
    private static final String TAG = "nf_subtitles";
    private String mAspectExtent;
    private CellResolution mCellResolution;
    private final TextStyle mDefaults;
    private int mIndexOfLastSearch;
    private String mPixelAspectRatio;
    private boolean mReady;
    private final Map mRegions = new HashMap();
    private final Map mStyles = new HashMap();
    private com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile mSubtitleProfile;
    private final List mTextBlocks = new ArrayList();
    private double mTickRate;
    private String mTimeBase;
    private final TextStyle mUserDefaults;
    private final float mVideoAspectRatio;

    public SubtitleParser(float f, TextStyle textstyle, TextStyle textstyle1)
    {
        mIndexOfLastSearch = -1;
        mVideoAspectRatio = f;
        mUserDefaults = textstyle;
        mDefaults = createDefaultStyle(textstyle, textstyle1);
    }

    private int compareBlockTime(long l, int i)
    {
        if (mTextBlocks.size() <= i)
        {
            Log.e("nf_subtitles", (new StringBuilder()).append("Index (").append(i).append(") is higher than numbet of blocks  ").append(mTextBlocks.size()).toString());
        } else
        {
            SubtitleBlock subtitleblock = (SubtitleBlock)mTextBlocks.get(i);
            if (subtitleblock.isVisible(l))
            {
                if (Log.isLoggable("nf_subtitles", 3))
                {
                    Log.d("nf_subtitles", (new StringBuilder()).append("Block ").append(i).append(" is visible for pts ").append(l).toString());
                }
                return 0;
            }
            if (subtitleblock.getStart() < l)
            {
                if (Log.isLoggable("nf_subtitles", 3))
                {
                    Log.d("nf_subtitles", (new StringBuilder()).append("Block ").append(i).append(" is before pts ").append(l).toString());
                    return -1;
                }
            } else
            {
                if (Log.isLoggable("nf_subtitles", 3))
                {
                    Log.d("nf_subtitles", (new StringBuilder()).append("Block ").append(i).append(" is after pts ").append(l).toString());
                }
                return 1;
            }
        }
        return -1;
    }

    private static TextStyle createDefaultStyle(TextStyle textstyle, TextStyle textstyle1)
    {
        TextStyle textstyle2 = new TextStyle();
        TextStyle textstyle3 = TextStyle.DEFAULT_DEVICE_TEXT_STYLE;
        if (textstyle != null)
        {
            Log.d("nf_subtitles", "User overrides exist for style, apply it first!");
            textstyle2.merge(textstyle);
        }
        if (textstyle1 != null)
        {
            Log.d("nf_subtitles", "Region overrides exist, use region defaults");
            textstyle2.merge(textstyle1);
        } else
        {
            Log.d("nf_subtitles", "Region overrides does NOT exist for style, use just devices defaults");
        }
        textstyle2.merge(textstyle3);
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Style default: ").append(textstyle2).toString());
        }
        return textstyle2;
    }

    private int findIndex(long l)
    {
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Index was not known before. Find it for position ").append(l).toString());
        }
        int i;
        if (l <= 30000L)
        {
            Log.d("nf_subtitles", "Less than treshold, return 0");
            i = 0;
        } else
        {
            Log.d("nf_subtitles", "Try to guess");
            int k = search(l);
            int j = k;
            if (k > 0)
            {
                Log.d("nf_subtitles", "Lets see if index is first in array or just first found");
                i = k - 1;
                do
                {
                    j = k;
                    if (i <= 0)
                    {
                        break;
                    }
                    j = k;
                    if (compareBlockTime(l, i) != 0)
                    {
                        break;
                    }
                    if (Log.isLoggable("nf_subtitles", 3))
                    {
                        Log.d("nf_subtitles", (new StringBuilder()).append("New Index found ").append(i).toString());
                    }
                    k = i;
                    i--;
                } while (true);
            }
            i = j;
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Index found ").append(j).toString());
                return j;
            }
        }
        return i;
    }

    private int getLastKnownPosition(long l)
    {
        if (mIndexOfLastSearch < 0)
        {
            mIndexOfLastSearch = findIndex(l);
        }
        return mIndexOfLastSearch;
    }

    private void parseBody(Element element)
    {
        if (element == null)
        {
            throw new IllegalArgumentException("Body element can not be null!");
        }
        Log.d("nf_subtitles", "Parsing body started");
        Object obj = TextStyle.createInstanceFromContainer(element, this, mDefaults);
        Element element1 = XmlDomUtils.getFirstFoundElementByTagName(element, "div");
        if (element1 == null)
        {
            Log.e("nf_subtitles", "DIV element not found!");
            return;
        }
        element = TextStyle.createInstanceFromContainer(element1, this, ((TextStyle) (obj)));
        obj = element1.getElementsByTagName("p");
        if (obj == null || ((NodeList) (obj)).getLength() < 1)
        {
            Log.e("nf_subtitles", "P element(s) not found!");
            return;
        }
        int i = 0;
        while (i < ((NodeList) (obj)).getLength()) 
        {
            Object obj1 = ((NodeList) (obj)).item(i);
            if (obj1 instanceof Element)
            {
                obj1 = new SubtitleBlock((Element)obj1, this, element, null);
                mTextBlocks.add(obj1);
            } else
            {
                Log.e("nf_subtitles", "Node is not instance of element for P!");
            }
            i++;
        }
        Log.d("nf_subtitles", "Parsing body done");
    }

    private void parseHead(Element element)
    {
        if (element == null)
        {
            throw new IllegalArgumentException("Head element can not be null!");
        }
        String s = element.getAttribute("use");
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Subtitle profile: ").append(s).toString());
        }
        mSubtitleProfile = com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile.fromNccpCode(s);
        parseStyling(element);
        parseRegions(element);
    }

    private void parseRegions(Element element)
    {
        Log.d("nf_subtitles", "Parsing regions started");
        element = XmlDomUtils.getFirstFoundElementByTagName(element, "layout");
        if (element == null)
        {
            Log.e("nf_subtitles", "Layout element not found!");
            return;
        }
        element = element.getElementsByTagName("region");
        if (element == null || element.getLength() < 1)
        {
            Log.e("nf_subtitles", "Region element(s) not found!");
            return;
        }
        int i = 0;
        while (i < element.getLength()) 
        {
            Object obj = element.item(i);
            if (obj instanceof Element)
            {
                obj = Region.createRegion(this, (Element)obj, mCellResolution, mDefaults);
                if (obj == null)
                {
                    Log.w("nf_subtitles", "Region not found!");
                } else
                if (((Region) (obj)).getId() == null)
                {
                    if (Log.isLoggable("nf_subtitles", 5))
                    {
                        Log.w("nf_subtitles", (new StringBuilder()).append("Region exist, but its ID is null: ").append(obj).toString());
                    }
                } else
                {
                    if (Log.isLoggable("nf_subtitles", 3))
                    {
                        Log.d("nf_subtitles", (new StringBuilder()).append("Region ").append(i).append(" found ").append(obj).toString());
                    }
                    mRegions.put(((Region) (obj)).getId(), obj);
                }
            } else
            {
                Log.e("nf_subtitles", "Node is not instance of element for region!");
            }
            i++;
        }
        Log.d("nf_subtitles", "Parsing regions done");
    }

    private void parseStyling(Element element)
    {
        Log.d("nf_subtitles", "Parsing styling started");
        element = XmlDomUtils.getFirstFoundElementByTagName(element, "styling");
        if (element == null)
        {
            Log.d("nf_subtitles", "Styling element not found!");
            return;
        }
        element = element.getElementsByTagName("style");
        if (element == null || element.getLength() < 1)
        {
            Log.d("nf_subtitles", "Style element(s) not found!");
            return;
        }
        int i = 0;
        while (i < element.getLength()) 
        {
            Object obj = element.item(i);
            if (obj instanceof Element)
            {
                obj = TextStyle.createInstanceFromContainer((Element)obj, this, null);
                if (obj == null)
                {
                    Log.w("nf_subtitles", "Style not found!");
                } else
                if (((TextStyle) (obj)).getId() == null)
                {
                    if (Log.isLoggable("nf_subtitles", 5))
                    {
                        Log.w("nf_subtitles", (new StringBuilder()).append("Style exist, nut its ID is null: ").append(obj).toString());
                    }
                } else
                {
                    mStyles.put(((TextStyle) (obj)).getId(), obj);
                    if (Log.isLoggable("nf_subtitles", 3))
                    {
                        Log.d("nf_subtitles", (new StringBuilder()).append("Style found: ").append(obj).toString());
                    }
                }
            } else
            {
                Log.e("nf_subtitles", "Node is not instance of element for style!");
            }
            i++;
        }
        Log.d("nf_subtitles", "Parsing styling done");
    }

    private void parseTt(Element element)
    {
        if (element == null)
        {
            throw new IllegalArgumentException("Root element can not be null!");
        }
        String s = element.getAttribute("ttp:tickRate");
        if (!StringUtils.isEmpty(s))
        {
            double d = Double.parseDouble(s);
            if (d <= 0.0D)
            {
                Log.d("nf_subtitles", "Tickrate defaults to 1000");
                mTickRate = 1000D;
            } else
            {
                Log.d("nf_subtitles", "Tickrate calculate");
                mTickRate = 1000D / d;
            }
        } else
        {
            Log.d("nf_subtitles", "Tickrate defaults to 1000 on empty tag");
            mTickRate = 1000D;
        }
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Tickrate final: ").append(mTickRate).toString());
        }
        mPixelAspectRatio = element.getAttribute("ttp:pixelAspectRatio");
        mAspectExtent = element.getAttribute("tts:extent");
        element = element.getAttribute("ttp:cellResolution");
        if (!StringUtils.isEmpty(element))
        {
            mCellResolution = CellResolution.createInstance(element, mAspectExtent, mPixelAspectRatio, mVideoAspectRatio);
        }
    }

    private int search(long l)
    {
        int i = 0;
        for (int j = mTextBlocks.size() - 1; j >= i;)
        {
            int k = i + (j - i) / 2;
            int i1 = compareBlockTime(l, k);
            if (i1 == 0)
            {
                return k;
            }
            if (i1 < 0)
            {
                i = k + 1;
            } else
            {
                j = k - 1;
            }
        }

        return 0;
    }

    public CellResolution getCellResolution()
    {
        return mCellResolution;
    }

    public Region getNamedRegion(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (Region)mRegions.get(s);
        }
    }

    public TextStyle getNamedStyle(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (TextStyle)mStyles.get(s);
        }
    }

    public Region[] getRegions()
    {
        if (mRegions == null || mRegions.size() < 1)
        {
            return new Region[0];
        } else
        {
            return (Region[])mRegions.values().toArray(new Region[mRegions.size()]);
        }
    }

    public com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile getSubtitleProfile()
    {
        return mSubtitleProfile;
    }

    public SubtitleScreen getSubtitlesForPosition(long l)
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        boolean flag;
        int i;
        int j;
        long l1;
        l1 = l + 2000L;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Subtitle blocks: ").append(mTextBlocks.size()).toString());
        }
        i = getLastKnownPosition(l);
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("==> Start search from index: ").append(i).toString());
        }
        flag = false;
        j = mTextBlocks.size();
_L2:
        SubtitleBlock subtitleblock;
        boolean flag1;
label0:
        {
            if (i < j)
            {
                subtitleblock = (SubtitleBlock)mTextBlocks.get(i);
                if (subtitleblock.getStart() <= l1)
                {
                    break label0;
                }
                Log.d("nf_subtitles", "Subtitle block start is in future more than 2 sec, break search");
            }
            return new SubtitleScreen(this, arraylist, arraylist1, 2000);
        }
        if (!subtitleblock.isVisible(l))
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag;
        if (!flag)
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("===> New index search found: ").append(i).toString());
            }
            flag1 = true;
            mIndexOfLastSearch = i;
        }
        arraylist.add(subtitleblock);
_L3:
        i++;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
        flag1 = flag;
        if (subtitleblock.isVisibleInGivenTimeRange(l, l1))
        {
            arraylist1.add(subtitleblock);
            flag1 = flag;
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public TextStyle getTextStyleDefault()
    {
        return mDefaults;
    }

    public double getTickRate()
    {
        return mTickRate;
    }

    public String getTimeBase()
    {
        return mTimeBase;
    }

    public TextStyle getUserDefaults()
    {
        return mUserDefaults;
    }

    public boolean isReady()
    {
        return mReady;
    }

    public void parse(SubtitleData subtitledata)
        throws IOException, ParserConfigurationException, SAXException
    {
        Log.d("nf_subtitles", "==> Subtitle parsing started...");
        if (subtitledata == null)
        {
            throw new IllegalArgumentException("Subtitle data event can not be null!");
        } else
        {
            subtitledata = XmlDomUtils.createDocument(subtitledata.getXml()).getDocumentElement();
            parseTt(subtitledata);
            parseHead(XmlDomUtils.getChildElementByTagName(subtitledata, "head"));
            Log.d("nf_subtitles", "Ready to serve subtitles...");
            mReady = true;
            parseBody(XmlDomUtils.getChildElementByTagName(subtitledata, "body"));
            Log.d("nf_subtitles", "==> Subtitle parsing completed.");
            return;
        }
    }

    public void seeked()
    {
        mIndexOfLastSearch = -1;
    }
}
