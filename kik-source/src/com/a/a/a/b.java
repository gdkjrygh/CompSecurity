// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.d.p;
import java.util.List;

// Referenced classes of package com.a.a.a:
//            j, n

final class b
    implements p
{

    private final n a;
    private final j b;

    b(n n1, j j1)
    {
        a = n1;
        b = j1;
    }

    public final boolean a(List list)
    {
        long l;
label0:
        {
            boolean flag = false;
            l = System.nanoTime();
            if (b.a(l))
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
        b.b(l);
        return false;
    }
}
