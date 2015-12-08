// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

// Referenced classes of package com.netflix.mediaclient.service.player.subtitles:
//            TextStyle, DoubleLength, HorizontalAlignment, VerticalAlignment, 
//            CellResolution, SubtitleParser

public class Region
{

    public static final String DEFAULT_REGION_ID = "BOTTOM_CENTER";
    public static final String DISPLAY_ALIGN = "tts:displayAlign";
    public static final String EXTENT = "tts:extent";
    public static final String ORIGIN = "tts:origin";
    private static final String TAG = "nf_subtitles";
    public static final String TEXT_ALIGN = "tts:textAlign";
    private CellResolution mCellResolution;
    private DoubleLength mExtent;
    private HorizontalAlignment mHorizontalAlignment;
    private String mId;
    private DoubleLength mOrigin;
    private TextStyle mTextStyle;
    private VerticalAlignment mVerticalAlignment;

    private Region(SubtitleParser subtitleparser, Element element, CellResolution cellresolution, TextStyle textstyle)
    {
        mId = element.getAttribute("xml:id");
        mCellResolution = cellresolution;
        subtitleparser = TextStyle.createInstanceFromContainer(element, subtitleparser, textstyle);
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Style defined as attribute in region ").append(subtitleparser).toString());
        }
        if (subtitleparser != null)
        {
            if (subtitleparser.getHorizontalAlignment() != null)
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Hor alig found as attribute ").append(subtitleparser.getHorizontalAlignment()).toString());
                mHorizontalAlignment = subtitleparser.getHorizontalAlignment();
            }
            if (subtitleparser.getVerticalAlignment() != null)
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Vert alig found as attribute ").append(subtitleparser.getVerticalAlignment()).toString());
                mVerticalAlignment = subtitleparser.getVerticalAlignment();
            }
            if (subtitleparser.getExtent() != null)
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Extent as attribute ").append(subtitleparser.getExtent()).toString());
                mExtent = subtitleparser.getExtent();
            }
            if (subtitleparser.getOrigin() != null)
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Origin as attribute ").append(subtitleparser.getOrigin()).toString());
                mOrigin = subtitleparser.getOrigin();
            }
        }
        element = parseStyles(element);
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Style defined as elements in region ").append(element).toString());
        }
        mTextStyle = new TextStyle();
        if (element != null)
        {
            Log.d("nf_subtitles", "Region parsed styles found use them first");
            mTextStyle.merge(element);
        }
        if (subtitleparser != null)
        {
            Log.d("nf_subtitles", "Region Attribute styles found use them second");
            mTextStyle.merge(subtitleparser);
        }
    }

    private Region(String s, DoubleLength doublelength, DoubleLength doublelength1, HorizontalAlignment horizontalalignment, VerticalAlignment verticalalignment, CellResolution cellresolution, TextStyle textstyle)
    {
        mId = s;
        mExtent = doublelength;
        mOrigin = doublelength1;
        mHorizontalAlignment = horizontalalignment;
        mVerticalAlignment = verticalalignment;
        mCellResolution = cellresolution;
        mTextStyle = textstyle;
    }

    public static Region createInstanceOfDefaultRegion(TextStyle textstyle)
    {
        return new Region("DEFAULT_REGION", DoubleLength.ZERO, DoubleLength.ZERO, HorizontalAlignment.left, VerticalAlignment.top, null, textstyle);
    }

    public static Region createInstanceOfSimpleSdhRegion(TextStyle textstyle)
    {
        return new Region("SIMPLE_SDH", DoubleLength.SIMPLE_SDH_EXTENT, DoubleLength.ZERO, HorizontalAlignment.left, VerticalAlignment.top, null, textstyle);
    }

    public static Region createRegion(SubtitleParser subtitleparser, Element element, CellResolution cellresolution, TextStyle textstyle)
    {
        return new Region(subtitleparser, element, cellresolution, textstyle);
    }

    private TextStyle parseStyles(Element element)
    {
        NodeList nodelist = element.getElementsByTagName("style");
        if (nodelist != null && nodelist.getLength() >= 1) goto _L2; else goto _L1
_L1:
        Log.e("nf_subtitles", "Styles element(s) not found in region");
        element = null;
_L4:
        return element;
_L2:
        if (Log.isLoggable("nf_subtitles", 3))
        {
            Log.d("nf_subtitles", (new StringBuilder()).append("Found ").append(nodelist.getLength()).append(" styles for region").toString());
        }
        TextStyle textstyle = new TextStyle();
        int i = 0;
        do
        {
            element = textstyle;
            if (i >= nodelist.getLength())
            {
                continue;
            }
            element = nodelist.item(i);
            if (element instanceof Element)
            {
                element = (Element)element;
                if (textstyle.addStyle(element))
                {
                    Log.d("nf_subtitles", "Style added");
                } else
                {
                    Log.d("nf_subtitles", "Style not added, check to see if it they are region attributes.");
                    processRegionAttributes(element);
                }
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void processRegionAttributes(Element element)
    {
        String s = element.getAttribute("tts:textAlign");
        if (!StringUtils.isEmpty(s))
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Text alignment found ").append(s).toString());
            }
            mHorizontalAlignment = HorizontalAlignment.from(s);
        }
        s = element.getAttribute("tts:displayAlign");
        if (!StringUtils.isEmpty(s))
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Display alignment found ").append(s).toString());
            }
            mVerticalAlignment = VerticalAlignment.from(s);
        }
        s = element.getAttribute("tts:extent");
        if (!StringUtils.isEmpty(s))
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Extent found ").append(s).toString());
            }
            mExtent = DoubleLength.createInstance(s, mCellResolution);
        }
        element = element.getAttribute("tts:origin");
        if (!StringUtils.isEmpty(element))
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Origin found ").append(element).toString());
            }
            mOrigin = DoubleLength.createInstance(element, mCellResolution);
        }
    }

    public DoubleLength getExtent()
    {
        return mExtent;
    }

    public HorizontalAlignment getHorizontalAlignment()
    {
        return mHorizontalAlignment;
    }

    public String getId()
    {
        return mId;
    }

    public DoubleLength getOrigin()
    {
        return mOrigin;
    }

    public TextStyle getTextStyle()
    {
        return mTextStyle;
    }

    public VerticalAlignment getVerticalAlignment()
    {
        return mVerticalAlignment;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Region [mId=").append(mId).append(", mExtent=").append(mExtent).append(", mOrigin=").append(mOrigin).append(", mHorizontalAlignment=").append(mHorizontalAlignment).append(", mVerticalAlignment=").append(mVerticalAlignment).append(", mCellResolution=").append(mCellResolution).append(", mTextStyle=").append(mTextStyle).append("]").toString();
    }
}
