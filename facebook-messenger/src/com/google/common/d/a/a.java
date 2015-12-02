// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.d.a:
//            s, b, d

public abstract class a
    implements s
{

    private final b a = new b();
    private final d b = new d();

    public a()
    {
    }

    public void a(Runnable runnable, Executor executor)
    {
        b.a(runnable, executor);
    }

    protected boolean a_(Object obj)
    {
        boolean flag = a.a(obj);
        if (flag)
        {
            d();
        }
        return flag;
    }

    protected boolean a_(Throwable throwable)
    {
        boolean flag = a.a((Throwable)Preconditions.checkNotNull(throwable));
        if (flag)
        {
            d();
        }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        } else
        {
            return flag;
        }
    }

    protected void c()
    {
    }

    public boolean cancel(boolean flag)
    {
        if (!a.d())
        {
            return false;
        }
        d();
        if (flag)
        {
            c();
        }
        return true;
    }

    protected void d()
    {
        b.a();
    }

    public Object get()
    {
        return a.a();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return a.a(timeunit.toNanos(l));
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
