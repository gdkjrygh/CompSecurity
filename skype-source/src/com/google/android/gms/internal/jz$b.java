// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ak;

// Referenced classes of package com.google.android.gms.internal:
//            km, jz, kd, jx, 
//            kg, kc, ka

final class b extends km
{

    final jz a;
    private final b b;

    protected final void a(kd kd1)
    {
        b b1 = kd1.a();
        a.a(b1);
        if (b1.a() == Status.a && b1.b() == a.a && b1.c() != null && b1.c().length > 0)
        {
            jz.a(a).a(b1.d().d(), b1.c());
            ak.b();
            b.a(kd1);
            return;
        }
        StringBuilder stringbuilder = new StringBuilder("Response status: ");
        if (b1.a().d())
        {
            kd1 = "SUCCESS";
        } else
        {
            kd1 = "FAILURE";
        }
        stringbuilder.append(kd1);
        ak.b();
        if (b1.a().d())
        {
            (new StringBuilder("Response source: ")).append(b1.b().toString());
            ak.b();
            (new StringBuilder("Response size: ")).append(b1.c().length);
            ak.b();
        }
        a.a(b1.d(), b);
    }

    a(jz jz1, kc kc, ka ka, a a1)
    {
        a = jz1;
        super(kc, ka);
        b = a1;
    }
}
