// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.Activity;
import com.admarvel.android.ads.AdMarvelActivity;
import com.admarvel.android.ads.AdMarvelAd;
import com.admarvel.android.ads.AdMarvelInterstitialAds;
import com.admarvel.android.ads.AdMarvelVideoActivity;
import com.admarvel.android.ads.AdMarvelView;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.data.s;
import com.pandora.radio.data.af;
import com.pandora.radio.data.o;
import java.util.HashMap;
import java.util.Map;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            s

public class b
{

    private static volatile b a;
    private Activity b;
    private AdMarvelInterstitialAds c;
    private AdMarvelVideoActivity d;
    private AdMarvelActivity e;

    protected b()
    {
        d = null;
        e = null;
    }

    static Activity a(b b1)
    {
        return b1.b;
    }

    static AdMarvelActivity a(b b1, AdMarvelActivity admarvelactivity)
    {
        b1.e = admarvelactivity;
        return admarvelactivity;
    }

    static AdMarvelVideoActivity a(b b1, AdMarvelVideoActivity admarvelvideoactivity)
    {
        b1.d = admarvelvideoactivity;
        return admarvelvideoactivity;
    }

    public static b a()
    {
        com/pandora/android/util/b;
        JVM INSTR monitorenter ;
        b b1;
        if (a == null)
        {
            a = new b();
        }
        b1 = a;
        com/pandora/android/util/b;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    static void a(b b1, String s1)
    {
        b1.c(s1);
    }

    static AdMarvelInterstitialAds b(b b1)
    {
        return b1.c;
    }

    private void c(String s1)
    {
        if (d != null)
        {
            d.finish();
            d = null;
        }
        if (e != null)
        {
            e.finish();
            e = null;
        }
        com.pandora.android.ads.VideoAdManager.c.a().a(s1, null);
        b = null;
    }

    private Map d(String s1)
    {
        HashMap hashmap = new HashMap();
        af af1 = com.pandora.android.provider.b.a.d();
        hashmap.put("AGE", String.valueOf(af1.k()));
        hashmap.put("GENDER", af1.l());
        hashmap.put("POSTAL_CODE", af1.m());
        hashmap.put("TYPE", s1);
        hashmap.put("APP_VERSION", com.pandora.android.provider.b.a.i());
        s1 = com.pandora.android.provider.b.a.b().j().l();
        if (!com.pandora.android.util.s.a(s1))
        {
            hashmap.put("Collider_uid", s1);
        }
        return hashmap;
    }

    protected AdMarvelInterstitialAds a(Activity activity, int i, int j, int k, int l)
    {
        return new AdMarvelInterstitialAds(activity, i, j, k, l);
    }

    public void a(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        b = activity;
        this;
        JVM INSTR monitorexit ;
        return;
        activity;
        throw activity;
    }

    protected void a(com.admarvel.android.ads.AdMarvelInterstitialAds.AdMarvelInterstitialAdListener admarvelinterstitialadlistener)
    {
        AdMarvelInterstitialAds.setListener(admarvelinterstitialadlistener);
    }

    public void a(AdMarvelView admarvelview)
    {
        admarvelview.requestNewAd(d("banner"), "0c22152a73446f25", "4732", b);
    }

    public void a(String s1)
    {
        Object obj = (s)com.pandora.android.provider.c.a(s1);
        if (!(obj instanceof com.pandora.android.data.b))
        {
            p.df.a.c("VIDEO AD", "AdMarvelAdsHelper can only handle instances of AdMarvelVideoAdData");
            throw new IllegalArgumentException("AdMarvelAdsHelper can only handle instances of AdMarvelVideoAdData");
        } else
        {
            obj = (com.pandora.android.data.b)obj;
            s.k();
            c = a(b, 0, 0x726d6d, 65280, 0);
            AdMarvelInterstitialAds.setEnableClickRedirect(true);
            a(new com.admarvel.android.ads.AdMarvelInterstitialAds.AdMarvelInterstitialAdListener(s1) {

                final String a;
                final b b;

                public void onAdMarvelVideoActivityLaunched(AdMarvelVideoActivity admarvelvideoactivity)
                {
                    p.df.a.c("VIDEO AD", "admarvel interstitial onAdMarvelActivityVideoLaunched()");
                    com.pandora.android.util.b.a(b, admarvelvideoactivity);
                }

                public void onAdmarvelActivityLaunched(AdMarvelActivity admarvelactivity)
                {
                    p.df.a.c("VIDEO AD", "admarvel interstitial onAdMarvelActivityLaunched()");
                    com.pandora.android.util.b.a(b, admarvelactivity);
                }

                public void onClickInterstitialAd(String s2)
                {
                    p.df.a.c("VIDEO AD", (new StringBuilder()).append("admarvel interstitial onClickInterstitialAd() - arg0 = ").append(s2).toString());
                }

                public void onCloseInterstitialAd()
                {
                    com.pandora.android.util.b.a(b, a);
                    p.df.a.c("VIDEO AD", "admarvel interstitial onCloseInterstitialAd()");
                }

                public void onFailedToReceiveInterstitialAd(com.admarvel.android.ads.AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s2, int i, com.admarvel.android.ads.AdMarvelUtils.ErrorReason errorreason)
                {
                    p.df.a.c("VIDEO AD", (new StringBuilder()).append("admarvel interstitial onFailedToReceiveInterstitialAd() - SDKAdNetwork = ").append(sdkadnetwork).append(", arg1 = ").append(s2).append(", arg2 = ").append(i).append("Error reason = ").append(errorreason).toString());
                    com.pandora.android.util.b.a(b, a);
                }

                public void onReceiveInterstitialAd(com.admarvel.android.ads.AdMarvelUtils.SDKAdNetwork sdkadnetwork, String s2, AdMarvelAd admarvelad)
                {
                    p.df.a.c("VIDEO AD", (new StringBuilder()).append("admarvel interstitial onReceiveInterstitialAd() - SDKAdNetwork = ").append(sdkadnetwork).append(", arg1 = ").append(s2).append(", AdMarvelAd = ").append(admarvelad).toString());
                    b.b(b).displayInterstitial(com.pandora.android.util.b.a(b), sdkadnetwork, s2, admarvelad);
                }

                public void onRequestInterstitialAd()
                {
                    p.df.a.c("VIDEO AD", "admarvel interstitial onRequestInterstitialAd()");
                }

            
            {
                b = b.this;
                a = s1;
                super();
            }
            });
            c.requestNewInterstitialAd(b, d("video"), ((com.pandora.android.data.b) (obj)).a(), ((com.pandora.android.data.b) (obj)).b(), b);
            return;
        }
    }

    public void b(String s1)
    {
        s1 = s1.split(";");
        int j = s1.length;
        int i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    String s2 = s1[i];
                    if (!s2.startsWith("adm="))
                    {
                        break label0;
                    }
                    s1 = s2.split("=");
                    com.pandora.android.provider.b.a.b().j().a(s1[1]);
                }
                return;
            }
            i++;
        } while (true);
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
