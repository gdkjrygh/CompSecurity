// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            ev, er

public final class ex extends es.a
{

    private final PlayStorePurchaseListener a;

    public ex(PlayStorePurchaseListener playstorepurchaselistener)
    {
        a = playstorepurchaselistener;
    }

    public void a(er er)
    {
        a.onInAppPurchaseFinished(new ev(er));
    }

    public boolean a(String s)
    {
        return a.isValidPurchase(s);
    }
}
