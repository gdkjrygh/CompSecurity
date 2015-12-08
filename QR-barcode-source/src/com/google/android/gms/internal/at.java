// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class at extends bc.a
{

    private final AdListener nR;

    public at(AdListener adlistener)
    {
        nR = adlistener;
    }

    public void onAdClosed()
    {
        nR.onAdClosed();
    }

    public void onAdFailedToLoad(int i)
    {
        nR.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication()
    {
        nR.onAdLeftApplication();
    }

    public void onAdLoaded()
    {
        nR.onAdLoaded();
    }

    public void onAdOpened()
    {
        nR.onAdOpened();
    }
}
