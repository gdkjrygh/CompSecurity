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
import com.google.android.gms.internal.eu;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventBannerListener, CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private static final class a
        implements CustomEventBannerListener
    {

        private final MediationBannerListener l;
        private final CustomEventAdapter sY;

        public void onAdClicked()
        {
            eu.z("Custom event adapter called onAdClicked.");
            l.onAdClicked(sY);
        }

        public void onAdClosed()
        {
            eu.z("Custom event adapter called onAdClosed.");
            l.onAdClosed(sY);
        }

        public void onAdFailedToLoad(int i)
        {
            eu.z("Custom event adapter called onAdFailedToLoad.");
            l.onAdFailedToLoad(sY, i);
        }

        public void onAdLeftApplication()
        {
            eu.z("Custom event adapter called onAdLeftApplication.");
            l.onAdLeftApplication(sY);
        }

        public void onAdLoaded(View view)
        {
            eu.z("Custom event adapter called onAdLoaded.");
            CustomEventAdapter.a(sY, view);
            l.onAdLoaded(sY);
        }

        public void onAdOpened()
        {
            eu.z("Custom event adapter called onAdOpened.");
            l.onAdOpened(sY);
        }

        public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            sY = customeventadapter;
            l = mediationbannerlistener;
        }
    }

    private class b
        implements CustomEventInterstitialListener
    {

        private final MediationInterstitialListener m;
        private final CustomEventAdapter sY;
        final CustomEventAdapter sZ;

        public void onAdClicked()
        {
            eu.z("Custom event adapter called onAdClicked.");
            m.onAdClicked(sY);
        }

        public void onAdClosed()
        {
            eu.z("Custom event adapter called onAdClosed.");
            m.onAdClosed(sY);
        }

        public void onAdFailedToLoad(int i)
        {
            eu.z("Custom event adapter called onFailedToReceiveAd.");
            m.onAdFailedToLoad(sY, i);
        }

        public void onAdLeftApplication()
        {
            eu.z("Custom event adapter called onAdLeftApplication.");
            m.onAdLeftApplication(sY);
        }

        public void onAdLoaded()
        {
            eu.z("Custom event adapter called onReceivedAd.");
            m.onAdLoaded(sZ);
        }

        public void onAdOpened()
        {
            eu.z("Custom event adapter called onAdOpened.");
            m.onAdOpened(sY);
        }

        public b(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            sZ = CustomEventAdapter.this;
            super();
            sY = customeventadapter1;
            m = mediationinterstitiallistener;
        }
    }


    private View n;
    private CustomEventBanner sW;
    private CustomEventInterstitial sX;

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
            eu.D((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
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
        if (sW != null)
        {
            sW.onDestroy();
        }
        if (sX != null)
        {
            sX.onDestroy();
        }
    }

    public void onPause()
    {
        if (sW != null)
        {
            sW.onPause();
        }
        if (sX != null)
        {
            sX.onPause();
        }
    }

    public void onResume()
    {
        if (sW != null)
        {
            sW.onResume();
        }
        if (sX != null)
        {
            sX.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        sW = (CustomEventBanner)a(bundle.getString("class_name"));
        if (sW == null)
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
        sW.requestBannerAd(context, new a(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        sX = (CustomEventInterstitial)a(bundle.getString("class_name"));
        if (sX == null)
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
        sX.requestInterstitialAd(context, new b(this, mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle1);
    }

    public void showInterstitial()
    {
        sX.showInterstitial();
    }
}
