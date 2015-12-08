// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;


// Referenced classes of package com.comscore.streaming:
//            StreamSense, a, StreamSenseState

abstract class f
    implements Runnable
{

    final StreamSense d;

    private f(StreamSense streamsense)
    {
        d = streamsense;
        super();
    }

    f(StreamSense streamsense, a a)
    {
        this(streamsense);
    }

    public abstract StreamSenseState getNextState();
}
