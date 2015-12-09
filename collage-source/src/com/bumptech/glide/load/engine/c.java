// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import com.bumptech.glide.e.b;
import com.bumptech.glide.g.d;
import com.bumptech.glide.i;
import com.bumptech.glide.load.engine.b.h;
import com.bumptech.glide.load.g;
import com.bumptech.glide.request.f;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.bumptech.glide.load.engine:
//            e, g, k, h, 
//            d, EngineRunnable, a, b, 
//            j

public class com.bumptech.glide.load.engine.c
    implements com.bumptech.glide.load.engine.b.h.a, com.bumptech.glide.load.engine.e, h.a
{
    static class a
    {

        private final ExecutorService a;
        private final ExecutorService b;
        private final com.bumptech.glide.load.engine.e c;

        public com.bumptech.glide.load.engine.d a(com.bumptech.glide.load.c c1, boolean flag)
        {
            return new com.bumptech.glide.load.engine.d(c1, a, b, flag, c);
        }

        public a(ExecutorService executorservice, ExecutorService executorservice1, com.bumptech.glide.load.engine.e e1)
        {
            a = executorservice;
            b = executorservice1;
            c = e1;
        }
    }

    private static class b
        implements a.a
    {

        private final com.bumptech.glide.load.engine.b.a.a a;
        private volatile com.bumptech.glide.load.engine.b.a b;

        public com.bumptech.glide.load.engine.b.a a()
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
                b = new com.bumptech.glide.load.engine.b.b();
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

        public b(com.bumptech.glide.load.engine.b.a.a a1)
        {
            a = a1;
        }
    }

    public static class c
    {

        private final com.bumptech.glide.load.engine.d a;
        private final f b;

        public void a()
        {
            a.b(b);
        }

        public c(f f1, com.bumptech.glide.load.engine.d d1)
        {
            b = f1;
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

        private final com.bumptech.glide.load.c a;

        static com.bumptech.glide.load.c a(e e1)
        {
            return e1.a;
        }

        public e(com.bumptech.glide.load.c c1, com.bumptech.glide.load.engine.h h1, ReferenceQueue referencequeue)
        {
            super(h1, referencequeue);
            a = c1;
        }
    }


    private final Map a;
    private final com.bumptech.glide.load.engine.g b;
    private final h c;
    private final a d;
    private final Map e;
    private final k f;
    private final b g;
    private ReferenceQueue h;

    public com.bumptech.glide.load.engine.c(h h1, com.bumptech.glide.load.engine.b.a.a a1, ExecutorService executorservice, ExecutorService executorservice1)
    {
        this(h1, a1, executorservice, executorservice1, null, null, null, null, null);
    }

    com.bumptech.glide.load.engine.c(h h1, com.bumptech.glide.load.engine.b.a.a a1, ExecutorService executorservice, ExecutorService executorservice1, Map map, com.bumptech.glide.load.engine.g g1, Map map1, 
            a a2, k k1)
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
            a1 = new com.bumptech.glide.load.engine.g();
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
        a1 = k1;
        if (k1 == null)
        {
            a1 = new k();
        }
        f = a1;
        h1.a(this);
    }

    private com.bumptech.glide.load.engine.h a(com.bumptech.glide.load.c c1)
    {
        c1 = c.a(c1);
        if (c1 == null)
        {
            return null;
        }
        if (c1 instanceof com.bumptech.glide.load.engine.h)
        {
            return (com.bumptech.glide.load.engine.h)c1;
        } else
        {
            return new com.bumptech.glide.load.engine.h(c1, true);
        }
    }

    private com.bumptech.glide.load.engine.h a(com.bumptech.glide.load.c c1, boolean flag)
    {
        if (!flag)
        {
            return null;
        }
        Object obj = (WeakReference)e.get(c1);
        if (obj != null)
        {
            obj = (com.bumptech.glide.load.engine.h)((WeakReference) (obj)).get();
            if (obj != null)
            {
                ((com.bumptech.glide.load.engine.h) (obj)).e();
                c1 = ((com.bumptech.glide.load.c) (obj));
            } else
            {
                e.remove(c1);
                c1 = ((com.bumptech.glide.load.c) (obj));
            }
        } else
        {
            c1 = null;
        }
        return c1;
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

    private static void a(String s, long l, com.bumptech.glide.load.c c1)
    {
        Log.v("Engine", (new StringBuilder()).append(s).append(" in ").append(com.bumptech.glide.g.d.a(l)).append("ms, key: ").append(c1).toString());
    }

    private com.bumptech.glide.load.engine.h b(com.bumptech.glide.load.c c1, boolean flag)
    {
        com.bumptech.glide.load.engine.h h1;
        if (!flag)
        {
            h1 = null;
        } else
        {
            com.bumptech.glide.load.engine.h h2 = a(c1);
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

    public c a(com.bumptech.glide.load.c c1, int i, int j, com.bumptech.glide.load.a.c c2, com.bumptech.glide.e.b b1, g g1, com.bumptech.glide.load.resource.e.c c3, 
            i l, boolean flag, com.bumptech.glide.load.engine.b b2, f f1)
    {
        com.bumptech.glide.g.h.a();
        long l1 = com.bumptech.glide.g.d.a();
        Object obj = c2.b();
        c1 = b.a(((String) (obj)), c1, i, j, b1.a(), b1.b(), g1, b1.d(), c3, b1.c());
        obj = b(c1, flag);
        if (obj != null)
        {
            f1.a(((j) (obj)));
            if (Log.isLoggable("Engine", 2))
            {
                a("Loaded resource from cache", l1, c1);
            }
            return null;
        }
        obj = a(c1, flag);
        if (obj != null)
        {
            f1.a(((j) (obj)));
            if (Log.isLoggable("Engine", 2))
            {
                a("Loaded resource from active resources", l1, c1);
            }
            return null;
        }
        obj = (com.bumptech.glide.load.engine.d)a.get(c1);
        if (obj != null)
        {
            ((com.bumptech.glide.load.engine.d) (obj)).a(f1);
            if (Log.isLoggable("Engine", 2))
            {
                a("Added to existing load", l1, c1);
            }
            return new c(f1, ((com.bumptech.glide.load.engine.d) (obj)));
        }
        obj = d.a(c1, flag);
        c2 = new EngineRunnable(((EngineRunnable.a) (obj)), new com.bumptech.glide.load.engine.a(c1, i, j, c2, b1, g1, c3, g, b2, l), l);
        a.put(c1, obj);
        ((com.bumptech.glide.load.engine.d) (obj)).a(f1);
        ((com.bumptech.glide.load.engine.d) (obj)).a(c2);
        if (Log.isLoggable("Engine", 2))
        {
            a("Started new load", l1, c1);
        }
        return new c(f1, ((com.bumptech.glide.load.engine.d) (obj)));
    }

    public void a(com.bumptech.glide.load.c c1, com.bumptech.glide.load.engine.h h1)
    {
        com.bumptech.glide.g.h.a();
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

    public void a(com.bumptech.glide.load.engine.d d1, com.bumptech.glide.load.c c1)
    {
        com.bumptech.glide.g.h.a();
        if (d1.equals((com.bumptech.glide.load.engine.d)a.get(c1)))
        {
            a.remove(c1);
        }
    }

    public void a(j j)
    {
        com.bumptech.glide.g.h.a();
        if (j instanceof com.bumptech.glide.load.engine.h)
        {
            ((com.bumptech.glide.load.engine.h)j).f();
            return;
        } else
        {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
    }

    public void b(com.bumptech.glide.load.c c1, com.bumptech.glide.load.engine.h h1)
    {
        com.bumptech.glide.g.h.a();
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

    public void b(j j)
    {
        com.bumptech.glide.g.h.a();
        f.a(j);
    }
}
