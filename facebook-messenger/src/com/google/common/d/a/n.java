// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.common.d.a:
//            a, s, ad, o, 
//            w, j

class n extends a
    implements Runnable
{

    private Function a;
    private s b;
    private volatile s c;
    private final BlockingQueue d;
    private final CountDownLatch e;

    private n(Function function, s s1)
    {
        d = new LinkedBlockingQueue(1);
        e = new CountDownLatch(1);
        a = (Function)Preconditions.checkNotNull(function);
        b = (s)Preconditions.checkNotNull(s1);
    }

    n(Function function, s s1, j j)
    {
        this(function, s1);
    }

    static s a(n n1, s s1)
    {
        n1.c = s1;
        return s1;
    }

    private void a(Future future, boolean flag)
    {
        if (future != null)
        {
            future.cancel(flag);
        }
    }

    public boolean cancel(boolean flag)
    {
        if (super.cancel(flag))
        {
            ad.a(d, Boolean.valueOf(flag));
            a(b, flag);
            a(c, flag);
            return true;
        } else
        {
            return false;
        }
    }

    public Object get()
    {
        if (!isDone())
        {
            s s1 = b;
            if (s1 != null)
            {
                s1.get();
            }
            e.await();
            s1 = c;
            if (s1 != null)
            {
                s1.get();
            }
        }
        return super.get();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        long l1 = l;
        TimeUnit timeunit2 = timeunit;
        if (!isDone())
        {
            l1 = l;
            TimeUnit timeunit1 = timeunit;
            if (timeunit != TimeUnit.NANOSECONDS)
            {
                l1 = TimeUnit.NANOSECONDS.convert(l, timeunit);
                timeunit1 = TimeUnit.NANOSECONDS;
            }
            timeunit = b;
            l = l1;
            if (timeunit != null)
            {
                l = System.nanoTime();
                timeunit.get(l1, timeunit1);
                l = l1 - Math.max(0L, System.nanoTime() - l);
            }
            l1 = System.nanoTime();
            if (!e.await(l, timeunit1))
            {
                throw new TimeoutException();
            }
            l -= Math.max(0L, System.nanoTime() - l1);
            timeunit = c;
            l1 = l;
            timeunit2 = timeunit1;
            if (timeunit != null)
            {
                timeunit.get(l, timeunit1);
                timeunit2 = timeunit1;
                l1 = l;
            }
        }
        return super.get(l1, timeunit2);
    }

    public void run()
    {
        Object obj = ad.a(b);
        obj = (s)a.apply(obj);
        c = ((s) (obj));
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_130;
        }
        ((s) (obj)).cancel(((Boolean)ad.a(d)).booleanValue());
        c = null;
        a = null;
        b = null;
        e.countDown();
        return;
        obj;
        cancel(false);
        a = null;
        b = null;
        e.countDown();
        return;
        obj;
        a_(((ExecutionException) (obj)).getCause());
        a = null;
        b = null;
        e.countDown();
        return;
        ((s) (obj)).a(new o(this, ((s) (obj))), w.a());
        a = null;
        b = null;
        e.countDown();
        return;
        Object obj1;
        obj1;
        a_(((UndeclaredThrowableException) (obj1)).getCause());
        a = null;
        b = null;
        e.countDown();
        return;
        obj1;
        a_(((Throwable) (obj1)));
        a = null;
        b = null;
        e.countDown();
        return;
        obj1;
        a_(((Throwable) (obj1)));
        a = null;
        b = null;
        e.countDown();
        return;
        obj1;
        a = null;
        b = null;
        e.countDown();
        throw obj1;
    }
}
