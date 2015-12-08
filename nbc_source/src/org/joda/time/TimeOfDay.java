// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadablePartial, DateTimeFieldType, DateTimeUtils, Chronology, 
//            DurationFieldType, DateTime, LocalTime, DateTimeField, 
//            ReadablePeriod, DateTimeZone

public final class TimeOfDay extends BasePartial
    implements Serializable, ReadablePartial
{
    public static class Property extends AbstractPartialFieldProperty
        implements Serializable
    {

        private static final long serialVersionUID = 0x4db1b8ed7103ae99L;
        private final int iFieldIndex;
        private final TimeOfDay iTimeOfDay;

        public TimeOfDay addNoWrapToCopy(int i)
        {
            int ai[] = iTimeOfDay.getValues();
            ai = getField().add(iTimeOfDay, iFieldIndex, ai, i);
            return new TimeOfDay(iTimeOfDay, ai);
        }

        public TimeOfDay addToCopy(int i)
        {
            int ai[] = iTimeOfDay.getValues();
            ai = getField().addWrapPartial(iTimeOfDay, iFieldIndex, ai, i);
            return new TimeOfDay(iTimeOfDay, ai);
        }

        public TimeOfDay addWrapFieldToCopy(int i)
        {
            int ai[] = iTimeOfDay.getValues();
            ai = getField().addWrapField(iTimeOfDay, iFieldIndex, ai, i);
            return new TimeOfDay(iTimeOfDay, ai);
        }

        public int get()
        {
            return iTimeOfDay.getValue(iFieldIndex);
        }

        public DateTimeField getField()
        {
            return iTimeOfDay.getField(iFieldIndex);
        }

        protected ReadablePartial getReadablePartial()
        {
            return iTimeOfDay;
        }

        public TimeOfDay getTimeOfDay()
        {
            return iTimeOfDay;
        }

        public TimeOfDay setCopy(int i)
        {
            int ai[] = iTimeOfDay.getValues();
            ai = getField().set(iTimeOfDay, iFieldIndex, ai, i);
            return new TimeOfDay(iTimeOfDay, ai);
        }

        public TimeOfDay setCopy(String s)
        {
            return setCopy(s, null);
        }

        public TimeOfDay setCopy(String s, Locale locale)
        {
            int ai[] = iTimeOfDay.getValues();
            s = getField().set(iTimeOfDay, iFieldIndex, ai, s, locale);
            return new TimeOfDay(iTimeOfDay, s);
        }

        public TimeOfDay withMaximumValue()
        {
            return setCopy(getMaximumValue());
        }

        public TimeOfDay withMinimumValue()
        {
            return setCopy(getMinimumValue());
        }

        Property(TimeOfDay timeofday, int i)
        {
            iTimeOfDay = timeofday;
            iFieldIndex = i;
        }
    }


    private static final DateTimeFieldType FIELD_TYPES[] = {
        DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()
    };
    public static final int HOUR_OF_DAY = 0;
    public static final TimeOfDay MIDNIGHT = new TimeOfDay(0, 0, 0, 0);
    public static final int MILLIS_OF_SECOND = 3;
    public static final int MINUTE_OF_HOUR = 1;
    public static final int SECOND_OF_MINUTE = 2;
    private static final long serialVersionUID = 0x326c43ac185ccd84L;

    public TimeOfDay()
    {
    }

    public TimeOfDay(int i, int j)
    {
        this(i, j, 0, 0, null);
    }

    public TimeOfDay(int i, int j, int k)
    {
        this(i, j, k, 0, null);
    }

    public TimeOfDay(int i, int j, int k, int l)
    {
        this(i, j, k, l, null);
    }

    public TimeOfDay(int i, int j, int k, int l, Chronology chronology)
    {
        super(new int[] {
            i, j, k, l
        }, chronology);
    }

    public TimeOfDay(int i, int j, int k, Chronology chronology)
    {
        this(i, j, k, 0, chronology);
    }

    public TimeOfDay(int i, int j, Chronology chronology)
    {
        this(i, j, 0, 0, chronology);
    }

    public TimeOfDay(long l)
    {
        super(l);
    }

    public TimeOfDay(long l, Chronology chronology)
    {
        super(l, chronology);
    }

    public TimeOfDay(Object obj)
    {
        super(obj, null, ISODateTimeFormat.timeParser());
    }

    public TimeOfDay(Object obj, Chronology chronology)
    {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.timeParser());
    }

    public TimeOfDay(Chronology chronology)
    {
        super(chronology);
    }

    public TimeOfDay(DateTimeZone datetimezone)
    {
        super(ISOChronology.getInstance(datetimezone));
    }

    TimeOfDay(TimeOfDay timeofday, Chronology chronology)
    {
        super(timeofday, chronology);
    }

    TimeOfDay(TimeOfDay timeofday, int ai[])
    {
        super(timeofday, ai);
    }

    public static TimeOfDay fromCalendarFields(Calendar calendar)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The calendar must not be null");
        } else
        {
            return new TimeOfDay(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
    }

    public static TimeOfDay fromDateFields(Date date)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            return new TimeOfDay(date.getHours(), date.getMinutes(), date.getSeconds(), ((int)(date.getTime() % 1000L) + 1000) % 1000);
        }
    }

    public static TimeOfDay fromMillisOfDay(long l)
    {
        return fromMillisOfDay(l, null);
    }

    public static TimeOfDay fromMillisOfDay(long l, Chronology chronology)
    {
        return new TimeOfDay(l, DateTimeUtils.getChronology(chronology).withUTC());
    }

    protected DateTimeField getField(int i, Chronology chronology)
    {
        switch (i)
        {
        default:
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid index: ").append(i).toString());

        case 0: // '\0'
            return chronology.hourOfDay();

        case 1: // '\001'
            return chronology.minuteOfHour();

        case 2: // '\002'
            return chronology.secondOfMinute();

        case 3: // '\003'
            return chronology.millisOfSecond();
        }
    }

    public DateTimeFieldType getFieldType(int i)
    {
        return FIELD_TYPES[i];
    }

    public DateTimeFieldType[] getFieldTypes()
    {
        return (DateTimeFieldType[])(DateTimeFieldType[])FIELD_TYPES.clone();
    }

    public int getHourOfDay()
    {
        return getValue(0);
    }

    public int getMillisOfSecond()
    {
        return getValue(3);
    }

    public int getMinuteOfHour()
    {
        return getValue(1);
    }

    public int getSecondOfMinute()
    {
        return getValue(2);
    }

    public Property hourOfDay()
    {
        return new Property(this, 0);
    }

    public Property millisOfSecond()
    {
        return new Property(this, 3);
    }

    public TimeOfDay minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public TimeOfDay minusHours(int i)
    {
        return withFieldAdded(DurationFieldType.hours(), FieldUtils.safeNegate(i));
    }

    public TimeOfDay minusMillis(int i)
    {
        return withFieldAdded(DurationFieldType.millis(), FieldUtils.safeNegate(i));
    }

    public TimeOfDay minusMinutes(int i)
    {
        return withFieldAdded(DurationFieldType.minutes(), FieldUtils.safeNegate(i));
    }

    public TimeOfDay minusSeconds(int i)
    {
        return withFieldAdded(DurationFieldType.seconds(), FieldUtils.safeNegate(i));
    }

    public Property minuteOfHour()
    {
        return new Property(this, 1);
    }

    public TimeOfDay plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public TimeOfDay plusHours(int i)
    {
        return withFieldAdded(DurationFieldType.hours(), i);
    }

    public TimeOfDay plusMillis(int i)
    {
        return withFieldAdded(DurationFieldType.millis(), i);
    }

    public TimeOfDay plusMinutes(int i)
    {
        return withFieldAdded(DurationFieldType.minutes(), i);
    }

    public TimeOfDay plusSeconds(int i)
    {
        return withFieldAdded(DurationFieldType.seconds(), i);
    }

    public Property property(DateTimeFieldType datetimefieldtype)
    {
        return new Property(this, indexOfSupported(datetimefieldtype));
    }

    public Property secondOfMinute()
    {
        return new Property(this, 2);
    }

    public int size()
    {
        return 4;
    }

    public DateTime toDateTimeToday()
    {
        return toDateTimeToday(null);
    }

    public DateTime toDateTimeToday(DateTimeZone datetimezone)
    {
        datetimezone = getChronology().withZone(datetimezone);
        return new DateTime(datetimezone.set(this, DateTimeUtils.currentTimeMillis()), datetimezone);
    }

    public LocalTime toLocalTime()
    {
        return new LocalTime(getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), getChronology());
    }

    public String toString()
    {
        return ISODateTimeFormat.tTime().print(this);
    }

    public TimeOfDay withChronologyRetainFields(Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronology == getChronology())
        {
            return this;
        } else
        {
            TimeOfDay timeofday = new TimeOfDay(this, chronology);
            chronology.validate(timeofday, getValues());
            return timeofday;
        }
    }

    public TimeOfDay withField(DateTimeFieldType datetimefieldtype, int i)
    {
        int j = indexOfSupported(datetimefieldtype);
        if (i == getValue(j))
        {
            return this;
        } else
        {
            datetimefieldtype = getValues();
            return new TimeOfDay(this, getField(j).set(this, j, datetimefieldtype, i));
        }
    }

    public TimeOfDay withFieldAdded(DurationFieldType durationfieldtype, int i)
    {
        int j = indexOfSupported(durationfieldtype);
        if (i == 0)
        {
            return this;
        } else
        {
            durationfieldtype = getValues();
            return new TimeOfDay(this, getField(j).addWrapPartial(this, j, durationfieldtype, i));
        }
    }

    public TimeOfDay withHourOfDay(int i)
    {
        int ai[] = getValues();
        return new TimeOfDay(this, getChronology().hourOfDay().set(this, 0, ai, i));
    }

    public TimeOfDay withMillisOfSecond(int i)
    {
        int ai[] = getValues();
        return new TimeOfDay(this, getChronology().millisOfSecond().set(this, 3, ai, i));
    }

    public TimeOfDay withMinuteOfHour(int i)
    {
        int ai[] = getValues();
        return new TimeOfDay(this, getChronology().minuteOfHour().set(this, 1, ai, i));
    }

    public TimeOfDay withPeriodAdded(ReadablePeriod readableperiod, int i)
    {
        if (readableperiod == null || i == 0)
        {
            return this;
        }
        int ai[] = getValues();
        for (int j = 0; j < readableperiod.size();)
        {
            int k = indexOf(readableperiod.getFieldType(j));
            int ai1[] = ai;
            if (k >= 0)
            {
                ai1 = getField(k).addWrapPartial(this, k, ai, FieldUtils.safeMultiply(readableperiod.getValue(j), i));
            }
            j++;
            ai = ai1;
        }

        return new TimeOfDay(this, ai);
    }

    public TimeOfDay withSecondOfMinute(int i)
    {
        int ai[] = getValues();
        return new TimeOfDay(this, getChronology().secondOfMinute().set(this, 2, ai, i));
    }

}
