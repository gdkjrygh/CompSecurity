// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final PROGRESSIVE_DOWNLOAD $VALUES[];
    public static final PROGRESSIVE_DOWNLOAD DASH;
    public static final PROGRESSIVE_DOWNLOAD HLS;
    public static final PROGRESSIVE_DOWNLOAD PROGRESSIVE_DOWNLOAD;
    public static final PROGRESSIVE_DOWNLOAD RTMP;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$StreamingFormat, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        DASH = new <init>("DASH", 0, "dash");
        HLS = new <init>("HLS", 1, "hls");
        RTMP = new <init>("RTMP", 2, "rtmp");
        PROGRESSIVE_DOWNLOAD = new <init>("PROGRESSIVE_DOWNLOAD", 3, "progressive");
        $VALUES = (new .VALUES[] {
            DASH, HLS, RTMP, PROGRESSIVE_DOWNLOAD
        });
    }

    private A(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
