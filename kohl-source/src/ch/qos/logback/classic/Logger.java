// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggerRemoteView;
import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.classic.util.LoggerNameUtil;
import fs.ch.qos.logback.core.Appender;
import fs.ch.qos.logback.core.spi.AppenderAttachable;
import fs.ch.qos.logback.core.spi.AppenderAttachableImpl;
import fs.ch.qos.logback.core.spi.FilterReply;
import fs.org.slf4j.Marker;
import fs.org.slf4j.spi.LocationAwareLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ch.qos.logback.classic:
//            LoggerContext, Level

public final class Logger
    implements AppenderAttachable, fs.org.slf4j.Logger, LocationAwareLogger, Serializable
{

    public static final String FQCN = ch/qos/logback/classic/Logger.getName();
    private transient AppenderAttachableImpl aai;
    private boolean additive;
    private List childrenList;
    private int effectiveLevelInt;
    private Level level;
    final transient LoggerContext loggerContext;
    LoggerRemoteView loggerRemoteView;
    private String name;
    private Logger parent;

    Logger(String s, Logger logger, LoggerContext loggercontext)
    {
        additive = true;
        name = s;
        parent = logger;
        loggerContext = loggercontext;
        buildRemoteView();
    }

    private int appendLoopOnAppenders(ILoggingEvent iloggingevent)
    {
        if (aai != null)
        {
            return aai.appendLoopOnAppenders(iloggingevent);
        } else
        {
            return 0;
        }
    }

    private void buildLoggingEventAndAppend(String s, Marker marker, Level level1, String s1, Object aobj[], Throwable throwable)
    {
        s = new LoggingEvent(s, this, level1, s1, throwable, aobj);
        s.setMarker(marker);
        callAppenders(s);
    }

    private void filterAndLog_0_Or3Plus(String s, Marker marker, Level level1, String s1, Object aobj[], Throwable throwable)
    {
        FilterReply filterreply = loggerContext.getTurboFilterChainDecision_0_3OrMore(marker, this, level1, s1, aobj, throwable);
        if (filterreply != FilterReply.NEUTRAL ? filterreply == FilterReply.DENY : effectiveLevelInt > level1.levelInt)
        {
            return;
        } else
        {
            buildLoggingEventAndAppend(s, marker, level1, s1, aobj, throwable);
            return;
        }
    }

    private void filterAndLog_1(String s, Marker marker, Level level1, String s1, Object obj, Throwable throwable)
    {
        FilterReply filterreply = loggerContext.getTurboFilterChainDecision_1(marker, this, level1, s1, obj, throwable);
        if (filterreply != FilterReply.NEUTRAL ? filterreply == FilterReply.DENY : effectiveLevelInt > level1.levelInt)
        {
            return;
        } else
        {
            buildLoggingEventAndAppend(s, marker, level1, s1, new Object[] {
                obj
            }, throwable);
            return;
        }
    }

    private void filterAndLog_2(String s, Marker marker, Level level1, String s1, Object obj, Object obj1, Throwable throwable)
    {
        FilterReply filterreply = loggerContext.getTurboFilterChainDecision_2(marker, this, level1, s1, obj, obj1, throwable);
        if (filterreply != FilterReply.NEUTRAL ? filterreply == FilterReply.DENY : effectiveLevelInt > level1.levelInt)
        {
            return;
        } else
        {
            buildLoggingEventAndAppend(s, marker, level1, s1, new Object[] {
                obj, obj1
            }, throwable);
            return;
        }
    }

    private void handleParentLevelChange(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (level != null) goto _L2; else goto _L1
_L1:
        effectiveLevelInt = i;
        if (childrenList == null) goto _L2; else goto _L3
_L3:
        int k = childrenList.size();
        int j = 0;
_L4:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Logger)childrenList.get(j)).handleParentLevelChange(i);
        j++;
        if (true) goto _L4; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean isRootLogger()
    {
        return parent == null;
    }

    private void localLevelReset()
    {
        effectiveLevelInt = 10000;
        if (isRootLogger())
        {
            level = Level.DEBUG;
            return;
        } else
        {
            level = null;
            return;
        }
    }

    public void addAppender(Appender appender)
    {
        this;
        JVM INSTR monitorenter ;
        if (aai == null)
        {
            aai = new AppenderAttachableImpl();
        }
        aai.addAppender(appender);
        this;
        JVM INSTR monitorexit ;
        return;
        appender;
        throw appender;
    }

    void buildRemoteView()
    {
        loggerRemoteView = new LoggerRemoteView(name, loggerContext);
    }

    public void callAppenders(ILoggingEvent iloggingevent)
    {
        int i = 0;
        Logger logger = this;
        do
        {
label0:
            {
                int j = i;
                if (logger != null)
                {
                    i += logger.appendLoopOnAppenders(iloggingevent);
                    if (logger.additive)
                    {
                        break label0;
                    }
                    j = i;
                }
                if (j == 0)
                {
                    loggerContext.noAppenderDefinedWarning(this);
                }
                return;
            }
            logger = logger.parent;
        } while (true);
    }

    Logger createChildByName(String s)
    {
        if (LoggerNameUtil.getSeparatorIndexOf(s, name.length() + 1) != -1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("For logger [").append(name).append("] child name [").append(s).append(" passed as parameter, may not include '.' after index").append(name.length() + 1).toString());
        }
        if (childrenList == null)
        {
            childrenList = new ArrayList(5);
        }
        s = new Logger(s, this, loggerContext);
        childrenList.add(s);
        s.effectiveLevelInt = effectiveLevelInt;
        return s;
    }

    public void debug(String s)
    {
        filterAndLog_0_Or3Plus(FQCN, null, Level.DEBUG, s, null, null);
    }

    public void debug(String s, Object obj)
    {
        filterAndLog_1(FQCN, null, Level.DEBUG, s, obj, null);
    }

    public void debug(String s, Object obj, Object obj1)
    {
        filterAndLog_2(FQCN, null, Level.DEBUG, s, obj, obj1, null);
    }

    public void detachAndStopAllAppenders()
    {
        if (aai != null)
        {
            aai.detachAndStopAllAppenders();
        }
    }

    public void error(String s, Object obj)
    {
        filterAndLog_1(FQCN, null, Level.ERROR, s, obj, null);
    }

    public void error(String s, Object obj, Object obj1)
    {
        filterAndLog_2(FQCN, null, Level.ERROR, s, obj, obj1, null);
    }

    public void error(String s, Throwable throwable)
    {
        filterAndLog_0_Or3Plus(FQCN, null, Level.ERROR, s, null, throwable);
    }

    Logger getChildByName(String s)
    {
        if (childrenList != null) goto _L2; else goto _L1
_L1:
        Logger logger = null;
_L4:
        return logger;
_L2:
        int j = childrenList.size();
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                Logger logger1 = (Logger)childrenList.get(i);
                logger = logger1;
                if (s.equals(logger1.getName()))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    public Level getLevel()
    {
        return level;
    }

    public LoggerContext getLoggerContext()
    {
        return loggerContext;
    }

    public String getName()
    {
        return name;
    }

    public void info(String s)
    {
        filterAndLog_0_Or3Plus(FQCN, null, Level.INFO, s, null, null);
    }

    public void info(String s, Object obj)
    {
        filterAndLog_1(FQCN, null, Level.INFO, s, obj, null);
    }

    public void info(String s, Object obj, Object obj1)
    {
        filterAndLog_2(FQCN, null, Level.INFO, s, obj, obj1, null);
    }

    void recursiveReset()
    {
        detachAndStopAllAppenders();
        localLevelReset();
        additive = true;
        if (childrenList != null)
        {
            Iterator iterator = childrenList.iterator();
            while (iterator.hasNext()) 
            {
                ((Logger)iterator.next()).recursiveReset();
            }
        }
    }

    public void setAdditive(boolean flag)
    {
        additive = flag;
    }

    public void setLevel(Level level1)
    {
        this;
        JVM INSTR monitorenter ;
        Level level2 = level;
        if (level2 != level1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (level1 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (isRootLogger())
        {
            throw new IllegalArgumentException("The level of the root logger cannot be set to null");
        }
        break MISSING_BLOCK_LABEL_42;
        level1;
        this;
        JVM INSTR monitorexit ;
        throw level1;
        level = level1;
        if (level1 != null) goto _L4; else goto _L3
_L3:
        effectiveLevelInt = parent.effectiveLevelInt;
_L8:
        if (childrenList == null) goto _L6; else goto _L5
_L5:
        int j = childrenList.size();
        int i = 0;
_L7:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Logger)childrenList.get(i)).handleParentLevelChange(effectiveLevelInt);
        i++;
        if (true) goto _L7; else goto _L6
_L4:
        effectiveLevelInt = level1.levelInt;
          goto _L8
_L6:
        loggerContext.fireOnLevelChange(this, level1);
          goto _L1
    }

    public String toString()
    {
        return (new StringBuilder()).append("Logger[").append(name).append("]").toString();
    }

    public void trace(String s, Object obj, Object obj1)
    {
        filterAndLog_2(FQCN, null, Level.TRACE, s, obj, obj1, null);
    }

    public void warn(String s)
    {
        filterAndLog_0_Or3Plus(FQCN, null, Level.WARN, s, null, null);
    }

    public void warn(String s, Object obj)
    {
        filterAndLog_1(FQCN, null, Level.WARN, s, obj, null);
    }

}
