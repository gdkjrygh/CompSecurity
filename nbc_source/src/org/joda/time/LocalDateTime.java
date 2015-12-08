// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadablePartial, DateTimeUtils, Chronology, DateTimeZone, 
//            DateTimeFieldType, DateTimeField, DurationFieldType, DurationField, 
//            DateTime, LocalDate, LocalTime, ReadableDuration, 
//            ReadablePeriod

public final class LocalDateTime extends BaseLocal
    implements Serializable, ReadablePartial
{
    public static final class Property extends AbstractReadableInstantFieldProperty
    {

        private static final long serialVersionUID = 0xfffeba4652429fb0L;
        private transient DateTimeField iField;
        private transient LocalDateTime iInstant;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            iInstant = (LocalDateTime)objectinputstream.readObject();
            iField = ((DateTimeFieldType)objectinputstream.readObject()).getField(iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.writeObject(iInstant);
            objectoutputstream.writeObject(iField.getType());
        }

        public LocalDateTime addToCopy(int i)
        {
            return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), i));
        }

        public LocalDateTime addToCopy(long l)
        {
            return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), l));
        }

        public LocalDateTime addWrapFieldToCopy(int i)
        {
            return iInstant.withLocalMillis(iField.addWrapField(iInstant.getLocalMillis(), i));
        }

        protected Chronology getChronology()
        {
            return iInstant.getChronology();
        }

        public DateTimeField getField()
        {
            return iField;
        }

        public LocalDateTime getLocalDateTime()
        {
            return iInstant;
        }

        protected long getMillis()
        {
            return iInstant.getLocalMillis();
        }

        public LocalDateTime roundCeilingCopy()
        {
            return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
        }

        public LocalDateTime roundFloorCopy()
        {
            return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
        }

        public LocalDateTime roundHalfCeilingCopy()
        {
            return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
        }

        public LocalDateTime roundHalfEvenCopy()
        {
            return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
        }

        public LocalDateTime roundHalfFloorCopy()
        {
            return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
        }

        public LocalDateTime setCopy(int i)
        {
            return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), i));
        }

        public LocalDateTime setCopy(String s)
        {
            return setCopy(s, null);
        }

        public LocalDateTime setCopy(String s, Locale locale)
        {
            return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), s, locale));
        }

        public LocalDateTime withMaximumValue()
        {
            return setCopy(getMaximumValue());
        }

        public LocalDateTime withMinimumValue()
        {
            return setCopy(getMinimumValue());
        }

        Property(LocalDateTime localdatetime, DateTimeField datetimefield)
        {
            iInstant = localdatetime;
            iField = datetimefield;
        }
    }


    private static final int DAY_OF_MONTH = 2;
    private static final int MILLIS_OF_DAY = 3;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = 0xfc45536cf5a58710L;
    private final Chronology iChronology;
    private final long iLocalMillis;

    public LocalDateTime()
    {
        this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance())));
    }

    public LocalDateTime(int i, int j, int k, int l, int i1)
    {
        this(i, j, k, l, i1, 0, 0, ((Chronology) (ISOChronology.getInstanceUTC())));
    }

    public LocalDateTime(int i, int j, int k, int l, int i1, int j1)
    {
        this(i, j, k, l, i1, j1, 0, ((Chronology) (ISOChronology.getInstanceUTC())));
    }

    public LocalDateTime(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        this(i, j, k, l, i1, j1, k1, ((Chronology) (ISOChronology.getInstanceUTC())));
    }

    public LocalDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
            Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology).withUTC();
        long l1 = chronology.getDateTimeMillis(i, j, k, l, i1, j1, k1);
        iChronology = chronology;
        iLocalMillis = l1;
    }

    public LocalDateTime(long l)
    {
        this(l, ((Chronology) (ISOChronology.getInstance())));
    }

    public LocalDateTime(long l, Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology);
        iLocalMillis = chronology.getZone().getMillisKeepLocal(DateTimeZone.UTC, l);
        iChronology = chronology.withUTC();
    }

    public LocalDateTime(long l, DateTimeZone datetimezone)
    {
        this(l, ((Chronology) (ISOChronology.getInstance(datetimezone))));
    }

    public LocalDateTime(Object obj)
    {
        this(obj, (Chronology)null);
    }

    public LocalDateTime(Object obj, Chronology chronology)
    {
        PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
        chronology = DateTimeUtils.getChronology(partialconverter.getChronology(obj, chronology));
        iChronology = chronology.withUTC();
        obj = partialconverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localDateOptionalTimeParser());
        iLocalMillis = iChronology.getDateTimeMillis(obj[0], obj[1], obj[2], obj[3]);
    }

    public LocalDateTime(Object obj, DateTimeZone datetimezone)
    {
        PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
        datetimezone = DateTimeUtils.getChronology(partialconverter.getChronology(obj, datetimezone));
        iChronology = datetimezone.withUTC();
        obj = partialconverter.getPartialValues(this, obj, datetimezone, ISODateTimeFormat.localDateOptionalTimeParser());
        iLocalMillis = iChronology.getDateTimeMillis(obj[0], obj[1], obj[2], obj[3]);
    }

    public LocalDateTime(Chronology chronology)
    {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalDateTime(DateTimeZone datetimezone)
    {
        this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance(datetimezone))));
    }

    private Date correctDstTransition(Date date, TimeZone timezone)
    {
        Calendar calendar;
        calendar = Calendar.getInstance(timezone);
        calendar.setTime(date);
        date = fromCalendarFields(calendar);
        if (!date.isBefore(this)) goto _L2; else goto _L1
_L1:
        do
        {
            timezone = date;
            if (!date.isBefore(this))
            {
                break;
            }
            calendar.setTimeInMillis(calendar.getTimeInMillis() + 60000L);
            date = fromCalendarFields(calendar);
        } while (true);
        for (; !timezone.isBefore(this); timezone = fromCalendarFields(calendar))
        {
            calendar.setTimeInMillis(calendar.getTimeInMillis() - 1000L);
        }

        calendar.setTimeInMillis(calendar.getTimeInMillis() + 1000L);
        date = calendar;
_L4:
        return date.getTime();
_L2:
        if (date.equals(this))
        {
            Calendar calendar1 = Calendar.getInstance(timezone);
            calendar1.setTimeInMillis(calendar.getTimeInMillis() - (long)timezone.getDSTSavings());
            date = calendar1;
            if (fromCalendarFields(calendar1).equals(this))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        date = calendar;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static LocalDateTime fromCalendarFields(Calendar calendar)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The calendar must not be null");
        }
        int j = calendar.get(0);
        int i = calendar.get(1);
        if (j != 1)
        {
            i = 1 - i;
        }
        return new LocalDateTime(i, calendar.get(2) + 1, calendar.get(5), calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
    }

    public static LocalDateTime fromDateFields(Date date)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        }
        if (date.getTime() < 0L)
        {
            GregorianCalendar gregoriancalendar = new GregorianCalendar();
            gregoriancalendar.setTime(date);
            return fromCalendarFields(gregoriancalendar);
        } else
        {
            return new LocalDateTime(date.getYear() + 1900, date.getMonth() + 1, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds(), ((int)(date.getTime() % 1000L) + 1000) % 1000);
        }
    }

    public static LocalDateTime now()
    {
        return new LocalDateTime();
    }

    public static LocalDateTime now(Chronology chronology)
    {
        if (chronology == null)
        {
            throw new NullPointerException("Chronology must not be null");
        } else
        {
            return new LocalDateTime(chronology);
        }
    }

    public static LocalDateTime now(DateTimeZone datetimezone)
    {
        if (datetimezone == null)
        {
            throw new NullPointerException("Zone must not be null");
        } else
        {
            return new LocalDateTime(datetimezone);
        }
    }

    public static LocalDateTime parse(String s)
    {
        return parse(s, ISODateTimeFormat.localDateOptionalTimeParser());
    }

    public static LocalDateTime parse(String s, DateTimeFormatter datetimeformatter)
    {
        return datetimeformatter.parseLocalDateTime(s);
    }

    private Object readResolve()
    {
        LocalDateTime localdatetime;
        if (iChronology == null)
        {
            localdatetime = new LocalDateTime(iLocalMillis, ISOChronology.getInstanceUTC());
        } else
        {
            localdatetime = this;
            if (!DateTimeZone.UTC.equals(iChronology.getZone()))
            {
                return new LocalDateTime(iLocalMillis, iChronology.withUTC());
            }
        }
        return localdatetime;
    }

    public Property centuryOfEra()
    {
        return new Property(this, getChronology().centuryOfEra());
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((ReadablePartial)obj);
    }

    public int compareTo(ReadablePartial readablepartial)
    {
        if (this == readablepartial)
        {
            return 0;
        }
        if (readablepartial instanceof LocalDateTime)
        {
            LocalDateTime localdatetime = (LocalDateTime)readablepartial;
            if (iChronology.equals(localdatetime.iChronology))
            {
                byte byte0;
                if (iLocalMillis < localdatetime.iLocalMillis)
                {
                    byte0 = -1;
                } else
                if (iLocalMillis == localdatetime.iLocalMillis)
                {
                    byte0 = 0;
                } else
                {
                    byte0 = 1;
                }
                return byte0;
            }
        }
        return super.compareTo(readablepartial);
    }

    public Property dayOfMonth()
    {
        return new Property(this, getChronology().dayOfMonth());
    }

    public Property dayOfWeek()
    {
        return new Property(this, getChronology().dayOfWeek());
    }

    public Property dayOfYear()
    {
        return new Property(this, getChronology().dayOfYear());
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof LocalDateTime)
        {
            LocalDateTime localdatetime = (LocalDateTime)obj;
            if (iChronology.equals(localdatetime.iChronology))
            {
                boolean flag;
                if (iLocalMillis == localdatetime.iLocalMillis)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            }
        }
        return super.equals(obj);
    }

    public Property era()
    {
        return new Property(this, getChronology().era());
    }

    public int get(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else
        {
            return datetimefieldtype.getField(getChronology()).get(getLocalMillis());
        }
    }

    public int getCenturyOfEra()
    {
        return getChronology().centuryOfEra().get(getLocalMillis());
    }

    public Chronology getChronology()
    {
        return iChronology;
    }

    public int getDayOfMonth()
    {
        return getChronology().dayOfMonth().get(getLocalMillis());
    }

    public int getDayOfWeek()
    {
        return getChronology().dayOfWeek().get(getLocalMillis());
    }

    public int getDayOfYear()
    {
        return getChronology().dayOfYear().get(getLocalMillis());
    }

    public int getEra()
    {
        return getChronology().era().get(getLocalMillis());
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

        case 3: // '\003'
            return chronology.millisOfDay();
        }
    }

    public int getHourOfDay()
    {
        return getChronology().hourOfDay().get(getLocalMillis());
    }

    protected long getLocalMillis()
    {
        return iLocalMillis;
    }

    public int getMillisOfDay()
    {
        return getChronology().millisOfDay().get(getLocalMillis());
    }

    public int getMillisOfSecond()
    {
        return getChronology().millisOfSecond().get(getLocalMillis());
    }

    public int getMinuteOfHour()
    {
        return getChronology().minuteOfHour().get(getLocalMillis());
    }

    public int getMonthOfYear()
    {
        return getChronology().monthOfYear().get(getLocalMillis());
    }

    public int getSecondOfMinute()
    {
        return getChronology().secondOfMinute().get(getLocalMillis());
    }

    public int getValue(int i)
    {
        switch (i)
        {
        default:
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid index: ").append(i).toString());

        case 0: // '\0'
            return getChronology().year().get(getLocalMillis());

        case 1: // '\001'
            return getChronology().monthOfYear().get(getLocalMillis());

        case 2: // '\002'
            return getChronology().dayOfMonth().get(getLocalMillis());

        case 3: // '\003'
            return getChronology().millisOfDay().get(getLocalMillis());
        }
    }

    public int getWeekOfWeekyear()
    {
        return getChronology().weekOfWeekyear().get(getLocalMillis());
    }

    public int getWeekyear()
    {
        return getChronology().weekyear().get(getLocalMillis());
    }

    public int getYear()
    {
        return getChronology().year().get(getLocalMillis());
    }

    public int getYearOfCentury()
    {
        return getChronology().yearOfCentury().get(getLocalMillis());
    }

    public int getYearOfEra()
    {
        return getChronology().yearOfEra().get(getLocalMillis());
    }

    public Property hourOfDay()
    {
        return new Property(this, getChronology().hourOfDay());
    }

    public boolean isSupported(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            return false;
        } else
        {
            return datetimefieldtype.getField(getChronology()).isSupported();
        }
    }

    public boolean isSupported(DurationFieldType durationfieldtype)
    {
        if (durationfieldtype == null)
        {
            return false;
        } else
        {
            return durationfieldtype.getField(getChronology()).isSupported();
        }
    }

    public Property millisOfDay()
    {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond()
    {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalDateTime minus(ReadableDuration readableduration)
    {
        return withDurationAdded(readableduration, -1);
    }

    public LocalDateTime minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public LocalDateTime minusDays(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().days().subtract(getLocalMillis(), i));
        }
    }

    public LocalDateTime minusHours(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i));
        }
    }

    public LocalDateTime minusMillis(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i));
        }
    }

    public LocalDateTime minusMinutes(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i));
        }
    }

    public LocalDateTime minusMonths(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().months().subtract(getLocalMillis(), i));
        }
    }

    public LocalDateTime minusSeconds(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i));
        }
    }

    public LocalDateTime minusWeeks(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i));
        }
    }

    public LocalDateTime minusYears(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().years().subtract(getLocalMillis(), i));
        }
    }

    public Property minuteOfHour()
    {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear()
    {
        return new Property(this, getChronology().monthOfYear());
    }

    public LocalDateTime plus(ReadableDuration readableduration)
    {
        return withDurationAdded(readableduration, 1);
    }

    public LocalDateTime plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public LocalDateTime plusDays(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().days().add(getLocalMillis(), i));
        }
    }

    public LocalDateTime plusHours(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().hours().add(getLocalMillis(), i));
        }
    }

    public LocalDateTime plusMillis(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().millis().add(getLocalMillis(), i));
        }
    }

    public LocalDateTime plusMinutes(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().minutes().add(getLocalMillis(), i));
        }
    }

    public LocalDateTime plusMonths(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().months().add(getLocalMillis(), i));
        }
    }

    public LocalDateTime plusSeconds(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().seconds().add(getLocalMillis(), i));
        }
    }

    public LocalDateTime plusWeeks(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().weeks().add(getLocalMillis(), i));
        }
    }

    public LocalDateTime plusYears(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().years().add(getLocalMillis(), i));
        }
    }

    public Property property(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        if (!isSupported(datetimefieldtype))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Field '").append(datetimefieldtype).append("' is not supported").toString());
        } else
        {
            return new Property(this, datetimefieldtype.getField(getChronology()));
        }
    }

    public Property secondOfMinute()
    {
        return new Property(this, getChronology().secondOfMinute());
    }

    public int size()
    {
        return 4;
    }

    public Date toDate()
    {
        int i = getDayOfMonth();
        Date date = new Date(getYear() - 1900, getMonthOfYear() - 1, i, getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        date.setTime(date.getTime() + (long)getMillisOfSecond());
        return correctDstTransition(date, TimeZone.getDefault());
    }

    public Date toDate(TimeZone timezone)
    {
        Object obj = Calendar.getInstance(timezone);
        ((Calendar) (obj)).clear();
        ((Calendar) (obj)).set(getYear(), getMonthOfYear() - 1, getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute());
        obj = ((Calendar) (obj)).getTime();
        ((Date) (obj)).setTime(((Date) (obj)).getTime() + (long)getMillisOfSecond());
        return correctDstTransition(((Date) (obj)), timezone);
    }

    public DateTime toDateTime()
    {
        return toDateTime((DateTimeZone)null);
    }

    public DateTime toDateTime(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        datetimezone = iChronology.withZone(datetimezone);
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), getHourOfDay(), getMinuteOfHour(), getSecondOfMinute(), getMillisOfSecond(), datetimezone);
    }

    public LocalDate toLocalDate()
    {
        return new LocalDate(getLocalMillis(), getChronology());
    }

    public LocalTime toLocalTime()
    {
        return new LocalTime(getLocalMillis(), getChronology());
    }

    public String toString()
    {
        return ISODateTimeFormat.dateTime().print(this);
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

    public Property weekOfWeekyear()
    {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear()
    {
        return new Property(this, getChronology().weekyear());
    }

    public LocalDateTime withCenturyOfEra(int i)
    {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
    }

    public LocalDateTime withDate(int i, int j, int k)
    {
        Chronology chronology = getChronology();
        long l = getLocalMillis();
        l = chronology.year().set(l, i);
        l = chronology.monthOfYear().set(l, j);
        return withLocalMillis(chronology.dayOfMonth().set(l, k));
    }

    public LocalDateTime withDayOfMonth(int i)
    {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
    }

    public LocalDateTime withDayOfWeek(int i)
    {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
    }

    public LocalDateTime withDayOfYear(int i)
    {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
    }

    public LocalDateTime withDurationAdded(ReadableDuration readableduration, int i)
    {
        if (readableduration == null || i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().add(getLocalMillis(), readableduration.getMillis(), i));
        }
    }

    public LocalDateTime withEra(int i)
    {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
    }

    public LocalDateTime withField(DateTimeFieldType datetimefieldtype, int i)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        } else
        {
            return withLocalMillis(datetimefieldtype.getField(getChronology()).set(getLocalMillis(), i));
        }
    }

    public LocalDateTime withFieldAdded(DurationFieldType durationfieldtype, int i)
    {
        if (durationfieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(durationfieldtype.getField(getChronology()).add(getLocalMillis(), i));
        }
    }

    public LocalDateTime withFields(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().set(readablepartial, getLocalMillis()));
        }
    }

    public LocalDateTime withHourOfDay(int i)
    {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i));
    }

    LocalDateTime withLocalMillis(long l)
    {
        if (l == getLocalMillis())
        {
            return this;
        } else
        {
            return new LocalDateTime(l, getChronology());
        }
    }

    public LocalDateTime withMillisOfDay(int i)
    {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i));
    }

    public LocalDateTime withMillisOfSecond(int i)
    {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i));
    }

    public LocalDateTime withMinuteOfHour(int i)
    {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i));
    }

    public LocalDateTime withMonthOfYear(int i)
    {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
    }

    public LocalDateTime withPeriodAdded(ReadablePeriod readableperiod, int i)
    {
        if (readableperiod == null || i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().add(readableperiod, getLocalMillis(), i));
        }
    }

    public LocalDateTime withSecondOfMinute(int i)
    {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i));
    }

    public LocalDateTime withTime(int i, int j, int k, int l)
    {
        Chronology chronology = getChronology();
        long l1 = getLocalMillis();
        l1 = chronology.hourOfDay().set(l1, i);
        l1 = chronology.minuteOfHour().set(l1, j);
        l1 = chronology.secondOfMinute().set(l1, k);
        return withLocalMillis(chronology.millisOfSecond().set(l1, l));
    }

    public LocalDateTime withWeekOfWeekyear(int i)
    {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
    }

    public LocalDateTime withWeekyear(int i)
    {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
    }

    public LocalDateTime withYear(int i)
    {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
    }

    public LocalDateTime withYearOfCentury(int i)
    {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
    }

    public LocalDateTime withYearOfEra(int i)
    {
        return withLocalMillis(getChronology().yearOfEra().set(getLocalMillis(), i));
    }

    public Property year()
    {
        return new Property(this, getChronology().year());
    }

    public Property yearOfCentury()
    {
        return new Property(this, getChronology().yearOfCentury());
    }

    public Property yearOfEra()
    {
        return new Property(this, getChronology().yearOfEra());
    }
}
