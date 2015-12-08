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
//            ReadableInterval, ReadableInstant

public final class Years extends BaseSingleFieldPeriod
{

    public static final Years MAX_VALUE = new Years(0x7fffffff);
    public static final Years MIN_VALUE = new Years(0x80000000);
    public static final Years ONE = new Years(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.years());
    public static final Years THREE = new Years(3);
    public static final Years TWO = new Years(2);
    public static final Years ZERO = new Years(0);
    private static final long serialVersionUID = 0x136f3c648994184L;

    private Years(int i)
    {
        super(i);
    }

    public static Years parseYears(String s)
    {
        if (s == null)
        {
            return ZERO;
        } else
        {
            return years(PARSER.parsePeriod(s).getYears());
        }
    }

    private Object readResolve()
    {
        return years(getValue());
    }

    public static Years years(int i)
    {
        switch (i)
        {
        default:
            return new Years(i);

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

    public static Years yearsBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        return years(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.years()));
    }

    public static Years yearsBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
    {
        if ((readablepartial instanceof LocalDate) && (readablepartial1 instanceof LocalDate))
        {
            return years(DateTimeUtils.getChronology(readablepartial.getChronology()).years().getDifference(((LocalDate)readablepartial1).getLocalMillis(), ((LocalDate)readablepartial).getLocalMillis()));
        } else
        {
            return years(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ZERO));
        }
    }

    public static Years yearsIn(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            return ZERO;
        } else
        {
            return years(BaseSingleFieldPeriod.between(readableinterval.getStart(), readableinterval.getEnd(), DurationFieldType.years()));
        }
    }

    public Years dividedBy(int i)
    {
        if (i == 1)
        {
            return this;
        } else
        {
            return years(getValue() / i);
        }
    }

    public DurationFieldType getFieldType()
    {
        return DurationFieldType.years();
    }

    public PeriodType getPeriodType()
    {
        return PeriodType.years();
    }

    public int getYears()
    {
        return getValue();
    }

    public boolean isGreaterThan(Years years1)
    {
        if (years1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() <= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() <= years1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isLessThan(Years years1)
    {
        if (years1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() >= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() >= years1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Years minus(int i)
    {
        return plus(FieldUtils.safeNegate(i));
    }

    public Years minus(Years years1)
    {
        if (years1 == null)
        {
            return this;
        } else
        {
            return minus(years1.getValue());
        }
    }

    public Years multipliedBy(int i)
    {
        return years(FieldUtils.safeMultiply(getValue(), i));
    }

    public Years negated()
    {
        return years(FieldUtils.safeNegate(getValue()));
    }

    public Years plus(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return years(FieldUtils.safeAdd(getValue(), i));
        }
    }

    public Years plus(Years years1)
    {
        if (years1 == null)
        {
            return this;
        } else
        {
            return plus(years1.getValue());
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("P").append(String.valueOf(getValue())).append("Y").toString();
    }

}
