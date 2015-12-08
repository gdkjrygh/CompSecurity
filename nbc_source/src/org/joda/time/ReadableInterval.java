// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            ReadableInstant, Chronology, DateTime, Duration, 
//            Interval, MutableInterval, Period, PeriodType

public interface ReadableInterval
{

    public abstract boolean contains(ReadableInstant readableinstant);

    public abstract boolean contains(ReadableInterval readableinterval);

    public abstract boolean equals(Object obj);

    public abstract Chronology getChronology();

    public abstract DateTime getEnd();

    public abstract long getEndMillis();

    public abstract DateTime getStart();

    public abstract long getStartMillis();

    public abstract int hashCode();

    public abstract boolean isAfter(ReadableInstant readableinstant);

    public abstract boolean isAfter(ReadableInterval readableinterval);

    public abstract boolean isBefore(ReadableInstant readableinstant);

    public abstract boolean isBefore(ReadableInterval readableinterval);

    public abstract boolean overlaps(ReadableInterval readableinterval);

    public abstract Duration toDuration();

    public abstract long toDurationMillis();

    public abstract Interval toInterval();

    public abstract MutableInterval toMutableInterval();

    public abstract Period toPeriod();

    public abstract Period toPeriod(PeriodType periodtype);

    public abstract String toString();
}
