// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

// Referenced classes of package org.joda.time.field:
//            FieldUtils

public final class MillisDurationField extends DurationField
    implements Serializable
{

    public static final DurationField INSTANCE = new MillisDurationField();
    private static final long serialVersionUID = 0x24de85b89b81f517L;

    private MillisDurationField()
    {
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

    public long add(long l, int i)
    {
        return FieldUtils.safeAdd(l, i);
    }

    public long add(long l, long l1)
    {
        return FieldUtils.safeAdd(l, l1);
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

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof MillisDurationField)
        {
            flag = flag1;
            if (getUnitMillis() == ((MillisDurationField)obj).getUnitMillis())
            {
                flag = true;
            }
        }
        return flag;
    }

    public int getDifference(long l, long l1)
    {
        return FieldUtils.safeToInt(FieldUtils.safeSubtract(l, l1));
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        return FieldUtils.safeSubtract(l, l1);
    }

    public long getMillis(int i)
    {
        return (long)i;
    }

    public long getMillis(int i, long l)
    {
        return (long)i;
    }

    public long getMillis(long l)
    {
        return l;
    }

    public long getMillis(long l, long l1)
    {
        return l;
    }

    public String getName()
    {
        return "millis";
    }

    public DurationFieldType getType()
    {
        return DurationFieldType.millis();
    }

    public final long getUnitMillis()
    {
        return 1L;
    }

    public int getValue(long l)
    {
        return FieldUtils.safeToInt(l);
    }

    public int getValue(long l, long l1)
    {
        return FieldUtils.safeToInt(l);
    }

    public long getValueAsLong(long l)
    {
        return l;
    }

    public long getValueAsLong(long l, long l1)
    {
        return l;
    }

    public int hashCode()
    {
        return (int)getUnitMillis();
    }

    public final boolean isPrecise()
    {
        return true;
    }

    public boolean isSupported()
    {
        return true;
    }

    public String toString()
    {
        return "DurationField[millis]";
    }

}
