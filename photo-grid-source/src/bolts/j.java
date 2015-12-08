// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

// Referenced classes of package bolts:
//            f, a, m, q, 
//            n, p, k, i, 
//            o

public final class j
{

    public static final ExecutorService a = bolts.f.a();
    public static final Executor b = bolts.a.b();
    private static final Executor c = bolts.f.b();
    private final Object d = new Object();
    private boolean e;
    private boolean f;
    private Object g;
    private Exception h;
    private List i;

    private j()
    {
        i = new ArrayList();
    }

    private j a(i l, Executor executor)
    {
        q q1 = a();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = g();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i.add(new m(this, q1, l, executor));
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            c(q1, l, this, executor);
        }
        return q1.a;
        l;
        obj;
        JVM INSTR monitorexit ;
        throw l;
    }

    public static j a(Exception exception)
    {
        q q1 = a();
        q1.a(exception);
        return q1.a;
    }

    public static j a(Object obj)
    {
        q q1 = a();
        q1.a(obj);
        return q1.a;
    }

    public static q a()
    {
        j j1 = new j();
        j1.getClass();
        return new q(j1, (byte)0);
    }

    static Exception a(j j1, Exception exception)
    {
        j1.h = exception;
        return exception;
    }

    static Object a(j j1)
    {
        return j1.d;
    }

    static Object a(j j1, Object obj)
    {
        j1.g = obj;
        return obj;
    }

    static void a(q q1, i l, j j1, Executor executor)
    {
        c(q1, l, j1, executor);
    }

    private j b(i l, Executor executor)
    {
        q q1 = a();
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = g();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i.add(new n(this, q1, l, executor));
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            d(q1, l, this, executor);
        }
        return q1.a;
        l;
        obj;
        JVM INSTR monitorexit ;
        throw l;
    }

    static void b(q q1, i l, j j1, Executor executor)
    {
        d(q1, l, j1, executor);
    }

    static boolean b(j j1)
    {
        return j1.e;
    }

    private static void c(q q1, i l, j j1, Executor executor)
    {
        executor.execute(new p(l, j1, q1));
    }

    static boolean c(j j1)
    {
        j1.e = true;
        return true;
    }

    private static void d(q q1, i l, j j1, Executor executor)
    {
        executor.execute(new k(l, j1, q1));
    }

    static boolean d(j j1)
    {
        j1.f = true;
        return true;
    }

    static void e(j j1)
    {
        Object obj = j1.d;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = j1.i.iterator();
_L1:
        i l;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        l = (i)iterator.next();
        l.then(j1);
          goto _L1
        j1;
        throw j1;
        j1;
        obj;
        JVM INSTR monitorexit ;
        throw j1;
        j1;
        throw new RuntimeException(j1);
        j1.i = null;
        obj;
        JVM INSTR monitorexit ;
    }

    public static j f()
    {
        q q1 = a();
        q1.b();
        return q1.a;
    }

    private boolean g()
    {
        boolean flag;
        synchronized (d)
        {
            flag = e;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final j a(i l)
    {
        return a(l, c);
    }

    public final j b(i l)
    {
        Executor executor = c;
        return b(((i) (new o(this, l))), executor);
    }

    public final boolean b()
    {
        boolean flag;
        synchronized (d)
        {
            flag = f;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean c()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object d()
    {
        Object obj1;
        synchronized (d)
        {
            obj1 = g;
        }
        return obj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Exception e()
    {
        Exception exception;
        synchronized (d)
        {
            exception = h;
        }
        return exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

}
