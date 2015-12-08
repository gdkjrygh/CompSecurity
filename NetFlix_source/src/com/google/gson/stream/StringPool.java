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
        String s1;
        int i1;
        boolean flag;
        flag = false;
        int k = i;
        i1 = 0;
        for (; k < i + j; k++)
        {
            i1 = i1 * 31 + ac[k];
        }

        k = i1 >>> 20 ^ i1 >>> 12 ^ i1;
        i1 = pool.length - 1 & (k ^ (k >>> 7 ^ k >>> 4));
        s1 = pool[i1];
        if (s1 == null) goto _L2; else goto _L1
_L1:
        int l = ((flag) ? 1 : 0);
        if (s1.length() == j) goto _L3; else goto _L2
_L2:
        String s;
        s = new String(ac, i, j);
        pool[i1] = s;
_L7:
        return s;
_L5:
        l++;
_L3:
        s = s1;
        if (l >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s1.charAt(l) != ac[i + l])
        {
            ac = new String(ac, i, j);
            pool[i1] = ac;
            return ac;
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
    }
}
