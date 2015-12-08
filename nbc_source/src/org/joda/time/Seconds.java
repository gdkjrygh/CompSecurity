// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

// Referenced classes of package org.joda.time:
//            PeriodType, Period, DurationFieldType, LocalTime, 
//            ReadablePartial, DateTimeUtils, Chronology, DurationField, 
//            ReadableInterval, Days, Duration, Hours, 
//            Minutes, Weeks, ReadableInstant, ReadablePeriod

public final class Seconds extends BaseSingleFieldPeriod
{

    public static final Seconds MAX_VALUE = new Seconds(0x7fffffff);
    public static final Seconds MIN_VALUE = new Seconds(0x80000000);
    public static final Seconds ONE = new Seconds(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.seconds());
    public static final Seconds THREE = new Seconds(3);
    public static final Seconds TWO = new Seconds(2);
    public static final Seconds ZERO = new Seconds(0);
    private static final long serialVersionUID = 0x136f3c64899417eL;

    private Seconds(int i)
    {
        super(i);
    }

    public static Seconds parseSeconds(String s)
    {
        if (s == null)
        {
            return ZERO;
        } else
        {
            return seconds(PARSER.parsePeriod(s).getSeconds());
        }
    }

    private Object readResolve()
    {
        return seconds(getValue());
    }

    public static Seconds seconds(int i)
    {
        switch (i)
        {
        default:
            return new Seconds(i);

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

    public static Seconds secondsBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        return seconds(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.seconds()));
    }

    public static Seconds secondsBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
    {
        if ((readablepartial instanceof LocalTime) && (readablepartial1 instanceof LocalTime))
        {
            return seconds(DateTimeUtils.getChronology(readablepartial.getChronology()).seconds().getDifference(((LocalTime)readablepartial1).getLocalMillis(), ((LocalTime)readablepartial).getLocalMillis()));
        } else
        {
            return seconds(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ZERO));
        }
    }

    public static Seconds secondsIn(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            return ZERO;
        } else
        {
            return seconds(BaseSingleFieldPeriod.between(readableinterval.getStart(), readableinterval.getEnd(), DurationFieldType.seconds()));
        }
    }

    public static Seconds standardSecondsIn(ReadablePeriod readableperiod)
    {
        return seconds(BaseSingleFieldPeriod.standardPeriodIn(readableperiod, 1000L));
    }

    public Seconds dividedBy(int i)
    {
        if (i == 1)
        {
            return this;
        } else
        {
            return seconds(getValue() / i);
        }
    }

    public DurationFieldType getFieldType()
    {
        return DurationFieldType.seconds();
    }

    public PeriodType getPeriodType()
    {
        return PeriodType.seconds();
    }

    public int getSeconds()
    {
        return getValue();
    }

    public boolean isGreaterThan(Seconds seconds1)
    {
        if (seconds1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() <= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() <= seconds1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isLessThan(Seconds seconds1)
    {
        if (seconds1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() >= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() >= seconds1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Seconds minus(int i)
    {
        return plus(FieldUtils.safeNegate(i));
    }

    public Seconds minus(Seconds seconds1)
    {
        if (seconds1 == null)
        {
            return this;
        } else
        {
            return minus(seconds1.getValue());
        }
    }

    public Seconds multipliedBy(int i)
    {
        return seconds(FieldUtils.safeMultiply(getValue(), i));
    }

    public Seconds negated()
    {
        return seconds(FieldUtils.safeNegate(getValue()));
    }

    public Seconds plus(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return seconds(FieldUtils.safeAdd(getValue(), i));
        }
    }

    public Seconds plus(Seconds seconds1)
    {
        if (seconds1 == null)
        {
            return this;
        } else
        {
            return plus(seconds1.getValue());
        }
    }

    public Days toStandardDays()
    {
        return Days.days(getValue() / 0x15180);
    }

    public Duration toStandardDuration()
    {
        return new Duration((long)getValue() * 1000L);
    }

    public Hours toStandardHours()
    {
        return Hours.hours(getValue() / 3600);
    }

    public Minutes toStandardMinutes()
    {
        return Minutes.minutes(getValue() / 60);
    }

    public Weeks toStandardWeeks()
    {
        return Weeks.weeks(getValue() / 0x93a80);
    }

    public String toString()
    {
        return (new StringBuilder()).append("PT").append(String.valueOf(getValue())).append("S").toString();
    }

}
