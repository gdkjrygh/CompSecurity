// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture

final class  extends AbstractQueuedSynchronizer
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

    ()
    {
    }
}
