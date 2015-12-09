// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package a.a:
//            hm, jn, ja

public final class hl
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
    final jn o;
    final jn p;
    public final ja q;
    final Handler r;
    public final boolean s;

    private hl(hm hm1)
    {
        a = hm1.a;
        b = hm1.b;
        c = hm1.c;
        d = hm1.d;
        e = hm1.e;
        f = hm1.f;
        g = hm1.g;
        h = hm1.h;
        i = hm1.i;
        j = hm1.j;
        k = hm1.k;
        l = hm1.l;
        m = hm1.m;
        n = hm1.n;
        o = hm1.o;
        p = hm1.p;
        q = hm1.q;
        r = hm1.r;
        s = hm1.s;
    }

    hl(hm hm1, byte byte0)
    {
        this(hm1);
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
