// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.json;


public class c
{

    private final String a[] = new String[512];

    public c()
    {
    }

    private static boolean a(String s, char ac[], int i, int j)
    {
        if (s.length() == j) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k = 0;
label0:
        do
        {
label1:
            {
                if (k >= j)
                {
                    break label1;
                }
                if (ac[i + k] != s.charAt(k))
                {
                    break label0;
                }
                k++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public String a(char ac[], int i, int j)
    {
        int i1 = 0;
        for (int k = i; k < i + j; k++)
        {
            i1 = i1 * 31 + ac[k];
        }

        int l = i1 >>> 20 ^ i1 >>> 12 ^ i1;
        l = a.length - 1 & (l ^ (l >>> 7 ^ l >>> 4));
        String s = a[l];
        if (s != null && a(s, ac, i, j))
        {
            return s;
        } else
        {
            ac = new String(ac, i, j);
            a[l] = ac;
            return ac;
        }
    }
}
