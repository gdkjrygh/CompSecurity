// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

// Referenced classes of package org.joda.time.field:
//            DecoratedDateTimeField, FieldUtils

public class OffsetDateTimeField extends DecoratedDateTimeField
{

    private static final long serialVersionUID = 0x2ba8177560f527a6L;
    private final int iMax;
    private final int iMin;
    private final int iOffset;

    public OffsetDateTimeField(DateTimeField datetimefield, int i)
    {
        DateTimeFieldType datetimefieldtype;
        if (datetimefield == null)
        {
            datetimefieldtype = null;
        } else
        {
            datetimefieldtype = datetimefield.getType();
        }
        this(datetimefield, datetimefieldtype, i, 0x80000000, 0x7fffffff);
    }

    public OffsetDateTimeField(DateTimeField datetimefield, DateTimeFieldType datetimefieldtype, int i)
    {
        this(datetimefield, datetimefieldtype, i, 0x80000000, 0x7fffffff);
    }

    public OffsetDateTimeField(DateTimeField datetimefield, DateTimeFieldType datetimefieldtype, int i, int j, int k)
    {
        super(datetimefield, datetimefieldtype);
        if (i == 0)
        {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
        iOffset = i;
        if (j < datetimefield.getMinimumValue() + i)
        {
            iMin = datetimefield.getMinimumValue() + i;
        } else
        {
            iMin = j;
        }
        if (k > datetimefield.getMaximumValue() + i)
        {
            iMax = datetimefield.getMaximumValue() + i;
            return;
        } else
        {
            iMax = k;
            return;
        }
    }

    public long add(long l, int i)
    {
        l = super.add(l, i);
        FieldUtils.verifyValueBounds(this, get(l), iMin, iMax);
        return l;
    }

    public long add(long l, long l1)
    {
        l = super.add(l, l1);
        FieldUtils.verifyValueBounds(this, get(l), iMin, iMax);
        return l;
    }

    public long addWrapField(long l, int i)
    {
        return set(l, FieldUtils.getWrappedValue(get(l), i, iMin, iMax));
    }

    public int get(long l)
    {
        return super.get(l) + iOffset;
    }

    public int getLeapAmount(long l)
    {
        return getWrappedField().getLeapAmount(l);
    }

    public DurationField getLeapDurationField()
    {
        return getWrappedField().getLeapDurationField();
    }

    public int getMaximumValue()
    {
        return iMax;
    }

    public int getMinimumValue()
    {
        return iMin;
    }

    public int getOffset()
    {
        return iOffset;
    }

    public boolean isLeap(long l)
    {
        return getWrappedField().isLeap(l);
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
        FieldUtils.verifyValueBounds(this, i, iMin, iMax);
        return super.set(l, i - iOffset);
    }
}
