// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time:
//            ReadWritableInterval, DateTimeUtils, ReadableInterval, Chronology, 
//            ReadableDuration, ReadableInstant, ReadablePeriod

public class MutableInterval extends BaseInterval
    implements Serializable, Cloneable, ReadWritableInterval
{

    private static final long serialVersionUID = 0xacf8bd3f64a74e4aL;

    public MutableInterval()
    {
        super(0L, 0L, null);
    }

    public MutableInterval(long l, long l1)
    {
        super(l, l1, null);
    }

    public MutableInterval(long l, long l1, Chronology chronology)
    {
        super(l, l1, chronology);
    }

    public MutableInterval(Object obj)
    {
        super(obj, null);
    }

    public MutableInterval(Object obj, Chronology chronology)
    {
        super(obj, chronology);
    }

    public MutableInterval(ReadableDuration readableduration, ReadableInstant readableinstant)
    {
        super(readableduration, readableinstant);
    }

    public MutableInterval(ReadableInstant readableinstant, ReadableDuration readableduration)
    {
        super(readableinstant, readableduration);
    }

    public MutableInterval(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        super(readableinstant, readableinstant1);
    }

    public MutableInterval(ReadableInstant readableinstant, ReadablePeriod readableperiod)
    {
        super(readableinstant, readableperiod);
    }

    public MutableInterval(ReadablePeriod readableperiod, ReadableInstant readableinstant)
    {
        super(readableperiod, readableinstant);
    }

    public static MutableInterval parse(String s)
    {
        return new MutableInterval(s);
    }

    public Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError("Clone error");
        }
        return obj;
    }

    public MutableInterval copy()
    {
        return (MutableInterval)clone();
    }

    public void setChronology(Chronology chronology)
    {
        super.setInterval(getStartMillis(), getEndMillis(), chronology);
    }

    public void setDurationAfterStart(long l)
    {
        setEndMillis(FieldUtils.safeAdd(getStartMillis(), l));
    }

    public void setDurationAfterStart(ReadableDuration readableduration)
    {
        long l = DateTimeUtils.getDurationMillis(readableduration);
        setEndMillis(FieldUtils.safeAdd(getStartMillis(), l));
    }

    public void setDurationBeforeEnd(long l)
    {
        setStartMillis(FieldUtils.safeAdd(getEndMillis(), -l));
    }

    public void setDurationBeforeEnd(ReadableDuration readableduration)
    {
        long l = DateTimeUtils.getDurationMillis(readableduration);
        setStartMillis(FieldUtils.safeAdd(getEndMillis(), -l));
    }

    public void setEnd(ReadableInstant readableinstant)
    {
        long l = DateTimeUtils.getInstantMillis(readableinstant);
        super.setInterval(getStartMillis(), l, getChronology());
    }

    public void setEndMillis(long l)
    {
        super.setInterval(getStartMillis(), l, getChronology());
    }

    public void setInterval(long l, long l1)
    {
        super.setInterval(l, l1, getChronology());
    }

    public void setInterval(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        if (readableinstant == null && readableinstant1 == null)
        {
            long l = DateTimeUtils.currentTimeMillis();
            setInterval(l, l);
            return;
        } else
        {
            super.setInterval(DateTimeUtils.getInstantMillis(readableinstant), DateTimeUtils.getInstantMillis(readableinstant1), DateTimeUtils.getInstantChronology(readableinstant));
            return;
        }
    }

    public void setInterval(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            throw new IllegalArgumentException("Interval must not be null");
        } else
        {
            super.setInterval(readableinterval.getStartMillis(), readableinterval.getEndMillis(), readableinterval.getChronology());
            return;
        }
    }

    public void setPeriodAfterStart(ReadablePeriod readableperiod)
    {
        if (readableperiod == null)
        {
            setEndMillis(getStartMillis());
            return;
        } else
        {
            setEndMillis(getChronology().add(readableperiod, getStartMillis(), 1));
            return;
        }
    }

    public void setPeriodBeforeEnd(ReadablePeriod readableperiod)
    {
        if (readableperiod == null)
        {
            setStartMillis(getEndMillis());
            return;
        } else
        {
            setStartMillis(getChronology().add(readableperiod, getEndMillis(), -1));
            return;
        }
    }

    public void setStart(ReadableInstant readableinstant)
    {
        super.setInterval(DateTimeUtils.getInstantMillis(readableinstant), getEndMillis(), getChronology());
    }

    public void setStartMillis(long l)
    {
        super.setInterval(l, getEndMillis(), getChronology());
    }
}
