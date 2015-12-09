// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.p;
import com.google.b.q;

// Referenced classes of package com.google.b.e:
//            u, v, x

final class w
{

    private static final int a[] = {
        1, 1, 2
    };
    private final u b = new u();
    private final v c = new v();

    w()
    {
    }

    q a(int i, a a1, int j)
    {
        int ai[] = com.google.b.e.x.a(a1, j, false, a);
        q q;
        try
        {
            q = c.a(i, a1, ai);
        }
        catch (p p1)
        {
            return b.a(i, a1, ai);
        }
        return q;
    }

}
