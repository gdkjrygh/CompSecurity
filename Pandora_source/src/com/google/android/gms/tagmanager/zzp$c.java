// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzht;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbf, zzp, zzbg

private class <init>
    implements zzbf
{

    final zzp a;

    public void a()
    {
    }

    public void a(com.google.android.gms.internal.j j)
    {
label0:
        {
            synchronized (a)
            {
                if (j.zzhh != null)
                {
                    break MISSING_BLOCK_LABEL_59;
                }
                if (zzp.zzi(a).zzhh != null)
                {
                    break label0;
                }
                zzbg.zzak("Current resource is null; network resource is also null");
                zzp.zza(a, 0x36ee80L);
            }
            return;
        }
        j.zzhh = zzp.zzi(a).zzhh;
        zzp.zza(a, j, zzp.zzg(a).currentTimeMillis(), false);
        zzbg.zzam((new StringBuilder()).append("setting refresh time to current time: ").append(zzp.zzj(a)).toString());
        if (!zzp.zzk(a))
        {
            zzp.zza(a, j);
        }
        zzp1;
        JVM INSTR monitorexit ;
        return;
        j;
        zzp1;
        JVM INSTR monitorexit ;
        throw j;
    }

    public void a(za za)
    {
        za = a;
        za;
        JVM INSTR monitorenter ;
        if (!a.isReady())
        {
            if (zzp.zzf(a) == null)
            {
                break MISSING_BLOCK_LABEL_54;
            }
            a.setResult(zzp.zzf(a));
        }
_L2:
        zzp.zza(a, 0x36ee80L);
        return;
        a.setResult(a.zzaO(Status.zzQX));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        za;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Object obj)
    {
        a((com.google.android.gms.internal.j)obj);
    }

    private za(zzp zzp1)
    {
        a = zzp1;
        super();
    }

    a(zzp zzp1, a a1)
    {
        this(zzp1);
    }
}
