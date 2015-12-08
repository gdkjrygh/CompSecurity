// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology

class BasicYearDateTimeField extends ImpreciseDateTimeField
{

    private static final long serialVersionUID = 0xffffa64c3419e821L;
    protected final BasicChronology iChronology;

    BasicYearDateTimeField(BasicChronology basicchronology)
    {
        super(DateTimeFieldType.year(), basicchronology.getAverageMillisPerYear());
        iChronology = basicchronology;
    }

    private Object readResolve()
    {
        return iChronology.year();
    }

    public long add(long l, int i)
    {
        if (i == 0)
        {
            return l;
        } else
        {
            return set(l, FieldUtils.safeAdd(get(l), i));
        }
    }

    public long add(long l, long l1)
    {
        return add(l, FieldUtils.safeToInt(l1));
    }

    public long addWrapField(long l, int i)
    {
        if (i == 0)
        {
            return l;
        } else
        {
            return set(l, FieldUtils.getWrappedValue(iChronology.getYear(l), i, iChronology.getMinYear(), iChronology.getMaxYear()));
        }
    }

    public int get(long l)
    {
        return iChronology.getYear(l);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        if (l < l1)
        {
            return -iChronology.getYearDifference(l1, l);
        } else
        {
            return iChronology.getYearDifference(l, l1);
        }
    }

    public int getLeapAmount(long l)
    {
        return !iChronology.isLeapYear(get(l)) ? 0 : 1;
    }

    public DurationField getLeapDurationField()
    {
        return iChronology.days();
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
        return iChronology.isLeapYear(get(l));
    }

    public boolean isLenient()
    {
        return false;
    }

    public long remainder(long l)
    {
        return l - roundFloor(l);
    }

    public long roundCeiling(long l)
    {
        int i = get(l);
        long l1 = l;
        if (l != iChronology.getYearMillis(i))
        {
            l1 = iChronology.getYearMillis(i + 1);
        }
        return l1;
    }

    public long roundFloor(long l)
    {
        return iChronology.getYearMillis(get(l));
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, iChronology.getMinYear(), iChronology.getMaxYear());
        return iChronology.setYear(l, i);
    }
}
