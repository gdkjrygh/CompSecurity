// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzdf, zzia, zzic

class zzrY
    implements zzcv
{

    final zzia zzrY;
    final zzdf zzrZ;

    public void zza(zzic zzic, Map map)
    {
label0:
        {
            synchronized (zzdf.zza(zzrZ))
            {
                if (zzrY.getStatus() != -1 && zzrY.getStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        zzrY.zzc(zzdf.zzb(zzrZ));
        zzrY.zza(zzdf.zzc(zzrZ), new b());
        zzdf.zza(zzrZ, 0);
        if (zzrY != zzdf.zzd(zzrZ))
        {
            zzrZ.zzd(zzdf.zzd(zzrZ));
        }
        zzdf.zza(zzrZ, zzrY);
        zzrZ.zzc(zzdf.zzd(zzrZ));
        zzic;
        JVM INSTR monitorexit ;
        return;
        map;
        zzic;
        JVM INSTR monitorexit ;
        throw map;
    }

    b(zzdf zzdf1, zzia zzia1)
    {
        zzrZ = zzdf1;
        zzrY = zzia1;
        super();
    }
}
