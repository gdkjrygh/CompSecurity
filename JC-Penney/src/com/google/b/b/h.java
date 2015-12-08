// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.b;
import com.google.b.i;
import com.google.b.m;

// Referenced classes of package com.google.b.b:
//            a, b

public class h extends b
{

    private static final byte a[] = new byte[0];
    private byte b[];
    private final int c[] = new int[32];

    public h(i j)
    {
        super(j);
        b = a;
    }

    private static int a(int ai[])
    {
        boolean flag = false;
        int l2 = ai.length;
        int j = 0;
        int j1 = 0;
        int k = 0;
        int k1;
        int l1;
        for (k1 = 0; j < l2; k1 = l1)
        {
            int l = j1;
            if (ai[j] > j1)
            {
                l = ai[j];
                k = j;
            }
            l1 = k1;
            if (ai[j] > k1)
            {
                l1 = ai[j];
            }
            j++;
            j1 = l;
        }

        j1 = 0;
        j = 0;
        int i1 = ((flag) ? 1 : 0);
        while (i1 < l2) 
        {
            int i2 = i1 - k;
            i2 *= ai[i1] * i2;
            int k2;
            if (i2 > j1)
            {
                j1 = i1;
                j = i2;
            } else
            {
                int j2 = j;
                j = j1;
                j1 = j2;
            }
            i1++;
            i2 = j1;
            j1 = j;
            j = i2;
        }
        if (k > j)
        {
            i2 = j;
            j1 = k;
        } else
        {
            j1 = j;
            i2 = k;
        }
        if (j1 - i2 <= l2 / 16)
        {
            throw m.a();
        }
        k = j1 - 1;
        i1 = -1;
        j = j1 - 1;
        while (j > i2) 
        {
            k2 = j - i2;
            k2 = k2 * k2 * (j1 - j) * (k1 - ai[j]);
            if (k2 > i1)
            {
                i1 = j;
                k = k2;
            } else
            {
                k2 = k;
                k = i1;
                i1 = k2;
            }
            j--;
            k2 = i1;
            i1 = k;
            k = k2;
        }
        return k << 3;
    }

    private void a(int j)
    {
        if (b.length < j)
        {
            b = new byte[j];
        }
        for (j = 0; j < 32; j++)
        {
            c[j] = 0;
        }

    }

    public a a(int j, a a1)
    {
        int l = 1;
        i k = a();
        int l1 = k.b();
        byte abyte0[];
        int ai[];
        if (a1 == null || a1.a() < l1)
        {
            a1 = new a(l1);
        } else
        {
            a1.c();
        }
        a(l1);
        abyte0 = k.a(j, b);
        ai = c;
        for (j = 0; j < l1; j++)
        {
            int i1 = (abyte0[j] & 0xff) >> 3;
            ai[i1] = ai[i1] + 1;
        }

        int i2 = a(ai);
        int j1 = abyte0[0];
        j = abyte0[1] & 0xff;
        j1 &= 0xff;
        while (l < l1 - 1) 
        {
            int k1 = abyte0[l + 1] & 0xff;
            if ((j * 4 - j1 - k1) / 2 < i2)
            {
                a1.b(l);
            }
            l++;
            j1 = j;
            j = k1;
        }
        return a1;
    }

    public b a(i j)
    {
        return new h(j);
    }

    public com.google.b.b.b b()
    {
        i j = a();
        int k1 = j.b();
        int l1 = j.c();
        com.google.b.b.b b1 = new com.google.b.b.b(k1, l1);
        a(k1);
        int ai[] = c;
        for (int k = 1; k < 5; k++)
        {
            byte abyte1[] = j.a((l1 * k) / 5, b);
            int i2 = (k1 * 4) / 5;
            for (int i1 = k1 / 5; i1 < i2; i1++)
            {
                int k2 = (abyte1[i1] & 0xff) >> 3;
                ai[k2] = ai[k2] + 1;
            }

        }

        int j2 = a(ai);
        byte abyte0[] = j.a();
        for (int l = 0; l < l1; l++)
        {
            for (int j1 = 0; j1 < k1; j1++)
            {
                if ((abyte0[l * k1 + j1] & 0xff) < j2)
                {
                    b1.b(j1, l);
                }
            }

        }

        return b1;
    }

}
