// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events;

import java.util.TimerTask;

// Referenced classes of package com.worklight.location.internal.events:
//            EventTransmitterPiggybacker, EventTransmitter

final class PiggybackerFlush extends TimerTask
{

    private final EventTransmitterPiggybacker piggybacker;

    PiggybackerFlush(EventTransmitterPiggybacker eventtransmitterpiggybacker)
    {
        piggybacker = eventtransmitterpiggybacker;
    }

    public void run()
    {
        synchronized (piggybacker)
        {
            piggybacker.getEventTransmitter().flushEventsFromAsync();
            piggybacker.setTimer(null);
        }
        return;
        exception;
        eventtransmitterpiggybacker;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
