// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.chrono;

import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.field.SkipDateTimeField;

// Referenced classes of package org.joda.time.chrono:
//            BasicFixedMonthChronology, BasicSingleEraDateTimeField, LimitChronology, ZonedChronology, 
//            BasicMonthOfYearDateTimeField

public final class EthiopicChronology extends BasicFixedMonthChronology
{

    public static final int EE = 1;
    private static final DateTimeField ERA_FIELD = new BasicSingleEraDateTimeField("EE");
    private static final EthiopicChronology INSTANCE_UTC;
    private static final int MAX_YEAR = 0x116bbb58;
    private static final int MIN_YEAR = 0xee9452e7;
    private static final ConcurrentHashMap cCache = new ConcurrentHashMap();
    private static final long serialVersionUID = 0xad1c562c07f1078aL;

    EthiopicChronology(Chronology chronology, Object obj, int i)
    {
        super(chronology, obj, i);
    }

    public static EthiopicChronology getInstance()
    {
        return getInstance(DateTimeZone.getDefault(), 4);
    }

    public static EthiopicChronology getInstance(DateTimeZone datetimezone)
    {
        return getInstance(datetimezone, 4);
    }

    public static EthiopicChronology getInstance(DateTimeZone datetimezone, int i)
    {
        Object obj;
        DateTimeZone datetimezone1;
        Object obj1;
        datetimezone1 = datetimezone;
        if (datetimezone == null)
        {
            datetimezone1 = DateTimeZone.getDefault();
        }
        datetimezone = (EthiopicChronology[])cCache.get(datetimezone1);
        if (datetimezone == null)
        {
            datetimezone = new EthiopicChronology[7];
            EthiopicChronology aethiopicchronology[] = (EthiopicChronology[])cCache.putIfAbsent(datetimezone1, datetimezone);
            if (aethiopicchronology != null)
            {
                datetimezone = aethiopicchronology;
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
        obj = new EthiopicChronology(null, null, i);
        obj = new EthiopicChronology(LimitChronology.getInstance(((Chronology) (obj)), new DateTime(1, 1, 1, 0, 0, 0, 0, ((Chronology) (obj))), null), null, i);
          goto _L7
_L4:
        datetimezone;
        JVM INSTR monitorexit ;
_L2:
        return ((EthiopicChronology) (obj));
_L6:
        obj = new EthiopicChronology(ZonedChronology.getInstance(getInstance(DateTimeZone.UTC, i), datetimezone1), null, i);
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

    public static EthiopicChronology getInstanceUTC()
    {
        return INSTANCE_UTC;
    }

    private Object readResolve()
    {
        Chronology chronology = getBase();
        if (chronology == null)
        {
            return getInstance(DateTimeZone.UTC, getMinimumDaysInFirstWeek());
        } else
        {
            return getInstance(chronology.getZone(), getMinimumDaysInFirstWeek());
        }
    }

    protected void assemble(AssembledChronology.Fields fields)
    {
        if (getBase() == null)
        {
            super.assemble(fields);
            fields.year = new SkipDateTimeField(this, fields.year);
            fields.weekyear = new SkipDateTimeField(this, fields.weekyear);
            fields.era = ERA_FIELD;
            fields.monthOfYear = new BasicMonthOfYearDateTimeField(this, 13);
            fields.months = fields.monthOfYear.getDurationField();
        }
    }

    long calculateFirstDayOfYearMillis(int i)
    {
        int l = i - 1963;
        if (l > 0) goto _L2; else goto _L1
_L1:
        int j = l + 3 >> 2;
_L4:
        long l1 = l;
        return ((long)j + l1 * 365L) * 0x5265c00L + 0x516e8ec00L;
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
        return 0x1c2919515f00L;
    }

    int getMaxYear()
    {
        return 0x116bbb58;
    }

    int getMinYear()
    {
        return 0xee9452e7;
    }

    boolean isLeapDay(long l)
    {
        return dayOfMonth().get(l) == 6 && monthOfYear().isLeap(l);
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
