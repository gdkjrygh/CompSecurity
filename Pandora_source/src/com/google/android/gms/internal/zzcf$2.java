// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzcf, zzfx, zzgd

class a
    implements zzbs
{

    final zzfx a;
    final zzcf b;

    public void zza(zzgd zzgd, Map map)
    {
label0:
        {
            synchronized (zzcf.zza(b))
            {
                if (a.getStatus() != -1 && a.getStatus() != 1)
                {
                    break label0;
                }
            }
            return;
        }
        a.zzd(zzcf.zzb(b));
        a.zza(zzcf.zzc(b), new b());
        zzcf.zza(b, 0);
        if (a != zzcf.zzd(b))
        {
            b.zzd(zzcf.zzd(b));
        }
        zzcf.zza(b, a);
        b.zzc(zzcf.zzd(b));
        zzgd;
        JVM INSTR monitorexit ;
        return;
        map;
        zzgd;
        JVM INSTR monitorexit ;
        throw map;
    }

    b(zzcf zzcf1, zzfx zzfx1)
    {
        b = zzcf1;
        a = zzfx1;
        super();
    }
}
