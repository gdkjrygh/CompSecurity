// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.m;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            x

final class v
{

    private static final int a[] = {
        24, 20, 18, 17, 12, 6, 3, 10, 9, 5
    };
    private final int b[] = new int[4];
    private final StringBuilder c = new StringBuilder();

    v()
    {
    }

    private static int a(int i)
    {
        for (int j = 0; j < 10; j++)
        {
            if (i == a[j])
            {
                return j;
            }
        }

        throw m.a();
    }

    private static int a(CharSequence charsequence)
    {
        int l = charsequence.length();
        int k = 0;
        for (int i = l - 2; i >= 0; i -= 2)
        {
            k += charsequence.charAt(i) - 48;
        }

        k *= 3;
        for (int j = l - 1; j >= 0; j -= 2)
        {
            k += charsequence.charAt(j) - 48;
        }

        return (k * 3) % 10;
    }

    private static Map a(String s1)
    {
        if (s1.length() == 5)
        {
            if ((s1 = b(s1)) != null)
            {
                EnumMap enummap = new EnumMap(com/google/b/r);
                enummap.put(r.f, s1);
                return enummap;
            }
        }
        return null;
    }

    private static String b(String s1)
    {
        s1.charAt(0);
        JVM INSTR lookupswitch 3: default 40
    //                   48: 119
    //                   53: 125
    //                   57: 131;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_131;
_L1:
        String s2 = "";
_L5:
        int j = Integer.parseInt(s1.substring(1));
        int i = j / 100;
        j %= 100;
        if (j < 10)
        {
            s1 = (new StringBuilder()).append("0").append(j).toString();
        } else
        {
            s1 = String.valueOf(j);
        }
        return (new StringBuilder()).append(s2).append(String.valueOf(i)).append('.').append(s1).toString();
_L2:
        s2 = "\243";
          goto _L5
_L3:
        s2 = "$";
          goto _L5
        if ("90000".equals(s1))
        {
            return null;
        }
        if ("99991".equals(s1))
        {
            return "0.00";
        }
        if ("99990".equals(s1))
        {
            return "Used";
        }
        s2 = "";
          goto _L5
    }

    int a(a a1, int ai[], StringBuilder stringbuilder)
    {
        int ai1[] = b;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int j1 = a1.a();
        int i = ai[1];
        int k = 0;
        int j;
        int i1;
        for (j = 0; k < 5 && i < j1; j = i1)
        {
            int k1 = com.google.b.e.x.a(a1, ai1, i, x.e);
            stringbuilder.append((char)(k1 % 10 + 48));
            int l1 = ai1.length;
            for (int l = 0; l < l1;)
            {
                int i2 = ai1[l];
                l++;
                i = i2 + i;
            }

            i1 = j;
            if (k1 >= 10)
            {
                i1 = j | 1 << 4 - k;
            }
            j = i;
            if (k != 4)
            {
                j = a1.d(a1.c(i));
            }
            k++;
            i = j;
        }

        if (stringbuilder.length() != 5)
        {
            throw m.a();
        }
        j = a(j);
        if (a(((CharSequence) (stringbuilder.toString()))) != j)
        {
            throw m.a();
        } else
        {
            return i;
        }
    }

    q a(int i, a a1, int ai[])
    {
        Object obj = c;
        ((StringBuilder) (obj)).setLength(0);
        int j = a(a1, ai, ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        a1 = a(((String) (obj)));
        ai = new s((float)(ai[0] + ai[1]) / 2.0F, i);
        s s1 = new s(j, i);
        com.google.b.a a2 = com.google.b.a.q;
        ai = new q(((String) (obj)), null, new s[] {
            ai, s1
        }, a2);
        if (a1 != null)
        {
            ai.a(a1);
        }
        return ai;
    }

}
