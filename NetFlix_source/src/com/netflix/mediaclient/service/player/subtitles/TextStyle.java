// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player.subtitles;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.webclient.model.leafs.SubtitlePreference;
import com.netflix.mediaclient.util.StringUtils;
import org.w3c.dom.Element;

// Referenced classes of package com.netflix.mediaclient.service.player.subtitles:
//            Outline, FontFamilyMapping, CharacterEdgeTypeMapping, ColorMapping, 
//            SizeMapping, OpacityMapping, SubtitleParser, HorizontalAlignment, 
//            VerticalAlignment, DoubleLength, CellResolution

public class TextStyle
{

    public static final String BACKGROUND_COLOR = "tts:backgroundColor";
    public static final String COLOR = "tts:color";
    public static final String DEFAULT = "<%NF_DEFAULT_TEXT_STYLE%>";
    public static final TextStyle DEFAULT_DEVICE_TEXT_STYLE;
    public static final String DISPLAY_ALIGN = "tts:displayAlign";
    public static final String EXTENT = "tts:extent";
    public static final String FONT_DECORATION = "tts:textDecoration";
    public static final String FONT_FAMILY = "tts:fontFamily";
    public static final String FONT_SIZE = "tts:fontSize";
    public static final String FONT_STYLE = "tts:fontStyle";
    public static final String FONT_WEIGHT = "tts:fontWeight";
    public static final String ID = "xml:id";
    private static final int MAX_FONT_SIZE = 200;
    private static final int MIN_FONT_SIZE = 25;
    public static final String OPACITY = "tts:opacity";
    public static final String ORIGIN = "tts:origin";
    public static final String PARENT_STYLE_ID = "style";
    private static final String TAG = "nf_subtitles";
    public static final String TEXT_ALIGN = "tts:textAlign";
    public static final String TEXT_OUTLINE = "tts:textOutline";
    public static final String WINDOW_COLOR = "tts:windowColor";
    private String mBackgroundColor;
    private Float mBackgroundOpacity;
    private Boolean mBold;
    private CellResolution mCellResolution;
    private String mColor;
    private DoubleLength mExtent;
    private FontFamilyMapping mFontFamily;
    private Integer mFontSize;
    private HorizontalAlignment mHorizontalAlignment;
    private String mId;
    private Boolean mItalic;
    private Float mOpacity;
    private DoubleLength mOrigin;
    private Outline mOutline;
    private String mParentStyleId;
    private Boolean mUnderline;
    private VerticalAlignment mVerticalAlignment;
    private String mWindowColor;
    private Float mWindowOpacity;

    TextStyle()
    {
    }

    public TextStyle(TextStyle textstyle)
    {
        if (textstyle == null)
        {
            throw new IllegalArgumentException("Copy constructor must have object to work with, Null passed!");
        } else
        {
            mId = textstyle.mId;
            mParentStyleId = textstyle.mParentStyleId;
            mColor = textstyle.mColor;
            mWindowColor = textstyle.mWindowColor;
            mBackgroundColor = textstyle.mBackgroundColor;
            mFontSize = textstyle.mFontSize;
            mOutline = textstyle.mOutline;
            mFontFamily = textstyle.mFontFamily;
            mItalic = textstyle.mItalic;
            mUnderline = textstyle.mUnderline;
            mOpacity = textstyle.mOpacity;
            mWindowOpacity = textstyle.mWindowOpacity;
            mBackgroundOpacity = textstyle.mBackgroundOpacity;
            mBold = textstyle.mBold;
            return;
        }
    }

    public TextStyle(String s, String s1, String s2, String s3, Integer integer, Outline outline, FontFamilyMapping fontfamilymapping, 
            Boolean boolean1, Boolean boolean2, Boolean boolean3, Float float1, Float float2, Float float3)
    {
        mId = s;
        mColor = s1;
        mWindowColor = s2;
        mBackgroundColor = s3;
        mFontSize = integer;
        mOutline = outline;
        mFontFamily = fontfamilymapping;
        mItalic = boolean1;
        mBold = boolean3;
        mUnderline = boolean2;
        mOpacity = float1;
        mWindowOpacity = float2;
        mBackgroundOpacity = float3;
    }

    public static TextStyle buildSubtitleDefaults(SubtitlePreference subtitlepreference)
    {
        return buildSubtitleSettings(subtitlepreference);
    }

