// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


public final class PlaybackProtocol extends Enum
{

    private static final PlaybackProtocol $VALUES[];
    public static final PlaybackProtocol HLS;
    public static final PlaybackProtocol HTTPS;
    private final String value;

    private PlaybackProtocol(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static PlaybackProtocol valueOf(String s)
    {
        return (PlaybackProtocol)Enum.valueOf(com/soundcloud/android/playback/PlaybackProtocol, s);
    }

    public static PlaybackProtocol[] values()
    {
        return (PlaybackProtocol[])$VALUES.clone();
    }

    public final String getValue()
    {
        return value;
    }

    static 
    {
        HLS = new PlaybackProtocol("HLS", 0, "hls");
        HTTPS = new PlaybackProtocol("HTTPS", 1, "https");
        $VALUES = (new PlaybackProtocol[] {
            HLS, HTTPS
        });
    }
}
