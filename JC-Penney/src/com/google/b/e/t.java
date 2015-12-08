// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.a;
import com.google.b.b.b;
import com.google.b.u;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            i

public final class t
    implements u
{

    private final i a = new i();

    public t()
    {
    }

    private static String a(String s)
    {
        int j = s.length();
        String s1;
        if (j == 11)
        {
            j = 0;
            int k = 0;
            while (j < 11) 
            {
                char c = s.charAt(j);
                byte byte0;
                if (j % 2 == 0)
                {
                    byte0 = 3;
                } else
                {
                    byte0 = 1;
                }
                k += byte0 * (c - 48);
                j++;
            }
            s1 = (new StringBuilder()).append(s).append((1000 - k) % 10).toString();
        } else
        {
            s1 = s;
            if (j != 12)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Requested contents should be 11 or 12 digits long, but got ").append(s.length()).toString());
            }
        }
        return (new StringBuilder()).append('0').append(s1).toString();
    }

    public b a(String s, a a1, int j, int k, Map map)
    {
        if (a1 != a.o)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode UPC-A, but got ").append(a1).toString());
        } else
        {
            return a.a(a(s), a.h, j, k, map);
        }
    }
}
