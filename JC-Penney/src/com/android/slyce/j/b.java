// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.j;

import com.android.slyce.a.c.bs;
import com.android.slyce.a.c.j;
import com.android.slyce.h.c;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.android.slyce.j:
//            a, d

class b
    implements j
{

    final c a;
    final a b;

    b(a a1, c c1)
    {
        b = a1;
        a = c1;
        super();
    }

    public void a(Exception exception, bs bs1)
    {
        if (exception != null)
        {
            bs1 = new StringBuilder();
            bs1.append("Message: ").append(exception.getMessage()).append(" Cause: ").append(exception.getCause());
            exception = new HashMap();
            exception.put("detectionType", "3D");
            exception.put("error", bs1.toString());
            com.android.slyce.j.a.a(b, "Search.Error", exception);
            com.android.slyce.j.a.a(b).b(bs1.toString());
            return;
        }
        com.android.slyce.j.a.a(b).a(com.android.slyce.d.b.a);
        com.android.slyce.j.a.a(b, bs1);
        com.android.slyce.j.a.b(b);
        if (com.android.slyce.j.a.c(b))
        {
            com.android.slyce.j.a.d(b).d();
            return;
        }
        switch (d.a[a.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            b.b();
            return;

        case 2: // '\002'
            b.a();
            break;
        }
    }
}
