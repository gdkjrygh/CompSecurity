// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

public final class zzc extends zzo.zza
{

    private final AdListener a;

    public zzc(AdListener adlistener)
    {
        a = adlistener;
    }

    public final void onAdClosed()
    {
        a.onAdClosed();
    }

    public final void onAdFailedToLoad(int i)
    {
        a.onAdFailedToLoad(i);
    }

    public final void onAdLeftApplication()
    {
        a.onAdLeftApplication();
    }

    public final void onAdLoaded()
    {
        a.onAdLoaded();
    }

    public final void onAdOpened()
    {
        a.onAdOpened();
    }
}
