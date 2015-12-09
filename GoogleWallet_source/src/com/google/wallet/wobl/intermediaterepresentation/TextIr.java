// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.intermediaterepresentation;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.wallet.wobl.common.DisplayUnit;
import com.google.wallet.wobl.common.WoblStringUtil;
import com.google.wallet.wobl.exception.WoblMalformedDocException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.intermediaterepresentation:
//            IntermediateRepresentation

public class TextIr extends IntermediateRepresentation
{
    public static final class FontFamily extends Enum
    {

        private static final FontFamily $VALUES[];
        public static final FontFamily MONOSPACE;
        public static final FontFamily NORMAL;
        public static final FontFamily SANS_SERIF;
        public static final FontFamily SERIF;

        public static FontFamily of(String s)
            throws WoblMalformedDocException
        {
            if (s.equalsIgnoreCase("monospace"))
            {
                return MONOSPACE;
            }
            if (s.equalsIgnoreCase("sans-serif"))
            {
                return SANS_SERIF;
            }
            if (s.equalsIgnoreCase("serif"))
            {
                return SERIF;
            }
            if (s.equalsIgnoreCase("normal"))
            {
                return NORMAL;
            }
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Received unknown font-family value: ".concat(s);
            } else
            {
                s = new String("Received unknown font-family value: ");
            }
            throw new WoblMalformedDocException(s);
        }

