// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzdt, zzbb

class zzxb
    implements c
{

    final zzdt zzwU;
    final e zzxb;

    public void zza(zzbb zzbb1)
    {
        synchronized (zzdt.zzc(zzwU))
        {
            zzdt.zza(zzwU, 0);
            if (zzdt.zzg(zzwU) != null && zzxb != zzdt.zzg(zzwU))
            {
                zzb.zzaB("New JS engine is loaded, marking previous one as destroyable.");
                zzdt.zzg(zzwU).zzdX();
            }
            zzdt.zza(zzwU, zzxb);
        }
        return;
        exception;
        zzbb1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzc(Object obj)
    {
        zza((zzbb)obj);
    }

    e(zzdt zzdt1, e e)
    {
        zzwU = zzdt1;
        zzxb = e;
        super();
    }
}
