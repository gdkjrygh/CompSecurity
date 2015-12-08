// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Locale;
import org.joda.time.base.BaseDateTime;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadableDateTime, Chronology, DateTimeUtils, DateTime, 
//            DateTimeField, DurationField, DateTimeFieldType, Interval, 
//            DurationFieldType, LocalDate, YearMonthDay, ReadableDuration, 
//            DateTimeZone, ReadablePeriod, ReadablePartial

public final class DateMidnight extends BaseDateTime
    implements Serializable, ReadableDateTime
{
    public static final class Property extends AbstractReadableInstantFieldProperty
    {

        private static final long serialVersionUID = 0xf5b1db4L;
        private DateTimeField iField;
        private DateMidnight iInstant;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            iInstant = (DateMidnight)objectinputstream.readObject();
            iField = ((DateTimeFieldType)objectinputstream.readObject()).getField(iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.writeObject(iInstant);
            objectoutputstream.writeObject(iField.getType());
        }

        public DateMidnight addToCopy(int i)
        {
            return iInstant.withMillis(iField.add(iInstant.getMillis(), i));
        }

        public DateMidnight addToCopy(long l)
        {
            return iInstant.withMillis(iField.add(iInstant.getMillis(), l));
        }

        public DateMidnight addWrapFieldToCopy(int i)
        {
            return iInstant.withMillis(iField.addWrapField(iInstant.getMillis(), i));
        }

        protected Chronology getChronology()
        {
            return iInstant.getChronology();
        }

        public DateMidnight getDateMidnight()
        {
            return iInstant;
        }

        public DateTimeField getField()
        {
            return iField;
        }

        protected long getMillis()
        {
            return iInstant.getMillis();
        }

        public DateMidnight roundCeilingCopy()
        {
            return iInstant.withMillis(iField.roundCeiling(iInstant.getMillis()));
        }

        public DateMidnight roundFloorCopy()
        {
            return iInstant.withMillis(iField.roundFloor(iInstant.getMillis()));
        }

        public DateMidnight roundHalfCeilingCopy()
        {
            return iInstant.withMillis(iField.roundHalfCeiling(iInstant.getMillis()));
        }

        public DateMidnight roundHalfEvenCopy()
        {
            return iInstant.withMillis(iField.roundHalfEven(iInstant.getMillis()));
        }

        public DateMidnight roundHalfFloorCopy()
        {
            return iInstant.withMillis(iField.roundHalfFloor(iInstant.getMillis()));
        }

        public DateMidnight setCopy(int i)
        {
            return iInstant.withMillis(iField.set(iInstant.getMillis(), i));
        }

        public DateMidnight setCopy(String s)
        {
            return setCopy(s, null);
        }

        public DateMidnight setCopy(String s, Locale locale)
        {
            return iInstant.withMillis(iField.set(iInstant.getMillis(), s, locale));
        }

        public DateMidnight withMaximumValue()
        {
            return setCopy(getMaximumValue());
        }

        public DateMidnight withMinimumValue()
        {
            return setCopy(getMinimumValue());
        }

        Property(DateMidnight datemidnight, DateTimeField datetimefield)
        {
            iInstant = datemidnight;
            iField = datetimefield;
        }
    }


    private static final long serialVersionUID = 0x8e382f5e4032L;

    public DateMidnight()
    {
    }

    public DateMidnight(int i, int j, int k)
    {
        super(i, j, k, 0, 0, 0, 0);
    }

    public DateMidnight(int i, int j, int k, Chronology chronology)
    {
        super(i, j, k, 0, 0, 0, 0, chronology);
    }

    public DateMidnight(int i, int j, int k, DateTimeZone datetimezone)
    {
        super(i, j, k, 0, 0, 0, 0, datetimezone);
    }

    public DateMidnight(long l)
    {
        super(l);
    }

    public DateMidnight(long l, Chronology chronology)
    {
        super(l, chronology);
    }

    public DateMidnight(long l, DateTimeZone datetimezone)
    {
        super(l, datetimezone);
    }

    public DateMidnight(Object obj)
    {
        super(obj, (Chronology)null);
    }

    public DateMidnight(Object obj, Chronology chronology)
    {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    public DateMidnight(Object obj, DateTimeZone datetimezone)
    {
        super(obj, datetimezone);
    }

    public DateMidnight(Chronology chronology)
    {
        super(chronology);
    }

    public DateMidnight(DateTimeZone datetimezone)
    {
        super(datetimezone);
    }

    public static DateMidnight now()
    {
        return new DateMidnight();
    }

    public static DateMidnight now(Chronology chronology)
    {
        if (chronology == null)
        {
            throw new NullPointerException("Chronology must not be null");
        } else
        {
            return new DateMidnight(chronology);
        }
    }

    public static DateMidnight now(DateTimeZone datetimezone)
    {
        if (datetimezone == null)
        {
            throw new NullPointerException("Zone must not be null");
        } else
        {
            return new DateMidnight(datetimezone);
        }
    }

    public static DateMidnight parse(String s)
    {
        return parse(s, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    public static DateMidnight parse(String s, DateTimeFormatter datetimeformatter)
    {
        return datetimeformatter.parseDateTime(s).toDateMidnight();
    }

    public Property centuryOfEra()
    {
        return new Property(this, getChronology().centuryOfEra());
    }

    protected long checkInstant(long l, Chronology chronology)
    {
        return chronology.dayOfMonth().roundFloor(l);
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

    public Property era()
    {
        return new Property(this, getChronology().era());
    }

    public DateMidnight minus(long l)
    {
        return withDurationAdded(l, -1);
    }

    public DateMidnight minus(ReadableDuration readableduration)
    {
        return withDurationAdded(readableduration, -1);
    }

    public DateMidnight minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public DateMidnight minusDays(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().days().subtract(getMillis(), i));
        }
    }

    public DateMidnight minusMonths(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().months().subtract(getMillis(), i));
        }
    }

    public DateMidnight minusWeeks(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().weeks().subtract(getMillis(), i));
        }
    }

    public DateMidnight minusYears(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().years().subtract(getMillis(), i));
        }
    }

    public Property monthOfYear()
    {
        return new Property(this, getChronology().monthOfYear());
    }

    public DateMidnight plus(long l)
    {
        return withDurationAdded(l, 1);
    }

    public DateMidnight plus(ReadableDuration readableduration)
    {
        return withDurationAdded(readableduration, 1);
    }

    public DateMidnight plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public DateMidnight plusDays(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().days().add(getMillis(), i));
        }
    }

    public DateMidnight plusMonths(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().months().add(getMillis(), i));
        }
    }

    public DateMidnight plusWeeks(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().weeks().add(getMillis(), i));
        }
    }

    public DateMidnight plusYears(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().years().add(getMillis(), i));
        }
    }

    public Property property(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        DateTimeField datetimefield = datetimefieldtype.getField(getChronology());
        if (!datetimefield.isSupported())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Field '").append(datetimefieldtype).append("' is not supported").toString());
        } else
        {
            return new Property(this, datetimefield);
        }
    }

    public Interval toInterval()
    {
        Chronology chronology = getChronology();
        long l = getMillis();
        return new Interval(l, DurationFieldType.days().getField(chronology).add(l, 1), chronology);
    }

    public LocalDate toLocalDate()
    {
        return new LocalDate(getMillis(), getChronology());
    }

    public YearMonthDay toYearMonthDay()
    {
        return new YearMonthDay(getMillis(), getChronology());
    }

    public Property weekOfWeekyear()
    {
        return new Property(this, getChronology().weekOfWeekyear());
    }

    public Property weekyear()
    {
        return new Property(this, getChronology().weekyear());
    }

    public DateMidnight withCenturyOfEra(int i)
    {
        return withMillis(getChronology().centuryOfEra().set(getMillis(), i));
    }

    public DateMidnight withChronology(Chronology chronology)
    {
        if (chronology == getChronology())
        {
            return this;
        } else
        {
            return new DateMidnight(getMillis(), chronology);
        }
    }

    public DateMidnight withDayOfMonth(int i)
    {
        return withMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    public DateMidnight withDayOfWeek(int i)
    {
        return withMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    public DateMidnight withDayOfYear(int i)
    {
        return withMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    public DateMidnight withDurationAdded(long l, int i)
    {
        if (l == 0L || i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().add(getMillis(), l, i));
        }
    }

    public DateMidnight withDurationAdded(ReadableDuration readableduration, int i)
    {
        if (readableduration == null || i == 0)
        {
            return this;
        } else
        {
            return withDurationAdded(readableduration.getMillis(), i);
        }
    }

    public DateMidnight withEra(int i)
    {
        return withMillis(getChronology().era().set(getMillis(), i));
    }

    public DateMidnight withField(DateTimeFieldType datetimefieldtype, int i)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        } else
        {
            return withMillis(datetimefieldtype.getField(getChronology()).set(getMillis(), i));
        }
    }

    public DateMidnight withFieldAdded(DurationFieldType durationfieldtype, int i)
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
            return withMillis(durationfieldtype.getField(getChronology()).add(getMillis(), i));
        }
    }

    public DateMidnight withFields(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            return this;
        } else
        {
            return withMillis(getChronology().set(readablepartial, getMillis()));
        }
    }

    public DateMidnight withMillis(long l)
    {
        Chronology chronology = getChronology();
        l = checkInstant(l, chronology);
        if (l == getMillis())
        {
            return this;
        } else
        {
            return new DateMidnight(l, chronology);
        }
    }

    public DateMidnight withMonthOfYear(int i)
    {
        return withMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public DateMidnight withPeriodAdded(ReadablePeriod readableperiod, int i)
    {
        if (readableperiod == null || i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().add(readableperiod, getMillis(), i));
        }
    }

    public DateMidnight withWeekOfWeekyear(int i)
    {
        return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    public DateMidnight withWeekyear(int i)
    {
        return withMillis(getChronology().weekyear().set(getMillis(), i));
    }

    public DateMidnight withYear(int i)
    {
        return withMillis(getChronology().year().set(getMillis(), i));
    }

    public DateMidnight withYearOfCentury(int i)
    {
        return withMillis(getChronology().yearOfCentury().set(getMillis(), i));
    }

    public DateMidnight withYearOfEra(int i)
    {
        return withMillis(getChronology().yearOfEra().set(getMillis(), i));
    }

    public DateMidnight withZoneRetainFields(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        DateTimeZone datetimezone1 = DateTimeUtils.getZone(getZone());
        if (datetimezone == datetimezone1)
        {
            return this;
        } else
        {
            return new DateMidnight(datetimezone1.getMillisKeepLocal(datetimezone, getMillis()), getChronology().withZone(datetimezone));
        }
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
