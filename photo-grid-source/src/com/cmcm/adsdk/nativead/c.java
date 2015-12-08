// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.cmcm.adsdk.b.c.b;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            j, AdmobNativeLoader

final class c
    implements com.google.android.gms.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener
{

    final AdmobNativeLoader a;

    c(AdmobNativeLoader admobnativeloader)
    {
        a = admobnativeloader;
        super();
    }

    public final void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
    {
        b.a("AdmobNativeLoader", "Admob NativeAppInstallAd load sucess");
        nativeappinstallad = new j(nativeappinstallad, a.mPositionId, a.mNativeAdListener);
        AdmobNativeLoader.access$300(a).add(nativeappinstallad);
        AdmobNativeLoader.access$400(a);
        AdmobNativeLoader.access$000(a).set(false);
    }
}
