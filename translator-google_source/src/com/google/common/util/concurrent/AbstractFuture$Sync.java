// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture

final class  extends AbstractQueuedSynchronizer
{

    static final int CANCELLED = 4;
    static final int COMPLETED = 2;
    static final int COMPLETING = 1;
    static final int INTERRUPTED = 8;
    static final int RUNNING = 0;
    private static final long serialVersionUID = 0L;
    private Throwable exception;
    private Object value;

    private Object a()
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
            throw AbstractFuture.a("Task was cancelled.", exception);
        }
    }

    private boolean a(Object obj, Throwable throwable, int i)
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
        return a(null, null, byte0);
    }

    final Object get()
    {
        acquireSharedInterruptibly(-1);
        return a();
    }

    final Object get(long l)
    {
        if (!tryAcquireSharedNanos(-1, l))
        {
            throw new TimeoutException("Timeout waiting for task.");
        } else
        {
            return a();
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
        return a(obj, null, 2);
    }

    final boolean setException(Throwable throwable)
    {
        return a(null, throwable, 2);
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

    ()
    {
    }
}
