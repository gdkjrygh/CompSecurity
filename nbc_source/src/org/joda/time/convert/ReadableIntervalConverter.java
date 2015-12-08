// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableInterval;

// Referenced classes of package org.joda.time.convert:
//            AbstractConverter, DurationConverter, IntervalConverter, PeriodConverter

class ReadableIntervalConverter extends AbstractConverter
    implements DurationConverter, IntervalConverter, PeriodConverter
{

    static final ReadableIntervalConverter INSTANCE = new ReadableIntervalConverter();

    protected ReadableIntervalConverter()
    {
    }

    public long getDurationMillis(Object obj)
    {
        return ((ReadableInterval)obj).toDurationMillis();
    }

    public Class getSupportedType()
    {
        return org/joda/time/ReadableInterval;
    }

    public boolean isReadableInterval(Object obj, Chronology chronology)
    {
        return true;
    }

    public void setInto(ReadWritableInterval readwritableinterval, Object obj, Chronology chronology)
    {
        obj = (ReadableInterval)obj;
        readwritableinterval.setInterval(((ReadableInterval) (obj)));
        if (chronology != null)
        {
            readwritableinterval.setChronology(chronology);
            return;
        } else
        {
            readwritableinterval.setChronology(((ReadableInterval) (obj)).getChronology());
            return;
        }
    }

    public void setInto(ReadWritablePeriod readwritableperiod, Object obj, Chronology chronology)
    {
        obj = (ReadableInterval)obj;
        if (chronology == null)
        {
            chronology = DateTimeUtils.getIntervalChronology(((ReadableInterval) (obj)));
        }
        obj = chronology.get(readwritableperiod, ((ReadableInterval) (obj)).getStartMillis(), ((ReadableInterval) (obj)).getEndMillis());
        for (int i = 0; i < obj.length; i++)
        {
            readwritableperiod.setValue(i, obj[i]);
        }

    }

}
