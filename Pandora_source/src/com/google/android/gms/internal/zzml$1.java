// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzmr, zzml, zzms, zzmp, 
//            zzmj

class b
    implements zzmr
{

    final zzmj a;
    final a b;
    final zzml c;

    public void zza(Status status, Object obj, Integer integer, long l)
    {
        if (status.isSuccess())
        {
            if (integer == zzms.zzaHy)
            {
                status = a.zza.zzaHi;
            } else
            {
                status = a.zza.zzaHh;
            }
            status = new a(Status.zzQU, a, null, (c)obj, status, l);
        } else
        {
            status = new a(new Status(16, (new StringBuilder()).append("There is no valid resource for the container: ").append(a.getContainerId()).toString()), null, a.zza.zzaHh);
        }
        b.zza(new zzmp(status));
    }

    a(zzml zzml1, zzmj zzmj1, a a1)
    {
        c = zzml1;
        a = zzmj1;
        b = a1;
        super();
    }
}
