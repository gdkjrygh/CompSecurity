// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package bo.app:
//            cl, gw, cm, gx, 
//            cn, cx, co

public class cs
{

    public static final String a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final cx d;
    public final double e;
    public volatile cm f;
    public volatile cm g;
    public volatile boolean h;
    public final Object i;

    public cs(cx cx, double d1)
    {
        this(cx, d1, null, new cl(gw.g()), true, false, false);
    }

    public cs(cx cx, double d1, Double double1, cl cl1, boolean flag, boolean flag1, 
            boolean flag2)
    {
        boolean flag3 = false;
        super();
        h = false;
        i = new Object();
        d = cx;
        e = d1;
        if (!flag)
        {
            flag3 = true;
        }
        f = new cm(null, flag3);
        g = new cm(double1, flag2);
        b = new ConcurrentLinkedQueue(cl1.a);
        c = new ConcurrentLinkedQueue();
        h = flag1;
    }

    private static boolean a(cm cm1)
    {
        return cm1 != null && !cm1.a && !cm1.b;
    }

    private cm h()
    {
        cm cm1;
        synchronized (i)
        {
            cm1 = g;
        }
        return cm1;
    }

    private cm i()
    {
        cm cm1;
        synchronized (i)
        {
            cm1 = f;
        }
        return cm1;
    }

    private ConcurrentLinkedQueue j()
    {
        ConcurrentLinkedQueue concurrentlinkedqueue;
        synchronized (i)
        {
            concurrentlinkedqueue = b;
        }
        return concurrentlinkedqueue;
    }

    public final Double a()
    {
        Double double1;
        synchronized (i)
        {
            double1 = (Double)g.a();
        }
        return double1;
    }

    public final void a(Double double1)
    {
        synchronized (i)
        {
            g.a(double1);
        }
    }

    public final boolean a(co co)
    {
        synchronized (i)
        {
            b.add(co);
        }
        return true;
    }

    public final boolean b()
    {
        boolean flag;
        synchronized (i)
        {
            flag = f.b;
        }
        return flag;
    }

    public final boolean c()
    {
        boolean flag;
        synchronized (i)
        {
            flag = h;
        }
        return flag;
    }

    public final boolean d()
    {
        boolean flag;
        synchronized (i)
        {
            flag = g.b;
        }
        return flag;
    }

    public final cl e()
    {
        cl cl1;
        synchronized (i)
        {
            cl1 = new cl((new gx()).b(gw.a(b)).b(gw.a(c)).a());
        }
        return cl1;
    }

    public final cn f()
    {
        Object obj1 = i;
        obj1;
        JVM INSTR monitorenter ;
        boolean flag1 = a(i());
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        f.b();
        Object obj;
        double d1;
        boolean flag;
        if (h && a(h()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        g.b();
        d1 = e;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        obj = a();
_L1:
        obj = new cn(this, Double.valueOf(d1), ((Double) (obj)), gw.a(j()), d, flag1);
        c.addAll(b);
        b.clear();
        obj1;
        JVM INSTR monitorexit ;
        return ((cn) (obj));
        obj = null;
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean g()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (d() && b() && e().a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/cs.getName()
        });
    }
}
