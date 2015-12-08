// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.a;
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.c;
import com.facebook.ads.internal.h;
import com.facebook.ads.internal.util.g;

// Referenced classes of package com.facebook.ads:
//            Ad, AdSize, AdError, InterstitialAdListener, 
//            ImpressionListener

public class InterstitialAd
    implements Ad
{

    private static final c a;
    private final Context b;
    private final String c;
    private h d;
    private boolean e;
    private boolean f;
    private InterstitialAdListener g;
    private ImpressionListener h;

    public InterstitialAd(Context context, String s)
    {
        b = context;
        c = s;
    }

    static InterstitialAdListener a(InterstitialAd interstitialad)
    {
        return interstitialad.g;
    }

    static h a(InterstitialAd interstitialad, h h1)
    {
        interstitialad.d = h1;
        return h1;
    }

    static boolean a(InterstitialAd interstitialad, boolean flag)
    {
        interstitialad.e = flag;
        return flag;
    }

    static ImpressionListener b(InterstitialAd interstitialad)
    {
        return interstitialad.h;
    }

    static boolean b(InterstitialAd interstitialad, boolean flag)
    {
        interstitialad.f = flag;
        return flag;
    }

    static h c(InterstitialAd interstitialad)
    {
        return interstitialad.d;
    }

    public void destroy()
    {
        if (d != null)
        {
            d.d();
            d = null;
        }
    }

    public boolean isAdLoaded()
    {
        return e;
    }

    public void loadAd()
    {
        e = false;
        if (f)
        {
            throw new IllegalStateException("InterstitialAd cannot be loaded while being displayed. Make sure your adapter calls adapterListener.onInterstitialDismissed().");
        }
        if (d != null)
        {
            d.d();
            d = null;
        }
        AdSize adsize = AdSize.INTERSTITIAL;
        com.facebook.ads.internal.e e1 = com.facebook.ads.internal.util.g.a(AdSize.INTERSTITIAL);
        d = new h(b, c, e1, adsize, a, 1, true);
        d.a(new a() {

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
                if (com.facebook.ads.InterstitialAd.c(a) != null)
                {
                    com.facebook.ads.InterstitialAd.c(a).d();
                    com.facebook.ads.InterstitialAd.a(a, null);
                }
                if (com.facebook.ads.InterstitialAd.a(a) != null)
                {
                    com.facebook.ads.InterstitialAd.a(a).onInterstitialDismissed(a);
                }
            }

            
            {
                a = InterstitialAd.this;
                super();
            }
        });
        d.b();
    }

    public void setAdListener(InterstitialAdListener interstitialadlistener)
    {
        g = interstitialadlistener;
    }

    public void setImpressionListener(ImpressionListener impressionlistener)
    {
        h = impressionlistener;
    }

    public boolean show()
    {
        if (!e)
        {
            if (g != null)
            {
                g.onError(this, AdError.INTERNAL_ERROR);
            }
            return false;
        } else
        {
            d.c();
            f = true;
            e = false;
            return true;
        }
    }

    static 
    {
        a = c.a;
    }
}
