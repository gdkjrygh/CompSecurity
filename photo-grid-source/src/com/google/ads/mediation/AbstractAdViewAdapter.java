// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.Iterator;
import java.util.Set;

public abstract class AbstractAdViewAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{

    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    protected AdView zzaK;
    protected InterstitialAd zzaL;
    private AdLoader zzaM;

    public AbstractAdViewAdapter()
    {
    }

    public String getAdUnitId(Bundle bundle)
    {
        return bundle.getString("pubid");
    }

    public View getBannerView()
    {
        return zzaK;
    }

    public void onDestroy()
    {
        if (zzaK != null)
        {
            zzaK.destroy();
            zzaK = null;
        }
        if (zzaL != null)
        {
            zzaL = null;
        }
        if (zzaM != null)
        {
            zzaM = null;
        }
    }

    public void onPause()
    {
        if (zzaK != null)
        {
            zzaK.pause();
        }
    }

    public void onResume()
    {
        if (zzaK != null)
        {
            zzaK.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzaK = new AdView(context);
        zzaK.setAdSize(new AdSize(adsize.getWidth(), adsize.getHeight()));
        zzaK.setAdUnitId(getAdUnitId(bundle));
        zzaK.setAdListener(new zzc(mediationbannerlistener));
        zzaK.loadAd(zza(context, mediationadrequest, bundle1, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzaL = new InterstitialAd(context);
        zzaL.setAdUnitId(getAdUnitId(bundle));
        zzaL.setAdListener(new zzd(mediationinterstitiallistener));
        zzaL.loadAd(zza(context, mediationadrequest, bundle1, bundle));
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationnativelistener, Bundle bundle, NativeMediationAdRequest nativemediationadrequest, Bundle bundle1)
    {
        mediationnativelistener = new zze(mediationnativelistener);
        com.google.android.gms.ads.AdLoader.Builder builder = zza(context, bundle.getString("pubid")).withAdListener(mediationnativelistener);
        com.google.android.gms.ads.formats.NativeAdOptions nativeadoptions = nativemediationadrequest.getNativeAdOptions();
        if (nativeadoptions != null)
        {
            builder.withNativeAdOptions(nativeadoptions);
        }
        if (nativemediationadrequest.isAppInstallAdRequested())
        {
            builder.forAppInstallAd(mediationnativelistener);
        }
        if (nativemediationadrequest.isContentAdRequested())
        {
            builder.forContentAd(mediationnativelistener);
        }
        zzaM = builder.build();
        zzaM.loadAd(zza(context, nativemediationadrequest, bundle1, bundle));
    }

    public void showInterstitial()
    {
        zzaL.show();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle1);

    com.google.android.gms.ads.AdLoader.Builder zza(Context context, String s)
    {
        return new com.google.android.gms.ads.AdLoader.Builder(context, s);
    }

    AdRequest zza(Context context, MediationAdRequest mediationadrequest, Bundle bundle, Bundle bundle1)
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
            builder.addTestDevice(zzl.zzcF().zzQ(context));
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
        builder.addNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter, zza(bundle, bundle1));
        return builder.build();
    }

    private class zzc extends AdListener
        implements com.google.android.gms.ads.internal.client.zza
    {

        final AbstractAdViewAdapter zzaP;
        final MediationBannerListener zzaQ;

        public final void onAdClicked()
        {
            zzaQ.onAdClicked(zzaP);
        }

        public final void onAdClosed()
        {
            zzaQ.onAdClosed(zzaP);
        }

        public final void onAdFailedToLoad(int i)
        {
            zzaQ.onAdFailedToLoad(zzaP, i);
        }

        public final void onAdLeftApplication()
        {
            zzaQ.onAdLeftApplication(zzaP);
        }

        public final void onAdLoaded()
        {
            zzaQ.onAdLoaded(zzaP);
        }

        public final void onAdOpened()
        {
            zzaQ.onAdOpened(zzaP);
        }

        public zzc(MediationBannerListener mediationbannerlistener)
        {
            zzaP = AbstractAdViewAdapter.this;
            zzaQ = mediationbannerlistener;
        }
    }


    private class zzd extends AdListener
        implements com.google.android.gms.ads.internal.client.zza
    {

        final AbstractAdViewAdapter zzaP;
        final MediationInterstitialListener zzaR;

        public final void onAdClicked()
        {
            zzaR.onAdClicked(zzaP);
        }

        public final void onAdClosed()
        {
            zzaR.onAdClosed(zzaP);
        }

        public final void onAdFailedToLoad(int i)
        {
            zzaR.onAdFailedToLoad(zzaP, i);
        }

        public final void onAdLeftApplication()
        {
            zzaR.onAdLeftApplication(zzaP);
        }

        public final void onAdLoaded()
        {
            zzaR.onAdLoaded(zzaP);
        }

        public final void onAdOpened()
        {
            zzaR.onAdOpened(zzaP);
        }

        public zzd(MediationInterstitialListener mediationinterstitiallistener)
        {
            zzaP = AbstractAdViewAdapter.this;
            zzaR = mediationinterstitiallistener;
        }
    }


    private class zze extends AdListener
        implements com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener, com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener, com.google.android.gms.ads.internal.client.zza
    {

        final AbstractAdViewAdapter zzaP;
        final MediationNativeListener zzaS;

        public final void onAdClicked()
        {
            zzaS.onAdClicked(zzaP);
        }

        public final void onAdClosed()
        {
            zzaS.onAdClosed(zzaP);
        }

        public final void onAdFailedToLoad(int i)
        {
            zzaS.onAdFailedToLoad(zzaP, i);
        }

        public final void onAdLeftApplication()
        {
            zzaS.onAdLeftApplication(zzaP);
        }

        public final void onAdLoaded()
        {
        }

        public final void onAdOpened()
        {
            zzaS.onAdOpened(zzaP);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
        {
            zzaS.onAdLoaded(zzaP, new zza(nativeappinstallad));
        }

        public final void onContentAdLoaded(NativeContentAd nativecontentad)
        {
            zzaS.onAdLoaded(zzaP, new zzb(nativecontentad));
        }

        public zze(MediationNativeListener mediationnativelistener)
        {
            zzaP = AbstractAdViewAdapter.this;
            zzaS = mediationnativelistener;
        }

        private class zza extends NativeAppInstallAdMapper
        {

            private final NativeAppInstallAd zzaN;

            public void trackView(View view)
            {
                if (view instanceof NativeAdView)
                {
                    ((NativeAdView)view).setNativeAd(zzaN);
                }
            }

            public zza(NativeAppInstallAd nativeappinstallad)
            {
                zzaN = nativeappinstallad;
                setHeadline(nativeappinstallad.getHeadline().toString());
                setImages(nativeappinstallad.getImages());
                setBody(nativeappinstallad.getBody().toString());
                setIcon(nativeappinstallad.getIcon());
                setCallToAction(nativeappinstallad.getCallToAction().toString());
                setStarRating(nativeappinstallad.getStarRating().doubleValue());
                setStore(nativeappinstallad.getStore().toString());
                setPrice(nativeappinstallad.getPrice().toString());
                setOverrideImpressionRecording(true);
                setOverrideClickHandling(true);
            }
        }


        private class zzb extends NativeContentAdMapper
        {

            private final NativeContentAd zzaO;

            public void trackView(View view)
            {
                if (view instanceof NativeAdView)
                {
                    ((NativeAdView)view).setNativeAd(zzaO);
                }
            }

            public zzb(NativeContentAd nativecontentad)
            {
                zzaO = nativecontentad;
                setHeadline(nativecontentad.getHeadline().toString());
                setImages(nativecontentad.getImages());
                setBody(nativecontentad.getBody().toString());
                setLogo(nativecontentad.getLogo());
                setCallToAction(nativecontentad.getCallToAction().toString());
                setAdvertiser(nativecontentad.getAdvertiser().toString());
                setOverrideImpressionRecording(true);
                setOverrideClickHandling(true);
            }
        }

    }

}
