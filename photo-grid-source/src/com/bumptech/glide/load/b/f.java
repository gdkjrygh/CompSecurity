// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import com.bumptech.glide.f.b;
import com.bumptech.glide.i.d;
import com.bumptech.glide.i.h;
import com.bumptech.glide.load.a.c;
import com.bumptech.glide.load.b.b.n;
import com.bumptech.glide.load.b.b.o;
import com.bumptech.glide.load.g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.bumptech.glide.load.b:
//            o, s, h, q, 
//            g, y, j, r, 
//            p, k, l, i, 
//            t, a, x, e

public final class f
    implements o, com.bumptech.glide.load.b.o, s
{

    private final Map a;
    private final q b;
    private final n c;
    private final com.bumptech.glide.load.b.g d;
    private final Map e;
    private final y f;
    private final com.bumptech.glide.load.b.h g;
    private ReferenceQueue h;

    public f(n n1, com.bumptech.glide.load.b.b.b b1, ExecutorService executorservice, ExecutorService executorservice1)
    {
        this(n1, b1, executorservice, executorservice1, (byte)0);
    }

    private f(n n1, com.bumptech.glide.load.b.b.b b1, ExecutorService executorservice, ExecutorService executorservice1, byte byte0)
    {
        c = n1;
        g = new com.bumptech.glide.load.b.h(b1);
        e = new HashMap();
        b = new q();
        a = new HashMap();
        d = new com.bumptech.glide.load.b.g(executorservice, executorservice1, this);
        f = new y();
        n1.a(this);
    }

    private ReferenceQueue a()
    {
        if (h == null)
        {
            h = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new j(e, h));
        }
        return h;
    }

    public static void a(x x)
    {
        com.bumptech.glide.i.h.a();
        if (x instanceof r)
        {
            ((r)x).f();
            return;
        } else
        {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
    }

    private static void a(String s1, long l1, com.bumptech.glide.load.c c1)
    {
        (new StringBuilder()).append(s1).append(" in ").append(com.bumptech.glide.i.d.a(l1)).append("ms, key: ").append(c1);
    }

    public final i a(com.bumptech.glide.load.c c1, int i1, int j1, c c2, b b1, g g1, com.bumptech.glide.load.resource.e.c c3, 
            int k1, boolean flag, e e1, com.bumptech.glide.g.f f1)
    {
        p p1;
        long l1;
        com.bumptech.glide.i.h.a();
        l1 = com.bumptech.glide.i.d.a();
        p1 = new p(c2.b(), c1, i1, j1, b1.a(), b1.b(), g1, b1.d(), c3, b1.c());
        if (flag) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        if (obj != null)
        {
            f1.a(((x) (obj)));
            if (Log.isLoggable("Engine", 2))
            {
                a("Loaded resource from cache", l1, ((com.bumptech.glide.load.c) (p1)));
            }
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        c1 = c.a(p1);
        if (c1 == null)
        {
            c1 = null;
        } else
        if (c1 instanceof r)
        {
            c1 = (r)c1;
        } else
        {
            c1 = new r(c1, true);
        }
        obj = c1;
        if (c1 != null)
        {
            c1.e();
            e.put(p1, new k(p1, c1, a()));
            obj = c1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            c1 = null;
        } else
        {
            c1 = (WeakReference)e.get(p1);
            if (c1 != null)
            {
                c1 = (r)c1.get();
                if (c1 != null)
                {
                    c1.e();
                } else
                {
                    e.remove(p1);
                }
            } else
            {
                c1 = null;
            }
        }
        if (c1 != null)
        {
            f1.a(c1);
            if (Log.isLoggable("Engine", 2))
            {
                a("Loaded resource from active resources", l1, ((com.bumptech.glide.load.c) (p1)));
            }
            return null;
        }
        c1 = (l)a.get(p1);
        if (c1 != null)
        {
            c1.a(f1);
            if (Log.isLoggable("Engine", 2))
            {
                a("Added to existing load", l1, ((com.bumptech.glide.load.c) (p1)));
            }
            return new i(f1, c1);
        }
        c1 = d.a(p1, flag);
        c2 = new t(c1, new a(p1, i1, j1, c2, b1, g1, c3, g, e1, k1), k1);
        a.put(p1, c1);
        c1.a(f1);
        c1.a(c2);
        if (Log.isLoggable("Engine", 2))
        {
            a("Started new load", l1, ((com.bumptech.glide.load.c) (p1)));
        }
        return new i(f1, c1);
    }

    public final void a(l l1, com.bumptech.glide.load.c c1)
    {
        com.bumptech.glide.i.h.a();
        if (l1.equals((l)a.get(c1)))
        {
            a.remove(c1);
        }
    }

    public final void a(com.bumptech.glide.load.c c1, r r1)
    {
        com.bumptech.glide.i.h.a();
        if (r1 != null)
        {
            r1.a(c1, this);
            if (r1.a())
            {
                e.put(c1, new k(c1, r1, a()));
            }
        }
        a.remove(c1);
    }

    public final void b(x x)
    {
        com.bumptech.glide.i.h.a();
        f.a(x);
    }

    public final void b(com.bumptech.glide.load.c c1, r r1)
    {
        com.bumptech.glide.i.h.a();
        e.remove(c1);
        if (r1.a())
        {
            c.a(c1, r1);
            return;
        } else
        {
            f.a(r1);
            return;
        }
    }
}
