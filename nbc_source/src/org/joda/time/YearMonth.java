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
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadablePartial, DateTimeFieldType, DateTimeUtils, LocalDate, 
//            DateTimeZone, Chronology, DurationFieldType, Interval, 
//            DateTimeField, ReadablePeriod

public final class YearMonth extends BasePartial
    implements Serializable, ReadablePartial
{
    public static class Property extends AbstractPartialFieldProperty
        implements Serializable
    {

        private static final long serialVersionUID = 0x4f7cffbcbc856febL;
        private final YearMonth iBase;
        private final int iFieldIndex;

        public YearMonth addToCopy(int i)
        {
            int ai[] = iBase.getValues();
            ai = getField().add(iBase, iFieldIndex, ai, i);
            return new YearMonth(iBase, ai);
        }

        public YearMonth addWrapFieldToCopy(int i)
        {
            int ai[] = iBase.getValues();
            ai = getField().addWrapField(iBase, iFieldIndex, ai, i);
            return new YearMonth(iBase, ai);
        }

        public int get()
        {
            return iBase.getValue(iFieldIndex);
        }

        public DateTimeField getField()
        {
            return iBase.getField(iFieldIndex);
        }

        protected ReadablePartial getReadablePartial()
        {
            return iBase;
        }

        public YearMonth getYearMonth()
        {
            return iBase;
        }

        public YearMonth setCopy(int i)
        {
            int ai[] = iBase.getValues();
            ai = getField().set(iBase, iFieldIndex, ai, i);
            return new YearMonth(iBase, ai);
        }

        public YearMonth setCopy(String s)
        {
            return setCopy(s, null);
        }

        public YearMonth setCopy(String s, Locale locale)
        {
            int ai[] = iBase.getValues();
            s = getField().set(iBase, iFieldIndex, ai, s, locale);
            return new YearMonth(iBase, s);
        }

        Property(YearMonth yearmonth, int i)
        {
            iBase = yearmonth;
            iFieldIndex = i;
        }
    }


    private static final DateTimeFieldType FIELD_TYPES[] = {
        DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()
    };
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 0x2d55cdd7a1c33L;

    public YearMonth()
    {
    }

    public YearMonth(int i, int j)
    {
        this(i, j, null);
    }

    public YearMonth(int i, int j, Chronology chronology)
    {
        super(new int[] {
            i, j
        }, chronology);
    }

    public YearMonth(long l)
    {
        super(l);
    }

    public YearMonth(long l, Chronology chronology)
    {
        super(l, chronology);
    }

    public YearMonth(Object obj)
    {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public YearMonth(Object obj, Chronology chronology)
    {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public YearMonth(Chronology chronology)
    {
        super(chronology);
    }

    public YearMonth(DateTimeZone datetimezone)
    {
        super(ISOChronology.getInstance(datetimezone));
    }

    YearMonth(YearMonth yearmonth, Chronology chronology)
    {
        super(yearmonth, chronology);
    }

    YearMonth(YearMonth yearmonth, int ai[])
    {
        super(yearmonth, ai);
    }

    public static YearMonth fromCalendarFields(Calendar calendar)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The calendar must not be null");
        } else
        {
            return new YearMonth(calendar.get(1), calendar.get(2) + 1);
        }
    }

    public static YearMonth fromDateFields(Date date)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
        }
    }

    public static YearMonth now()
    {
        return new YearMonth();
    }

    public static YearMonth now(Chronology chronology)
    {
        if (chronology == null)
        {
            throw new NullPointerException("Chronology must not be null");
        } else
        {
            return new YearMonth(chronology);
        }
    }

    public static YearMonth now(DateTimeZone datetimezone)
    {
        if (datetimezone == null)
        {
            throw new NullPointerException("Zone must not be null");
        } else
        {
            return new YearMonth(datetimezone);
        }
    }

    public static YearMonth parse(String s)
    {
        return parse(s, ISODateTimeFormat.localDateParser());
    }

    public static YearMonth parse(String s, DateTimeFormatter datetimeformatter)
    {
        s = datetimeformatter.parseLocalDate(s);
        return new YearMonth(s.getYear(), s.getMonthOfYear());
    }

    private Object readResolve()
    {
        YearMonth yearmonth = this;
        if (!DateTimeZone.UTC.equals(getChronology().getZone()))
        {
            yearmonth = new YearMonth(this, getChronology().withUTC());
        }
        return yearmonth;
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

    public YearMonth minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public YearMonth minusMonths(int i)
    {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i));
    }

    public YearMonth minusYears(int i)
    {
        return withFieldAdded(DurationFieldType.years(), FieldUtils.safeNegate(i));
    }

    public Property monthOfYear()
    {
        return new Property(this, 1);
    }

    public YearMonth plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public YearMonth plusMonths(int i)
    {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public YearMonth plusYears(int i)
    {
        return withFieldAdded(DurationFieldType.years(), i);
    }

    public Property property(DateTimeFieldType datetimefieldtype)
    {
        return new Property(this, indexOfSupported(datetimefieldtype));
    }

    public int size()
    {
        return 2;
    }

    public Interval toInterval()
    {
        return toInterval(null);
    }

    public Interval toInterval(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        return new Interval(toLocalDate(1).toDateTimeAtStartOfDay(datetimezone), plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(datetimezone));
    }

    public LocalDate toLocalDate(int i)
    {
        return new LocalDate(getYear(), getMonthOfYear(), i, getChronology());
    }

    public String toString()
    {
        return ISODateTimeFormat.yearMonth().print(this);
    }

    public String toString(String s)
    {
        if (s == null)
        {
            return toString();
        } else
        {
            return DateTimeFormat.forPattern(s).print(this);
        }
    }

    public String toString(String s, Locale locale)
        throws IllegalArgumentException
    {
        if (s == null)
        {
            return toString();
        } else
        {
            return DateTimeFormat.forPattern(s).withLocale(locale).print(this);
        }
    }

    public YearMonth withChronologyRetainFields(Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronology == getChronology())
        {
            return this;
        } else
        {
            YearMonth yearmonth = new YearMonth(this, chronology);
            chronology.validate(yearmonth, getValues());
            return yearmonth;
        }
    }

    public YearMonth withField(DateTimeFieldType datetimefieldtype, int i)
    {
        int j = indexOfSupported(datetimefieldtype);
        if (i == getValue(j))
        {
            return this;
        } else
        {
            datetimefieldtype = getValues();
            return new YearMonth(this, getField(j).set(this, j, datetimefieldtype, i));
        }
    }

    public YearMonth withFieldAdded(DurationFieldType durationfieldtype, int i)
    {
        int j = indexOfSupported(durationfieldtype);
        if (i == 0)
        {
            return this;
        } else
        {
            durationfieldtype = getValues();
            return new YearMonth(this, getField(j).add(this, j, durationfieldtype, i));
        }
    }

    public YearMonth withMonthOfYear(int i)
    {
        int ai[] = getValues();
        return new YearMonth(this, getChronology().monthOfYear().set(this, 1, ai, i));
    }

    public YearMonth withPeriodAdded(ReadablePeriod readableperiod, int i)
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

        return new YearMonth(this, ai);
    }

    public YearMonth withYear(int i)
    {
        int ai[] = getValues();
        return new YearMonth(this, getChronology().year().set(this, 0, ai, i));
    }

    public Property year()
    {
        return new Property(this, 0);
    }

}
