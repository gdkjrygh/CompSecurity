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
import com.google.android.gms.internal.eu;

// Referenced classes of package com.google.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventServerParameters, CustomEventBannerListener, 
//            CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private static final class a
        implements CustomEventBannerListener
    {

        private final CustomEventAdapter q;
        private final MediationBannerListener r;

        public void onClick()
        {
            eu.z("Custom event adapter called onFailedToReceiveAd.");
            r.onClick(q);
        }

        public void onDismissScreen()
        {
            eu.z("Custom event adapter called onFailedToReceiveAd.");
            r.onDismissScreen(q);
        }

        public void onFailedToReceiveAd()
        {
            eu.z("Custom event adapter called onFailedToReceiveAd.");
            r.onFailedToReceiveAd(q, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication()
        {
            eu.z("Custom event adapter called onFailedToReceiveAd.");
            r.onLeaveApplication(q);
        }

        public void onPresentScreen()
        {
            eu.z("Custom event adapter called onFailedToReceiveAd.");
            r.onPresentScreen(q);
        }

        public void onReceivedAd(View view)
        {
            eu.z("Custom event adapter called onReceivedAd.");
            CustomEventAdapter.a(q, view);
            r.onReceivedAd(q);
        }

        public a(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            q = customeventadapter;
            r = mediationbannerlistener;
        }
    }

    private class b
        implements CustomEventInterstitialListener
    {

        private final CustomEventAdapter q;
        private final MediationInterstitialListener s;
        final CustomEventAdapter t;

        public void onDismissScreen()
        {
            eu.z("Custom event adapter called onDismissScreen.");
            s.onDismissScreen(q);
        }

        public void onFailedToReceiveAd()
        {
            eu.z("Custom event adapter called onFailedToReceiveAd.");
            s.onFailedToReceiveAd(q, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication()
        {
            eu.z("Custom event adapter called onLeaveApplication.");
            s.onLeaveApplication(q);
        }

        public void onPresentScreen()
        {
            eu.z("Custom event adapter called onPresentScreen.");
            s.onPresentScreen(q);
        }

        public void onReceivedAd()
        {
            eu.z("Custom event adapter called onReceivedAd.");
            s.onReceivedAd(t);
        }

        public b(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            t = CustomEventAdapter.this;
            super();
            q = customeventadapter1;
            s = mediationinterstitiallistener;
        }
    }


    private View n;
    private CustomEventBanner o;
    private CustomEventInterstitial p;

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

    public void destroy()
    {
        if (o != null)
        {
            o.destroy();
        }
        if (p != null)
        {
            p.destroy();
        }
    }

    public Class getAdditionalParametersType()
    {
        return com/google/android/gms/ads/mediation/customevent/CustomEventExtras;
    }

    public View getBannerView()
    {
        return n;
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
        o = (CustomEventBanner)a(customeventserverparameters.className);
        if (o == null)
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
        o.requestBannerAd(new a(this, mediationbannerlistener), activity, customeventserverparameters.label, customeventserverparameters.parameter, adsize, mediationadrequest, customeventextras);
    }

    public volatile void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        requestInterstitialAd(mediationinterstitiallistener, activity, (CustomEventServerParameters)mediationserverparameters, mediationadrequest, (CustomEventExtras)networkextras);
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, CustomEventServerParameters customeventserverparameters, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
        p = (CustomEventInterstitial)a(customeventserverparameters.className);
        if (p == null)
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
        p.requestInterstitialAd(new b(this, mediationinterstitiallistener), activity, customeventserverparameters.label, customeventserverparameters.parameter, mediationadrequest, customeventextras);
    }

    public void showInterstitial()
    {
        p.showInterstitial();
    }
}
