// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.AdListener;

public final class at extends bc.a
{

    private final AdListener ob;

    public at(AdListener adlistener)
    {
        ob = adlistener;
    }

    public void onAdClosed()
    {
        ob.onAdClosed();
    }

    public void onAdFailedToLoad(int i)
    {
        ob.onAdFailedToLoad(i);
    }

    public void onAdLeftApplication()
    {
        ob.onAdLeftApplication();
    }

    public void onAdLoaded()
    {
        ob.onAdLoaded();
    }

    public void onAdOpened()
    {
        ob.onAdOpened();
    }
}
