// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.zzbf;

// Referenced classes of package com.google.android.gms.internal:
//            zzvt, zzvg, zzvk, zzve, 
//            zzvn, zzvj, zzvh

class zzaBV extends zzvt
{

    final zzvg zzaBU;
    private final zzaBV zzaBV;

    protected zzaBV zza(zzve zzve1)
    {
        return null;
    }

    protected void zza(zzvk zzvk1)
    {
        zzaBV zzabv = zzvk1.zzuo();
        zzaBU.zza(zzabv);
        if (zzabv.getStatus() == Status.zzNo && zzabv.zzup() == zza.zzaCf && zzabv.zzuq() != null && zzabv.zzuq().length > 0)
        {
            zzvg.zza(zzaBU).zzf(zzabv.zzur().zzuj(), zzabv.zzuq());
            zzbf.zzab("Resource successfully load from Network.");
            zzaBV.zza(zzvk1);
            return;
        }
        StringBuilder stringbuilder = new StringBuilder("Response status: ");
        if (zzabv.getStatus().isSuccess())
        {
            zzvk1 = "SUCCESS";
        } else
        {
            zzvk1 = "FAILURE";
        }
        zzbf.zzab(stringbuilder.append(zzvk1).toString());
        if (zzabv.getStatus().isSuccess())
        {
            zzbf.zzab((new StringBuilder("Response source: ")).append(zzabv.zzup().toString()).toString());
            zzbf.zzab((new StringBuilder("Response size: ")).append(zzabv.zzuq().length).toString());
        }
        zzaBU.zza(zzabv.zzur(), zzaBV);
    }

    zza(zzvg zzvg1, zzvj zzvj, zzvh zzvh, zza zza1)
    {
        zzaBU = zzvg1;
        super(zzvj, zzvh);
        zzaBV = zza1;
    }
}
