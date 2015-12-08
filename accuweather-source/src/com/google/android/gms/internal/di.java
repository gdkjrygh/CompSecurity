// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            dl, dc

public final class di extends dd.a
{

    private final InAppPurchaseListener mz;

    public di(InAppPurchaseListener inapppurchaselistener)
    {
        mz = inapppurchaselistener;
    }

    public void a(dc dc)
    {
        mz.onInAppPurchaseRequested(new dl(dc));
    }
}
