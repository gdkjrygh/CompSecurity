// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.spi.LoggingEventVO;
import fs.ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.Serializable;

public class LoggingEventPreSerializationTransformer
    implements PreSerializationTransformer
{

    public LoggingEventPreSerializationTransformer()
    {
    }

    public Serializable transform(ILoggingEvent iloggingevent)
    {
        if (iloggingevent == null)
        {
            return null;
        }
        if (iloggingevent instanceof LoggingEvent)
        {
            return LoggingEventVO.build(iloggingevent);
        }
        if (iloggingevent instanceof LoggingEventVO)
        {
            return (LoggingEventVO)iloggingevent;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported type ").append(iloggingevent.getClass().getName()).toString());
        }
    }

    public volatile Serializable transform(Object obj)
    {
        return transform((ILoggingEvent)obj);
    }
}
