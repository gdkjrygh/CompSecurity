// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time.chrono:
//            GregorianChronology

class ISOYearOfEraDateTimeField extends DecoratedDateTimeField
{

    static final DateTimeField INSTANCE = new ISOYearOfEraDateTimeField();
    private static final long serialVersionUID = 0x61aa4edab52f7f95L;

    private ISOYearOfEraDateTimeField()
    {
        super(GregorianChronology.getInstanceUTC().year(), DateTimeFieldType.yearOfEra());
    }

    private Object readResolve()
    {
        return INSTANCE;
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
        if (j < 0)
        {
            i = -j;
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

    public int getMaximumValue()
    {
        return getWrappedField().getMaximumValue();
    }

    public int getMinimumValue()
    {
        return 0;
    }

    public DurationField getRangeDurationField()
    {
        return GregorianChronology.getInstanceUTC().eras();
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

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, 0, getMaximumValue());
        int j = i;
        if (getWrappedField().get(l) < 0)
        {
            j = -i;
        }
        return super.set(l, j);
    }

}
