// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

public final class zzc extends zzm.zza
{

    private final AdListener zzpH;

    public zzc(AdListener adlistener)
    {
        zzpH = adlistener;
    }

    public void onAdClosed()
    {
        zzpH.onAdClosed();
    }

    public void onAdFailedToLoad(int i)
    {
        zzpH.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication()
    {
        zzpH.onAdLeftApplication();
    }

    public void onAdLoaded()
    {
        zzpH.onAdLoaded();
    }

    public void onAdOpened()
    {
        zzpH.onAdOpened();
    }
}
