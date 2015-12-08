// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f;

import com.google.b.b.b;
import com.google.b.f.c.a;
import com.google.b.f.c.c;
import com.google.b.f.c.e;
import com.google.b.g;
import com.google.b.u;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

public final class d
    implements u
{

    public d()
    {
    }

    private static b a(e e1, String s, int i, int j, int k)
    {
        e1.a(s, 2);
        s = e1.a().a(2, 8);
        boolean flag;
        boolean flag1;
        if (j > i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s[0].length < s.length)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag ^ flag1)
        {
            s = a(((byte [][]) (s)));
            flag = true;
        } else
        {
            flag = false;
        }
        i /= s[0].length;
        j /= s.length;
        if (i >= j)
        {
            i = j;
        }
        if (i > 1)
        {
            e1 = e1.a().a(i * 2, i * 4 * 2);
            if (flag)
            {
                e1 = a(((byte [][]) (e1)));
            }
            return a(((byte [][]) (e1)), k);
        } else
        {
            return a(((byte [][]) (s)), k);
        }
    }

    private static b a(byte abyte0[][], int i)
    {
        b b1 = new b(abyte0[0].length + i * 2, abyte0.length + i * 2);
        b1.a();
        int j = b1.g() - i - 1;
        for (int k = 0; k < abyte0.length;)
        {
            for (int l = 0; l < abyte0[0].length; l++)
            {
                if (abyte0[k][l] == 1)
                {
                    b1.b(l + i, j);
                }
            }

            k++;
            j--;
        }

        return b1;
    }

    private static byte[][] a(byte abyte0[][])
    {
        int i = abyte0[0].length;
        int k = abyte0.length;
        byte abyte1[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            i, k
        });
        for (int j = 0; j < abyte0.length; j++)
        {
            int i1 = abyte0.length;
            for (int l = 0; l < abyte0[0].length; l++)
            {
                abyte1[l][i1 - j - 1] = abyte0[j][l];
            }

        }

        return abyte1;
    }

    public b a(String s, com.google.b.a a1, int i, int j, Map map)
    {
        if (a1 != com.google.b.a.k)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode PDF_417, but got ").append(a1).toString());
        }
        a1 = new e();
        int k = 30;
        int l = k;
        if (map != null)
        {
            if (map.containsKey(g.g))
            {
                a1.a(((Boolean)map.get(g.g)).booleanValue());
            }
            if (map.containsKey(g.h))
            {
                a1.a((c)map.get(g.h));
            }
            if (map.containsKey(g.i))
            {
                com.google.b.f.c.d d1 = (com.google.b.f.c.d)map.get(g.i);
                a1.a(d1.b(), d1.a(), d1.d(), d1.c());
            }
            if (map.containsKey(g.f))
            {
                k = ((Number)map.get(g.f)).intValue();
            }
            l = k;
            if (map.containsKey(g.b))
            {
                a1.a(Charset.forName((String)map.get(g.b)));
                l = k;
            }
        }
        return a(((e) (a1)), s, i, j, l);
    }
}
