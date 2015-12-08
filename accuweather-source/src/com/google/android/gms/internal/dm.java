// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            dk, dg

public final class dm extends dh.a
{

    private final PlayStorePurchaseListener mA;

    public dm(PlayStorePurchaseListener playstorepurchaselistener)
    {
        mA = playstorepurchaselistener;
    }

    public void a(dg dg)
    {
        mA.onInAppPurchaseFinished(new dk(dg));
    }

    public boolean isValidPurchase(String s)
    {
        return mA.isValidPurchase(s);
    }
}
