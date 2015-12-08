// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.util.Log;
import com.facebook.ads.internal.view.e;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            m, l

class a
    implements Runnable
{

    final m a;

    public void run()
    {
        if (m.a(a).b())
        {
            Log.w(com.facebook.ads.internal.adapters.m.e(), "Webview already destroyed, cannot activate");
            return;
        } else
        {
            m.a(a).loadUrl((new StringBuilder("javascript:")).append(m.b(a).e()).toString());
            return;
        }
    }

    (m m1)
    {
        a = m1;
        super();
    }
}
