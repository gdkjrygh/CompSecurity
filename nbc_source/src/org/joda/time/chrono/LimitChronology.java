// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableDateTime;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time.chrono:
//            AssembledChronology

public final class LimitChronology extends AssembledChronology
{
    private class LimitDateTimeField extends DecoratedDateTimeField
    {

        private static final long serialVersionUID = 0xde340d6a9a359190L;
        private final DurationField iDurationField;
        private final DurationField iLeapDurationField;
        private final DurationField iRangeDurationField;
        final LimitChronology this$0;

        public long add(long l, int i)
        {
            checkLimits(l, null);
            l = getWrappedField().add(l, i);
            checkLimits(l, "resulting");
            return l;
        }

        public long add(long l, long l1)
        {
            checkLimits(l, null);
            l = getWrappedField().add(l, l1);
            checkLimits(l, "resulting");
            return l;
        }

        public long addWrapField(long l, int i)
        {
            checkLimits(l, null);
            l = getWrappedField().addWrapField(l, i);
            checkLimits(l, "resulting");
            return l;
        }

        public int get(long l)
        {
            checkLimits(l, null);
            return getWrappedField().get(l);
        }

        public String getAsShortText(long l, Locale locale)
        {
            checkLimits(l, null);
            return getWrappedField().getAsShortText(l, locale);
        }

        public String getAsText(long l, Locale locale)
        {
            checkLimits(l, null);
            return getWrappedField().getAsText(l, locale);
        }

        public int getDifference(long l, long l1)
        {
            checkLimits(l, "minuend");
            checkLimits(l1, "subtrahend");
            return getWrappedField().getDifference(l, l1);
        }

        public long getDifferenceAsLong(long l, long l1)
        {
            checkLimits(l, "minuend");
            checkLimits(l1, "subtrahend");
            return getWrappedField().getDifferenceAsLong(l, l1);
        }

        public final DurationField getDurationField()
        {
            return iDurationField;
        }

        public int getLeapAmount(long l)
        {
            checkLimits(l, null);
            return getWrappedField().getLeapAmount(l);
        }

        public final DurationField getLeapDurationField()
        {
            return iLeapDurationField;
        }

        public int getMaximumShortTextLength(Locale locale)
        {
            return getWrappedField().getMaximumShortTextLength(locale);
        }

        public int getMaximumTextLength(Locale locale)
        {
            return getWrappedField().getMaximumTextLength(locale);
        }

        public int getMaximumValue(long l)
        {
            checkLimits(l, null);
            return getWrappedField().getMaximumValue(l);
        }

        public int getMinimumValue(long l)
        {
            checkLimits(l, null);
            return getWrappedField().getMinimumValue(l);
        }

        public final DurationField getRangeDurationField()
        {
            return iRangeDurationField;
        }

        public boolean isLeap(long l)
        {
            checkLimits(l, null);
            return getWrappedField().isLeap(l);
        }

        public long remainder(long l)
        {
            checkLimits(l, null);
            l = getWrappedField().remainder(l);
            checkLimits(l, "resulting");
            return l;
        }

        public long roundCeiling(long l)
        {
            checkLimits(l, null);
            l = getWrappedField().roundCeiling(l);
            checkLimits(l, "resulting");
            return l;
        }

        public long roundFloor(long l)
        {
            checkLimits(l, null);
            l = getWrappedField().roundFloor(l);
            checkLimits(l, "resulting");
            return l;
        }

        public long roundHalfCeiling(long l)
        {
            checkLimits(l, null);
            l = getWrappedField().roundHalfCeiling(l);
            checkLimits(l, "resulting");
            return l;
        }

        public long roundHalfEven(long l)
        {
            checkLimits(l, null);
            l = getWrappedField().roundHalfEven(l);
            checkLimits(l, "resulting");
            return l;
        }

        public long roundHalfFloor(long l)
        {
            checkLimits(l, null);
            l = getWrappedField().roundHalfFloor(l);
            checkLimits(l, "resulting");
            return l;
        }

        public long set(long l, int i)
        {
            checkLimits(l, null);
            l = getWrappedField().set(l, i);
            checkLimits(l, "resulting");
            return l;
        }

        public long set(long l, String s, Locale locale)
        {
            checkLimits(l, null);
            l = getWrappedField().set(l, s, locale);
            checkLimits(l, "resulting");
            return l;
        }

