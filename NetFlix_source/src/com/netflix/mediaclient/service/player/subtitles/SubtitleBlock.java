// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.SubtitleUtils;
import com.netflix.mediaclient.util.XmlDomUtils;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Referenced classes of package com.netflix.mediaclient.service.player.subtitles:
//            TextStyle, SubtitleParser, SubtitleTextNode, Region

public class SubtitleBlock
{

    public static final String BEGIN = "begin";
    public static final String END = "end";
    public static final String ID = "xml:id";
    public static final String REGION = "region";
    private static final String TAG = "nf_subtitles";
    private long mEnd;
    private String mId;
    private float mMaxFontSizeMultiplier;
    private Region mRegion;
    private long mStart;
    private TextStyle mStyle;
    private List mTextNodes;
    private int mTotalNumberOfLines;

    SubtitleBlock(Element element, SubtitleParser subtitleparser, TextStyle textstyle, Region region)
    {
        mTextNodes = new ArrayList();
        if (element == null)
        {
            throw new IllegalArgumentException("P can not be null!");
        }
        if (subtitleparser == null)
        {
            throw new IllegalArgumentException("Parser can not be null!");
        }
        mId = element.getAttribute("xml:id");
        if (mId == null)
        {
            Log.w("nf_subtitles", "Block id is not specified, it will be faked.");
        }
        String s = element.getAttribute("region");
        if (StringUtils.isEmpty(s))
        {
            int j;
            if (region != null)
            {
                Log.d("nf_subtitles", "Region is not specified. Use body region.");
                mRegion = region;
            } else
            {
                Log.w("nf_subtitles", "Region is not specified and body region is not provided. Use default region.");
            }
            break MISSING_BLOCK_LABEL_107;
        } else
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Belongs to region ").append(s).toString());
            }
            mRegion = subtitleparser.getNamedRegion(s);
            if (mRegion == null && Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Region NOT found for id ").append(s).append(" and body region not used, use default region!").toString());
            }
            continue;
        }
        do
        {
            mStyle = TextStyle.createInstanceFromContainer(element, subtitleparser, textstyle);
            mStart = parseTime(element.getAttribute("begin"), subtitleparser.getTickRate());
            mEnd = parseTime(element.getAttribute("end"), subtitleparser.getTickRate());
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Use subtitle from ").append(mStart).append(" to ").append(mEnd).toString());
            }
            element = element.getChildNodes();
            int k = 0;
            j = 0;
            while (j < element.getLength()) 
            {
                textstyle = element.item(j);
                int i;
                if (textstyle.getNodeType() == 1)
                {
                    textstyle = (Element)textstyle;
                    if ("br".equalsIgnoreCase(textstyle.getTagName()))
                    {
                        Log.d("nf_subtitles", "Break line, increase br counter");
                        i = k + 1;
                    } else
                    {
                        i = k;
                        if ("span".equalsIgnoreCase(textstyle.getTagName()))
                        {
                            Log.d("nf_subtitles", "SPAN node, create subtitle block");
                            textstyle = new SubtitleTextNode(TextStyle.createInstanceFromContainer(textstyle, subtitleparser, mStyle), XmlDomUtils.getElementText(textstyle), k);
                            mTextNodes.add(textstyle);
                            i = 0;
                            updateBlockContainerDimensions(textstyle);
                        }
                    }
                } else
                if (textstyle.getNodeType() == 3)
                {
                    Log.d("nf_subtitles", "Text node, create subtitle block");
                    textstyle = new SubtitleTextNode(mStyle, textstyle.getTextContent(), k);
                    mTextNodes.add(textstyle);
                    i = 0;
                    updateBlockContainerDimensions(textstyle);
                } else
                {
                    i = k;
                    if (Log.isLoggable("nf_subtitles", 3))
                    {
                        Log.d("nf_subtitles", (new StringBuilder()).append("Ignore node of type: ").append(textstyle.getNodeType()).toString());
                        i = k;
                    }
                }
                j++;
                k = i;
            }
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Total number of lines needed: ").append(mTotalNumberOfLines).toString());
                Log.d("nf_subtitles", (new StringBuilder()).append("Max font size multplier from content: ").append(mMaxFontSizeMultiplier).toString());
            }
            element = subtitleparser.getUserDefaults();
            if (element != null)
            {
                Log.d("nf_subtitles", "Use user overide for mMaxFontSizeMultiplier");
                float f;
                if (element.getFontSize() != null)
                {
                    f = element.getFontSize().intValue();
                } else
                {
                    f = 100F;
                }
                mMaxFontSizeMultiplier = f;
            }
            if (mMaxFontSizeMultiplier < 0.0F)
            {
                Log.d("nf_subtitles", "Max font size multplier set to 100! ");
                mMaxFontSizeMultiplier = 100F;
            }
            return;
        } while (true);
    }

    private long parseTime(String s, double d)
    {
        return SubtitleUtils.parseTime(s, d);
    }

    private void updateBlockContainerDimensions(SubtitleTextNode subtitletextnode)
    {
        mTotalNumberOfLines = mTotalNumberOfLines + subtitletextnode.getLineBreaks() + 1;
        if (subtitletextnode.getStyle() != null)
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Font size: ").append(subtitletextnode.getStyle().getFontSize()).toString());
        }
        if (subtitletextnode.getStyle() != null && subtitletextnode.getStyle().getFontSize() != null && mMaxFontSizeMultiplier < (float)subtitletextnode.getStyle().getFontSize().intValue())
        {
            mMaxFontSizeMultiplier = subtitletextnode.getStyle().getFontSize().intValue();
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof SubtitleBlock))
        {
            return false;
        }
        obj = (SubtitleBlock)obj;
        if (mId != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((SubtitleBlock) (obj)).mId == null) goto _L1; else goto _L3
_L3:
        return false;
        if (mId.equals(((SubtitleBlock) (obj)).mId)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public long getEnd()
    {
        return mEnd;
    }

    public String getId()
    {
        return mId;
    }

    public Region getRegion()
    {
        return mRegion;
    }

    public long getStart()
    {
        return mStart;
    }

    public TextStyle getStyle()
    {
        return mStyle;
    }

    public List getTextNodes()
    {
        return mTextNodes;
    }

    public int getTotalNumberOfLines()
    {
        return mTotalNumberOfLines;
    }

    public int hashCode()
    {
        int i;
        if (mId == null)
        {
            i = 0;
        } else
        {
            i = mId.hashCode();
        }
        return i + 31;
    }

    public boolean isVisible(long l)
    {
        return l >= mStart && l <= mEnd;
    }

    public boolean isVisibleInGivenTimeRange(long l, long l1)
    {
        boolean flag1 = false;
        if (l > l1)
        {
            Log.e("nf_subtitles", "From can not be later than to!");
            return false;
        }
        boolean flag = flag1;
        if (l1 > mStart)
        {
            flag = flag1;
            if (l <= mEnd)
            {
                flag = true;
            }
        }
        return flag;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SubtitleBlock [mId=").append(mId).append(", mRegion=").append(mRegion).append(", mTextNodes=").append(mTextNodes).append(", mStart=").append(mStart).append(", mEnd=").append(mEnd).append(", mStyle=").append(mStyle).append(", mTotalNumberOfLines=").append(mTotalNumberOfLines).append(", mMaxFontSizeMultiplier=").append(mMaxFontSizeMultiplier).append("]").toString();
    }
}
