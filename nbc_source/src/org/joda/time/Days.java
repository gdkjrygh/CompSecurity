// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//            PeriodType, DurationFieldType, LocalDate, ReadablePartial, 
//            DateTimeUtils, Chronology, DurationField, ReadableInterval, 
//            Period, Duration, Hours, Minutes, 
//            Seconds, Weeks, ReadableInstant, ReadablePeriod

public final class Days extends BaseSingleFieldPeriod
{

    public static final Days FIVE = new Days(5);
    public static final Days FOUR = new Days(4);
    public static final Days MAX_VALUE = new Days(0x7fffffff);
    public static final Days MIN_VALUE = new Days(0x80000000);
    public static final Days ONE = new Days(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.days());
    public static final Days SEVEN = new Days(7);
    public static final Days SIX = new Days(6);
    public static final Days THREE = new Days(3);
    public static final Days TWO = new Days(2);
    public static final Days ZERO = new Days(0);
    private static final long serialVersionUID = 0x136f3c648994181L;

    private Days(int i)
    {
        super(i);
    }

    public static Days days(int i)
    {
        switch (i)
        {
        default:
            return new Days(i);

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

        case 2147483647: 
            return MAX_VALUE;

        case -2147483648: 
            return MIN_VALUE;
        }
    }

    public static Days daysBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        return days(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.days()));
    }

    public static Days daysBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
    {
        if ((readablepartial instanceof LocalDate) && (readablepartial1 instanceof LocalDate))
        {
            return days(DateTimeUtils.getChronology(readablepartial.getChronology()).days().getDifference(((LocalDate)readablepartial1).getLocalMillis(), ((LocalDate)readablepartial).getLocalMillis()));
        } else
        {
            return days(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ZERO));
        }
    }

    public static Days daysIn(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            return ZERO;
        } else
        {
            return days(BaseSingleFieldPeriod.between(readableinterval.getStart(), readableinterval.getEnd(), DurationFieldType.days()));
        }
    }

    public static Days parseDays(String s)
    {
        if (s == null)
        {
            return ZERO;
        } else
        {
            return days(PARSER.parsePeriod(s).getDays());
        }
    }

    private Object readResolve()
    {
        return days(getValue());
    }

    public static Days standardDaysIn(ReadablePeriod readableperiod)
    {
        return days(BaseSingleFieldPeriod.standardPeriodIn(readableperiod, 0x5265c00L));
    }

    public Days dividedBy(int i)
    {
        if (i == 1)
        {
            return this;
        } else
        {
            return days(getValue() / i);
        }
    }

    public int getDays()
    {
        return getValue();
    }

    public DurationFieldType getFieldType()
    {
        return DurationFieldType.days();
    }

    public PeriodType getPeriodType()
    {
        return PeriodType.days();
    }

    public boolean isGreaterThan(Days days1)
    {
        if (days1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() <= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() <= days1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isLessThan(Days days1)
    {
        if (days1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() >= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() >= days1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Days minus(int i)
    {
        return plus(FieldUtils.safeNegate(i));
    }

    public Days minus(Days days1)
    {
        if (days1 == null)
        {
            return this;
        } else
        {
            return minus(days1.getValue());
        }
    }

    public Days multipliedBy(int i)
    {
        return days(FieldUtils.safeMultiply(getValue(), i));
    }

    public Days negated()
    {
        return days(FieldUtils.safeNegate(getValue()));
    }

    public Days plus(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return days(FieldUtils.safeAdd(getValue(), i));
        }
    }

    public Days plus(Days days1)
    {
        if (days1 == null)
        {
            return this;
        } else
        {
            return plus(days1.getValue());
        }
    }

    public Duration toStandardDuration()
    {
        return new Duration((long)getValue() * 0x5265c00L);
    }

    public Hours toStandardHours()
    {
        return Hours.hours(FieldUtils.safeMultiply(getValue(), 24));
    }

    public Minutes toStandardMinutes()
    {
        return Minutes.minutes(FieldUtils.safeMultiply(getValue(), 1440));
    }

    public Seconds toStandardSeconds()
    {
        return Seconds.seconds(FieldUtils.safeMultiply(getValue(), 0x15180));
    }

    public Weeks toStandardWeeks()
    {
        return Weeks.weeks(getValue() / 7);
    }

    public String toString()
    {
        return (new StringBuilder()).append("P").append(String.valueOf(getValue())).append("D").toString();
    }

}
