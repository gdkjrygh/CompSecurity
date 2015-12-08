// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.a;

import com.kik.g.e;
import com.kik.g.f;
import com.kik.g.k;
import com.kik.g.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kik.a.e.a;
import kik.a.h.b;

// Referenced classes of package kik.a.a:
//            b, l, d, e, 
//            f, a, g, i, 
//            h

public final class c
{

    private static final org.c.b n = org.c.c.a("abLogger");
    private final Object a = new Object();
    private final a b;
    private final l c;
    private Set d;
    private Map e;
    private Map f;
    private k g;
    private b h;
    private ScheduledExecutorService i;
    private ScheduledFuture j;
    private f k;
    private final kik.a.e.k l;
    private p m;

    public c(a a1, l l1, kik.a.e.k k1)
    {
        b = a1;
        c = l1;
        l = k1;
        i = Executors.newScheduledThreadPool(1);
        g = new k(this);
        d = new HashSet();
        e = new HashMap();
        k = new f();
        d.add(new kik.a.a.b("ab_test_experiment", new String[] {
            "ab_test_experiment_variant_a", "ab_test_experiment_variant_b"
        }));
        d.add(new kik.a.a.b("should_always_see_this", new String[] {
            "all"
        }));
        d.add(new kik.a.a.b("browser_button_removal", new String[] {
            "hide", "show"
        }));
        a(b.a());
        b(b.b());
        k.a(c.a(), new d(this));
        k.a(l.a(), new kik.a.a.e(this));
        k.a(b.g(), new kik.a.a.f(this));
    }

    static Map a(c c1, Map map)
    {
        c1.e = map;
        return map;
    }

    static l a(c c1)
    {
        return c1.c;
    }

    private void a(List list)
    {
        HashMap hashmap = new HashMap();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            kik.a.a.a a1 = (kik.a.a.a)list.next();
            if (a(a1.a(), a1.b()))
            {
                hashmap.put(a1.a(), a1);
            }
        } while (true);
        e = hashmap;
        g.a(null);
    }

    private boolean a(String s, String s1)
    {
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            kik.a.a.b b1 = (kik.a.a.b)iterator.next();
            if (b1.a().equalsIgnoreCase(s))
            {
                String as[] = b1.b();
                int j1 = as.length;
                int i1 = 0;
                while (i1 < j1) 
                {
                    if (as[i1].equalsIgnoreCase(s1))
                    {
                        return true;
                    }
                    i1++;
                }
            }
        } while (true);
        return false;
    }

    static boolean a(c c1, String s, String s1)
    {
        return c1.a(s, s1);
    }

    private void b(List list)
    {
        HashMap hashmap = new HashMap();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            kik.a.a.a a1 = (kik.a.a.a)list.next();
            if (a(a1.a(), a1.b()))
            {
                hashmap.put(a1.a(), a1);
            }
        } while (true);
        f = hashmap;
        g.a(null);
    }

    static void b(c c1)
    {
        boolean flag = true;
        Object obj = c1.a;
        obj;
        JVM INSTR monitorenter ;
        long l1;
        long l2;
        long l3;
        l1 = c1.b.e();
        l2 = c1.b.f();
        l3 = c1.c.b();
        if (l2 == 0L || l3 < l2) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (l3 - l1 < c1.b.d())
        {
            flag = false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (c1.m == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
        if (c1.h == null || !c1.h.d())
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        c1.i();
        obj;
        JVM INSTR monitorexit ;
    }

    static void c(c c1)
    {
        if (c1.b.f() == 0L)
        {
            long l1 = c1.c.b();
            c1.b.c(c1.b.b(l1));
        }
        c1.h();
        long l2 = c1.b.f();
        if (l2 != 0L)
        {
            long l3 = c1.c.b();
            c1.j = c1.i.schedule(new g(c1), l2 - l3, TimeUnit.MILLISECONDS);
        }
    }

    static Object d(c c1)
    {
        return c1.a;
    }

    static k e(c c1)
    {
        return c1.g;
    }

    static Map f(c c1)
    {
        return c1.e;
    }

    static a g(c c1)
    {
        return c1.b;
    }

    static ArrayList h(c c1)
    {
        Object obj = new ArrayList(c1.e.values());
        Object obj1 = new ArrayList(c1.f.values());
        ArrayList arraylist = new ArrayList();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); arraylist.add((kik.a.a.a)((Iterator) (obj1)).next())) { }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            kik.a.a.a a1 = (kik.a.a.a)((Iterator) (obj)).next();
            if (!c1.b(a1.a()))
            {
                arraylist.add(a1);
            }
        } while (true);
        return arraylist;
    }

    private void h()
    {
        if (j != null)
        {
            j.cancel(false);
            j = null;
        }
    }

    static b i(c c1)
    {
        return c1.h;
    }

    private void i()
    {
        synchronized (a)
        {
            m = c.d();
            m.a(new i(this));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void j(c c1)
    {
        if (c1.h == null)
        {
            c1.h = new b(3, 5000L, 1.5F);
        }
        c1.k.a(c1.h.e(), new h(c1));
    }

    static p k(c c1)
    {
        c1.m = null;
        return null;
    }

    public final long a()
    {
        return b.e();
    }

    public final String a(String s)
    {
        kik.a.a.a a1 = (kik.a.a.a)f.get(s);
        if (a1 != null)
        {
            return a1.b();
        }
        s = (kik.a.a.a)e.get(s);
        if (s != null)
        {
            return s.b();
        } else
        {
            return null;
        }
    }

    public final void a(kik.a.a.a a1)
    {
        f.put(a1.a(), a1);
        b.b(new ArrayList(f.values()));
        g.a(null);
    }

    public final List b()
    {
        return new ArrayList(d);
    }

    public final boolean b(String s)
    {
        return f.containsKey(s);
    }

    public final List c()
    {
        return new ArrayList(e.values());
    }

    public final void c(String s)
    {
        f.remove(s);
        b.b(new ArrayList(f.values()));
        g.a(null);
    }

    public final void d()
    {
        i();
    }

    public final List e()
    {
        return new ArrayList(f.values());
    }

    public final e f()
    {
        return g.a();
    }

    public final void g()
    {
        k.a();
        b.c();
        h();
    }

}
