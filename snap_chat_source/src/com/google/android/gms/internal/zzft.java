// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzfw, zzfn

public final class zzft extends zzfo.zza
{

    private final InAppPurchaseListener zzpJ;

    public zzft(InAppPurchaseListener inapppurchaselistener)
    {
        zzpJ = inapppurchaselistener;
    }

    public final void zza(zzfn zzfn)
    {
        zzpJ.onInAppPurchaseRequested(new zzfw(zzfn));
    }
}
