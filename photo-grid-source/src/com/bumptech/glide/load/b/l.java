// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.g.f;
import com.bumptech.glide.i.h;
import com.bumptech.glide.load.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Referenced classes of package com.bumptech.glide.load.b:
//            u, m, n, x, 
//            r, o, t

final class l
    implements u
{

    private static final m a = new m();
    private static final Handler b = new Handler(Looper.getMainLooper(), new n((byte)0));
    private final List c;
    private final m d;
    private final o e;
    private final c f;
    private final ExecutorService g;
    private final ExecutorService h;
    private final boolean i;
    private boolean j;
    private x k;
    private boolean l;
    private Exception m;
    private boolean n;
    private Set o;
    private t p;
    private r q;
    private volatile Future r;

    public l(c c1, ExecutorService executorservice, ExecutorService executorservice1, boolean flag, o o1)
    {
        this(c1, executorservice, executorservice1, flag, o1, a);
    }

    private l(c c1, ExecutorService executorservice, ExecutorService executorservice1, boolean flag, o o1, m m1)
    {
        c = new ArrayList();
        f = c1;
        g = executorservice;
        h = executorservice1;
        i = flag;
        e = o1;
        d = m1;
    }

    static void a(l l1)
    {
        if (l1.j)
        {
            l1.k.d();
            return;
        }
        if (l1.c.isEmpty())
        {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
        l1.q = new r(l1.k, l1.i);
        l1.l = true;
        l1.q.e();
        l1.e.a(l1.f, l1.q);
        Iterator iterator = l1.c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            f f1 = (f)iterator.next();
            if (!l1.c(f1))
            {
                l1.q.e();
                f1.a(l1.q);
            }
        } while (true);
        l1.q.f();
    }

    static void b(l l1)
    {
        if (!l1.j)
        {
            if (l1.c.isEmpty())
            {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            l1.n = true;
            l1.e.a(l1.f, null);
            Iterator iterator = l1.c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                f f1 = (f)iterator.next();
                if (!l1.c(f1))
                {
                    f1.a(l1.m);
                }
            } while (true);
        }
    }

    private boolean c(f f1)
    {
        return o != null && o.contains(f1);
    }

    public final void a(f f1)
    {
        com.bumptech.glide.i.h.a();
        if (l)
        {
            f1.a(q);
            return;
        }
        if (n)
        {
            f1.a(m);
            return;
        } else
        {
            c.add(f1);
            return;
        }
    }

    public final void a(t t1)
    {
        p = t1;
        r = g.submit(t1);
    }

    public final void a(x x1)
    {
        k = x1;
        b.obtainMessage(1, this).sendToTarget();
    }

    public final void a(Exception exception)
    {
        m = exception;
        b.obtainMessage(2, this).sendToTarget();
    }

    public final void b(f f1)
    {
        com.bumptech.glide.i.h.a();
        if (l || n)
        {
            if (o == null)
            {
                o = new HashSet();
            }
            o.add(f1);
        } else
        {
            c.remove(f1);
            if (c.isEmpty() && !n && !l && !j)
            {
                p.a();
                f1 = r;
                if (f1 != null)
                {
                    f1.cancel(true);
                }
                j = true;
                e.a(this, f);
                return;
            }
        }
    }

    public final void b(t t1)
    {
        r = h.submit(t1);
    }

}
