// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.view.View;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyNativeAdView, AdColonyNativeAdMutedListener, ADCImage

class a
    implements android.view.iew._cls2
{

    final AdColonyNativeAdView a;

    public void onClick(View view)
    {
        if (a.r)
        {
            if (a.M != null)
            {
                a.M.onAdColonyNativeAdMuted(a, true);
            }
            a.a(true, true);
            a.x = true;
        } else
        if (a.T == a.P.a)
        {
            if (a.M != null)
            {
                a.M.onAdColonyNativeAdMuted(a, false);
            }
            a.x = false;
            a.a(false, true);
            return;
        }
    }

    stener(AdColonyNativeAdView adcolonynativeadview)
    {
        a = adcolonynativeadview;
        super();
    }
}
