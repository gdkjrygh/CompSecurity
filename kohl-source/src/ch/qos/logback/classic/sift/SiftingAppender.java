// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.sift;

import ch.qos.logback.classic.spi.ILoggingEvent;
import fs.ch.qos.logback.core.sift.SiftingAppenderBase;

public class SiftingAppender extends SiftingAppenderBase
{

    public SiftingAppender()
    {
    }

    protected long getTimestamp(ILoggingEvent iloggingevent)
    {
        return iloggingevent.getTimeStamp();
    }

    protected volatile long getTimestamp(Object obj)
    {
        return getTimestamp((ILoggingEvent)obj);
    }
}
