// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.view.View;
import com.facebook.ads.internal.a;
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.h;

// Referenced classes of package com.facebook.ads:
//            InterstitialAd, InterstitialAdListener, ImpressionListener

class  extends a
{

    final InterstitialAd a;

    public void a()
    {
        com.facebook.ads.InterstitialAd.a(a, true);
        if (com.facebook.ads.InterstitialAd.a(a) != null)
        {
            com.facebook.ads.InterstitialAd.a(a).onAdLoaded(a);
        }
    }

    public void a(View view)
    {
    }

    public void a(b b1)
    {
        if (com.facebook.ads.InterstitialAd.a(a) != null)
        {
            com.facebook.ads.InterstitialAd.a(a).onError(a, b1.b());
        }
    }

    public void b()
    {
        if (com.facebook.ads.InterstitialAd.a(a) != null)
        {
            com.facebook.ads.InterstitialAd.a(a).onAdClicked(a);
        }
    }

    public void c()
    {
        if (com.facebook.ads.InterstitialAd.b(a) != null)
        {
            com.facebook.ads.InterstitialAd.b(a).onLoggingImpression(a);
        }
        if ((com.facebook.ads.InterstitialAd.a(a) instanceof ImpressionListener) && com.facebook.ads.InterstitialAd.a(a) != com.facebook.ads.InterstitialAd.b(a))
        {
            ((ImpressionListener)com.facebook.ads.InterstitialAd.a(a)).onLoggingImpression(a);
        }
    }

    public void d()
    {
        if (com.facebook.ads.InterstitialAd.a(a) != null)
        {
            com.facebook.ads.InterstitialAd.a(a).onInterstitialDisplayed(a);
        }
    }

    public void e()
    {
        com.facebook.ads.InterstitialAd.b(a, false);
        if (InterstitialAd.c(a) != null)
        {
            InterstitialAd.c(a).d();
            com.facebook.ads.InterstitialAd.a(a, null);
        }
        if (com.facebook.ads.InterstitialAd.a(a) != null)
        {
            com.facebook.ads.InterstitialAd.a(a).onInterstitialDismissed(a);
        }
    }

    r(InterstitialAd interstitialad)
    {
        a = interstitialad;
        super();
    }
}
