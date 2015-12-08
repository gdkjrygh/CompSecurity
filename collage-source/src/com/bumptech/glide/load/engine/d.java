// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.c;
import com.bumptech.glide.request.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Referenced classes of package com.bumptech.glide.load.engine:
//            j, h, e, EngineRunnable

class d
    implements EngineRunnable.a
{
    static class a
    {

        public com.bumptech.glide.load.engine.h a(j j1, boolean flag)
        {
            return new com.bumptech.glide.load.engine.h(j1, flag);
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
    private j k;
    private boolean l;
    private Exception m;
    private boolean n;
    private Set o;
    private EngineRunnable p;
    private com.bumptech.glide.load.engine.h q;
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
            f f1 = (f)iterator.next();
            if (!d(f1))
            {
                q.e();
                f1.a(q);
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
                f f1 = (f)iterator.next();
                if (!d(f1))
                {
                    f1.a(m);
                }
            }
        }
    }

    private void c(f f1)
    {
        if (o == null)
        {
            o = new HashSet();
        }
        o.add(f1);
    }

    private boolean d(f f1)
    {
        return o != null && o.contains(f1);
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

    public void a(EngineRunnable enginerunnable)
    {
        p = enginerunnable;
        r = g.submit(enginerunnable);
    }

    public void a(j j1)
    {
        k = j1;
        b.obtainMessage(1, this).sendToTarget();
    }

    public void a(f f1)
    {
        com.bumptech.glide.g.h.a();
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

    public void a(Exception exception)
    {
        m = exception;
        b.obtainMessage(2, this).sendToTarget();
    }

    public void b(EngineRunnable enginerunnable)
    {
        r = h.submit(enginerunnable);
    }

    public void b(f f1)
    {
        com.bumptech.glide.g.h.a();
        if (l || n)
        {
            c(f1);
        } else
        {
            c.remove(f1);
            if (c.isEmpty())
            {
                a();
                return;
            }
        }
    }

}
