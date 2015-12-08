// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.skippy;


class 
{

    static final int $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[];
    static final int $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[];
    static final int $SwitchMap$com$soundcloud$android$skippy$Skippy$State[];

    static 
    {
        $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric = new int[com.soundcloud.android.skippy.etric.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.etric.TIME_TO_PLAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.etric.TIME_TO_BUFFER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.etric.TIME_TO_GET_PLAYLIST.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.etric.TIME_TO_SEEK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.etric.FRAGMENT_DOWNLOAD_RATE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.etric.TIME_TO_LOAD_LIBRARY.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.etric.CACHE_USAGE_PERCENT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.etric.UNINTERRUPTED_PLAYTIME.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        $SwitchMap$com$soundcloud$android$skippy$Skippy$Error = new int[com.soundcloud.android.skippy.ues().length];
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[com.soundcloud.android.skippy.LED.inal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[com.soundcloud.android.skippy.EOUT.inal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[com.soundcloud.android.skippy.BIDDEN.inal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[com.soundcloud.android.skippy.IA_NOT_FOUND.inal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        $SwitchMap$com$soundcloud$android$skippy$Skippy$State = new int[com.soundcloud.android.skippy.ues().length];
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$State[com.soundcloud.android.skippy.E.inal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$State[com.soundcloud.android.skippy.YING.inal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
