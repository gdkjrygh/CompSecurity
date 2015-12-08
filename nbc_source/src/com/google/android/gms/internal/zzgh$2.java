// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzgh, zzhs, zzgj, 
//            zzid, zzhg

class zzDQ
    implements zzdg
{

    final zzgh zzDQ;

    public void zza(zzid zzid1, Map map)
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
        zzgj zzgj1;
        zzgj1 = new zzgj(-2, map);
        if (zzgh.zzc(zzDQ).equals(zzgj1.getRequestId()))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        zzb.zzaC((new StringBuilder()).append(zzgj1.getRequestId()).append(" ==== ").append(zzgh.zzc(zzDQ)).toString());
        obj;
        JVM INSTR monitorexit ;
        return;
        zzid1;
        obj;
        JVM INSTR monitorexit ;
        throw zzid1;
        String s = zzgj1.getUrl();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        zzb.zzaC("URL missing in loadAdUrl GMSG.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (s.contains("%40mediation_adapters%40"))
        {
            zzid1 = s.replaceAll("%40mediation_adapters%40", zzhg.zza(zzid1.getContext(), (String)map.get("check_adapters"), zzgh.zzd(zzDQ)));
            zzgj1.setUrl(zzid1);
            zzb.zzaB((new StringBuilder()).append("Ad request URL modified to ").append(zzid1).toString());
        }
        com.google.android.gms.internal.zzgh.zzb(zzDQ).zzf(zzgj1);
        obj;
        JVM INSTR monitorexit ;
    }

    l.client.zzb(zzgh zzgh1)
    {
        zzDQ = zzgh1;
        super();
    }
}
