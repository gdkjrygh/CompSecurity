// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.chrono.ISOChronology;

// Referenced classes of package org.joda.time:
//            ReadableInterval, DateTimeUtils, Chronology, DateTimeZone, 
//            ReadableDuration, ReadableInstant, ReadablePeriod

public final class Interval extends BaseInterval
    implements Serializable, ReadableInterval
{

    private static final long serialVersionUID = 0x44500feba8e6e200L;

    public Interval(long l, long l1)
    {
        super(l, l1, null);
    }

    public Interval(long l, long l1, Chronology chronology)
    {
        super(l, l1, chronology);
    }

    public Interval(long l, long l1, DateTimeZone datetimezone)
    {
        super(l, l1, ISOChronology.getInstance(datetimezone));
    }

    public Interval(Object obj)
    {
        super(obj, null);
    }

    public Interval(Object obj, Chronology chronology)
    {
        super(obj, chronology);
    }

    public Interval(ReadableDuration readableduration, ReadableInstant readableinstant)
    {
        super(readableduration, readableinstant);
    }

    public Interval(ReadableInstant readableinstant, ReadableDuration readableduration)
    {
        super(readableinstant, readableduration);
    }

    public Interval(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        super(readableinstant, readableinstant1);
    }

    public Interval(ReadableInstant readableinstant, ReadablePeriod readableperiod)
    {
        super(readableinstant, readableperiod);
    }

    public Interval(ReadablePeriod readableperiod, ReadableInstant readableinstant)
    {
        super(readableperiod, readableinstant);
    }

    public static Interval parse(String s)
    {
        return new Interval(s);
    }

    public boolean abuts(ReadableInterval readableinterval)
    {
        boolean flag = false;
        if (readableinterval == null)
        {
            long l = DateTimeUtils.currentTimeMillis();
            if (getStartMillis() == l || getEndMillis() == l)
            {
                flag = true;
            }
        } else
        if (readableinterval.getEndMillis() == getStartMillis() || getEndMillis() == readableinterval.getStartMillis())
        {
            return true;
        }
        return flag;
    }

    public Interval gap(ReadableInterval readableinterval)
    {
        readableinterval = DateTimeUtils.getReadableInterval(readableinterval);
        long l = readableinterval.getStartMillis();
        long l1 = readableinterval.getEndMillis();
        long l2 = getStartMillis();
        long l3 = getEndMillis();
        if (l2 > l1)
        {
            return new Interval(l1, l2, getChronology());
        }
        if (l > l3)
        {
            return new Interval(l3, l, getChronology());
        } else
        {
            return null;
        }
    }

    public Interval overlap(ReadableInterval readableinterval)
    {
        readableinterval = DateTimeUtils.getReadableInterval(readableinterval);
        if (!overlaps(readableinterval))
        {
            return null;
        } else
        {
            return new Interval(Math.max(getStartMillis(), readableinterval.getStartMillis()), Math.min(getEndMillis(), readableinterval.getEndMillis()), getChronology());
        }
    }

    public Interval toInterval()
    {
        return this;
    }

    public Interval withChronology(Chronology chronology)
    {
        if (getChronology() == chronology)
        {
            return this;
        } else
        {
            return new Interval(getStartMillis(), getEndMillis(), chronology);
        }
    }

    public Interval withDurationAfterStart(ReadableDuration readableduration)
    {
        long l = DateTimeUtils.getDurationMillis(readableduration);
        if (l == toDurationMillis())
        {
            return this;
        } else
        {
            readableduration = getChronology();
            long l1 = getStartMillis();
            return new Interval(l1, readableduration.add(l1, l, 1), readableduration);
        }
    }

    public Interval withDurationBeforeEnd(ReadableDuration readableduration)
    {
        long l = DateTimeUtils.getDurationMillis(readableduration);
        if (l == toDurationMillis())
        {
            return this;
        } else
        {
            readableduration = getChronology();
            long l1 = getEndMillis();
            return new Interval(readableduration.add(l1, l, -1), l1, readableduration);
        }
    }

    public Interval withEnd(ReadableInstant readableinstant)
    {
        return withEndMillis(DateTimeUtils.getInstantMillis(readableinstant));
    }

    public Interval withEndMillis(long l)
    {
        if (l == getEndMillis())
        {
            return this;
        } else
        {
            return new Interval(getStartMillis(), l, getChronology());
        }
    }

    public Interval withPeriodAfterStart(ReadablePeriod readableperiod)
    {
        if (readableperiod == null)
        {
            return withDurationAfterStart(null);
        } else
        {
            Chronology chronology = getChronology();
            long l = getStartMillis();
            return new Interval(l, chronology.add(readableperiod, l, 1), chronology);
        }
    }

    public Interval withPeriodBeforeEnd(ReadablePeriod readableperiod)
    {
        if (readableperiod == null)
        {
            return withDurationBeforeEnd(null);
        } else
        {
            Chronology chronology = getChronology();
            long l = getEndMillis();
            return new Interval(chronology.add(readableperiod, l, -1), l, chronology);
        }
    }

    public Interval withStart(ReadableInstant readableinstant)
    {
        return withStartMillis(DateTimeUtils.getInstantMillis(readableinstant));
    }

    public Interval withStartMillis(long l)
    {
        if (l == getStartMillis())
        {
            return this;
        } else
        {
            return new Interval(l, getEndMillis(), getChronology());
        }
    }
}
