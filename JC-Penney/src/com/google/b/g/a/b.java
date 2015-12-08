// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;


// Referenced classes of package com.google.b.g.a:
//            s, u, t, o

final class b
{

    private final int a;
    private final byte b[];

    private b(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    static b[] a(byte abyte0[], s s1, o o)
    {
        b ab[];
        int i;
        int k;
        int l;
        if (abyte0.length != s1.c())
        {
            throw new IllegalArgumentException();
        }
        s1 = s1.a(o);
        o = s1.d();
        l = o.length;
        i = 0;
        k = 0;
        for (; i < l; i++)
        {
            k += o[i].a();
        }

        ab = new b[k];
        int j1 = o.length;
        l = 0;
        for (k = 0; l < j1; k = i)
        {
            t t1 = o[l];
            i = k;
            for (k = 0; k < t1.a();)
            {
                int j2 = t1.b();
                ab[i] = new b(j2, new byte[s1.a() + j2]);
                k++;
                i++;
            }

            l++;
        }

        l = ab[0].b.length;
        i = ab.length - 1;
_L6:
        if (i >= 0 && ab[i].b.length != l) goto _L2; else goto _L1
_L1:
        int k2;
        int i3;
        i3 = i + 1;
        k2 = l - s1.a();
        l = 0;
        i = 0;
_L4:
        if (l >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        for (int k1 = 0; k1 < k;)
        {
            ab[k1].b[l] = abyte0[i];
            k1++;
            i++;
        }

        l++;
        continue; /* Loop/switch isn't completed */
_L2:
        i--;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        int l1 = i3;
        int i1;
        for (i1 = i; l1 < k; i1++)
        {
            ab[l1].b[k2] = abyte0[i1];
            l1++;
        }

        int j3 = ab[0].b.length;
        for (int j = k2; j < j3; j++)
        {
            int i2 = 0;
            while (i2 < k) 
            {
                int l2;
                if (i2 < i3)
                {
                    l2 = j;
                } else
                {
                    l2 = j + 1;
                }
                ab[i2].b[l2] = abyte0[i1];
                i2++;
                i1++;
            }
        }

        return ab;
        if (true) goto _L6; else goto _L5
_L5:
    }

    int a()
    {
        return a;
    }

    byte[] b()
    {
        return b;
    }
}
