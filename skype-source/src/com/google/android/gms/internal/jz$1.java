// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            kf, jz, kg, kd, 
//            jx

final class b
    implements kf
{

    final jx a;
    final nit> b;
    final jz c;

    public final void a(Status status, Object obj, Integer integer, long l)
    {
        if (status.d())
        {
            if (integer == kg.a)
            {
                status = a.c;
            } else
            {
                status = a.b;
            }
            status = new <init>(Status.a, a, null, (a)obj, status, l);
        } else
        {
            status = new <init>(new Status(16, (new StringBuilder("There is no valid resource for the container: ")).append(a.a()).toString()), null, a.b);
        }
        b.a(new kd(status));
    }

    tus(jz jz1, jx jx1, tus tus)
    {
        c = jz1;
        a = jx1;
        b = tus;
        super();
    }
}
