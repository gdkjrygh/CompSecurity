// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

// Referenced classes of package com.google.common.util.concurrent:
//            ListenableFuture, ExecutionList

public abstract class AbstractFuture
    implements ListenableFuture
{
    static final class Sync extends AbstractQueuedSynchronizer
    {

        private Throwable exception;
        private Object value;

        private boolean complete(Object obj, Throwable throwable, int i)
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

        private Object getValue()
            throws CancellationException, ExecutionException
        {
            int i = getState();
            switch (i)
            {
            default:
                throw new IllegalStateException((new StringBuilder("Error, synchronizer in invalid state: ")).append(i).toString());

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

        final boolean cancel(boolean flag)
        {
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 4;
            }
            return complete(null, null, byte0);
        }

        final Object get()
            throws CancellationException, ExecutionException, InterruptedException
        {
            acquireSharedInterruptibly(-1);
            return getValue();
        }

        final Object get(long l)
            throws TimeoutException, CancellationException, ExecutionException, InterruptedException
        {
            if (!tryAcquireSharedNanos(-1, l))
            {
                throw new TimeoutException("Timeout waiting for task.");
            } else
            {
                return getValue();
            }
        }

        final boolean isCancelled()
        {
            return (getState() & 0xc) != 0;
        }

        final boolean isDone()
        {
            return (getState() & 0xe) != 0;
        }

        final boolean set(Object obj)
        {
            return complete(obj, null, 2);
        }

        final boolean setException(Throwable throwable)
        {
            return complete(null, throwable, 2);
        }

        protected final int tryAcquireShared(int i)
        {
            return !isDone() ? -1 : 1;
        }

        protected final boolean tryReleaseShared(int i)
        {
            setState(i);
            return true;
        }

        final boolean wasInterrupted()
        {
            return getState() == 8;
        }

        Sync()
        {
        }
    }


    private final ExecutionList executionList = new ExecutionList();
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

    public final void addListener(Runnable runnable, Executor executor)
    {
        executionList.add(runnable, executor);
    }

    public boolean cancel(boolean flag)
    {
        if (!sync.cancel(flag))
        {
            return false;
        } else
        {
            executionList.execute();
            return true;
        }
    }

    public Object get()
        throws InterruptedException, ExecutionException
    {
        return sync.get();
    }

    public Object get(long l, TimeUnit timeunit)
        throws InterruptedException, TimeoutException, ExecutionException
    {
        return sync.get(timeunit.toNanos(l));
    }

    public boolean isCancelled()
    {
        return sync.isCancelled();
    }

    public boolean isDone()
    {
        return sync.isDone();
    }

    protected boolean set(Object obj)
    {
        boolean flag = sync.set(obj);
        if (flag)
        {
            executionList.execute();
        }
        return flag;
    }

    protected boolean setException(Throwable throwable)
    {
        boolean flag = sync.setException((Throwable)Preconditions.checkNotNull(throwable));
        if (flag)
        {
            executionList.execute();
        }
        return flag;
    }

    protected final boolean wasInterrupted()
    {
        return sync.wasInterrupted();
    }
}
