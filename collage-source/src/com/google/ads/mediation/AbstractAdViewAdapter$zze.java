// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.zzb;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class b extends AdListener
    implements com.google.android.gms.ads.formats.stallAdLoadedListener, com.google.android.gms.ads.formats.dLoadedListener, zza
{

    final AbstractAdViewAdapter a;
    final zzb b;

    public void onAdClicked()
    {
        b.zzd(a);
    }

    public void onAdClosed()
    {
        b.zzb(a);
    }

    public void onAdFailedToLoad(int i)
    {
        b.zza(a, i);
    }

    public void onAdLeftApplication()
    {
        b.zzc(a);
    }

    public void onAdLoaded()
    {
    }

    public void onAdOpened()
    {
        b.zza(a);
    }

    public void onAppInstallAdLoaded(NativeAppInstallAd nativeappinstallad)
    {
        b.zza(a, new <init>(nativeappinstallad));
    }

    public void onContentAdLoaded(NativeContentAd nativecontentad)
    {
        b.zza(a, new <init>(nativecontentad));
    }

    public Ad(AbstractAdViewAdapter abstractadviewadapter, zzb zzb1)
    {
        a = abstractadviewadapter;
        b = zzb1;
    }
}
