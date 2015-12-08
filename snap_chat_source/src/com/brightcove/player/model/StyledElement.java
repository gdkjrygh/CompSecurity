// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;


// Referenced classes of package com.brightcove.player.model:
//            Element, Length

public class StyledElement extends Element
{
    public static final class FontStyle extends Enum
    {

        public static final FontStyle ITALIC;
        public static final FontStyle NORMAL;
        public static final FontStyle UNDEFINED;
        private static final FontStyle a[];

        public static FontStyle valueOf(String s)
        {
            return (FontStyle)Enum.valueOf(com/brightcove/player/model/StyledElement$FontStyle, s);
        }

        public static FontStyle[] values()
        {
            return (FontStyle[])a.clone();
        }

        static 
        {
            UNDEFINED = new FontStyle("UNDEFINED", 0);
            NORMAL = new FontStyle("NORMAL", 1);
            ITALIC = new FontStyle("ITALIC", 2);
            a = (new FontStyle[] {
                UNDEFINED, NORMAL, ITALIC
            });
        }

        private FontStyle(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class FontWeight extends Enum
    {

        public static final FontWeight BOLD;
        public static final FontWeight NORMAL;
        public static final FontWeight UNDEFINED;
        private static final FontWeight a[];

        public static FontWeight valueOf(String s)
        {
            return (FontWeight)Enum.valueOf(com/brightcove/player/model/StyledElement$FontWeight, s);
        }

        public static FontWeight[] values()
        {
            return (FontWeight[])a.clone();
        }

        static 
        {
            UNDEFINED = new FontWeight("UNDEFINED", 0);
            NORMAL = new FontWeight("NORMAL", 1);
            BOLD = new FontWeight("BOLD", 2);
            a = (new FontWeight[] {
                UNDEFINED, NORMAL, BOLD
            });
        }

        private FontWeight(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class TextAlign extends Enum
    {

        public static final TextAlign CENTER;
        public static final TextAlign END;
        public static final TextAlign LEFT;
        public static final TextAlign RIGHT;
        public static final TextAlign START;
        public static final TextAlign UNDEFINED;
        private static final TextAlign a[];

        public static TextAlign valueOf(String s)
        {
            return (TextAlign)Enum.valueOf(com/brightcove/player/model/StyledElement$TextAlign, s);
        }

        public static TextAlign[] values()
        {
            return (TextAlign[])a.clone();
        }

        static 
        {
            UNDEFINED = new TextAlign("UNDEFINED", 0);
            START = new TextAlign("START", 1);
            LEFT = new TextAlign("LEFT", 2);
            CENTER = new TextAlign("CENTER", 3);
            RIGHT = new TextAlign("RIGHT", 4);
            END = new TextAlign("END", 5);
            a = (new TextAlign[] {
                UNDEFINED, START, LEFT, CENTER, RIGHT, END
            });
        }

        private TextAlign(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class TextDecoration extends Enum
    {

        public static final TextDecoration LINETHROUGH;
        public static final TextDecoration NOLINETHROUGH;
        public static final TextDecoration NONE;
        public static final TextDecoration NOOVERLINE;
        public static final TextDecoration NOUNDERLINE;
        public static final TextDecoration OVERLINE;
        public static final TextDecoration UNDERLINE;
        private static final TextDecoration a[];

        public static TextDecoration valueOf(String s)
        {
            return (TextDecoration)Enum.valueOf(com/brightcove/player/model/StyledElement$TextDecoration, s);
        }

        public static TextDecoration[] values()
        {
            return (TextDecoration[])a.clone();
        }

        static 
        {
            NONE = new TextDecoration("NONE", 0);
            UNDERLINE = new TextDecoration("UNDERLINE", 1);
            NOUNDERLINE = new TextDecoration("NOUNDERLINE", 2);
            LINETHROUGH = new TextDecoration("LINETHROUGH", 3);
            NOLINETHROUGH = new TextDecoration("NOLINETHROUGH", 4);
            OVERLINE = new TextDecoration("OVERLINE", 5);
            NOOVERLINE = new TextDecoration("NOOVERLINE", 6);
            a = (new TextDecoration[] {
                NONE, UNDERLINE, NOUNDERLINE, LINETHROUGH, NOLINETHROUGH, OVERLINE, NOOVERLINE
            });
        }

        private TextDecoration(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class Unit extends Enum
    {

        public static final Unit EMS;
        public static final Unit PERCENT;
        public static final Unit PT;
        public static final Unit PX;
        public static final Unit UNDEFINED;
        private static final Unit a[];

        public static Unit fromString(String s)
        {
            if (s == null)
            {
                return UNDEFINED;
            }
            if (s.equals("%"))
            {
                return PERCENT;
            } else
            {
                return valueOf(s);
            }
        }

        public static Unit valueOf(String s)
        {
            return (Unit)Enum.valueOf(com/brightcove/player/model/StyledElement$Unit, s);
        }

        public static Unit[] values()
        {
            return (Unit[])a.clone();
        }

        static 
        {
            UNDEFINED = new Unit("UNDEFINED", 0);
            EMS = new Unit("EMS", 1);
            PERCENT = new Unit("PERCENT", 2);
            PX = new Unit("PX", 3);
            PT = new Unit("PT", 4);
            a = (new Unit[] {
                UNDEFINED, EMS, PERCENT, PX, PT
            });
        }

        private Unit(String s, int k)
        {
            super(s, k);
        }
    }


    protected String b;
    protected String c;
    protected String d;
    protected Length e;
    protected FontStyle f;
    protected String g;
    private FontWeight h;
    private TextDecoration i;
    private TextAlign j;

    public StyledElement()
    {
    }

    public String getBackgroundColor()
    {
        return d;
    }

    public String getColor()
    {
        return c;
    }

    public String getFontFamily()
    {
        return g;
    }

    public Length getFontSize()
    {
        return e;
    }

    public FontStyle getFontStyle()
    {
        return f;
    }

    public FontWeight getFontWeight()
    {
        return h;
    }

    public String getStyleName()
    {
        return b;
    }

    public TextAlign getTextAlign()
    {
        return j;
    }

    public TextDecoration getTextDecoration()
    {
        return i;
    }

    public void setBackgroundColor(String s)
    {
        d = s;
    }

    public void setColor(String s)
    {
        c = s;
    }

    public void setFontFamily(String s)
    {
        g = s;
    }

    public void setFontSize(Length length)
    {
        e = length;
    }

    public void setFontStyle(FontStyle fontstyle)
    {
        f = fontstyle;
    }

    public void setFontWeight(FontWeight fontweight)
    {
        h = fontweight;
    }

    public void setStyleName(String s)
    {
        b = s;
    }

    public void setTextAlign(TextAlign textalign)
    {
        j = textalign;
    }

    public void setTextDecoration(TextDecoration textdecoration)
    {
        i = textdecoration;
    }
}
