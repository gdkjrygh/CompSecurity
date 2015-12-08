// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.os.Handler;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.adapters.p;
import com.facebook.ads.internal.adapters.q;

// Referenced classes of package com.facebook.ads.internal:
//            h, a

class a
    implements q
{

    final Runnable a;
    final h b;

    public void a(p p)
    {
        h.d(b);
        h.e(b).removeCallbacks(a);
        h.b(b, p);
        h.s(b).a();
    }

    public void a(p p, AdError aderror)
    {
        h.d(b);
        h.e(b).removeCallbacks(a);
        h.a(b, p);
        h.c(b);
    }

    ters.p(h h1, Runnable runnable)
    {
        b = h1;
        a = runnable;
        super();
    }
}
