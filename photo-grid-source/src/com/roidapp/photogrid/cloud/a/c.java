// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud.a;

import com.google.ads.formats.NativeAppInstallAd;

// Referenced classes of package com.roidapp.photogrid.cloud.a:
//            a

final class c
    implements com.google.ads.formats.NativeAppInstallAd.OnAppInstallAdLoadedListener
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
    {
        a.b = 8;
        com.roidapp.photogrid.cloud.a.a.a(a, nativeappinstallad);
        a.c = true;
        nativeappinstallad.recordImpression();
        a.b();
    }
}
