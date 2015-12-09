// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.c;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.a.a.a.r;
import com.nuance.a.a.a.c.a.a.b.b;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.a.c:
//            k, d

public class c
{

    private static final e a = d.a(com/nuance/a/a/a/c/a/c/c);

    private c()
    {
    }

    public static com.nuance.a.a.a.c.a.c.d a(com.nuance.a.a.a.c.a.b.e e1, k k, Vector vector)
    {
        a.b();
        if (e1 == null)
        {
            a.b("manager is null");
            throw new NullPointerException("manager can not be null!");
        }
        if (k == null)
        {
            a.b("nmasListener is null");
            throw new NullPointerException("nmasListener can not be null!");
        }
        for (int i = 0; i < vector.size(); i++)
        {
            com.nuance.a.a.a.c.c.c c1 = (com.nuance.a.a.a.c.c.c)vector.elementAt(i);
            if (c1.d() == com.nuance.a.a.a.c.c.d.c || c1.d() == com.nuance.a.a.a.c.c.d.d || c1.d() == com.nuance.a.a.a.c.c.d.e || c1.d() == com.nuance.a.a.a.c.c.d.f || c1.d() == com.nuance.a.a.a.c.c.d.g || c1.d() == com.nuance.a.a.a.c.c.d.h || c1.d() == com.nuance.a.a.a.c.c.d.i || c1.d() == com.nuance.a.a.a.c.c.d.j)
            {
                a.b((new StringBuilder("IllegalArgumentException Parameter type: ")).append(c1.d()).append(" not allowed. ").toString());
                throw new IllegalArgumentException((new StringBuilder("Parameter type: ")).append(c1.d()).append(" not allowed. ").toString());
            }
        }

        return new r((b)e1, k, vector);
    }

}
