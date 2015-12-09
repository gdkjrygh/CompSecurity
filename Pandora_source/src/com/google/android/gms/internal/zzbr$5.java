// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzbr, zzgd

static final class l.client.zzb
    implements zzbs
{

    public void zza(zzgd zzgd1, Map map)
    {
        map = zzgd1.zzfr();
        if (map != null)
        {
            map.close();
            return;
        }
        zzgd1 = zzgd1.zzfs();
        if (zzgd1 != null)
        {
            zzgd1.close();
            return;
        } else
        {
            zzb.zzan("A GMSG tried to close something that wasn't an overlay.");
            return;
        }
    }

    l.client.zzb()
    {
    }
}
