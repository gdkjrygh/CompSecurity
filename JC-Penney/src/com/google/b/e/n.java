// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.b.b;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            r, m

public final class n extends r
{

    private static final int a[] = {
        1, 1, 1, 1
    };
    private static final int b[] = {
        3, 1, 1
    };

    public n()
    {
    }

    public b a(String s, a a1, int i, int j, Map map)
    {
        if (a1 != a.i)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode ITF, but got ").append(a1).toString());
        } else
        {
            return super.a(s, a1, i, j, map);
        }
    }

    public boolean[] a(String s)
    {
        int l = s.length();
        if (l % 2 != 0)
        {
            throw new IllegalArgumentException("The lenght of the input should be even");
        }
        if (l > 80)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested contents should be less than 80 digits long, but got ").append(l).toString());
        }
        boolean aflag[] = new boolean[l * 9 + 9];
        int j = a(aflag, 0, a, true);
        for (int i = 0; i < l; i += 2)
        {
            int i1 = Character.digit(s.charAt(i), 10);
            int j1 = Character.digit(s.charAt(i + 1), 10);
            int ai[] = new int[18];
            for (int k = 0; k < 5; k++)
            {
                ai[k * 2] = com.google.b.e.m.a[i1][k];
                ai[k * 2 + 1] = com.google.b.e.m.a[j1][k];
            }

            j += a(aflag, j, ai, true);
        }

        a(aflag, j, b, true);
        return aflag;
    }

}
