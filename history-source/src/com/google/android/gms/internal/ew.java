// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            eu, eq

public final class ew extends er.a
{

    private final PlayStorePurchaseListener oN;

    public ew(PlayStorePurchaseListener playstorepurchaselistener)
    {
        oN = playstorepurchaselistener;
    }

    public void a(eq eq)
    {
        oN.onInAppPurchaseFinished(new eu(eq));
    }

    public boolean isValidPurchase(String s)
    {
        return oN.isValidPurchase(s);
    }
}
