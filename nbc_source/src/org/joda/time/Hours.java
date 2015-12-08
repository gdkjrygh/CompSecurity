// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//            PeriodType, DurationFieldType, LocalTime, ReadablePartial, 
//            DateTimeUtils, Chronology, DurationField, ReadableInterval, 
//            Period, Days, Duration, Minutes, 
//            Seconds, Weeks, ReadableInstant, ReadablePeriod

public final class Hours extends BaseSingleFieldPeriod
{

    public static final Hours EIGHT = new Hours(8);
    public static final Hours FIVE = new Hours(5);
    public static final Hours FOUR = new Hours(4);
    public static final Hours MAX_VALUE = new Hours(0x7fffffff);
    public static final Hours MIN_VALUE = new Hours(0x80000000);
    public static final Hours ONE = new Hours(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.hours());
    public static final Hours SEVEN = new Hours(7);
    public static final Hours SIX = new Hours(6);
    public static final Hours THREE = new Hours(3);
    public static final Hours TWO = new Hours(2);
    public static final Hours ZERO = new Hours(0);
    private static final long serialVersionUID = 0x136f3c648994180L;

    private Hours(int i)
    {
        super(i);
    }

    public static Hours hours(int i)
    {
        switch (i)
        {
        default:
            return new Hours(i);

        case 0: // '\0'
            return ZERO;

        case 1: // '\001'
            return ONE;

        case 2: // '\002'
            return TWO;

        case 3: // '\003'
            return THREE;

        case 4: // '\004'
            return FOUR;

        case 5: // '\005'
            return FIVE;

        case 6: // '\006'
            return SIX;

        case 7: // '\007'
            return SEVEN;

        case 8: // '\b'
            return EIGHT;

        case 2147483647: 
            return MAX_VALUE;

        case -2147483648: 
            return MIN_VALUE;
        }
    }

    public static Hours hoursBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        return hours(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.hours()));
    }

    public static Hours hoursBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
    {
        if ((readablepartial instanceof LocalTime) && (readablepartial1 instanceof LocalTime))
        {
            return hours(DateTimeUtils.getChronology(readablepartial.getChronology()).hours().getDifference(((LocalTime)readablepartial1).getLocalMillis(), ((LocalTime)readablepartial).getLocalMillis()));
        } else
        {
            return hours(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ZERO));
        }
    }

    public static Hours hoursIn(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            return ZERO;
        } else
        {
            return hours(BaseSingleFieldPeriod.between(readableinterval.getStart(), readableinterval.getEnd(), DurationFieldType.hours()));
        }
    }

    public static Hours parseHours(String s)
    {
        if (s == null)
        {
            return ZERO;
        } else
        {
            return hours(PARSER.parsePeriod(s).getHours());
        }
    }

    private Object readResolve()
    {
        return hours(getValue());
    }

    public static Hours standardHoursIn(ReadablePeriod readableperiod)
    {
        return hours(BaseSingleFieldPeriod.standardPeriodIn(readableperiod, 0x36ee80L));
    }

    public Hours dividedBy(int i)
    {
        if (i == 1)
        {
            return this;
        } else
        {
            return hours(getValue() / i);
        }
    }

    public DurationFieldType getFieldType()
    {
        return DurationFieldType.hours();
    }

    public int getHours()
    {
        return getValue();
    }

    public PeriodType getPeriodType()
    {
        return PeriodType.hours();
    }

    public boolean isGreaterThan(Hours hours1)
    {
        if (hours1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() <= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() <= hours1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isLessThan(Hours hours1)
    {
        if (hours1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() >= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() >= hours1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Hours minus(int i)
    {
        return plus(FieldUtils.safeNegate(i));
    }

    public Hours minus(Hours hours1)
    {
        if (hours1 == null)
        {
            return this;
        } else
        {
            return minus(hours1.getValue());
        }
    }

    public Hours multipliedBy(int i)
    {
        return hours(FieldUtils.safeMultiply(getValue(), i));
    }

    public Hours negated()
    {
        return hours(FieldUtils.safeNegate(getValue()));
    }

    public Hours plus(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return hours(FieldUtils.safeAdd(getValue(), i));
        }
    }

    public Hours plus(Hours hours1)
    {
        if (hours1 == null)
        {
            return this;
        } else
        {
            return plus(hours1.getValue());
        }
    }

    public Days toStandardDays()
    {
        return Days.days(getValue() / 24);
    }

    public Duration toStandardDuration()
    {
        return new Duration((long)getValue() * 0x36ee80L);
    }

    public Minutes toStandardMinutes()
    {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 60));
    }

    public Seconds toStandardSeconds()
    {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 3600));
    }

    public Weeks toStandardWeeks()
    {
        return Weeks.weeks(getValue() / 168);
    }

    public String toString()
    {
        return (new StringBuilder()).append("PT").append(String.valueOf(getValue())).append("H").toString();
    }

}
