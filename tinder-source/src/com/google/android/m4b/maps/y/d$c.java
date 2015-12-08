// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.y:
//            d, j

static final class b extends d
{

    private final char a[];
    private final char b[];

    public final boolean a(char c1)
    {
        int i = Arrays.binarySearch(a, c1);
        if (i < 0)
        {
            if ((i = ~i - 1) < 0 || c1 > b[i])
            {
                return false;
            }
        }
        return true;
    }

    public final volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    (String s, char ac[], char ac1[])
    {
        super(s);
        a = ac;
        b = ac1;
        int i;
        boolean flag;
        if (ac.length == ac1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
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
            j.a(flag);
            if (i + 1 < ac.length)
            {
                if (ac1[i] < ac[i + 1])
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j.a(flag);
            }
            i++;
        }
    }
}
