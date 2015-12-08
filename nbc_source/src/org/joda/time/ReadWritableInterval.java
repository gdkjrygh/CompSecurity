// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            ReadableInterval, Chronology, ReadableDuration, ReadableInstant, 
//            ReadablePeriod

public interface ReadWritableInterval
    extends ReadableInterval
{

    public abstract void setChronology(Chronology chronology);

    public abstract void setDurationAfterStart(ReadableDuration readableduration);

    public abstract void setDurationBeforeEnd(ReadableDuration readableduration);

    public abstract void setEnd(ReadableInstant readableinstant);

    public abstract void setEndMillis(long l);

    public abstract void setInterval(long l, long l1);

    public abstract void setInterval(ReadableInstant readableinstant, ReadableInstant readableinstant1);

    public abstract void setInterval(ReadableInterval readableinterval);

    public abstract void setPeriodAfterStart(ReadablePeriod readableperiod);

    public abstract void setPeriodBeforeEnd(ReadablePeriod readableperiod);

    public abstract void setStart(ReadableInstant readableinstant);

    public abstract void setStartMillis(long l);
}
