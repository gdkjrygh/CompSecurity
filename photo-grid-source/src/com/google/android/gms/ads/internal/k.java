// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zze;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp, j, zzk, zzq

final class k
    implements Runnable
{

    final AdOverlayInfoParcel a;
    final j b;

    k(j j1, AdOverlayInfoParcel adoverlayinfoparcel)
    {
        b = j1;
        a = adoverlayinfoparcel;
        super();
    }

    public final void run()
    {
        zzp.zzbt().zza(b.a.f.context, a);
    }
}
