// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.s;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p.al.g;
import p.ap.h;
import p.q.c;

// Referenced classes of package p.s:
//            k, h, e, i

class d
    implements i.a
{
    static class a
    {

        public p.s.h a(k k1, boolean flag)
        {
            return new p.s.h(k1, flag);
        }

        a()
        {
        }
    }

    private static class b
        implements android.os.Handler.Callback
    {

        public boolean handleMessage(Message message)
        {
            if (1 == message.what || 2 == message.what)
            {
                d d1 = (d)message.obj;
                if (1 == message.what)
                {
                    d.a(d1);
                } else
                {
                    d.b(d1);
                }
                return true;
            } else
            {
                return false;
            }
        }

        private b()
        {
        }

    }


    private static final a a = new a();
    private static final Handler b = new Handler(Looper.getMainLooper(), new b());
    private final List c;
    private final a d;
    private final e e;
    private final c f;
    private final ExecutorService g;
    private final ExecutorService h;
    private final boolean i;
    private boolean j;
    private k k;
    private boolean l;
    private Exception m;
    private boolean n;
    private Set o;
    private i p;
    private p.s.h q;
    private volatile Future r;

    public d(c c1, ExecutorService executorservice, ExecutorService executorservice1, boolean flag, e e1)
    {
        this(c1, executorservice, executorservice1, flag, e1, a);
    }

    public d(c c1, ExecutorService executorservice, ExecutorService executorservice1, boolean flag, e e1, a a1)
    {
        c = new ArrayList();
        f = c1;
        g = executorservice;
        h = executorservice1;
        i = flag;
        e = e1;
        d = a1;
    }

    static void a(d d1)
    {
        d1.b();
    }

    private void b()
    {
        if (j)
        {
            k.d();
            return;
        }
        if (c.isEmpty())
        {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        }
        q = d.a(k, i);
        l = true;
        q.e();
        e.a(f, q);
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            g g1 = (g)iterator.next();
            if (!d(g1))
            {
                q.e();
                g1.a(q);
            }
        } while (true);
        q.f();
    }

    static void b(d d1)
    {
        d1.c();
    }

    private void c()
    {
        if (!j)
        {
            if (c.isEmpty())
            {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            n = true;
            e.a(f, null);
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                g g1 = (g)iterator.next();
                if (!d(g1))
                {
                    g1.a(m);
                }
            }
        }
    }

    private void c(g g1)
    {
        if (o == null)
        {
            o = new HashSet();
        }
        o.add(g1);
    }

    private boolean d(g g1)
    {
        return o != null && o.contains(g1);
    }

    void a()
    {
        if (n || l || j)
        {
            return;
        }
        p.a();
        Future future = r;
        if (future != null)
        {
            future.cancel(true);
        }
        j = true;
        e.a(this, f);
    }

    public void a(Exception exception)
    {
        m = exception;
        b.obtainMessage(2, this).sendToTarget();
    }

    public void a(g g1)
    {
        p.ap.h.a();
        if (l)
        {
            g1.a(q);
            return;
        }
        if (n)
        {
            g1.a(m);
            return;
        } else
        {
            c.add(g1);
            return;
        }
    }

    public void a(i i1)
    {
        p = i1;
        r = g.submit(i1);
    }

    public void a(k k1)
    {
        k = k1;
        b.obtainMessage(1, this).sendToTarget();
    }

    public void b(g g1)
    {
        p.ap.h.a();
        if (l || n)
        {
            c(g1);
        } else
        {
            c.remove(g1);
            if (c.isEmpty())
            {
                a();
                return;
            }
        }
    }

    public void b(i i1)
    {
        r = h.submit(i1);
    }

}
