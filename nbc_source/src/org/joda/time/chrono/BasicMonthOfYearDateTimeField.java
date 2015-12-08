// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology

class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField
{

    private static final int MIN = 1;
    private static final long serialVersionUID = 0xffe2a8bdfb0bf820L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    BasicMonthOfYearDateTimeField(BasicChronology basicchronology, int i)
    {
        super(DateTimeFieldType.monthOfYear(), basicchronology.getAverageMillisPerMonth());
        iChronology = basicchronology;
        iMax = iChronology.getMaxMonth();
        iLeapMonth = i;
    }

    private Object readResolve()
    {
        return iChronology.monthOfYear();
    }

    public long add(long l, int i)
    {
        int j;
        int l1;
        int i2;
        long l2;
        if (i == 0)
        {
            return l;
        }
        l2 = iChronology.getMillisOfDay(l);
        l1 = iChronology.getYear(l);
        i2 = iChronology.getMonthOfYear(l, l1);
        j = (i2 - 1) + i;
        if (j < 0) goto _L2; else goto _L1
_L1:
        i = j / iMax + l1;
        j = j % iMax + 1;
_L4:
        int k = iChronology.getDayOfMonth(l, l1, i2);
        int j1 = iChronology.getDaysInYearMonth(i, j);
        if (k > j1)
        {
            k = j1;
        }
        return iChronology.getYearMonthDayMillis(i, j, k) + l2;
_L2:
        int i1 = (j / iMax + l1) - 1;
        j = Math.abs(j) % iMax;
        i = j;
        if (j == 0)
        {
            i = iMax;
        }
        int k1 = (iMax - i) + 1;
        j = k1;
        i = i1;
        if (k1 == 1)
        {
            i = i1 + 1;
            j = k1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public long add(long l, long l1)
    {
        int j2;
        int k2;
        long l3;
        long l6;
        int i = (int)l1;
        if ((long)i == l1)
        {
            return add(l, i);
        }
        l6 = iChronology.getMillisOfDay(l);
        j2 = iChronology.getYear(l);
        k2 = iChronology.getMonthOfYear(l, j2);
        l3 = (long)(k2 - 1) + l1;
        if (l3 < 0L) goto _L2; else goto _L1
_L1:
        long l2;
        l2 = (long)j2 + l3 / (long)iMax;
        l3 = l3 % (long)iMax + 1L;
_L4:
        if (l2 < (long)iChronology.getMinYear() || l2 > (long)iChronology.getMaxYear())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Magnitude of add amount is too large: ").append(l1).toString());
        }
        break; /* Loop/switch isn't completed */
_L2:
        long l4 = ((long)j2 + l3 / (long)iMax) - 1L;
        int i1 = (int)(Math.abs(l3) % (long)iMax);
        int j = i1;
        if (i1 == 0)
        {
            j = iMax;
        }
        long l5 = (iMax - j) + 1;
        l3 = l5;
        l2 = l4;
        if (l5 == 1L)
        {
            l2 = l4 + 1L;
            l3 = l5;
        }
        if (true) goto _L4; else goto _L3
_L3:
        int k1 = (int)l2;
        int i2 = (int)l3;
        int k = iChronology.getDayOfMonth(l, j2, k2);
        int j1 = iChronology.getDaysInYearMonth(k1, i2);
        if (k > j1)
        {
            k = j1;
        }
        return iChronology.getYearMonthDayMillis(k1, i2, k) + l6;
    }

    public int[] add(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        boolean flag = false;
        if (j == 0)
        {
            return ai;
        }
        if (readablepartial.size() > 0 && readablepartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i == 0)
        {
            return set(readablepartial, 0, ai, ((ai[0] - 1) + j % 12 + 12) % 12 + 1);
        }
        if (DateTimeUtils.isContiguous(readablepartial))
        {
            long l = 0L;
            int k = readablepartial.size();
            for (i = ((flag) ? 1 : 0); i < k; i++)
            {
                l = readablepartial.getFieldType(i).getField(iChronology).set(l, ai[i]);
            }

            l = add(l, j);
            return iChronology.get(readablepartial, l);
        } else
        {
            return super.add(readablepartial, i, ai, j);
        }
    }

    public long addWrapField(long l, int i)
    {
        return set(l, FieldUtils.getWrappedValue(get(l), i, 1, iMax));
    }

    public int get(long l)
    {
        return iChronology.getMonthOfYear(l);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        if (l < l1)
        {
            l1 = -getDifference(l1, l);
        } else
        {
            int i = iChronology.getYear(l);
            int j = iChronology.getMonthOfYear(l, i);
            int k = iChronology.getYear(l1);
            int i1 = iChronology.getMonthOfYear(l1, k);
            long l3 = ((long)(i - k) * (long)iMax + (long)j) - (long)i1;
            int j1 = iChronology.getDayOfMonth(l, i, j);
            long l2 = l1;
            if (j1 == iChronology.getDaysInYearMonth(i, j))
            {
                l2 = l1;
                if (iChronology.getDayOfMonth(l1, k, i1) > j1)
                {
                    l2 = iChronology.dayOfMonth().set(l1, j1);
                }
            }
            l1 = l3;
            if (l - iChronology.getYearMonthMillis(i, j) < l2 - iChronology.getYearMonthMillis(k, i1))
            {
                return l3 - 1L;
            }
        }
        return l1;
    }

    public int getLeapAmount(long l)
    {
        return !isLeap(l) ? 0 : 1;
    }

    public DurationField getLeapDurationField()
    {
        return iChronology.days();
    }

    public int getMaximumValue()
    {
        return iMax;
    }

    public int getMinimumValue()
    {
        return 1;
    }

    public DurationField getRangeDurationField()
    {
        return iChronology.years();
    }

    public boolean isLeap(long l)
    {
        boolean flag1 = false;
        int i = iChronology.getYear(l);
        boolean flag = flag1;
        if (iChronology.isLeapYear(i))
        {
            flag = flag1;
            if (iChronology.getMonthOfYear(l, i) == iLeapMonth)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean isLenient()
    {
        return false;
    }

    public long remainder(long l)
    {
        return l - roundFloor(l);
    }

    public long roundFloor(long l)
    {
        int i = iChronology.getYear(l);
        int j = iChronology.getMonthOfYear(l, i);
        return iChronology.getYearMonthMillis(i, j);
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, 1, iMax);
        int i1 = iChronology.getYear(l);
        int j = iChronology.getDayOfMonth(l, i1);
        int k = iChronology.getDaysInYearMonth(i1, i);
        if (j > k)
        {
            j = k;
        }
        return iChronology.getYearMonthDayMillis(i1, i, j) + (long)iChronology.getMillisOfDay(l);
    }
}
