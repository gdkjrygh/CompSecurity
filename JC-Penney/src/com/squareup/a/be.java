// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;

// Referenced classes of package com.squareup.a:
//            bm, bf, bh, k

class be
{

    final HandlerThread a = new HandlerThread("Picasso-Stats", 10);
    final k b;
    final Handler c;
    long d;
    long e;
    long f;
    long g;
    long h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;

    be(k k1)
    {
        b = k1;
        a.start();
        bm.a(a.getLooper());
        c = new bf(a.getLooper(), this);
    }

    private static long a(int i1, long l1)
    {
        return l1 / (long)i1;
    }

    private void a(Bitmap bitmap, int i1)
    {
        int j1 = bm.a(bitmap);
        c.sendMessage(c.obtainMessage(i1, j1, 0));
    }

    void a()
    {
        c.sendEmptyMessage(0);
    }

    void a(long l1)
    {
        c.sendMessage(c.obtainMessage(4, Long.valueOf(l1)));
    }

    void a(Bitmap bitmap)
    {
        a(bitmap, 2);
    }

    void a(Long long1)
    {
        l = l + 1;
        f = f + long1.longValue();
        i = a(l, f);
    }

    void b()
    {
        c.sendEmptyMessage(1);
    }

    void b(long l1)
    {
        m = m + 1;
        g = g + l1;
        j = a(m, g);
    }

    void b(Bitmap bitmap)
    {
        a(bitmap, 3);
    }

    void c()
    {
        d = d + 1L;
    }

    void c(long l1)
    {
        n = n + 1;
        h = h + l1;
        k = a(m, h);
    }

    void d()
    {
        e = e + 1L;
    }

    bh e()
    {
        return new bh(b.b(), b.a(), d, e, f, g, h, i, j, k, l, m, n, System.currentTimeMillis());
    }
}
