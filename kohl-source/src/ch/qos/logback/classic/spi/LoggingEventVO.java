// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import fs.org.slf4j.Marker;
import fs.org.slf4j.helpers.FormattingTuple;
import fs.org.slf4j.helpers.MessageFormatter;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package ch.qos.logback.classic.spi:
//            ILoggingEvent, ThrowableProxyVO, LoggerContextVO, IThrowableProxy

public class LoggingEventVO
    implements ILoggingEvent, Serializable
{

    private transient Object argumentArray[];
    private StackTraceElement callerDataArray[];
    private transient String formattedMessage;
    private transient Level level;
    private LoggerContextVO loggerContextVO;
    private String loggerName;
    private Marker marker;
    private Map mdcPropertyMap;
    private String message;
    private String threadName;
    private ThrowableProxyVO throwableProxy;
    private long timeStamp;

    public LoggingEventVO()
    {
    }

    public static LoggingEventVO build(ILoggingEvent iloggingevent)
    {
        LoggingEventVO loggingeventvo = new LoggingEventVO();
        loggingeventvo.loggerName = iloggingevent.getLoggerName();
        loggingeventvo.loggerContextVO = iloggingevent.getLoggerContextVO();
        loggingeventvo.threadName = iloggingevent.getThreadName();
        loggingeventvo.level = iloggingevent.getLevel();
        loggingeventvo.message = iloggingevent.getMessage();
        loggingeventvo.argumentArray = iloggingevent.getArgumentArray();
        loggingeventvo.marker = iloggingevent.getMarker();
        loggingeventvo.mdcPropertyMap = iloggingevent.getMDCPropertyMap();
        loggingeventvo.timeStamp = iloggingevent.getTimeStamp();
        loggingeventvo.throwableProxy = ThrowableProxyVO.build(iloggingevent.getThrowableProxy());
        if (iloggingevent.hasCallerData())
        {
            loggingeventvo.callerDataArray = iloggingevent.getCallerData();
        }
        return loggingeventvo;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (LoggingEventVO)obj;
        if (message == null)
        {
            if (((LoggingEventVO) (obj)).message != null)
            {
                return false;
            }
        } else
        if (!message.equals(((LoggingEventVO) (obj)).message))
        {
            return false;
        }
        if (loggerName == null)
        {
            if (((LoggingEventVO) (obj)).loggerName != null)
            {
                return false;
            }
        } else
        if (!loggerName.equals(((LoggingEventVO) (obj)).loggerName))
        {
            return false;
        }
        if (threadName == null)
        {
            if (((LoggingEventVO) (obj)).threadName != null)
            {
                return false;
            }
        } else
        if (!threadName.equals(((LoggingEventVO) (obj)).threadName))
        {
            return false;
        }
        if (timeStamp != ((LoggingEventVO) (obj)).timeStamp)
        {
            return false;
        }
        if (marker == null)
        {
            if (((LoggingEventVO) (obj)).marker != null)
            {
                return false;
            }
        } else
        if (!marker.equals(((LoggingEventVO) (obj)).marker))
        {
            return false;
        }
        if (mdcPropertyMap != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((LoggingEventVO) (obj)).mdcPropertyMap == null) goto _L1; else goto _L3
_L3:
        return false;
        if (mdcPropertyMap.equals(((LoggingEventVO) (obj)).mdcPropertyMap)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Object[] getArgumentArray()
    {
        return argumentArray;
    }

    public StackTraceElement[] getCallerData()
    {
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

    public int hashCode()
    {
        int j = 0;
        int i;
        if (message == null)
        {
            i = 0;
        } else
        {
            i = message.hashCode();
        }
        if (threadName != null)
        {
            j = threadName.hashCode();
        }
        return ((i + 31) * 31 + j) * 31 + (int)(timeStamp ^ timeStamp >>> 32);
    }
}
