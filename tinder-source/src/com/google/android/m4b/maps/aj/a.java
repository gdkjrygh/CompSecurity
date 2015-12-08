// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import com.google.android.m4b.maps.y.j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

// Referenced classes of package com.google.android.m4b.maps.aj:
//            f, d

public class com.google.android.m4b.maps.aj.a
    implements f
{
    static final class a extends AbstractQueuedSynchronizer
    {

        private static final long serialVersionUID = 0L;
        private Object a;
        private Throwable b;

        final Object a()
        {
            int i = getState();
            switch (i)
            {
            default:
                throw new IllegalStateException((new StringBuilder("Error, synchronizer in invalid state: ")).append(i).toString());

            case 2: // '\002'
                if (b != null)
                {
                    throw new ExecutionException(b);
                } else
                {
                    return a;
                }

            case 4: // '\004'
            case 8: // '\b'
                throw com.google.android.m4b.maps.aj.a.a("Task was cancelled.", b);
            }
        }

        final boolean a(Object obj, Throwable throwable, int i)
        {
            boolean flag = compareAndSetState(0, 1);
            if (flag)
            {
                a = obj;
                if ((i & 0xc) != 0)
                {
                    throwable = new CancellationException("Future.cancel() was called.");
                }
                b = throwable;
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

        a()
        {
        }
    }


    final a a = new a();
    private final d b = new d();

    protected com.google.android.m4b.maps.aj.a()
    {
    }

    static final CancellationException a(String s, Throwable throwable)
    {
        s = new CancellationException(s);
        s.initCause(throwable);
        return s;
    }

    public final void a(Runnable runnable, Executor executor)
    {
        b.a(runnable, executor);
    }

    protected boolean a(Object obj)
    {
        boolean flag = a.a(obj, null, 2);
        if (flag)
        {
            b.a();
        }
        return flag;
    }

    protected boolean a(Throwable throwable)
    {
        boolean flag = a.a(null, (Throwable)j.a(throwable), 2);
        if (flag)
        {
            b.a();
        }
        return flag;
    }

    public boolean cancel(boolean flag)
    {
        a a1 = a;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 4;
        }
        if (!a1.a(null, null, byte0))
        {
            return false;
        } else
        {
            b.a();
            return true;
        }
    }

    public Object get()
    {
        a a1 = a;
        a1.acquireSharedInterruptibly(-1);
        return a1.a();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        a a1 = a;
        if (!a1.tryAcquireSharedNanos(-1, timeunit.toNanos(l)))
        {
            throw new TimeoutException("Timeout waiting for task.");
        } else
        {
            return a1.a();
        }
    }

    public boolean isCancelled()
    {
        return a.c();
    }

    public boolean isDone()
    {
        return a.b();
    }
}
