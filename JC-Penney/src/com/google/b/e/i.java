// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.h;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            y, x, h

public final class i extends y
{

    public i()
    {
    }

    public b a(String s, a a1, int j, int k, Map map)
    {
        if (a1 != a.h)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode EAN_13, but got ").append(a1).toString());
        } else
        {
            return super.a(s, a1, j, k, map);
        }
    }

    public boolean[] a(String s)
    {
        if (s.length() != 13)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested contents should be 13 digits long, but got ").append(s.length()).toString());
        }
        try
        {
            if (!com.google.b.e.x.a(s))
            {
                throw new IllegalArgumentException("Contents do not pass checksum");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Illegal contents");
        }
        int j = Integer.parseInt(s.substring(0, 1));
        int l1 = com.google.b.e.h.a[j];
        boolean aflag[] = new boolean[95];
        int l = a(aflag, 0, com.google.b.e.x.b, true);
        j = 1;
        l += 0;
        for (; j <= 6; j++)
        {
            int k1 = Integer.parseInt(s.substring(j, j + 1));
            int i1 = k1;
            if ((l1 >> 6 - j & 1) == 1)
            {
                i1 = k1 + 10;
            }
            l += a(aflag, l, x.e[i1], false);
        }

        l += a(aflag, l, x.c, false);
        for (int k = 7; k <= 12; k++)
        {
            int j1 = Integer.parseInt(s.substring(k, k + 1));
            l += a(aflag, l, x.d[j1], true);
        }

        a(aflag, l, com.google.b.e.x.b, true);
        return aflag;
    }
}
