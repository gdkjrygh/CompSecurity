// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class ah extends aq.a
{

    private final AdListener lO;

    public ah(AdListener adlistener)
    {
        lO = adlistener;
    }

    public void onAdClosed()
    {
        lO.onAdClosed();
    }

    public void onAdFailedToLoad(int i)
    {
        lO.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication()
    {
        lO.onAdLeftApplication();
    }

    public void onAdLoaded()
    {
        lO.onAdLoaded();
    }

    public void onAdOpened()
    {
        lO.onAdOpened();
    }
}
