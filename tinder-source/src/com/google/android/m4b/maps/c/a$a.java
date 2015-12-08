// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.c;

import com.google.android.m4b.maps.m.c;
import com.google.android.m4b.maps.y.d;
import com.google.android.m4b.maps.y.j;
import java.math.RoundingMode;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.c:
//            a

static final class k extends d
{

    final char a[];
    final int b;
    final int c;
    final int d;
    final int e;
    private final String i;
    private final byte j[];
    private final boolean k[];

    public final boolean a(char c1)
    {
        return d.f.a(c1) && j[c1] != -1;
    }

    public final String toString()
    {
        return i;
    }

    (String s, char ac[])
    {
        boolean flag = false;
        super();
        i = (String)com.google.android.m4b.maps.y.j.a(s);
        a = (char[])com.google.android.m4b.maps.y.j.a(ac);
        int l;
        try
        {
            c = com.google.android.m4b.maps.m.c.a(ac.length, RoundingMode.UNNECESSARY);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal alphabet length ")).append(ac.length).toString(), s);
        }
        l = Math.min(8, Integer.lowestOneBit(c));
        d = 8 / l;
        e = c / l;
        b = ac.length - 1;
        s = new byte[128];
        Arrays.fill(s, (byte)-1);
        l = 0;
        while (l < ac.length) 
        {
            char c1 = ac[l];
            com.google.android.m4b.maps.y.j.a(d.f.a(c1), "Non-ASCII character: %s", new Object[] {
                Character.valueOf(c1)
            });
            boolean flag1;
            if (s[c1] == -1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            com.google.android.m4b.maps.y.j.a(flag1, "Duplicate character: %s", new Object[] {
                Character.valueOf(c1)
            });
            s[c1] = (byte)l;
            l++;
        }
        j = s;
        s = new boolean[d];
        for (int i1 = ((flag) ? 1 : 0); i1 < e; i1++)
        {
            s[com.google.android.m4b.maps.m.c.a(i1 * 8, c, RoundingMode.CEILING)] = 1;
        }

        k = s;
    }
}
