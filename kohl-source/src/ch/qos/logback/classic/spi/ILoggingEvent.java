// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.Level;
import fs.org.slf4j.Marker;
import java.util.Map;

// Referenced classes of package ch.qos.logback.classic.spi:
//            LoggerContextVO, IThrowableProxy

public interface ILoggingEvent
{

    public abstract Object[] getArgumentArray();

    public abstract StackTraceElement[] getCallerData();

    public abstract String getFormattedMessage();

    public abstract Level getLevel();

    public abstract LoggerContextVO getLoggerContextVO();

    public abstract String getLoggerName();

    public abstract Map getMDCPropertyMap();

    public abstract Marker getMarker();

    public abstract String getMessage();

    public abstract String getThreadName();

    public abstract IThrowableProxy getThrowableProxy();

    public abstract long getTimeStamp();

    public abstract boolean hasCallerData();
}
