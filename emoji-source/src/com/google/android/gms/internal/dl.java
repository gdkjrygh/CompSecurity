// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            dj, df

public final class dl extends dg.a
{

    private final PlayStorePurchaseListener mC;

    public dl(PlayStorePurchaseListener playstorepurchaselistener)
    {
        mC = playstorepurchaselistener;
    }

    public void a(df df)
    {
        mC.onInAppPurchaseFinished(new dj(df));
    }

    public boolean isValidPurchase(String s)
    {
        return mC.isValidPurchase(s);
    }
}
