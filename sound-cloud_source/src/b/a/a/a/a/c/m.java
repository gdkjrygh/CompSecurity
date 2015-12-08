// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package b.a.a.a.a.c:
//            f, n, q, o

public class m extends FutureTask
    implements f, n, q
{

    final Object b;

    public m(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        b = b(runnable);
    }

    public m(Callable callable)
    {
        super(callable);
        b = b(callable);
    }

    private static f b(Object obj)
    {
        if (o.b(obj))
        {
            return (f)obj;
        } else
        {
            return new o();
        }
    }

    public final int a()
    {
        return ((n)b()).a();
    }

    public final void a(Object obj)
    {
        obj = (q)obj;
        ((f)(n)b()).a(obj);
    }

    public final void a(Throwable throwable)
    {
        ((q)(n)b()).a(throwable);
    }

    public final void a(boolean flag)
    {
        ((q)(n)b()).a(flag);
    }

    public f b()
    {
        return (f)b;
    }

    public int compareTo(Object obj)
    {
        return ((n)b()).compareTo(obj);
    }

    public final Collection f()
    {
        return ((f)(n)b()).f();
    }

    public final boolean g()
    {
        return ((f)(n)b()).g();
    }

    public final boolean h()
    {
        return ((q)(n)b()).h();
    }
}
