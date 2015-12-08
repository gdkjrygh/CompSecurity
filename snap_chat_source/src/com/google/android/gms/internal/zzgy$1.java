// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzgy, zzhq, zzha, 
//            zzhx, zzic

class zzxB
    implements zzcv
{

    final zzgy zzxB;

    public void zza(zzic zzic, Map map)
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
        if (zzgy.zzc(zzxB).equals(map.get("request_id")))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        zzic;
        JVM INSTR monitorexit ;
        return;
        map;
        zzic;
        JVM INSTR monitorexit ;
        throw map;
        map = new zzha(1, map);
        zzhx.zzac((new StringBuilder("Invalid ")).append(map.getType()).append(" request error: ").append(map.zzdU()).toString());
        zzgy.zzb(zzxB).zzb(map);
        zzic;
        JVM INSTR monitorexit ;
    }

    (zzgy zzgy1)
    {
        zzxB = zzgy1;
        super();
    }
}
