// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.android.LogcatAppender;
import ch.qos.logback.classic.spi.ILoggingEvent;

// Referenced classes of package com.fsr.tracker.app:
//            TrackingContext, EventPublisher

class ppender extends LogcatAppender
{

    final TrackingContext this$0;
    final EventPublisher val$publisher;

    public void append(ILoggingEvent iloggingevent)
    {
        super.append(iloggingevent);
        if (iloggingevent.getLevel().isGreaterOrEqual(Level.DEBUG))
        {
            iloggingevent = new eCycleEvent(eCycleEvent.EventType.DEBUG, iloggingevent.getFormattedMessage());
            val$publisher.publishEvent(iloggingevent);
        }
    }

    public volatile void append(Object obj)
    {
        append((ILoggingEvent)obj);
    }

    nt()
    {
        this$0 = final_trackingcontext;
        val$publisher = EventPublisher.this;
        super();
    }
}
