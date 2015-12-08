// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;

// Referenced classes of package org.joda.time:
//            DurationField, Chronology, DateTimeUtils

public abstract class DurationFieldType
    implements Serializable
{
    private static class StandardDurationFieldType extends DurationFieldType
    {

        private static final long serialVersionUID = 0x1c563f5ae6d3L;
        private final byte iOrdinal;

        private Object readResolve()
        {
            switch (iOrdinal)
            {
            default:
                return this;

            case 1: // '\001'
                return ERAS_TYPE;

            case 2: // '\002'
                return CENTURIES_TYPE;

            case 3: // '\003'
                return WEEKYEARS_TYPE;

            case 4: // '\004'
                return YEARS_TYPE;

            case 5: // '\005'
                return MONTHS_TYPE;

            case 6: // '\006'
                return WEEKS_TYPE;

            case 7: // '\007'
                return DAYS_TYPE;

            case 8: // '\b'
                return HALFDAYS_TYPE;

            case 9: // '\t'
                return HOURS_TYPE;

            case 10: // '\n'
                return MINUTES_TYPE;

            case 11: // '\013'
                return SECONDS_TYPE;

            case 12: // '\f'
                return MILLIS_TYPE;
            }
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof StandardDurationFieldType)
                {
                    if (iOrdinal != ((StandardDurationFieldType)obj).iOrdinal)
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

        public DurationField getField(Chronology chronology)
        {
            chronology = DateTimeUtils.getChronology(chronology);
            switch (iOrdinal)
            {
            default:
                throw new InternalError();

            case 1: // '\001'
                return chronology.eras();

            case 2: // '\002'
                return chronology.centuries();

            case 3: // '\003'
                return chronology.weekyears();

            case 4: // '\004'
                return chronology.years();

            case 5: // '\005'
                return chronology.months();

            case 6: // '\006'
                return chronology.weeks();

            case 7: // '\007'
                return chronology.days();

            case 8: // '\b'
                return chronology.halfdays();

            case 9: // '\t'
                return chronology.hours();

            case 10: // '\n'
                return chronology.minutes();

            case 11: // '\013'
                return chronology.seconds();

            case 12: // '\f'
                return chronology.millis();
            }
        }

        public int hashCode()
        {
            return 1 << iOrdinal;
        }

        StandardDurationFieldType(String s, byte byte0)
        {
            super(s);
            iOrdinal = byte0;
        }
    }


    static final byte CENTURIES = 2;
    static final DurationFieldType CENTURIES_TYPE = new StandardDurationFieldType("centuries", (byte)2);
    static final byte DAYS = 7;
    static final DurationFieldType DAYS_TYPE = new StandardDurationFieldType("days", (byte)7);
    static final byte ERAS = 1;
    static final DurationFieldType ERAS_TYPE = new StandardDurationFieldType("eras", (byte)1);
    static final byte HALFDAYS = 8;
    static final DurationFieldType HALFDAYS_TYPE = new StandardDurationFieldType("halfdays", (byte)8);
    static final byte HOURS = 9;
    static final DurationFieldType HOURS_TYPE = new StandardDurationFieldType("hours", (byte)9);
    static final byte MILLIS = 12;
    static final DurationFieldType MILLIS_TYPE = new StandardDurationFieldType("millis", (byte)12);
    static final byte MINUTES = 10;
    static final DurationFieldType MINUTES_TYPE = new StandardDurationFieldType("minutes", (byte)10);
    static final byte MONTHS = 5;
    static final DurationFieldType MONTHS_TYPE = new StandardDurationFieldType("months", (byte)5);
    static final byte SECONDS = 11;
    static final DurationFieldType SECONDS_TYPE = new StandardDurationFieldType("seconds", (byte)11);
    static final byte WEEKS = 6;
    static final DurationFieldType WEEKS_TYPE = new StandardDurationFieldType("weeks", (byte)6);
    static final byte WEEKYEARS = 3;
    static final DurationFieldType WEEKYEARS_TYPE = new StandardDurationFieldType("weekyears", (byte)3);
    static final byte YEARS = 4;
    static final DurationFieldType YEARS_TYPE = new StandardDurationFieldType("years", (byte)4);
    private static final long serialVersionUID = 0x7f8cac4ed77L;
    private final String iName;

    protected DurationFieldType(String s)
    {
        iName = s;
    }

    public static DurationFieldType centuries()
    {
        return CENTURIES_TYPE;
    }

    public static DurationFieldType days()
    {
        return DAYS_TYPE;
    }

    public static DurationFieldType eras()
    {
        return ERAS_TYPE;
    }

    public static DurationFieldType halfdays()
    {
        return HALFDAYS_TYPE;
    }

    public static DurationFieldType hours()
    {
        return HOURS_TYPE;
    }

    public static DurationFieldType millis()
    {
        return MILLIS_TYPE;
    }

    public static DurationFieldType minutes()
    {
        return MINUTES_TYPE;
    }

    public static DurationFieldType months()
    {
        return MONTHS_TYPE;
    }

    public static DurationFieldType seconds()
    {
        return SECONDS_TYPE;
    }

    public static DurationFieldType weeks()
    {
        return WEEKS_TYPE;
    }

    public static DurationFieldType weekyears()
    {
        return WEEKYEARS_TYPE;
    }

    public static DurationFieldType years()
    {
        return YEARS_TYPE;
    }

    public abstract DurationField getField(Chronology chronology);

    public String getName()
    {
        return iName;
    }

    public boolean isSupported(Chronology chronology)
    {
        return getField(chronology).isSupported();
    }

    public String toString()
    {
        return getName();
    }

}
