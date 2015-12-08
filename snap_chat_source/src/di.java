// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzbe;
import com.google.android.gms.internal.zzhw;
import java.util.Iterator;
import java.util.Set;

public final class di
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    static final class a extends AdListener
        implements zzat
    {

        private di a;
        private MediationBannerListener b;

        public final void onAdClicked()
        {
            b.onAdClicked(a);
        }

        public final void onAdClosed()
        {
            b.onAdClosed(a);
        }

        public final void onAdFailedToLoad(int i)
        {
            b.onAdFailedToLoad(a, i);
        }

        public final void onAdLeftApplication()
        {
            b.onAdLeftApplication(a);
        }

        public final void onAdLoaded()
        {
            b.onAdLoaded(a);
        }

        public final void onAdOpened()
        {
            b.onAdOpened(a);
        }

        public a(di di1, MediationBannerListener mediationbannerlistener)
        {
            a = di1;
            b = mediationbannerlistener;
        }
    }

    static final class b extends AdListener
        implements zzat
    {

        private di a;
        private MediationInterstitialListener b;

        public final void onAdClicked()
        {
            b.onAdClicked(a);
        }

        public final void onAdClosed()
        {
            b.onAdClosed(a);
        }

        public final void onAdFailedToLoad(int i)
        {
            b.onAdFailedToLoad(a, i);
        }

        public final void onAdLeftApplication()
        {
            b.onAdLeftApplication(a);
        }

        public final void onAdLoaded()
        {
            b.onAdLoaded(a);
        }

        public final void onAdOpened()
        {
            b.onAdOpened(a);
        }

        public b(di di1, MediationInterstitialListener mediationinterstitiallistener)
        {
            a = di1;
            b = mediationinterstitiallistener;
        }
    }


    private AdView a;
    private InterstitialAd b;

    public di()
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
        int i = mediationadrequest.getGender();
        if (i != 0)
        {
            builder.setGender(i);
        }
        obj = mediationadrequest.getKeywords();
        if (obj != null)
        {
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); builder.addKeyword((String)((Iterator) (obj)).next())) { }
        }
        obj = mediationadrequest.getLocation();
        if (obj != null)
        {
            builder.setLocation(((android.location.Location) (obj)));
        }
        if (mediationadrequest.isTesting())
        {
            builder.addTestDevice(zzbe.zzbD().zzz(context));
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
        builder.addNetworkExtrasBundle(di, bundle);
        return builder.build();
    }

    public final View getBannerView()
    {
        return a;
    }

    public final void onDestroy()
    {
        if (a != null)
        {
            a.destroy();
            a = null;
        }
        if (b != null)
        {
            b = null;
        }
    }

    public final void onPause()
    {
        if (a != null)
        {
            a.pause();
        }
    }

    public final void onResume()
    {
        if (a != null)
        {
            a.resume();
        }
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        a = new AdView(context);
        a.setAdSize(new AdSize(adsize.getWidth(), adsize.getHeight()));
        a.setAdUnitId(bundle.getString("pubid"));
        a.setAdListener(new a(this, mediationbannerlistener));
        a.loadAd(a(context, mediationadrequest, bundle1, bundle));
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        b = new InterstitialAd(context);
        b.setAdUnitId(bundle.getString("pubid"));
        b.setAdListener(new b(this, mediationinterstitiallistener));
        b.loadAd(a(context, mediationadrequest, bundle1, bundle));
    }

    public final void showInterstitial()
    {
        b.show();
    }
}
