// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.Chronology;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology

abstract class BasicFixedMonthChronology extends BasicChronology
{

    static final long MILLIS_PER_MONTH = 0x9a7ec800L;
    static final long MILLIS_PER_YEAR = 0x758fac300L;
    static final int MONTH_LENGTH = 30;
    private static final long serialVersionUID = 0x3cdbe6c5deL;

    BasicFixedMonthChronology(Chronology chronology, Object obj, int i)
    {
        super(chronology, obj, i);
    }

    long getAverageMillisPerMonth()
    {
        return 0x9a7ec800L;
    }

    long getAverageMillisPerYear()
    {
        return 0x758fac300L;
    }

    long getAverageMillisPerYearDividedByTwo()
    {
        return 0x3ac7d6180L;
    }

    int getDayOfMonth(long l)
    {
        return (getDayOfYear(l) - 1) % 30 + 1;
    }

    int getDaysInMonthMax()
    {
        return 30;
    }

    int getDaysInMonthMax(int i)
    {
        return i == 13 ? 6 : 30;
    }

    int getDaysInYearMonth(int i, int j)
    {
        if (j != 13)
        {
            return 30;
        }
        return !isLeapYear(i) ? 5 : 6;
    }

    int getMaxMonth()
    {
        return 13;
    }

    int getMonthOfYear(long l)
    {
        return (getDayOfYear(l) - 1) / 30 + 1;
    }

    int getMonthOfYear(long l, int i)
    {
        return (int)((l - getYearMillis(i)) / 0x9a7ec800L) + 1;
    }

    long getTotalMillisByYearMonth(int i, int j)
    {
        return (long)(j - 1) * 0x9a7ec800L;
    }

    long getYearDifference(long l, long l1)
    {
        int i = getYear(l);
        int j = getYear(l1);
        long l2 = getYearMillis(i);
        long l3 = getYearMillis(j);
        j = i - j;
        i = j;
        if (l - l2 < l1 - l3)
        {
            i = j - 1;
        }
        return (long)i;
    }

    boolean isLeapYear(int i)
    {
        return (i & 3) == 3;
    }

    long setYear(long l, int i)
    {
        int k = getDayOfYear(l, getYear(l));
        int i1 = getMillisOfDay(l);
        int j = k;
        if (k > 365)
        {
            j = k;
            if (!isLeapYear(i))
            {
                j = k - 1;
            }
        }
        l = getYearMonthDayMillis(i, 1, j);
        return (long)i1 + l;
    }
}
