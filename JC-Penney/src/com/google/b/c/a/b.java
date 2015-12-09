// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.a;


// Referenced classes of package com.google.b.c.a:
//            g, j, i

final class b
{

    private final int a;
    private final byte b[];

    private b(int k, byte abyte0[])
    {
        a = k;
        b = abyte0;
    }

    static b[] a(byte abyte0[], g g1)
    {
        j j1 = g1.g();
        i ai[] = j1.b();
        int l1 = ai.length;
        int l = 0;
        int i1 = 0;
        for (; l < l1; l++)
        {
            i1 += ai[l].a();
        }

        b ab[] = new b[i1];
        int i2 = ai.length;
        i1 = 0;
        l = 0;
        for (; i1 < i2; i1++)
        {
            i k = ai[i1];
            for (l1 = 0; l1 < k.a();)
            {
                int k2 = k.b();
                ab[l] = new b(k2, new byte[j1.a() + k2]);
                l1++;
                l++;
            }

        }

        int l2 = ab[0].b.length - j1.a();
        l1 = 0;
        i1 = 0;
        for (; l1 < l2 - 1; l1++)
        {
            for (i2 = 0; i2 < l;)
            {
                ab[i2].b[l1] = abyte0[i1];
                i2++;
                i1++;
            }

        }

        boolean flag;
        if (g1.a() == 24)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l1 = 8;
        } else
        {
            l1 = l;
        }
        for (i2 = 0; i2 < l1;)
        {
            ab[i2].b[l2 - 1] = abyte0[i1];
            i2++;
            i1++;
        }

        int k3 = ab[0].b.length;
        l1 = i1;
        for (int k1 = l2; k1 < k3; k1++)
        {
            int j2 = 0;
            while (j2 < l) 
            {
                int i3;
                int j3;
                if (flag)
                {
                    i3 = (j2 + 8) % l;
                } else
                {
                    i3 = j2;
                }
                if (flag && i3 > 7)
                {
                    j3 = k1 - 1;
                } else
                {
                    j3 = k1;
                }
                ab[i3].b[j3] = abyte0[l1];
                j2++;
                l1++;
            }
        }

        if (l1 != abyte0.length)
        {
            throw new IllegalArgumentException();
        } else
        {
            return ab;
        }
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
