// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

// Referenced classes of package com.roidapp.baselib.c:
//            ak

final class am extends AbstractQueuedSynchronizer
    implements Runnable
{

    final Thread a;
    Runnable b;
    volatile long c;
    final ak d;

    am(ak ak1, Runnable runnable)
    {
        d = ak1;
        super();
        b = runnable;
        a = ak1.a().newThread(this);
    }

    public final boolean a()
    {
        return tryAcquire(1);
    }

    public final boolean b()
    {
        return isHeldExclusively();
    }

    protected final boolean isHeldExclusively()
    {
        return getState() == 1;
    }

    public final void run()
    {
        d.a(this);
    }

    protected final boolean tryAcquire(int i)
    {
        if (compareAndSetState(0, 1))
        {
            setExclusiveOwnerThread(Thread.currentThread());
            return true;
        } else
        {
            return false;
        }
    }

    protected final boolean tryRelease(int i)
    {
        setExclusiveOwnerThread(null);
        setState(0);
        return true;
    }
}
