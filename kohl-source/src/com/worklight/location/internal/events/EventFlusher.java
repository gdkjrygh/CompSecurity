// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events;

import java.util.TimerTask;

// Referenced classes of package com.worklight.location.internal.events:
//            EventTransmitter

final class EventFlusher extends TimerTask
{

    private final EventTransmitter eventPrediocFlusher;

    EventFlusher(EventTransmitter eventtransmitter)
    {
        eventPrediocFlusher = eventtransmitter;
    }

    public void run()
    {
        eventPrediocFlusher.flushEventsFromAsync();
    }
}
