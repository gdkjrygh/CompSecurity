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
//            DurationFieldType, DateMidnight, DateTime, LocalDate, 
//            DateTimeField, ReadablePeriod, DateTimeZone, TimeOfDay, 
//            Interval

public final class YearMonthDay extends BasePartial
    implements Serializable, ReadablePartial
{
    public static class Property extends AbstractPartialFieldProperty
        implements Serializable
    {

        private static final long serialVersionUID = 0x4f7cffbcbc856febL;
        private final int iFieldIndex;
        private final YearMonthDay iYearMonthDay;

        public YearMonthDay addToCopy(int i)
        {
            int ai[] = iYearMonthDay.getValues();
            ai = getField().add(iYearMonthDay, iFieldIndex, ai, i);
            return new YearMonthDay(iYearMonthDay, ai);
        }

        public YearMonthDay addWrapFieldToCopy(int i)
        {
            int ai[] = iYearMonthDay.getValues();
            ai = getField().addWrapField(iYearMonthDay, iFieldIndex, ai, i);
            return new YearMonthDay(iYearMonthDay, ai);
        }

        public int get()
        {
            return iYearMonthDay.getValue(iFieldIndex);
        }

        public DateTimeField getField()
        {
            return iYearMonthDay.getField(iFieldIndex);
        }

        protected ReadablePartial getReadablePartial()
        {
            return iYearMonthDay;
        }

        public YearMonthDay getYearMonthDay()
        {
            return iYearMonthDay;
        }

        public YearMonthDay setCopy(int i)
        {
            int ai[] = iYearMonthDay.getValues();
            ai = getField().set(iYearMonthDay, iFieldIndex, ai, i);
            return new YearMonthDay(iYearMonthDay, ai);
        }

        public YearMonthDay setCopy(String s)
        {
            return setCopy(s, null);
        }

        public YearMonthDay setCopy(String s, Locale locale)
        {
            int ai[] = iYearMonthDay.getValues();
            s = getField().set(iYearMonthDay, iFieldIndex, ai, s, locale);
            return new YearMonthDay(iYearMonthDay, s);
        }

        public YearMonthDay withMaximumValue()
        {
            return setCopy(getMaximumValue());
        }

        public YearMonthDay withMinimumValue()
        {
            return setCopy(getMinimumValue());
        }

        Property(YearMonthDay yearmonthday, int i)
        {
            iYearMonthDay = yearmonthday;
            iFieldIndex = i;
        }
    }


    public static final int DAY_OF_MONTH = 2;
    private static final DateTimeFieldType FIELD_TYPES[] = {
        DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()
    };
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 0x2d55cdd7a1c33L;

    public YearMonthDay()
    {
    }

    public YearMonthDay(int i, int j, int k)
    {
        this(i, j, k, null);
    }

    public YearMonthDay(int i, int j, int k, Chronology chronology)
    {
        super(new int[] {
            i, j, k
        }, chronology);
    }

    public YearMonthDay(long l)
    {
        super(l);
    }

    public YearMonthDay(long l, Chronology chronology)
    {
        super(l, chronology);
    }

    public YearMonthDay(Object obj)
    {
        super(obj, null, ISODateTimeFormat.dateOptionalTimeParser());
    }

    public YearMonthDay(Object obj, Chronology chronology)
    {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.dateOptionalTimeParser());
    }

    public YearMonthDay(Chronology chronology)
    {
        super(chronology);
    }

    public YearMonthDay(DateTimeZone datetimezone)
    {
        super(ISOChronology.getInstance(datetimezone));
    }

    YearMonthDay(YearMonthDay yearmonthday, Chronology chronology)
    {
        super(yearmonthday, chronology);
    }

    YearMonthDay(YearMonthDay yearmonthday, int ai[])
    {
        super(yearmonthday, ai);
    }

    public static YearMonthDay fromCalendarFields(Calendar calendar)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The calendar must not be null");
        } else
        {
            return new YearMonthDay(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
        }
    }

    public static YearMonthDay fromDateFields(Date date)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            return new YearMonthDay(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
    }

    public Property dayOfMonth()
    {
        return new Property(this, 2);
    }

    public int getDayOfMonth()
    {
        return getValue(2);
    }

    protected DateTimeField getField(int i, Chronology chronology)
    {
        switch (i)
        {
        default:
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid index: ").append(i).toString());

        case 0: // '\0'
            return chronology.year();

        case 1: // '\001'
            return chronology.monthOfYear();

        case 2: // '\002'
            return chronology.dayOfMonth();
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

    public int getMonthOfYear()
    {
        return getValue(1);
    }

    public int getYear()
    {
        return getValue(0);
    }

    public YearMonthDay minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public YearMonthDay minusDays(int i)
    {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i));
    }

    public YearMonthDay minusMonths(int i)
    {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i));
    }

    public YearMonthDay minusYears(int i)
    {
        return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i));
    }

    public Property monthOfYear()
    {
        return new Property(this, 1);
    }

    public YearMonthDay plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public YearMonthDay plusDays(int i)
    {
        return withFieldAdded(DurationFieldType.days(), i);
    }

    public YearMonthDay plusMonths(int i)
    {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public YearMonthDay plusYears(int i)
    {
        return withFieldAdded(DurationFieldType.years(), i);
    }

    public Property property(DateTimeFieldType datetimefieldtype)
    {
        return new Property(this, indexOfSupported(datetimefieldtype));
    }

    public int size()
    {
        return 3;
    }

    public DateMidnight toDateMidnight()
    {
        return toDateMidnight(null);
    }

    public DateMidnight toDateMidnight(DateTimeZone datetimezone)
    {
        datetimezone = getChronology().withZone(datetimezone);
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), datetimezone);
    }

    public DateTime toDateTime(TimeOfDay timeofday)
    {
        return toDateTime(timeofday, null);
    }

    public DateTime toDateTime(TimeOfDay timeofday, DateTimeZone datetimezone)
    {
        datetimezone = getChronology().withZone(datetimezone);
        long l1 = datetimezone.set(this, DateTimeUtils.currentTimeMillis());
        long l = l1;
        if (timeofday != null)
        {
            l = datetimezone.set(timeofday, l1);
        }
        return new DateTime(l, datetimezone);
    }

    public DateTime toDateTimeAtCurrentTime()
    {
        return toDateTimeAtCurrentTime(null);
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone datetimezone)
    {
        datetimezone = getChronology().withZone(datetimezone);
        return new DateTime(datetimezone.set(this, DateTimeUtils.currentTimeMillis()), datetimezone);
    }

    public DateTime toDateTimeAtMidnight()
    {
        return toDateTimeAtMidnight(null);
    }

    public DateTime toDateTimeAtMidnight(DateTimeZone datetimezone)
    {
        datetimezone = getChronology().withZone(datetimezone);
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, datetimezone);
    }

    public Interval toInterval()
    {
        return toInterval(null);
    }

    public Interval toInterval(DateTimeZone datetimezone)
    {
        return toDateMidnight(DateTimeUtils.getZone(datetimezone)).toInterval();
    }

    public LocalDate toLocalDate()
    {
        return new LocalDate(getYear(), getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    public String toString()
    {
        return ISODateTimeFormat.yearMonthDay().print(this);
    }

    public YearMonthDay withChronologyRetainFields(Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronology == getChronology())
        {
            return this;
        } else
        {
            YearMonthDay yearmonthday = new YearMonthDay(this, chronology);
            chronology.validate(yearmonthday, getValues());
            return yearmonthday;
        }
    }

    public YearMonthDay withDayOfMonth(int i)
    {
        int ai[] = getValues();
        return new YearMonthDay(this, getChronology().dayOfMonth().set(this, 2, ai, i));
    }

    public YearMonthDay withField(DateTimeFieldType datetimefieldtype, int i)
    {
        int j = indexOfSupported(datetimefieldtype);
        if (i == getValue(j))
        {
            return this;
        } else
        {
            datetimefieldtype = getValues();
            return new YearMonthDay(this, getField(j).set(this, j, datetimefieldtype, i));
        }
    }

    public YearMonthDay withFieldAdded(DurationFieldType durationfieldtype, int i)
    {
        int j = indexOfSupported(durationfieldtype);
        if (i == 0)
        {
            return this;
        } else
        {
            durationfieldtype = getValues();
            return new YearMonthDay(this, getField(j).add(this, j, durationfieldtype, i));
        }
    }

    public YearMonthDay withMonthOfYear(int i)
    {
        int ai[] = getValues();
        return new YearMonthDay(this, getChronology().monthOfYear().set(this, 1, ai, i));
    }

    public YearMonthDay withPeriodAdded(ReadablePeriod readableperiod, int i)
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
                ai1 = getField(k).add(this, k, ai, FieldUtils.safeMultiply(readableperiod.getValue(j), i));
            }
            j++;
            ai = ai1;
        }

        return new YearMonthDay(this, ai);
    }

    public YearMonthDay withYear(int i)
    {
        int ai[] = getValues();
        return new YearMonthDay(this, getChronology().year().set(this, 0, ai, i));
    }

    public Property year()
    {
        return new Property(this, 0);
    }

}
