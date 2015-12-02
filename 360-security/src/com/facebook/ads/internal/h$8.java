// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.os.Handler;
import com.facebook.ads.c;
import com.facebook.ads.internal.adapters.u;
import com.facebook.ads.internal.adapters.v;

// Referenced classes of package com.facebook.ads.internal:
//            h, a

class a
    implements v
{

    final Runnable a;
    final h b;

    public void a(u u)
    {
        h.d(b);
        h.e(b).removeCallbacks(a);
        h.b(b, u);
        h.r(b).a();
    }

    public void a(u u, c c)
    {
        h.d(b);
        h.e(b).removeCallbacks(a);
        h.a(b, u);
        com.facebook.ads.internal.h.c(b);
    }

    ters.u(h h1, Runnable runnable)
    {
        b = h1;
        a = runnable;
        super();
    }
}
