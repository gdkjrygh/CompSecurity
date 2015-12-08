// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;

// Referenced classes of package org.joda.time.convert:
//            AbstractConverter, DurationConverter, InstantConverter, IntervalConverter, 
//            PartialConverter, PeriodConverter

class NullConverter extends AbstractConverter
    implements DurationConverter, InstantConverter, IntervalConverter, PartialConverter, PeriodConverter
{

    static final NullConverter INSTANCE = new NullConverter();

    protected NullConverter()
    {
    }

    public long getDurationMillis(Object obj)
    {
        return 0L;
    }

    public Class getSupportedType()
    {
        return null;
    }

    public void setInto(ReadWritableInterval readwritableinterval, Object obj, Chronology chronology)
    {
        readwritableinterval.setChronology(chronology);
        long l = DateTimeUtils.currentTimeMillis();
        readwritableinterval.setInterval(l, l);
    }

    public void setInto(ReadWritablePeriod readwritableperiod, Object obj, Chronology chronology)
    {
        readwritableperiod.setPeriod((Period)null);
    }

}
