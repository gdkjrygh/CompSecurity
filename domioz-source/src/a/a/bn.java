// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.f;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package a.a:
//            bg, fm, bh, fn, 
//            bi, bs, bj

public class bn
{

    public static final String a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final bs d;
    public final double e;
    public volatile bh f;
    public volatile bh g;
    public volatile boolean h;
    public final Object i;

    public bn(bs bs, double d1)
    {
        this(bs, d1, null, new bg(fm.g()), true, false, false);
    }

    public bn(bs bs, double d1, Double double1, bg bg1, boolean flag, boolean flag1, 
            boolean flag2)
    {
        boolean flag3 = false;
        super();
        h = false;
        i = new Object();
        d = bs;
        e = d1;
        if (!flag)
        {
            flag3 = true;
        }
        f = new bh(null, flag3);
        g = new bh(double1, flag2);
        b = new ConcurrentLinkedQueue(bg1.a);
        c = new ConcurrentLinkedQueue();
        h = flag1;
    }

    private static boolean a(bh bh1)
    {
        return bh1 != null && !bh1.a && !bh1.b;
    }

    private bh h()
    {
        bh bh1;
        synchronized (i)
        {
            bh1 = g;
        }
        return bh1;
    }

    private bh i()
    {
        bh bh1;
        synchronized (i)
        {
            bh1 = f;
        }
        return bh1;
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

    public final boolean a(bj bj)
    {
        synchronized (i)
        {
            b.add(bj);
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

    public final bg e()
    {
        bg bg1;
        synchronized (i)
        {
            bg1 = new bg((new fn()).b(fm.a(b)).b(fm.a(c)).a());
        }
        return bg1;
    }

    public final bi f()
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
        obj = new bi(this, Double.valueOf(d1), ((Double) (obj)), fm.a(j()), d, flag1);
        c.addAll(b);
        b.clear();
        obj1;
        JVM INSTR monitorexit ;
        return ((bi) (obj));
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
            f.a, a/a/bn.getName()
        });
    }
}
