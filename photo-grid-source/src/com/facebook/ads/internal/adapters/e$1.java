// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.os.Handler;
import com.facebook.ads.internal.util.g;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            e

class a
    implements Runnable
{

    final e a;

    public void run()
    {
        if (e.a(a))
        {
            return;
        }
        if (g.a(e.b(a), e.c(a), e.d(a)))
        {
            e.e(a).a();
            e.a(a, true);
            return;
        } else
        {
            e.h(a).postDelayed(e.f(a), com.facebook.ads.internal.adapters.e.g(a));
            return;
        }
    }

    (e e1)
    {
        a = e1;
        super();
    }
}
