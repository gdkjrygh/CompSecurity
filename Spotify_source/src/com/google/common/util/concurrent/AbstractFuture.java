// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import ctz;
import cvm;
import cvn;
import cvo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AbstractFuture
    implements cvo
{

    private final cvm executionList = new cvm();
    private final Sync sync = new Sync();

    protected AbstractFuture()
    {
    }

    static final CancellationException cancellationExceptionWithCause(String s, Throwable throwable)
    {
        s = new CancellationException(s);
        s.initCause(throwable);
        return s;
    }

    public void addListener(Runnable runnable, Executor executor)
    {
        cvm cvm1;
        cvm1 = executionList;
        ctz.a(runnable, "Runnable was null.");
        ctz.a(executor, "Executor was null.");
        cvm1;
        JVM INSTR monitorenter ;
        if (cvm1.b)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        cvm1.a = new cvn(runnable, executor, cvm1.a);
        cvm1;
        JVM INSTR monitorexit ;
        return;
        cvm1;
        JVM INSTR monitorexit ;
        cvm.a(runnable, executor);
        return;
        runnable;
        cvm1;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public boolean cancel(boolean flag)
    {
        Sync sync1 = sync;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 4;
        }
        if (!sync1.a(null, null, byte0))
        {
            return false;
        }
        executionList.a();
        if (flag)
        {
            interruptTask();
        }
        return true;
    }

    public Object get()
    {
        Sync sync1 = sync;
        sync1.acquireSharedInterruptibly(-1);
        return sync1.a();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        Sync sync1 = sync;
        if (!sync1.tryAcquireSharedNanos(-1, timeunit.toNanos(l)))
        {
            throw new TimeoutException("Timeout waiting for task.");
        } else
        {
            return sync1.a();
        }
    }

    protected void interruptTask()
    {
    }

    public boolean isCancelled()
    {
        return sync.c();
    }

    public boolean isDone()
    {
        return sync.b();
    }

    protected boolean set(Object obj)
    {
        boolean flag = sync.a(obj, null, 2);
        if (flag)
        {
            executionList.a();
        }
        return flag;
    }

    protected boolean setException(Throwable throwable)
    {
        boolean flag = sync.a(null, (Throwable)ctz.a(throwable), 2);
        if (flag)
        {
            executionList.a();
        }
        return flag;
    }

    protected final boolean wasInterrupted()
    {
        return sync.d();
    }

    private class Sync extends AbstractQueuedSynchronizer
    {

        private static final long serialVersionUID = 0L;
        private Throwable exception;
        private Object value;

        final Object a()
        {
            int i = getState();
            switch (i)
            {
            default:
                throw new IllegalStateException((new StringBuilder(49)).append("Error, synchronizer in invalid state: ").append(i).toString());

            case 2: // '\002'
                if (exception != null)
                {
                    throw new ExecutionException(exception);
                } else
                {
                    return value;
                }

            case 4: // '\004'
            case 8: // '\b'
                throw AbstractFuture.cancellationExceptionWithCause("Task was cancelled.", exception);
            }
        }

        final boolean a(Object obj, Throwable throwable, int i)
        {
            boolean flag = compareAndSetState(0, 1);
            if (flag)
            {
                value = obj;
                if ((i & 0xc) != 0)
                {
                    throwable = new CancellationException("Future.cancel() was called.");
                }
                exception = throwable;
                releaseShared(i);
            } else
            if (getState() == 1)
            {
                acquireShared(-1);
                return flag;
            }
            return flag;
        }

        final boolean b()
        {
            return (getState() & 0xe) != 0;
        }

        final boolean c()
        {
            return (getState() & 0xc) != 0;
        }

        final boolean d()
        {
            return getState() == 8;
        }

        protected final int tryAcquireShared(int i)
        {
            return !b() ? -1 : 1;
        }

        protected final boolean tryReleaseShared(int i)
        {
            setState(i);
            return true;
        }

        Sync()
        {
        }
    }

}
