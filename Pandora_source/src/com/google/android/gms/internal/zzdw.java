// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzdz, zzdq

public final class zzdw extends zzdr.zza
{

    private final InAppPurchaseListener zzqH;

    public zzdw(InAppPurchaseListener inapppurchaselistener)
    {
        zzqH = inapppurchaselistener;
    }

    public void zza(zzdq zzdq)
    {
        zzqH.onInAppPurchaseRequested(new zzdz(zzdq));
    }
}
