// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.stream;


final class StringPool
{

    private final String pool[] = new String[512];

    StringPool()
    {
    }

    public String get(char ac[], int i, int j)
    {
        int j1 = 0;
        for (int k = i; k < i + j; k++)
        {
            j1 = j1 * 31 + ac[k];
        }

        int l = j1 ^ (j1 >>> 20 ^ j1 >>> 12);
        j1 = (l ^ (l >>> 7 ^ l >>> 4)) & pool.length - 1;
        String s = pool[j1];
        if (s == null || s.length() != j)
        {
            ac = new String(ac, i, j);
            pool[j1] = ac;
            return ac;
        }
        for (int i1 = 0; i1 < j; i1++)
        {
            if (s.charAt(i1) != ac[i + i1])
            {
                ac = new String(ac, i, j);
                pool[j1] = ac;
                return ac;
            }
        }

        return s;
    }
}
