// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;

// Referenced classes of package org.joda.time.chrono:
//            BasicChronology, BasicSingleEraDateTimeField, LimitChronology, ZonedChronology, 
//            BasicMonthOfYearDateTimeField

public final class IslamicChronology extends BasicChronology
{
    public static class LeapYearPatternType
        implements Serializable
    {

        private static final long serialVersionUID = 0x182cef79ec9aL;
        final byte index;
        final int pattern;

        private Object readResolve()
        {
            switch (index)
            {
            default:
                return this;

            case 0: // '\0'
                return IslamicChronology.LEAP_YEAR_15_BASED;

            case 1: // '\001'
                return IslamicChronology.LEAP_YEAR_16_BASED;

            case 2: // '\002'
                return IslamicChronology.LEAP_YEAR_INDIAN;

            case 3: // '\003'
                return IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
            }
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof LeapYearPatternType)
            {
                flag = flag1;
                if (index == ((LeapYearPatternType)obj).index)
                {
                    flag = true;
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return index;
        }

        boolean isLeapYear(int i)
        {
            return (1 << i % 30 & pattern) > 0;
        }

        LeapYearPatternType(int i, int j)
        {
            index = (byte)i;
            pattern = j;
        }
    }


    public static final int AH = 1;
    private static final int CYCLE = 30;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("AH");
    private static final IslamicChronology INSTANCE_UTC;
    public static final LeapYearPatternType LEAP_YEAR_15_BASED = new LeapYearPatternType(0, 0x2524a4a4);
    public static final LeapYearPatternType LEAP_YEAR_16_BASED = new LeapYearPatternType(1, 0x252524a4);
    public static final LeapYearPatternType LEAP_YEAR_HABASH_AL_HASIB = new LeapYearPatternType(3, 0x9292925);
    public static final LeapYearPatternType LEAP_YEAR_INDIAN = new LeapYearPatternType(2, 0x29292524);
    private static final int LONG_MONTH_LENGTH = 30;
    private static final int MAX_YEAR = 0x116bb3ae;
    private static final long MILLIS_PER_CYCLE = 0xd5dbf68400L;
    private static final long MILLIS_PER_LONG_MONTH = 0x9a7ec800L;
    private static final long MILLIS_PER_LONG_YEAR = 0x724319400L;
    private static final long MILLIS_PER_MONTH = 0x9813e400L;
    private static final long MILLIS_PER_MONTH_PAIR = 0x12fd73400L;
    private static final long MILLIS_PER_SHORT_YEAR = 0x71f0b3800L;
    private static final long MILLIS_PER_YEAR = 0x720ee9f20L;
    private static final long MILLIS_YEAR_1 = 0xffffd953abe65000L;
    private static final int MIN_YEAR = 0xee9452e7;
    private static final int MONTH_PAIR_LENGTH = 59;
    private static final int SHORT_MONTH_LENGTH = 29;
    private static final ConcurrentHashMap cCache = new ConcurrentHashMap();
    private static final long serialVersionUID = 0xfffffcaaf3150480L;
    private final LeapYearPatternType iLeapYears;

    IslamicChronology(Chronology chronology, Object obj, LeapYearPatternType leapyearpatterntype)
    {
        super(chronology, obj, 4);
        iLeapYears = leapyearpatterntype;
    }

    public static IslamicChronology getInstance()
    {
        return getInstance(DateTimeZone.getDefault(), LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone datetimezone)
    {
        return getInstance(datetimezone, LEAP_YEAR_16_BASED);
    }

    public static IslamicChronology getInstance(DateTimeZone datetimezone, LeapYearPatternType leapyearpatterntype)
    {
        Object obj;
        Object obj1;
        obj = datetimezone;
        if (datetimezone == null)
        {
            obj = DateTimeZone.getDefault();
        }
        datetimezone = (IslamicChronology[])cCache.get(obj);
        if (datetimezone == null)
        {
            datetimezone = new IslamicChronology[4];
            IslamicChronology aislamicchronology[] = (IslamicChronology[])cCache.putIfAbsent(obj, datetimezone);
            if (aislamicchronology != null)
            {
                datetimezone = aislamicchronology;
            }
        }
        obj1 = datetimezone[leapyearpatterntype.index];
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        datetimezone;
        JVM INSTR monitorenter ;
        Object obj2 = datetimezone[leapyearpatterntype.index];
        obj1 = obj2;
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        if (obj != DateTimeZone.UTC)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        obj = new IslamicChronology(null, null, leapyearpatterntype);
        obj = new IslamicChronology(LimitChronology.getInstance(((Chronology) (obj)), new DateTime(1, 1, 1, 0, 0, 0, 0, ((Chronology) (obj))), null), null, leapyearpatterntype);
_L3:
        datetimezone[leapyearpatterntype.index] = obj;
        obj1 = obj;
_L2:
        datetimezone;
        JVM INSTR monitorexit ;
        return ((IslamicChronology) (obj1));
        obj = new IslamicChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, leapyearpatterntype), ((DateTimeZone) (obj))), null, leapyearpatterntype);
          goto _L3
        leapyearpatterntype;
        datetimezone;
        JVM INSTR monitorexit ;
        throw leapyearpatterntype;
        return ((IslamicChronology) (obj1));
    }

    public static IslamicChronology getInstanceUTC()
    {
        return INSTANCE_UTC;
    }

    private Object readResolve()
    {
        Chronology chronology = getBase();
        if (chronology == null)
        {
            return getInstanceUTC();
        } else
        {
            return getInstance(chronology.getZone());
        }
    }

    protected void assemble(AssembledChronology.Fields fields)
    {
        if (getBase() == null)
        {
            super.assemble(fields);
            fields.era = ERA_FIELD;
            fields.monthOfYear = new BasicMonthOfYearDateTimeField(this, 12);
            fields.months = fields.monthOfYear.getDurationField();
        }
    }

    long calculateFirstDayOfYearMillis(int i)
    {
        if (i > 0x116bb3ae)
        {
            throw new ArithmeticException((new StringBuilder()).append("Year is too large: ").append(i).append(" > ").append(0x116bb3ae).toString());
        }
        if (i < 0xee9452e7)
        {
            throw new ArithmeticException((new StringBuilder()).append("Year is too small: ").append(i).append(" < ").append(0xee9452e7).toString());
        }
        int j = i - 1;
        long l = (long)(j / 30) * 0xd5dbf68400L - 0x26ac5419b000L;
        i = 1;
        while (i < j % 30 + 1) 
        {
            long l1;
            if (isLeapYear(i))
            {
                l1 = 0x724319400L;
            } else
            {
                l1 = 0x71f0b3800L;
            }
            l += l1;
            i++;
        }
        return l;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof IslamicChronology)
        {
            IslamicChronology islamicchronology = (IslamicChronology)obj;
            boolean flag;
            if (getLeapYearPatternType().index == islamicchronology.getLeapYearPatternType().index && super.equals(obj))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        } else
        {
            return false;
        }
    }

    long getApproxMillisAtEpochDividedByTwo()
    {
        return 0x13562a0cd800L;
    }

    long getAverageMillisPerMonth()
    {
        return 0x9813e400L;
    }

    long getAverageMillisPerYear()
    {
        return 0x720ee9f20L;
    }

    long getAverageMillisPerYearDividedByTwo()
    {
        return 0x390774f90L;
    }

    int getDayOfMonth(long l)
    {
        int i = getDayOfYear(l) - 1;
        if (i == 354)
        {
            return 30;
        } else
        {
            return i % 59 % 30 + 1;
        }
    }

    int getDaysInMonthMax()
    {
        return 30;
    }

    int getDaysInMonthMax(int i)
    {
        while (i == 12 || (i - 1) % 2 == 0) 
        {
            return 30;
        }
        return 29;
    }

    int getDaysInYear(int i)
    {
        return !isLeapYear(i) ? 354 : 355;
    }

    int getDaysInYearMax()
    {
        return 355;
    }

    int getDaysInYearMonth(int i, int j)
    {
        while (j == 12 && isLeapYear(i) || (j - 1) % 2 == 0) 
        {
            return 30;
        }
        return 29;
    }

    public LeapYearPatternType getLeapYearPatternType()
    {
        return iLeapYears;
    }

    int getMaxYear()
    {
        return 0x116bb3ae;
    }

    int getMinYear()
    {
        return 1;
    }

    int getMonthOfYear(long l, int i)
    {
        i = (int)((l - getYearMillis(i)) / 0x5265c00L);
        if (i == 354)
        {
            return 12;
        } else
        {
            return (i * 2) / 59 + 1;
        }
    }

    long getTotalMillisByYearMonth(int i, int j)
    {
        i = j - 1;
        if (i % 2 == 1)
        {
            return (long)(i / 2) * 0x12fd73400L + 0x9a7ec800L;
        } else
        {
            return (long)(i / 2) * 0x12fd73400L;
        }
    }

    int getYear(long l)
    {
        long l1 = l + 0x26ac5419b000L;
        l = l1 / 0xd5dbf68400L;
        l1 %= 0xd5dbf68400L;
        int i = (int)(30L * l + 1L);
        if (isLeapYear(i))
        {
            l = 0x724319400L;
        } else
        {
            l = 0x71f0b3800L;
        }
        while (l1 >= l) 
        {
            l1 -= l;
            i++;
            if (isLeapYear(i))
            {
                l = 0x724319400L;
            } else
            {
                l = 0x71f0b3800L;
            }
        }
        return i;
    }

    long getYearDifference(long l, long l1)
    {
        int i = getYear(l);
        int j = getYear(l1);
        long l2 = getYearMillis(i);
        long l3 = getYearMillis(j);
        j = i - j;
        i = j;
        if (l - l2 < l1 - l3)
        {
            i = j - 1;
        }
        return (long)i;
    }

    public int hashCode()
    {
        return super.hashCode() * 13 + getLeapYearPatternType().hashCode();
    }

    boolean isLeapYear(int i)
    {
        return iLeapYears.isLeapYear(i);
    }

    long setYear(long l, int i)
    {
        int k = getDayOfYear(l, getYear(l));
        int i1 = getMillisOfDay(l);
        int j = k;
        if (k > 354)
        {
            j = k;
            if (!isLeapYear(i))
            {
                j = k - 1;
            }
        }
        l = getYearMonthDayMillis(i, 1, j);
        return (long)i1 + l;
    }

    public Chronology withUTC()
    {
        return INSTANCE_UTC;
    }

    public Chronology withZone(DateTimeZone datetimezone)
    {
        DateTimeZone datetimezone1 = datetimezone;
        if (datetimezone == null)
        {
            datetimezone1 = DateTimeZone.getDefault();
        }
        if (datetimezone1 == getZone())
        {
            return this;
        } else
        {
            return getInstance(datetimezone1);
        }
    }

    static 
    {
        INSTANCE_UTC = getInstance(DateTimeZone.UTC);
    }
}
