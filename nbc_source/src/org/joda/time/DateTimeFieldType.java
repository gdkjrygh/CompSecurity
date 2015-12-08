// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;

// Referenced classes of package org.joda.time:
//            DurationFieldType, DateTimeField, Chronology, DateTimeUtils

public abstract class DateTimeFieldType
    implements Serializable
{
    private static class StandardDateTimeFieldType extends DateTimeFieldType
    {

        private static final long serialVersionUID = 0xfffff6f623875386L;
        private final byte iOrdinal;
        private final transient DurationFieldType iRangeType;
        private final transient DurationFieldType iUnitType;

        private Object readResolve()
        {
            switch (iOrdinal)
            {
            default:
                return this;

            case 1: // '\001'
                return DateTimeFieldType.ERA_TYPE;

            case 2: // '\002'
                return DateTimeFieldType.YEAR_OF_ERA_TYPE;

            case 3: // '\003'
                return DateTimeFieldType.CENTURY_OF_ERA_TYPE;

            case 4: // '\004'
                return DateTimeFieldType.YEAR_OF_CENTURY_TYPE;

            case 5: // '\005'
                return DateTimeFieldType.YEAR_TYPE;

            case 6: // '\006'
                return DateTimeFieldType.DAY_OF_YEAR_TYPE;

            case 7: // '\007'
                return DateTimeFieldType.MONTH_OF_YEAR_TYPE;

            case 8: // '\b'
                return DateTimeFieldType.DAY_OF_MONTH_TYPE;

            case 9: // '\t'
                return DateTimeFieldType.WEEKYEAR_OF_CENTURY_TYPE;

            case 10: // '\n'
                return DateTimeFieldType.WEEKYEAR_TYPE;

            case 11: // '\013'
                return DateTimeFieldType.WEEK_OF_WEEKYEAR_TYPE;

            case 12: // '\f'
                return DateTimeFieldType.DAY_OF_WEEK_TYPE;

            case 13: // '\r'
                return DateTimeFieldType.HALFDAY_OF_DAY_TYPE;

            case 14: // '\016'
                return DateTimeFieldType.HOUR_OF_HALFDAY_TYPE;

            case 15: // '\017'
                return DateTimeFieldType.CLOCKHOUR_OF_HALFDAY_TYPE;

            case 16: // '\020'
                return DateTimeFieldType.CLOCKHOUR_OF_DAY_TYPE;

            case 17: // '\021'
                return DateTimeFieldType.HOUR_OF_DAY_TYPE;

            case 18: // '\022'
                return DateTimeFieldType.MINUTE_OF_DAY_TYPE;

            case 19: // '\023'
                return DateTimeFieldType.MINUTE_OF_HOUR_TYPE;

            case 20: // '\024'
                return DateTimeFieldType.SECOND_OF_DAY_TYPE;

            case 21: // '\025'
                return DateTimeFieldType.SECOND_OF_MINUTE_TYPE;

            case 22: // '\026'
                return DateTimeFieldType.MILLIS_OF_DAY_TYPE;

            case 23: // '\027'
                return DateTimeFieldType.MILLIS_OF_SECOND_TYPE;
            }
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof StandardDateTimeFieldType)
                {
                    if (iOrdinal != ((StandardDateTimeFieldType)obj).iOrdinal)
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public DurationFieldType getDurationType()
        {
            return iUnitType;
        }

        public DateTimeField getField(Chronology chronology)
        {
            chronology = DateTimeUtils.getChronology(chronology);
            switch (iOrdinal)
            {
            default:
                throw new InternalError();

            case 1: // '\001'
                return chronology.era();

            case 2: // '\002'
                return chronology.yearOfEra();

            case 3: // '\003'
                return chronology.centuryOfEra();

            case 4: // '\004'
                return chronology.yearOfCentury();

            case 5: // '\005'
                return chronology.year();

            case 6: // '\006'
                return chronology.dayOfYear();

            case 7: // '\007'
                return chronology.monthOfYear();

            case 8: // '\b'
                return chronology.dayOfMonth();

            case 9: // '\t'
                return chronology.weekyearOfCentury();

            case 10: // '\n'
                return chronology.weekyear();

            case 11: // '\013'
                return chronology.weekOfWeekyear();

            case 12: // '\f'
                return chronology.dayOfWeek();

            case 13: // '\r'
                return chronology.halfdayOfDay();

            case 14: // '\016'
                return chronology.hourOfHalfday();

            case 15: // '\017'
                return chronology.clockhourOfHalfday();

            case 16: // '\020'
                return chronology.clockhourOfDay();

            case 17: // '\021'
                return chronology.hourOfDay();

            case 18: // '\022'
                return chronology.minuteOfDay();

            case 19: // '\023'
                return chronology.minuteOfHour();

            case 20: // '\024'
                return chronology.secondOfDay();

            case 21: // '\025'
                return chronology.secondOfMinute();

            case 22: // '\026'
                return chronology.millisOfDay();

            case 23: // '\027'
                return chronology.millisOfSecond();
            }
        }

        public DurationFieldType getRangeDurationType()
        {
            return iRangeType;
        }

        public int hashCode()
        {
            return 1 << iOrdinal;
        }

        StandardDateTimeFieldType(String s, byte byte0, DurationFieldType durationfieldtype, DurationFieldType durationfieldtype1)
        {
            super(s);
            iOrdinal = byte0;
            iUnitType = durationfieldtype;
            iRangeType = durationfieldtype1;
        }
    }


    static final byte CENTURY_OF_ERA = 3;
    private static final DateTimeFieldType CENTURY_OF_ERA_TYPE = new StandardDateTimeFieldType("centuryOfEra", (byte)3, DurationFieldType.centuries(), DurationFieldType.eras());
    static final byte CLOCKHOUR_OF_DAY = 16;
    private static final DateTimeFieldType CLOCKHOUR_OF_DAY_TYPE = new StandardDateTimeFieldType("clockhourOfDay", (byte)16, DurationFieldType.hours(), DurationFieldType.days());
    static final byte CLOCKHOUR_OF_HALFDAY = 15;
    private static final DateTimeFieldType CLOCKHOUR_OF_HALFDAY_TYPE = new StandardDateTimeFieldType("clockhourOfHalfday", (byte)15, DurationFieldType.hours(), DurationFieldType.halfdays());
    static final byte DAY_OF_MONTH = 8;
    private static final DateTimeFieldType DAY_OF_MONTH_TYPE = new StandardDateTimeFieldType("dayOfMonth", (byte)8, DurationFieldType.days(), DurationFieldType.months());
    static final byte DAY_OF_WEEK = 12;
    private static final DateTimeFieldType DAY_OF_WEEK_TYPE = new StandardDateTimeFieldType("dayOfWeek", (byte)12, DurationFieldType.days(), DurationFieldType.weeks());
    static final byte DAY_OF_YEAR = 6;
    private static final DateTimeFieldType DAY_OF_YEAR_TYPE = new StandardDateTimeFieldType("dayOfYear", (byte)6, DurationFieldType.days(), DurationFieldType.years());
    static final byte ERA = 1;
    private static final DateTimeFieldType ERA_TYPE = new StandardDateTimeFieldType("era", (byte)1, DurationFieldType.eras(), null);
    static final byte HALFDAY_OF_DAY = 13;
    private static final DateTimeFieldType HALFDAY_OF_DAY_TYPE = new StandardDateTimeFieldType("halfdayOfDay", (byte)13, DurationFieldType.halfdays(), DurationFieldType.days());
    static final byte HOUR_OF_DAY = 17;
    private static final DateTimeFieldType HOUR_OF_DAY_TYPE = new StandardDateTimeFieldType("hourOfDay", (byte)17, DurationFieldType.hours(), DurationFieldType.days());
    static final byte HOUR_OF_HALFDAY = 14;
    private static final DateTimeFieldType HOUR_OF_HALFDAY_TYPE = new StandardDateTimeFieldType("hourOfHalfday", (byte)14, DurationFieldType.hours(), DurationFieldType.halfdays());
    static final byte MILLIS_OF_DAY = 22;
    private static final DateTimeFieldType MILLIS_OF_DAY_TYPE = new StandardDateTimeFieldType("millisOfDay", (byte)22, DurationFieldType.millis(), DurationFieldType.days());
    static final byte MILLIS_OF_SECOND = 23;
    private static final DateTimeFieldType MILLIS_OF_SECOND_TYPE = new StandardDateTimeFieldType("millisOfSecond", (byte)23, DurationFieldType.millis(), DurationFieldType.seconds());
    static final byte MINUTE_OF_DAY = 18;
    private static final DateTimeFieldType MINUTE_OF_DAY_TYPE = new StandardDateTimeFieldType("minuteOfDay", (byte)18, DurationFieldType.minutes(), DurationFieldType.days());
    static final byte MINUTE_OF_HOUR = 19;
    private static final DateTimeFieldType MINUTE_OF_HOUR_TYPE = new StandardDateTimeFieldType("minuteOfHour", (byte)19, DurationFieldType.minutes(), DurationFieldType.hours());
    static final byte MONTH_OF_YEAR = 7;
    private static final DateTimeFieldType MONTH_OF_YEAR_TYPE = new StandardDateTimeFieldType("monthOfYear", (byte)7, DurationFieldType.months(), DurationFieldType.years());
    static final byte SECOND_OF_DAY = 20;
    private static final DateTimeFieldType SECOND_OF_DAY_TYPE = new StandardDateTimeFieldType("secondOfDay", (byte)20, DurationFieldType.seconds(), DurationFieldType.days());
    static final byte SECOND_OF_MINUTE = 21;
    private static final DateTimeFieldType SECOND_OF_MINUTE_TYPE = new StandardDateTimeFieldType("secondOfMinute", (byte)21, DurationFieldType.seconds(), DurationFieldType.minutes());
    static final byte WEEKYEAR = 10;
    static final byte WEEKYEAR_OF_CENTURY = 9;
    private static final DateTimeFieldType WEEKYEAR_OF_CENTURY_TYPE = new StandardDateTimeFieldType("weekyearOfCentury", (byte)9, DurationFieldType.weekyears(), DurationFieldType.centuries());
    private static final DateTimeFieldType WEEKYEAR_TYPE = new StandardDateTimeFieldType("weekyear", (byte)10, DurationFieldType.weekyears(), null);
    static final byte WEEK_OF_WEEKYEAR = 11;
    private static final DateTimeFieldType WEEK_OF_WEEKYEAR_TYPE = new StandardDateTimeFieldType("weekOfWeekyear", (byte)11, DurationFieldType.weeks(), DurationFieldType.weekyears());
    static final byte YEAR = 5;
    static final byte YEAR_OF_CENTURY = 4;
    private static final DateTimeFieldType YEAR_OF_CENTURY_TYPE = new StandardDateTimeFieldType("yearOfCentury", (byte)4, DurationFieldType.years(), DurationFieldType.centuries());
    static final byte YEAR_OF_ERA = 2;
    private static final DateTimeFieldType YEAR_OF_ERA_TYPE = new StandardDateTimeFieldType("yearOfEra", (byte)2, DurationFieldType.years(), DurationFieldType.eras());
    private static final DateTimeFieldType YEAR_TYPE = new StandardDateTimeFieldType("year", (byte)5, DurationFieldType.years(), null);
    private static final long serialVersionUID = 0xffffd93ddb047c1aL;
    private final String iName;

    protected DateTimeFieldType(String s)
    {
        iName = s;
    }

    public static DateTimeFieldType centuryOfEra()
    {
        return CENTURY_OF_ERA_TYPE;
    }

    public static DateTimeFieldType clockhourOfDay()
    {
        return CLOCKHOUR_OF_DAY_TYPE;
    }

    public static DateTimeFieldType clockhourOfHalfday()
    {
        return CLOCKHOUR_OF_HALFDAY_TYPE;
    }

    public static DateTimeFieldType dayOfMonth()
    {
        return DAY_OF_MONTH_TYPE;
    }

    public static DateTimeFieldType dayOfWeek()
    {
        return DAY_OF_WEEK_TYPE;
    }

    public static DateTimeFieldType dayOfYear()
    {
        return DAY_OF_YEAR_TYPE;
    }

    public static DateTimeFieldType era()
    {
        return ERA_TYPE;
    }

    public static DateTimeFieldType halfdayOfDay()
    {
        return HALFDAY_OF_DAY_TYPE;
    }

    public static DateTimeFieldType hourOfDay()
    {
        return HOUR_OF_DAY_TYPE;
    }

    public static DateTimeFieldType hourOfHalfday()
    {
        return HOUR_OF_HALFDAY_TYPE;
    }

    public static DateTimeFieldType millisOfDay()
    {
        return MILLIS_OF_DAY_TYPE;
    }

    public static DateTimeFieldType millisOfSecond()
    {
        return MILLIS_OF_SECOND_TYPE;
    }

    public static DateTimeFieldType minuteOfDay()
    {
        return MINUTE_OF_DAY_TYPE;
    }

    public static DateTimeFieldType minuteOfHour()
    {
        return MINUTE_OF_HOUR_TYPE;
    }

    public static DateTimeFieldType monthOfYear()
    {
        return MONTH_OF_YEAR_TYPE;
    }

    public static DateTimeFieldType secondOfDay()
    {
        return SECOND_OF_DAY_TYPE;
    }

    public static DateTimeFieldType secondOfMinute()
    {
        return SECOND_OF_MINUTE_TYPE;
    }

    public static DateTimeFieldType weekOfWeekyear()
    {
        return WEEK_OF_WEEKYEAR_TYPE;
    }

    public static DateTimeFieldType weekyear()
    {
        return WEEKYEAR_TYPE;
    }

    public static DateTimeFieldType weekyearOfCentury()
    {
        return WEEKYEAR_OF_CENTURY_TYPE;
    }

    public static DateTimeFieldType year()
    {
        return YEAR_TYPE;
    }

    public static DateTimeFieldType yearOfCentury()
    {
        return YEAR_OF_CENTURY_TYPE;
    }

    public static DateTimeFieldType yearOfEra()
    {
        return YEAR_OF_ERA_TYPE;
    }

    public abstract DurationFieldType getDurationType();

    public abstract DateTimeField getField(Chronology chronology);

    public String getName()
    {
        return iName;
    }

    public abstract DurationFieldType getRangeDurationType();

    public boolean isSupported(Chronology chronology)
    {
        return getField(chronology).isSupported();
    }

    public String toString()
    {
        return getName();
    }
























}
