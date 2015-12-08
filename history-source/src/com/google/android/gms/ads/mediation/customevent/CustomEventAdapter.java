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
import com.google.android.gms.internal.gr;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventBannerListener, CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private static final class a
        implements CustomEventBannerListener
    {

        private final MediationBannerListener l;
        private final CustomEventAdapter xw;

        public void onAdClicked()
        {
            gr.S("Custom event adapter called onAdClicked.");
            l.onAdClicked(xw);
        }

        public void onAdClosed()
        {
            gr.S("Custom event adapter called onAdClosed.");
            l.onAdClosed(xw);
        }

        public void onAdFailedToLoad(int i)
        {
            gr.S("Custom event adapter called onAdFailedToLoad.");
            l.onAdFailedToLoad(xw, i);
        }

        public void onAdLeftApplication()
        {
            gr.S("Custom event adapter called onAdLeftApplication.");
            l.onAdLeftApplication(xw);
        }

        public void onAdLoaded(View view)
        {
            gr.S("Custom event adapter called onAdLoaded.");
            CustomEventAdapter.a(xw, view);
            l.onAdLoaded(xw);
        }

        public void onAdOpened()
        {
            gr.S("Custom event adapter called onAdOpened.");
            l.onAdOpened(xw);
        }

        public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            xw = customeventadapter;
            l = mediationbannerlistener;
        }
    }

    private class b
        implements CustomEventInterstitialListener
    {

        private final MediationInterstitialListener m;
        private final CustomEventAdapter xw;
        final CustomEventAdapter xx;

        public void onAdClicked()
        {
            gr.S("Custom event adapter called onAdClicked.");
            m.onAdClicked(xw);
        }

        public void onAdClosed()
        {
            gr.S("Custom event adapter called onAdClosed.");
            m.onAdClosed(xw);
        }

        public void onAdFailedToLoad(int i)
        {
            gr.S("Custom event adapter called onFailedToReceiveAd.");
            m.onAdFailedToLoad(xw, i);
        }

        public void onAdLeftApplication()
        {
            gr.S("Custom event adapter called onAdLeftApplication.");
            m.onAdLeftApplication(xw);
        }

        public void onAdLoaded()
        {
            gr.S("Custom event adapter called onReceivedAd.");
            m.onAdLoaded(xx);
        }

        public void onAdOpened()
        {
            gr.S("Custom event adapter called onAdOpened.");
            m.onAdOpened(xw);
        }

        public b(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            xx = CustomEventAdapter.this;
            super();
            xw = customeventadapter1;
            m = mediationinterstitiallistener;
        }
    }


    private View n;
    private CustomEventBanner xu;
    private CustomEventInterstitial xv;

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
            gr.W((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
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
        if (xu != null)
        {
            xu.onDestroy();
        }
        if (xv != null)
        {
            xv.onDestroy();
        }
    }

    public void onPause()
    {
        if (xu != null)
        {
            xu.onPause();
        }
        if (xv != null)
        {
            xv.onPause();
        }
    }

    public void onResume()
    {
        if (xu != null)
        {
            xu.onResume();
        }
        if (xv != null)
        {
            xv.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        xu = (CustomEventBanner)a(bundle.getString("class_name"));
        if (xu == null)
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
        xu.requestBannerAd(context, new a(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        xv = (CustomEventInterstitial)a(bundle.getString("class_name"));
        if (xv == null)
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
        xv.requestInterstitialAd(context, new b(this, mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle1);
    }

    public void showInterstitial()
    {
        xv.showInterstitial();
    }
}