    public static TextStyle buildSubtitleSettings(SubtitlePreference subtitlepreference)
    {
        Object obj;
        obj = null;
        break MISSING_BLOCK_LABEL_2;
        if (subtitlepreference != null && (subtitlepreference.getCharEdgeAttrs() != null || subtitlepreference.getCharEdgeColor() != null || subtitlepreference.getCharColor() != null || subtitlepreference.getWindowColor() != null || subtitlepreference.getBackgroundColor() != null || subtitlepreference.getCharStyle() != null || subtitlepreference.getCharSize() != null || subtitlepreference.getCharOpacity() != null || subtitlepreference.getWindowOpacity() != null || subtitlepreference.getBackgroundOpacity() != null))
        {
            TextStyle textstyle = new TextStyle();
            if (subtitlepreference.getCharEdgeAttrs() != null || subtitlepreference.getCharEdgeColor() != null)
            {
                obj = Outline.getDefaultOutline();
                if (subtitlepreference.getCharEdgeAttrs() != null)
                {
                    ((Outline) (obj)).setEdgeType(CharacterEdgeTypeMapping.valueOf(subtitlepreference.getCharEdgeAttrs()));
                }
                if (subtitlepreference.getCharEdgeColor() != null)
                {
                    ColorMapping colormapping = ColorMapping.lookup(subtitlepreference.getCharEdgeColor());
                    if (colormapping != null)
                    {
                        ((Outline) (obj)).setEdgeColor(colormapping.getColorStringValue());
                    }
                }
                textstyle.mOutline = ((Outline) (obj));
            }
            if (subtitlepreference.getCharColor() != null)
            {
                obj = ColorMapping.lookup(subtitlepreference.getCharColor());
                if (obj != null)
                {
                    textstyle.mColor = ((ColorMapping) (obj)).getColorStringValue();
                }
            }
            if (subtitlepreference.getWindowColor() != null)
            {
                obj = ColorMapping.lookup(subtitlepreference.getWindowColor());
                if (obj != null)
                {
                    textstyle.mWindowColor = ((ColorMapping) (obj)).getColorStringValue();
                }
            }
            if (subtitlepreference.getBackgroundColor() != null)
            {
                obj = ColorMapping.lookup(subtitlepreference.getBackgroundColor());
                if (obj != null)
                {
                    textstyle.mBackgroundColor = ((ColorMapping) (obj)).getColorStringValue();
                }
            }
            if (subtitlepreference.getCharStyle() != null)
            {
                textstyle.mFontFamily = FontFamilyMapping.lookup(subtitlepreference.getCharStyle());
            }
            if (subtitlepreference.getCharSize() != null)
            {
                textstyle.mFontSize = Integer.valueOf(SizeMapping.lookup(subtitlepreference.getCharSize()));
            }
            if (subtitlepreference.getCharOpacity() != null)
            {
                textstyle.mOpacity = OpacityMapping.lookup(subtitlepreference.getCharOpacity());
            }
            if (subtitlepreference.getWindowOpacity() != null)
            {
                textstyle.mWindowOpacity = OpacityMapping.lookup(subtitlepreference.getWindowOpacity());
            }
            obj = textstyle;
            if (subtitlepreference.getBackgroundOpacity() != null)
            {
                textstyle.mBackgroundOpacity = OpacityMapping.lookup(subtitlepreference.getBackgroundOpacity());
                return textstyle;
            }
        }
        return ((TextStyle) (obj));
    }

