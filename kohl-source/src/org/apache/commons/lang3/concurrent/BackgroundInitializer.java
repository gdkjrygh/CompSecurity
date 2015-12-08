// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Referenced classes of package org.apache.commons.lang3.concurrent:
//            ConcurrentInitializer, ConcurrentException, ConcurrentUtils

public abstract class BackgroundInitializer
    implements ConcurrentInitializer
{
    private class InitializationTask
        implements Callable
    {

        private final ExecutorService execFinally;
        final BackgroundInitializer this$0;

        public Object call()
            throws Exception
        {
            Object obj = initialize();
            if (execFinally != null)
            {
                execFinally.shutdown();
            }
            return obj;
            Exception exception;
            exception;
            if (execFinally != null)
            {
                execFinally.shutdown();
            }
            throw exception;
        }

        public InitializationTask(ExecutorService executorservice)
        {
            this$0 = BackgroundInitializer.this;
            super();
            execFinally = executorservice;
        }
    }


    private ExecutorService executor;
    private ExecutorService externalExecutor;
    private Future future;

    protected BackgroundInitializer()
    {
        this(null);
    }

    protected BackgroundInitializer(ExecutorService executorservice)
    {
        setExternalExecutor(executorservice);
    }

    private ExecutorService createExecutor()
    {
        return Executors.newFixedThreadPool(getTaskCount());
    }

    private Callable createTask(ExecutorService executorservice)
    {
        return new InitializationTask(executorservice);
    }

    public Object get()
        throws ConcurrentException
    {
        Object obj;
        try
        {
            obj = getFuture().get();
        }
        catch (ExecutionException executionexception)
        {
            ConcurrentUtils.handleCause(executionexception);
            return null;
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
            throw new ConcurrentException(interruptedexception);
        }
        return obj;
    }

    protected final ExecutorService getActiveExecutor()
    {
        this;
        JVM INSTR monitorenter ;
        ExecutorService executorservice = executor;
        this;
        JVM INSTR monitorexit ;
        return executorservice;
        Exception exception;
        exception;
        throw exception;
    }

    public final ExecutorService getExternalExecutor()
    {
        this;
        JVM INSTR monitorenter ;
        ExecutorService executorservice = externalExecutor;
        this;
        JVM INSTR monitorexit ;
        return executorservice;
        Exception exception;
        exception;
        throw exception;
    }

    public Future getFuture()
    {
        this;
        JVM INSTR monitorenter ;
        if (future == null)
        {
            throw new IllegalStateException("start() must be called first!");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Future future1 = future;
        this;
        JVM INSTR monitorexit ;
        return future1;
    }

    protected int getTaskCount()
    {
        return 1;
    }

    protected abstract Object initialize()
        throws Exception;

    public boolean isStarted()
    {
        this;
        JVM INSTR monitorenter ;
        Future future1 = future;
        boolean flag;
        if (future1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public final void setExternalExecutor(ExecutorService executorservice)
    {
        this;
        JVM INSTR monitorenter ;
        if (isStarted())
        {
            throw new IllegalStateException("Cannot set ExecutorService after start()!");
        }
        break MISSING_BLOCK_LABEL_24;
        executorservice;
        this;
        JVM INSTR monitorexit ;
        throw executorservice;
        externalExecutor = executorservice;
        this;
        JVM INSTR monitorexit ;
    }

    public boolean start()
    {
        this;
        JVM INSTR monitorenter ;
        if (isStarted()) goto _L2; else goto _L1
_L1:
        executor = getExternalExecutor();
        if (executor != null) goto _L4; else goto _L3
_L3:
        ExecutorService executorservice;
        executorservice = createExecutor();
        executor = executorservice;
_L5:
        future = executor.submit(createTask(executorservice));
        boolean flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        executorservice = null;
          goto _L5
_L2:
        flag = false;
          goto _L6
        Exception exception;
        exception;
        throw exception;
          goto _L5
    }
}
