// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class t extends ab.a
{

    private final AdListener dT;

    public t(AdListener adlistener)
    {
        dT = adlistener;
    }

    public void onAdClosed()
    {
        dT.onAdClosed();
    }

    public void onAdFailedToLoad(int i)
    {
        dT.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication()
    {
        dT.onAdLeftApplication();
    }

    public void onAdLoaded()
    {
        dT.onAdLoaded();
    }

    public void onAdOpened()
    {
        dT.onAdOpened();
    }
}
