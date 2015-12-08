// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            ep, eg

public final class em extends eh.a
{

    private final InAppPurchaseListener oC;

    public em(InAppPurchaseListener inapppurchaselistener)
    {
        oC = inapppurchaselistener;
    }

    public void a(eg eg)
    {
        oC.onInAppPurchaseRequested(new ep(eg));
    }
}
