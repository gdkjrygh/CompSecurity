// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.p;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractFuture, a, t, v, 
//            l

final class k extends AbstractFuture
    implements Runnable
{

    private a a;
    private t c;
    private volatile t d;

    k(a a1, t t1)
    {
        a = (a)p.a(a1);
        c = (t)p.a(t1);
    }

    static t a(k k1)
    {
        k1.d = null;
        return null;
    }

    private static void a(Future future, boolean flag)
    {
        if (future != null)
        {
            future.cancel(flag);
        }
    }

    public final boolean cancel(boolean flag)
    {
        if (super.cancel(flag))
        {
            a(c, flag);
            a(d, flag);
            return true;
        } else
        {
            return false;
        }
    }

    public final void run()
    {
        Object obj = v.a(c);
        obj = (t)p.a(a.a(obj), "AsyncFunction may not return null.");
        d = ((t) (obj));
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        ((t) (obj)).cancel(super.b.wasInterrupted());
        d = null;
        a = null;
        c = null;
        return;
        obj;
        cancel(false);
        a = null;
        c = null;
        return;
        obj;
        a(((ExecutionException) (obj)).getCause());
        a = null;
        c = null;
        return;
        ((t) (obj)).a(new l(this, ((t) (obj))), MoreExecutors.DirectExecutor.INSTANCE);
        a = null;
        c = null;
        return;
        Object obj1;
        obj1;
        a(((UndeclaredThrowableException) (obj1)).getCause());
        a = null;
        c = null;
        return;
        obj1;
        a(((Throwable) (obj1)));
        a = null;
        c = null;
        return;
        obj1;
        a = null;
        c = null;
        throw obj1;
    }
}
