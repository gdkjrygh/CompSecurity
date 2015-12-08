// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.s;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p.ak.b;
import p.al.g;
import p.ap.d;
import p.l.i;
import p.u.h;

// Referenced classes of package p.s:
//            e, g, l, h, 
//            d, i, a, b, 
//            k

public class p.s.c
    implements p.s.e, h.a, p.u.h.a
{
    static class a
    {

        private final ExecutorService a;
        private final ExecutorService b;
        private final p.s.e c;

        public p.s.d a(p.q.c c1, boolean flag)
        {
            return new p.s.d(c1, a, b, flag, c);
        }

        public a(ExecutorService executorservice, ExecutorService executorservice1, p.s.e e1)
        {
            a = executorservice;
            b = executorservice1;
            c = e1;
        }
    }

    private static class b
        implements a.a
    {

        private final p.u.a.a a;
        private volatile p.u.a b;

        public p.u.a a()
        {
            if (b != null) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorenter ;
            if (b == null)
            {
                b = a.a();
            }
            if (b == null)
            {
                b = new p.u.b();
            }
            this;
            JVM INSTR monitorexit ;
_L2:
            return b;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public b(p.u.a.a a1)
        {
            a = a1;
        }
    }

    public static class c
    {

        private final p.s.d a;
        private final g b;

        public void a()
        {
            a.b(b);
        }

        public c(g g1, p.s.d d1)
        {
            b = g1;
            a = d1;
        }
    }

    private static class d
        implements android.os.MessageQueue.IdleHandler
    {

        private final Map a;
        private final ReferenceQueue b;

        public boolean queueIdle()
        {
            e e1 = (e)b.poll();
            if (e1 != null)
            {
                a.remove(e.a(e1));
            }
            return true;
        }

        public d(Map map, ReferenceQueue referencequeue)
        {
            a = map;
            b = referencequeue;
        }
    }

    private static class e extends WeakReference
    {

        private final p.q.c a;

        static p.q.c a(e e1)
        {
            return e1.a;
        }

        public e(p.q.c c1, p.s.h h1, ReferenceQueue referencequeue)
        {
            super(h1, referencequeue);
            a = c1;
        }
    }


    private final Map a;
    private final p.s.g b;
    private final h c;
    private final a d;
    private final Map e;
    private final l f;
    private final b g;
    private ReferenceQueue h;

    public p.s.c(h h1, p.u.a.a a1, ExecutorService executorservice, ExecutorService executorservice1)
    {
        this(h1, a1, executorservice, executorservice1, null, null, null, null, null);
    }

    p.s.c(h h1, p.u.a.a a1, ExecutorService executorservice, ExecutorService executorservice1, Map map, p.s.g g1, Map map1, 
            a a2, l l1)
    {
        c = h1;
        g = new b(a1);
        a1 = map1;
        if (map1 == null)
        {
            a1 = new HashMap();
        }
        e = a1;
        a1 = g1;
        if (g1 == null)
        {
            a1 = new p.s.g();
        }
        b = a1;
        a1 = map;
        if (map == null)
        {
            a1 = new HashMap();
        }
        a = a1;
        a1 = a2;
        if (a2 == null)
        {
            a1 = new a(executorservice, executorservice1, this);
        }
        d = a1;
        a1 = l1;
        if (l1 == null)
        {
            a1 = new l();
        }
        f = a1;
        h1.a(this);
    }

    private ReferenceQueue a()
    {
        if (h == null)
        {
            h = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new d(e, h));
        }
        return h;
    }

    private p.s.h a(p.q.c c1)
    {
        c1 = c.a(c1);
        if (c1 == null)
        {
            return null;
        }
        if (c1 instanceof p.s.h)
        {
            return (p.s.h)c1;
        } else
        {
            return new p.s.h(c1, true);
        }
    }

    private p.s.h a(p.q.c c1, boolean flag)
    {
        if (!flag)
        {
            return null;
        }
        Object obj = (WeakReference)e.get(c1);
        if (obj != null)
        {
            obj = (p.s.h)((WeakReference) (obj)).get();
            if (obj != null)
            {
                ((p.s.h) (obj)).e();
                c1 = ((p.q.c) (obj));
            } else
            {
                e.remove(c1);
                c1 = ((p.q.c) (obj));
            }
        } else
        {
            c1 = null;
        }
        return c1;
    }

    private static void a(String s, long l1, p.q.c c1)
    {
        Log.v("Engine", (new StringBuilder()).append(s).append(" in ").append(p.ap.d.a(l1)).append("ms, key: ").append(c1).toString());
    }

    private p.s.h b(p.q.c c1, boolean flag)
    {
        p.s.h h1;
        if (!flag)
        {
            h1 = null;
        } else
        {
            p.s.h h2 = a(c1);
            h1 = h2;
            if (h2 != null)
            {
                h2.e();
                e.put(c1, new e(c1, h2, a()));
                return h2;
            }
        }
        return h1;
    }

    public c a(p.q.c c1, int j, int k, p.r.c c2, p.ak.b b1, p.q.g g1, p.ah.d d1, 
            i i1, boolean flag, p.s.b b2, g g2)
    {
        p.ap.h.a();
        long l1 = p.ap.d.a();
        Object obj = c2.b();
        c1 = b.a(((String) (obj)), c1, j, k, b1.a(), b1.b(), g1, b1.d(), d1, b1.c());
        obj = b(c1, flag);
        if (obj != null)
        {
            g2.a(((k) (obj)));
            if (Log.isLoggable("Engine", 2))
            {
                a("Loaded resource from cache", l1, c1);
            }
            return null;
        }
        obj = a(c1, flag);
        if (obj != null)
        {
            g2.a(((k) (obj)));
            if (Log.isLoggable("Engine", 2))
            {
                a("Loaded resource from active resources", l1, c1);
            }
            return null;
        }
        obj = (p.s.d)a.get(c1);
        if (obj != null)
        {
            ((p.s.d) (obj)).a(g2);
            if (Log.isLoggable("Engine", 2))
            {
                a("Added to existing load", l1, c1);
            }
            return new c(g2, ((p.s.d) (obj)));
        }
        obj = d.a(c1, flag);
        c2 = new p.s.i(((i.a) (obj)), new p.s.a(c1, j, k, c2, b1, g1, d1, g, b2, i1), i1);
        a.put(c1, obj);
        ((p.s.d) (obj)).a(g2);
        ((p.s.d) (obj)).a(c2);
        if (Log.isLoggable("Engine", 2))
        {
            a("Started new load", l1, c1);
        }
        return new c(g2, ((p.s.d) (obj)));
    }

    public void a(p.q.c c1, p.s.h h1)
    {
        p.ap.h.a();
        if (h1 != null)
        {
            h1.a(c1, this);
            if (h1.a())
            {
                e.put(c1, new e(c1, h1, a()));
            }
        }
        a.remove(c1);
    }

    public void a(p.s.d d1, p.q.c c1)
    {
        p.ap.h.a();
        if (d1.equals((p.s.d)a.get(c1)))
        {
            a.remove(c1);
        }
    }

    public void a(k k)
    {
        p.ap.h.a();
        if (k instanceof p.s.h)
        {
            ((p.s.h)k).f();
            return;
        } else
        {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
    }

    public void b(p.q.c c1, p.s.h h1)
    {
        p.ap.h.a();
        e.remove(c1);
        if (h1.a())
        {
            c.b(c1, h1);
            return;
        } else
        {
            f.a(h1);
            return;
        }
    }

    public void b(k k)
    {
        p.ap.h.a();
        f.a(k);
    }
}
