// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class zzav extends zzbh.zza
{

    private final AdListener zzoK;

    public zzav(AdListener adlistener)
    {
        zzoK = adlistener;
    }

    public final void onAdClosed()
    {
        zzoK.onAdClosed();
    }

    public final void onAdFailedToLoad(int i)
    {
        zzoK.onAdFailedToLoad(i);
    }

    public final void onAdLeftApplication()
    {
        zzoK.onAdLeftApplication();
    }

    public final void onAdLoaded()
    {
        zzoK.onAdLoaded();
    }

    public final void onAdOpened()
    {
        zzoK.onAdOpened();
    }
}
