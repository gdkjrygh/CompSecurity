// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.mediaplayer;

import java.util.EnumSet;

final class PlaybackState extends Enum
{

    private static final PlaybackState $VALUES[];
    public static final PlaybackState COMPLETED;
    public static final PlaybackState ERROR;
    public static final PlaybackState ERROR_RETRYING;
    public static final EnumSet LOADING;
    public static final EnumSet PAUSEABLE;
    public static final PlaybackState PAUSED;
    public static final PlaybackState PAUSED_FOR_BUFFERING;
    public static final PlaybackState PLAYING;
    public static final PlaybackState PREPARING;
    public static final EnumSet SEEKABLE;
    public static final EnumSet STARTABLE;
    public static final EnumSet STOPPABLE;
    public static final PlaybackState STOPPED;

    private PlaybackState(String s, int i)
    {
        super(s, i);
    }

    public static PlaybackState valueOf(String s)
    {
        return (PlaybackState)Enum.valueOf(com/soundcloud/android/playback/mediaplayer/PlaybackState, s);
    }

    public static PlaybackState[] values()
    {
        return (PlaybackState[])$VALUES.clone();
    }

    public final boolean canGetMPProgress()
    {
        return !isError() && this != PREPARING && this != STOPPED;
    }

    public final boolean isError()
    {
        return this == ERROR || this == ERROR_RETRYING;
    }

    public final boolean isLoading()
    {
        return LOADING.contains(this);
    }

    public final boolean isPausable()
    {
        return PAUSEABLE.contains(this);
    }

    public final boolean isSeekable()
    {
        return SEEKABLE.contains(this);
    }

    public final boolean isStartable()
    {
        return STARTABLE.contains(this);
    }

    public final boolean isStoppable()
    {
        return STOPPABLE.contains(this);
    }

    public final boolean isSupposedToBePlaying()
    {
        return this == PREPARING || this == PLAYING || this == PAUSED_FOR_BUFFERING;
    }

    static 
    {
        STOPPED = new PlaybackState("STOPPED", 0);
        ERROR = new PlaybackState("ERROR", 1);
        ERROR_RETRYING = new PlaybackState("ERROR_RETRYING", 2);
        PREPARING = new PlaybackState("PREPARING", 3);
        PLAYING = new PlaybackState("PLAYING", 4);
        PAUSED = new PlaybackState("PAUSED", 5);
        PAUSED_FOR_BUFFERING = new PlaybackState("PAUSED_FOR_BUFFERING", 6);
        COMPLETED = new PlaybackState("COMPLETED", 7);
        $VALUES = (new PlaybackState[] {
            STOPPED, ERROR, ERROR_RETRYING, PREPARING, PLAYING, PAUSED, PAUSED_FOR_BUFFERING, COMPLETED
        });
        SEEKABLE = EnumSet.of(PREPARING, PLAYING, PAUSED, PAUSED_FOR_BUFFERING, COMPLETED);
        STARTABLE = EnumSet.of(PLAYING, PAUSED, PAUSED_FOR_BUFFERING, COMPLETED);
        STOPPABLE = EnumSet.of(PLAYING, STOPPED, PAUSED, PAUSED_FOR_BUFFERING, COMPLETED);
        PAUSEABLE = EnumSet.of(PLAYING, PAUSED_FOR_BUFFERING, PAUSED);
        LOADING = EnumSet.of(PAUSED_FOR_BUFFERING, PREPARING);
    }
}
