// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            ev, em

public final class es extends en.a
{

    private final InAppPurchaseListener oM;

    public es(InAppPurchaseListener inapppurchaselistener)
    {
        oM = inapppurchaselistener;
    }

    public void a(em em)
    {
        oM.onInAppPurchaseRequested(new ev(em));
    }
}
