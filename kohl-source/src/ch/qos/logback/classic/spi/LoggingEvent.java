// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.LogbackMDCAdapter;
import fs.org.slf4j.MDC;
import fs.org.slf4j.Marker;
import fs.org.slf4j.helpers.FormattingTuple;
import fs.org.slf4j.helpers.MessageFormatter;
import fs.org.slf4j.spi.MDCAdapter;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package ch.qos.logback.classic.spi:
//            ILoggingEvent, ThrowableProxy, CallerData, LoggerContextVO, 
//            IThrowableProxy

public class LoggingEvent
    implements ILoggingEvent
{

    private static final Map CACHED_NULL_MAP = new HashMap();
    private transient Object argumentArray[];
    private StackTraceElement callerDataArray[];
    private transient String formattedMessage;
    transient String fqnOfLoggerClass;
    private transient Level level;
    private LoggerContext loggerContext;
    private LoggerContextVO loggerContextVO;
    private String loggerName;
    private Marker marker;
    private Map mdcPropertyMap;
    private String message;
    private String threadName;
    private ThrowableProxy throwableProxy;
    private long timeStamp;

    public LoggingEvent()
    {
    }

    public LoggingEvent(String s, Logger logger, Level level1, String s1, Throwable throwable, Object aobj[])
    {
        fqnOfLoggerClass = s;
        loggerName = logger.getName();
        loggerContext = logger.getLoggerContext();
        loggerContextVO = loggerContext.getLoggerContextRemoteView();
        level = level1;
        message = s1;
        s = MessageFormatter.arrayFormat(s1, aobj);
        formattedMessage = s.getMessage();
        if (throwable == null)
        {
            argumentArray = s.getArgArray();
            throwable = s.getThrowable();
        } else
        {
            argumentArray = aobj;
        }
        if (throwable != null)
        {
            throwableProxy = new ThrowableProxy(throwable);
            if (logger.getLoggerContext().isPackagingDataEnabled())
            {
                throwableProxy.calculatePackagingData();
            }
        }
        timeStamp = System.currentTimeMillis();
    }

    public Object[] getArgumentArray()
    {
        return argumentArray;
    }

    public StackTraceElement[] getCallerData()
    {
        if (callerDataArray == null)
        {
            callerDataArray = CallerData.extract(new Throwable(), fqnOfLoggerClass, loggerContext.getMaxCallerDataDepth(), loggerContext.getFrameworkPackages());
        }
        return callerDataArray;
    }

    public String getFormattedMessage()
    {
        if (formattedMessage != null)
        {
            return formattedMessage;
        }
        if (argumentArray != null)
        {
            formattedMessage = MessageFormatter.arrayFormat(message, argumentArray).getMessage();
        } else
        {
            formattedMessage = message;
        }
        return formattedMessage;
    }

    public Level getLevel()
    {
        return level;
    }

    public LoggerContextVO getLoggerContextVO()
    {
        return loggerContextVO;
    }

    public String getLoggerName()
    {
        return loggerName;
    }

    public Map getMDCPropertyMap()
    {
        if (mdcPropertyMap == null)
        {
            MDCAdapter mdcadapter = MDC.getMDCAdapter();
            if (mdcadapter instanceof LogbackMDCAdapter)
            {
                mdcPropertyMap = ((LogbackMDCAdapter)mdcadapter).getPropertyMap();
            } else
            {
                mdcPropertyMap = mdcadapter.getCopyOfContextMap();
            }
        }
        if (mdcPropertyMap == null)
        {
            mdcPropertyMap = CACHED_NULL_MAP;
        }
        return mdcPropertyMap;
    }

    public Marker getMarker()
    {
        return marker;
    }

    public String getMessage()
    {
        return message;
    }

    public String getThreadName()
    {
        if (threadName == null)
        {
            threadName = Thread.currentThread().getName();
        }
        return threadName;
    }

    public IThrowableProxy getThrowableProxy()
    {
        return throwableProxy;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }

    public boolean hasCallerData()
    {
        return callerDataArray != null;
    }

    public void setMarker(Marker marker1)
    {
        if (marker != null)
        {
            throw new IllegalStateException("The marker has been already set for this event.");
        } else
        {
            marker = marker1;
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[');
        stringbuilder.append(level).append("] ");
        stringbuilder.append(getFormattedMessage());
        return stringbuilder.toString();
    }

}
