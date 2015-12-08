// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class af extends ao.a
{

    private final AdListener lF;

    public af(AdListener adlistener)
    {
        lF = adlistener;
    }

    public void onAdClosed()
    {
        lF.onAdClosed();
    }

    public void onAdFailedToLoad(int i)
    {
        lF.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication()
    {
        lF.onAdLeftApplication();
    }

    public void onAdLoaded()
    {
        lF.onAdLoaded();
    }

    public void onAdOpened()
    {
        lF.onAdOpened();
    }
}
