// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzlv;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbx, zzap, zzbf

class zzazt
    implements zzazt
{

    final zzbx zzazt;

    public void zza(zzap zzap1)
    {
        zzbx.zza(zzazt, zzap1.zzgs());
    }

    public void zzb(zzap zzap1)
    {
        zzbx.zza(zzazt, zzap1.zzgs());
        zzbf.zzab((new StringBuilder("Permanent failure dispatching hitId: ")).append(zzap1.zzgs()).toString());
    }

    public void zzc(zzap zzap1)
    {
        long l = zzap1.zztj();
        if (l == 0L)
        {
            zzbx.zza(zzazt, zzap1.zzgs(), zzbx.zza(zzazt).currentTimeMillis());
        } else
        if (l + 0xdbba00L < zzbx.zza(zzazt).currentTimeMillis())
        {
            zzbx.zza(zzazt, zzap1.zzgs());
            zzbf.zzab((new StringBuilder("Giving up on failed hitId: ")).append(zzap1.zzgs()).toString());
            return;
        }
    }

    (zzbx zzbx1)
    {
        zzazt = zzbx1;
        super();
    }
}
