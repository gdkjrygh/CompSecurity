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
import com.google.android.gms.internal.gs;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventBannerListener, CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private static final class a
        implements CustomEventBannerListener
    {

        private final MediationBannerListener l;
        private final CustomEventAdapter xh;

        public void onAdClicked()
        {
            gs.S("Custom event adapter called onAdClicked.");
            l.onAdClicked(xh);
        }

        public void onAdClosed()
        {
            gs.S("Custom event adapter called onAdClosed.");
            l.onAdClosed(xh);
        }

        public void onAdFailedToLoad(int i)
        {
            gs.S("Custom event adapter called onAdFailedToLoad.");
            l.onAdFailedToLoad(xh, i);
        }

        public void onAdLeftApplication()
        {
            gs.S("Custom event adapter called onAdLeftApplication.");
            l.onAdLeftApplication(xh);
        }

        public void onAdLoaded(View view)
        {
            gs.S("Custom event adapter called onAdLoaded.");
            CustomEventAdapter.a(xh, view);
            l.onAdLoaded(xh);
        }

        public void onAdOpened()
        {
            gs.S("Custom event adapter called onAdOpened.");
            l.onAdOpened(xh);
        }

        public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            xh = customeventadapter;
            l = mediationbannerlistener;
        }
    }

    private class b
        implements CustomEventInterstitialListener
    {

        private final MediationInterstitialListener m;
        private final CustomEventAdapter xh;
        final CustomEventAdapter xi;

        public void onAdClicked()
        {
            gs.S("Custom event adapter called onAdClicked.");
            m.onAdClicked(xh);
        }

        public void onAdClosed()
        {
            gs.S("Custom event adapter called onAdClosed.");
            m.onAdClosed(xh);
        }

        public void onAdFailedToLoad(int i)
        {
            gs.S("Custom event adapter called onFailedToReceiveAd.");
            m.onAdFailedToLoad(xh, i);
        }

        public void onAdLeftApplication()
        {
            gs.S("Custom event adapter called onAdLeftApplication.");
            m.onAdLeftApplication(xh);
        }

        public void onAdLoaded()
        {
            gs.S("Custom event adapter called onReceivedAd.");
            m.onAdLoaded(xi);
        }

        public void onAdOpened()
        {
            gs.S("Custom event adapter called onAdOpened.");
            m.onAdOpened(xh);
        }

        public b(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            xi = CustomEventAdapter.this;
            super();
            xh = customeventadapter1;
            m = mediationinterstitiallistener;
        }
    }


    private View n;
    private CustomEventBanner xf;
    private CustomEventInterstitial xg;

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
            gs.W((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
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
        if (xf != null)
        {
            xf.onDestroy();
        }
        if (xg != null)
        {
            xg.onDestroy();
        }
    }

    public void onPause()
    {
        if (xf != null)
        {
            xf.onPause();
        }
        if (xg != null)
        {
            xg.onPause();
        }
    }

    public void onResume()
    {
        if (xf != null)
        {
            xf.onResume();
        }
        if (xg != null)
        {
            xg.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        xf = (CustomEventBanner)a(bundle.getString("class_name"));
        if (xf == null)
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
        xf.requestBannerAd(context, new a(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        xg = (CustomEventInterstitial)a(bundle.getString("class_name"));
        if (xg == null)
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
        xg.requestInterstitialAd(context, new b(this, mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle1);
    }

    public void showInterstitial()
    {
        xg.showInterstitial();
    }
}
