// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMePlayMode extends Enum
{

    public static final YuMePlayMode HLS_STREAMING;
    public static final YuMePlayMode LOCAL_FILE;
    public static final YuMePlayMode MMS_STREAMING;
    public static final YuMePlayMode PROGRESSIVE;
    public static final YuMePlayMode RTMP_STREAMING;
    public static final YuMePlayMode RTP_STREAMING;
    public static final YuMePlayMode RTSP_STREAMING;
    private static final YuMePlayMode a[];

    private YuMePlayMode(String s, int i)
    {
        super(s, i);
    }

    public static YuMePlayMode valueOf(String s)
    {
        return (YuMePlayMode)Enum.valueOf(com/yume/android/sdk/YuMePlayMode, s);
    }

    public static YuMePlayMode[] values()
    {
        YuMePlayMode ayumeplaymode[] = a;
        int i = ayumeplaymode.length;
        YuMePlayMode ayumeplaymode1[] = new YuMePlayMode[i];
        System.arraycopy(ayumeplaymode, 0, ayumeplaymode1, 0, i);
        return ayumeplaymode1;
    }

    static 
    {
        PROGRESSIVE = new YuMePlayMode("PROGRESSIVE", 0);
        LOCAL_FILE = new YuMePlayMode("LOCAL_FILE", 1);
        MMS_STREAMING = new YuMePlayMode("MMS_STREAMING", 2);
        HLS_STREAMING = new YuMePlayMode("HLS_STREAMING", 3);
        RTP_STREAMING = new YuMePlayMode("RTP_STREAMING", 4);
        RTSP_STREAMING = new YuMePlayMode("RTSP_STREAMING", 5);
        RTMP_STREAMING = new YuMePlayMode("RTMP_STREAMING", 6);
        a = (new YuMePlayMode[] {
            PROGRESSIVE, LOCAL_FILE, MMS_STREAMING, HLS_STREAMING, RTP_STREAMING, RTSP_STREAMING, RTMP_STREAMING
        });
    }
}
