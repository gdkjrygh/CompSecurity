// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package bo.app:
//            io, ko, kc

public final class in
{

    public final int a;
    public final int b;
    final int c;
    public final Drawable d;
    public final Drawable e;
    final Drawable f;
    public final boolean g;
    final boolean h;
    final boolean i;
    public final int j;
    public final android.graphics.BitmapFactory.Options k;
    final int l;
    public final boolean m;
    public final Object n;
    final ko o;
    final ko p;
    public final kc q;
    final Handler r;
    public final boolean s;

    private in(io io1)
    {
        a = io1.a;
        b = io1.b;
        c = io1.c;
        d = io1.d;
        e = io1.e;
        f = io1.f;
        g = io1.g;
        h = io1.h;
        i = io1.i;
        j = io1.j;
        k = io1.k;
        l = io1.l;
        m = io1.m;
        n = io1.n;
        o = io1.o;
        p = io1.p;
        q = io1.q;
        r = io1.r;
        s = io1.s;
    }

    in(io io1, byte byte0)
    {
        this(io1);
    }

    public final boolean a()
    {
        return p != null;
    }

    public final Handler b()
    {
        if (s)
        {
            return null;
        }
        if (r == null)
        {
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                throw new IllegalStateException("ImageLoader.displayImage(...) must be invoked from the main thread or from Looper thread");
            } else
            {
                return new Handler();
            }
        } else
        {
            return r;
        }
    }
}
