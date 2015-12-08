// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology

final class BasicWeekyearDateTimeField extends ImpreciseDateTimeField
{

    private static final long WEEK_53 = 0x7528ad000L;
    private static final long serialVersionUID = 0x56405a6e978d8324L;
    private final BasicChronology iChronology;

    BasicWeekyearDateTimeField(BasicChronology basicchronology)
    {
        super(DateTimeFieldType.weekyear(), basicchronology.getAverageMillisPerYear());
        iChronology = basicchronology;
    }

    private Object readResolve()
    {
        return iChronology.weekyear();
    }

    public long add(long l, int i)
    {
        if (i == 0)
        {
            return l;
        } else
        {
            return set(l, get(l) + i);
        }
    }

    public long add(long l, long l1)
    {
        return add(l, FieldUtils.safeToInt(l1));
    }

    public long addWrapField(long l, int i)
    {
        return add(l, i);
    }

    public int get(long l)
    {
        return iChronology.getWeekyear(l);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        if (l < l1)
        {
            return (long)(-getDifference(l1, l));
        }
        int i = get(l);
        int j = get(l1);
        long l2 = remainder(l);
        l = remainder(l1);
        if (l >= 0x7528ad000L && iChronology.getWeeksInYear(i) <= 52)
        {
            l -= 0x240c8400L;
        }
        j = i - j;
        i = j;
        if (l2 < l)
        {
            i = j - 1;
        }
        return (long)i;
    }

    public int getLeapAmount(long l)
    {
        return iChronology.getWeeksInYear(iChronology.getWeekyear(l)) - 52;
    }

    public DurationField getLeapDurationField()
    {
        return iChronology.weeks();
    }

    public int getMaximumValue()
    {
        return iChronology.getMaxYear();
    }

    public int getMinimumValue()
    {
        return iChronology.getMinYear();
    }

    public DurationField getRangeDurationField()
    {
        return null;
    }

    public boolean isLeap(long l)
    {
        return iChronology.getWeeksInYear(iChronology.getWeekyear(l)) > 52;
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
        long l1 = iChronology.weekOfWeekyear().roundFloor(l);
        int i = iChronology.getWeekOfWeekyear(l1);
        l = l1;
        if (i > 1)
        {
            l = l1 - (long)(i - 1) * 0x240c8400L;
        }
        return l;
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, Math.abs(i), iChronology.getMinYear(), iChronology.getMaxYear());
        int j = get(l);
        if (j == i)
        {
            return l;
        }
        int i1 = iChronology.getDayOfWeek(l);
        j = iChronology.getWeeksInYear(j);
        int k = iChronology.getWeeksInYear(i);
        if (k < j)
        {
            j = k;
        }
        k = iChronology.getWeekOfWeekyear(l);
        long l1;
        if (k <= j)
        {
            j = k;
        }
        l1 = iChronology.setYear(l, i);
        k = get(l1);
        if (k >= i) goto _L2; else goto _L1
_L1:
        l = l1 + 0x240c8400L;
_L4:
        l1 = j - iChronology.getWeekOfWeekyear(l);
        return iChronology.dayOfWeek().set(l1 * 0x240c8400L + l, i1);
_L2:
        l = l1;
        if (k > i)
        {
            l = l1 - 0x240c8400L;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
