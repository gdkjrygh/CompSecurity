// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


public final class MediaPlayerState extends Enum
{

    private static final MediaPlayerState $VALUES[];
    public static final MediaPlayerState COMPLETE;
    public static final MediaPlayerState ERROR;
    public static final MediaPlayerState IDLE;
    public static final MediaPlayerState PAUSE;
    public static final MediaPlayerState PLAY;
    public static final MediaPlayerState SEEKING;
    public static final MediaPlayerState SUSPENDED;

    private MediaPlayerState(String s, int i)
    {
        super(s, i);
    }

    public static MediaPlayerState valueOf(String s)
    {
        return (MediaPlayerState)Enum.valueOf(com/adobe/mediacore/MediaPlayerState, s);
    }

    public static MediaPlayerState[] values()
    {
        return (MediaPlayerState[])$VALUES.clone();
    }

    static 
    {
        IDLE = new MediaPlayerState("IDLE", 0);
        PLAY = new MediaPlayerState("PLAY", 1);
        PAUSE = new MediaPlayerState("PAUSE", 2);
        SEEKING = new MediaPlayerState("SEEKING", 3);
        COMPLETE = new MediaPlayerState("COMPLETE", 4);
        ERROR = new MediaPlayerState("ERROR", 5);
        SUSPENDED = new MediaPlayerState("SUSPENDED", 6);
        $VALUES = (new MediaPlayerState[] {
            IDLE, PLAY, PAUSE, SEEKING, COMPLETE, ERROR, SUSPENDED
        });
    }
}
