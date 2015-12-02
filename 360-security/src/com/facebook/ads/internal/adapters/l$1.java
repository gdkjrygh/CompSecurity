// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.os.Handler;
import com.facebook.ads.internal.util.h;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            l

class a
    implements Runnable
{

    final l a;

    public void run()
    {
        if (l.a(a))
        {
            return;
        }
        if (h.a(l.b(a), l.c(a), l.d(a)))
        {
            l.e(a).a();
            l.a(a, true);
            return;
        } else
        {
            l.g(a).postDelayed(l.f(a), 1000L);
            return;
        }
    }

    (l l1)
    {
        a = l1;
        super();
    }
}
