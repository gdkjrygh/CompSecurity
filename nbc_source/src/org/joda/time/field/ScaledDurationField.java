// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

// Referenced classes of package org.joda.time.field:
//            DecoratedDurationField, FieldUtils

public class ScaledDurationField extends DecoratedDurationField
{

    private static final long serialVersionUID = 0xd384bef1064f7503L;
    private final int iScalar;

    public ScaledDurationField(DurationField durationfield, DurationFieldType durationfieldtype, int i)
    {
        super(durationfield, durationfieldtype);
        if (i == 0 || i == 1)
        {
            throw new IllegalArgumentException("The scalar must not be 0 or 1");
        } else
        {
            iScalar = i;
            return;
        }
    }

    public long add(long l, int i)
    {
        long l1 = i;
        long l2 = iScalar;
        return getWrappedField().add(l, l1 * l2);
    }

    public long add(long l, long l1)
    {
        l1 = FieldUtils.safeMultiply(l1, iScalar);
        return getWrappedField().add(l, l1);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof ScaledDurationField)
            {
                if (!getWrappedField().equals(((ScaledDurationField) (obj = (ScaledDurationField)obj)).getWrappedField()) || getType() != ((ScaledDurationField) (obj)).getType() || iScalar != ((ScaledDurationField) (obj)).iScalar)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int getDifference(long l, long l1)
    {
        return getWrappedField().getDifference(l, l1) / iScalar;
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return getWrappedField().getDifferenceAsLong(l, l1) / (long)iScalar;
    }

    public long getMillis(int i)
    {
        long l = i;
        long l1 = iScalar;
        return getWrappedField().getMillis(l * l1);
    }

    public long getMillis(int i, long l)
    {
        long l1 = i;
        long l2 = iScalar;
        return getWrappedField().getMillis(l1 * l2, l);
    }

    public long getMillis(long l)
    {
        l = FieldUtils.safeMultiply(l, iScalar);
        return getWrappedField().getMillis(l);
    }

    public long getMillis(long l, long l1)
    {
        l = FieldUtils.safeMultiply(l, iScalar);
        return getWrappedField().getMillis(l, l1);
    }

    public int getScalar()
    {
        return iScalar;
    }

    public long getUnitMillis()
    {
        return getWrappedField().getUnitMillis() * (long)iScalar;
    }

    public int getValue(long l)
    {
        return getWrappedField().getValue(l) / iScalar;
    }

    public int getValue(long l, long l1)
    {
        return getWrappedField().getValue(l, l1) / iScalar;
    }

    public long getValueAsLong(long l)
    {
        return getWrappedField().getValueAsLong(l) / (long)iScalar;
    }

    public long getValueAsLong(long l, long l1)
    {
        return getWrappedField().getValueAsLong(l, l1) / (long)iScalar;
    }

    public int hashCode()
    {
        long l = iScalar;
        return (int)(l ^ l >>> 32) + getType().hashCode() + getWrappedField().hashCode();
    }
}
