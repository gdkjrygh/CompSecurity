// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            dk, db

public final class dh extends dc.a
{

    private final InAppPurchaseListener mB;

    public dh(InAppPurchaseListener inapppurchaselistener)
    {
        mB = inapppurchaselistener;
    }

    public void a(db db)
    {
        mB.onInAppPurchaseRequested(new dk(db));
    }
}
