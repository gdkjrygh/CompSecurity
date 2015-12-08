// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class BasicThreadFactory
    implements ThreadFactory
{
    public static class Builder
        implements org.apache.commons.lang3.builder.Builder
    {

        private Boolean daemonFlag;
        private Thread.UncaughtExceptionHandler exceptionHandler;
        private String namingPattern;
        private Integer priority;
        private ThreadFactory wrappedFactory;

        public volatile Object build()
        {
            return build();
        }

        public BasicThreadFactory build()
        {
            BasicThreadFactory basicthreadfactory = new BasicThreadFactory(this);
            reset();
            return basicthreadfactory;
        }

        public Builder daemon(boolean flag)
        {
            daemonFlag = Boolean.valueOf(flag);
            return this;
        }

        public Builder namingPattern(String s)
        {
            if (s == null)
            {
                throw new NullPointerException("Naming pattern must not be null!");
            } else
            {
                namingPattern = s;
                return this;
            }
        }

        public Builder priority(int i)
        {
            priority = Integer.valueOf(i);
            return this;
        }

        public void reset()
        {
            wrappedFactory = null;
            exceptionHandler = null;
            namingPattern = null;
            priority = null;
            daemonFlag = null;
        }

        public Builder uncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
        {
            if (uncaughtexceptionhandler == null)
            {
                throw new NullPointerException("Uncaught exception handler must not be null!");
            } else
            {
                exceptionHandler = uncaughtexceptionhandler;
                return this;
            }
        }

        public Builder wrappedFactory(ThreadFactory threadfactory)
        {
            if (threadfactory == null)
            {
                throw new NullPointerException("Wrapped ThreadFactory must not be null!");
            } else
            {
                wrappedFactory = threadfactory;
                return this;
            }
        }






        public Builder()
        {
        }
    }


    private final Boolean daemonFlag;
    private final String namingPattern;
    private final Integer priority;
    private final AtomicLong threadCounter;
    private final Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
    private final ThreadFactory wrappedFactory;

    private BasicThreadFactory(Builder builder)
    {
        if (builder.wrappedFactory == null)
        {
            wrappedFactory = Executors.defaultThreadFactory();
        } else
        {
            wrappedFactory = builder.wrappedFactory;
        }
        namingPattern = builder.namingPattern;
        priority = builder.priority;
        daemonFlag = builder.daemonFlag;
        uncaughtExceptionHandler = builder.exceptionHandler;
        threadCounter = new AtomicLong();
    }


    private void initializeThread(Thread thread)
    {
        if (getNamingPattern() != null)
        {
            long l = threadCounter.incrementAndGet();
            thread.setName(String.format(getNamingPattern(), new Object[] {
                Long.valueOf(l)
            }));
        }
        if (getUncaughtExceptionHandler() != null)
        {
            thread.setUncaughtExceptionHandler(getUncaughtExceptionHandler());
        }
        if (getPriority() != null)
        {
            thread.setPriority(getPriority().intValue());
        }
        if (getDaemonFlag() != null)
        {
            thread.setDaemon(getDaemonFlag().booleanValue());
        }
    }

    public final Boolean getDaemonFlag()
    {
        return daemonFlag;
    }

    public final String getNamingPattern()
    {
        return namingPattern;
    }

    public final Integer getPriority()
    {
        return priority;
    }

    public long getThreadCount()
    {
        return threadCounter.get();
    }

    public final Thread.UncaughtExceptionHandler getUncaughtExceptionHandler()
    {
        return uncaughtExceptionHandler;
    }

    public final ThreadFactory getWrappedFactory()
    {
        return wrappedFactory;
    }

    public Thread newThread(Runnable runnable)
    {
        runnable = getWrappedFactory().newThread(runnable);
        initializeThread(runnable);
        return runnable;
    }
}
