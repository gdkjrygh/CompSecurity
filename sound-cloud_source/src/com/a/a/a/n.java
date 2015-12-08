// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.c.a.a;
import b.a.a.a.a.c.a.e;
import b.a.a.a.a.d.k;
import java.util.List;

// Referenced classes of package com.a.a.a:
//            u, y

final class n
    implements k
{

    private final y a;
    private final u b;

    n(y y1, u u1)
    {
        a = y1;
        b = u1;
    }

    public final boolean a(List list)
    {
        long l = System.nanoTime();
        u u1 = b;
        e e3 = u1.b;
        long l1 = e3.b.a(e3.a);
        boolean flag;
        if (l - u1.a >= 0xf4240L * l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (a.a(list))
            {
                list = b;
                list.a = 0L;
                e e1 = ((u) (list)).b;
                list.b = new e(e1.b, e1.c);
                return true;
            } else
            {
                list = b;
                list.a = l;
                e e2 = ((u) (list)).b;
                list.b = new e(e2.a + 1, e2.b, e2.c);
                return false;
            }
        } else
        {
            return false;
        }
    }
}
