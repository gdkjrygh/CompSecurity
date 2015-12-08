// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.mediaplayer;


// Referenced classes of package com.soundcloud.android.playback.mediaplayer:
//            PlaybackState

class 
{

    static final int $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[];

    static 
    {
        $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState = new int[PlaybackState.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.PREPARING.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.PAUSED_FOR_BUFFERING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.PLAYING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.ERROR.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.COMPLETED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.PAUSED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.STOPPED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.ERROR_RETRYING.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
