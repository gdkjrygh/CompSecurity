// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.c;

import com.c.a.g.b;

// Referenced classes of package com.c.a.c:
//            d, l, j, i, 
//            g

final class f extends d
{

    f(String s)
    {
        super(s, 1, (byte)0);
    }

    private static long a(byte abyte0[])
    {
        return com.c.a.g.b.a(abyte0[7], abyte0[6], abyte0[5], abyte0[4], abyte0[3], abyte0[2], abyte0[1], abyte0[0]);
    }

    private static long b(byte abyte0[])
    {
        return com.c.a.g.b.a(abyte0[15], abyte0[14], abyte0[13], abyte0[12], abyte0[11], abyte0[10], abyte0[9], abyte0[8]);
    }

    public final boolean a(Object obj, g g, int k, d.a a1)
    {
        int i1 = 0;
        long l2 = a1.a();
        obj = l.a().a(obj, g).e();
        long l1 = a(((byte []) (obj)));
        long l3 = b(((byte []) (obj)));
        boolean flag = false;
        for (; i1 < k; i1++)
        {
            flag |= a1.a((0x7fffffffffffffffL & l1) % l2);
            l1 += l3;
        }

        return flag;
    }

    public final boolean b(Object obj, g g, int k, d.a a1)
    {
        long l2 = a1.a();
        obj = l.a().a(obj, g).e();
        long l1 = a(((byte []) (obj)));
        long l3 = b(((byte []) (obj)));
        for (int i1 = 0; i1 < k; i1++)
        {
            if (!a1.b((0x7fffffffffffffffL & l1) % l2))
            {
                return false;
            }
            l1 += l3;
        }

        return true;
    }
}
