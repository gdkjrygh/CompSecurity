// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


// Referenced classes of package com.comscore.streaming:
//            f, State, StreamSense

class d extends f
{

    final State a;
    final StreamSense b;

    d(StreamSense streamsense, State state)
    {
        b = streamsense;
        a = state;
        super(streamsense, null);
    }

    public State getNextState()
    {
        return a;
    }
}
