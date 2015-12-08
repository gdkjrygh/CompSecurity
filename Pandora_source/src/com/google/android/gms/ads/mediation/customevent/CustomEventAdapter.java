// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventBannerListener, CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    static final class a
        implements CustomEventBannerListener
    {

        private final CustomEventAdapter a;
        private final MediationBannerListener b;

        public void onAdClicked()
        {
            zzb.zzaj("Custom event adapter called onAdClicked.");
            b.onAdClicked(a);
        }

        public void onAdClosed()
        {
            zzb.zzaj("Custom event adapter called onAdClosed.");
            b.onAdClosed(a);
        }

        public void onAdFailedToLoad(int i)
        {
            zzb.zzaj("Custom event adapter called onAdFailedToLoad.");
            b.onAdFailedToLoad(a, i);
        }

        public void onAdLeftApplication()
        {
            zzb.zzaj("Custom event adapter called onAdLeftApplication.");
            b.onAdLeftApplication(a);
        }

        public void onAdLoaded(View view)
        {
            zzb.zzaj("Custom event adapter called onAdLoaded.");
            CustomEventAdapter.zza(a, view);
            b.onAdLoaded(a);
        }

        public void onAdOpened()
        {
            zzb.zzaj("Custom event adapter called onAdOpened.");
            b.onAdOpened(a);
        }

        public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            a = customeventadapter;
            b = mediationbannerlistener;
        }
    }

    class b
        implements CustomEventInterstitialListener
    {

        final CustomEventAdapter a;
        private final CustomEventAdapter b;
        private final MediationInterstitialListener c;

        public void onAdClicked()
        {
            zzb.zzaj("Custom event adapter called onAdClicked.");
            c.onAdClicked(b);
        }

        public void onAdClosed()
        {
            zzb.zzaj("Custom event adapter called onAdClosed.");
            c.onAdClosed(b);
        }

        public void onAdFailedToLoad(int i)
        {
            zzb.zzaj("Custom event adapter called onFailedToReceiveAd.");
            c.onAdFailedToLoad(b, i);
        }

        public void onAdLeftApplication()
        {
            zzb.zzaj("Custom event adapter called onAdLeftApplication.");
            c.onAdLeftApplication(b);
        }

        public void onAdLoaded()
        {
            zzb.zzaj("Custom event adapter called onReceivedAd.");
            c.onAdLoaded(a);
        }

        public void onAdOpened()
        {
            zzb.zzaj("Custom event adapter called onAdOpened.");
            c.onAdOpened(b);
        }

        public b(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            a = CustomEventAdapter.this;
            super();
            b = customeventadapter1;
            c = mediationinterstitiallistener;
        }
    }


    CustomEventBanner zzDI;
    CustomEventInterstitial zzDJ;
    private View zzn;

    public CustomEventAdapter()
    {
    }

    private static Object zza(String s)
    {
        Object obj;
        try
        {
            obj = Class.forName(s).newInstance();
        }
        catch (Throwable throwable)
        {
            zzb.zzan((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
            return null;
        }
        return obj;
    }

    private void zza(View view)
    {
        zzn = view;
    }

    static void zza(CustomEventAdapter customeventadapter, View view)
    {
        customeventadapter.zza(view);
    }

    public View getBannerView()
    {
        return zzn;
    }

    public void onDestroy()
    {
        if (zzDI != null)
        {
            zzDI.onDestroy();
        }
        if (zzDJ != null)
        {
            zzDJ.onDestroy();
        }
    }

    public void onPause()
    {
        if (zzDI != null)
        {
            zzDI.onPause();
        }
        if (zzDJ != null)
        {
            zzDJ.onPause();
        }
    }

    public void onResume()
    {
        if (zzDI != null)
        {
            zzDI.onResume();
        }
        if (zzDJ != null)
        {
            zzDJ.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzDI = (CustomEventBanner)zza(bundle.getString("class_name"));
        if (zzDI == null)
        {
            mediationbannerlistener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle1 == null)
        {
            bundle1 = null;
        } else
        {
            bundle1 = bundle1.getBundle(bundle.getString("class_name"));
        }
        zzDI.requestBannerAd(context, new a(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzDJ = (CustomEventInterstitial)zza(bundle.getString("class_name"));
        if (zzDJ == null)
        {
            mediationinterstitiallistener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle1 == null)
        {
            bundle1 = null;
        } else
        {
            bundle1 = bundle1.getBundle(bundle.getString("class_name"));
        }
        zzDJ.requestInterstitialAd(context, zza(mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle1);
    }

    public void showInterstitial()
    {
        zzDJ.showInterstitial();
    }

    b zza(MediationInterstitialListener mediationinterstitiallistener)
    {
        return new b(this, mediationinterstitiallistener);
    }
}
