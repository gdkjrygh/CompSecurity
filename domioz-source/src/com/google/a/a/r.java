// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.util.Arrays;

// Referenced classes of package com.google.a.a:
//            e, ad

final class r extends e
{

    private final char q[];
    private final char r[];

    r(String s, char ac[], char ac1[])
    {
        super(s);
        q = ac;
        r = ac1;
        int i;
        boolean flag;
        if (ac.length == ac1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad.a(flag);
        i = 0;
        while (i < ac.length) 
        {
            if (ac[i] <= ac1[i])
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ad.a(flag);
            if (i + 1 < ac.length)
            {
                if (ac1[i] < ac[i + 1])
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ad.a(flag);
            }
            i++;
        }
    }

    public final boolean a(char c)
    {
        int i = Arrays.binarySearch(q, c);
        if (i < 0)
        {
            if ((i = ~i - 1) < 0 || c > r[i])
            {
                return false;
            }
        }
        return true;
    }

    public final boolean apply(Object obj)
    {
        return super.a((Character)obj);
    }
}