        LimitDateTimeField(DateTimeField datetimefield, DurationField durationfield, DurationField durationfield1, DurationField durationfield2)
        {
            this$0 = LimitChronology.this;
            super(datetimefield, datetimefield.getType());
            iDurationField = durationfield;
            iRangeDurationField = durationfield1;
            iLeapDurationField = durationfield2;
        }
    }

    private class LimitDurationField extends DecoratedDurationField
    {

        private static final long serialVersionUID = 0x6fb4d99c50a123ccL;
        final LimitChronology this$0;

        public long add(long l, int i)
        {
            checkLimits(l, null);
            l = getWrappedField().add(l, i);
            checkLimits(l, "resulting");
            return l;
        }

        public long add(long l, long l1)
        {
            checkLimits(l, null);
            l = getWrappedField().add(l, l1);
            checkLimits(l, "resulting");
            return l;
        }

        public int getDifference(long l, long l1)
        {
            checkLimits(l, "minuend");
            checkLimits(l1, "subtrahend");
            return getWrappedField().getDifference(l, l1);
        }

        public long getDifferenceAsLong(long l, long l1)
        {
            checkLimits(l, "minuend");
            checkLimits(l1, "subtrahend");
            return getWrappedField().getDifferenceAsLong(l, l1);
        }

        public long getMillis(int i, long l)
        {
            checkLimits(l, null);
            return getWrappedField().getMillis(i, l);
        }

        public long getMillis(long l, long l1)
        {
            checkLimits(l1, null);
            return getWrappedField().getMillis(l, l1);
        }

        public int getValue(long l, long l1)
        {
            checkLimits(l1, null);
            return getWrappedField().getValue(l, l1);
        }

        public long getValueAsLong(long l, long l1)
        {
            checkLimits(l1, null);
            return getWrappedField().getValueAsLong(l, l1);
        }

        LimitDurationField(DurationField durationfield)
        {
            this$0 = LimitChronology.this;
            super(durationfield, durationfield.getType());
        }
    }

    private class LimitException extends IllegalArgumentException
    {

        private static final long serialVersionUID = 0xadc745d6df8120abL;
        private final boolean iIsLow;
        final LimitChronology this$0;

        public String getMessage()
        {
            StringBuffer stringbuffer = new StringBuffer(85);
            stringbuffer.append("The");
            Object obj = super.getMessage();
            if (obj != null)
            {
                stringbuffer.append(' ');
                stringbuffer.append(((String) (obj)));
            }
            stringbuffer.append(" instant is ");
            obj = ISODateTimeFormat.dateTime().withChronology(getBase());
            if (iIsLow)
            {
                stringbuffer.append("below the supported minimum of ");
                ((DateTimeFormatter) (obj)).printTo(stringbuffer, getLowerLimit().getMillis());
            } else
            {
                stringbuffer.append("above the supported maximum of ");
                ((DateTimeFormatter) (obj)).printTo(stringbuffer, getUpperLimit().getMillis());
            }
            stringbuffer.append(" (");
            stringbuffer.append(getBase());
            stringbuffer.append(')');
            return stringbuffer.toString();
        }

        public String toString()
        {
            return (new StringBuilder()).append("IllegalArgumentException: ").append(getMessage()).toString();
        }

        LimitException(String s, boolean flag)
        {
            this$0 = LimitChronology.this;
            super(s);
            iIsLow = flag;
        }
    }


    private static final long serialVersionUID = 0x6a7464792af0f66aL;
    final DateTime iLowerLimit;
    final DateTime iUpperLimit;
    private transient LimitChronology iWithUTC;

