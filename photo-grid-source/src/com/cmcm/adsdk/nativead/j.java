// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.view.View;
import com.cmcm.adsdk.a;
import com.cmcm.adsdk.b.c.b;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAdView;
import com.picksinit.PicksMob;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            d, h

public final class j extends d
{

    private final long c = 0x36ee80L;
    private NativeAd d;
    private View e;
    private long f;
    private h g;
    private String h;

    public j(NativeAd nativead, String s, h h1)
    {
        d = nativead;
        h = s;
        f = System.currentTimeMillis();
        g = h1;
    }

    public final void a(View view)
    {
        b.a("AdmobNativeAd", "admob registerView");
        e = view;
        b.a("AdmobNativeAd", "admob report impression");
        if (!a)
        {
            PicksMob.getInstance().doRecommendAdViewReport("com.admob.native", h, 3002);
            a = true;
        }
        if ((e instanceof NativeContentAdView) && (d instanceof NativeContentAd))
        {
            b.a("AdmobNativeAd", "registerViewForInteraction NativeContentAdView");
            ((NativeContentAdView)e).setNativeAd(d);
        } else
        if ((e instanceof NativeAppInstallAdView) && (d instanceof NativeAppInstallAd))
        {
            b.a("AdmobNativeAd", "registerViewForInteraction NativeAppInstallAdView");
            ((NativeAppInstallAdView)e).setNativeAd(d);
            return;
        }
    }

    public final String c()
    {
        return "ab";
    }

    public final String d()
    {
        if (d != null)
        {
            if (d instanceof NativeAppInstallAd)
            {
                return ((NativeAppInstallAd)d).getHeadline().toString();
            }
            if (d instanceof NativeContentAd)
            {
                return ((NativeContentAd)d).getHeadline().toString();
            }
        }
        return null;
    }

    public final String e()
    {
        return null;
    }

    public final String f()
    {
        return null;
    }

    public final String g()
    {
        if (d != null)
        {
            if (d instanceof NativeAppInstallAd)
            {
                return ((NativeAppInstallAd)d).getCallToAction().toString();
            }
            if (d instanceof NativeContentAd)
            {
                return ((NativeContentAd)d).getCallToAction().toString();
            }
        }
        return null;
    }

    public final String h()
    {
        if (d != null)
        {
            if (d instanceof NativeAppInstallAd)
            {
                return ((NativeAppInstallAd)d).getBody().toString();
            }
            if (d instanceof NativeContentAd)
            {
                return ((NativeContentAd)d).getBody().toString();
            }
        }
        return "";
    }

    public final boolean i()
    {
        long l = com.cmcm.adsdk.a.i();
        if (l != 0L) goto _L2; else goto _L1
_L1:
        if (System.currentTimeMillis() - f < 0x36ee80L) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (System.currentTimeMillis() - f < l)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final boolean j()
    {
        return false;
    }
}
