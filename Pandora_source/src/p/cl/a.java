// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cl;

import android.os.Handler;
import android.os.SystemClock;

public class p.cl.a
{
    private class a
        implements Runnable
    {

        final p.cl.a a;
        private long b;

        public void a()
        {
            b = p.cl.a.a(a);
        }

        public void run()
        {
            if (a.e() <= 0L)
            {
                if (p.cl.a.b(a) != null)
                {
                    p.cl.a.b(a).a();
                }
                return;
            }
            if (b <= 2L)
            {
                b = 1L;
            } else
            {
                b = b / 2L;
            }
            p.cl.a.c(a).postDelayed(this, b);
        }

        public a()
        {
            a = p.cl.a.this;
            super();
            a();
        }
    }

    public static interface b
    {

        public abstract void a();
    }


    private long a;
    private long b;
    private Handler c;
    private a d;
    private b e;

    public p.cl.a(long l)
    {
        a = l;
        d = new a();
        c = new Handler();
    }

    static long a(p.cl.a a1)
    {
        return a1.a;
    }

    static b b(p.cl.a a1)
    {
        return a1.e;
    }

    static Handler c(p.cl.a a1)
    {
        return a1.c;
    }

    private void f()
    {
        c.removeCallbacks(d);
        d.a();
    }

    public void a()
    {
        if (!c())
        {
            b = SystemClock.elapsedRealtime();
            c.post(d);
        }
    }

    public void a(b b1)
    {
        e = b1;
    }

    public void b()
    {
        b = SystemClock.elapsedRealtime();
        f();
        c.post(d);
    }

    public boolean c()
    {
        return b > 0L;
    }

    public void d()
    {
        b = 0L;
        f();
    }

    public long e()
    {
        return a - (SystemClock.elapsedRealtime() - b);
    }
}
