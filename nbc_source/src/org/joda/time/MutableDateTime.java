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
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadWritableDateTime, Chronology, DateTimeUtils, DateTime, 
//            DurationFieldType, DurationField, ReadableDuration, DateTimeFieldType, 
//            DateTimeField, ReadableDateTime, DateTimeZone, ReadablePeriod, 
//            ReadableInstant

public class MutableDateTime extends BaseDateTime
    implements Serializable, Cloneable, ReadWritableDateTime
{
    public static final class Property extends AbstractReadableInstantFieldProperty
    {

        private static final long serialVersionUID = 0xc1cfd7268213a8c7L;
        private DateTimeField iField;
        private MutableDateTime iInstant;

        private void readObject(ObjectInputStream objectinputstream)
            throws IOException, ClassNotFoundException
        {
            iInstant = (MutableDateTime)objectinputstream.readObject();
            iField = ((DateTimeFieldType)objectinputstream.readObject()).getField(iInstant.getChronology());
        }

        private void writeObject(ObjectOutputStream objectoutputstream)
            throws IOException
        {
            objectoutputstream.writeObject(iInstant);
            objectoutputstream.writeObject(iField.getType());
        }

        public MutableDateTime add(int i)
        {
            iInstant.setMillis(getField().add(iInstant.getMillis(), i));
            return iInstant;
        }

        public MutableDateTime add(long l)
        {
            iInstant.setMillis(getField().add(iInstant.getMillis(), l));
            return iInstant;
        }

        public MutableDateTime addWrapField(int i)
        {
            iInstant.setMillis(getField().addWrapField(iInstant.getMillis(), i));
            return iInstant;
        }

        protected Chronology getChronology()
        {
            return iInstant.getChronology();
        }

        public DateTimeField getField()
        {
            return iField;
        }

        protected long getMillis()
        {
            return iInstant.getMillis();
        }

        public MutableDateTime getMutableDateTime()
        {
            return iInstant;
        }

        public MutableDateTime roundCeiling()
        {
            iInstant.setMillis(getField().roundCeiling(iInstant.getMillis()));
            return iInstant;
        }

        public MutableDateTime roundFloor()
        {
            iInstant.setMillis(getField().roundFloor(iInstant.getMillis()));
            return iInstant;
        }

        public MutableDateTime roundHalfCeiling()
        {
            iInstant.setMillis(getField().roundHalfCeiling(iInstant.getMillis()));
            return iInstant;
        }

        public MutableDateTime roundHalfEven()
        {
            iInstant.setMillis(getField().roundHalfEven(iInstant.getMillis()));
            return iInstant;
        }

        public MutableDateTime roundHalfFloor()
        {
            iInstant.setMillis(getField().roundHalfFloor(iInstant.getMillis()));
            return iInstant;
        }

        public MutableDateTime set(int i)
        {
            iInstant.setMillis(getField().set(iInstant.getMillis(), i));
            return iInstant;
        }

        public MutableDateTime set(String s)
        {
            set(s, null);
            return iInstant;
        }

        public MutableDateTime set(String s, Locale locale)
        {
            iInstant.setMillis(getField().set(iInstant.getMillis(), s, locale));
            return iInstant;
        }

        Property(MutableDateTime mutabledatetime, DateTimeField datetimefield)
        {
            iInstant = mutabledatetime;
            iField = datetimefield;
        }
    }


    public static final int ROUND_CEILING = 2;
    public static final int ROUND_FLOOR = 1;
    public static final int ROUND_HALF_CEILING = 4;
    public static final int ROUND_HALF_EVEN = 5;
    public static final int ROUND_HALF_FLOOR = 3;
    public static final int ROUND_NONE = 0;
    private static final long serialVersionUID = 0x2796807cf37e0267L;
    private DateTimeField iRoundingField;
    private int iRoundingMode;

    public MutableDateTime()
    {
    }

    public MutableDateTime(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        super(i, j, k, l, i1, j1, k1);
    }

    public MutableDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
            Chronology chronology)
    {
        super(i, j, k, l, i1, j1, k1, chronology);
    }

    public MutableDateTime(int i, int j, int k, int l, int i1, int j1, int k1, 
            DateTimeZone datetimezone)
    {
        super(i, j, k, l, i1, j1, k1, datetimezone);
    }

    public MutableDateTime(long l)
    {
        super(l);
    }

    public MutableDateTime(long l, Chronology chronology)
    {
        super(l, chronology);
    }

    public MutableDateTime(long l, DateTimeZone datetimezone)
    {
        super(l, datetimezone);
    }

    public MutableDateTime(Object obj)
    {
        super(obj, (Chronology)null);
    }

    public MutableDateTime(Object obj, Chronology chronology)
    {
        super(obj, DateTimeUtils.getChronology(chronology));
    }

    public MutableDateTime(Object obj, DateTimeZone datetimezone)
    {
        super(obj, datetimezone);
    }

    public MutableDateTime(Chronology chronology)
    {
        super(chronology);
    }

    public MutableDateTime(DateTimeZone datetimezone)
    {
        super(datetimezone);
    }

    public static MutableDateTime now()
    {
        return new MutableDateTime();
    }

    public static MutableDateTime now(Chronology chronology)
    {
        if (chronology == null)
        {
            throw new NullPointerException("Chronology must not be null");
        } else
        {
            return new MutableDateTime(chronology);
        }
    }

    public static MutableDateTime now(DateTimeZone datetimezone)
    {
        if (datetimezone == null)
        {
            throw new NullPointerException("Zone must not be null");
        } else
        {
            return new MutableDateTime(datetimezone);
        }
    }

    public static MutableDateTime parse(String s)
    {
        return parse(s, ISODateTimeFormat.dateTimeParser().withOffsetParsed());
    }

    public static MutableDateTime parse(String s, DateTimeFormatter datetimeformatter)
    {
        return datetimeformatter.parseDateTime(s).toMutableDateTime();
    }

    public void add(long l)
    {
        setMillis(FieldUtils.safeAdd(getMillis(), l));
    }

    public void add(DurationFieldType durationfieldtype, int i)
    {
        if (durationfieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        }
        if (i != 0)
        {
            setMillis(durationfieldtype.getField(getChronology()).add(getMillis(), i));
        }
    }

    public void add(ReadableDuration readableduration)
    {
        add(readableduration, 1);
    }

    public void add(ReadableDuration readableduration, int i)
    {
        if (readableduration != null)
        {
            add(FieldUtils.safeMultiply(readableduration.getMillis(), i));
        }
    }

    public void add(ReadablePeriod readableperiod)
    {
        add(readableperiod, 1);
    }

    public void add(ReadablePeriod readableperiod, int i)
    {
        if (readableperiod != null)
        {
            setMillis(getChronology().add(readableperiod, getMillis(), i));
        }
    }

    public void addDays(int i)
    {
        if (i != 0)
        {
            setMillis(getChronology().days().add(getMillis(), i));
        }
    }

    public void addHours(int i)
    {
        if (i != 0)
        {
            setMillis(getChronology().hours().add(getMillis(), i));
        }
    }

    public void addMillis(int i)
    {
        if (i != 0)
        {
            setMillis(getChronology().millis().add(getMillis(), i));
        }
    }

    public void addMinutes(int i)
    {
        if (i != 0)
        {
            setMillis(getChronology().minutes().add(getMillis(), i));
        }
    }

    public void addMonths(int i)
    {
        if (i != 0)
        {
            setMillis(getChronology().months().add(getMillis(), i));
        }
    }

    public void addSeconds(int i)
    {
        if (i != 0)
        {
            setMillis(getChronology().seconds().add(getMillis(), i));
        }
    }

    public void addWeeks(int i)
    {
        if (i != 0)
        {
            setMillis(getChronology().weeks().add(getMillis(), i));
        }
    }

    public void addWeekyears(int i)
    {
        if (i != 0)
        {
            setMillis(getChronology().weekyears().add(getMillis(), i));
        }
    }

    public void addYears(int i)
    {
        if (i != 0)
        {
            setMillis(getChronology().years().add(getMillis(), i));
        }
    }

    public Property centuryOfEra()
    {
        return new Property(this, getChronology().centuryOfEra());
    }

    public Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError("Clone error");
        }
        return obj;
    }

    public MutableDateTime copy()
    {
        return (MutableDateTime)clone();
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

    public DateTimeField getRoundingField()
    {
        return iRoundingField;
    }

    public int getRoundingMode()
    {
        return iRoundingMode;
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

    public void set(DateTimeFieldType datetimefieldtype, int i)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("Field must not be null");
        } else
        {
            setMillis(datetimefieldtype.getField(getChronology()).set(getMillis(), i));
            return;
        }
    }

    public void setChronology(Chronology chronology)
    {
        super.setChronology(chronology);
    }

    public void setDate(int i, int j, int k)
    {
        setDate(getChronology().getDateTimeMillis(i, j, k, 0));
    }

    public void setDate(long l)
    {
        setMillis(getChronology().millisOfDay().set(l, getMillisOfDay()));
    }

    public void setDate(ReadableInstant readableinstant)
    {
        long l1 = DateTimeUtils.getInstantMillis(readableinstant);
        long l = l1;
        if (readableinstant instanceof ReadableDateTime)
        {
            readableinstant = DateTimeUtils.getChronology(((ReadableDateTime)readableinstant).getChronology()).getZone();
            l = l1;
            if (readableinstant != null)
            {
                l = readableinstant.getMillisKeepLocal(getZone(), l1);
            }
        }
        setDate(l);
    }

    public void setDateTime(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        setMillis(getChronology().getDateTimeMillis(i, j, k, l, i1, j1, k1));
    }

    public void setDayOfMonth(int i)
    {
        setMillis(getChronology().dayOfMonth().set(getMillis(), i));
    }

    public void setDayOfWeek(int i)
    {
        setMillis(getChronology().dayOfWeek().set(getMillis(), i));
    }

    public void setDayOfYear(int i)
    {
        setMillis(getChronology().dayOfYear().set(getMillis(), i));
    }

    public void setHourOfDay(int i)
    {
        setMillis(getChronology().hourOfDay().set(getMillis(), i));
    }

    public void setMillis(long l)
    {
        long l1 = l;
        iRoundingMode;
        JVM INSTR tableswitch 0 5: default 44
    //                   0 46
    //                   1 52
    //                   2 64
    //                   3 76
    //                   4 88
    //                   5 100;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        l1 = l;
_L9:
        super.setMillis(l1);
        return;
_L3:
        l1 = iRoundingField.roundFloor(l);
        continue; /* Loop/switch isn't completed */
_L4:
        l1 = iRoundingField.roundCeiling(l);
        continue; /* Loop/switch isn't completed */
_L5:
        l1 = iRoundingField.roundHalfFloor(l);
        continue; /* Loop/switch isn't completed */
_L6:
        l1 = iRoundingField.roundHalfCeiling(l);
        continue; /* Loop/switch isn't completed */
_L7:
        l1 = iRoundingField.roundHalfEven(l);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void setMillis(ReadableInstant readableinstant)
    {
        setMillis(DateTimeUtils.getInstantMillis(readableinstant));
    }

    public void setMillisOfDay(int i)
    {
        setMillis(getChronology().millisOfDay().set(getMillis(), i));
    }

    public void setMillisOfSecond(int i)
    {
        setMillis(getChronology().millisOfSecond().set(getMillis(), i));
    }

    public void setMinuteOfDay(int i)
    {
        setMillis(getChronology().minuteOfDay().set(getMillis(), i));
    }

    public void setMinuteOfHour(int i)
    {
        setMillis(getChronology().minuteOfHour().set(getMillis(), i));
    }

    public void setMonthOfYear(int i)
    {
        setMillis(getChronology().monthOfYear().set(getMillis(), i));
    }

    public void setRounding(DateTimeField datetimefield)
    {
        setRounding(datetimefield, 1);
    }

    public void setRounding(DateTimeField datetimefield, int i)
    {
        if (datetimefield != null && (i < 0 || i > 5))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal rounding mode: ").append(i).toString());
        }
        DateTimeField datetimefield1;
        if (i == 0)
        {
            datetimefield1 = null;
        } else
        {
            datetimefield1 = datetimefield;
        }
        iRoundingField = datetimefield1;
        if (datetimefield == null)
        {
            i = 0;
        }
        iRoundingMode = i;
        setMillis(getMillis());
    }

    public void setSecondOfDay(int i)
    {
        setMillis(getChronology().secondOfDay().set(getMillis(), i));
    }

    public void setSecondOfMinute(int i)
    {
        setMillis(getChronology().secondOfMinute().set(getMillis(), i));
    }

    public void setTime(int i, int j, int k, int l)
    {
        setMillis(getChronology().getDateTimeMillis(getMillis(), i, j, k, l));
    }

    public void setTime(long l)
    {
        int i = ISOChronology.getInstanceUTC().millisOfDay().get(l);
        setMillis(getChronology().millisOfDay().set(getMillis(), i));
    }

    public void setTime(ReadableInstant readableinstant)
    {
        long l1 = DateTimeUtils.getInstantMillis(readableinstant);
        readableinstant = DateTimeUtils.getInstantChronology(readableinstant).getZone();
        long l = l1;
        if (readableinstant != null)
        {
            l = readableinstant.getMillisKeepLocal(DateTimeZone.UTC, l1);
        }
        setTime(l);
    }

    public void setWeekOfWeekyear(int i)
    {
        setMillis(getChronology().weekOfWeekyear().set(getMillis(), i));
    }

    public void setWeekyear(int i)
    {
        setMillis(getChronology().weekyear().set(getMillis(), i));
    }

    public void setYear(int i)
    {
        setMillis(getChronology().year().set(getMillis(), i));
    }

    public void setZone(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        Chronology chronology = getChronology();
        if (chronology.getZone() != datetimezone)
        {
            setChronology(chronology.withZone(datetimezone));
        }
    }

    public void setZoneRetainFields(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getZone(datetimezone);
        DateTimeZone datetimezone1 = DateTimeUtils.getZone(getZone());
        if (datetimezone == datetimezone1)
        {
            return;
        } else
        {
            long l = datetimezone1.getMillisKeepLocal(datetimezone, getMillis());
            setChronology(getChronology().withZone(datetimezone));
            setMillis(l);
            return;
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