    private LimitChronology(Chronology chronology, DateTime datetime, DateTime datetime1)
    {
        super(chronology, null);
        iLowerLimit = datetime;
        iUpperLimit = datetime1;
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
            LimitDateTimeField limitdatetimefield = new LimitDateTimeField(datetimefield, convertField(datetimefield.getDurationField(), hashmap), convertField(datetimefield.getRangeDurationField(), hashmap), convertField(datetimefield.getLeapDurationField(), hashmap));
            hashmap.put(datetimefield, limitdatetimefield);
            return limitdatetimefield;
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
            LimitDurationField limitdurationfield = new LimitDurationField(durationfield);
            hashmap.put(durationfield, limitdurationfield);
            return limitdurationfield;
        }
    }

    public static LimitChronology getInstance(Chronology chronology, ReadableDateTime readabledatetime, ReadableDateTime readabledatetime1)
    {
        Object obj = null;
        if (chronology == null)
        {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        if (readabledatetime == null)
        {
            readabledatetime = null;
        } else
        {
            readabledatetime = readabledatetime.toDateTime();
        }
        if (readabledatetime1 == null)
        {
            readabledatetime1 = obj;
        } else
        {
            readabledatetime1 = readabledatetime1.toDateTime();
        }
        if (readabledatetime != null && readabledatetime1 != null && !readabledatetime.isBefore(readabledatetime1))
        {
            throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
        } else
        {
            return new LimitChronology(chronology, (DateTime)readabledatetime, (DateTime)readabledatetime1);
        }
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

    void checkLimits(long l, String s)
    {
        DateTime datetime = iLowerLimit;
        if (datetime != null && l < datetime.getMillis())
        {
            throw new LimitException(s, true);
        }
        datetime = iUpperLimit;
        if (datetime != null && l >= datetime.getMillis())
        {
            throw new LimitException(s, false);
        } else
        {
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LimitChronology))
            {
                return false;
            }
            obj = (LimitChronology)obj;
            if (!getBase().equals(((LimitChronology) (obj)).getBase()) || !FieldUtils.equals(getLowerLimit(), ((LimitChronology) (obj)).getLowerLimit()) || !FieldUtils.equals(getUpperLimit(), ((LimitChronology) (obj)).getUpperLimit()))
            {
                return false;
            }
        }
        return true;
    }

    public long getDateTimeMillis(int i, int j, int k, int l)
        throws IllegalArgumentException
    {
        long l1 = getBase().getDateTimeMillis(i, j, k, l);
        checkLimits(l1, "resulting");
        return l1;
    }

    public long getDateTimeMillis(int i, int j, int k, int l, int i1, int j1, int k1)
        throws IllegalArgumentException
    {
        long l1 = getBase().getDateTimeMillis(i, j, k, l, i1, j1, k1);
        checkLimits(l1, "resulting");
        return l1;
    }

    public long getDateTimeMillis(long l, int i, int j, int k, int i1)
        throws IllegalArgumentException
    {
        checkLimits(l, null);
        l = getBase().getDateTimeMillis(l, i, j, k, i1);
        checkLimits(l, "resulting");
        return l;
    }

    public DateTime getLowerLimit()
    {
        return iLowerLimit;
    }

    public DateTime getUpperLimit()
    {
        return iUpperLimit;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (getLowerLimit() != null)
        {
            i = getLowerLimit().hashCode();
        } else
        {
            i = 0;
        }
        if (getUpperLimit() != null)
        {
            j = getUpperLimit().hashCode();
        }
        return i + 0x12ea67c5 + j + getBase().hashCode() * 7;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("LimitChronology[").append(getBase().toString()).append(", ");
        String s;
        if (getLowerLimit() == null)
        {
            s = "NoLimit";
        } else
        {
            s = getLowerLimit().toString();
        }
        stringbuilder = stringbuilder.append(s).append(", ");
        if (getUpperLimit() == null)
        {
            s = "NoLimit";
        } else
        {
            s = getUpperLimit().toString();
        }
        return stringbuilder.append(s).append(']').toString();
    }

    public Chronology withUTC()
    {
        return withZone(DateTimeZone.UTC);
    }

    public Chronology withZone(DateTimeZone datetimezone)
    {
        DateTimeZone datetimezone1 = datetimezone;
        if (datetimezone == null)
        {
            datetimezone1 = DateTimeZone.getDefault();
        }
        if (datetimezone1 == getZone())
        {
            return this;
        }
        if (datetimezone1 == DateTimeZone.UTC && iWithUTC != null)
        {
            return iWithUTC;
        }
        Object obj = iLowerLimit;
        datetimezone = ((DateTimeZone) (obj));
        if (obj != null)
        {
            datetimezone = ((DateTime) (obj)).toMutableDateTime();
            datetimezone.setZoneRetainFields(datetimezone1);
            datetimezone = datetimezone.toDateTime();
        }
        DateTime datetime = iUpperLimit;
        obj = datetime;
        if (datetime != null)
        {
            obj = datetime.toMutableDateTime();
            ((MutableDateTime) (obj)).setZoneRetainFields(datetimezone1);
            obj = ((MutableDateTime) (obj)).toDateTime();
        }
        datetimezone = getInstance(getBase().withZone(datetimezone1), datetimezone, ((ReadableDateTime) (obj)));
        if (datetimezone1 == DateTimeZone.UTC)
        {
            iWithUTC = datetimezone;
        }
        return datetimezone;
    }
}
