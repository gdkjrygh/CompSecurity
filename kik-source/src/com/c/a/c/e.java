// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;


// Referenced classes of package com.c.a.c:
//            d, l, j, i, 
//            g

final class e extends d
{

    e(String s)
    {
        super(s, 0, (byte)0);
    }

    public final boolean a(Object obj, g g, int k, d.a a1)
    {
        long l2 = a1.a();
        long l3 = l.a().a(obj, g).c();
        int l1 = (int)l3;
        int i2 = (int)(l3 >>> 32);
        boolean flag = false;
        for (int i1 = 1; i1 <= k; i1++)
        {
            int k1 = i1 * i2 + l1;
            int j1 = k1;
            if (k1 < 0)
            {
                j1 = ~k1;
            }
            flag |= a1.a((long)j1 % l2);
        }

        return flag;
    }

    public final boolean b(Object obj, g g, int k, d.a a1)
    {
        long l2 = a1.a();
        long l3 = l.a().a(obj, g).c();
        int l1 = (int)l3;
        int i2 = (int)(l3 >>> 32);
        for (int i1 = 1; i1 <= k; i1++)
        {
            int k1 = i1 * i2 + l1;
            int j1 = k1;
            if (k1 < 0)
            {
                j1 = ~k1;
            }
            if (!a1.b((long)j1 % l2))
            {
                return false;
            }
        }

        return true;
    }
}