    public static TextStyle createInstanceFromContainer(Element element, SubtitleParser subtitleparser, TextStyle textstyle)
    {
        if (element == null)
        {
            throw new IllegalArgumentException("Element can not be null!");
        }
        if (subtitleparser == null)
        {
            throw new IllegalArgumentException("Parser can not be null!");
        }
        TextStyle textstyle1 = new TextStyle();
        textstyle1.populate(element);
        textstyle1.mCellResolution = subtitleparser.getCellResolution();
        if (textstyle1.mParentStyleId != null)
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Parent style found. ID: ").append(textstyle1.mParentStyleId).toString());
            }
            element = subtitleparser.getNamedStyle(textstyle1.mParentStyleId);
            if (element != null)
            {
                if (Log.isLoggable("nf_subtitles", 3))
                {
                    Log.d("nf_subtitles", (new StringBuilder()).append("Parent style found, merge: ").append(textstyle1.mParentStyleId).toString());
                }
                textstyle1.merge(element);
            } else
            {
                Log.w("nf_subtitles", "Parent style NOT found!");
            }
        }
        if (textstyle != null)
        {
            Log.v("nf_subtitles", "Apply default style");
            textstyle1.merge(textstyle);
        }
        if (Log.isLoggable("nf_subtitles", 2))
        {
            Log.v("nf_subtitles", (new StringBuilder()).append("Style created: ").append(textstyle1).toString());
        }
        return textstyle1;
    }

    static Boolean isStyleBold(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return Boolean.valueOf("bold".equalsIgnoreCase(s));
        }
    }

    static Boolean isStyleItalic(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return Boolean.valueOf("italic".equalsIgnoreCase(s));
        }
    }

    static Boolean isStyleUnderline(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return Boolean.valueOf("underline".equalsIgnoreCase(s));
        }
    }

    private boolean populate(Element element)
    {
        boolean flag = false;
        String s = element.getAttribute("xml:id");
        if (!StringUtils.isEmpty(s))
        {
            mId = s;
            flag = true;
        }
        s = element.getAttribute("style");
        if (!StringUtils.isEmpty(s))
        {
            mParentStyleId = s;
            flag = true;
        }
        mColor = ColorMapping.findColor(element.getAttribute("tts:color"));
        if (mColor != null)
        {
            flag = true;
        }
        mBackgroundColor = ColorMapping.findColor(element.getAttribute("tts:backgroundColor"));
        if (mBackgroundColor != null)
        {
            flag = true;
        }
        mWindowColor = ColorMapping.findColor(element.getAttribute("tts:windowColor"));
        if (mWindowColor != null)
        {
            flag = true;
        }
        mFontSize = StringUtils.safeParsePercentage(element.getAttribute("tts:fontSize"), 25, 200, true);
        if (mFontSize != null)
        {
            flag = true;
        }
        mOutline = Outline.createInstance(element.getAttribute("tts:textOutline"));
        if (mOutline != null)
        {
            flag = true;
        }
        mFontFamily = FontFamilyMapping.lookup(element.getAttribute("tts:fontFamily"));
        if (mFontFamily != null)
        {
            flag = true;
        }
        mItalic = isStyleItalic(element.getAttribute("tts:fontStyle"));
        if (mItalic != null)
        {
            flag = true;
        }
        mBold = isStyleItalic(element.getAttribute("tts:fontWeight"));
        if (mBold != null)
        {
            flag = true;
        }
        mOpacity = OpacityMapping.lookup(element.getAttribute("tts:opacity"));
        if (mOpacity != null)
        {
            flag = true;
        }
        mWindowOpacity = mOpacity;
        mBackgroundOpacity = mOpacity;
        s = element.getAttribute("tts:textAlign");
        if (!StringUtils.isEmpty(s))
        {
            mHorizontalAlignment = HorizontalAlignment.from(s);
        }
        s = element.getAttribute("tts:displayAlign");
        if (!StringUtils.isEmpty(s))
        {
            mVerticalAlignment = VerticalAlignment.from(s);
        }
        s = element.getAttribute("tts:extent");
        if (!StringUtils.isEmpty(s))
        {
            mExtent = DoubleLength.createInstance(s, mCellResolution);
        }
        element = element.getAttribute("tts:origin");
        if (!StringUtils.isEmpty(element))
        {
            mOrigin = DoubleLength.createInstance(element, mCellResolution);
        }
        return flag;
    }

    boolean addStyle(Element element)
    {
        return populate(element);
    }

    public String getBackgroundColor()
    {
        return mBackgroundColor;
    }

    public Float getBackgroundOpacity()
    {
        return mBackgroundOpacity;
    }

    public Boolean getBold()
    {
        return mBold;
    }

    public String getColor()
    {
        return mColor;
    }

    public DoubleLength getExtent()
    {
        return mExtent;
    }

    public FontFamilyMapping getFontFamily()
    {
        return mFontFamily;
    }

    public Integer getFontSize()
    {
        return mFontSize;
    }

    public HorizontalAlignment getHorizontalAlignment()
    {
        return mHorizontalAlignment;
    }

    public String getId()
    {
        return mId;
    }

    public Boolean getItalic()
    {
        return mItalic;
    }

    public Float getOpacity()
    {
        return mOpacity;
    }

    public DoubleLength getOrigin()
    {
        return mOrigin;
    }

    public Outline getOutline()
    {
        return mOutline;
    }

    public String getParentStyleId()
    {
        return mParentStyleId;
    }

    public Boolean getUnderline()
    {
        return mUnderline;
    }

    public VerticalAlignment getVerticalAlignment()
    {
        return mVerticalAlignment;
    }

    public String getWindowColor()
    {
        return mWindowColor;
    }

    public Float getWindowOpacity()
    {
        return mWindowOpacity;
    }

    void merge(TextStyle textstyle)
    {
        if (mColor == null && textstyle.mColor != null)
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Use parent color ").append(textstyle.mColor).toString());
            }
            mColor = textstyle.mColor;
        }
        if (mWindowColor == null && textstyle.mWindowColor != null)
        {
            mWindowColor = textstyle.mWindowColor;
        }
        if (mBackgroundColor == null && textstyle.mBackgroundColor != null)
        {
            mBackgroundColor = textstyle.mBackgroundColor;
        }
        if (mFontSize == null && textstyle.mFontSize != null)
        {
            if (Log.isLoggable("nf_subtitles", 3))
            {
                Log.d("nf_subtitles", (new StringBuilder()).append("Use parent mFontSize ").append(textstyle.mFontSize).toString());
            }
            mFontSize = textstyle.mFontSize;
        }
        if (mOutline == null && textstyle.mOutline != null)
        {
            mOutline = textstyle.mOutline;
        }
        if (mFontFamily == null && textstyle.mFontFamily != null)
        {
            mFontFamily = textstyle.mFontFamily;
        }
        if (mItalic == null && textstyle.mItalic != null)
        {
            mItalic = textstyle.mItalic;
        }
        if (mUnderline == null && textstyle.mUnderline != null)
        {
            mUnderline = textstyle.mUnderline;
        }
        if (mBold == null && textstyle.mBold != null)
        {
            mItalic = textstyle.mItalic;
        }
        if (mOpacity == null && textstyle.mOpacity != null)
        {
            mOpacity = textstyle.mOpacity;
        }
        if (mWindowOpacity == null && textstyle.mWindowOpacity != null)
        {
            mWindowOpacity = textstyle.mWindowOpacity;
        }
        if (mBackgroundOpacity == null && textstyle.mBackgroundOpacity != null)
        {
            mBackgroundOpacity = textstyle.mBackgroundOpacity;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("TextStyle [");
        if (mId != null)
        {
            stringbuilder.append(" id=").append(mId);
        }
        if (mParentStyleId != null)
        {
            stringbuilder.append(", ParentStyleId=").append(mParentStyleId);
        }
        if (mColor != null)
        {
            stringbuilder.append(", Color=").append(mColor);
        }
        if (mWindowColor != null)
        {
            stringbuilder.append(", WindowColor=").append(mWindowColor);
        }
        if (mBackgroundColor != null)
        {
            stringbuilder.append(", BackgroundColor=").append(mBackgroundColor);
        }
        if (mFontSize != null)
        {
            stringbuilder.append(", FontSize=").append(mFontSize);
        }
        if (mFontFamily != null)
        {
            stringbuilder.append(", FontFamily=").append(mFontFamily);
        }
        if (mOutline != null)
        {
            stringbuilder.append(", Outline=").append(mOutline);
        }
        if (mItalic != null)
        {
            stringbuilder.append(", Italic=").append(mItalic);
        }
        if (mUnderline != null)
        {
            stringbuilder.append(", Underline=").append(mUnderline);
        }
        if (mBold != null)
        {
            stringbuilder.append(", Bold=").append(mBold);
        }
        if (mOpacity != null)
        {
            stringbuilder.append(", Opacity=").append(mOpacity);
        }
        if (mWindowOpacity != null)
        {
            stringbuilder.append(", WindowOpacity=").append(mWindowOpacity);
        }
        if (mBackgroundOpacity != null)
        {
            stringbuilder.append(", BackgroundOpacity=").append(mBackgroundOpacity);
        }
        if (mOrigin != null)
        {
            stringbuilder.append(", Origin=").append(mOrigin);
        }
        if (mExtent != null)
        {
            stringbuilder.append(", Extent=").append(mExtent);
        }
        if (mHorizontalAlignment != null)
        {
            stringbuilder.append(", HorizontalAlignment=").append(mHorizontalAlignment);
        }
        if (mVerticalAlignment != null)
        {
            stringbuilder.append(", VerticalAlignment=").append(mVerticalAlignment);
        }
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        DEFAULT_DEVICE_TEXT_STYLE = new TextStyle("<%NF_DEFAULT_TEXT_STYLE%>", "EBEB64", null, null, null, Outline.getDefaultOutline(), FontFamilyMapping.defaultType, Boolean.valueOf(false), Boolean.valueOf(false), Boolean.valueOf(false), null, null, null);
    }
}
