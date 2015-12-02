// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

final class b extends AbstractQueuedSynchronizer
{

    private Object a;
    private Throwable b;

    b()
    {
    }

    private boolean a(Object obj, Throwable throwable, int i)
    {
        if (compareAndSetState(0, 1))
        {
            a = obj;
            b = throwable;
            releaseShared(i);
            return true;
        } else
        {
            return false;
        }
    }

    private Object e()
    {
        int i = getState();
        switch (i)
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Error, synchronizer in invalid state: ").append(i).toString());

        case 2: // '\002'
            if (b != null)
            {
                throw new ExecutionException(b);
            } else
            {
                return a;
            }

        case 4: // '\004'
            throw new CancellationException("Task was cancelled.");
        }
    }

    Object a()
    {
        acquireSharedInterruptibly(-1);
        return e();
    }

    Object a(long l)
    {
        if (!tryAcquireSharedNanos(-1, l))
        {
            throw new TimeoutException("Timeout waiting for task.");
        } else
        {
            return e();
        }
    }

    boolean a(Object obj)
    {
        return a(obj, null, 2);
    }

    boolean a(Throwable throwable)
    {
        return a(null, throwable, 2);
    }

    boolean b()
    {
        return (getState() & 6) != 0;
    }

    boolean c()
    {
        return getState() == 4;
    }

    boolean d()
    {
        return a(null, null, 4);
    }

    protected int tryAcquireShared(int i)
    {
        return !b() ? -1 : 1;
    }

    protected boolean tryReleaseShared(int i)
    {
        setState(i);
        return true;
    }
}
