// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public abstract class AbstractInterval
    implements ReadableInterval
{

    protected AbstractInterval()
    {
    }

    protected void checkInterval(long l, long l1)
    {
        if (l1 < l)
        {
            throw new IllegalArgumentException("The end instant must be greater or equal to the start");
        } else
        {
            return;
        }
    }

    public boolean contains(long l)
    {
        long l1 = getStartMillis();
        long l2 = getEndMillis();
        return l >= l1 && l < l2;
    }

    public boolean contains(ReadableInstant readableinstant)
    {
        if (readableinstant == null)
        {
            return containsNow();
        } else
        {
            return contains(readableinstant.getMillis());
        }
    }

    public boolean contains(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            return containsNow();
        }
        long l = readableinterval.getStartMillis();
        long l1 = readableinterval.getEndMillis();
        long l2 = getStartMillis();
        long l3 = getEndMillis();
        return l2 <= l && l < l3 && l1 <= l3;
    }

    public boolean containsNow()
    {
        return contains(DateTimeUtils.currentTimeMillis());
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ReadableInterval))
            {
                return false;
            }
            obj = (ReadableInterval)obj;
            if (getStartMillis() != ((ReadableInterval) (obj)).getStartMillis() || getEndMillis() != ((ReadableInterval) (obj)).getEndMillis() || !FieldUtils.equals(getChronology(), ((ReadableInterval) (obj)).getChronology()))
            {
                return false;
            }
        }
        return true;
    }

    public DateTime getEnd()
    {
        return new DateTime(getEndMillis(), getChronology());
    }

    public DateTime getStart()
    {
        return new DateTime(getStartMillis(), getChronology());
    }

    public int hashCode()
    {
        long l = getStartMillis();
        long l1 = getEndMillis();
        return (((int)(l ^ l >>> 32) + 3007) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + getChronology().hashCode();
    }

    public boolean isAfter(long l)
    {
        return getStartMillis() > l;
    }

    public boolean isAfter(ReadableInstant readableinstant)
    {
        if (readableinstant == null)
        {
            return isAfterNow();
        } else
        {
            return isAfter(readableinstant.getMillis());
        }
    }

    public boolean isAfter(ReadableInterval readableinterval)
    {
        long l;
        if (readableinterval == null)
        {
            l = DateTimeUtils.currentTimeMillis();
        } else
        {
            l = readableinterval.getEndMillis();
        }
        return getStartMillis() >= l;
    }

    public boolean isAfterNow()
    {
        return isAfter(DateTimeUtils.currentTimeMillis());
    }

    public boolean isBefore(long l)
    {
        return getEndMillis() <= l;
    }

    public boolean isBefore(ReadableInstant readableinstant)
    {
        if (readableinstant == null)
        {
            return isBeforeNow();
        } else
        {
            return isBefore(readableinstant.getMillis());
        }
    }

    public boolean isBefore(ReadableInterval readableinterval)
    {
        if (readableinterval == null)
        {
            return isBeforeNow();
        } else
        {
            return isBefore(readableinterval.getStartMillis());
        }
    }

    public boolean isBeforeNow()
    {
        return isBefore(DateTimeUtils.currentTimeMillis());
    }

    public boolean isEqual(ReadableInterval readableinterval)
    {
        return getStartMillis() == readableinterval.getStartMillis() && getEndMillis() == readableinterval.getEndMillis();
    }

    public boolean overlaps(ReadableInterval readableinterval)
    {
        long l;
        long l1;
        l = getStartMillis();
        l1 = getEndMillis();
        if (readableinterval != null) goto _L2; else goto _L1
_L1:
        long l2 = DateTimeUtils.currentTimeMillis();
        if (l >= l2 || l2 >= l1) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        long l3 = readableinterval.getStartMillis();
        if (l >= readableinterval.getEndMillis() || l3 >= l1)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Duration toDuration()
    {
        long l = toDurationMillis();
        if (l == 0L)
        {
            return Duration.ZERO;
        } else
        {
            return new Duration(l);
        }
    }

    public long toDurationMillis()
    {
        return FieldUtils.safeAdd(getEndMillis(), -getStartMillis());
    }

    public Interval toInterval()
    {
        return new Interval(getStartMillis(), getEndMillis(), getChronology());
    }

    public MutableInterval toMutableInterval()
    {
        return new MutableInterval(getStartMillis(), getEndMillis(), getChronology());
    }

    public Period toPeriod()
    {
        return new Period(getStartMillis(), getEndMillis(), getChronology());
    }

    public Period toPeriod(PeriodType periodtype)
    {
        return new Period(getStartMillis(), getEndMillis(), periodtype, getChronology());
    }

    public String toString()
    {
        DateTimeFormatter datetimeformatter = ISODateTimeFormat.dateTime().withChronology(getChronology());
        StringBuffer stringbuffer = new StringBuffer(48);
        datetimeformatter.printTo(stringbuffer, getStartMillis());
        stringbuffer.append('/');
        datetimeformatter.printTo(stringbuffer, getEndMillis());
        return stringbuffer.toString();
    }
}
