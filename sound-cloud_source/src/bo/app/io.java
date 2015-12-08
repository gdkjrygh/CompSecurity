// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package bo.app:
//            ip, kp, kd

public final class io
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
    final kp o;
    final kp p;
    public final kd q;
    final Handler r;
    public final boolean s;

    private io(ip ip1)
    {
        a = ip1.a;
        b = ip1.b;
        c = ip1.c;
        d = ip1.d;
        e = ip1.e;
        f = ip1.f;
        g = ip1.g;
        h = ip1.h;
        i = ip1.i;
        j = ip1.j;
        k = ip1.k;
        l = ip1.l;
        m = ip1.m;
        n = ip1.n;
        o = ip1.o;
        p = ip1.p;
        q = ip1.q;
        r = ip1.r;
        s = ip1.s;
    }

    io(ip ip1, byte byte0)
    {
        this(ip1);
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
