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
//            Period, Days, Duration, Hours, 
//            Seconds, Weeks, ReadableInstant, ReadablePeriod

public final class Minutes extends BaseSingleFieldPeriod
{

    public static final Minutes MAX_VALUE = new Minutes(0x7fffffff);
    public static final Minutes MIN_VALUE = new Minutes(0x80000000);
    public static final Minutes ONE = new Minutes(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.minutes());
    public static final Minutes THREE = new Minutes(3);
    public static final Minutes TWO = new Minutes(2);
    public static final Minutes ZERO = new Minutes(0);
    private static final long serialVersionUID = 0x136f3c64899417fL;

    private Minutes(int i)
    {
        super(i);
    }

    public static Minutes minutes(int i)
    {
        switch (i)
        {
        default:
            return new Minutes(i);

        case 0: // '\0'
            return ZERO;

        case 1: // '\001'
            return ONE;

        case 2: // '\002'
            return TWO;

        case 3: // '\003'
            return THREE;

        case 2147483647: 
            return MAX_VALUE;

        case -2147483648: 
            return MIN_VALUE;
        }
    }

    public static Minutes minutesBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        return minutes(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.minutes()));
    }

    public static Minutes minutesBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
    {
        if ((readablepartial instanceof LocalTime) && (readablepartial1 instanceof LocalTime))
        {
            return minutes(DateTimeUtils.getChronology(readablepartial.getChronology()).minutes().getDifference(((LocalTime)readablepartial1).getLocalMillis(), ((LocalTime)readablepartial).getLocalMillis()));
        } else
        {
            return minutes(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ZERO));
        }
    }

    public static Minutes minutesIn(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            return ZERO;
        } else
        {
            return minutes(BaseSingleFieldPeriod.between(readableinterval.getStart(), readableinterval.getEnd(), DurationFieldType.minutes()));
        }
    }

    public static Minutes parseMinutes(String s)
    {
        if (s == null)
        {
            return ZERO;
        } else
        {
            return minutes(PARSER.parsePeriod(s).getMinutes());
        }
    }

    private Object readResolve()
    {
        return minutes(getValue());
    }

    public static Minutes standardMinutesIn(ReadablePeriod readableperiod)
    {
        return minutes(BaseSingleFieldPeriod.standardPeriodIn(readableperiod, 60000L));
    }

    public Minutes dividedBy(int i)
    {
        if (i == 1)
        {
            return this;
        } else
        {
            return minutes(getValue() / i);
        }
    }

    public DurationFieldType getFieldType()
    {
        return DurationFieldType.minutes();
    }

    public int getMinutes()
    {
        return getValue();
    }

    public PeriodType getPeriodType()
    {
        return PeriodType.minutes();
    }

    public boolean isGreaterThan(Minutes minutes1)
    {
        if (minutes1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() <= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() <= minutes1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isLessThan(Minutes minutes1)
    {
        if (minutes1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() >= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() >= minutes1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Minutes minus(int i)
    {
        return plus(FieldUtils.safeNegate(i));
    }

    public Minutes minus(Minutes minutes1)
    {
        if (minutes1 == null)
        {
            return this;
        } else
        {
            return minus(minutes1.getValue());
        }
    }

    public Minutes multipliedBy(int i)
    {
        return minutes(FieldUtils.safeMultiply(getValue(), i));
    }

    public Minutes negated()
    {
        return minutes(FieldUtils.safeNegate(getValue()));
    }

    public Minutes plus(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return minutes(FieldUtils.safeAdd(getValue(), i));
        }
    }

    public Minutes plus(Minutes minutes1)
    {
        if (minutes1 == null)
        {
            return this;
        } else
        {
            return plus(minutes1.getValue());
        }
    }

    public Days toStandardDays()
    {
        return Days.days(getValue() / 1440);
    }

    public Duration toStandardDuration()
    {
        return new Duration((long)getValue() * 60000L);
    }

    public Hours toStandardHours()
    {
        return Hours.hours(getValue() / 60);
    }

    public Seconds toStandardSeconds()
    {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 60));
    }

    public Weeks toStandardWeeks()
    {
        return Weeks.weeks(getValue() / 10080);
    }

    public String toString()
    {
        return (new StringBuilder()).append("PT").append(String.valueOf(getValue())).append("M").toString();
    }

}
