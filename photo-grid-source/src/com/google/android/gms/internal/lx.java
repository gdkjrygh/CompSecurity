// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            lj, mc, lf

public final class lx extends lj
{

    private final InAppPurchaseListener a;

    public lx(InAppPurchaseListener inapppurchaselistener)
    {
        a = inapppurchaselistener;
    }

    public final void a(lf lf)
    {
        a.onInAppPurchaseRequested(new mc(lf));
    }
}
