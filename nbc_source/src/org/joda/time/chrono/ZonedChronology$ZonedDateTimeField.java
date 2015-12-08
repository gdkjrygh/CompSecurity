// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            ZonedChronology

static final class iLeapDurationField extends BaseDateTimeField
{

    private static final long serialVersionUID = 0xc8eb54024aca28beL;
    final DurationField iDurationField;
    final DateTimeField iField;
    final DurationField iLeapDurationField;
    final DurationField iRangeDurationField;
    final boolean iTimeField;
    final DateTimeZone iZone;

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
        if (iTimeField)
        {
            int j = getOffsetToAdd(l);
            return iField.add((long)j + l, i) - (long)j;
        } else
        {
            long l1 = iZone.convertUTCToLocal(l);
            l1 = iField.add(l1, i);
            return iZone.convertLocalToUTC(l1, false, l);
        }
    }

    public long add(long l, long l1)
    {
        if (iTimeField)
        {
            int i = getOffsetToAdd(l);
            return iField.add((long)i + l, l1) - (long)i;
        } else
        {
            long l2 = iZone.convertUTCToLocal(l);
            l1 = iField.add(l2, l1);
            return iZone.convertLocalToUTC(l1, false, l);
        }
    }

    public long addWrapField(long l, int i)
    {
        if (iTimeField)
        {
            int j = getOffsetToAdd(l);
            return iField.addWrapField((long)j + l, i) - (long)j;
        } else
        {
            long l1 = iZone.convertUTCToLocal(l);
            l1 = iField.addWrapField(l1, i);
            return iZone.convertLocalToUTC(l1, false, l);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof iZone)
            {
                if (!iField.equals(((iField) (obj = (iField)obj)).iField) || !iZone.equals(((iZone) (obj)).iZone) || !iDurationField.equals(((iDurationField) (obj)).iDurationField) || !iRangeDurationField.equals(((iRangeDurationField) (obj)).iRangeDurationField))
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

    public int get(long l)
    {
        l = iZone.convertUTCToLocal(l);
        return iField.get(l);
    }

    public String getAsShortText(int i, Locale locale)
    {
        return iField.getAsShortText(i, locale);
    }

    public String getAsShortText(long l, Locale locale)
    {
        l = iZone.convertUTCToLocal(l);
        return iField.getAsShortText(l, locale);
    }

    public String getAsText(int i, Locale locale)
    {
        return iField.getAsText(i, locale);
    }

    public String getAsText(long l, Locale locale)
    {
        l = iZone.convertUTCToLocal(l);
        return iField.getAsText(l, locale);
    }

    public int getDifference(long l, long l1)
    {
        int j = getOffsetToAdd(l1);
        DateTimeField datetimefield = iField;
        int i;
        if (iTimeField)
        {
            i = j;
        } else
        {
            i = getOffsetToAdd(l);
        }
        return datetimefield.getDifference((long)i + l, (long)j + l1);
    }

    public long getDifferenceAsLong(long l, long l1)
    {
        int j = getOffsetToAdd(l1);
        DateTimeField datetimefield = iField;
        int i;
        if (iTimeField)
        {
            i = j;
        } else
        {
            i = getOffsetToAdd(l);
        }
        return datetimefield.getDifferenceAsLong((long)i + l, (long)j + l1);
    }

    public final DurationField getDurationField()
    {
        return iDurationField;
    }

    public int getLeapAmount(long l)
    {
        l = iZone.convertUTCToLocal(l);
        return iField.getLeapAmount(l);
    }

    public final DurationField getLeapDurationField()
    {
        return iLeapDurationField;
    }

    public int getMaximumShortTextLength(Locale locale)
    {
        return iField.getMaximumShortTextLength(locale);
    }

    public int getMaximumTextLength(Locale locale)
    {
        return iField.getMaximumTextLength(locale);
    }

    public int getMaximumValue()
    {
        return iField.getMaximumValue();
    }

    public int getMaximumValue(long l)
    {
        l = iZone.convertUTCToLocal(l);
        return iField.getMaximumValue(l);
    }

    public int getMaximumValue(ReadablePartial readablepartial)
    {
        return iField.getMaximumValue(readablepartial);
    }

    public int getMaximumValue(ReadablePartial readablepartial, int ai[])
    {
        return iField.getMaximumValue(readablepartial, ai);
    }

    public int getMinimumValue()
    {
        return iField.getMinimumValue();
    }

    public int getMinimumValue(long l)
    {
        l = iZone.convertUTCToLocal(l);
        return iField.getMinimumValue(l);
    }

    public int getMinimumValue(ReadablePartial readablepartial)
    {
        return iField.getMinimumValue(readablepartial);
    }

    public int getMinimumValue(ReadablePartial readablepartial, int ai[])
    {
        return iField.getMinimumValue(readablepartial, ai);
    }

    public final DurationField getRangeDurationField()
    {
        return iRangeDurationField;
    }

    public int hashCode()
    {
        return iField.hashCode() ^ iZone.hashCode();
    }

    public boolean isLeap(long l)
    {
        l = iZone.convertUTCToLocal(l);
        return iField.isLeap(l);
    }

    public boolean isLenient()
    {
        return iField.isLenient();
    }

    public long remainder(long l)
    {
        l = iZone.convertUTCToLocal(l);
        return iField.remainder(l);
    }

    public long roundCeiling(long l)
    {
        if (iTimeField)
        {
            int i = getOffsetToAdd(l);
            return iField.roundCeiling((long)i + l) - (long)i;
        } else
        {
            long l1 = iZone.convertUTCToLocal(l);
            l1 = iField.roundCeiling(l1);
            return iZone.convertLocalToUTC(l1, false, l);
        }
    }

    public long roundFloor(long l)
    {
        if (iTimeField)
        {
            int i = getOffsetToAdd(l);
            return iField.roundFloor((long)i + l) - (long)i;
        } else
        {
            long l1 = iZone.convertUTCToLocal(l);
            l1 = iField.roundFloor(l1);
            return iZone.convertLocalToUTC(l1, false, l);
        }
    }

    public long set(long l, int i)
    {
        long l1 = iZone.convertUTCToLocal(l);
        l1 = iField.set(l1, i);
        l = iZone.convertLocalToUTC(l1, false, l);
        if (get(l) != i)
        {
            IllegalInstantException illegalinstantexception = new IllegalInstantException(l1, iZone.getID());
            IllegalFieldValueException illegalfieldvalueexception = new IllegalFieldValueException(iField.getType(), Integer.valueOf(i), illegalinstantexception.getMessage());
            illegalfieldvalueexception.initCause(illegalinstantexception);
            throw illegalfieldvalueexception;
        } else
        {
            return l;
        }
    }

    public long set(long l, String s, Locale locale)
    {
        long l1 = iZone.convertUTCToLocal(l);
        l1 = iField.set(l1, s, locale);
        return iZone.convertLocalToUTC(l1, false, l);
    }

    (DateTimeField datetimefield, DateTimeZone datetimezone, DurationField durationfield, DurationField durationfield1, DurationField durationfield2)
    {
        super(datetimefield.getType());
        if (!datetimefield.isSupported())
        {
            throw new IllegalArgumentException();
        } else
        {
            iField = datetimefield;
            iZone = datetimezone;
            iDurationField = durationfield;
            iTimeField = ZonedChronology.useTimeArithmetic(durationfield);
            iRangeDurationField = durationfield1;
            iLeapDurationField = durationfield2;
            return;
        }
    }
}
