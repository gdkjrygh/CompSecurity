// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.field.BaseDurationField;

// Referenced classes of package org.joda.time.chrono:
//            ZonedChronology

static class iZone extends BaseDurationField
{

    private static final long serialVersionUID = 0xf943b502d87d9ea2L;
    final DurationField iField;
    final boolean iTimeField;
    final DateTimeZone iZone;

    private long addOffset(long l)
    {
        return iZone.convertUTCToLocal(l);
    }

    private int getOffsetFromLocalToSubtract(long l)
    {
        int i = iZone.getOffsetFromLocal(l);
        if ((l - (long)i ^ l) < 0L && ((long)i ^ l) < 0L)
        {
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        } else
        {
            return i;
        }
    }

    private int getOffsetToAdd(long l)
    {
        int i = iZone.getOffset(l);
        if (((long)i + l ^ l) < 0L && ((long)i ^ l) >= 0L)
        {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        } else
        {
            return i;
        }
    }

    public long add(long l, int i)
    {
        int j = getOffsetToAdd(l);
        l = iField.add((long)j + l, i);
        if (iTimeField)
        {
            i = j;
        } else
        {
            i = getOffsetFromLocalToSubtract(l);
        }
        return l - (long)i;
    }

    public long add(long l, long l1)
    {
        int i = getOffsetToAdd(l);
        l = iField.add((long)i + l, l1);
        if (!iTimeField)
        {
            i = getOffsetFromLocalToSubtract(l);
        }
        return l - (long)i;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof getOffsetFromLocalToSubtract)
            {
                if (!iField.equals(((iField) (obj = (iField)obj)).iField) || !iZone.equals(((iZone) (obj)).iZone))
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
        int j = getOffsetToAdd(l1);
        DurationField durationfield = iField;
        int i;
        if (iTimeField)
        {
            i = j;
        } else
        {
            i = getOffsetToAdd(l);
        }
        return durationfield.getDifference((long)i + l, (long)j + l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        int j = getOffsetToAdd(l1);
        DurationField durationfield = iField;
        int i;
        if (iTimeField)
        {
            i = j;
        } else
        {
            i = getOffsetToAdd(l);
        }
        return durationfield.getDifferenceAsLong((long)i + l, (long)j + l1);
    }

    public long getMillis(int i, long l)
    {
        return iField.getMillis(i, addOffset(l));
    }

    public long getMillis(long l, long l1)
    {
        return iField.getMillis(l, addOffset(l1));
    }

    public long getUnitMillis()
    {
        return iField.getUnitMillis();
    }

    public int getValue(long l, long l1)
    {
        return iField.getValue(l, addOffset(l1));
    }

    public long getValueAsLong(long l, long l1)
    {
        return iField.getValueAsLong(l, addOffset(l1));
    }

    public int hashCode()
    {
        return iField.hashCode() ^ iZone.hashCode();
    }

    public boolean isPrecise()
    {
        if (iTimeField)
        {
            return iField.isPrecise();
        }
        return iField.isPrecise() && iZone.isFixed();
    }

    (DurationField durationfield, DateTimeZone datetimezone)
    {
        super(durationfield.getType());
        if (!durationfield.isSupported())
        {
            throw new IllegalArgumentException();
        } else
        {
            iField = durationfield;
            iTimeField = ZonedChronology.useTimeArithmetic(durationfield);
            iZone = datetimezone;
            return;
        }
    }
}
