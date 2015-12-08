// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

final class aa
{

    private final int a;
    private final int b;
    private final List c;
    private final ReentrantLock d = new ReentrantLock();
    private final Condition e;
    private int f;
    private int g;
    private boolean h;

    public aa(Set set)
    {
        u.a(set);
        boolean flag;
        if (!set.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag);
        e = d.newCondition();
        b = set.size();
        if (b > 10)
        {
            throw new IllegalArgumentException("PrimingBarrier does not support more than 10 specified threads");
        } else
        {
            a = (1 << b + 1) - 1;
            c = new ArrayList(set);
            return;
        }
    }

    private int a(long l)
    {
        int j = c.indexOf(Long.valueOf(l));
        int i = j;
        if (j < 0)
        {
            i = b;
        }
        return 1 << i;
    }

    private boolean b(Thread thread)
    {
        return (f & a(thread.getId())) != 0;
    }

    public final void a(Thread thread)
    {
        u.a(thread);
        d.lock();
        int i = a(thread.getId());
        f = f & ~i;
        g = ~i & g;
        e.signalAll();
        d.unlock();
        return;
        thread;
        d.unlock();
        throw thread;
    }

    public final boolean a()
        throws InterruptedException
    {
        d.lock();
        if (h)
        {
            throw new IllegalStateException("Tried to await a barrier that has already passed.");
        }
        break MISSING_BLOCK_LABEL_34;
        Object obj;
        obj;
        d.unlock();
        throw obj;
        Thread thread;
        if (Thread.interrupted())
        {
            a(Thread.currentThread());
            throw new InterruptedException();
        }
        thread = Thread.currentThread();
        if (!b(thread)) goto _L2; else goto _L1
_L1:
        int i = 1;
_L12:
        if (i == 0) goto _L4; else goto _L3
_L3:
        thread = Thread.currentThread();
        if ((g & a(thread.getId())) == 0) goto _L6; else goto _L5
_L5:
        i = 1;
_L10:
        if (i == 0) goto _L8; else goto _L7
_L7:
        if (c.indexOf(Long.valueOf(Thread.currentThread().getId())) >= 0)
        {
            throw new IllegalStateException("PrimingBarrier thinks current thread is already awaiting.");
        }
          goto _L9
_L2:
        i = f;
        f = a(thread.getId()) | i;
        i = 0;
        continue; /* Loop/switch isn't completed */
_L6:
        i = g;
        g = a(thread.getId()) | i;
        i = 0;
          goto _L10
_L9:
        throw new IllegalStateException("Multiple threads called shutdown on the Scheduler.");
_L8:
        boolean flag;
        boolean flag1;
        if (g == a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        flag1 = b(Thread.currentThread());
        if (!flag1)
        {
            d.unlock();
            return false;
        }
        e.await();
        if (Thread.interrupted())
        {
            a(Thread.currentThread());
            throw new InterruptedException();
        }
          goto _L8
        thread;
        a(Thread.currentThread());
        throw thread;
        if (!h)
        {
            h = true;
            e.signalAll();
        }
        d.unlock();
        return true;
_L4:
        d.unlock();
        return false;
        if (true) goto _L12; else goto _L11
_L11:
    }
}
