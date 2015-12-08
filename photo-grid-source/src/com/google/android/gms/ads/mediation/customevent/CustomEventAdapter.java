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
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventNative, a, 
//            b, c

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{

    CustomEventBanner a;
    CustomEventInterstitial b;
    CustomEventNative c;
    private View d;

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
            zzb.zzaH((new StringBuilder("Could not instantiate custom event adapter: ")).append(s).append(". ").append(throwable.getMessage()).toString());
            return null;
        }
        return obj;
    }

    static void a(CustomEventAdapter customeventadapter, View view)
    {
        customeventadapter.d = view;
    }

    public final View getBannerView()
    {
        return d;
    }

    public final void onDestroy()
    {
        if (a != null)
        {
            a.onDestroy();
        }
        if (b != null)
        {
            b.onDestroy();
        }
        if (c != null)
        {
            c.onDestroy();
        }
    }

    public final void onPause()
    {
        if (a != null)
        {
            a.onPause();
        }
        if (b != null)
        {
            b.onPause();
        }
        if (c != null)
        {
            c.onPause();
        }
    }

    public final void onResume()
    {
        if (a != null)
        {
            a.onResume();
        }
        if (b != null)
        {
            b.onResume();
        }
        if (c != null)
        {
            c.onResume();
        }
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        a = (CustomEventBanner)a(bundle.getString("class_name"));
        if (a == null)
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
        a.requestBannerAd(context, new a(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        b = (CustomEventInterstitial)a(bundle.getString("class_name"));
        if (b == null)
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
        b.requestInterstitialAd(context, new b(this, this, mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle1);
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationnativelistener, Bundle bundle, NativeMediationAdRequest nativemediationadrequest, Bundle bundle1)
    {
        c = (CustomEventNative)a(bundle.getString("class_name"));
        if (c == null)
        {
            mediationnativelistener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle1 == null)
        {
            bundle1 = null;
        } else
        {
            bundle1 = bundle1.getBundle(bundle.getString("class_name"));
        }
        c.requestNativeAd(context, new c(this, mediationnativelistener), bundle.getString("parameter"), nativemediationadrequest, bundle1);
    }

    public final void showInterstitial()
    {
        b.showInterstitial();
    }
}
