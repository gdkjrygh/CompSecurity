// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaybackProgress;

public class PlaybackProgressEvent
{

    PlaybackProgress playbackProgress;
    Urn trackUrn;

    public PlaybackProgressEvent(PlaybackProgress playbackprogress, Urn urn)
    {
        playbackProgress = playbackprogress;
        trackUrn = urn;
    }

    public PlaybackProgress getPlaybackProgress()
    {
        return playbackProgress;
    }

    public Urn getTrackUrn()
    {
        return trackUrn;
    }
}
