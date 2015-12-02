// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;

final class cgx
{

    final HandlerThread a = new HandlerThread("Picasso-Stats", 10);
    final cfi b;
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

    cgx(cfi cfi1)
    {
        b = cfi1;
        a.start();
        c = new cgy(a.getLooper(), this);
    }

    private static long a(int i1, long l1)
    {
        return l1 / (long)i1;
    }

    private void a(Bitmap bitmap, int i1)
    {
        int j1 = chf.a(bitmap);
        c.sendMessage(c.obtainMessage(i1, j1, 0));
    }

    final void a()
    {
        c.sendEmptyMessage(0);
    }

    final void a(long l1)
    {
        c.sendMessage(c.obtainMessage(4, Long.valueOf(l1)));
    }

    final void a(Bitmap bitmap)
    {
        a(bitmap, 2);
    }

    final void a(Long long1)
    {
        l = l + 1;
        f = f + long1.longValue();
        i = a(l, f);
    }

    final void b()
    {
        c.sendEmptyMessage(1);
    }

    final void b(long l1)
    {
        m = m + 1;
        g = g + l1;
        j = a(m, g);
    }

    final void b(Bitmap bitmap)
    {
        a(bitmap, 3);
    }

    final void c()
    {
        d = d + 1L;
    }

    final void c(long l1)
    {
        n = n + 1;
        h = h + l1;
        k = a(m, h);
    }

    final void d()
    {
        e = e + 1L;
    }

    final cgz e()
    {
        return new cgz(b.b(), b.a(), d, e, f, g, h, i, j, k, l, m, n, System.currentTimeMillis());
    }
}
