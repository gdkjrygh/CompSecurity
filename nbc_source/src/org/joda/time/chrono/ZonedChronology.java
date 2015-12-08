// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.BaseDurationField;

// Referenced classes of package org.joda.time.chrono:
//            AssembledChronology

public final class ZonedChronology extends AssembledChronology
{
    static final class ZonedDateTimeField extends BaseDateTimeField
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
                if (obj instanceof ZonedDateTimeField)
                {
                    if (!iField.equals(((ZonedDateTimeField) (obj = (ZonedDateTimeField)obj)).iField) || !iZone.equals(((ZonedDateTimeField) (obj)).iZone) || !iDurationField.equals(((ZonedDateTimeField) (obj)).iDurationField) || !iRangeDurationField.equals(((ZonedDateTimeField) (obj)).iRangeDurationField))
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

        ZonedDateTimeField(DateTimeField datetimefield, DateTimeZone datetimezone, DurationField durationfield, DurationField durationfield1, DurationField durationfield2)
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

    static class ZonedDurationField extends BaseDurationField
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
                if (obj instanceof ZonedDurationField)
                {
                    if (!iField.equals(((ZonedDurationField) (obj = (ZonedDurationField)obj)).iField) || !iZone.equals(((ZonedDurationField) (obj)).iZone))
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

        ZonedDurationField(DurationField durationfield, DateTimeZone datetimezone)
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


    private static final long serialVersionUID = 0xf105b3cbf0791080L;

    private ZonedChronology(Chronology chronology, DateTimeZone datetimezone)
    {
        super(chronology, datetimezone);
    }

    private DateTimeField convertField(DateTimeField datetimefield, HashMap hashmap)
    {
        if (datetimefield == null || !datetimefield.isSupported())
        {
            return datetimefield;
        }
        if (hashmap.containsKey(datetimefield))
        {
            return (DateTimeField)hashmap.get(datetimefield);
        } else
        {
            ZonedDateTimeField zoneddatetimefield = new ZonedDateTimeField(datetimefield, getZone(), convertField(datetimefield.getDurationField(), hashmap), convertField(datetimefield.getRangeDurationField(), hashmap), convertField(datetimefield.getLeapDurationField(), hashmap));
            hashmap.put(datetimefield, zoneddatetimefield);
            return zoneddatetimefield;
        }
    }

    private DurationField convertField(DurationField durationfield, HashMap hashmap)
    {
        if (durationfield == null || !durationfield.isSupported())
        {
            return durationfield;
        }
        if (hashmap.containsKey(durationfield))
        {
            return (DurationField)hashmap.get(durationfield);
        } else
        {
            ZonedDurationField zoneddurationfield = new ZonedDurationField(durationfield, getZone());
            hashmap.put(durationfield, zoneddurationfield);
            return zoneddurationfield;
        }
    }

    public static ZonedChronology getInstance(Chronology chronology, DateTimeZone datetimezone)
    {
        if (chronology == null)
        {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        chronology = chronology.withUTC();
        if (chronology == null)
        {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (datetimezone == null)
        {
            throw new IllegalArgumentException("DateTimeZone must not be null");
        } else
        {
            return new ZonedChronology(chronology, datetimezone);
        }
    }

    private long localToUTC(long l)
    {
        DateTimeZone datetimezone = getZone();
        int i = datetimezone.getOffsetFromLocal(l);
        long l1 = l - (long)i;
        if (i != datetimezone.getOffset(l1))
        {
            throw new IllegalInstantException(l, datetimezone.getID());
        } else
        {
            return l1;
        }
    }

    static boolean useTimeArithmetic(DurationField durationfield)
    {
        return durationfield != null && durationfield.getUnitMillis() < 0x2932e00L;
    }

    protected void assemble(AssembledChronology.Fields fields)
    {
        HashMap hashmap = new HashMap();
        fields.eras = convertField(fields.eras, hashmap);
        fields.centuries = convertField(fields.centuries, hashmap);
        fields.years = convertField(fields.years, hashmap);
        fields.months = convertField(fields.months, hashmap);
        fields.weekyears = convertField(fields.weekyears, hashmap);
        fields.weeks = convertField(fields.weeks, hashmap);
        fields.days = convertField(fields.days, hashmap);
        fields.halfdays = convertField(fields.halfdays, hashmap);
        fields.hours = convertField(fields.hours, hashmap);
        fields.minutes = convertField(fields.minutes, hashmap);
        fields.seconds = convertField(fields.seconds, hashmap);
        fields.millis = convertField(fields.millis, hashmap);
        fields.year = convertField(fields.year, hashmap);
        fields.yearOfEra = convertField(fields.yearOfEra, hashmap);
        fields.yearOfCentury = convertField(fields.yearOfCentury, hashmap);
        fields.centuryOfEra = convertField(fields.centuryOfEra, hashmap);
        fields.era = convertField(fields.era, hashmap);
        fields.dayOfWeek = convertField(fields.dayOfWeek, hashmap);
        fields.dayOfMonth = convertField(fields.dayOfMonth, hashmap);
        fields.dayOfYear = convertField(fields.dayOfYear, hashmap);
        fields.monthOfYear = convertField(fields.monthOfYear, hashmap);
        fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, hashmap);
        fields.weekyear = convertField(fields.weekyear, hashmap);
        fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, hashmap);
        fields.millisOfSecond = convertField(fields.millisOfSecond, hashmap);
        fields.millisOfDay = convertField(fields.millisOfDay, hashmap);
        fields.secondOfMinute = convertField(fields.secondOfMinute, hashmap);
        fields.secondOfDay = convertField(fields.secondOfDay, hashmap);
        fields.minuteOfHour = convertField(fields.minuteOfHour, hashmap);
        fields.minuteOfDay = convertField(fields.minuteOfDay, hashmap);
        fields.hourOfDay = convertField(fields.hourOfDay, hashmap);
        fields.hourOfHalfday = convertField(fields.hourOfHalfday, hashmap);
        fields.clockhourOfDay = convertField(fields.clockhourOfDay, hashmap);
        fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, hashmap);
        fields.halfdayOfDay = convertField(fields.halfdayOfDay, hashmap);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ZonedChronology))
            {
                return false;
            }
            obj = (ZonedChronology)obj;
            if (!getBase().equals(((ZonedChronology) (obj)).getBase()) || !getZone().equals(((ZonedChronology) (obj)).getZone()))
            {
                return false;
            }
        }
        return true;
    }

    public long getDateTimeMillis(int i, int j, int k, int l)
        throws IllegalArgumentException
    {
        return localToUTC(getBase().getDateTimeMillis(i, j, k, l));
    }

    public long getDateTimeMillis(int i, int j, int k, int l, int i1, int j1, int k1)
        throws IllegalArgumentException
    {
        return localToUTC(getBase().getDateTimeMillis(i, j, k, l, i1, j1, k1));
    }

    public long getDateTimeMillis(long l, int i, int j, int k, int i1)
        throws IllegalArgumentException
    {
        return localToUTC(getBase().getDateTimeMillis((long)getZone().getOffset(l) + l, i, j, k, i1));
    }

    public DateTimeZone getZone()
    {
        return (DateTimeZone)getParam();
    }

    public int hashCode()
    {
        return 0x4fba5 + getZone().hashCode() * 11 + getBase().hashCode() * 7;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ZonedChronology[").append(getBase()).append(", ").append(getZone().getID()).append(']').toString();
    }

    public Chronology withUTC()
    {
        return getBase();
    }

    public Chronology withZone(DateTimeZone datetimezone)
    {
        DateTimeZone datetimezone1 = datetimezone;
        if (datetimezone == null)
        {
            datetimezone1 = DateTimeZone.getDefault();
        }
        if (datetimezone1 == getParam())
        {
            return this;
        }
        if (datetimezone1 == DateTimeZone.UTC)
        {
            return getBase();
        } else
        {
            return new ZonedChronology(getBase(), datetimezone1);
        }
    }
}
