// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import fs.ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import fs.ch.qos.logback.core.spi.FilterReply;
import fs.ch.qos.logback.core.status.StatusChecker;
import fs.org.slf4j.Marker;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package ch.qos.logback.classic.turbo:
//            TurboFilter

public class ReconfigureOnChangeFilter extends TurboFilter
{
    class ReconfiguringThread
        implements Runnable
    {

        final ReconfigureOnChangeFilter this$0;

        private void fallbackConfiguration(LoggerContext loggercontext, List list, URL url)
        {
            JoranConfigurator joranconfigurator = new JoranConfigurator();
            joranconfigurator.setContext(
// JavaClassFileOutputException: get_constant: invalid tag

        private void performXMLConfiguration(LoggerContext loggercontext)
        {
            JoranConfigurator joranconfigurator = new JoranConfigurator();
            joranconfigurator.setContext(
// JavaClassFileOutputException: get_constant: invalid tag

        public void run()
        {
            if (mainConfigurationURL == null)
            {
                addInfo("Due to missing top level configuration file, skipping reconfiguration");
            } else
            {
                LoggerContext loggercontext = (LoggerContext)
// JavaClassFileOutputException: get_constant: invalid tag

        ReconfiguringThread()
        {
            this$0 = ReconfigureOnChangeFilter.this;
            super();
        }
    }


    ConfigurationWatchList configurationWatchList;
    private long invocationCounter;
    private volatile long lastMaskCheck;
    URL mainConfigurationURL;
    private volatile long mask;
    protected volatile long nextCheck;
    long refreshPeriod;

    public ReconfigureOnChangeFilter()
    {
        refreshPeriod = 60000L;
        invocationCounter = 0L;
        mask = 15L;
        lastMaskCheck = System.currentTimeMillis();
    }

    private void detachReconfigurationToNewThread()
    {
        addInfo((new StringBuilder()).append("Detected change in [").append(configurationWatchList.getCopyOfFileWatchList()).append("]").toString());
        context.getExecutorService().submit(new ReconfiguringThread());
    }

    private void updateMaskIfNecessary(long l)
    {
        long l1 = l - lastMaskCheck;
        lastMaskCheck = l;
        if (l1 < 100L && mask < 65535L)
        {
            mask = mask << 1 | 1L;
        } else
        if (l1 > 800L)
        {
            mask = mask >>> 2;
            return;
        }
    }

    protected boolean changeDetected(long l)
    {
        if (l >= nextCheck)
        {
            updateNextCheck(l);
            return configurationWatchList.changeDetected();
        } else
        {
            return false;
        }
    }

    public FilterReply decide(Marker marker, Logger logger, Level level, String s, Object aobj[], Throwable throwable)
    {
        if (!isStarted())
        {
            return FilterReply.NEUTRAL;
        }
        long l = invocationCounter;
        invocationCounter = 1L + l;
        if ((l & mask) != mask)
        {
            return FilterReply.NEUTRAL;
        }
        l = System.currentTimeMillis();
        synchronized (configurationWatchList)
        {
            updateMaskIfNecessary(l);
            if (changeDetected(l))
            {
                disableSubsequentReconfiguration();
                detachReconfigurationToNewThread();
            }
        }
        return FilterReply.NEUTRAL;
        logger;
        marker;
        JVM INSTR monitorexit ;
        throw logger;
    }

    void disableSubsequentReconfiguration()
    {
        nextCheck = 0x7fffffffffffffffL;
    }

    public void setRefreshPeriod(long l)
    {
        refreshPeriod = l;
    }

    public void start()
    {
        configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(context);
        if (configurationWatchList != null)
        {
            mainConfigurationURL = configurationWatchList.getMainURL();
            List list = configurationWatchList.getCopyOfFileWatchList();
            long l = refreshPeriod / 1000L;
            addInfo((new StringBuilder()).append("Will scan for changes in [").append(list).append("] every ").append(l).append(" seconds. ").toString());
            synchronized (configurationWatchList)
            {
                updateNextCheck(System.currentTimeMillis());
            }
            start();
            return;
        } else
        {
            addWarn("Empty ConfigurationWatchList in context");
            return;
        }
        exception;
        configurationwatchlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ReconfigureOnChangeFilter{invocationCounter=").append(invocationCounter).append('}').toString();
    }

    void updateNextCheck(long l)
    {
        nextCheck = refreshPeriod + l;
    }







}
