// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            DateTimeFieldType, DateTimeUtils, Chronology, DurationFieldType, 
//            DateTimeField

private static class iRangeType extends DateTimeFieldType
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
            return DateTimeFieldType.access$000();

        case 2: // '\002'
            return DateTimeFieldType.access$100();

        case 3: // '\003'
            return DateTimeFieldType.access$200();

        case 4: // '\004'
            return DateTimeFieldType.access$300();

        case 5: // '\005'
            return DateTimeFieldType.access$400();

        case 6: // '\006'
            return DateTimeFieldType.access$500();

        case 7: // '\007'
            return DateTimeFieldType.access$600();

        case 8: // '\b'
            return DateTimeFieldType.access$700();

        case 9: // '\t'
            return DateTimeFieldType.access$800();

        case 10: // '\n'
            return DateTimeFieldType.access$900();

        case 11: // '\013'
            return DateTimeFieldType.access$1000();

        case 12: // '\f'
            return DateTimeFieldType.access$1100();

        case 13: // '\r'
            return DateTimeFieldType.access$1200();

        case 14: // '\016'
            return DateTimeFieldType.access$1300();

        case 15: // '\017'
            return DateTimeFieldType.access$1400();

        case 16: // '\020'
            return DateTimeFieldType.access$1500();

        case 17: // '\021'
            return DateTimeFieldType.access$1600();

        case 18: // '\022'
            return DateTimeFieldType.access$1700();

        case 19: // '\023'
            return DateTimeFieldType.access$1800();

        case 20: // '\024'
            return DateTimeFieldType.access$1900();

        case 21: // '\025'
            return DateTimeFieldType.access$2000();

        case 22: // '\026'
            return DateTimeFieldType.access$2100();

        case 23: // '\027'
            return DateTimeFieldType.access$2200();
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof iOrdinal)
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

    (String s, byte byte0, DurationFieldType durationfieldtype, DurationFieldType durationfieldtype1)
    {
        super(s);
        iOrdinal = byte0;
        iUnitType = durationfieldtype;
        iRangeType = durationfieldtype1;
    }
}
