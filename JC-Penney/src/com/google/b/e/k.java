// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.b.b;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            y, x

public final class k extends y
{

    public k()
    {
    }

    public b a(String s, a a1, int i, int j, Map map)
    {
        if (a1 != a.g)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode EAN_8, but got ").append(a1).toString());
        } else
        {
            return super.a(s, a1, i, j, map);
        }
    }

    public boolean[] a(String s)
    {
        if (s.length() != 8)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested contents should be 8 digits long, but got ").append(s.length()).toString());
        }
        boolean aflag[] = new boolean[67];
        int l = a(aflag, 0, com.google.b.e.x.b, true) + 0;
        for (int i = 0; i <= 3; i++)
        {
            int i1 = Integer.parseInt(s.substring(i, i + 1));
            l += a(aflag, l, x.d[i1], false);
        }

        l += a(aflag, l, x.c, false);
        for (int j = 4; j <= 7; j++)
        {
            int j1 = Integer.parseInt(s.substring(j, j + 1));
            l += a(aflag, l, x.d[j1], true);
        }

        a(aflag, l, com.google.b.e.x.b, true);
        return aflag;
    }
}
