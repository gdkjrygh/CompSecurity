// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;


public class LevenshteinDistance
{

    public LevenshteinDistance()
    {
    }

    public static int computeDistance(String s, String s1)
    {
        int ai[];
        int i;
        s = s.toLowerCase().replace(" ", "");
        s1 = s1.toLowerCase().replace(" ", "");
        ai = new int[s1.length() + 1];
        i = 0;
_L2:
        if (i > s.length())
        {
            return ai[s1.length()];
        }
        int k = i;
        int j = 0;
        do
        {
label0:
            {
                if (j <= s1.length())
                {
                    break label0;
                }
                if (i > 0)
                {
                    ai[s1.length()] = k;
                }
                i++;
            }
            if (true)
            {
                continue;
            }
            int l;
            if (i == 0)
            {
                ai[j] = j;
                l = k;
            } else
            {
                l = k;
                if (j > 0)
                {
                    int i1 = ai[j - 1];
                    if (s.charAt(i - 1) != s1.charAt(j - 1))
                    {
                        l = -3;
                    } else
                    {
                        l = 1;
                    }
                    i1 = Math.min(Math.min(i1, k), ai[j]);
                    ai[j - 1] = k;
                    l = i1 + l;
                }
            }
            j++;
            k = l;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
