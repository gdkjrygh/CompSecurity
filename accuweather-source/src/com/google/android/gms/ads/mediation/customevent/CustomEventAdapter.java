// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ev;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventBannerListener, CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private static final class a
        implements CustomEventBannerListener
    {

        private final MediationBannerListener l;
        private final CustomEventAdapter sV;

        public void onAdClicked()
        {
            ev.z("Custom event adapter called onAdClicked.");
            l.onAdClicked(sV);
        }

        public void onAdClosed()
        {
            ev.z("Custom event adapter called onAdClosed.");
            l.onAdClosed(sV);
        }

        public void onAdFailedToLoad(int i)
        {
            ev.z("Custom event adapter called onAdFailedToLoad.");
            l.onAdFailedToLoad(sV, i);
        }

        public void onAdLeftApplication()
        {
            ev.z("Custom event adapter called onAdLeftApplication.");
            l.onAdLeftApplication(sV);
        }

        public void onAdLoaded(View view)
        {
            ev.z("Custom event adapter called onAdLoaded.");
            CustomEventAdapter.a(sV, view);
            l.onAdLoaded(sV);
        }

        public void onAdOpened()
        {
            ev.z("Custom event adapter called onAdOpened.");
            l.onAdOpened(sV);
        }

        public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            sV = customeventadapter;
            l = mediationbannerlistener;
        }
    }

    private class b
        implements CustomEventInterstitialListener
    {

        private final MediationInterstitialListener m;
        private final CustomEventAdapter sV;
        final CustomEventAdapter sW;

        public void onAdClicked()
        {
            ev.z("Custom event adapter called onAdClicked.");
            m.onAdClicked(sV);
        }

        public void onAdClosed()
        {
            ev.z("Custom event adapter called onAdClosed.");
            m.onAdClosed(sV);
        }

        public void onAdFailedToLoad(int i)
        {
            ev.z("Custom event adapter called onFailedToReceiveAd.");
            m.onAdFailedToLoad(sV, i);
        }

        public void onAdLeftApplication()
        {
            ev.z("Custom event adapter called onAdLeftApplication.");
            m.onAdLeftApplication(sV);
        }

        public void onAdLoaded()
        {
            ev.z("Custom event adapter called onReceivedAd.");
            m.onAdLoaded(sW);
        }

        public void onAdOpened()
        {
            ev.z("Custom event adapter called onAdOpened.");
            m.onAdOpened(sV);
        }

        public b(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            sW = CustomEventAdapter.this;
            super();
            sV = customeventadapter1;
            m = mediationinterstitiallistener;
        }
    }


    private View n;
    private CustomEventBanner sT;
    private CustomEventInterstitial sU;

    public CustomEventAdapter()
    {
    }

    private static Object a(String s)
    {
        Object obj;
        try
        {
            obj = Class.forName(s).newInstance();
        }
        catch (Throwable throwable)
        {
            ev.D((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
            return null;
        }
        return obj;
    }

    private void a(View view)
    {
        n = view;
    }

    static void a(CustomEventAdapter customeventadapter, View view)
    {
        customeventadapter.a(view);
    }

    public View getBannerView()
    {
        return n;
    }

    public void onDestroy()
    {
        if (sT != null)
        {
            sT.onDestroy();
        }
        if (sU != null)
        {
            sU.onDestroy();
        }
    }

    public void onPause()
    {
        if (sT != null)
        {
            sT.onPause();
        }
        if (sU != null)
        {
            sU.onPause();
        }
    }

    public void onResume()
    {
        if (sT != null)
        {
            sT.onResume();
        }
        if (sU != null)
        {
            sU.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        sT = (CustomEventBanner)a(bundle.getString("class_name"));
        if (sT == null)
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
        sT.requestBannerAd(context, new a(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        sU = (CustomEventInterstitial)a(bundle.getString("class_name"));
        if (sU == null)
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
        sU.requestInterstitialAd(context, new b(this, mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle1);
    }

    public void showInterstitial()
    {
        sU.showInterstitial();
    }
}
