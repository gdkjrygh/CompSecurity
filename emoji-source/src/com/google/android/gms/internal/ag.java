// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class ag extends ap.a
{

    private final AdListener lQ;

    public ag(AdListener adlistener)
    {
        lQ = adlistener;
    }

    public void onAdClosed()
    {
        lQ.onAdClosed();
    }

    public void onAdFailedToLoad(int i)
    {
        lQ.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication()
    {
        lQ.onAdLeftApplication();
    }

    public void onAdLoaded()
    {
        lQ.onAdLoaded();
    }

    public void onAdOpened()
    {
        lQ.onAdOpened();
    }
}
