// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bq;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import java.util.Iterator;
import java.util.Set;

public abstract class p.bq.a
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    static final class a extends AdListener
        implements com.google.android.gms.ads.internal.client.zza
    {

        final p.bq.a a;
        final MediationBannerListener b;

        public void onAdClicked()
        {
            b.onAdClicked(a);
        }

        public void onAdClosed()
        {
            b.onAdClosed(a);
        }

        public void onAdFailedToLoad(int i)
        {
            b.onAdFailedToLoad(a, i);
        }

        public void onAdLeftApplication()
        {
            b.onAdLeftApplication(a);
        }

        public void onAdLoaded()
        {
            b.onAdLoaded(a);
        }

        public void onAdOpened()
        {
            b.onAdOpened(a);
        }

        public a(p.bq.a a1, MediationBannerListener mediationbannerlistener)
        {
            a = a1;
            b = mediationbannerlistener;
        }
    }

    static final class b extends AdListener
        implements com.google.android.gms.ads.internal.client.zza
    {

        final p.bq.a a;
        final MediationInterstitialListener b;

        public void onAdClicked()
        {
            b.onAdClicked(a);
        }

        public void onAdClosed()
        {
            b.onAdClosed(a);
        }

        public void onAdFailedToLoad(int i)
        {
            b.onAdFailedToLoad(a, i);
        }

        public void onAdLeftApplication()
        {
            b.onAdLeftApplication(a);
        }

        public void onAdLoaded()
        {
            b.onAdLoaded(a);
        }

        public void onAdOpened()
        {
            b.onAdOpened(a);
        }

        public b(p.bq.a a1, MediationInterstitialListener mediationinterstitiallistener)
        {
            a = a1;
            b = mediationinterstitiallistener;
        }
    }


    private AdView a;
    private InterstitialAd b;

    public p.bq.a()
    {
    }

    protected abstract Bundle a(Bundle bundle, Bundle bundle1);

    AdRequest a(Context context, MediationAdRequest mediationadrequest, Bundle bundle, Bundle bundle1)
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
            builder.addTestDevice(zzj.zzbJ().zzC(context));
        }
        if (mediationadrequest.taggedForChildDirectedTreatment() != -1)
        {
            boolean flag;
            if (mediationadrequest.taggedForChildDirectedTreatment() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            builder.tagForChildDirectedTreatment(flag);
        }
        builder.addNetworkExtrasBundle(p/br/a, a(bundle, bundle1));
        return builder.build();
    }

    public View getBannerView()
    {
        return a;
    }

    public void onDestroy()
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

    public void onPause()
    {
        if (a != null)
        {
            a.pause();
        }
    }

    public void onResume()
    {
        if (a != null)
        {
            a.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        a = new AdView(context);
        a.setAdSize(new AdSize(adsize.getWidth(), adsize.getHeight()));
        a.setAdUnitId(bundle.getString("pubid"));
        a.setAdListener(new a(this, mediationbannerlistener));
        a.loadAd(a(context, mediationadrequest, bundle1, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        b = new InterstitialAd(context);
        b.setAdUnitId(bundle.getString("pubid"));
        b.setAdListener(new b(this, mediationinterstitiallistener));
        b.loadAd(a(context, mediationadrequest, bundle1, bundle));
    }

    public void showInterstitial()
    {
        b.show();
    }
}
