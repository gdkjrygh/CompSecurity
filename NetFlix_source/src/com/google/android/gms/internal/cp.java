// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            cq, cn

public final class cp extends co.a
{

    private final InAppPurchaseListener mp;

    public cp(InAppPurchaseListener inapppurchaselistener)
    {
        mp = inapppurchaselistener;
    }

    public void a(cn cn)
    {
        mp.onInAppPurchaseRequested(new cq(cn));
    }
}
