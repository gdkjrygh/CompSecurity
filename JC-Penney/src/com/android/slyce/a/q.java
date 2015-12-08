// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.android.slyce.a:
//            bo

public class q
{

    Semaphore a;

    public q()
    {
        a = new Semaphore(0);
    }

    public void a()
    {
        bo bo1;
        q q1;
        Semaphore semaphore;
        bo1 = bo.a(Thread.currentThread());
        q1 = bo1.a;
        bo1.a = this;
        semaphore = bo1.b;
        boolean flag = a.tryAcquire();
        if (flag)
        {
            bo1.a = q1;
            return;
        }
          goto _L1
_L3:
        Runnable runnable;
        runnable.run();
_L1:
        if ((runnable = bo1.a()) != null) goto _L3; else goto _L2
_L2:
        semaphore.acquire(Math.max(1, semaphore.availablePermits()));
        flag = a.tryAcquire();
        if (!flag) goto _L1; else goto _L4
_L4:
        bo1.a = q1;
        return;
        Exception exception;
        exception;
        bo1.a = q1;
        throw exception;
    }

    public boolean a(long l, TimeUnit timeunit)
    {
        q q1;
        Semaphore semaphore;
        l = TimeUnit.MILLISECONDS.convert(l, timeunit);
        timeunit = bo.a(Thread.currentThread());
        q1 = ((bo) (timeunit)).a;
        timeunit.a = this;
        semaphore = ((bo) (timeunit)).b;
        boolean flag = a.tryAcquire();
        if (flag)
        {
            timeunit.a = q1;
            return true;
        }
        long l1 = System.currentTimeMillis();
_L1:
        Runnable runnable = timeunit.a();
        if (runnable != null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        flag = semaphore.tryAcquire(Math.max(1, semaphore.availablePermits()), l, TimeUnit.MILLISECONDS);
        if (!flag)
        {
            timeunit.a = q1;
            return false;
        }
        break MISSING_BLOCK_LABEL_125;
        runnable.run();
          goto _L1
        Exception exception;
        exception;
        timeunit.a = q1;
        throw exception;
        flag = a.tryAcquire();
        if (flag)
        {
            timeunit.a = q1;
            return true;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - l1 >= l)
        {
            timeunit.a = q1;
            return false;
        }
          goto _L1
    }

    public void b()
    {
        a.release();
        bo.a(this);
    }
}
