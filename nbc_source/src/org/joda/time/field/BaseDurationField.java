// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

// Referenced classes of package org.joda.time.field:
//            FieldUtils

public abstract class BaseDurationField extends DurationField
    implements Serializable
{

    private static final long serialVersionUID = 0xdc8d7f9b8cda387eL;
    private final DurationFieldType iType;

    protected BaseDurationField(DurationFieldType durationfieldtype)
    {
        if (durationfieldtype == null)
        {
            throw new IllegalArgumentException("The type must not be null");
        } else
        {
            iType = durationfieldtype;
            return;
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((DurationField)obj);
    }

    public int compareTo(DurationField durationfield)
    {
        long l = durationfield.getUnitMillis();
        long l1 = getUnitMillis();
        if (l1 == l)
        {
            return 0;
        }
        return l1 >= l ? 1 : -1;
    }

    public int getDifference(long l, long l1)
    {
        return FieldUtils.safeToInt(getDifferenceAsLong(l, l1));
    }

    public long getMillis(int i)
    {
        return (long)i * getUnitMillis();
    }

    public long getMillis(long l)
    {
        return FieldUtils.safeMultiply(l, getUnitMillis());
    }

    public final String getName()
    {
        return iType.getName();
    }

    public final DurationFieldType getType()
    {
        return iType;
    }

    public int getValue(long l)
    {
        return FieldUtils.safeToInt(getValueAsLong(l));
    }

    public int getValue(long l, long l1)
    {
        return FieldUtils.safeToInt(getValueAsLong(l, l1));
    }

    public long getValueAsLong(long l)
    {
        return l / getUnitMillis();
    }

    public final boolean isSupported()
    {
        return true;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DurationField[").append(getName()).append(']').toString();
    }
}
