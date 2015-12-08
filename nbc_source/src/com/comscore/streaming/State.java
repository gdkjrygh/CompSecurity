// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


// Referenced classes of package com.comscore.streaming:
//            StreamSenseEventType

public final class State extends Enum
{

    public static final State BUFFERING;
    public static final State IDLE;
    public static final State PAUSED;
    public static final State PLAYING;
    private static final State d[];
    private String a;
    private int b;
    private StreamSenseEventType c;

    private State(String s, int i, String s1, int j, StreamSenseEventType streamsenseeventtype)
    {
        super(s, i);
        a = s1;
        b = j;
        c = streamsenseeventtype;
    }

    public static State valueOf(String s)
    {
        return (State)Enum.valueOf(com/comscore/streaming/State, s);
    }

    public static State[] values()
    {
        return (State[])d.clone();
    }

    public int getCode()
    {
        return b;
    }

    public String getName()
    {
        return a;
    }

    public StreamSenseEventType toEventType()
    {
        return c;
    }

    public String toString()
    {
        return getName();
    }

    static 
    {
        IDLE = new State("IDLE", 0, "idle", 0, StreamSenseEventType.END);
        PLAYING = new State("PLAYING", 1, "playing", 1, StreamSenseEventType.PLAY);
        PAUSED = new State("PAUSED", 2, "paused", 2, StreamSenseEventType.PAUSE);
        BUFFERING = new State("BUFFERING", 3, "buffering", 3, StreamSenseEventType.BUFFER);
        d = (new State[] {
            IDLE, PLAYING, PAUSED, BUFFERING
        });
    }
}
