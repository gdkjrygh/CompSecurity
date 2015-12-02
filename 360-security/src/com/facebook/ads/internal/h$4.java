// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.os.Handler;
import android.view.View;
import com.facebook.ads.internal.adapters.b;
import com.facebook.ads.internal.adapters.c;

// Referenced classes of package com.facebook.ads.internal:
//            h, a

class a
    implements c
{

    final Runnable a;
    final h b;

    public void a(b b1)
    {
        h.d(b);
        h.j(b).c();
    }

    public void a(b b1, View view)
    {
        h.d(b);
        h.e(b).removeCallbacks(a);
        com.facebook.ads.internal.adapters.a a1 = h.f(b);
        com.facebook.ads.internal.h.b(b, b1);
        h.a(b, view);
        if (!h.g(b))
        {
            h.h(b).a();
            return;
        } else
        {
            h.i(b).a(view);
            h.a(b, a1);
            com.facebook.ads.internal.h.b(b);
            return;
        }
    }

    public void a(b b1, com.facebook.ads.c c1)
    {
        h.d(b);
        h.e(b).removeCallbacks(a);
        h.a(b, b1);
        com.facebook.ads.internal.h.c(b);
    }

    public void b(b b1)
    {
        h.d(b);
        h.k(b).b();
    }

    ters.b(h h1, Runnable runnable)
    {
        b = h1;
        a = runnable;
        super();
    }
}
