// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzqg, zzqa, zzqh, zzqe, 
//            zzpy

class zzaPi
    implements zzqg
{

    final zzpy zzaPh;
    final a zzaPi;
    final zzqa zzaPj;

    public void zza(Status status, Object obj, Integer integer, long l)
    {
        if (status.isSuccess())
        {
            if (integer == zzqh.zzaPM)
            {
                status = a.zza.zzaPw;
            } else
            {
                status = a.zza.zzaPv;
            }
            status = new a(Status.zzXP, zzaPh, null, (c)obj, status, l);
        } else
        {
            status = new a(new Status(16, (new StringBuilder()).append("There is no valid resource for the container: ").append(zzaPh.getContainerId()).toString()), null, a.zza.zzaPv);
        }
        zzaPi.zza(new zzqe(status));
    }

    a(zzqa zzqa1, zzpy zzpy1, a a)
    {
        zzaPj = zzqa1;
        zzaPh = zzpy1;
        zzaPi = a;
        super();
    }
}
