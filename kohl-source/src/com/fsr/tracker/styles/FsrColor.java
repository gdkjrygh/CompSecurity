// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.styles;


public final class FsrColor extends Enum
{

    private static final FsrColor $VALUES[];
    public static final FsrColor BLACK_TRANSPARENT;
    public static final FsrColor BORDER_GREY;
    public static final FsrColor DARK_GREY;
    public static final FsrColor DARK_GREY_TRANSPARENT;
    public static final FsrColor GREEN;
    public static final FsrColor GREEN_HIGHLIGHT;
    public static final FsrColor GREY;
    public static final FsrColor INVITE_BORDER;
    public static final FsrColor OPAQUE_BLACK;
    public static final FsrColor WHITE;
    private int val;

    private FsrColor(String s, int i, int j)
    {
        super(s, i);
        val = j;
    }

    public static FsrColor valueOf(String s)
    {
        return (FsrColor)Enum.valueOf(com/fsr/tracker/styles/FsrColor, s);
    }

    public static FsrColor[] values()
    {
        return (FsrColor[])$VALUES.clone();
    }

    public int getColor()
    {
        return val;
    }

    static 
    {
        OPAQUE_BLACK = new FsrColor("OPAQUE_BLACK", 0, 0x29000000);
        GREEN_HIGHLIGHT = new FsrColor("GREEN_HIGHLIGHT", 1, 0xff8ece22);
        GREEN = new FsrColor("GREEN", 2, 0xff71a413);
        GREY = new FsrColor("GREY", 3, 0xffdfdfdf);
        BORDER_GREY = new FsrColor("BORDER_GREY", 4, 0xff999999);
        INVITE_BORDER = new FsrColor("INVITE_BORDER", 5, 0x55dfdfdf);
        DARK_GREY = new FsrColor("DARK_GREY", 6, 0xff444444);
        DARK_GREY_TRANSPARENT = new FsrColor("DARK_GREY_TRANSPARENT", 7, 0x29444444);
        BLACK_TRANSPARENT = new FsrColor("BLACK_TRANSPARENT", 8, 0x55000000);
        WHITE = new FsrColor("WHITE", 9, -1);
        $VALUES = (new FsrColor[] {
            OPAQUE_BLACK, GREEN_HIGHLIGHT, GREEN, GREY, BORDER_GREY, INVITE_BORDER, DARK_GREY, DARK_GREY_TRANSPARENT, BLACK_TRANSPARENT, WHITE
        });
    }
}
