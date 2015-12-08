// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology

abstract class BasicGJChronology extends BasicChronology
{

    private static final long FEB_29 = 0x12fd73400L;
    private static final int MAX_DAYS_PER_MONTH_ARRAY[] = {
        31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 
        30, 31
    };
    private static final long MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[];
    private static final int MIN_DAYS_PER_MONTH_ARRAY[] = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 
        30, 31
    };
    private static final long MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[];
    private static final long serialVersionUID = 0x7d53cd7eccL;

    BasicGJChronology(Chronology chronology, Object obj, int i)
    {
        super(chronology, obj, i);
    }

    int getDaysInMonthMax(int i)
    {
        return MAX_DAYS_PER_MONTH_ARRAY[i - 1];
    }

    int getDaysInMonthMaxForSet(long l, int i)
    {
        int j = 28;
        if (i > 28 || i < 1)
        {
            j = getDaysInMonthMax(l);
        }
        return j;
    }

    int getDaysInYearMonth(int i, int j)
    {
        if (isLeapYear(i))
        {
            return MAX_DAYS_PER_MONTH_ARRAY[j - 1];
        } else
        {
            return MIN_DAYS_PER_MONTH_ARRAY[j - 1];
        }
    }

    int getMonthOfYear(long l, int i)
    {
        int j = (int)(l - getYearMillis(i) >> 10);
        if (!isLeapYear(i)) goto _L2; else goto _L1
_L1:
        if (j >= 0xea515a) goto _L4; else goto _L3
_L3:
        if (j >= 0x7528ad) goto _L6; else goto _L5
_L5:
        if (j >= 0x27e949) goto _L8; else goto _L7
_L7:
        return 1;
_L8:
        return j >= 0x4d3f64 ? 3 : 2;
_L6:
        if (j < 0x9bc85f)
        {
            return 4;
        }
        return j >= 0xc3b1a8 ? 6 : 5;
_L4:
        if (j < 0x160c39e)
        {
            if (j < 0x1123aa3)
            {
                return 7;
            }
            return j >= 0x13a23ec ? 9 : 8;
        }
        if (j < 0x188ace7)
        {
            return 10;
        }
        return j >= 0x1af4c99 ? 12 : 11;
_L2:
        if (j < 0xe907c3)
        {
            if (j < 0x73df16)
            {
                if (j >= 0x27e949)
                {
                    return j >= 0x4bf5cd ? 3 : 2;
                }
            } else
            {
                if (j < 0x9a7ec8)
                {
                    return 4;
                }
                return j >= 0xc26811 ? 6 : 5;
            }
        } else
        {
            if (j < 0x15f7a07)
            {
                if (j < 0x110f10c)
                {
                    return 7;
                }
                return j >= 0x138da55 ? 9 : 8;
            }
            if (j < 0x1876350)
            {
                return 10;
            }
            return j >= 0x1ae0302 ? 12 : 11;
        }
        if (true) goto _L7; else goto _L9
_L9:
    }

    long getTotalMillisByYearMonth(int i, int j)
    {
        if (isLeapYear(i))
        {
            return MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[j - 1];
        } else
        {
            return MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[j - 1];
        }
    }

    long getYearDifference(long l, long l1)
    {
        int i;
        int j;
        long l2;
        i = getYear(l);
        j = getYear(l1);
        l2 = l - getYearMillis(i);
        l = l1 - getYearMillis(j);
        if (l < 0x12fd73400L) goto _L2; else goto _L1
_L1:
        if (!isLeapYear(j)) goto _L4; else goto _L3
_L3:
        if (isLeapYear(i)) goto _L2; else goto _L5
_L5:
        l1 = l2;
        l -= 0x5265c00L;
_L7:
        j = i - j;
        i = j;
        if (l1 < l)
        {
            i = j - 1;
        }
        return (long)i;
_L4:
        if (l2 >= 0x12fd73400L && isLeapYear(i))
        {
            l1 = l2 - 0x5265c00L;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        l1 = l2;
        if (true) goto _L7; else goto _L6
_L6:
    }

    boolean isLeapDay(long l)
    {
        return dayOfMonth().get(l) == 29 && monthOfYear().isLeap(l);
    }

    long setYear(long l, int i)
    {
        int j;
        int k;
        int i1;
        int j1;
        j1 = getYear(l);
        k = getDayOfYear(l, j1);
        i1 = getMillisOfDay(l);
        j = k;
        if (k <= 59) goto _L2; else goto _L1
_L1:
        if (!isLeapYear(j1)) goto _L4; else goto _L3
_L3:
        j = k;
        if (!isLeapYear(i))
        {
            j = k - 1;
        }
_L2:
        return getYearMonthDayMillis(i, 1, j) + (long)i1;
_L4:
        j = k;
        if (isLeapYear(i))
        {
            j = k + 1;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static 
    {
        long l = 0L;
        MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
        MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
        int i = 0;
        long l1 = 0L;
        for (; i < 11; i++)
        {
            l1 += (long)MIN_DAYS_PER_MONTH_ARRAY[i] * 0x5265c00L;
            MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i + 1] = l1;
            l += (long)MAX_DAYS_PER_MONTH_ARRAY[i] * 0x5265c00L;
            MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i + 1] = l;
        }

    }
}
