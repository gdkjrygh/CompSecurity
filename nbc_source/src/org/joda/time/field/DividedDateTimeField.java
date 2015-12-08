// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

// Referenced classes of package org.joda.time.field:
//            DecoratedDateTimeField, ScaledDurationField, RemainderDateTimeField, FieldUtils

public class DividedDateTimeField extends DecoratedDateTimeField
{

    private static final long serialVersionUID = 0x7371290d64b04a35L;
    final int iDivisor;
    final DurationField iDurationField;
    private final int iMax;
    private final int iMin;
    final DurationField iRangeDurationField;

    public DividedDateTimeField(DateTimeField datetimefield, DateTimeFieldType datetimefieldtype, int i)
    {
        this(datetimefield, datetimefield.getRangeDurationField(), datetimefieldtype, i);
    }

    public DividedDateTimeField(DateTimeField datetimefield, DurationField durationfield, DateTimeFieldType datetimefieldtype, int i)
    {
        super(datetimefield, datetimefieldtype);
        if (i < 2)
        {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        DurationField durationfield1 = datetimefield.getDurationField();
        int j;
        int k;
        if (durationfield1 == null)
        {
            iDurationField = null;
        } else
        {
            iDurationField = new ScaledDurationField(durationfield1, datetimefieldtype.getDurationType(), i);
        }
        iRangeDurationField = durationfield;
        iDivisor = i;
        j = datetimefield.getMinimumValue();
        if (j >= 0)
        {
            j /= i;
        } else
        {
            j = (j + 1) / i - 1;
        }
        k = datetimefield.getMaximumValue();
        if (k >= 0)
        {
            i = k / i;
        } else
        {
            i = (k + 1) / i - 1;
        }
        iMin = j;
        iMax = i;
    }

    public DividedDateTimeField(RemainderDateTimeField remainderdatetimefield, DateTimeFieldType datetimefieldtype)
    {
        this(remainderdatetimefield, ((DurationField) (null)), datetimefieldtype);
    }

    public DividedDateTimeField(RemainderDateTimeField remainderdatetimefield, DurationField durationfield, DateTimeFieldType datetimefieldtype)
    {
        super(remainderdatetimefield.getWrappedField(), datetimefieldtype);
        int j = remainderdatetimefield.iDivisor;
        iDivisor = j;
        iDurationField = remainderdatetimefield.iRangeField;
        iRangeDurationField = durationfield;
        remainderdatetimefield = getWrappedField();
        int i = remainderdatetimefield.getMinimumValue();
        int k;
        if (i >= 0)
        {
            i /= j;
        } else
        {
            i = (i + 1) / j - 1;
        }
        k = remainderdatetimefield.getMaximumValue();
        if (k >= 0)
        {
            j = k / j;
        } else
        {
            j = (k + 1) / j - 1;
        }
        iMin = i;
        iMax = j;
    }

    private int getRemainder(int i)
    {
        if (i >= 0)
        {
            return i % iDivisor;
        } else
        {
            return (iDivisor - 1) + (i + 1) % iDivisor;
        }
    }

    public long add(long l, int i)
    {
        return getWrappedField().add(l, iDivisor * i);
    }

    public long add(long l, long l1)
    {
        return getWrappedField().add(l, (long)iDivisor * l1);
    }

    public long addWrapField(long l, int i)
    {
        return set(l, FieldUtils.getWrappedValue(get(l), i, iMin, iMax));
    }

    public int get(long l)
    {
        int i = getWrappedField().get(l);
        if (i >= 0)
        {
            return i / iDivisor;
        } else
        {
            return (i + 1) / iDivisor - 1;
        }
    }

    public int getDifference(long l, long l1)
    {
        return getWrappedField().getDifference(l, l1) / iDivisor;
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return getWrappedField().getDifferenceAsLong(l, l1) / (long)iDivisor;
    }

    public int getDivisor()
    {
        return iDivisor;
    }

    public DurationField getDurationField()
    {
        return iDurationField;
    }

    public int getMaximumValue()
    {
        return iMax;
    }

    public int getMinimumValue()
    {
        return iMin;
    }

    public DurationField getRangeDurationField()
    {
        if (iRangeDurationField != null)
        {
            return iRangeDurationField;
        } else
        {
            return super.getRangeDurationField();
        }
    }

    public long remainder(long l)
    {
        return set(l, get(getWrappedField().remainder(l)));
    }

    public long roundFloor(long l)
    {
        DateTimeField datetimefield = getWrappedField();
        return datetimefield.roundFloor(datetimefield.set(l, get(l) * iDivisor));
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, iMin, iMax);
        int j = getRemainder(getWrappedField().get(l));
        return getWrappedField().set(l, j + iDivisor * i);
    }
}
