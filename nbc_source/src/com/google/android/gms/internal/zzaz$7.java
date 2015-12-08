// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzaz, zzax, zzid

class zzqT
    implements zzdg
{

    final zzaz zzqT;

    public void zza(zzid zzid, Map map)
    {
        if (!zzqT.zzb(map))
        {
            return;
        } else
        {
            zzb.zzay((new StringBuilder()).append("Received request to untrack: ").append(com.google.android.gms.internal.zzaz.zzb(zzqT).zzbT()).toString());
            zzqT.destroy();
            return;
        }
    }

    l.client.zzb(zzaz zzaz1)
    {
        zzqT = zzaz1;
        super();
    }
}
