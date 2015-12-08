// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic;

import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.classic.spi.TurboFilterList;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.classic.util.LoggerNameUtil;
import fs.ch.qos.logback.core.ContextBase;
import fs.ch.qos.logback.core.spi.FilterReply;
import fs.ch.qos.logback.core.spi.LifeCycle;
import fs.ch.qos.logback.core.status.StatusListener;
import fs.ch.qos.logback.core.status.StatusManager;
import fs.ch.qos.logback.core.status.WarnStatus;
import fs.org.slf4j.ILoggerFactory;
import fs.org.slf4j.Logger;
import fs.org.slf4j.Marker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package ch.qos.logback.classic:
//            Logger, Level

public class LoggerContext extends ContextBase
    implements LifeCycle, ILoggerFactory
{

    private List frameworkPackages;
    private Map loggerCache;
    private final List loggerContextListenerList = new ArrayList();
    private LoggerContextVO loggerContextRemoteView;
    private int maxCallerDataDepth;
    private int noAppenderWarning;
    private boolean packagingDataEnabled;
    int resetCount;
    final ch.qos.logback.classic.Logger root = new ch.qos.logback.classic.Logger("ROOT", null, this);
    private int size;
    boolean started;
    private final TurboFilterList turboFilterList = new TurboFilterList();

    public LoggerContext()
    {
        noAppenderWarning = 0;
        packagingDataEnabled = true;
        maxCallerDataDepth = 8;
        started = false;
        resetCount = 0;
        loggerCache = new ConcurrentHashMap();
        loggerContextRemoteView = new LoggerContextVO(this);
        root.setLevel(Level.DEBUG);
        loggerCache.put("ROOT", root);
        initEvaluatorMap();
        size = 1;
        frameworkPackages = new ArrayList();
    }

    private void fireOnReset()
    {
        for (Iterator iterator = loggerContextListenerList.iterator(); iterator.hasNext(); ((LoggerContextListener)iterator.next()).onReset(this)) { }
    }

    private void fireOnStart()
    {
        for (Iterator iterator = loggerContextListenerList.iterator(); iterator.hasNext(); ((LoggerContextListener)iterator.next()).onStart(this)) { }
    }

    private void fireOnStop()
    {
        for (Iterator iterator = loggerContextListenerList.iterator(); iterator.hasNext(); ((LoggerContextListener)iterator.next()).onStop(this)) { }
    }

    private void incSize()
    {
        size = size + 1;
    }

    private void resetAllListeners()
    {
        loggerContextListenerList.clear();
    }

    private void resetListenersExceptResetResistant()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = loggerContextListenerList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LoggerContextListener loggercontextlistener = (LoggerContextListener)iterator.next();
            if (loggercontextlistener.isResetResistant())
            {
                arraylist.add(loggercontextlistener);
            }
        } while (true);
        loggerContextListenerList.retainAll(arraylist);
    }

    private void resetStatusListeners()
    {
        StatusManager statusmanager = getStatusManager();
        for (Iterator iterator = statusmanager.getCopyOfStatusListenerList().iterator(); iterator.hasNext(); statusmanager.remove((StatusListener)iterator.next())) { }
    }

    private void syncRemoteView()
    {
        loggerContextRemoteView = new LoggerContextVO(this);
        for (Iterator iterator = loggerCache.values().iterator(); iterator.hasNext(); ((ch.qos.logback.classic.Logger)iterator.next()).buildRemoteView()) { }
    }

    public void addListener(LoggerContextListener loggercontextlistener)
    {
        loggerContextListenerList.add(loggercontextlistener);
    }

    public void addTurboFilter(TurboFilter turbofilter)
    {
        turboFilterList.add(turbofilter);
    }

    void fireOnLevelChange(ch.qos.logback.classic.Logger logger, Level level)
    {
        for (Iterator iterator = loggerContextListenerList.iterator(); iterator.hasNext(); ((LoggerContextListener)iterator.next()).onLevelChange(logger, level)) { }
    }

    public List getFrameworkPackages()
    {
        return frameworkPackages;
    }

    public final ch.qos.logback.classic.Logger getLogger(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("name argument cannot be null");
        }
        if (!"ROOT".equalsIgnoreCase(s)) goto _L2; else goto _L1
_L1:
        ch.qos.logback.classic.Logger logger = root;
