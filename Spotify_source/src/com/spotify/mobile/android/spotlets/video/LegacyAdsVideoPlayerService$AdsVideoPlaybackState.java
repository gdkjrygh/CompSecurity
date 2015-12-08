// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;


public final class a extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/spotify/mobile/android/spotlets/video/LegacyAdsVideoPlayerService$AdsVideoPlaybackState, s);
    }

    public static a[] values()
    {
        return (a[])f.clone();
    }

    static 
    {
        a = new <init>("STATE_IDLE", 0);
        b = new <init>("STATE_PREPARING", 1);
        c = new <init>("STATE_BUFFERING", 2);
        d = new <init>("STATE_READY", 3);
        e = new <init>("STATE_ENDED", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private a(String s, int i)
    {
        super(s, i);
    }
}
