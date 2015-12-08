// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import b.a.a.a.a.d.q;
import java.util.List;

// Referenced classes of package com.a.a.a:
//            h, j

final class b
    implements q
{

    private final j a;
    private final h b;

    b(j j1, h h1)
    {
        a = j1;
        b = h1;
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
