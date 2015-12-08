// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzdf, zzhx, zzhv, 
//            zzah, zzic

class zzsb
    implements zzcv
{

    final zzdf zzrZ;
    final zzhv zzsb;

    public void zza(zzic zzic, Map map)
    {
        synchronized (zzdf.zza(zzrZ))
        {
            zzdf.zza(zzrZ, 1);
            zzhx.zzaa("Javascript is requesting an update");
            zzdf.zzb(zzrZ).zzb("/requestReload", (zzcv)zzsb.get());
        }
        return;
        map;
        zzic;
        JVM INSTR monitorexit ;
        throw map;
    }

    (zzdf zzdf1, zzhv zzhv1)
    {
        zzrZ = zzdf1;
        zzsb = zzhv1;
        super();
    }
}
