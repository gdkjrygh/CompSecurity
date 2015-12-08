// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.zzbg;

// Referenced classes of package com.google.android.gms.internal:
//            zzmy, zzml, zzmp, zzmj, 
//            zzms, zzmo, zzmm

class b extends zzmy
{

    final zzml a;
    private final a b;

    protected b zza(zzmj zzmj1)
    {
        return null;
    }

    protected void zza(zzmp zzmp1)
    {
        a a1 = zzmp1.zzym();
        a.zza(a1);
        if (a1.getStatus() == Status.zzQU && a1.zzyn() == a.zza.zzaHg && a1.zzyo() != null && a1.zzyo().length > 0)
        {
            zzml.zza(a).zze(a1.zzyp().zzyh(), a1.zzyo());
            zzbg.zzam("Resource successfully load from Network.");
            b.zza(zzmp1);
            return;
        }
        StringBuilder stringbuilder = (new StringBuilder()).append("Response status: ");
        if (a1.getStatus().isSuccess())
        {
            zzmp1 = "SUCCESS";
        } else
        {
            zzmp1 = "FAILURE";
        }
        zzbg.zzam(stringbuilder.append(zzmp1).toString());
        if (a1.getStatus().isSuccess())
        {
            zzbg.zzam((new StringBuilder()).append("Response source: ").append(a1.zzyn().toString()).toString());
            zzbg.zzam((new StringBuilder()).append("Response size: ").append(a1.zzyo().length).toString());
        }
        a.zza(a1.zzyp(), b);
    }

    a(zzml zzml1, zzmo zzmo, zzmm zzmm, a a1)
    {
        a = zzml1;
        super(zzmo, zzmm);
        b = a1;
    }
}
