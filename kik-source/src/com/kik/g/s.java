// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.kik.g:
//            u, aq, z, p, 
//            ae, ak, an, am, 
//            ab, x, y, aa, 
//            af, w, f, t, 
//            ac, al, ad, v, 
//            aj, as, e

public final class s
{

    private static final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    public static aq a(p p1, p p2)
    {
        p2 = b(p2, new u());
        aq aq1 = new aq();
        z z1 = new z(new ArrayList(), aq1);
        p1.a(z1);
        p2.a(z1);
        return aq1;
    }

    public static as a(as as)
    {
        return new ae(as);
    }

    public static p a(e e)
    {
        e = b(e);
        a(((p) (e)), 25000L);
        return e;
    }

    public static p a(p p1)
    {
        p p2 = new p();
        p1.a(new ak(p2));
        return p2;
    }

    public static p a(p p1, long l)
    {
        p p2 = p1;
        if (p1 == null)
        {
            p2 = new p();
        }
        p2.a(new an(a.schedule(new am(p2), l, TimeUnit.MILLISECONDS)));
        return p2;
    }

    public static p a(p p1, as as)
    {
        p p2 = new p();
        p1.a(new ab(p2, as));
        return p2;
    }

    public static p a(p p1, p p2, boolean flag)
    {
        p p3 = new p();
        p1.a(new x(p2, p3, flag));
        p2.a(new y(p1, p3, flag));
        return p3;
    }

    public static p a(p p1, Callable callable)
    {
        p p2 = new p();
        p1.a(new aa(p2, callable));
        return p2;
    }

    public static p a(p p1, ExecutorService executorservice)
    {
        p p2 = new p();
        p1.a(new af(executorservice, p2));
        return p2;
    }

    public static p a(Object obj)
    {
        p p1 = new p();
        p1.a(obj);
        return p1;
    }

    public static p a(Throwable throwable)
    {
        p p1 = new p();
        p1.a(throwable);
        return p1;
    }

    public static p a(List list)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        p p1 = new p();
        Iterator iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            p p2 = (p)iterator.next();
            int j = i + 1;
            arraylist1.add(null);
            if (p2 != null)
            {
                p2.a(new w(arraylist1, i, p2, arraylist, list, p1));
                i = j;
            } else
            {
                arraylist1.add(i, null);
                arraylist.add(i, Boolean.valueOf(false));
                i = j;
            }
        }
        if (arraylist.size() == list.size())
        {
            p1.a(arraylist1);
        }
        return p1;
    }

    public static p b(e e)
    {
        p p1 = new p();
        f f1 = new f();
        t t1 = new t(p1);
        p1.a(new ac(f1, e, t1));
        f1.a(e, t1);
        return p1;
    }

    public static p b(p p1)
    {
        p p2 = new p();
        if (p1 != null)
        {
            p1.a(new al(p2));
            return p2;
        } else
        {
            return null;
        }
    }

    public static p b(p p1, as as)
    {
        p p2 = new p();
        p1.a(new ad(p2, as));
        return p2;
    }

    public static p b(p p1, p p2)
    {
        if (p1 != null)
        {
            p1.a(new v(p2));
            return p2;
        } else
        {
            return null;
        }
    }

    public static Object b(p p1, long l)
    {
        Object obj;
        obj = new Object();
        p1.a(new aj(obj));
        obj;
        JVM INSTR monitorenter ;
        if (!p1.g())
        {
            obj.wait(l);
        }
        obj;
        JVM INSTR monitorexit ;
        return p1.f();
        p1;
        obj;
        JVM INSTR monitorexit ;
        throw p1;
    }

    public static p c(p p1)
    {
        return a(b(p1, new p()), 100L);
    }

    public static p c(p p1, p p2)
    {
        return a(p1, p2, true);
    }

}
