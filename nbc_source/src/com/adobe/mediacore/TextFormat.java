// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


public interface TextFormat
{
    public static final class Color extends Enum
    {

        private static final Color $VALUES[];
        public static final Color BLACK;
        public static final Color BLUE;
        public static final Color BRIGHT_BLUE;
        public static final Color BRIGHT_CYAN;
        public static final Color BRIGHT_GREEN;
        public static final Color BRIGHT_MAGENTA;
        public static final Color BRIGHT_RED;
        public static final Color BRIGHT_WHITE;
        public static final Color BRIGHT_YELLOW;
        public static final Color CYAN;
        public static final Color DARK_BLUE;
        public static final Color DARK_CYAN;
        public static final Color DARK_GREEN;
        public static final Color DARK_MAGENTA;
        public static final Color DARK_RED;
        public static final Color DARK_YELLOW;
        public static final Color DEFAULT;
        public static final Color GRAY;
        public static final Color GREEN;
        public static final Color MAGENTA;
        public static final Color RED;
        public static final Color WHITE;
        public static final Color YELLOW;
        private final String _value;

        public static Color valueOf(String s)
        {
            return (Color)Enum.valueOf(com/adobe/mediacore/TextFormat$Color, s);
        }

        public static Color[] values()
        {
            return (Color[])$VALUES.clone();
        }

        public String getValue()
        {
            return _value;
        }

        static 
        {
            DEFAULT = new Color("DEFAULT", 0, "default");
            BLACK = new Color("BLACK", 1, "black");
            GRAY = new Color("GRAY", 2, "gray");
            WHITE = new Color("WHITE", 3, "white");
            BRIGHT_WHITE = new Color("BRIGHT_WHITE", 4, "bright_white");
            DARK_RED = new Color("DARK_RED", 5, "dark_red");
            RED = new Color("RED", 6, "red");
            BRIGHT_RED = new Color("BRIGHT_RED", 7, "bright_red");
            DARK_GREEN = new Color("DARK_GREEN", 8, "dark_green");
            GREEN = new Color("GREEN", 9, "green");
            BRIGHT_GREEN = new Color("BRIGHT_GREEN", 10, "bright_green");
            DARK_BLUE = new Color("DARK_BLUE", 11, "dark_blue");
            BLUE = new Color("BLUE", 12, "blue");
            BRIGHT_BLUE = new Color("BRIGHT_BLUE", 13, "bright_blue");
            DARK_YELLOW = new Color("DARK_YELLOW", 14, "dark_yellow");
            YELLOW = new Color("YELLOW", 15, "yellow");
            BRIGHT_YELLOW = new Color("BRIGHT_YELLOW", 16, "bright_yellow");
            DARK_MAGENTA = new Color("DARK_MAGENTA", 17, "dark_magenta");
            MAGENTA = new Color("MAGENTA", 18, "magenta");
            BRIGHT_MAGENTA = new Color("BRIGHT_MAGENTA", 19, "bright_magenta");
            DARK_CYAN = new Color("DARK_CYAN", 20, "dark_cyan");
            CYAN = new Color("CYAN", 21, "cyan");
            BRIGHT_CYAN = new Color("BRIGHT_CYAN", 22, "bright_cyan");
            $VALUES = (new Color[] {
                DEFAULT, BLACK, GRAY, WHITE, BRIGHT_WHITE, DARK_RED, RED, BRIGHT_RED, DARK_GREEN, GREEN, 
                BRIGHT_GREEN, DARK_BLUE, BLUE, BRIGHT_BLUE, DARK_YELLOW, YELLOW, BRIGHT_YELLOW, DARK_MAGENTA, MAGENTA, BRIGHT_MAGENTA, 
                DARK_CYAN, CYAN, BRIGHT_CYAN
            });
        }

        private Color(String s, int i, String s1)
        {
            super(s, i);
            _value = s1;
        }
    }

    public static final class Font extends Enum
    {

        private static final Font $VALUES[];
        public static final Font CASUAL;
        public static final Font CURSIVE;
        public static final Font DEFAULT;
        public static final Font MONOSPACED_WITHOUT_SERIFS;
        public static final Font MONOSPACED_WITH_SERIFS;
        public static final Font PROPORTIONAL_WITHOUT_SERIFS;
        public static final Font PROPORTIONAL_WITH_SERIFS;
        public static final Font SMALL_CAPITALS;
        private final String _value;

        public static Font valueOf(String s)
        {
            return (Font)Enum.valueOf(com/adobe/mediacore/TextFormat$Font, s);
        }

        public static Font[] values()
        {
            return (Font[])$VALUES.clone();
        }

