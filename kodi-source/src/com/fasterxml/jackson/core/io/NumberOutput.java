// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;


public final class NumberOutput
{

    private static int BILLION = 0x3b9aca00;
    static final char FULL_3[];
    static final byte FULL_TRIPLETS_B[];
    static final char LEAD_3[];
    private static long MAX_INT_AS_LONG = 0x7fffffffL;
    private static int MILLION = 0xf4240;
    private static long MIN_INT_AS_LONG = 0xffffffff80000000L;
    static final String SMALLEST_LONG = String.valueOf(0x8000000000000000L);
    private static long TEN_BILLION_L = 0x2540be400L;
    private static long THOUSAND_L = 1000L;
    static final String sSmallIntStrs[] = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
        "10"
    };
    static final String sSmallIntStrs2[] = {
        "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"
    };

    public static String toString(double d)
    {
        return Double.toString(d);
    }

    public static String toString(int i)
    {
        if (i < sSmallIntStrs.length)
        {
            if (i >= 0)
            {
                return sSmallIntStrs[i];
            }
            int j = -i - 1;
            if (j < sSmallIntStrs2.length)
            {
                return sSmallIntStrs2[j];
            }
        }
        return Integer.toString(i);
    }

    public static String toString(long l)
    {
        if (l <= 0x7fffffffL && l >= 0xffffffff80000000L)
        {
            return toString((int)l);
        } else
        {
            return Long.toString(l);
        }
    }

    static 
    {
        LEAD_3 = new char[4000];
        FULL_3 = new char[4000];
        int l = 0;
        for (int i = 0; i < 10; i++)
        {
            char c2 = (char)(i + 48);
            char c;
            char c1;
            char c3;
            int k;
            if (i == 0)
            {
                c = '\0';
            } else
            {
                c = c2;
            }
            for (k = 0; k < 10; k++)
            {
                c3 = (char)(k + 48);
                int i1;
                if (i == 0 && k == 0)
                {
                    c1 = '\0';
                } else
                {
                    c1 = c3;
                }
                for (i1 = 0; i1 < 10; i1++)
                {
                    char c4 = (char)(i1 + 48);
                    LEAD_3[l] = c;
                    LEAD_3[l + 1] = c1;
                    LEAD_3[l + 2] = c4;
                    FULL_3[l] = c2;
                    FULL_3[l + 1] = c3;
                    FULL_3[l + 2] = c4;
                    l += 4;
                }

            }

        }

        FULL_TRIPLETS_B = new byte[4000];
        for (int j = 0; j < 4000; j++)
        {
            FULL_TRIPLETS_B[j] = (byte)FULL_3[j];
        }

    }
}
