// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import android.os.Looper;
import com.bumptech.glide.load.c;

// Referenced classes of package com.bumptech.glide.load.engine:
//            j

class h
    implements j
{
    static interface a
    {

        public abstract void b(c c1, h h1);
    }


    private final j a;
    private final boolean b;
    private a c;
    private c d;
    private int e;
    private boolean f;

    h(j j1, boolean flag)
    {
        if (j1 == null)
        {
            throw new NullPointerException("Wrapped resource must not be null");
        } else
        {
            a = j1;
            b = flag;
            return;
        }
    }

    void a(c c1, a a1)
    {
        d = c1;
        c = a1;
    }

    boolean a()
    {
        return b;
    }

    public Object b()
    {
        return a.b();
    }

    public int c()
    {
        return a.c();
    }

    public void d()
    {
        if (e > 0)
        {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (f)
        {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else
        {
            f = true;
            a.d();
            return;
        }
    }

    void e()
    {
        if (f)
        {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper()))
        {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        } else
        {
            e = e + 1;
            return;
        }
    }

    void f()
    {
        if (e <= 0)
        {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper()))
        {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i = e - 1;
        e = i;
        if (i == 0)
        {
            c.b(d, this);
        }
    }
}
