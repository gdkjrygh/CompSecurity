// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.os.Looper;
import com.bumptech.glide.load.c;

// Referenced classes of package com.bumptech.glide.load.b:
//            x, s

final class r
    implements x
{

    private final x a;
    private final boolean b;
    private s c;
    private c d;
    private int e;
    private boolean f;

    r(x x1, boolean flag)
    {
        if (x1 == null)
        {
            throw new NullPointerException("Wrapped resource must not be null");
        } else
        {
            a = x1;
            b = flag;
            return;
        }
    }

    final void a(c c1, s s1)
    {
        d = c1;
        c = s1;
    }

    final boolean a()
    {
        return b;
    }

    public final Object b()
    {
        return a.b();
    }

    public final int c()
    {
        return a.c();
    }

    public final void d()
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

    final void e()
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

    final void f()
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
