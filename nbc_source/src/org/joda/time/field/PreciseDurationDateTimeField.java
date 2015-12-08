// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;

// Referenced classes of package org.joda.time.field:
//            BaseDateTimeField, FieldUtils

public abstract class PreciseDurationDateTimeField extends BaseDateTimeField
{

    private static final long serialVersionUID = 0x4573a34c210f9bb3L;
    private final DurationField iUnitField;
    final long iUnitMillis;

    public PreciseDurationDateTimeField(DateTimeFieldType datetimefieldtype, DurationField durationfield)
    {
        super(datetimefieldtype);
        if (!durationfield.isPrecise())
        {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        iUnitMillis = durationfield.getUnitMillis();
        if (iUnitMillis < 1L)
        {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        } else
        {
            iUnitField = durationfield;
            return;
        }
    }

    public DurationField getDurationField()
    {
        return iUnitField;
    }

    protected int getMaximumValueForSet(long l, int i)
    {
        return getMaximumValue(l);
    }

    public int getMinimumValue()
    {
        return 0;
    }

    public final long getUnitMillis()
    {
        return iUnitMillis;
    }

    public boolean isLenient()
    {
        return false;
    }

    public long remainder(long l)
    {
        if (l >= 0L)
        {
            return l % iUnitMillis;
        } else
        {
            return ((l + 1L) % iUnitMillis + iUnitMillis) - 1L;
        }
    }

    public long roundCeiling(long l)
    {
        if (l > 0L)
        {
            l--;
            return (l - l % iUnitMillis) + iUnitMillis;
        } else
        {
            return l - l % iUnitMillis;
        }
    }

    public long roundFloor(long l)
    {
        if (l >= 0L)
        {
            return l - l % iUnitMillis;
        } else
        {
            l = 1L + l;
            return l - l % iUnitMillis - iUnitMillis;
        }
    }

    public long set(long l, int i)
    {
        FieldUtils.verifyValueBounds(this, i, getMinimumValue(), getMaximumValueForSet(l, i));
        return (long)(i - get(l)) * iUnitMillis + l;
    }
}
