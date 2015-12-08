// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.Constants;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package bo.app:
//            cf, gq, cg, gr, 
//            ch, cr, ci

public class cm
{

    public static final String a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final cr d;
    public final double e;
    public volatile cg f;
    public volatile cg g;
    public volatile boolean h;
    public final Object i;

    public cm(cr cr, double d1)
    {
        this(cr, d1, null, new cf(gq.g()), true, false, false);
    }

    public cm(cr cr, double d1, Double double1, cf cf1, boolean flag, boolean flag1, 
            boolean flag2)
    {
        boolean flag3 = false;
        super();
        h = false;
        i = new Object();
        d = cr;
        e = d1;
        if (!flag)
        {
            flag3 = true;
        }
        f = new cg(null, flag3);
        g = new cg(double1, flag2);
        b = new ConcurrentLinkedQueue(cf1.a);
        c = new ConcurrentLinkedQueue();
        h = flag1;
    }

    private static boolean a(cg cg1)
    {
        return cg1 != null && !cg1.a && !cg1.b;
    }

    private cg h()
    {
        cg cg1;
        synchronized (i)
        {
            cg1 = g;
        }
        return cg1;
    }

    private cg i()
    {
        cg cg1;
        synchronized (i)
        {
            cg1 = f;
        }
        return cg1;
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

    public final boolean a(ci ci)
    {
        synchronized (i)
        {
            b.add(ci);
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

    public final cf e()
    {
        cf cf1;
        synchronized (i)
        {
            cf1 = new cf((new gr()).b(gq.a(b)).b(gq.a(c)).a());
        }
        return cf1;
    }

    public final ch f()
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
        obj = new ch(this, Double.valueOf(d1), ((Double) (obj)), gq.a(j()), d, flag1);
        c.addAll(b);
        b.clear();
        obj1;
        JVM INSTR monitorexit ;
        return ((ch) (obj));
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/cm.getName()
        });
    }
}
