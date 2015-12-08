// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

// Referenced classes of package bo.app:
//            iu, ku, ki

public final class it
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
    final ku o;
    final ku p;
    public final ki q;
    final Handler r;
    public final boolean s;

    private it(iu iu1)
    {
        a = iu1.a;
        b = iu1.b;
        c = iu1.c;
        d = iu1.d;
        e = iu1.e;
        f = iu1.f;
        g = iu1.g;
        h = iu1.h;
        i = iu1.i;
        j = iu1.j;
        k = iu1.k;
        l = iu1.l;
        m = iu1.m;
        n = iu1.n;
        o = iu1.o;
        p = iu1.p;
        q = iu1.q;
        r = iu1.r;
        s = iu1.s;
    }

    it(iu iu1, byte byte0)
    {
        this(iu1);
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
