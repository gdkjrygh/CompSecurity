// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//            PeriodType, Period, DurationFieldType, LocalDate, 
//            ReadablePartial, DateTimeUtils, Chronology, DurationField, 
//            ReadableInterval, Days, Duration, Hours, 
//            Minutes, Seconds, ReadablePeriod, ReadableInstant

public final class Weeks extends BaseSingleFieldPeriod
{

    public static final Weeks MAX_VALUE = new Weeks(0x7fffffff);
    public static final Weeks MIN_VALUE = new Weeks(0x80000000);
    public static final Weeks ONE = new Weeks(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.weeks());
    public static final Weeks THREE = new Weeks(3);
    public static final Weeks TWO = new Weeks(2);
    public static final Weeks ZERO = new Weeks(0);
    private static final long serialVersionUID = 0x136f3c648994182L;

    private Weeks(int i)
    {
        super(i);
    }

    public static Weeks parseWeeks(String s)
    {
        if (s == null)
        {
            return ZERO;
        } else
        {
            return weeks(PARSER.parsePeriod(s).getWeeks());
        }
    }

    private Object readResolve()
    {
        return weeks(getValue());
    }

    public static Weeks standardWeeksIn(ReadablePeriod readableperiod)
    {
        return weeks(BaseSingleFieldPeriod.standardPeriodIn(readableperiod, 0x240c8400L));
    }

    public static Weeks weeks(int i)
    {
        switch (i)
        {
        default:
            return new Weeks(i);

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

    public static Weeks weeksBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        return weeks(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.weeks()));
    }

    public static Weeks weeksBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
    {
        if ((readablepartial instanceof LocalDate) && (readablepartial1 instanceof LocalDate))
        {
            return weeks(DateTimeUtils.getChronology(readablepartial.getChronology()).weeks().getDifference(((LocalDate)readablepartial1).getLocalMillis(), ((LocalDate)readablepartial).getLocalMillis()));
        } else
        {
            return weeks(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ZERO));
        }
    }

    public static Weeks weeksIn(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            return ZERO;
        } else
        {
            return weeks(BaseSingleFieldPeriod.between(readableinterval.getStart(), readableinterval.getEnd(), DurationFieldType.weeks()));
        }
    }

    public Weeks dividedBy(int i)
    {
        if (i == 1)
        {
            return this;
        } else
        {
            return weeks(getValue() / i);
        }
    }

    public DurationFieldType getFieldType()
    {
        return DurationFieldType.weeks();
    }

    public PeriodType getPeriodType()
    {
        return PeriodType.weeks();
    }

    public int getWeeks()
    {
        return getValue();
    }

    public boolean isGreaterThan(Weeks weeks1)
    {
        if (weeks1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() <= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() <= weeks1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isLessThan(Weeks weeks1)
    {
        if (weeks1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() >= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() >= weeks1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Weeks minus(int i)
    {
        return plus(FieldUtils.safeNegate(i));
    }

    public Weeks minus(Weeks weeks1)
    {
        if (weeks1 == null)
        {
            return this;
        } else
        {
            return minus(weeks1.getValue());
        }
    }

    public Weeks multipliedBy(int i)
    {
        return weeks(FieldUtils.safeMultiply(getValue(), i));
    }

    public Weeks negated()
    {
        return weeks(FieldUtils.safeNegate(getValue()));
    }

    public Weeks plus(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return weeks(FieldUtils.safeAdd(getValue(), i));
        }
    }

    public Weeks plus(Weeks weeks1)
    {
        if (weeks1 == null)
        {
            return this;
        } else
        {
            return plus(weeks1.getValue());
        }
    }

    public Days toStandardDays()
    {
        return Days.days(FieldUtils.safeMultiply(getValue(), 7));
    }

    public Duration toStandardDuration()
    {
        return new Duration((long)getValue() * 0x240c8400L);
    }

    public Hours toStandardHours()
    {
        return Hours.hours(FieldUtils.safeMultiply(getValue(), 168));
    }

    public Minutes toStandardMinutes()
    {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 10080));
    }

    public Seconds toStandardSeconds()
    {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 0x93a80));
    }

    public String toString()
    {
        return (new StringBuilder()).append("P").append(String.valueOf(getValue())).append("W").toString();
    }

}
