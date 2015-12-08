// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public final class PlayState extends Enum
{

    private static final PlayState $VALUES[];
    public static final PlayState BUFFERFULL;
    public static final PlayState BUFFERING;
    public static final PlayState EOF;
    public static final PlayState PAUSED;
    public static final PlayState PLAYING;
    public static final PlayState READY;
    public static final PlayState SUSPENDED;
    public static final PlayState TRICK_PLAY;
    public static final PlayState UNINITIALIZED;
    public static final PlayState UNRECOVERABLE_ERROR;
    private final int value;

    private PlayState(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static PlayState valueOf(String s)
    {
        return (PlayState)Enum.valueOf(com/adobe/ave/PlayState, s);
    }

    public static PlayState[] values()
    {
        return (PlayState[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        UNINITIALIZED = new PlayState("UNINITIALIZED", 0, 0);
        READY = new PlayState("READY", 1, 1);
        BUFFERING = new PlayState("BUFFERING", 2, 2);
        BUFFERFULL = new PlayState("BUFFERFULL", 3, 3);
        PLAYING = new PlayState("PLAYING", 4, 4);
        PAUSED = new PlayState("PAUSED", 5, 5);
        EOF = new PlayState("EOF", 6, 6);
        SUSPENDED = new PlayState("SUSPENDED", 7, 7);
        TRICK_PLAY = new PlayState("TRICK_PLAY", 8, 8);
        UNRECOVERABLE_ERROR = new PlayState("UNRECOVERABLE_ERROR", 9, 9);
        $VALUES = (new PlayState[] {
            UNINITIALIZED, READY, BUFFERING, BUFFERFULL, PLAYING, PAUSED, EOF, SUSPENDED, TRICK_PLAY, UNRECOVERABLE_ERROR
        });
    }
}
