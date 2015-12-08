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
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;

// Referenced classes of package com.google.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventServerParameters, CustomEventBannerListener, 
//            CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    static final class zza
        implements CustomEventBannerListener
    {

        private final CustomEventAdapter a;
        private final MediationBannerListener b;

        public zza(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            a = customeventadapter;
            b = mediationbannerlistener;
        }
    }

    class zzb
        implements CustomEventInterstitialListener
    {

        final CustomEventAdapter a;
        private final CustomEventAdapter b;
        private final MediationInterstitialListener c;

        public zzb(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            a = CustomEventAdapter.this;
            super();
            b = customeventadapter1;
            c = mediationinterstitiallistener;
        }
    }


    CustomEventBanner a;
    CustomEventInterstitial b;
    private View c;

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
            com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
            return null;
        }
        return obj;
    }

    zzb a(MediationInterstitialListener mediationinterstitiallistener)
    {
        return new zzb(this, mediationinterstitiallistener);
    }

    public void a()
    {
        if (a != null)
        {
            a.a();
        }
        if (b != null)
        {
            b.a();
        }
    }

    public volatile void a(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        a(mediationbannerlistener, activity, (CustomEventServerParameters)mediationserverparameters, adsize, mediationadrequest, (CustomEventExtras)networkextras);
    }

    public void a(MediationBannerListener mediationbannerlistener, Activity activity, CustomEventServerParameters customeventserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
        a = (CustomEventBanner)a(customeventserverparameters.b);
        if (a == null)
        {
            mediationbannerlistener.a(this, com.google.ads.AdRequest.ErrorCode.d);
            return;
        }
        if (customeventextras == null)
        {
            customeventextras = null;
        } else
        {
            customeventextras = ((CustomEventExtras) (customeventextras.getExtra(customeventserverparameters.a)));
        }
        a.a(new zza(this, mediationbannerlistener), activity, customeventserverparameters.a, customeventserverparameters.c, adsize, mediationadrequest, customeventextras);
    }

    public volatile void a(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        a(mediationinterstitiallistener, activity, (CustomEventServerParameters)mediationserverparameters, mediationadrequest, (CustomEventExtras)networkextras);
    }

    public void a(MediationInterstitialListener mediationinterstitiallistener, Activity activity, CustomEventServerParameters customeventserverparameters, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
        b = (CustomEventInterstitial)a(customeventserverparameters.b);
        if (b == null)
        {
            mediationinterstitiallistener.a(this, com.google.ads.AdRequest.ErrorCode.d);
            return;
        }
        if (customeventextras == null)
        {
            customeventextras = null;
        } else
        {
            customeventextras = ((CustomEventExtras) (customeventextras.getExtra(customeventserverparameters.a)));
        }
        b.a(a(mediationinterstitiallistener), activity, customeventserverparameters.a, customeventserverparameters.c, mediationadrequest, customeventextras);
    }

    public Class b()
    {
        return com/google/android/gms/ads/mediation/customevent/CustomEventExtras;
    }

    public Class c()
    {
        return com/google/ads/mediation/customevent/CustomEventServerParameters;
    }

    public View d()
    {
        return c;
    }

    public void e()
    {
        b.b();
    }
}