_L4:
        return logger;
_L2:
        ch.qos.logback.classic.Logger logger1;
        ch.qos.logback.classic.Logger logger2;
        logger1 = root;
        logger2 = (ch.qos.logback.classic.Logger)loggerCache.get(s);
        logger = logger2;
        if (logger2 != null) goto _L4; else goto _L3
_L3:
        int i = 0;
_L6:
        i = LoggerNameUtil.getSeparatorIndexOf(s, i);
        String s1;
        ch.qos.logback.classic.Logger logger3;
        if (i == -1)
        {
            s1 = s;
        } else
        {
            s1 = s.substring(0, i);
        }
        logger1;
        JVM INSTR monitorenter ;
        logger3 = logger1.getChildByName(s1);
        logger = logger3;
        if (logger3 != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        logger = logger1.createChildByName(s1);
        loggerCache.put(s1, logger);
        incSize();
        logger1;
        JVM INSTR monitorexit ;
        if (i == -1)
        {
            return logger;
        }
        break MISSING_BLOCK_LABEL_147;
        s;
        logger1;
        JVM INSTR monitorexit ;
        throw s;
        i++;
        logger1 = logger;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public volatile Logger getLogger(String s)
    {
        return getLogger(s);
    }

    public LoggerContextVO getLoggerContextRemoteView()
    {
        return loggerContextRemoteView;
    }

    public int getMaxCallerDataDepth()
    {
        return maxCallerDataDepth;
    }

    final FilterReply getTurboFilterChainDecision_0_3OrMore(Marker marker, ch.qos.logback.classic.Logger logger, Level level, String s, Object aobj[], Throwable throwable)
    {
        if (turboFilterList.size() == 0)
        {
            return FilterReply.NEUTRAL;
        } else
        {
            return turboFilterList.getTurboFilterChainDecision(marker, logger, level, s, aobj, throwable);
        }
    }

    final FilterReply getTurboFilterChainDecision_1(Marker marker, ch.qos.logback.classic.Logger logger, Level level, String s, Object obj, Throwable throwable)
    {
        if (turboFilterList.size() == 0)
        {
            return FilterReply.NEUTRAL;
        } else
        {
            return turboFilterList.getTurboFilterChainDecision(marker, logger, level, s, new Object[] {
                obj
            }, throwable);
        }
    }

    final FilterReply getTurboFilterChainDecision_2(Marker marker, ch.qos.logback.classic.Logger logger, Level level, String s, Object obj, Object obj1, Throwable throwable)
    {
        if (turboFilterList.size() == 0)
        {
            return FilterReply.NEUTRAL;
        } else
        {
            return turboFilterList.getTurboFilterChainDecision(marker, logger, level, s, new Object[] {
                obj, obj1
            }, throwable);
        }
    }

    void initEvaluatorMap()
    {
        putObject("EVALUATOR_MAP", new HashMap());
    }

    public boolean isPackagingDataEnabled()
    {
        return packagingDataEnabled;
    }

    public boolean isStarted()
    {
        return started;
    }

    final void noAppenderDefinedWarning(ch.qos.logback.classic.Logger logger)
    {
        int i = noAppenderWarning;
        noAppenderWarning = i + 1;
        if (i == 0)
        {
            getStatusManager().add(new WarnStatus((new StringBuilder()).append("No appenders present in context [").append(getName()).append("] for logger [").append(logger.getName()).append("].").toString(), logger));
        }
    }

    public void putProperty(String s, String s1)
    {
        super.putProperty(s, s1);
        syncRemoteView();
    }

    public void reset()
    {
        resetCount = resetCount + 1;
        super.reset();
        initEvaluatorMap();
        root.recursiveReset();
        resetTurboFilterList();
        fireOnReset();
        resetListenersExceptResetResistant();
        resetStatusListeners();
    }

    public void resetTurboFilterList()
    {
        for (Iterator iterator = turboFilterList.iterator(); iterator.hasNext(); ((TurboFilter)iterator.next()).stop()) { }
        turboFilterList.clear();
    }

    public void setName(String s)
    {
        super.setName(s);
        syncRemoteView();
    }

    public void start()
    {
        started = true;
        fireOnStart();
    }

    public void stop()
    {
        reset();
        fireOnStop();
        resetAllListeners();
        started = false;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("[").append(getName()).append("]").toString();
    }
}
