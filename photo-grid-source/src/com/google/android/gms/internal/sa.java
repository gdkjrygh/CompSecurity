// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzd;

// Referenced classes of package com.google.android.gms.internal:
//            zzja, ry, sc

final class sa
    implements Runnable
{

    final zzja a;

    sa(zzja zzja1)
    {
        a = zzja1;
        super();
    }

    public final void run()
    {
        a.a.x();
        zzd zzd1 = a.a.h();
        if (zzd1 != null)
        {
            zzd1.zzeG();
        }
        if (com.google.android.gms.internal.zzja.zzd(a) != null)
        {
            com.google.android.gms.internal.zzja.zzd(a).a();
            zzja.zza(a, null);
        }
    }
}
