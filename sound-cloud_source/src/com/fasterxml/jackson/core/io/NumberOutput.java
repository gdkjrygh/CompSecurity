// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;


public final class NumberOutput
{

    private static int BILLION = 0x3b9aca00;
    static final char FULL_TRIPLETS[];
    static final byte FULL_TRIPLETS_B[];
    static final char LEADING_TRIPLETS[];
    private static long MAX_INT_AS_LONG = 0x7fffffffL;
    private static int MILLION = 0xf4240;
    private static long MIN_INT_AS_LONG = 0xffffffff80000000L;
    static final String SMALLEST_LONG = "-9223372036854775808";
    private static long TEN_BILLION_L = 0x2540be400L;
    private static long THOUSAND_L = 1000L;
    static final String sSmallIntStrs[] = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
        "10"
    };
    static final String sSmallIntStrs2[] = {
        "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"
    };

    private static int calcLongStrLength(long l)
    {
        int i = 10;
        for (long l1 = TEN_BILLION_L; l >= l1 && i != 19; l1 = (l1 << 1) + (l1 << 3))
        {
            i++;
        }

        return i;
    }

    private static int outputFullTriplet(int i, char ac[], int j)
    {
        int l = i << 2;
        i = j + 1;
        char ac1[] = FULL_TRIPLETS;
        int k = l + 1;
        ac[j] = ac1[l];
        j = i + 1;
        ac[i] = FULL_TRIPLETS[k];
        ac[j] = FULL_TRIPLETS[k + 1];
        return j + 1;
    }

    public static int outputInt(int i, char ac[], int j)
    {
        int l = i;
        int k = j;
        if (i < 0)
        {
            if (i == 0x80000000)
            {
                return outputLong(i, ac, j);
            }
            ac[j] = '-';
            l = -i;
            k = j + 1;
        }
        if (l < MILLION)
        {
            if (l < 1000)
            {
                if (l < 10)
                {
                    ac[k] = (char)(l + 48);
                    return k + 1;
                } else
                {
                    return outputLeadingTriplet(l, ac, k);
                }
            } else
            {
                i = l / 1000;
                return outputFullTriplet(l - i * 1000, ac, outputLeadingTriplet(i, ac, k));
            }
        }
        boolean flag;
        if (l >= BILLION)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = l;
        j = k;
        if (flag)
        {
            i = l - BILLION;
            if (i >= BILLION)
            {
                i -= BILLION;
                ac[k] = '2';
                j = k + 1;
            } else
            {
                ac[k] = '1';
                j = k + 1;
            }
        }
        k = i / 1000;
        l = k / 1000;
        if (flag)
        {
            j = outputFullTriplet(l, ac, j);
        } else
        {
            j = outputLeadingTriplet(l, ac, j);
        }
        return outputFullTriplet(i - k * 1000, ac, outputFullTriplet(k - l * 1000, ac, j));
    }

    private static int outputLeadingTriplet(int i, char ac[], int j)
    {
        i <<= 2;
        char ac1[] = LEADING_TRIPLETS;
        int k = i + 1;
        char c = ac1[i];
        i = j;
        if (c != 0)
        {
            ac[j] = c;
            i = j + 1;
        }
        c = LEADING_TRIPLETS[k];
        j = i;
        if (c != 0)
        {
            ac[i] = c;
            j = i + 1;
        }
        ac[j] = LEADING_TRIPLETS[k + 1];
        return j + 1;
    }

    public static int outputLong(long l, char ac[], int i)
    {
        int k;
        int k1;
        long l1;
        if (l < 0L)
        {
            if (l > MIN_INT_AS_LONG)
            {
                return outputInt((int)l, ac, i);
            }
            if (l == 0x8000000000000000L)
            {
                int j = SMALLEST_LONG.length();
                SMALLEST_LONG.getChars(0, j, ac, i);
                return i + j;
            }
            ac[i] = '-';
            l1 = -l;
            k = i + 1;
        } else
        {
            l1 = l;
            k = i;
            if (l <= MAX_INT_AS_LONG)
            {
                return outputInt((int)l, ac, i);
            }
        }
        k1 = k + calcLongStrLength(l1);
        i = k1;
        for (; l1 > MAX_INT_AS_LONG; l1 = l)
        {
            i -= 3;
            l = l1 / THOUSAND_L;
            outputFullTriplet((int)(l1 - THOUSAND_L * l), ac, i);
        }

        int i1 = (int)l1;
        int j1 = i;
        for (i = i1; i >= 1000; i = i1)
        {
            j1 -= 3;
            i1 = i / 1000;
            outputFullTriplet(i - i1 * 1000, ac, j1);
        }

        outputLeadingTriplet(i, ac, k);
        return k1;
    }

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
        LEADING_TRIPLETS = new char[4000];
        FULL_TRIPLETS = new char[4000];
        int k = 0;
        int i = 0;
        for (; k < 10; k++)
        {
            char c2 = (char)(k + 48);
            char c;
            char c1;
            char c3;
            int l;
            if (k == 0)
            {
                c = '\0';
            } else
            {
                c = c2;
            }
            for (l = 0; l < 10; l++)
            {
                c3 = (char)(l + 48);
                int i1;
                if (k == 0 && l == 0)
                {
                    c1 = '\0';
                } else
                {
                    c1 = c3;
                }
                for (i1 = 0; i1 < 10; i1++)
                {
                    char c4 = (char)(i1 + 48);
                    LEADING_TRIPLETS[i] = c;
                    LEADING_TRIPLETS[i + 1] = c1;
                    LEADING_TRIPLETS[i + 2] = c4;
                    FULL_TRIPLETS[i] = c2;
                    FULL_TRIPLETS[i + 1] = c3;
                    FULL_TRIPLETS[i + 2] = c4;
                    i += 4;
                }

            }

        }

        FULL_TRIPLETS_B = new byte[4000];
        for (int j = 0; j < 4000; j++)
        {
            FULL_TRIPLETS_B[j] = (byte)FULL_TRIPLETS[j];
        }

    }
}
