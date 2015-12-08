// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            TextFormat

public static final class _value extends Enum
{

    private static final BRIGHT_CYAN $VALUES[];
    public static final BRIGHT_CYAN BLACK;
    public static final BRIGHT_CYAN BLUE;
    public static final BRIGHT_CYAN BRIGHT_BLUE;
    public static final BRIGHT_CYAN BRIGHT_CYAN;
    public static final BRIGHT_CYAN BRIGHT_GREEN;
    public static final BRIGHT_CYAN BRIGHT_MAGENTA;
    public static final BRIGHT_CYAN BRIGHT_RED;
    public static final BRIGHT_CYAN BRIGHT_WHITE;
    public static final BRIGHT_CYAN BRIGHT_YELLOW;
    public static final BRIGHT_CYAN CYAN;
    public static final BRIGHT_CYAN DARK_BLUE;
    public static final BRIGHT_CYAN DARK_CYAN;
    public static final BRIGHT_CYAN DARK_GREEN;
    public static final BRIGHT_CYAN DARK_MAGENTA;
    public static final BRIGHT_CYAN DARK_RED;
    public static final BRIGHT_CYAN DARK_YELLOW;
    public static final BRIGHT_CYAN DEFAULT;
    public static final BRIGHT_CYAN GRAY;
    public static final BRIGHT_CYAN GREEN;
    public static final BRIGHT_CYAN MAGENTA;
    public static final BRIGHT_CYAN RED;
    public static final BRIGHT_CYAN WHITE;
    public static final BRIGHT_CYAN YELLOW;
    private final String _value;

    public static _value valueOf(String s)
    {
        return (_value)Enum.valueOf(com/adobe/mediacore/TextFormat$Color, s);
    }

    public static _value[] values()
    {
        return (_value[])$VALUES.clone();
    }

    public String getValue()
    {
        return _value;
    }

    static 
    {
        DEFAULT = new <init>("DEFAULT", 0, "default");
        BLACK = new <init>("BLACK", 1, "black");
        GRAY = new <init>("GRAY", 2, "gray");
        WHITE = new <init>("WHITE", 3, "white");
        BRIGHT_WHITE = new <init>("BRIGHT_WHITE", 4, "bright_white");
        DARK_RED = new <init>("DARK_RED", 5, "dark_red");
        RED = new <init>("RED", 6, "red");
        BRIGHT_RED = new <init>("BRIGHT_RED", 7, "bright_red");
        DARK_GREEN = new <init>("DARK_GREEN", 8, "dark_green");
        GREEN = new <init>("GREEN", 9, "green");
        BRIGHT_GREEN = new <init>("BRIGHT_GREEN", 10, "bright_green");
        DARK_BLUE = new <init>("DARK_BLUE", 11, "dark_blue");
        BLUE = new <init>("BLUE", 12, "blue");
        BRIGHT_BLUE = new <init>("BRIGHT_BLUE", 13, "bright_blue");
        DARK_YELLOW = new <init>("DARK_YELLOW", 14, "dark_yellow");
        YELLOW = new <init>("YELLOW", 15, "yellow");
        BRIGHT_YELLOW = new <init>("BRIGHT_YELLOW", 16, "bright_yellow");
        DARK_MAGENTA = new <init>("DARK_MAGENTA", 17, "dark_magenta");
        MAGENTA = new <init>("MAGENTA", 18, "magenta");
        BRIGHT_MAGENTA = new <init>("BRIGHT_MAGENTA", 19, "bright_magenta");
        DARK_CYAN = new <init>("DARK_CYAN", 20, "dark_cyan");
        CYAN = new <init>("CYAN", 21, "cyan");
        BRIGHT_CYAN = new <init>("BRIGHT_CYAN", 22, "bright_cyan");
        $VALUES = (new .VALUES[] {
            DEFAULT, BLACK, GRAY, WHITE, BRIGHT_WHITE, DARK_RED, RED, BRIGHT_RED, DARK_GREEN, GREEN, 
            BRIGHT_GREEN, DARK_BLUE, BLUE, BRIGHT_BLUE, DARK_YELLOW, YELLOW, BRIGHT_YELLOW, DARK_MAGENTA, MAGENTA, BRIGHT_MAGENTA, 
            DARK_CYAN, CYAN, BRIGHT_CYAN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        _value = s1;
    }
}
