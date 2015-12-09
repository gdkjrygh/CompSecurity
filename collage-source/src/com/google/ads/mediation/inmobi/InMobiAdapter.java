// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.inmobi;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.inmobi.commons.AnimationType;
import com.inmobi.commons.GenderType;
import com.inmobi.commons.InMobi;
import com.inmobi.monetization.IMBanner;
import com.inmobi.monetization.IMBannerListener;
import com.inmobi.monetization.IMErrorCode;
import com.inmobi.monetization.IMIncentivisedListener;
import com.inmobi.monetization.IMInterstitial;
import com.inmobi.monetization.IMInterstitialListener;
import java.util.Calendar;
import java.util.HashMap;

// Referenced classes of package com.google.ads.mediation.inmobi:
//            InMobiAdapterExtras, InMobiAdapterServerParameters

public final class InMobiAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    private class BannerListener
        implements IMBannerListener
    {

        final InMobiAdapter a;

        private BannerListener()
        {
            a = InMobiAdapter.this;
            super();
        }

    }

    private class InterstitialListener
        implements IMInterstitialListener
    {

        final InMobiAdapter a;

        private InterstitialListener()
        {
            a = InMobiAdapter.this;
            super();
        }

    }


    private static final AdSize a = new AdSize(320, 48);
    private static final AdSize b = new AdSize(320, 50);
    private static final AdSize c = new AdSize(468, 60);
    private static final AdSize d = new AdSize(728, 90);
    private static final AdSize e = new AdSize(300, 250);
    private static final AdSize f = new AdSize(120, 600);
    private static Boolean l = Boolean.valueOf(false);
    private static Boolean m = Boolean.valueOf(false);
    private MediationBannerListener g;
    private MediationInterstitialListener h;
    private IMInterstitial i;
    private IMBanner j;
    private FrameLayout k;
    private IMIncentivisedListener n;

    public InMobiAdapter()
    {
        n = new IMIncentivisedListener() {

            final InMobiAdapter a;

            
            {
                a = InMobiAdapter.this;
                super();
            }
        };
    }

    private void a(MediationAdRequest mediationadrequest, InMobiAdapterExtras inmobiadapterextras)
    {
        InMobiAdapterExtras inmobiadapterextras1;
        inmobiadapterextras1 = inmobiadapterextras;
        if (inmobiadapterextras == null)
        {
            inmobiadapterextras1 = new InMobiAdapterExtras();
        }
        if (mediationadrequest.a() != null)
        {
            InMobi.setAge(mediationadrequest.a().intValue());
        }
        if (inmobiadapterextras1.a() != null)
        {
            InMobi.setAreaCode(inmobiadapterextras1.a());
        }
        if (mediationadrequest.e() != null)
        {
            InMobi.setCurrentLocation(mediationadrequest.e());
        }
        if (mediationadrequest.b() != null)
        {
            inmobiadapterextras = Calendar.getInstance();
            inmobiadapterextras.setTime(mediationadrequest.b());
            InMobi.setDateOfBirth(inmobiadapterextras);
        }
        if (inmobiadapterextras1.d() != null)
        {
            InMobi.setEducation(inmobiadapterextras1.d());
        }
        if (inmobiadapterextras1.e() != null)
        {
            InMobi.setEthnicity(inmobiadapterextras1.e());
        }
        if (mediationadrequest.c() == null) goto _L2; else goto _L1
_L1:
        static class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[IMErrorCode.values().length];
                try
                {
                    b[IMErrorCode.INTERNAL_ERROR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[IMErrorCode.INVALID_REQUEST.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[IMErrorCode.NETWORK_ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[IMErrorCode.NO_FILL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                a = new int[com.google.ads.AdRequest.Gender.values().length];
                try
                {
                    a[com.google.ads.AdRequest.Gender.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.google.ads.AdRequest.Gender.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[mediationadrequest.c().ordinal()];
        JVM INSTR tableswitch 1 2: default 152
    //                   1 325
    //                   2 334;
           goto _L3 _L4 _L5
_L3:
        InMobi.setGender(GenderType.UNKNOWN);
_L2:
        if (inmobiadapterextras1.f() != null)
        {
            InMobi.setIncome(inmobiadapterextras1.f().intValue());
        }
        if (inmobiadapterextras1.g() != null)
        {
            InMobi.setAge(inmobiadapterextras1.g().intValue());
        }
        if (inmobiadapterextras1.h() != null)
        {
            InMobi.setInterests(TextUtils.join(", ", inmobiadapterextras1.h()));
        }
        if (inmobiadapterextras1.i() != null)
        {
            InMobi.setPostalCode(inmobiadapterextras1.i());
        }
        InMobi.setDeviceIDMask(inmobiadapterextras1.q());
        if (inmobiadapterextras1.k() != null)
        {
            InMobi.setSexualOrientation(inmobiadapterextras1.k());
        }
        if (inmobiadapterextras1.l() != null)
        {
            InMobi.setMaritalStatus(inmobiadapterextras1.l());
        }
        if (inmobiadapterextras1.m() != null)
        {
            InMobi.setLanguage(inmobiadapterextras1.m());
        }
        if (inmobiadapterextras1.j() != null)
        {
            InMobi.setHasChildren(inmobiadapterextras1.j());
        }
        if (inmobiadapterextras1.n() != null && inmobiadapterextras1.o() != null && inmobiadapterextras1.p() != null)
        {
            InMobi.setLocationWithCityStateCountry(inmobiadapterextras1.n(), inmobiadapterextras1.o(), inmobiadapterextras1.p());
        }
        return;
_L4:
        InMobi.setGender(GenderType.MALE);
        continue; /* Loop/switch isn't completed */
_L5:
        InMobi.setGender(GenderType.FEMALE);
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void a()
    {
    }

    public volatile void a(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        a(mediationbannerlistener, activity, (InMobiAdapterServerParameters)mediationserverparameters, adsize, mediationadrequest, (InMobiAdapterExtras)networkextras);
    }

    public void a(MediationBannerListener mediationbannerlistener, Activity activity, InMobiAdapterServerParameters inmobiadapterserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, InMobiAdapterExtras inmobiadapterextras)
    {
        if (!m.booleanValue())
        {
            InMobi.initialize(activity, inmobiadapterserverparameters.a);
            m = Boolean.valueOf(true);
        }
        if (android.os.Build.VERSION.SDK_INT < 7)
        {
            mediationbannerlistener.a(this, com.google.ads.AdRequest.ErrorCode.a);
            return;
        }
        if (!InMobi.getVersion().substring(0, 1).equals("4"))
        {
            mediationbannerlistener.a(this, com.google.ads.AdRequest.ErrorCode.a);
            Log.e("Invalid SDK VERSION", (new StringBuilder()).append("Please integrate with new sdk").append(InMobi.getVersion()).toString());
            return;
        }
        g = mediationbannerlistener;
        adsize = adsize.a(new AdSize[] {
            a, b, c, d, e, f
        });
        android.widget.FrameLayout.LayoutParams layoutparams;
        byte byte0;
        if (adsize == a)
        {
            byte0 = 9;
        } else
        if (adsize == b)
        {
            byte0 = 15;
        } else
        if (adsize == c)
        {
            byte0 = 12;
            Log.e("ADSIZE_INMOBI_AD_UNIT_468x60", (new StringBuilder()).append(12).append("").toString());
        } else
        if (adsize == d)
        {
            byte0 = 11;
            Log.e("INMOBI_AD_UNIT_728X90", (new StringBuilder()).append(11).append("").toString());
        } else
        if (adsize == e)
        {
            byte0 = 10;
            Log.e("INMOBI_AD_UNIT_300X250", (new StringBuilder()).append(10).append("").toString());
        } else
        if (adsize == f)
        {
            byte0 = 13;
            Log.e("INMOBI_AD_UNIT_120X600", (new StringBuilder()).append(13).append("").toString());
        } else
        {
            mediationbannerlistener.a(this, com.google.ads.AdRequest.ErrorCode.a);
            return;
        }
        layoutparams = new android.widget.FrameLayout.LayoutParams(adsize.a(activity), adsize.b(activity));
        j = new IMBanner(activity, inmobiadapterserverparameters.a, byte0);
        j.setRefreshInterval(-1);
        j.setAnimationType(AnimationType.ANIMATION_OFF);
        if (mediationadrequest.d() != null)
        {
            j.setKeywords(TextUtils.join(", ", mediationadrequest.d()));
        }
        mediationbannerlistener = new HashMap();
        mediationbannerlistener.put("tp", "c_admob");
        j.setRequestParams(mediationbannerlistener);
        mediationbannerlistener = inmobiadapterextras;
        if (inmobiadapterextras == null)
        {
            mediationbannerlistener = new InMobiAdapterExtras();
        }
        if (mediationbannerlistener.b() != null && mediationbannerlistener.c() != null && !mediationbannerlistener.b().trim().equals("") && !mediationbannerlistener.c().trim().equals(""))
        {
            j.setRefTagParam(mediationbannerlistener.b(), mediationbannerlistener.c());
        }
        j.setIMBannerListener(new BannerListener());
        if (l.booleanValue())
        {
            j.disableHardwareAcceleration();
        }
        k = new FrameLayout(activity);
        k.setLayoutParams(layoutparams);
        j.setLayoutParams(new android.widget.LinearLayout.LayoutParams(adsize.a(activity), adsize.b(activity)));
        k.addView(j);
        a(mediationadrequest, ((InMobiAdapterExtras) (mediationbannerlistener)));
        j.loadBanner();
    }

    public volatile void a(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        a(mediationinterstitiallistener, activity, (InMobiAdapterServerParameters)mediationserverparameters, mediationadrequest, (InMobiAdapterExtras)networkextras);
    }

    public void a(MediationInterstitialListener mediationinterstitiallistener, Activity activity, InMobiAdapterServerParameters inmobiadapterserverparameters, MediationAdRequest mediationadrequest, InMobiAdapterExtras inmobiadapterextras)
    {
        if (!m.booleanValue())
        {
            InMobi.initialize(activity, inmobiadapterserverparameters.a);
            m = Boolean.valueOf(true);
        }
        if (android.os.Build.VERSION.SDK_INT < 7)
        {
            mediationinterstitiallistener.a(this, com.google.ads.AdRequest.ErrorCode.a);
            return;
        }
        if (!InMobi.getVersion().substring(0, 1).equals("4"))
        {
            mediationinterstitiallistener.a(this, com.google.ads.AdRequest.ErrorCode.a);
            Log.e("Invalid SDK VERSION", (new StringBuilder()).append("Please integrate with new sdk").append(InMobi.getVersion()).toString());
            return;
        }
        h = mediationinterstitiallistener;
        i = new IMInterstitial(activity, inmobiadapterserverparameters.a);
        if (mediationadrequest.d() != null)
        {
            i.setKeywords(TextUtils.join(", ", mediationadrequest.d()));
        }
        mediationinterstitiallistener = new HashMap();
        mediationinterstitiallistener.put("tp", "c_admob");
        i.setRequestParams(mediationinterstitiallistener);
        i.setIMInterstitialListener(new InterstitialListener());
        i.setIMIncentivisedListener(n);
        if (l.booleanValue())
        {
            i.disableHardwareAcceleration();
        }
        a(mediationadrequest, inmobiadapterextras);
        i.loadInterstitial();
    }

    public Class b()
    {
        return com/google/ads/mediation/inmobi/InMobiAdapterExtras;
    }

    public Class c()
    {
        return com/google/ads/mediation/inmobi/InMobiAdapterServerParameters;
    }

    public View d()
    {
        return k;
    }

    public void e()
    {
        if (i.getState() == com.inmobi.monetization.IMInterstitial.State.READY)
        {
            i.show();
        }
    }

}
