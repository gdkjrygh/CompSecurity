// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

// Referenced classes of package a.a.a.a.a.c:
//            l, u, y, v

public class t extends FutureTask
    implements l, u, y
{

    final Object b;

    public t(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        b = b(runnable);
    }

    public t(Callable callable)
    {
        super(callable);
        b = b(callable);
    }

    private static l b(Object obj)
    {
        if (v.b(obj))
        {
            return (l)obj;
        } else
        {
            return new v();
        }
    }

    public final int a()
    {
        return ((u)b()).a();
    }

    public final void a(Object obj)
    {
        obj = (y)obj;
        ((l)(u)b()).a(obj);
    }

    public final void a(Throwable throwable)
    {
        ((y)(u)b()).a(throwable);
    }

    public final void a(boolean flag)
    {
        ((y)(u)b()).a(flag);
    }

    public l b()
    {
        return (l)b;
    }

    public int compareTo(Object obj)
    {
        return ((u)b()).compareTo(obj);
    }

    public final Collection f()
    {
        return ((l)(u)b()).f();
    }

    public final boolean g()
    {
        return ((l)(u)b()).g();
    }

    public final boolean j()
    {
        return ((y)(u)b()).j();
    }
}
