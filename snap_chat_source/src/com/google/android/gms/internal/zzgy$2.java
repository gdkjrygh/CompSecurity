// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzgy, zzhq, zzha, 
//            zzhx, zzic, zzhk

class zzxB
    implements zzcv
{

    final zzgy zzxB;

    public void zza(zzic zzic1, Map map)
    {
label0:
        {
            synchronized (zzgy.zza(zzxB))
            {
                if (!zzgy.zzb(zzxB).isDone())
                {
                    break label0;
                }
            }
            return;
        }
        zzha zzha1;
        zzha1 = new zzha(-2, map);
        if (zzgy.zzc(zzxB).equals(zzha1.getRequestId()))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        zzhx.zzac((new StringBuilder()).append(zzha1.getRequestId()).append(" ==== ").append(zzgy.zzc(zzxB)).toString());
        obj;
        JVM INSTR monitorexit ;
        return;
        zzic1;
        obj;
        JVM INSTR monitorexit ;
        throw zzic1;
        String s = zzha1.getUrl();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        zzhx.zzac("URL missing in loadAdUrl GMSG.");
        obj;
        JVM INSTR monitorexit ;
        return;
        if (s.contains("%40mediation_adapters%40"))
        {
            zzic1 = s.replaceAll("%40mediation_adapters%40", zzhk.zza(zzic1.getContext(), (String)map.get("check_adapters"), zzgy.zzd(zzxB)));
            zzha1.setUrl(zzic1);
            zzhx.zzab((new StringBuilder("Ad request URL modified to ")).append(zzic1).toString());
        }
        zzgy.zzb(zzxB).zzb(zzha1);
        obj;
        JVM INSTR monitorexit ;
    }

    (zzgy zzgy1)
    {
        zzxB = zzgy1;
        super();
    }
}
