// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

// Referenced classes of package org.joda.time.field:
//            DecoratedDateTimeField, ScaledDurationField, DividedDateTimeField, FieldUtils

public class RemainderDateTimeField extends DecoratedDateTimeField
{

    private static final long serialVersionUID = 0x4f37bf28eb0078e6L;
    final int iDivisor;
    final DurationField iDurationField;
    final DurationField iRangeField;

    public RemainderDateTimeField(DateTimeField datetimefield, DateTimeFieldType datetimefieldtype, int i)
    {
        super(datetimefield, datetimefieldtype);
        if (i < 2)
        {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        DurationField durationfield = datetimefield.getDurationField();
        if (durationfield == null)
        {
            iRangeField = null;
        } else
        {
            iRangeField = new ScaledDurationField(durationfield, datetimefieldtype.getRangeDurationType(), i);
        }
        iDurationField = datetimefield.getDurationField();
        iDivisor = i;
    }

    public RemainderDateTimeField(DateTimeField datetimefield, DurationField durationfield, DateTimeFieldType datetimefieldtype, int i)
    {
        super(datetimefield, datetimefieldtype);
        if (i < 2)
        {
            throw new IllegalArgumentException("The divisor must be at least 2");
        } else
        {
            iRangeField = durationfield;
            iDurationField = datetimefield.getDurationField();
            iDivisor = i;
            return;
        }
    }

    public RemainderDateTimeField(DividedDateTimeField divideddatetimefield)
    {
        this(divideddatetimefield, divideddatetimefield.getType());
    }

    public RemainderDateTimeField(DividedDateTimeField divideddatetimefield, DateTimeFieldType datetimefieldtype)
    {
        this(divideddatetimefield, divideddatetimefield.getWrappedField().getDurationField(), datetimefieldtype);
    }

    public RemainderDateTimeField(DividedDateTimeField divideddatetimefield, DurationField durationfield, DateTimeFieldType datetimefieldtype)
    {
        super(divideddatetimefield.getWrappedField(), datetimefieldtype);
        iDivisor = divideddatetimefield.iDivisor;
        iDurationField = durationfield;
        iRangeField = divideddatetimefield.iDurationField;
    }

    private int getDivided(int i)
    {
        if (i >= 0)
        {
            return i / iDivisor;
        } else
        {
            return (i + 1) / iDivisor - 1;
        }
    }

    public long addWrapField(long l, int i)
    {
        return set(l, FieldUtils.getWrappedValue(get(l), i, 0, iDivisor - 1));
    }

    public int get(long l)
    {
        int i = getWrappedField().get(l);
        if (i >= 0)
        {
            return i % iDivisor;
        } else
        {
            int j = iDivisor;
            return (i + 1) % iDivisor + (j - 1);
        }
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
        return iDivisor - 1;
    }

    public int getMinimumValue()
    {
        return 0;
    }

    public DurationField getRangeDurationField()
    {
        return iRangeField;
    }

    public long remainder(long l)
    {
        return getWrappedField().remainder(l);
    }

    public long roundCeiling(long l)
    {
        return getWrappedField().roundCeiling(l);
    }

    public long roundFloor(long l)
    {
        return getWrappedField().roundFloor(l);
    }

    public long roundHalfCeiling(long l)
    {
        return getWrappedField().roundHalfCeiling(l);
    }

    public long roundHalfEven(long l)
    {
        return getWrappedField().roundHalfEven(l);
    }

    public long roundHalfFloor(long l)
    {
        return getWrappedField().roundHalfFloor(l);
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, 0, iDivisor - 1);
        int j = getDivided(getWrappedField().get(l));
        return getWrappedField().set(l, j * iDivisor + i);
    }
}
