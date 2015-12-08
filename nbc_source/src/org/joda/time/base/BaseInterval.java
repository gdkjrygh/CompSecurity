// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.MutableInterval;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time.base:
//            AbstractInterval

public abstract class BaseInterval extends AbstractInterval
    implements Serializable, ReadableInterval
{

    private static final long serialVersionUID = 0x80072c1bd3fbddeL;
    private volatile Chronology iChronology;
    private volatile long iEndMillis;
    private volatile long iStartMillis;

    protected BaseInterval(long l, long l1, Chronology chronology)
    {
        iChronology = DateTimeUtils.getChronology(chronology);
        checkInterval(l, l1);
        iStartMillis = l;
        iEndMillis = l1;
    }

    protected BaseInterval(Object obj, Chronology chronology)
    {
        IntervalConverter intervalconverter = ConverterManager.getInstance().getIntervalConverter(obj);
        if (intervalconverter.isReadableInterval(obj, chronology))
        {
            obj = (ReadableInterval)obj;
            if (chronology == null)
            {
                chronology = ((ReadableInterval) (obj)).getChronology();
            }
            iChronology = chronology;
            iStartMillis = ((ReadableInterval) (obj)).getStartMillis();
            iEndMillis = ((ReadableInterval) (obj)).getEndMillis();
        } else
        if (this instanceof ReadWritableInterval)
        {
            intervalconverter.setInto((ReadWritableInterval)this, obj, chronology);
        } else
        {
            MutableInterval mutableinterval = new MutableInterval();
            intervalconverter.setInto(mutableinterval, obj, chronology);
            iChronology = mutableinterval.getChronology();
            iStartMillis = mutableinterval.getStartMillis();
            iEndMillis = mutableinterval.getEndMillis();
        }
        checkInterval(iStartMillis, iEndMillis);
    }

    protected BaseInterval(ReadableDuration readableduration, ReadableInstant readableinstant)
    {
        iChronology = DateTimeUtils.getInstantChronology(readableinstant);
        iEndMillis = DateTimeUtils.getInstantMillis(readableinstant);
        long l = DateTimeUtils.getDurationMillis(readableduration);
        iStartMillis = FieldUtils.safeAdd(iEndMillis, -l);
        checkInterval(iStartMillis, iEndMillis);
    }

    protected BaseInterval(ReadableInstant readableinstant, ReadableDuration readableduration)
    {
        iChronology = DateTimeUtils.getInstantChronology(readableinstant);
        iStartMillis = DateTimeUtils.getInstantMillis(readableinstant);
        long l = DateTimeUtils.getDurationMillis(readableduration);
        iEndMillis = FieldUtils.safeAdd(iStartMillis, l);
        checkInterval(iStartMillis, iEndMillis);
    }

    protected BaseInterval(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        if (readableinstant == null && readableinstant1 == null)
        {
            long l = DateTimeUtils.currentTimeMillis();
            iEndMillis = l;
            iStartMillis = l;
            iChronology = ISOChronology.getInstance();
            return;
        } else
        {
            iChronology = DateTimeUtils.getInstantChronology(readableinstant);
            iStartMillis = DateTimeUtils.getInstantMillis(readableinstant);
            iEndMillis = DateTimeUtils.getInstantMillis(readableinstant1);
            checkInterval(iStartMillis, iEndMillis);
            return;
        }
    }

    protected BaseInterval(ReadableInstant readableinstant, ReadablePeriod readableperiod)
    {
        Chronology chronology = DateTimeUtils.getInstantChronology(readableinstant);
        iChronology = chronology;
        iStartMillis = DateTimeUtils.getInstantMillis(readableinstant);
        if (readableperiod == null)
        {
            iEndMillis = iStartMillis;
        } else
        {
            iEndMillis = chronology.add(readableperiod, iStartMillis, 1);
        }
        checkInterval(iStartMillis, iEndMillis);
    }

    protected BaseInterval(ReadablePeriod readableperiod, ReadableInstant readableinstant)
    {
        Chronology chronology = DateTimeUtils.getInstantChronology(readableinstant);
        iChronology = chronology;
        iEndMillis = DateTimeUtils.getInstantMillis(readableinstant);
        if (readableperiod == null)
        {
            iStartMillis = iEndMillis;
        } else
        {
            iStartMillis = chronology.add(readableperiod, iEndMillis, -1);
        }
        checkInterval(iStartMillis, iEndMillis);
    }

    public Chronology getChronology()
    {
        return iChronology;
    }

    public long getEndMillis()
    {
        return iEndMillis;
    }

    public long getStartMillis()
    {
        return iStartMillis;
    }

    protected void setInterval(long l, long l1, Chronology chronology)
    {
        checkInterval(l, l1);
        iStartMillis = l;
        iEndMillis = l1;
        iChronology = DateTimeUtils.getChronology(chronology);
    }
}