        public String getValue()
        {
            return _value;
        }

        static 
        {
            DEFAULT = new Font("DEFAULT", 0, "default");
            MONOSPACED_WITH_SERIFS = new Font("MONOSPACED_WITH_SERIFS", 1, "monospaced_with_serifs");
            PROPORTIONAL_WITH_SERIFS = new Font("PROPORTIONAL_WITH_SERIFS", 2, "proportional_with_serifs");
            MONOSPACED_WITHOUT_SERIFS = new Font("MONOSPACED_WITHOUT_SERIFS", 3, "monospaced_without_serifs");
            PROPORTIONAL_WITHOUT_SERIFS = new Font("PROPORTIONAL_WITHOUT_SERIFS", 4, "proportional_without_serifs");
            CASUAL = new Font("CASUAL", 5, "casual");
            CURSIVE = new Font("CURSIVE", 6, "cursive");
            SMALL_CAPITALS = new Font("SMALL_CAPITALS", 7, "small_capitals");
            $VALUES = (new Font[] {
                DEFAULT, MONOSPACED_WITH_SERIFS, PROPORTIONAL_WITH_SERIFS, MONOSPACED_WITHOUT_SERIFS, PROPORTIONAL_WITHOUT_SERIFS, CASUAL, CURSIVE, SMALL_CAPITALS
            });
        }

        private Font(String s, int i, String s1)
        {
            super(s, i);
            _value = s1;
        }
    }

    public static final class FontEdge extends Enum
    {

        private static final FontEdge $VALUES[];
        public static final FontEdge DEFAULT;
        public static final FontEdge DEPRESSED;
        public static final FontEdge DROP_SHADOW_LEFT;
        public static final FontEdge DROP_SHADOW_RIGHT;
        public static final FontEdge NONE;
        public static final FontEdge RAISED;
        public static final FontEdge UNIFORM;
        private final String _value;

        public static FontEdge valueOf(String s)
        {
            return (FontEdge)Enum.valueOf(com/adobe/mediacore/TextFormat$FontEdge, s);
        }

        public static FontEdge[] values()
        {
            return (FontEdge[])$VALUES.clone();
        }

        public String getValue()
        {
            return _value;
        }

        static 
        {
            DEFAULT = new FontEdge("DEFAULT", 0, "default");
            NONE = new FontEdge("NONE", 1, "none");
            RAISED = new FontEdge("RAISED", 2, "raised");
            DEPRESSED = new FontEdge("DEPRESSED", 3, "depressed");
            UNIFORM = new FontEdge("UNIFORM", 4, "uniform");
            DROP_SHADOW_LEFT = new FontEdge("DROP_SHADOW_LEFT", 5, "drop_shadow_left");
            DROP_SHADOW_RIGHT = new FontEdge("DROP_SHADOW_RIGHT", 6, "drop_shadow_right");
            $VALUES = (new FontEdge[] {
                DEFAULT, NONE, RAISED, DEPRESSED, UNIFORM, DROP_SHADOW_LEFT, DROP_SHADOW_RIGHT
            });
        }

        private FontEdge(String s, int i, String s1)
        {
            super(s, i);
            _value = s1;
        }
    }

    public static final class Size extends Enum
    {

        private static final Size $VALUES[];
        public static final Size DEFAULT;
        public static final Size LARGE;
        public static final Size MEDIUM;
        public static final Size SMALL;
        private final String _value;

        public static Size valueOf(String s)
        {
            return (Size)Enum.valueOf(com/adobe/mediacore/TextFormat$Size, s);
        }

        public static Size[] values()
        {
            return (Size[])$VALUES.clone();
        }

        public String getValue()
        {
            return _value;
        }

        static 
        {
            DEFAULT = new Size("DEFAULT", 0, "default");
            SMALL = new Size("SMALL", 1, "small");
            MEDIUM = new Size("MEDIUM", 2, "medium");
            LARGE = new Size("LARGE", 3, "large");
            $VALUES = (new Size[] {
                DEFAULT, SMALL, MEDIUM, LARGE
            });
        }

        private Size(String s, int i, String s1)
        {
            super(s, i);
            _value = s1;
        }
    }


    public static final int DEFAULT_OPACITY = -1;

    public abstract Color getBackgroundColor();

    public abstract int getBackgroundOpacity();

    public abstract String getBottomInset();

    public abstract Color getEdgeColor();

    public abstract Color getFillColor();

    public abstract int getFillOpacity();

    public abstract Font getFont();

    public abstract Color getFontColor();

    public abstract FontEdge getFontEdge();

    public abstract int getFontOpacity();

    public abstract Size getSize();
}
