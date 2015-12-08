// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            a, f, i, g, 
//            Priority

public class e extends FutureTask
    implements a, f, i
{

    final Object b;

    public e(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        b = b(runnable);
    }

    public e(Callable callable)
    {
        super(callable);
        b = b(callable);
    }

    private static a b(Object obj)
    {
        if (io.fabric.sdk.android.services.concurrency.g.b(obj))
        {
            return (a)obj;
        } else
        {
            return new g();
        }
    }

    public final Priority a()
    {
        return ((f)b()).a();
    }

    public final void a(Object obj)
    {
        obj = (i)obj;
        ((a)(f)b()).a(obj);
    }

    public final void a(Throwable throwable)
    {
        ((i)(f)b()).a(throwable);
    }

    public final void a(boolean flag)
    {
        ((i)(f)b()).a(flag);
    }

    public a b()
    {
        return (a)b;
    }

    public int compareTo(Object obj)
    {
        return ((f)b()).compareTo(obj);
    }

    public final Collection f()
    {
        return ((a)(f)b()).f();
    }

    public final boolean g()
    {
        return ((a)(f)b()).g();
    }

    public final boolean h()
    {
        return ((i)(f)b()).h();
    }
}
