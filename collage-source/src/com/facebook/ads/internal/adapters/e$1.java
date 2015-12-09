// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.os.Handler;
import android.view.View;
import com.facebook.ads.internal.util.g;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            e

class a
    implements Runnable
{

    final e a;

    public void run()
    {
        if (!e.a(a))
        {
            View view = (View)e.b(a).get();
            a a1 = (a)e.c(a).get();
            if (view != null && a1 != null)
            {
                if (g.a(e.d(a), view, e.e(a)))
                {
                    a1.a();
                    e.a(a, true);
                    return;
                } else
                {
                    a1.b();
                    e.h(a).postDelayed(e.f(a), com.facebook.ads.internal.adapters.e.g(a));
                    return;
                }
            }
        }
    }

    (e e1)
    {
        a = e1;
        super();
    }
}