        public static FontFamily valueOf(String s)
        {
            return (FontFamily)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$FontFamily, s);
        }

        public static FontFamily[] values()
        {
            return (FontFamily[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new FontFamily("NORMAL", 0);
            SANS_SERIF = new FontFamily("SANS_SERIF", 1);
            SERIF = new FontFamily("SERIF", 2);
            MONOSPACE = new FontFamily("MONOSPACE", 3);
            $VALUES = (new FontFamily[] {
                NORMAL, SANS_SERIF, SERIF, MONOSPACE
            });
        }

        private FontFamily(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class FontStyle extends Enum
    {

        private static final FontStyle $VALUES[];
        public static final FontStyle ITALIC;
        public static final FontStyle NORMAL;

        public static FontStyle of(String s)
            throws WoblMalformedDocException
        {
            if (s.equalsIgnoreCase("italic"))
            {
                return ITALIC;
            }
            if (s.equalsIgnoreCase("normal"))
            {
                return NORMAL;
            }
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Received unknown font-style value: ".concat(s);
            } else
            {
                s = new String("Received unknown font-style value: ");
            }
            throw new WoblMalformedDocException(s);
        }

        public static FontStyle valueOf(String s)
        {
            return (FontStyle)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$FontStyle, s);
        }

        public static FontStyle[] values()
        {
            return (FontStyle[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new FontStyle("NORMAL", 0);
            ITALIC = new FontStyle("ITALIC", 1);
            $VALUES = (new FontStyle[] {
                NORMAL, ITALIC
            });
        }

        private FontStyle(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class FontWeight extends Enum
    {

        private static final FontWeight $VALUES[];
        public static final FontWeight BOLD;
        public static final FontWeight LIGHT;
        public static final FontWeight NORMAL;

        public static FontWeight of(String s)
            throws WoblMalformedDocException
        {
            if (s.equalsIgnoreCase("bold"))
            {
                return BOLD;
            }
            if (s.equalsIgnoreCase("normal"))
            {
                return NORMAL;
            }
            if (s.equalsIgnoreCase("light"))
            {
                return LIGHT;
            }
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Received unknown font-weight value: ".concat(s);
            } else
            {
                s = new String("Received unknown font-weight value: ");
            }
            throw new WoblMalformedDocException(s);
        }

        public static FontWeight valueOf(String s)
        {
            return (FontWeight)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$FontWeight, s);
        }

        public static FontWeight[] values()
        {
            return (FontWeight[])$VALUES.clone();
        }

        static 
        {
            LIGHT = new FontWeight("LIGHT", 0);
            NORMAL = new FontWeight("NORMAL", 1);
            BOLD = new FontWeight("BOLD", 2);
            $VALUES = (new FontWeight[] {
                LIGHT, NORMAL, BOLD
            });
        }

        private FontWeight(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LineHeight
    {

        private Optional length;
        private Optional multiplier;

        public static LineHeight of(double d)
        {
            LineHeight lineheight = new LineHeight();
            lineheight.multiplier = Optional.of(Double.valueOf(d));
            return lineheight;
        }

        public static LineHeight of(DisplayUnit displayunit)
        {
            LineHeight lineheight = new LineHeight();
            lineheight.length = Optional.of(displayunit);
            return lineheight;
        }

        public static LineHeight of(String s)
            throws WoblMalformedDocException
        {
            double d;
            try
            {
                d = Double.parseDouble(s);
            }
            catch (NumberFormatException numberformatexception)
            {
                return of(DisplayUnit.of(s));
            }
            if (d >= 0.0D)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            throw new WoblMalformedDocException("line-height must be a non-negative number or a display unit value");
            LineHeight lineheight = of(d);
            return lineheight;
        }

        public final Optional getLength()
        {
            return length;
        }

        public final Optional getMultiplier()
        {
            return multiplier;
        }

        public LineHeight()
        {
            multiplier = Optional.absent();
            length = Optional.absent();
        }
    }

    public static final class TextOverflow extends Enum
    {

        private static final TextOverflow $VALUES[];
        public static final TextOverflow CLIP;
        public static final TextOverflow ELLIPSIS;

        public static TextOverflow of(String s)
            throws WoblMalformedDocException
        {
            if (s.equalsIgnoreCase("ellipsis"))
            {
                return ELLIPSIS;
            }
            if (s.equalsIgnoreCase("clip"))
            {
                return CLIP;
            }
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Unknown text-overflow value: ".concat(s);
            } else
            {
                s = new String("Unknown text-overflow value: ");
            }
            throw new WoblMalformedDocException(s);
        }

        public static TextOverflow valueOf(String s)
        {
            return (TextOverflow)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$TextOverflow, s);
        }

        public static TextOverflow[] values()
        {
            return (TextOverflow[])$VALUES.clone();
        }

        static 
        {
            CLIP = new TextOverflow("CLIP", 0);
            ELLIPSIS = new TextOverflow("ELLIPSIS", 1);
            $VALUES = (new TextOverflow[] {
                CLIP, ELLIPSIS
            });
        }

        private TextOverflow(String s, int i)
        {
            super(s, i);
        }
    }

    public static abstract class TextTransform extends Enum
    {

        private static final TextTransform $VALUES[];
        public static final TextTransform CAPITALIZE;
        public static final TextTransform LOWERCASE;
        public static final TextTransform NONE;
        public static final TextTransform UPPERCASE;

        public static TextTransform of(String s)
            throws WoblMalformedDocException
        {
            if (s.equalsIgnoreCase("capitalize"))
            {
                return CAPITALIZE;
            }
            if (s.equalsIgnoreCase("uppercase"))
            {
                return UPPERCASE;
            }
            if (s.equalsIgnoreCase("lowercase"))
            {
                return LOWERCASE;
            }
            if (s.equalsIgnoreCase("none"))
            {
                return NONE;
            }
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Unknown text-transform value: ".concat(s);
            } else
            {
                s = new String("Unknown text-transform value: ");
            }
            throw new WoblMalformedDocException(s);
        }

        public static TextTransform valueOf(String s)
        {
            return (TextTransform)Enum.valueOf(com/google/wallet/wobl/intermediaterepresentation/TextIr$TextTransform, s);
        }

        public static TextTransform[] values()
        {
            return (TextTransform[])$VALUES.clone();
        }

        public abstract String apply(String s);

        static 
        {
            NONE = new TextTransform("NONE", 0) {

                public final String apply(String s)
                {
                    return s;
                }

            };
            CAPITALIZE = new TextTransform("CAPITALIZE", 1) {

                public final String apply(String s)
                {
                    return WoblStringUtil.toTitleCase(s);
                }

            };
            UPPERCASE = new TextTransform("UPPERCASE", 2) {

                public final String apply(String s)
                {
                    return s.toUpperCase();
                }

            };
            LOWERCASE = new TextTransform("LOWERCASE", 3) {

                public final String apply(String s)
                {
                    return s.toLowerCase();
                }

            };
            $VALUES = (new TextTransform[] {
                NONE, CAPITALIZE, UPPERCASE, LOWERCASE
            });
        }

        private TextTransform(String s, int i)
        {
            super(s, i);
        }

    }


    private final List childComponents = new ArrayList();
    private Optional fontFamily;
    private Optional fontSize;
    private Optional fontStyle;
    private Optional fontWeight;
    private Optional lineHeight;
    private Optional maxLines;
    private String text;
    private Optional textColor;
    private Optional textColorAlpha;
    private Optional textOverflow;
    private Optional textTransform;

    public TextIr()
    {
        textColor = Optional.absent();
        textColorAlpha = Optional.absent();
        lineHeight = Optional.absent();
        maxLines = Optional.absent();
        textOverflow = Optional.absent();
        fontFamily = Optional.absent();
        fontStyle = Optional.absent();
        fontWeight = Optional.absent();
        fontSize = Optional.absent();
        textTransform = Optional.absent();
    }

    public void addChildComponent(TextIr textir)
    {
        childComponents.add(textir);
    }

    public List getChildComponents()
    {
        return childComponents;
    }

    public Optional getFontFamily()
    {
        return fontFamily;
    }

    public Optional getFontSize()
    {
        return fontSize;
    }

    public Optional getFontStyle()
    {
        return fontStyle;
    }

    public Optional getFontWeight()
    {
        return fontWeight;
    }

    public Optional getLineHeight()
    {
        return lineHeight;
    }

    public Optional getMaxLines()
    {
        return maxLines;
    }

    public String getText()
    {
        return Strings.nullToEmpty(text);
    }

    public Optional getTextColor()
    {
        return textColor;
    }

    public Optional getTextColorAlpha()
    {
        return textColorAlpha;
    }

    public Optional getTextOverflow()
    {
        return textOverflow;
    }

    public Optional getTextTransform()
    {
        return textTransform;
    }

    public boolean hasChildComponents()
    {
        return !childComponents.isEmpty();
    }

    public void setFontFamily(FontFamily fontfamily)
    {
        fontFamily = Optional.of(fontfamily);
    }

    public void setFontSize(DisplayUnit displayunit)
    {
        fontSize = Optional.of(displayunit);
    }

    public void setFontStyle(FontStyle fontstyle)
    {
        fontStyle = Optional.of(fontstyle);
    }

    public void setFontWeight(FontWeight fontweight)
    {
        fontWeight = Optional.of(fontweight);
    }

    public void setLineHeight(LineHeight lineheight)
    {
        lineHeight = Optional.of(lineheight);
    }

    public void setMaxLines(int i)
    {
        maxLines = Optional.of(Integer.valueOf(i));
    }

    public void setText(String s)
    {
        text = Strings.nullToEmpty(s);
    }

    public void setTextColor(String s)
    {
        textColor = Optional.of(s);
    }

    public void setTextColorAlpha(Optional optional)
    {
        textColorAlpha = optional;
    }

    public void setTextOverflow(TextOverflow textoverflow)
    {
        textOverflow = Optional.of(textoverflow);
    }

    public void setTextTransform(TextTransform texttransform)
    {
        textTransform = Optional.of(texttransform);
    }
}
