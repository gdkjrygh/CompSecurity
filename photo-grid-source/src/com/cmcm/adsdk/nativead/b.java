// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.google.android.gms.ads.formats.NativeContentAd;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            j, AdmobNativeLoader

final class b
    implements com.google.android.gms.ads.formats.NativeContentAd.OnContentAdLoadedListener
{

    final AdmobNativeLoader a;

    b(AdmobNativeLoader admobnativeloader)
    {
        a = admobnativeloader;
        super();
    }

    public final void onContentAdLoaded(NativeContentAd nativecontentad)
    {
        com.cmcm.adsdk.b.c.b.a("AdmobNativeLoader", "Admob NativeContentAd load sucess");
        nativecontentad = new j(nativecontentad, a.mPositionId, a.mNativeAdListener);
        AdmobNativeLoader.access$300(a).add(nativecontentad);
        AdmobNativeLoader.access$400(a);
        AdmobNativeLoader.access$000(a).set(false);
    }
}
