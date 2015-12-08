// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.e;
import com.bumptech.glide.h;
import com.bumptech.glide.load.resource.a;
import com.bumptech.glide.p;
import com.bumptech.glide.r;
import com.bumptech.glide.s;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            n, l, j, h, 
//            k, i

final class g
{

    private final i a;
    private final com.bumptech.glide.b.a b;
    private final Handler c;
    private boolean d;
    private boolean e;
    private e f;
    private com.bumptech.glide.load.resource.c.h g;
    private boolean h;

    public g(Context context, i i1, com.bumptech.glide.b.a a1, int j1, int k1)
    {
        n n1 = new n(com.bumptech.glide.h.a(context).a());
        l l1 = new l();
        com.bumptech.glide.load.b b1 = com.bumptech.glide.load.resource.a.b();
        this(i1, a1, com.bumptech.glide.h.b(context).a(l1, com/bumptech/glide/b/a).a(a1).a(android/graphics/Bitmap).a(b1).a(n1).a(true).b(com.bumptech.glide.load.b.e.b).a(j1, k1));
    }

    private g(i i1, com.bumptech.glide.b.a a1, e e1)
    {
        d = false;
        e = false;
        Handler handler = new Handler(Looper.getMainLooper(), new j(this, (byte)0));
        a = i1;
        b = a1;
        c = handler;
        f = e1;
    }

    private void e()
    {
        if (!d || e)
        {
            return;
        } else
        {
            e = true;
            b.a();
            long l1 = SystemClock.uptimeMillis();
            long l2 = b.b();
            com.bumptech.glide.load.resource.c.h h1 = new com.bumptech.glide.load.resource.c.h(c, b.d(), l1 + l2);
            f.a(new k()).a(h1);
            return;
        }
    }

    public final void a()
    {
        if (d)
        {
            return;
        } else
        {
            d = true;
            h = false;
            e();
            return;
        }
    }

    public final void a(com.bumptech.glide.load.g g1)
    {
        if (g1 == null)
        {
            throw new NullPointerException("Transformation must not be null");
        } else
        {
            f = f.a(new com.bumptech.glide.load.g[] {
                g1
            });
            return;
        }
    }

    final void a(com.bumptech.glide.load.resource.c.h h1)
    {
        if (h)
        {
            c.obtainMessage(2, h1).sendToTarget();
            return;
        }
        com.bumptech.glide.load.resource.c.h h2 = g;
        g = h1;
        a.b(com.bumptech.glide.load.resource.c.h.a(h1));
        if (h2 != null)
        {
            c.obtainMessage(2, h2).sendToTarget();
        }
        e = false;
        e();
    }

    public final void b()
    {
        d = false;
    }

    public final void c()
    {
        d = false;
        if (g != null)
        {
            com.bumptech.glide.h.a(g);
            g = null;
        }
        h = true;
    }

    public final Bitmap d()
    {
        if (g != null)
        {
            return g.a();
        } else
        {
            return null;
        }
    }
}
