// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.d.l;
import java.util.List;

// Referenced classes of package com.b.a.a:
//            q, u

final class k
    implements l
{

    private final u a;
    private final q b;

    k(u u1, q q1)
    {
        a = u1;
        b = q1;
    }

    public final boolean a(List list)
    {
        long l1;
label0:
        {
            boolean flag = false;
            l1 = System.nanoTime();
            if (b.a(l1))
            {
                if (!a.a(list))
                {
                    break label0;
                }
                b.a();
                flag = true;
            }
            return flag;
        }
        b.b(l1);
        return false;
    }
}
