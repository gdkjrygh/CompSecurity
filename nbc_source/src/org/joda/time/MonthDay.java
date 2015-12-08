// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadablePartial, DateTimeFieldType, DateTimeUtils, LocalDate, 
//            DateTimeZone, Chronology, DurationFieldType, DateTimeField, 
//            ReadablePeriod

public final class MonthDay extends BasePartial
    implements Serializable, ReadablePartial
{
    public static class Property extends AbstractPartialFieldProperty
        implements Serializable
    {

        private static final long serialVersionUID = 0x4f7cffbcbc856febL;
        private final MonthDay iBase;
        private final int iFieldIndex;

        public MonthDay addToCopy(int i)
        {
            int ai[] = iBase.getValues();
            ai = getField().add(iBase, iFieldIndex, ai, i);
            return new MonthDay(iBase, ai);
        }

        public MonthDay addWrapFieldToCopy(int i)
        {
            int ai[] = iBase.getValues();
            ai = getField().addWrapField(iBase, iFieldIndex, ai, i);
            return new MonthDay(iBase, ai);
        }

        public int get()
        {
            return iBase.getValue(iFieldIndex);
        }

        public DateTimeField getField()
        {
            return iBase.getField(iFieldIndex);
        }

        public MonthDay getMonthDay()
        {
            return iBase;
        }

        protected ReadablePartial getReadablePartial()
        {
            return iBase;
        }

        public MonthDay setCopy(int i)
        {
            int ai[] = iBase.getValues();
            ai = getField().set(iBase, iFieldIndex, ai, i);
            return new MonthDay(iBase, ai);
        }

        public MonthDay setCopy(String s)
        {
            return setCopy(s, null);
        }

        public MonthDay setCopy(String s, Locale locale)
        {
            int ai[] = iBase.getValues();
            s = getField().set(iBase, iFieldIndex, ai, s, locale);
            return new MonthDay(iBase, s);
        }

        Property(MonthDay monthday, int i)
        {
            iBase = monthday;
            iFieldIndex = i;
        }
    }


    public static final int DAY_OF_MONTH = 1;
    private static final DateTimeFieldType FIELD_TYPES[] = {
        DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()
    };
    public static final int MONTH_OF_YEAR = 0;
    private static final DateTimeFormatter PARSER = (new DateTimeFormatterBuilder()).appendOptional(ISODateTimeFormat.localDateParser().getParser()).appendOptional(DateTimeFormat.forPattern("--MM-dd").getParser()).toFormatter();
    private static final long serialVersionUID = 0x2900b54d463b2031L;

    public MonthDay()
    {
    }

    public MonthDay(int i, int j)
    {
        this(i, j, null);
    }

    public MonthDay(int i, int j, Chronology chronology)
    {
        super(new int[] {
            i, j
        }, chronology);
    }

    public MonthDay(long l)
    {
        super(l);
    }

    public MonthDay(long l, Chronology chronology)
    {
        super(l, chronology);
    }

    public MonthDay(Object obj)
    {
        super(obj, null, ISODateTimeFormat.localDateParser());
    }

    public MonthDay(Object obj, Chronology chronology)
    {
        super(obj, DateTimeUtils.getChronology(chronology), ISODateTimeFormat.localDateParser());
    }

    public MonthDay(Chronology chronology)
    {
        super(chronology);
    }

    public MonthDay(DateTimeZone datetimezone)
    {
        super(ISOChronology.getInstance(datetimezone));
    }

    MonthDay(MonthDay monthday, Chronology chronology)
    {
        super(monthday, chronology);
    }

    MonthDay(MonthDay monthday, int ai[])
    {
        super(monthday, ai);
    }

    public static MonthDay fromCalendarFields(Calendar calendar)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The calendar must not be null");
        } else
        {
            return new MonthDay(calendar.get(2) + 1, calendar.get(5));
        }
    }

    public static MonthDay fromDateFields(Date date)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            return new MonthDay(date.getMonth() + 1, date.getDate());
        }
    }

    public static MonthDay now()
    {
        return new MonthDay();
    }

    public static MonthDay now(Chronology chronology)
    {
        if (chronology == null)
        {
            throw new NullPointerException("Chronology must not be null");
        } else
        {
            return new MonthDay(chronology);
        }
    }

    public static MonthDay now(DateTimeZone datetimezone)
    {
        if (datetimezone == null)
        {
            throw new NullPointerException("Zone must not be null");
        } else
        {
            return new MonthDay(datetimezone);
        }
    }

    public static MonthDay parse(String s)
    {
        return parse(s, PARSER);
    }

    public static MonthDay parse(String s, DateTimeFormatter datetimeformatter)
    {
        s = datetimeformatter.parseLocalDate(s);
        return new MonthDay(s.getMonthOfYear(), s.getDayOfMonth());
    }

    private Object readResolve()
    {
        MonthDay monthday = this;
        if (!DateTimeZone.UTC.equals(getChronology().getZone()))
        {
            monthday = new MonthDay(this, getChronology().withUTC());
        }
        return monthday;
    }

    public Property dayOfMonth()
    {
        return new Property(this, 1);
    }

    public int getDayOfMonth()
    {
        return getValue(1);
    }

    protected DateTimeField getField(int i, Chronology chronology)
    {
        switch (i)
        {
        default:
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid index: ").append(i).toString());

        case 0: // '\0'
            return chronology.monthOfYear();

        case 1: // '\001'
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
        return getValue(0);
    }

    public MonthDay minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public MonthDay minusDays(int i)
    {
        return withFieldAdded(DurationFieldType.days(), FieldUtils.safeNegate(i));
    }

    public MonthDay minusMonths(int i)
    {
        return withFieldAdded(DurationFieldType.months(), FieldUtils.safeNegate(i));
    }

    public Property monthOfYear()
    {
        return new Property(this, 0);
    }

    public MonthDay plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public MonthDay plusDays(int i)
    {
        return withFieldAdded(DurationFieldType.days(), i);
    }

    public MonthDay plusMonths(int i)
    {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public Property property(DateTimeFieldType datetimefieldtype)
    {
        return new Property(this, indexOfSupported(datetimefieldtype));
    }

    public int size()
    {
        return 2;
    }

    public LocalDate toLocalDate(int i)
    {
        return new LocalDate(i, getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    public String toString()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(DateTimeFieldType.monthOfYear());
        arraylist.add(DateTimeFieldType.dayOfMonth());
        return ISODateTimeFormat.forFields(arraylist, true, true).print(this);
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

    public MonthDay withChronologyRetainFields(Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronology == getChronology())
        {
            return this;
        } else
        {
            MonthDay monthday = new MonthDay(this, chronology);
            chronology.validate(monthday, getValues());
            return monthday;
        }
    }

    public MonthDay withDayOfMonth(int i)
    {
        int ai[] = getValues();
        return new MonthDay(this, getChronology().dayOfMonth().set(this, 1, ai, i));
    }

    public MonthDay withField(DateTimeFieldType datetimefieldtype, int i)
    {
        int j = indexOfSupported(datetimefieldtype);
        if (i == getValue(j))
        {
            return this;
        } else
        {
            datetimefieldtype = getValues();
            return new MonthDay(this, getField(j).set(this, j, datetimefieldtype, i));
        }
    }

    public MonthDay withFieldAdded(DurationFieldType durationfieldtype, int i)
    {
        int j = indexOfSupported(durationfieldtype);
        if (i == 0)
        {
            return this;
        } else
        {
            durationfieldtype = getValues();
            return new MonthDay(this, getField(j).add(this, j, durationfieldtype, i));
        }
    }

    public MonthDay withMonthOfYear(int i)
    {
        int ai[] = getValues();
        return new MonthDay(this, getChronology().monthOfYear().set(this, 0, ai, i));
    }

    public MonthDay withPeriodAdded(ReadablePeriod readableperiod, int i)
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

        return new MonthDay(this, ai);
    }

}
