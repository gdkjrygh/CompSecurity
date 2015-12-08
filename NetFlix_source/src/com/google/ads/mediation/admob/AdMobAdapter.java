// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.admob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.dv;
import java.util.Iterator;
import java.util.Set;

public final class AdMobAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private static final class a extends AdListener
    {

        private final AdMobAdapter k;
        private final MediationBannerListener l;

        public void onAdClosed()
        {
            l.onAdClosed(k);
        }

        public void onAdFailedToLoad(int i1)
        {
            l.onAdFailedToLoad(k, i1);
        }

        public void onAdLeftApplication()
        {
            l.onAdLeftApplication(k);
        }

        public void onAdLoaded()
        {
            l.onAdLoaded(k);
        }

        public void onAdOpened()
        {
            l.onAdClicked(k);
            l.onAdOpened(k);
        }

        public a(AdMobAdapter admobadapter, MediationBannerListener mediationbannerlistener)
        {
            k = admobadapter;
            l = mediationbannerlistener;
        }
    }

    private static final class b extends AdListener
    {

        private final AdMobAdapter k;
        private final MediationInterstitialListener m;

        public void onAdClosed()
        {
            m.onAdClosed(k);
        }

        public void onAdFailedToLoad(int l)
        {
            m.onAdFailedToLoad(k, l);
        }

        public void onAdLeftApplication()
        {
            m.onAdLeftApplication(k);
        }

        public void onAdLoaded()
        {
            m.onAdLoaded(k);
        }

        public void onAdOpened()
        {
            m.onAdOpened(k);
        }

        public b(AdMobAdapter admobadapter, MediationInterstitialListener mediationinterstitiallistener)
        {
            k = admobadapter;
            m = mediationinterstitiallistener;
        }
    }


    private AdView i;
    private InterstitialAd j;

    public AdMobAdapter()
    {
    }

    private static AdRequest a(Context context, MediationAdRequest mediationadrequest, Bundle bundle, Bundle bundle1)
    {
        com.google.android.gms.ads.AdRequest.Builder builder = new com.google.android.gms.ads.AdRequest.Builder();
        Object obj = mediationadrequest.getBirthday();
        if (obj != null)
        {
            builder.setBirthday(((java.util.Date) (obj)));
        }
        int k = mediationadrequest.getGender();
        if (k != 0)
        {
            builder.setGender(k);
        }
        obj = mediationadrequest.getKeywords();
        if (obj != null)
        {
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); builder.addKeyword((String)((Iterator) (obj)).next())) { }
        }
        if (mediationadrequest.isTesting())
        {
            builder.addTestDevice(dv.l(context));
        }
        if (bundle1.getInt("tagForChildDirectedTreatment") != -1)
        {
            boolean flag;
            if (bundle1.getInt("tagForChildDirectedTreatment") == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            builder.tagForChildDirectedTreatment(flag);
        }
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        bundle.putInt("gw", 1);
        bundle.putString("mad_hac", bundle1.getString("mad_hac"));
        if (!TextUtils.isEmpty(bundle1.getString("adJson")))
        {
            bundle.putString("_ad", bundle1.getString("adJson"));
        }
        bundle.putBoolean("_noRefresh", true);
        builder.addNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter, bundle);
        return builder.build();
    }

    public View getBannerView()
    {
        return i;
    }

    public void onDestroy()
    {
        if (i != null)
        {
            i.destroy();
            i = null;
        }
        if (j != null)
        {
            j = null;
        }
    }

    public void onPause()
    {
        if (i != null)
        {
            i.pause();
        }
    }

    public void onResume()
    {
        if (i != null)
        {
            i.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        i = new AdView(context);
        i.setAdSize(new AdSize(adsize.getWidth(), adsize.getHeight()));
        i.setAdUnitId(bundle.getString("pubid"));
        i.setAdListener(new a(this, mediationbannerlistener));
        i.loadAd(a(context, mediationadrequest, bundle1, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        j = new InterstitialAd(context);
        j.setAdUnitId(bundle.getString("pubid"));
        j.setAdListener(new b(this, mediationinterstitiallistener));
        j.loadAd(a(context, mediationadrequest, bundle1, bundle));
    }

    public void showInterstitial()
    {
        j.show();
    }
}
