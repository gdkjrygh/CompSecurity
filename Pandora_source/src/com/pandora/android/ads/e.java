// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.crashlytics.android.d;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.pandora.android.provider.b;
import com.pandora.radio.util.k;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.android.ads:
//            h, d

class e extends AdListener
    implements OnCustomRenderedAdLoadedListener
{
    public static interface a
    {

        public abstract void a(com.pandora.radio.data.a a1, String s);
    }


    private final a a;
    private final String b;
    private final PublisherAdView c;
    private final h d;
    private final com.pandora.radio.util.a.a e;

    public e(a a1, String s, PublisherAdView publisheradview, h h1, com.pandora.radio.util.a.a a2)
    {
        a = a1;
        b = s;
        c = publisheradview;
        d = h1;
        e = a2;
    }

    private static String a(int i)
    {
        switch (i)
        {
        default:
            p.df.a.b("BANNER AD", "unknown google AdRequest error code %d", new Object[] {
                Integer.valueOf(i)
            });
            return (new StringBuilder()).append("unknown_").append(i).toString();

        case 0: // '\0'
            return "internal_error";

        case 1: // '\001'
            return "invalid_request";

        case 2: // '\002'
            return "network_error";

        case 3: // '\003'
            return "no_fill";
        }
    }

    private static String a(String s)
    {
        String s1 = s;
        if (s.length() > 74)
        {
            s1 = s.substring(74);
        }
        s = s1;
        if (s1.length() > 14)
        {
            s = s1.substring(0, s1.length() - 14);
        }
        return s;
    }

    public void onAdClosed()
    {
        p.df.a.c("BANNER AD", "onAdClosed");
        d.f();
    }

    public void onAdFailedToLoad(int i)
    {
        p.df.a.c("BANNER AD", (new StringBuilder()).append("onAdFailedToLoad = ").append(i).toString());
        a.a(null, b);
        String s = a(i);
        b.a.b().o().c(s, b);
    }

    public void onAdLeftApplication()
    {
        p.df.a.c("BANNER AD", "onAdLeftApplication");
    }

    public void onAdLoaded()
    {
        p.df.a.c("BANNER AD", "onAdLoaded");
        com.pandora.radio.data.a a1 = (new com.pandora.radio.data.a.b(null, c.getAdSize().getHeight(), com.pandora.radio.data.a.a.d)).a();
        a.a(a1, b);
    }

    public void onAdOpened()
    {
        p.df.a.c("BANNER AD", "onAdOpened");
    }

    public void onCustomRenderedAdLoaded(CustomRenderedAd customrenderedad)
    {
        p.df.a.c("BANNER AD", "renderRawHtmlAd");
        com.pandora.radio.data.a a1 = com.pandora.android.ads.d.a(a(customrenderedad.getContent()), "Google SDK", e);
        if (a1 != null)
        {
            a1.a(customrenderedad);
        } else
        {
            com.crashlytics.android.d.a(new IllegalArgumentException((new StringBuilder()).append("Null AdData, received content = ").append(customrenderedad.getContent()).toString()));
        }
        a.a(a1, b);
    }
}
