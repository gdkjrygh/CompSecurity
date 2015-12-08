// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.d;


final class i
{

    private final String a[] = new String[512];

    i()
    {
    }

    public final String a(char ac[], int j, int k)
    {
        String s1;
        int j1;
        boolean flag;
        flag = false;
        int l = j;
        j1 = 0;
        for (; l < j + k; l++)
        {
            j1 = j1 * 31 + ac[l];
        }

        l = j1 >>> 20 ^ j1 >>> 12 ^ j1;
        j1 = a.length - 1 & (l ^ (l >>> 7 ^ l >>> 4));
        s1 = a[j1];
        if (s1 == null) goto _L2; else goto _L1
_L1:
        int i1 = ((flag) ? 1 : 0);
        if (s1.length() == k) goto _L3; else goto _L2
_L2:
        String s;
        s = new String(ac, j, k);
        a[j1] = s;
_L7:
        return s;
_L5:
        i1++;
_L3:
        s = s1;
        if (i1 >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s1.charAt(i1) != ac[j + i1])
        {
            ac = new String(ac, j, k);
            a[j1] = ac;
            return ac;
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L7; else goto _L6
_L6:
    }
}
