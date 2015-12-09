// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.util.Log;
import com.facebook.ads.internal.adapters.e;
import com.facebook.ads.internal.util.a;
import com.facebook.ads.internal.util.g;

// Referenced classes of package com.facebook.ads.internal.view:
//            a

public class a
{

    final com.facebook.ads.internal.view.a a;
    private final String b = com/facebook/ads/internal/view/a$c.getSimpleName();

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
            com.facebook.ads.internal.view.a.a(a).a();
            if (com.facebook.ads.internal.view.a.b(a) != null)
            {
                com.facebook.ads.internal.view.a.b(a).a();
                return;
            }
        }
    }

    public e(com.facebook.ads.internal.view.a a1)
    {
        a = a1;
        super();
    }
}
