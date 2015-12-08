// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.cmcm.adsdk.c.b;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAd;
import com.picksinit.PicksMob;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            s, k, d

final class t
    implements AdListener
{

    final s a;
    private String b;
    private d c;

    public t(s s1, String s2)
    {
        a = s1;
        super();
        b = s2;
    }

    public final void onAdClicked(Ad ad)
    {
        s.a(a, c);
        ad = com.cmcm.adsdk.c.b.a(2, (NativeAd)ad);
        com.cmcm.adsdk.b.c.b.a("FBNativeLoader", (new StringBuilder("raw :")).append(ad).toString());
        PicksMob.getInstance().doFaceBookClickReport(b, ad, "com.facebook.ad", a.mPositionId, 3000);
    }

    public final void onAdLoaded(Ad ad)
    {
        if (com.cmcm.adsdk.nativead.s.b(a).decrementAndGet() == 0)
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "all request finish cancel timer");
            s.a(a);
        }
        com.cmcm.adsdk.b.c.b.a("FBNativeLoader", (new StringBuilder("fb loadsuccess,PlacementId:")).append(b).toString());
        if (ad != null)
        {
            ad = new k(a.mPositionId, b, (NativeAd)ad);
            c = ad;
            s.c(a).add(ad);
        }
        com.cmcm.adsdk.b.c.b.a("FBNativeLoader", (new StringBuilder("adpool add ad title: ")).append(c.d()).append(",adpool size:").append(s.c(a).size()).toString());
        s.d(a);
    }

    public final void onError(Ad ad, AdError aderror)
    {
        if (com.cmcm.adsdk.nativead.s.b(a).decrementAndGet() == 0)
        {
            com.cmcm.adsdk.b.c.b.a("FBNativeLoader", "all request finish cancel timer");
            s.a(a);
            s.a(a, String.valueOf(aderror.getErrorCode()));
        }
        com.cmcm.adsdk.b.c.b.a("FBNativeLoader", (new StringBuilder("fb onError,adError\uFF1A")).append(aderror.getErrorMessage()).append(",PlacementId:").append(b).toString());
    }
}
