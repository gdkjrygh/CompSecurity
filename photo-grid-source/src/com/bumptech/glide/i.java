// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.b.b.b;
import com.bumptech.glide.load.b.b.k;
import com.bumptech.glide.load.b.b.m;
import com.bumptech.glide.load.b.b.n;
import com.bumptech.glide.load.b.b.p;
import com.bumptech.glide.load.b.c.a;
import com.bumptech.glide.load.b.f;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.bumptech.glide:
//            h

public final class i
{

    private final Context a;
    private f b;
    private e c;
    private n d;
    private ExecutorService e;
    private ExecutorService f;
    private com.bumptech.glide.load.a g;
    private b h;

    public i(Context context)
    {
        a = context.getApplicationContext();
    }

    final h a()
    {
        if (e == null)
        {
            e = new a(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (f == null)
        {
            f = new a(1);
        }
        p p1 = new p(a);
        if (c == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                c = new com.bumptech.glide.load.b.a.i(p1.b());
            } else
            {
                c = new com.bumptech.glide.load.b.a.f();
            }
        }
        if (d == null)
        {
            d = new m(p1.a());
        }
        if (h == null)
        {
            h = new k(a);
        }
        if (b == null)
        {
            b = new f(d, h, f, e);
        }
        if (g == null)
        {
            g = com.bumptech.glide.load.a.d;
        }
        return new h(b, d, c, a, g);
    }

    public final i a(b b1)
    {
        h = b1;
        return this;
    }
}
