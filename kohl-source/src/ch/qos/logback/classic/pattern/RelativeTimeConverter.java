// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggerContextVO;

// Referenced classes of package ch.qos.logback.classic.pattern:
//            ClassicConverter

public class RelativeTimeConverter extends ClassicConverter
{

    long lastTimestamp;
    String timesmapCache;

    public RelativeTimeConverter()
    {
        lastTimestamp = -1L;
        timesmapCache = null;
    }

    public String convert(ILoggingEvent iloggingevent)
    {
        long l = iloggingevent.getTimeStamp();
        this;
        JVM INSTR monitorenter ;
        if (l != lastTimestamp)
        {
            lastTimestamp = l;
            timesmapCache = Long.toString(l - iloggingevent.getLoggerContextVO().getBirthTime());
        }
        iloggingevent = timesmapCache;
        this;
        JVM INSTR monitorexit ;
        return iloggingevent;
        iloggingevent;
        this;
        JVM INSTR monitorexit ;
        throw iloggingevent;
    }

    public volatile String convert(Object obj)
    {
        return convert((ILoggingEvent)obj);
    }
}
