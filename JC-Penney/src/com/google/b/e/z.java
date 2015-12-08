// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.m;

// Referenced classes of package com.google.b.e:
//            x

public final class z extends x
{

    private static final int a[] = {
        1, 1, 1, 1, 1, 1
    };
    private static final int f[][] = {
        {
            56, 52, 50, 49, 44, 38, 35, 42, 41, 37
        }, {
            7, 11, 13, 14, 19, 25, 28, 21, 22, 26
        }
    };
    private final int g[] = new int[4];

    public z()
    {
    }

    private static void a(StringBuilder stringbuilder, int i)
    {
        for (int j = 0; j <= 1; j++)
        {
            for (int k = 0; k < 10; k++)
            {
                if (i == f[j][k])
                {
                    stringbuilder.insert(0, (char)(j + 48));
                    stringbuilder.append((char)(k + 48));
                    return;
                }
            }

        }

        throw m.a();
    }

    public static String b(String s)
    {
        char c;
        char ac[];
        StringBuilder stringbuilder;
        ac = new char[6];
        s.getChars(1, 7, ac, 0);
        stringbuilder = new StringBuilder(12);
        stringbuilder.append(s.charAt(0));
        c = ac[5];
        c;
        JVM INSTR tableswitch 48 52: default 72
    //                   48 109
    //                   49 109
    //                   50 109
    //                   51 141
    //                   52 167;
           goto _L1 _L2 _L2 _L2 _L3 _L4
_L1:
        stringbuilder.append(ac, 0, 5);
        stringbuilder.append("0000");
        stringbuilder.append(c);
_L6:
        stringbuilder.append(s.charAt(7));
        return stringbuilder.toString();
_L2:
        stringbuilder.append(ac, 0, 2);
        stringbuilder.append(c);
        stringbuilder.append("0000");
        stringbuilder.append(ac, 2, 3);
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append(ac, 0, 3);
        stringbuilder.append("00000");
        stringbuilder.append(ac, 3, 2);
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(ac, 0, 4);
        stringbuilder.append("00000");
        stringbuilder.append(ac[4]);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected int a(a a1, int ai[], StringBuilder stringbuilder)
    {
        int ai1[] = g;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int j1 = a1.a();
        int i = ai[1];
        int j = 0;
        int k;
        int i1;
        for (k = 0; j < 6 && i < j1; k = i1)
        {
            int k1 = a(a1, ai1, i, e);
            stringbuilder.append((char)(k1 % 10 + 48));
            int l1 = ai1.length;
            for (int l = 0; l < l1; l++)
            {
                i += ai1[l];
            }

            i1 = k;
            if (k1 >= 10)
            {
                i1 = k | 1 << 5 - j;
            }
            j++;
        }

        a(stringbuilder, k);
        return i;
    }

    protected boolean a(String s)
    {
        return super.a(b(s));
    }

    protected int[] a(a a1, int i)
    {
        return a(a1, i, true, a);
    }

    com.google.b.a b()
    {
        return com.google.b.a.p;
    }

}
