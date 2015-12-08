// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;

// Referenced classes of package org.joda.time.field:
//            DecoratedDateTimeField, FieldUtils

public final class ZeroIsMaxDateTimeField extends DecoratedDateTimeField
{

    private static final long serialVersionUID = 0xd58d2588e7bb132L;

    public ZeroIsMaxDateTimeField(DateTimeField datetimefield, DateTimeFieldType datetimefieldtype)
    {
        super(datetimefield, datetimefieldtype);
        if (datetimefield.getMinimumValue() != 0)
        {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        } else
        {
            return;
        }
    }

    public long add(long l, int i)
    {
        return getWrappedField().add(l, i);
    }

    public long add(long l, long l1)
    {
        return getWrappedField().add(l, l1);
    }

    public long addWrapField(long l, int i)
    {
        return getWrappedField().addWrapField(l, i);
    }

    public int[] addWrapField(ReadablePartial readablepartial, int i, int ai[], int j)
    {
        return getWrappedField().addWrapField(readablepartial, i, ai, j);
    }

    public int get(long l)
    {
        int j = getWrappedField().get(l);
        int i = j;
        if (j == 0)
        {
            i = getMaximumValue();
        }
        return i;
    }

    public int getDifference(long l, long l1)
    {
        return getWrappedField().getDifference(l, l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return getWrappedField().getDifferenceAsLong(l, l1);
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
        return getWrappedField().getMaximumValue() + 1;
    }

    public int getMaximumValue(long l)
    {
        return getWrappedField().getMaximumValue(l) + 1;
    }

    public int getMaximumValue(ReadablePartial readablepartial)
    {
        return getWrappedField().getMaximumValue(readablepartial) + 1;
    }

    public int getMaximumValue(ReadablePartial readablepartial, int ai[])
    {
        return getWrappedField().getMaximumValue(readablepartial, ai) + 1;
    }

    public int getMinimumValue()
    {
        return 1;
    }

    public int getMinimumValue(long l)
    {
        return 1;
    }

    public int getMinimumValue(ReadablePartial readablepartial)
    {
        return 1;
    }

    public int getMinimumValue(ReadablePartial readablepartial, int ai[])
    {
        return 1;
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
        int k = getMaximumValue();
        FieldUtils.verifyValueBounds(this, i, 1, k);
        int j = i;
        if (i == k)
        {
            j = 0;
        }
        return getWrappedField().set(l, j);
    }
}
