// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            DurationFieldType, DateTimeUtils, Chronology, DurationField

private static class iOrdinal extends DurationFieldType
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
            if (obj instanceof MILLIS_TYPE)
            {
                if (iOrdinal != ((iOrdinal)obj).iOrdinal)
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

    (String s, byte byte0)
    {
        super(s);
        iOrdinal = byte0;
    }
}
