// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackService

public class PlaybackStateProvider
{

    public PlaybackStateProvider()
    {
    }

    public boolean isPlaying()
    {
        PlaybackService playbackservice = PlaybackService.instance;
        return playbackservice != null && playbackservice.isPlayerPlaying();
    }

    public boolean isSupposedToBePlaying()
    {
        PlaybackService playbackservice = PlaybackService.instance;
        return playbackservice != null && playbackservice.isPlaying();
    }
}
