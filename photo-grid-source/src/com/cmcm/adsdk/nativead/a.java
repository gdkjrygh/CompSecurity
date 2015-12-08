// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.cmcm.adsdk.b.c.b;
import com.google.android.gms.ads.AdListener;
import com.picksinit.PicksMob;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            AdmobNativeLoader, h, d

final class a extends AdListener
{

    final AdmobNativeLoader a;

    a(AdmobNativeLoader admobnativeloader)
    {
        a = admobnativeloader;
        super();
    }

    public final void onAdFailedToLoad(int i)
    {
        b.a("AdmobNativeLoader", (new StringBuilder("Admob ad load fail errorCode:")).append(i).toString());
        AdmobNativeLoader.access$000(a).set(false);
        AdmobNativeLoader.access$100(a, String.valueOf(i));
    }

    public final void onAdOpened()
    {
        b.a("AdmobNativeLoader", "admob report click");
        PicksMob.getInstance().doRecommendAdClickReport("com.admob.native", a.mPositionId, 3002);
        if (a.mNativeAdListener != null)
        {
            a.mNativeAdListener.b(AdmobNativeLoader.access$200(a));
        }
        if (AdmobNativeLoader.access$200(a) != null && (AdmobNativeLoader.access$200(a) instanceof d) && ((d)AdmobNativeLoader.access$200(a)).b() != null)
        {
            com.cmcm.a.a.a _tmp = AdmobNativeLoader.access$200(a);
            com.cmcm.a.a.a _tmp1 = AdmobNativeLoader.access$200(a);
        }
    }
}
