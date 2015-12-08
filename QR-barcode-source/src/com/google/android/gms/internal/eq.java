// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            eo, ek

public final class eq extends el.a
{

    private final PlayStorePurchaseListener oD;

    public eq(PlayStorePurchaseListener playstorepurchaselistener)
    {
        oD = playstorepurchaselistener;
    }

    public void a(ek ek)
    {
        oD.onInAppPurchaseFinished(new eo(ek));
    }

    public boolean isValidPurchase(String s)
    {
        return oD.isValidPurchase(s);
    }
}
