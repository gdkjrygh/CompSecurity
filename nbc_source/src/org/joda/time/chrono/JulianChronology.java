// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.SkipDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            BasicGJChronology, ZonedChronology

public final class JulianChronology extends BasicGJChronology
{

    private static final JulianChronology INSTANCE_UTC;
    private static final int MAX_YEAR = 0x116bbb60;
    private static final long MILLIS_PER_MONTH = 0x9cbf9040L;
    private static final long MILLIS_PER_YEAR = 0x758fac300L;
    private static final int MIN_YEAR = 0xee945402;
    private static final ConcurrentHashMap cCache = new ConcurrentHashMap();
    private static final long serialVersionUID = 0x86d51dd032a2ec61L;

    JulianChronology(Chronology chronology, Object obj, int i)
    {
        super(chronology, obj, i);
    }

    static int adjustYearForSet(int i)
    {
        int j = i;
        if (i <= 0)
        {
            if (i == 0)
            {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i), null, null);
            }
            j = i + 1;
        }
        return j;
    }

    public static JulianChronology getInstance()
    {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static JulianChronology getInstance(DateTimeZone datetimezone)
    {
        return getInstance(datetimezone, 4);
    }

    public static JulianChronology getInstance(DateTimeZone datetimezone, int i)
    {
        Object obj;
        DateTimeZone datetimezone1;
        Object obj1;
        datetimezone1 = datetimezone;
        if (datetimezone == null)
        {
            datetimezone1 = DateTimeZone.getDefault();
        }
        datetimezone = (JulianChronology[])cCache.get(datetimezone1);
        if (datetimezone == null)
        {
            datetimezone = new JulianChronology[7];
            JulianChronology ajulianchronology[] = (JulianChronology[])cCache.putIfAbsent(datetimezone1, datetimezone);
            if (ajulianchronology != null)
            {
                datetimezone = ajulianchronology;
            }
        }
        obj1 = datetimezone[i - 1];
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        datetimezone;
        JVM INSTR monitorenter ;
        obj1 = datetimezone[i - 1];
        obj = obj1;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        if (datetimezone1 != DateTimeZone.UTC) goto _L6; else goto _L5
_L5:
        obj = new JulianChronology(null, null, i);
          goto _L7
_L4:
        datetimezone;
        JVM INSTR monitorexit ;
_L2:
        return ((JulianChronology) (obj));
_L6:
        obj = new JulianChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, i), datetimezone1), null, i);
          goto _L7
        obj;
        datetimezone;
        JVM INSTR monitorexit ;
        throw obj;
_L7:
        datetimezone[i - 1] = obj;
        if (true) goto _L4; else goto _L8
_L8:
    }

    public static JulianChronology getInstanceUTC()
    {
        return INSTANCE_UTC;
    }

    private Object readResolve()
    {
        Chronology chronology = getBase();
        int j = getMinimumDaysInFirstWeek();
        int i = j;
        if (j == 0)
        {
            i = 4;
        }
        if (chronology == null)
        {
            return getInstance(DateTimeZone.UTC, i);
        } else
        {
            return getInstance(chronology.getZone(), i);
        }
    }

    protected void assemble(AssembledChronology.Fields fields)
    {
        if (getBase() == null)
        {
            super.assemble(fields);
            fields.year = new SkipDateTimeField(this, fields.year);
            fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
        }
    }

    long calculateFirstDayOfYearMillis(int i)
    {
        int l = i - 1968;
        if (l > 0) goto _L2; else goto _L1
_L1:
        int j = l + 3 >> 2;
_L4:
        long l1 = l;
        return ((long)j + l1 * 365L) * 0x5265c00L - 0xe71960800L;
_L2:
        int k = l >> 2;
        j = k;
        if (!isLeapYear(i))
        {
            j = k + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    long getApproxMillisAtEpochDividedByTwo()
    {
        return 0x1c453aba2980L;
    }

    long getAverageMillisPerMonth()
    {
        return 0x9cbf9040L;
    }

    long getAverageMillisPerYear()
    {
        return 0x758fac300L;
    }

    long getAverageMillisPerYearDividedByTwo()
    {
        return 0x3ac7d6180L;
    }

    long getDateMidnightMillis(int i, int j, int k)
        throws IllegalArgumentException
    {
        return super.getDateMidnightMillis(adjustYearForSet(i), j, k);
    }

    int getMaxYear()
    {
        return 0x116bbb60;
    }

    int getMinYear()
    {
        return 0xee945402;
    }

    boolean isLeapYear(int i)
    {
        return (i & 3) == 0;
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
