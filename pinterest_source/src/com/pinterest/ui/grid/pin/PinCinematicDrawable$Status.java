// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;


public final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR DECODED;
    public static final ERROR DECODING;
    public static final ERROR DOWNLOADED;
    public static final ERROR DOWNLOADING;
    public static final ERROR ERROR;
    public static final ERROR RESET;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/ui/grid/pin/PinCinematicDrawable$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        RESET = new <init>("RESET", 0);
        DOWNLOADING = new <init>("DOWNLOADING", 1);
        DOWNLOADED = new <init>("DOWNLOADED", 2);
        DECODING = new <init>("DECODING", 3);
        DECODED = new <init>("DECODED", 4);
        ERROR = new <init>("ERROR", 5);
        $VALUES = (new .VALUES[] {
            RESET, DOWNLOADING, DOWNLOADED, DECODING, DECODED, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
