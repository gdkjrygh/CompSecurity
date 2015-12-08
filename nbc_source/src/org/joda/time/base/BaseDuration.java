// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.DurationConverter;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time.base:
//            AbstractDuration

public abstract class BaseDuration extends AbstractDuration
    implements Serializable, ReadableDuration
{

    private static final long serialVersionUID = 0x259193af48eL;
    private volatile long iMillis;

    protected BaseDuration(long l)
    {
        iMillis = l;
    }

    protected BaseDuration(long l, long l1)
    {
        iMillis = FieldUtils.safeSubtract(l1, l);
    }

    protected BaseDuration(Object obj)
    {
        iMillis = ConverterManager.getInstance().getDurationConverter(obj).getDurationMillis(obj);
    }

    protected BaseDuration(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        if (readableinstant == readableinstant1)
        {
            iMillis = 0L;
            return;
        } else
        {
            long l = DateTimeUtils.getInstantMillis(readableinstant);
            iMillis = FieldUtils.safeSubtract(DateTimeUtils.getInstantMillis(readableinstant1), l);
            return;
        }
    }

    public long getMillis()
    {
        return iMillis;
    }

    protected void setMillis(long l)
    {
        iMillis = l;
    }

    public Interval toIntervalFrom(ReadableInstant readableinstant)
    {
        return new Interval(readableinstant, this);
    }

    public Interval toIntervalTo(ReadableInstant readableinstant)
    {
        return new Interval(this, readableinstant);
    }

    public Period toPeriod(Chronology chronology)
    {
        return new Period(getMillis(), chronology);
    }

    public Period toPeriod(PeriodType periodtype)
    {
        return new Period(getMillis(), periodtype);
    }

    public Period toPeriod(PeriodType periodtype, Chronology chronology)
    {
        return new Period(getMillis(), periodtype, chronology);
    }

    public Period toPeriodFrom(ReadableInstant readableinstant)
    {
        return new Period(readableinstant, this);
    }

    public Period toPeriodFrom(ReadableInstant readableinstant, PeriodType periodtype)
    {
        return new Period(readableinstant, this, periodtype);
    }

    public Period toPeriodTo(ReadableInstant readableinstant)
    {
        return new Period(this, readableinstant);
    }

    public Period toPeriodTo(ReadableInstant readableinstant, PeriodType periodtype)
    {
        return new Period(this, readableinstant, periodtype);
    }
}
