// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.b.b;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            r, e

public final class f extends r
{

    public f()
    {
    }

    private static void a(int i, int ai[])
    {
        int j = 0;
        while (j < 9) 
        {
            int k;
            if ((1 << 8 - j & i) == 0)
            {
                k = 1;
            } else
            {
                k = 2;
            }
            ai[j] = k;
            j++;
        }
    }

    public b a(String s, a a1, int i, int j, Map map)
    {
        if (a1 != a.c)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode CODE_39, but got ").append(a1).toString());
        } else
        {
            return super.a(s, a1, i, j, map);
        }
    }

    public boolean[] a(String s)
    {
        int l1 = s.length();
        if (l1 > 80)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested contents should be less than 80 digits long, but got ").append(l1).toString());
        }
        int ai[] = new int[9];
        int i = l1 + 25;
        for (int k = 0; k < l1; k++)
        {
            int i1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(s.charAt(k));
            if (i1 < 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Bad contents: ").append(s).toString());
            }
            a(com.google.b.e.e.a[i1], ai);
            int i2 = ai.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                i += ai[j1];
            }

        }

        boolean aflag[] = new boolean[i];
        a(com.google.b.e.e.a[39], ai);
        i = a(aflag, 0, ai, true);
        int ai1[] = new int[1];
        ai1[0] = 1;
        int l = i + a(aflag, i, ai1, false);
        for (int j = 0; j < l1; j++)
        {
            int k1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(s.charAt(j));
            a(com.google.b.e.e.a[k1], ai);
            l += a(aflag, l, ai, true);
            l += a(aflag, l, ai1, false);
        }

        a(com.google.b.e.e.a[39], ai);
        a(aflag, l, ai, true);
        return aflag;
    }
}
