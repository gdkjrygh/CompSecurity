// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.util.Log;
import com.facebook.ads.internal.adapters.e;
import com.facebook.ads.internal.util.a;
import com.facebook.ads.internal.util.g;

// Referenced classes of package com.facebook.ads.internal.view:
//            c

class <init>
{

    final c a;
    private final String b;

    public void alert(String s)
    {
        Log.e(b, s);
    }

    public String getAnalogInfo()
    {
        return g.a(com.facebook.ads.internal.util.a.a());
    }

    public void onPageInitialized()
    {
        if (!a.b())
        {
            c.c(a);
            if (c.d(a) != null)
            {
                c.d(a).a();
                return;
            }
        }
    }

    private e(c c1)
    {
        a = c1;
        super();
        b = com/facebook/ads/internal/view/c$b.getSimpleName();
    }

    b(c c1, b b1)
    {
        this(c1);
    }
}
