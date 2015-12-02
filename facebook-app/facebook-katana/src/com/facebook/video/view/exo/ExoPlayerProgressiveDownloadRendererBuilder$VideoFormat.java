// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;


final class Y extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN MP4;
    public static final UNKNOWN UNKNOWN;
    public static final UNKNOWN WEBM;

    public static Y valueOf(String s)
    {
        return (Y)Enum.valueOf(com/facebook/video/view/exo/ExoPlayerProgressiveDownloadRendererBuilder$VideoFormat, s);
    }

    public static Y[] values()
    {
        return (Y[])$VALUES.clone();
    }

    static 
    {
        MP4 = new <init>("MP4", 0);
        WEBM = new <init>("WEBM", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            MP4, WEBM, UNKNOWN
        });
    }

    private Y(String s, int i)
    {
        super(s, i);
    }
}
