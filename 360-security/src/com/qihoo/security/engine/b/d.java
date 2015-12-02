// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.b;

import android.os.Handler;
import com.qihoo.security.services.ScanProgress;
import com.qihoo.security.services.ScanResult;
import com.qihoo.security.services.a;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.qihoo.security.engine.b:
//            c

public class d
{

    boolean a;
    final c b;
    final AtomicInteger c = new AtomicInteger(0);
    final AtomicInteger d = new AtomicInteger(0);
    volatile int e;
    volatile int f;
    volatile long g;
    long h;
    int i;
    final Handler j;
    final Runnable k = new Runnable() {

        final d a;

        private void a(int i1, int j1)
        {
            ScanResult scanresult1 = (ScanResult)a.m.poll();
            ScanResult scanresult = scanresult1;
            if (scanresult1 == null)
            {
                scanresult = (ScanResult)a.l.poll();
            }
            if (scanresult != null)
            {
                a.b.a(new ScanProgress(scanresult, a.g(), i1, j1), false);
            }
        }

        public void run()
        {
            if (a.o)
            {
                a.d();
            } else
            {
                int i1 = a.i();
                int j1 = a.h();
                if (a.n)
                {
                    ArrayList arraylist = new ArrayList();
                    arraylist.addAll(a.m);
                    a.b.b(arraylist);
                    a.d();
                    return;
                }
                if (!a.p)
                {
                    a(j1, i1);
                    a.j.postDelayed(a.k, Math.max(a.g, 200L));
                    return;
                }
            }
        }

            
            {
                a = d.this;
                super();
            }
    };
    final ConcurrentLinkedQueue l = new ConcurrentLinkedQueue();
    final ConcurrentLinkedQueue m = new ConcurrentLinkedQueue();
    volatile boolean n;
    volatile boolean o;
    volatile boolean p;
    private volatile int q;

    public d(c c1, Handler handler)
    {
        a = false;
        q = 0;
        e = -1;
        f = 0;
        g = 0L;
        h = 0L;
        i = 0;
        n = false;
        o = false;
        p = false;
        b = c1;
        j = handler;
    }

    public void a()
    {
        d();
        h = System.currentTimeMillis();
        j.postDelayed(k, 200L);
    }

    public void a(int i1)
    {
        e = i1;
    }

    public void a(ScanResult scanresult)
    {
        if (scanresult.state == 127)
        {
            int i1;
            try
            {
                b.e.e().a(scanresult);
            }
            catch (Exception exception) { }
            if (h == 0L)
            {
                b.a(new ScanProgress(scanresult, 0, 1, 1), true);
                return;
            }
            if (a)
            {
                int j1 = c.get();
                i1 = j1;
                if (d.incrementAndGet() == c.get())
                {
                    a = false;
                    d.set(0);
                    i1 = j1;
                }
            } else
            {
                i1 = c.incrementAndGet();
            }
            if (i1 > 20)
            {
                g = (System.currentTimeMillis() - h) / (long)i1;
            }
            m.offer(scanresult);
            return;
        } else
        {
            l.offer(scanresult);
            return;
        }
    }

    public void b()
    {
        n = true;
    }

    public void b(int i1)
    {
        if (i1 < 10)
        {
            q = 10;
            return;
        } else
        {
            q = i1;
            return;
        }
    }

    public void c()
    {
        o = true;
    }

    public void c(int i1)
    {
        f = f + i1;
    }

    public void d()
    {
        n = false;
        o = false;
        p = false;
        c.set(0);
        i = 0;
        h = 0L;
        g = 0L;
        e = -1;
        f = 0;
        l.clear();
        m.clear();
        j.removeCallbacks(k);
    }

    public void e()
    {
        p = true;
    }

    public void f()
    {
        p = false;
        j.post(k);
    }

    public int g()
    {
        int i1;
        if (e == 0 && f == 0)
        {
            i1 = 100;
        } else
        {
            i1 = c.get();
            long l2 = i() - i1;
            long l1;
            long l3;
            if (g > 0L)
            {
                l1 = g;
            } else
            {
                l1 = 200L;
            }
            l3 = System.currentTimeMillis() - h;
            l1 = l1 * l2 + l3;
            if (l1 > 0L)
            {
                i1 = (int)((l3 * 100L) / l1);
            } else
            {
                i1 = 0;
            }
        }
        if (i < i1)
        {
            i = i1;
        }
        return i;
    }

    public int h()
    {
        return c.get();
    }

    public int i()
    {
        if (e >= 0)
        {
            return e + f;
        }
        int i1 = c.get();
        if (q < i1 + (i1 >> 2))
        {
            q = q + (q >> 2);
        }
        return q;
    }
}
