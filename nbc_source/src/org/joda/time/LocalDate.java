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
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadablePartial, DurationFieldType, DateTimeUtils, Chronology, 
//            DateTimeZone, DateTimeField, DateTimeFieldType, DurationField, 
//            DateMidnight, LocalTime, DateTime, Interval, 
//            LocalDateTime, ReadablePeriod

public final class LocalDate extends BaseLocal
    implements Serializable, ReadablePartial
{
    public static final class Property extends AbstractReadableInstantFieldProperty
    {

        private static final long serialVersionUID = 0xfffffd1860e9cee6L;
        private transient DateTimeField iField;
        private transient LocalDate iInstant;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            iInstant = (LocalDate)objectinputstream.readObject();
            iField = ((DateTimeFieldType)objectinputstream.readObject()).getField(iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.writeObject(iInstant);
            objectoutputstream.writeObject(iField.getType());
        }

        public LocalDate addToCopy(int i)
        {
            return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), i));
        }

        public LocalDate addWrapFieldToCopy(int i)
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

        public LocalDate getLocalDate()
        {
            return iInstant;
        }

        protected long getMillis()
        {
            return iInstant.getLocalMillis();
        }

        public LocalDate roundCeilingCopy()
        {
            return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
        }

        public LocalDate roundFloorCopy()
        {
            return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
        }

        public LocalDate roundHalfCeilingCopy()
        {
            return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
        }

        public LocalDate roundHalfEvenCopy()
        {
            return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
        }

        public LocalDate roundHalfFloorCopy()
        {
            return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
        }

        public LocalDate setCopy(int i)
        {
            return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), i));
        }

        public LocalDate setCopy(String s)
        {
            return setCopy(s, null);
        }

        public LocalDate setCopy(String s, Locale locale)
        {
            return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), s, locale));
        }

        public LocalDate withMaximumValue()
        {
            return setCopy(getMaximumValue());
        }

        public LocalDate withMinimumValue()
        {
            return setCopy(getMinimumValue());
        }

        Property(LocalDate localdate, DateTimeField datetimefield)
        {
            iInstant = localdate;
            iField = datetimefield;
        }
    }


    private static final Set DATE_DURATION_TYPES;
    private static final int DAY_OF_MONTH = 2;
    private static final int MONTH_OF_YEAR = 1;
    private static final int YEAR = 0;
    private static final long serialVersionUID = 0xfffff804d3e4ebb5L;
    private final Chronology iChronology;
    private transient int iHash;
    private final long iLocalMillis;

    public LocalDate()
    {
        this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance())));
    }

    public LocalDate(int i, int j, int k)
    {
        this(i, j, k, ((Chronology) (ISOChronology.getInstanceUTC())));
    }

    public LocalDate(int i, int j, int k, Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology).withUTC();
        long l = chronology.getDateTimeMillis(i, j, k, 0);
        iChronology = chronology;
        iLocalMillis = l;
    }

    public LocalDate(long l)
    {
        this(l, ((Chronology) (ISOChronology.getInstance())));
    }

    public LocalDate(long l, Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology);
        l = chronology.getZone().getMillisKeepLocal(DateTimeZone.UTC, l);
        chronology = chronology.withUTC();
        iLocalMillis = chronology.dayOfMonth().roundFloor(l);
        iChronology = chronology;
    }

    public LocalDate(long l, DateTimeZone datetimezone)
    {
        this(l, ((Chronology) (ISOChronology.getInstance(datetimezone))));
    }

    public LocalDate(Object obj)
    {
        this(obj, (Chronology)null);
    }

    public LocalDate(Object obj, Chronology chronology)
    {
        PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
        chronology = DateTimeUtils.getChronology(partialconverter.getChronology(obj, chronology));
        iChronology = chronology.withUTC();
        obj = partialconverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localDateParser());
        iLocalMillis = iChronology.getDateTimeMillis(obj[0], obj[1], obj[2], 0);
    }

    public LocalDate(Object obj, DateTimeZone datetimezone)
    {
        PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
        datetimezone = DateTimeUtils.getChronology(partialconverter.getChronology(obj, datetimezone));
        iChronology = datetimezone.withUTC();
        obj = partialconverter.getPartialValues(this, obj, datetimezone, ISODateTimeFormat.localDateParser());
        iLocalMillis = iChronology.getDateTimeMillis(obj[0], obj[1], obj[2], 0);
    }

    public LocalDate(Chronology chronology)
    {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalDate(DateTimeZone datetimezone)
    {
        this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance(datetimezone))));
    }

    public static LocalDate fromCalendarFields(Calendar calendar)
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
        return new LocalDate(i, calendar.get(2) + 1, calendar.get(5));
    }

    public static LocalDate fromDateFields(Date date)
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
            return new LocalDate(date.getYear() + 1900, date.getMonth() + 1, date.getDate());
        }
    }

    public static LocalDate now()
    {
        return new LocalDate();
    }

    public static LocalDate now(Chronology chronology)
    {
        if (chronology == null)
        {
            throw new NullPointerException("Chronology must not be null");
        } else
        {
            return new LocalDate(chronology);
        }
    }

    public static LocalDate now(DateTimeZone datetimezone)
    {
        if (datetimezone == null)
        {
            throw new NullPointerException("Zone must not be null");
        } else
        {
            return new LocalDate(datetimezone);
        }
    }

    public static LocalDate parse(String s)
    {
        return parse(s, ISODateTimeFormat.localDateParser());
    }

    public static LocalDate parse(String s, DateTimeFormatter datetimeformatter)
    {
        return datetimeformatter.parseLocalDate(s);
    }

    private Object readResolve()
    {
        LocalDate localdate;
        if (iChronology == null)
        {
            localdate = new LocalDate(iLocalMillis, ISOChronology.getInstanceUTC());
        } else
        {
            localdate = this;
            if (!DateTimeZone.UTC.equals(iChronology.getZone()))
            {
                return new LocalDate(iLocalMillis, iChronology.withUTC());
            }
        }
        return localdate;
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
        if (readablepartial instanceof LocalDate)
        {
            LocalDate localdate = (LocalDate)readablepartial;
            if (iChronology.equals(localdate.iChronology))
            {
                byte byte0;
                if (iLocalMillis < localdate.iLocalMillis)
                {
                    byte0 = -1;
                } else
                if (iLocalMillis == localdate.iLocalMillis)
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
        if (obj instanceof LocalDate)
        {
            LocalDate localdate = (LocalDate)obj;
            if (iChronology.equals(localdate.iChronology))
            {
                boolean flag;
                if (iLocalMillis == localdate.iLocalMillis)
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
        }
        if (!isSupported(datetimefieldtype))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Field '").append(datetimefieldtype).append("' is not supported").toString());
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
        }
    }

    protected long getLocalMillis()
    {
        return iLocalMillis;
    }

    public int getMonthOfYear()
    {
        return getChronology().monthOfYear().get(getLocalMillis());
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

    public int hashCode()
    {
        int j = iHash;
        int i = j;
        if (j == 0)
        {
            i = super.hashCode();
            iHash = i;
        }
        return i;
    }

    public boolean isSupported(DateTimeFieldType datetimefieldtype)
    {
        DurationFieldType durationfieldtype;
        if (datetimefieldtype != null)
        {
            if (DATE_DURATION_TYPES.contains(durationfieldtype = datetimefieldtype.getDurationType()) || durationfieldtype.getField(getChronology()).getUnitMillis() >= getChronology().days().getUnitMillis())
            {
                return datetimefieldtype.getField(getChronology()).isSupported();
            }
        }
        return false;
    }

    public boolean isSupported(DurationFieldType durationfieldtype)
    {
        if (durationfieldtype != null)
        {
            DurationField durationfield = durationfieldtype.getField(getChronology());
            if (DATE_DURATION_TYPES.contains(durationfieldtype) || durationfield.getUnitMillis() >= getChronology().days().getUnitMillis())
            {
                return durationfield.isSupported();
            }
        }
        return false;
    }

    public LocalDate minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public LocalDate minusDays(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().days().subtract(getLocalMillis(), i));
        }
    }

    public LocalDate minusMonths(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().months().subtract(getLocalMillis(), i));
        }
    }

    public LocalDate minusWeeks(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().weeks().subtract(getLocalMillis(), i));
        }
    }

    public LocalDate minusYears(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().years().subtract(getLocalMillis(), i));
        }
    }

    public Property monthOfYear()
    {
        return new Property(this, getChronology().monthOfYear());
    }

    public LocalDate plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public LocalDate plusDays(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().days().add(getLocalMillis(), i));
        }
    }

    public LocalDate plusMonths(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().months().add(getLocalMillis(), i));
        }
    }

    public LocalDate plusWeeks(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().weeks().add(getLocalMillis(), i));
        }
    }

    public LocalDate plusYears(int i)
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

    public int size()
    {
        return 3;
    }

    public Date toDate()
    {
        Object obj;
        Date date;
        int i;
        i = getDayOfMonth();
        date = new Date(getYear() - 1900, getMonthOfYear() - 1, i);
        obj = fromDateFields(date);
        if (!((LocalDate) (obj)).isBefore(this)) goto _L2; else goto _L1
_L1:
        for (; !((LocalDate) (obj)).equals(this); obj = fromDateFields(date))
        {
            date.setTime(date.getTime() + 0x36ee80L);
        }

        for (; date.getDate() == i; date.setTime(date.getTime() - 1000L)) { }
        date.setTime(date.getTime() + 1000L);
        obj = date;
_L4:
        return ((Date) (obj));
_L2:
        Date date1;
        if (!((LocalDate) (obj)).equals(this))
        {
            break; /* Loop/switch isn't completed */
        }
        date1 = new Date(date.getTime() - (long)TimeZone.getDefault().getDSTSavings());
        obj = date1;
        if (date1.getDate() == i) goto _L4; else goto _L3
_L3:
        return date;
    }

    public DateMidnight toDateMidnight()
    {
        return toDateMidnight(null);
    }

    public DateMidnight toDateMidnight(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        datetimezone = getChronology().withZone(datetimezone);
        return new DateMidnight(getYear(), getMonthOfYear(), getDayOfMonth(), datetimezone);
    }

    public DateTime toDateTime(LocalTime localtime)
    {
        return toDateTime(localtime, null);
    }

    public DateTime toDateTime(LocalTime localtime, DateTimeZone datetimezone)
    {
        if (localtime == null)
        {
            return toDateTimeAtCurrentTime(datetimezone);
        }
        if (getChronology() != localtime.getChronology())
        {
            throw new IllegalArgumentException("The chronology of the time does not match");
        } else
        {
            datetimezone = getChronology().withZone(datetimezone);
            return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), localtime.getHourOfDay(), localtime.getMinuteOfHour(), localtime.getSecondOfMinute(), localtime.getMillisOfSecond(), datetimezone);
        }
    }

    public DateTime toDateTimeAtCurrentTime()
    {
        return toDateTimeAtCurrentTime(null);
    }

    public DateTime toDateTimeAtCurrentTime(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        datetimezone = getChronology().withZone(datetimezone);
        return new DateTime(datetimezone.set(this, DateTimeUtils.currentTimeMillis()), datetimezone);
    }

    public DateTime toDateTimeAtMidnight()
    {
        return toDateTimeAtMidnight(null);
    }

    public DateTime toDateTimeAtMidnight(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        datetimezone = getChronology().withZone(datetimezone);
        return new DateTime(getYear(), getMonthOfYear(), getDayOfMonth(), 0, 0, 0, 0, datetimezone);
    }

    public DateTime toDateTimeAtStartOfDay()
    {
        return toDateTimeAtStartOfDay(null);
    }

    public DateTime toDateTimeAtStartOfDay(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        Chronology chronology = getChronology().withZone(datetimezone);
        long l = datetimezone.convertLocalToUTC(getLocalMillis() + 0x1499700L, false);
        return new DateTime(chronology.dayOfMonth().roundFloor(l), chronology);
    }

    public Interval toInterval()
    {
        return toInterval(null);
    }

    public Interval toInterval(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        return new Interval(toDateTimeAtStartOfDay(datetimezone), plusDays(1).toDateTimeAtStartOfDay(datetimezone));
    }

    public LocalDateTime toLocalDateTime(LocalTime localtime)
    {
        if (localtime == null)
        {
            throw new IllegalArgumentException("The time must not be null");
        }
        if (getChronology() != localtime.getChronology())
        {
            throw new IllegalArgumentException("The chronology of the time does not match");
        } else
        {
            return new LocalDateTime(getLocalMillis() + localtime.getLocalMillis(), getChronology());
        }
    }

    public String toString()
    {
        return ISODateTimeFormat.date().print(this);
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

    public LocalDate withCenturyOfEra(int i)
    {
        return withLocalMillis(getChronology().centuryOfEra().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfMonth(int i)
    {
        return withLocalMillis(getChronology().dayOfMonth().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfWeek(int i)
    {
        return withLocalMillis(getChronology().dayOfWeek().set(getLocalMillis(), i));
    }

    public LocalDate withDayOfYear(int i)
    {
        return withLocalMillis(getChronology().dayOfYear().set(getLocalMillis(), i));
    }

    public LocalDate withEra(int i)
    {
        return withLocalMillis(getChronology().era().set(getLocalMillis(), i));
    }

    public LocalDate withField(DateTimeFieldType datetimefieldtype, int i)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (!isSupported(datetimefieldtype))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Field '").append(datetimefieldtype).append("' is not supported").toString());
        } else
        {
            return withLocalMillis(datetimefieldtype.getField(getChronology()).set(getLocalMillis(), i));
        }
    }

    public LocalDate withFieldAdded(DurationFieldType durationfieldtype, int i)
    {
        if (durationfieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (!isSupported(durationfieldtype))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Field '").append(durationfieldtype).append("' is not supported").toString());
        }
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(durationfieldtype.getField(getChronology()).add(getLocalMillis(), i));
        }
    }

    public LocalDate withFields(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().set(readablepartial, getLocalMillis()));
        }
    }

    LocalDate withLocalMillis(long l)
    {
        l = iChronology.dayOfMonth().roundFloor(l);
        if (l == getLocalMillis())
        {
            return this;
        } else
        {
            return new LocalDate(l, getChronology());
        }
    }

    public LocalDate withMonthOfYear(int i)
    {
        return withLocalMillis(getChronology().monthOfYear().set(getLocalMillis(), i));
    }

    public LocalDate withPeriodAdded(ReadablePeriod readableperiod, int i)
    {
        if (readableperiod == null || i == 0)
        {
            return this;
        }
        long l = getLocalMillis();
        Chronology chronology = getChronology();
        for (int j = 0; j < readableperiod.size();)
        {
            long l2 = FieldUtils.safeMultiply(readableperiod.getValue(j), i);
            DurationFieldType durationfieldtype = readableperiod.getFieldType(j);
            long l1 = l;
            if (isSupported(durationfieldtype))
            {
                l1 = durationfieldtype.getField(chronology).add(l, l2);
            }
            j++;
            l = l1;
        }

        return withLocalMillis(l);
    }

    public LocalDate withWeekOfWeekyear(int i)
    {
        return withLocalMillis(getChronology().weekOfWeekyear().set(getLocalMillis(), i));
    }

    public LocalDate withWeekyear(int i)
    {
        return withLocalMillis(getChronology().weekyear().set(getLocalMillis(), i));
    }

    public LocalDate withYear(int i)
    {
        return withLocalMillis(getChronology().year().set(getLocalMillis(), i));
    }

    public LocalDate withYearOfCentury(int i)
    {
        return withLocalMillis(getChronology().yearOfCentury().set(getLocalMillis(), i));
    }

    public LocalDate withYearOfEra(int i)
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

    static 
    {
        DATE_DURATION_TYPES = new HashSet();
        DATE_DURATION_TYPES.add(DurationFieldType.days());
        DATE_DURATION_TYPES.add(DurationFieldType.weeks());
        DATE_DURATION_TYPES.add(DurationFieldType.months());
        DATE_DURATION_TYPES.add(DurationFieldType.weekyears());
        DATE_DURATION_TYPES.add(DurationFieldType.years());
        DATE_DURATION_TYPES.add(DurationFieldType.centuries());
        DATE_DURATION_TYPES.add(DurationFieldType.eras());
    }
}
