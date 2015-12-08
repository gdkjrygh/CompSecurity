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
//            Period, ReadableInstant

public final class Months extends BaseSingleFieldPeriod
{

    public static final Months EIGHT = new Months(8);
    public static final Months ELEVEN = new Months(11);
    public static final Months FIVE = new Months(5);
    public static final Months FOUR = new Months(4);
    public static final Months MAX_VALUE = new Months(0x7fffffff);
    public static final Months MIN_VALUE = new Months(0x80000000);
    public static final Months NINE = new Months(9);
    public static final Months ONE = new Months(1);
    private static final PeriodFormatter PARSER = ISOPeriodFormat.standard().withParseType(PeriodType.months());
    public static final Months SEVEN = new Months(7);
    public static final Months SIX = new Months(6);
    public static final Months TEN = new Months(10);
    public static final Months THREE = new Months(3);
    public static final Months TWELVE = new Months(12);
    public static final Months TWO = new Months(2);
    public static final Months ZERO = new Months(0);
    private static final long serialVersionUID = 0x136f3c648994183L;

    private Months(int i)
    {
        super(i);
    }

    public static Months months(int i)
    {
        switch (i)
        {
        default:
            return new Months(i);

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

        case 9: // '\t'
            return NINE;

        case 10: // '\n'
            return TEN;

        case 11: // '\013'
            return ELEVEN;

        case 12: // '\f'
            return TWELVE;

        case 2147483647: 
            return MAX_VALUE;

        case -2147483648: 
            return MIN_VALUE;
        }
    }

    public static Months monthsBetween(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        return months(BaseSingleFieldPeriod.between(readableinstant, readableinstant1, DurationFieldType.months()));
    }

    public static Months monthsBetween(ReadablePartial readablepartial, ReadablePartial readablepartial1)
    {
        if ((readablepartial instanceof LocalDate) && (readablepartial1 instanceof LocalDate))
        {
            return months(DateTimeUtils.getChronology(readablepartial.getChronology()).months().getDifference(((LocalDate)readablepartial1).getLocalMillis(), ((LocalDate)readablepartial).getLocalMillis()));
        } else
        {
            return months(BaseSingleFieldPeriod.between(readablepartial, readablepartial1, ZERO));
        }
    }

    public static Months monthsIn(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            return ZERO;
        } else
        {
            return months(BaseSingleFieldPeriod.between(readableinterval.getStart(), readableinterval.getEnd(), DurationFieldType.months()));
        }
    }

    public static Months parseMonths(String s)
    {
        if (s == null)
        {
            return ZERO;
        } else
        {
            return months(PARSER.parsePeriod(s).getMonths());
        }
    }

    private Object readResolve()
    {
        return months(getValue());
    }

    public Months dividedBy(int i)
    {
        if (i == 1)
        {
            return this;
        } else
        {
            return months(getValue() / i);
        }
    }

    public DurationFieldType getFieldType()
    {
        return DurationFieldType.months();
    }

    public int getMonths()
    {
        return getValue();
    }

    public PeriodType getPeriodType()
    {
        return PeriodType.months();
    }

    public boolean isGreaterThan(Months months1)
    {
        if (months1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() <= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() <= months1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean isLessThan(Months months1)
    {
        if (months1 != null) goto _L2; else goto _L1
_L1:
        if (getValue() >= 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (getValue() >= months1.getValue())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Months minus(int i)
    {
        return plus(FieldUtils.safeNegate(i));
    }

    public Months minus(Months months1)
    {
        if (months1 == null)
        {
            return this;
        } else
        {
            return minus(months1.getValue());
        }
    }

    public Months multipliedBy(int i)
    {
        return months(FieldUtils.safeMultiply(getValue(), i));
    }

    public Months negated()
    {
        return months(FieldUtils.safeNegate(getValue()));
    }

    public Months plus(int i)
    {
        if (i == 0)
        {
            return this;
        } else
        {
            return months(FieldUtils.safeAdd(getValue(), i));
        }
    }

    public Months plus(Months months1)
    {
        if (months1 == null)
        {
            return this;
        } else
        {
            return plus(months1.getValue());
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("P").append(String.valueOf(getValue())).append("M").toString();
    }

}
