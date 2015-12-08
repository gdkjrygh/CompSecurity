// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


// Referenced classes of package com.soundcloud.android.skippy:
//            Skippy

public static final class _cls9 extends Enum
{

    private static final UNINTERRUPTED_PLAYTIME $VALUES[];
    public static final UNINTERRUPTED_PLAYTIME CACHE_USAGE_PERCENT;
    public static final UNINTERRUPTED_PLAYTIME FRAGMENT_DOWNLOAD_RATE;
    public static final UNINTERRUPTED_PLAYTIME TIME_TO_BUFFER;
    public static final UNINTERRUPTED_PLAYTIME TIME_TO_GET_PLAYLIST;
    public static final UNINTERRUPTED_PLAYTIME TIME_TO_LOAD_LIBRARY;
    public static final UNINTERRUPTED_PLAYTIME TIME_TO_PLAY;
    public static final UNINTERRUPTED_PLAYTIME TIME_TO_SEEK;
    public static final UNINTERRUPTED_PLAYTIME UNINTERRUPTED_PLAYTIME;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/soundcloud/android/skippy/Skippy$PlaybackMetric, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        TIME_TO_PLAY = new <init>("TIME_TO_PLAY", 0);
        TIME_TO_GET_PLAYLIST = new <init>("TIME_TO_GET_PLAYLIST", 1);
        TIME_TO_BUFFER = new <init>("TIME_TO_BUFFER", 2);
        TIME_TO_SEEK = new <init>("TIME_TO_SEEK", 3);
        FRAGMENT_DOWNLOAD_RATE = new <init>("FRAGMENT_DOWNLOAD_RATE", 4);
        TIME_TO_LOAD_LIBRARY = new <init>("TIME_TO_LOAD_LIBRARY", 5);
        CACHE_USAGE_PERCENT = new <init>("CACHE_USAGE_PERCENT", 6);
        UNINTERRUPTED_PLAYTIME = new <init>("UNINTERRUPTED_PLAYTIME", 7);
        $VALUES = (new .VALUES[] {
            TIME_TO_PLAY, TIME_TO_GET_PLAYLIST, TIME_TO_BUFFER, TIME_TO_SEEK, FRAGMENT_DOWNLOAD_RATE, TIME_TO_LOAD_LIBRARY, CACHE_USAGE_PERCENT, UNINTERRUPTED_PLAYTIME
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
