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
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.joda.time.base.BaseLocal;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PartialConverter;
import org.joda.time.field.AbstractReadableInstantFieldProperty;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadablePartial, DurationFieldType, DateTimeUtils, Chronology, 
//            DateTimeZone, DateTimeField, DateTimeFieldType, DurationField, 
//            DateTime, ReadablePeriod

public final class LocalTime extends BaseLocal
    implements Serializable, ReadablePartial
{
    public static final class Property extends AbstractReadableInstantFieldProperty
    {

        private static final long serialVersionUID = 0xfffed7a5deb78259L;
        private transient DateTimeField iField;
        private transient LocalTime iInstant;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            iInstant = (LocalTime)objectinputstream.readObject();
            iField = ((DateTimeFieldType)objectinputstream.readObject()).getField(iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.writeObject(iInstant);
            objectoutputstream.writeObject(iField.getType());
        }

        public LocalTime addCopy(int i)
        {
            return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), i));
        }

        public LocalTime addCopy(long l)
        {
            return iInstant.withLocalMillis(iField.add(iInstant.getLocalMillis(), l));
        }

        public LocalTime addNoWrapToCopy(int i)
        {
            long l = iField.add(iInstant.getLocalMillis(), i);
            if ((long)iInstant.getChronology().millisOfDay().get(l) != l)
            {
                throw new IllegalArgumentException("The addition exceeded the boundaries of LocalTime");
            } else
            {
                return iInstant.withLocalMillis(l);
            }
        }

        public LocalTime addWrapFieldToCopy(int i)
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

        public LocalTime getLocalTime()
        {
            return iInstant;
        }

        protected long getMillis()
        {
            return iInstant.getLocalMillis();
        }

        public LocalTime roundCeilingCopy()
        {
            return iInstant.withLocalMillis(iField.roundCeiling(iInstant.getLocalMillis()));
        }

        public LocalTime roundFloorCopy()
        {
            return iInstant.withLocalMillis(iField.roundFloor(iInstant.getLocalMillis()));
        }

        public LocalTime roundHalfCeilingCopy()
        {
            return iInstant.withLocalMillis(iField.roundHalfCeiling(iInstant.getLocalMillis()));
        }

        public LocalTime roundHalfEvenCopy()
        {
            return iInstant.withLocalMillis(iField.roundHalfEven(iInstant.getLocalMillis()));
        }

        public LocalTime roundHalfFloorCopy()
        {
            return iInstant.withLocalMillis(iField.roundHalfFloor(iInstant.getLocalMillis()));
        }

        public LocalTime setCopy(int i)
        {
            return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), i));
        }

        public LocalTime setCopy(String s)
        {
            return setCopy(s, null);
        }

        public LocalTime setCopy(String s, Locale locale)
        {
            return iInstant.withLocalMillis(iField.set(iInstant.getLocalMillis(), s, locale));
        }

        public LocalTime withMaximumValue()
        {
            return setCopy(getMaximumValue());
        }

        public LocalTime withMinimumValue()
        {
            return setCopy(getMinimumValue());
        }

        Property(LocalTime localtime, DateTimeField datetimefield)
        {
            iInstant = localtime;
            iField = datetimefield;
        }
    }


    private static final int HOUR_OF_DAY = 0;
    public static final LocalTime MIDNIGHT = new LocalTime(0, 0, 0, 0);
    private static final int MILLIS_OF_SECOND = 3;
    private static final int MINUTE_OF_HOUR = 1;
    private static final int SECOND_OF_MINUTE = 2;
    private static final Set TIME_DURATION_TYPES;
    private static final long serialVersionUID = 0xfffff44abbf29defL;
    private final Chronology iChronology;
    private final long iLocalMillis;

    public LocalTime()
    {
        this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance())));
    }

    public LocalTime(int i, int j)
    {
        this(i, j, 0, 0, ((Chronology) (ISOChronology.getInstanceUTC())));
    }

    public LocalTime(int i, int j, int k)
    {
        this(i, j, k, 0, ((Chronology) (ISOChronology.getInstanceUTC())));
    }

    public LocalTime(int i, int j, int k, int l)
    {
        this(i, j, k, l, ((Chronology) (ISOChronology.getInstanceUTC())));
    }

    public LocalTime(int i, int j, int k, int l, Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology).withUTC();
        long l1 = chronology.getDateTimeMillis(0L, i, j, k, l);
        iChronology = chronology;
        iLocalMillis = l1;
    }

    public LocalTime(long l)
    {
        this(l, ((Chronology) (ISOChronology.getInstance())));
    }

    public LocalTime(long l, Chronology chronology)
    {
        chronology = DateTimeUtils.getChronology(chronology);
        l = chronology.getZone().getMillisKeepLocal(DateTimeZone.UTC, l);
        chronology = chronology.withUTC();
        iLocalMillis = chronology.millisOfDay().get(l);
        iChronology = chronology;
    }

    public LocalTime(long l, DateTimeZone datetimezone)
    {
        this(l, ((Chronology) (ISOChronology.getInstance(datetimezone))));
    }

    public LocalTime(Object obj)
    {
        this(obj, (Chronology)null);
    }

    public LocalTime(Object obj, Chronology chronology)
    {
        PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
        chronology = DateTimeUtils.getChronology(partialconverter.getChronology(obj, chronology));
        iChronology = chronology.withUTC();
        obj = partialconverter.getPartialValues(this, obj, chronology, ISODateTimeFormat.localTimeParser());
        iLocalMillis = iChronology.getDateTimeMillis(0L, obj[0], obj[1], obj[2], obj[3]);
    }

    public LocalTime(Object obj, DateTimeZone datetimezone)
    {
        PartialConverter partialconverter = ConverterManager.getInstance().getPartialConverter(obj);
        datetimezone = DateTimeUtils.getChronology(partialconverter.getChronology(obj, datetimezone));
        iChronology = datetimezone.withUTC();
        obj = partialconverter.getPartialValues(this, obj, datetimezone, ISODateTimeFormat.localTimeParser());
        iLocalMillis = iChronology.getDateTimeMillis(0L, obj[0], obj[1], obj[2], obj[3]);
    }

    public LocalTime(Chronology chronology)
    {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public LocalTime(DateTimeZone datetimezone)
    {
        this(DateTimeUtils.currentTimeMillis(), ((Chronology) (ISOChronology.getInstance(datetimezone))));
    }

    public static LocalTime fromCalendarFields(Calendar calendar)
    {
        if (calendar == null)
        {
            throw new IllegalArgumentException("The calendar must not be null");
        } else
        {
            return new LocalTime(calendar.get(11), calendar.get(12), calendar.get(13), calendar.get(14));
        }
    }

    public static LocalTime fromDateFields(Date date)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("The date must not be null");
        } else
        {
            return new LocalTime(date.getHours(), date.getMinutes(), date.getSeconds(), ((int)(date.getTime() % 1000L) + 1000) % 1000);
        }
    }

    public static LocalTime fromMillisOfDay(long l)
    {
        return fromMillisOfDay(l, null);
    }

    public static LocalTime fromMillisOfDay(long l, Chronology chronology)
    {
        return new LocalTime(l, DateTimeUtils.getChronology(chronology).withUTC());
    }

    public static LocalTime now()
    {
        return new LocalTime();
    }

    public static LocalTime now(Chronology chronology)
    {
        if (chronology == null)
        {
            throw new NullPointerException("Chronology must not be null");
        } else
        {
            return new LocalTime(chronology);
        }
    }

    public static LocalTime now(DateTimeZone datetimezone)
    {
        if (datetimezone == null)
        {
            throw new NullPointerException("Zone must not be null");
        } else
        {
            return new LocalTime(datetimezone);
        }
    }

    public static LocalTime parse(String s)
    {
        return parse(s, ISODateTimeFormat.localTimeParser());
    }

    public static LocalTime parse(String s, DateTimeFormatter datetimeformatter)
    {
        return datetimeformatter.parseLocalTime(s);
    }

    private Object readResolve()
    {
        LocalTime localtime;
        if (iChronology == null)
        {
            localtime = new LocalTime(iLocalMillis, ISOChronology.getInstanceUTC());
        } else
        {
            localtime = this;
            if (!DateTimeZone.UTC.equals(iChronology.getZone()))
            {
                return new LocalTime(iLocalMillis, iChronology.withUTC());
            }
        }
        return localtime;
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
        if (readablepartial instanceof LocalTime)
        {
            LocalTime localtime = (LocalTime)readablepartial;
            if (iChronology.equals(localtime.iChronology))
            {
                byte byte0;
                if (iLocalMillis < localtime.iLocalMillis)
                {
                    byte0 = -1;
                } else
                if (iLocalMillis == localtime.iLocalMillis)
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

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof LocalTime)
        {
            LocalTime localtime = (LocalTime)obj;
            if (iChronology.equals(localtime.iChronology))
            {
                boolean flag;
                if (iLocalMillis == localtime.iLocalMillis)
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

    public Chronology getChronology()
    {
        return iChronology;
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
            return getChronology().hourOfDay().get(getLocalMillis());

        case 1: // '\001'
            return getChronology().minuteOfHour().get(getLocalMillis());

        case 2: // '\002'
            return getChronology().secondOfMinute().get(getLocalMillis());

        case 3: // '\003'
            return getChronology().millisOfSecond().get(getLocalMillis());
        }
    }

    public Property hourOfDay()
    {
        return new Property(this, getChronology().hourOfDay());
    }

    public boolean isSupported(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype != null && isSupported(datetimefieldtype.getDurationType()))
        {
            datetimefieldtype = datetimefieldtype.getRangeDurationType();
            if (isSupported(((DurationFieldType) (datetimefieldtype))) || datetimefieldtype == DurationFieldType.days())
            {
                return true;
            }
        }
        return false;
    }

    public boolean isSupported(DurationFieldType durationfieldtype)
    {
        if (durationfieldtype != null)
        {
            DurationField durationfield = durationfieldtype.getField(getChronology());
            if (TIME_DURATION_TYPES.contains(durationfieldtype) || durationfield.getUnitMillis() < getChronology().days().getUnitMillis())
            {
                return durationfield.isSupported();
            }
        }
        return false;
    }

    public Property millisOfDay()
    {
        return new Property(this, getChronology().millisOfDay());
    }

    public Property millisOfSecond()
    {
        return new Property(this, getChronology().millisOfSecond());
    }

    public LocalTime minus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, -1);
    }

    public LocalTime minusHours(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().hours().subtract(getLocalMillis(), i));
        }
    }

    public LocalTime minusMillis(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().millis().subtract(getLocalMillis(), i));
        }
    }

    public LocalTime minusMinutes(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().minutes().subtract(getLocalMillis(), i));
        }
    }

    public LocalTime minusSeconds(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().seconds().subtract(getLocalMillis(), i));
        }
    }

    public Property minuteOfHour()
    {
        return new Property(this, getChronology().minuteOfHour());
    }

    public LocalTime plus(ReadablePeriod readableperiod)
    {
        return withPeriodAdded(readableperiod, 1);
    }

    public LocalTime plusHours(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().hours().add(getLocalMillis(), i));
        }
    }

    public LocalTime plusMillis(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().millis().add(getLocalMillis(), i));
        }
    }

    public LocalTime plusMinutes(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().minutes().add(getLocalMillis(), i));
        }
    }

    public LocalTime plusSeconds(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().seconds().add(getLocalMillis(), i));
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

    public DateTime toDateTimeToday()
    {
        return toDateTimeToday(null);
    }

    public DateTime toDateTimeToday(DateTimeZone datetimezone)
    {
        datetimezone = getChronology().withZone(datetimezone);
        return new DateTime(datetimezone.set(this, DateTimeUtils.currentTimeMillis()), datetimezone);
    }

    public String toString()
    {
        return ISODateTimeFormat.time().print(this);
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

    public LocalTime withField(DateTimeFieldType datetimefieldtype, int i)
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

    public LocalTime withFieldAdded(DurationFieldType durationfieldtype, int i)
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

    public LocalTime withFields(ReadablePartial readablepartial)
    {
        if (readablepartial == null)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().set(readablepartial, getLocalMillis()));
        }
    }

    public LocalTime withHourOfDay(int i)
    {
        return withLocalMillis(getChronology().hourOfDay().set(getLocalMillis(), i));
    }

    LocalTime withLocalMillis(long l)
    {
        if (l == getLocalMillis())
        {
            return this;
        } else
        {
            return new LocalTime(l, getChronology());
        }
    }

    public LocalTime withMillisOfDay(int i)
    {
        return withLocalMillis(getChronology().millisOfDay().set(getLocalMillis(), i));
    }

    public LocalTime withMillisOfSecond(int i)
    {
        return withLocalMillis(getChronology().millisOfSecond().set(getLocalMillis(), i));
    }

    public LocalTime withMinuteOfHour(int i)
    {
        return withLocalMillis(getChronology().minuteOfHour().set(getLocalMillis(), i));
    }

    public LocalTime withPeriodAdded(ReadablePeriod readableperiod, int i)
    {
        if (readableperiod == null || i == 0)
        {
            return this;
        } else
        {
            return withLocalMillis(getChronology().add(readableperiod, getLocalMillis(), i));
        }
    }

    public LocalTime withSecondOfMinute(int i)
    {
        return withLocalMillis(getChronology().secondOfMinute().set(getLocalMillis(), i));
    }

    static 
    {
        TIME_DURATION_TYPES = new HashSet();
        TIME_DURATION_TYPES.add(DurationFieldType.millis());
        TIME_DURATION_TYPES.add(DurationFieldType.seconds());
        TIME_DURATION_TYPES.add(DurationFieldType.minutes());
        TIME_DURATION_TYPES.add(DurationFieldType.hours());
    }
}
