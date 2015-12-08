// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class VideoPlayerState
    implements JacksonModel
{

    public Long durationInMs;
    public boolean isBuffering;
    public boolean isPaused;
    public String playbackId;
    public float playbackSpeed;
    public Long positionAsOfTimestampInMs;
    public long timestamp;

    public VideoPlayerState()
    {
    }

    public VideoPlayerState(long l, String s, Long long1, Long long2, boolean flag, float f, 
            boolean flag1)
    {
        timestamp = l;
        playbackId = s;
        positionAsOfTimestampInMs = long1;
        durationInMs = long2;
        isBuffering = flag;
        playbackSpeed = f;
        isPaused = flag1;
    }

    public String toString()
    {
        return (new StringBuilder("VideoPlayerState{timestamp=")).append(timestamp).append(", playbackId='").append(playbackId).append('\'').append(", positionAsOfTimestampInMs=").append(positionAsOfTimestampInMs).append(", durationInMs=").append(durationInMs).append(", isBuffering=").append(isBuffering).append(", playbackSpeed=").append(playbackSpeed).append(", isPaused=").append(isPaused).append('}').toString();
    }
}
