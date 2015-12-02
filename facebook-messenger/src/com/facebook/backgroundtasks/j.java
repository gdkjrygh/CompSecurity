// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;

import android.content.IntentFilter;
import android.os.Handler;
import android.support.v4.a.e;
import com.facebook.common.b.h;
import com.facebook.common.v.a;
import com.facebook.common.v.f;
import com.facebook.debug.log.b;
import com.facebook.debug.log.l;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.backgroundtasks:
//            q, o, p, c, 
//            k, l, m, b, 
//            d, n

public class j
    implements q
{

    private static Class a = com/facebook/backgroundtasks/j;
    private static final l b = new l();
    private final Handler c;
    private final com.facebook.common.time.a d;
    private final Executor e;
    private final f f;
    private final a g;
    private final e h;
    private final d i;
    private final ev j;
    private final es k;
    private final ConcurrentMap l = ik.c();
    private final Object m = new Object();
    private final com.facebook.common.v.j n = new k(this);
    private final o o;
    private int p;
    private p q;
    private Runnable r;
    private long s;
    private boolean t;
    private boolean u;

    public j(f f1, a a1, e e1, Set set, d d1, com.facebook.common.executors.a a2, Handler handler, 
            com.facebook.common.time.a a3)
    {
        boolean flag;
        if (!set.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        f = f1;
        g = a1;
        h = e1;
        i = d1;
        c = handler;
        d = a3;
        e = new com.facebook.common.executors.j(handler);
        o = new o(a2);
        k = a(set);
        j = a(k);
        for (f1 = k.iterator(); f1.hasNext(); ((p)f1.next()).a.a(this)) { }
        p = 0;
        s = 100L;
        f.a(n);
        h.a(new com.facebook.backgroundtasks.l(this), new IntentFilter(a.a));
        u = g.a();
    }

    private static long a(long l1)
    {
        if (l1 == 100L)
        {
            l1 = 30000L;
        } else
        {
            l1 = 2L * l1;
        }
        return Math.min(l1, 0x493e0L);
    }

    private es a(Set set)
    {
        Object obj = com.facebook.common.b.f.a(b(set));
        set = es.e();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); set.b(new p((c)((h)((Iterator) (obj)).next()).a, null))) { }
        return set.b();
    }

    private ev a(es es1)
    {
        ew ew1 = ev.k();
        p p1;
        for (es1 = es1.iterator(); es1.hasNext(); ew1.b(p1.a.f(), p1))
        {
            p1 = (p)es1.next();
        }

        return ew1.b();
    }

    static Object a(j j1)
    {
        return j1.m;
    }

    static Runnable a(j j1, Runnable runnable)
    {
        j1.r = runnable;
        return runnable;
    }

    private void a(int i1)
    {
        long l1;
label0:
        {
            l1 = 0L;
            synchronized (m)
            {
                if (!t || r == null)
                {
                    break label0;
                }
            }
            return;
        }
        if (r != null)
        {
            c.removeCallbacks(r);
            r = null;
        }
          goto _L1
_L3:
        throw new IllegalStateException();
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        l1 = s;
_L2:
        r = new m(this);
        c.postDelayed(r, l1);
        obj;
        JVM INSTR monitorexit ;
        return;
_L5:
        l1 = Math.max(0L, g() - d.a());
          goto _L2
_L1:
        i1;
        JVM INSTR tableswitch 1 3: default 152
    //                   1 72
    //                   2 66
    //                   3 101;
           goto _L3 _L2 _L4 _L5
    }

    private void a(com.facebook.backgroundtasks.b b1)
    {
        boolean flag;
        flag = true;
        o.a();
        Object obj;
        obj = q;
        q = null;
        com.facebook.debug.log.b.b(a, "Task completed successfully");
        if (b1.a)
        {
            flag = false;
        }
        obj.b = flag;
        obj = m;
        obj;
        JVM INSTR monitorenter ;
        if (!b1.a)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        s = 100L;
        t = false;
_L1:
        a(2);
        o.b();
        return;
        s = a(s);
        t = true;
          goto _L1
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
        b1;
        o.b();
        throw b1;
    }

    static void a(j j1, com.facebook.backgroundtasks.b b1)
    {
        j1.a(b1);
    }

    static void a(j j1, Throwable throwable)
    {
        j1.a(throwable);
    }

    private void a(Throwable throwable)
    {
        o.a();
        p p1 = q;
        q = null;
        com.facebook.debug.log.b.a(b, a, (new StringBuilder()).append("Task ").append(p1.a.f()).append(" threw exeption").toString(), throwable);
        p1.b = true;
        synchronized (m)
        {
            s = a(s);
            t = true;
        }
        a(2);
        o.b();
        return;
        exception;
        throwable;
        JVM INSTR monitorexit ;
        throw exception;
        throwable;
        o.b();
        throw throwable;
    }

    private boolean a(p p1)
    {
        if (!b(p1))
        {
            return false;
        } else
        {
            return p1.a.b();
        }
    }

    private Collection b(Set set)
    {
        java.util.HashMap hashmap = ik.a();
        c c1;
        for (set = set.iterator(); set.hasNext(); hashmap.put(c1.f(), new h(c1)))
        {
            c1 = (c)set.next();
        }

        for (set = hashmap.values().iterator(); set.hasNext();)
        {
            h h1 = (h)set.next();
            Iterator iterator = ((c)h1.a).h().iterator();
            while (iterator.hasNext()) 
            {
                String s1 = (String)iterator.next();
                h h2 = (h)hashmap.get(s1);
                if (h2 == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Missing node for dependency: ").append(s1).toString());
                }
                h2.a(h1);
            }
        }

        return hashmap.values();
    }

    static void b(j j1)
    {
        j1.d();
    }

    private boolean b(p p1)
    {
        for (Iterator iterator = p1.a.h().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            if (((p)j.get(s1)).b)
            {
                return false;
            }
        }

        if (i.a(p1.a))
        {
            return false;
        }
        for (p1 = p1.a.a().iterator(); p1.hasNext();)
        {
            Class class1 = (Class)p1.next();
            if (l.containsKey(class1))
            {
                return false;
            }
        }

        return true;
    }

    private void d()
    {
        o.a();
        Object obj = q;
        if (obj != null)
        {
            o.b();
            return;
        }
        boolean flag = f.b();
        if (flag)
        {
            o.b();
            return;
        }
        obj = e();
        if (obj == null) goto _L2; else goto _L1
_L1:
        com.google.common.d.a.i.a(((s) (obj)), new n(this), e);
_L4:
        o.b();
        return;
_L2:
        a(3);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        o.b();
        throw exception;
    }

    private s e()
    {
        int i1;
        Preconditions.checkState(o.c());
        i1 = 0;
_L2:
        if (i1 >= k.size())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = f();
        if (obj == null)
        {
            com.facebook.debug.log.b.b(a, "No more tasks to run");
            return null;
        }
        com.facebook.debug.log.b.b(a, "Running %s", new Object[] {
            ((p) (obj)).a.f()
        });
        try
        {
            q = ((p) (obj));
            obj = q.a.c();
        }
        catch (Throwable throwable)
        {
            a(throwable);
            return null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        com.facebook.debug.log.b.b(a, "Task started");
        return ((s) (obj));
        q = null;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    private p f()
    {
        Preconditions.checkState(o.c());
        int j1 = k.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = (p + i1) % j1;
            p p1 = (p)k.get(k1);
            if (a(p1))
            {
                p = (k1 + 1) % j1;
                return p1;
            }
        }

        return null;
    }

    private long g()
    {
        long l1 = d.a() + 0x5265c00L;
        int j1 = k.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            p p1 = (p)k.get(i1);
            if (!b(p1))
            {
                continue;
            }
            long l2 = p1.a.i();
            if (l2 != -1L)
            {
                l1 = Math.min(l1, l2);
            }
        }

        return l1;
    }

    public void a()
    {
        a(1);
    }

    public void a(Class class1)
    {
        l.put(class1, Boolean.valueOf(true));
    }

    void a(boolean flag)
    {
        if (!flag)
        {
            a(2);
        }
    }

    public void b()
    {
        a(1);
    }

    public void b(Class class1)
    {
        l.remove(class1);
        a(1);
    }

    void c()
    {
        synchronized (m)
        {
            boolean flag = g.a();
            if (u != flag)
            {
                u = flag;
                if (!u)
                {
                    a(1);
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
