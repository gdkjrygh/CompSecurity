// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzvm, zzvg, zzvn, zzvk, 
//            zzve

class zzaBT
    implements zzvm
{

    final zzve zzaBS;
    final a zzaBT;
    final zzvg zzaBU;

    public void zza(Status status, Object obj, Integer integer, long l)
    {
        if (status.isSuccess())
        {
            if (integer == zzvn.zzaCx)
            {
                status = a.zza.zzaCh;
            } else
            {
                status = a.zza.zzaCg;
            }
            status = new a(Status.zzNo, zzaBS, null, (c)obj, status, l);
        } else
        {
            status = new a(new Status(16, (new StringBuilder("There is no valid resource for the container: ")).append(zzaBS.getContainerId()).toString()), null, a.zza.zzaCg);
        }
        zzaBT.zza(new zzvk(status));
    }

    a(zzvg zzvg1, zzve zzve1, a a)
    {
        zzaBU = zzvg1;
        zzaBS = zzve1;
        zzaBT = a;
        super();
    }
}
