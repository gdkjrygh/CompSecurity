// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.net;

import ch.qos.logback.classic.spi.ILoggingEvent;
import fs.ch.qos.logback.core.net.SocketAppenderBase;
import fs.ch.qos.logback.core.spi.PreSerializationTransformer;

// Referenced classes of package ch.qos.logback.classic.net:
//            LoggingEventPreSerializationTransformer

public class SocketAppender extends SocketAppenderBase
{

    boolean includeCallerData;
    PreSerializationTransformer pst;

    public SocketAppender()
    {
        includeCallerData = false;
        pst = new LoggingEventPreSerializationTransformer();
    }

    public PreSerializationTransformer getPST()
    {
        return pst;
    }

    protected void postProcessEvent(ILoggingEvent iloggingevent)
    {
        if (includeCallerData)
        {
            iloggingevent.getCallerData();
        }
    }

    protected volatile void postProcessEvent(Object obj)
    {
        postProcessEvent((ILoggingEvent)obj);
    }

    public void setIncludeCallerData(boolean flag)
    {
        includeCallerData = flag;
    }
}
