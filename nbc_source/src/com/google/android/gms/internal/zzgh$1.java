// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzgh, zzhs, zzgj, 
//            zzid

class zzDQ
    implements zzdg
{

    final zzgh zzDQ;

    public void zza(zzid zzid, Map map)
    {
label0:
        {
            synchronized (zzgh.zza(zzDQ))
            {
                if (!com.google.android.gms.internal.zzgh.zzb(zzDQ).isDone())
                {
                    break label0;
                }
            }
            return;
        }
        if (zzgh.zzc(zzDQ).equals(map.get("request_id")))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        zzid;
        JVM INSTR monitorexit ;
        return;
        map;
        zzid;
        JVM INSTR monitorexit ;
        throw map;
        map = new zzgj(1, map);
        zzb.zzaC((new StringBuilder()).append("Invalid ").append(map.getType()).append(" request error: ").append(map.zzfG()).toString());
        com.google.android.gms.internal.zzgh.zzb(zzDQ).zzf(map);
        zzid;
        JVM INSTR monitorexit ;
    }

    l.client.zzb(zzgh zzgh1)
    {
        zzDQ = zzgh1;
        super();
    }
}
