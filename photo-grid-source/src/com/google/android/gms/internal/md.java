// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            lv, ma, lr

public final class md extends lv
{

    private final PlayStorePurchaseListener a;

    public md(PlayStorePurchaseListener playstorepurchaselistener)
    {
        a = playstorepurchaselistener;
    }

    public final void a(lr lr)
    {
        a.onInAppPurchaseFinished(new ma(lr));
    }

    public final boolean a(String s)
    {
        return a.isValidPurchase(s);
    }
}
