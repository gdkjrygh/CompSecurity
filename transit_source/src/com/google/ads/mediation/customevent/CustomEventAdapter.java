// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.internal.cn;

// Referenced classes of package com.google.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventServerParameters, CustomEventBannerListener, 
//            CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private static final class a
        implements CustomEventBannerListener
    {

        private final MediationBannerListener k;
        private final CustomEventAdapter p;

        public void onClick()
        {
            cn.m("Custom event adapter called onFailedToReceiveAd.");
            k.onClick(p);
        }

        public void onDismissScreen()
        {
            cn.m("Custom event adapter called onFailedToReceiveAd.");
            k.onDismissScreen(p);
        }

        public void onFailedToReceiveAd()
        {
            cn.m("Custom event adapter called onFailedToReceiveAd.");
            k.onFailedToReceiveAd(p, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication()
        {
            cn.m("Custom event adapter called onFailedToReceiveAd.");
            k.onLeaveApplication(p);
        }

        public void onPresentScreen()
        {
            cn.m("Custom event adapter called onFailedToReceiveAd.");
            k.onPresentScreen(p);
        }

        public void onReceivedAd(View view)
        {
            cn.m("Custom event adapter called onReceivedAd.");
            CustomEventAdapter.a(p, view);
            k.onReceivedAd(p);
        }

        public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            p = customeventadapter;
            k = mediationbannerlistener;
        }
    }

    private class b
        implements CustomEventInterstitialListener
    {

        private final MediationInterstitialListener l;
        private final CustomEventAdapter p;
        final CustomEventAdapter q;

        public void onDismissScreen()
        {
            cn.m("Custom event adapter called onDismissScreen.");
            l.onDismissScreen(p);
        }

        public void onFailedToReceiveAd()
        {
            cn.m("Custom event adapter called onFailedToReceiveAd.");
            l.onFailedToReceiveAd(p, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication()
        {
            cn.m("Custom event adapter called onLeaveApplication.");
            l.onLeaveApplication(p);
        }

        public void onPresentScreen()
        {
            cn.m("Custom event adapter called onPresentScreen.");
            l.onPresentScreen(p);
        }

        public void onReceivedAd()
        {
            cn.m("Custom event adapter called onReceivedAd.");
            l.onReceivedAd(q);
        }

        public b(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            q = CustomEventAdapter.this;
            super();
            p = customeventadapter1;
            l = mediationinterstitiallistener;
        }
    }


    private View m;
    private CustomEventBanner n;
    private CustomEventInterstitial o;

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
            cn.q((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
            return null;
        }
        return obj;
    }

    private void a(View view)
    {
        m = view;
    }

    static void a(CustomEventAdapter customeventadapter, View view)
    {
        customeventadapter.a(view);
    }

    public void destroy()
    {
        if (n != null)
        {
            n.destroy();
        }
        if (o != null)
        {
            o.destroy();
        }
    }

    public Class getAdditionalParametersType()
    {
        return com/google/android/gms/ads/mediation/customevent/CustomEventExtras;
    }

    public View getBannerView()
    {
        return m;
    }

    public Class getServerParametersType()
    {
        return com/google/ads/mediation/customevent/CustomEventServerParameters;
    }

    public volatile void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        requestBannerAd(mediationbannerlistener, activity, (CustomEventServerParameters)mediationserverparameters, adsize, mediationadrequest, (CustomEventExtras)networkextras);
    }

    public void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, CustomEventServerParameters customeventserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
        n = (CustomEventBanner)a(customeventserverparameters.className);
        if (n == null)
        {
            mediationbannerlistener.onFailedToReceiveAd(this, com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customeventextras == null)
        {
            customeventextras = null;
        } else
        {
            customeventextras = ((CustomEventExtras) (customeventextras.getExtra(customeventserverparameters.label)));
        }
        n.requestBannerAd(new a(this, mediationbannerlistener), activity, customeventserverparameters.label, customeventserverparameters.parameter, adsize, mediationadrequest, customeventextras);
    }

    public volatile void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        requestInterstitialAd(mediationinterstitiallistener, activity, (CustomEventServerParameters)mediationserverparameters, mediationadrequest, (CustomEventExtras)networkextras);
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, CustomEventServerParameters customeventserverparameters, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
        o = (CustomEventInterstitial)a(customeventserverparameters.className);
        if (o == null)
        {
            mediationinterstitiallistener.onFailedToReceiveAd(this, com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (customeventextras == null)
        {
            customeventextras = null;
        } else
        {
            customeventextras = ((CustomEventExtras) (customeventextras.getExtra(customeventserverparameters.label)));
        }
        o.requestInterstitialAd(new b(this, mediationinterstitiallistener), activity, customeventserverparameters.label, customeventserverparameters.parameter, mediationadrequest, customeventextras);
    }

    public void showInterstitial()
    {
        o.showInterstitial();
    }
}
