// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import io.fabric.sdk.android.services.concurrency.Priority;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class gzw extends FutureTask
    implements gzr, gzx, hab
{

    private Object a;

    public gzw(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        a = b(runnable);
    }

    public gzw(Callable callable)
    {
        super(callable);
        a = b(callable);
    }

    private static gzr b(Object obj)
    {
        if (gzy.b(obj))
        {
            return (gzr)obj;
        } else
        {
            return new gzy();
        }
    }

    public final Priority a()
    {
        return ((gzx)b()).a();
    }

    public final void a(Object obj)
    {
        obj = (hab)obj;
        ((gzr)(gzx)b()).a(obj);
    }

    public final void a(Throwable throwable)
    {
        ((hab)(gzx)b()).a(throwable);
    }

    public final void a(boolean flag)
    {
        ((hab)(gzx)b()).a(flag);
    }

    public gzr b()
    {
        return (gzr)a;
    }

    public int compareTo(Object obj)
    {
        return ((gzx)b()).compareTo(obj);
    }

    public final Collection f()
    {
        return ((gzr)(gzx)b()).f();
    }

    public final boolean g()
    {
        return ((gzr)(gzx)b()).g();
    }

    public final boolean h()
    {
        return ((hab)(gzx)b()).h();
    }
}
