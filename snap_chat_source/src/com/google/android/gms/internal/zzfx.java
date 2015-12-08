// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzfv, zzfr

public final class zzfx extends zzfs.zza
{

    private final PlayStorePurchaseListener zzpK;

    public zzfx(PlayStorePurchaseListener playstorepurchaselistener)
    {
        zzpK = playstorepurchaselistener;
    }

    public final boolean isValidPurchase(String s)
    {
        return zzpK.isValidPurchase(s);
    }

    public final void zza(zzfr zzfr)
    {
        zzpK.onInAppPurchaseFinished(new zzfv(zzfr));
    }
}
