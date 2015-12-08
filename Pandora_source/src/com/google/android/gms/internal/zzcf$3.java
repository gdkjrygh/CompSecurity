// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzcf, zzfr, zzy, 
//            zzgd

class a
    implements zzbs
{

    final zzfr a;
    final zzcf b;

    public void zza(zzgd zzgd, Map map)
    {
        synchronized (zzcf.zza(b))
        {
            zzcf.zza(b, 1);
            zzb.zzal("Javascript is requesting an update");
            com.google.android.gms.internal.zzcf.zzb(b).zzb("/requestReload", (zzbs)a.get());
        }
        return;
        map;
        zzgd;
        JVM INSTR monitorexit ;
        throw map;
    }

    l.client.zzb(zzcf zzcf1, zzfr zzfr1)
    {
        b = zzcf1;
        a = zzfr1;
        super();
    }
}
