// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

public final class zzc extends zzn.zza
{

    private final AdListener zzrV;

    public zzc(AdListener adlistener)
    {
        zzrV = adlistener;
    }

    public void onAdClosed()
    {
        zzrV.onAdClosed();
    }

    public void onAdFailedToLoad(int i)
    {
        zzrV.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication()
    {
        zzrV.onAdLeftApplication();
    }

    public void onAdLoaded()
    {
        zzrV.onAdLoaded();
    }

    public void onAdOpened()
    {
        zzrV.onAdOpened();
    }
}
