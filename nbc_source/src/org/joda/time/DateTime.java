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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadableDateTime, Chronology, DateTimeUtils, DurationField, 
//            DateTimeFieldType, DateTimeField, DateMidnight, LocalDate, 
//            LocalDateTime, LocalTime, TimeOfDay, YearMonthDay, 
//            DateTimeZone, ReadableDuration, DurationFieldType, ReadablePeriod, 
//            ReadablePartial, IllegalInstantException

public final class DateTime extends BaseDateTime
    implements Serializable, ReadableDateTime
{
    public static final class Property extends AbstractReadableInstantFieldProperty
    {

        private static final long serialVersionUID = 0x9f163ffe17ecdbfaL;
        private DateTimeField iField;
        private DateTime iInstant;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            iInstant = (DateTime)objectinputstream.readObject();
            iField = ((DateTimeFieldType)objectinputstream.readObject()).getField(iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.writeObject(iInstant);
            objectoutputstream.writeObject(iField.getType());
        }

        public DateTime addToCopy(int i)
        {
            return iInstant.withMillis(iField.add(iInstant.getMillis(), i));
        }

        public DateTime addToCopy(long l)
        {
            return iInstant.withMillis(iField.add(iInstant.getMillis(), l));
        }

        public DateTime addWrapFieldToCopy(int i)
        {
            return iInstant.withMillis(iField.addWrapField(iInstant.getMillis(), i));
        }

        protected Chronology getChronology()
        {
            return iInstant.getChronology();
        }

        public DateTime getDateTime()
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

        public DateTime roundCeilingCopy()
        {
            return iInstant.withMillis(iField.roundCeiling(iInstant.getMillis()));
        }

        public DateTime roundFloorCopy()
        {
            return iInstant.withMillis(iField.roundFloor(iInstant.getMillis()));
        }

        public DateTime roundHalfCeilingCopy()
        {
            return iInstant.withMillis(iField.roundHalfCeiling(iInstant.getMillis()));
        }

        public DateTime roundHalfEvenCopy()
        {
            return iInstant.withMillis(iField.roundHalfEven(iInstant.getMillis()));
        }

        public DateTime roundHalfFloorCopy()
        {
            return iInstant.withMillis(iField.roundHalfFloor(iInstant.getMillis()));
        }

        public DateTime setCopy(int i)
        {
            return iInstant.withMillis(iField.set(iInstant.getMillis(), i));
        }

        public DateTime setCopy(String s)
        {
            return setCopy(s, null);
        }

        public DateTime setCopy(String s, Locale locale)
        {
            return iInstant.withMillis(iField.set(iInstant.getMillis(), s, locale));
        }

        public DateTime withMaximumValue()
        {
            DateTime datetime;
            try
            {
                datetime = setCopy(getMaximumValue());
            }
            catch (RuntimeException runtimeexception)
            {
                if (IllegalInstantException.isIllegalInstant(runtimeexception))
                {
                    return new DateTime(getChronology().getZone().previousTransition(getMillis() + 0x5265c00L), getChronology());
                } else
                {
                    throw runtimeexception;
                }
            }
            return datetime;
        }

        public DateTime withMinimumValue()
        {
            DateTime datetime;
            try
            {
                datetime = setCopy(getMinimumValue());
            }
            catch (RuntimeException runtimeexception)
            {
                if (IllegalInstantException.isIllegalInstant(runtimeexception))
                {
                    return new DateTime(getChronology().getZone().nextTransition(getMillis() - 0x5265c00L), getChronology());
                } else
                {
                    throw runtimeexception;
                }
            }
            return datetime;
        }

        Property(DateTime datetime, DateTimeField datetimefield)
        {
            iInstant = datetime;
            iField = datetimefield;
        }
    }


    private static final long serialVersionUID = 0xb83c78646a5bddf9L;

    public DateTime()
    {
    }

    public DateTime(int i, int j, int k, int l, int i1)
    {
        super(i, j, k, l, i1, 0, 0);
    }

    public DateTime(int i, int j, int k, int l, int i1, int j1)
    {
        super(i, j, k, l, i1, j1, 0);
    }

    public DateTime(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        super(i, j, k, l, i1, j1, k1);
    }

    public DateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
            Chronology chronology)
    {
        super(i, j, k, l, i1, j1, k1, chronology);
    }

    public DateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
            DateTimeZone datetimezone)
    {
        super(i, j, k, l, i1, j1, k1, datetimezone);
    }

    public DateTime(int i, int j, int k, int l, int i1, int j1, Chronology chronology)
    {
        super(i, j, k, l, i1, j1, 0, chronology);
    }

    public DateTime(int i, int j, int k, int l, int i1, int j1, DateTimeZone datetimezone)
    {
        super(i, j, k, l, i1, j1, 0, datetimezone);
    }

    public DateTime(int i, int j, int k, int l, int i1, Chronology chronology)
    {
        super(i, j, k, l, i1, 0, 0, chronology);
    }

    public DateTime(int i, int j, int k, int l, int i1, DateTimeZone datetimezone)
    {
        super(i, j, k, l, i1, 0, 0, datetimezone);
    }

    public DateTime(long l)
    {
        super(l);
    }

    public DateTime(long l, Chronology chronology)
    {
        super(l, chronology);
    }

    public DateTime(long l, DateTimeZone datetimezone)
    {
        super(l, datetimezone);
    }

    public DateTime(Object obj)
    {
        super(obj, (Chronology)null);
    }

    public DateTime(Object obj, Chronology chronology)
    {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    public DateTime(Object obj, DateTimeZone datetimezone)
    {
        super(obj, datetimezone);
    }

    public DateTime(Chronology chronology)
    {
        super(chronology);
    }

    public DateTime(DateTimeZone datetimezone)
    {
        super(datetimezone);
    }

    public static DateTime now()
    {
        return new DateTime();
    }

    public static DateTime now(Chronology chronology)
    {
        if (chronology == null)
        {
            throw new NullPointerException("Chronology must not be null");
        } else
        {
            return new DateTime(chronology);
        }
    }

    public static DateTime now(DateTimeZone datetimezone)
    {
        if (datetimezone == null)
        {
            throw new NullPointerException("Zone must not be null");
        } else
        {
            return new DateTime(datetimezone);
        }
    }

    public static DateTime parse(String s)
    {
        return parse(s, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    public static DateTime parse(String s, DateTimeFormatter datetimeformatter)
    {
        return datetimeformatter.parseDateTime(s);
    }

    public Property centuryOfEra()
    {
        return new Property(this, getChronology().centuryOfEra());
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

    public Property hourOfDay()
    {
        return new Property(this, getChronology().hourOfDay());
    }

    public Property millisOfDay()
    {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond()
    {
        return new Property(this, getChronology().millisOfSecond());
    }

    public DateTime minus(long l)
    {
        return withDurationAdded(l, -1);
    }

    public DateTime minus(ReadableDuration readableduration)
    {
        return withDurationAdded(readableduration, -1);
    }

    public DateTime minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public DateTime minusDays(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().days().subtract(getMillis(), i));
        }
    }

    public DateTime minusHours(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().hours().subtract(getMillis(), i));
        }
    }

    public DateTime minusMillis(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().millis().subtract(getMillis(), i));
        }
    }

    public DateTime minusMinutes(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().minutes().subtract(getMillis(), i));
        }
    }

    public DateTime minusMonths(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().months().subtract(getMillis(), i));
        }
    }

    public DateTime minusSeconds(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().seconds().subtract(getMillis(), i));
        }
    }

    public DateTime minusWeeks(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().weeks().subtract(getMillis(), i));
        }
    }

    public DateTime minusYears(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().years().subtract(getMillis(), i));
        }
    }

    public Property minuteOfDay()
    {
        return new Property(this, getChronology().minuteOfDay());
    }

    public Property minuteOfHour()
    {
        return new Property(this, getChronology().minuteOfHour());
    }

    public Property monthOfYear()
    {
        return new Property(this, getChronology().monthOfYear());
    }

    public DateTime plus(long l)
    {
        return withDurationAdded(l, 1);
    }

    public DateTime plus(ReadableDuration readableduration)
    {
        return withDurationAdded(readableduration, 1);
    }

    public DateTime plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public DateTime plusDays(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().days().add(getMillis(), i));
        }
    }

    public DateTime plusHours(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().hours().add(getMillis(), i));
        }
    }

    public DateTime plusMillis(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().millis().add(getMillis(), i));
        }
    }

    public DateTime plusMinutes(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().minutes().add(getMillis(), i));
        }
    }

    public DateTime plusMonths(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().months().add(getMillis(), i));
        }
    }

    public DateTime plusSeconds(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().seconds().add(getMillis(), i));
        }
    }

    public DateTime plusWeeks(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().weeks().add(getMillis(), i));
        }
    }

    public DateTime plusYears(int i)
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

    public Property secondOfDay()
    {
        return new Property(this, getChronology().secondOfDay());
    }

    public Property secondOfMinute()
    {
        return new Property(this, getChronology().secondOfMinute());
    }

    public DateMidnight toDateMidnight()
    {
        return new DateMidnight(getMillis(), getChronology());
    }

    public DateTime toDateTime()
    {
        return this;
    }

    public DateTime toDateTime(Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology);
        if (getChronology() == chronology)
        {
            return this;
        } else
        {
            return super.toDateTime(chronology);
        }
    }

    public DateTime toDateTime(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        if (getZone() == datetimezone)
        {
            return this;
        } else
        {
            return super.toDateTime(datetimezone);
        }
    }

    public DateTime toDateTimeISO()
    {
        if (getChronology() == ISOChronology.getInstance())
        {
            return this;
        } else
        {
            return super.toDateTimeISO();
        }
    }

    public LocalDate toLocalDate()
    {
        return new LocalDate(getMillis(), getChronology());
    }

    public LocalDateTime toLocalDateTime()
    {
        return new LocalDateTime(getMillis(), getChronology());
    }

    public LocalTime toLocalTime()
    {
        return new LocalTime(getMillis(), getChronology());
    }

    public TimeOfDay toTimeOfDay()
    {
        return new TimeOfDay(getMillis(), getChronology());
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

    public DateTime withCenturyOfEra(int i)
    {
        return withMillis(getChronology().centuryOfEra().set(getMillis(), i));
    }

    public DateTime withChronology(Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology);
        if (chronology == getChronology())
        {
            return this;
        } else
        {
            return new DateTime(getMillis(), chronology);
        }
    }

    public DateTime withDate(int i, int j, int k)
    {
        Chronology chronology = getChronology();
        long l = chronology.withUTC().getDateTimeMillis(i, j, k, getMillisOfDay());
        return withMillis(chronology.getZone().convertLocalToUTC(l, false, getMillis()));
    }

    public DateTime withDate(LocalDate localdate)
    {
        return withDate(localdate.getYear(), localdate.getMonthOfYear(), localdate.getDayOfMonth());
    }

    public DateTime withDayOfMonth(int i)
    {
        return withMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    public DateTime withDayOfWeek(int i)
    {
        return withMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    public DateTime withDayOfYear(int i)
    {
        return withMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    public DateTime withDurationAdded(long l, int i)
    {
        if (l == 0L || i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().add(getMillis(), l, i));
        }
    }

    public DateTime withDurationAdded(ReadableDuration readableduration, int i)
    {
        if (readableduration == null || i == 0)
        {
            return this;
        } else
        {
            return withDurationAdded(readableduration.getMillis(), i);
        }
    }

    public DateTime withEarlierOffsetAtOverlap()
    {
        return withMillis(getZone().adjustOffset(getMillis(), false));
    }

    public DateTime withEra(int i)
    {
        return withMillis(getChronology().era().set(getMillis(), i));
    }

    public DateTime withField(DateTimeFieldType datetimefieldtype, int i)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        } else
        {
            return withMillis(datetimefieldtype.getField(getChronology()).set(getMillis(), i));
        }
    }

    public DateTime withFieldAdded(DurationFieldType durationfieldtype, int i)
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

    public DateTime withFields(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            return this;
        } else
        {
            return withMillis(getChronology().set(readablepartial, getMillis()));
        }
    }

    public DateTime withHourOfDay(int i)
    {
        return withMillis(getChronology().hourOfDay().set(getMillis(), i));
    }

    public DateTime withLaterOffsetAtOverlap()
    {
        return withMillis(getZone().adjustOffset(getMillis(), true));
    }

    public DateTime withMillis(long l)
    {
        if (l == getMillis())
        {
            return this;
        } else
        {
            return new DateTime(l, getChronology());
        }
    }

    public DateTime withMillisOfDay(int i)
    {
        return withMillis(getChronology().millisOfDay().set(getMillis(), i));
    }

    public DateTime withMillisOfSecond(int i)
    {
        return withMillis(getChronology().millisOfSecond().set(getMillis(), i));
    }

    public DateTime withMinuteOfHour(int i)
    {
        return withMillis(getChronology().minuteOfHour().set(getMillis(), i));
    }

    public DateTime withMonthOfYear(int i)
    {
        return withMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public DateTime withPeriodAdded(ReadablePeriod readableperiod, int i)
    {
        if (readableperiod == null || i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().add(readableperiod, getMillis(), i));
        }
    }

    public DateTime withSecondOfMinute(int i)
    {
        return withMillis(getChronology().secondOfMinute().set(getMillis(), i));
    }

    public DateTime withTime(int i, int j, int k, int l)
    {
        Chronology chronology = getChronology();
        long l1 = chronology.withUTC().getDateTimeMillis(getYear(), getMonthOfYear(), getDayOfMonth(), i, j, k, l);
        return withMillis(chronology.getZone().convertLocalToUTC(l1, false, getMillis()));
    }

    public DateTime withTime(LocalTime localtime)
    {
        return withTime(localtime.getHourOfDay(), localtime.getMinuteOfHour(), localtime.getSecondOfMinute(), localtime.getMillisOfSecond());
    }

    public DateTime withTimeAtStartOfDay()
    {
        return toLocalDate().toDateTimeAtStartOfDay(getZone());
    }

    public DateTime withWeekOfWeekyear(int i)
    {
        return withMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    public DateTime withWeekyear(int i)
    {
        return withMillis(getChronology().weekyear().set(getMillis(), i));
    }

    public DateTime withYear(int i)
    {
        return withMillis(getChronology().year().set(getMillis(), i));
    }

    public DateTime withYearOfCentury(int i)
    {
        return withMillis(getChronology().yearOfCentury().set(getMillis(), i));
    }

    public DateTime withYearOfEra(int i)
    {
        return withMillis(getChronology().yearOfEra().set(getMillis(), i));
    }

    public DateTime withZone(DateTimeZone datetimezone)
    {
        return withChronology(getChronology().withZone(datetimezone));
    }

    public DateTime withZoneRetainFields(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        DateTimeZone datetimezone1 = DateTimeUtils.getZone(getZone());
        if (datetimezone == datetimezone1)
        {
            return this;
        } else
        {
            return new DateTime(datetimezone1.getMillisKeepLocal(datetimezone, getMillis()), getChronology().withZone(datetimezone));
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
