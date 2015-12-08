// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

// Referenced classes of package org.joda.time:
//            ReadableInstant, DateTimeUtils, DateTime, MutableDateTime, 
//            Chronology, ReadableDuration

public final class Instant extends AbstractInstant
    implements Serializable, ReadableInstant
{

    private static final long serialVersionUID = 0x2dc8bed0c60e9ccdL;
    private final long iMillis;

    public Instant()
    {
        iMillis = DateTimeUtils.currentTimeMillis();
    }

    public Instant(long l)
    {
        iMillis = l;
    }

    public Instant(Object obj)
    {
        iMillis = ConverterManager.getInstance().getInstantConverter(obj).getInstantMillis(obj, ISOChronology.getInstanceUTC());
    }

    public static Instant now()
    {
        return new Instant();
    }

    public static Instant parse(String s)
    {
        return parse(s, ISODateTimeFormat.dateTimeParser());
    }

    public static Instant parse(String s, DateTimeFormatter datetimeformatter)
    {
        return datetimeformatter.parseDateTime(s).toInstant();
    }

    public Chronology getChronology()
    {
        return ISOChronology.getInstanceUTC();
    }

    public long getMillis()
    {
        return iMillis;
    }

    public Instant minus(long l)
    {
        return withDurationAdded(l, -1);
    }

    public Instant minus(ReadableDuration readableduration)
    {
        return withDurationAdded(readableduration, -1);
    }

    public Instant plus(long l)
    {
        return withDurationAdded(l, 1);
    }

    public Instant plus(ReadableDuration readableduration)
    {
        return withDurationAdded(readableduration, 1);
    }

    public DateTime toDateTime()
    {
        return new DateTime(getMillis(), ISOChronology.getInstance());
    }

    public DateTime toDateTimeISO()
    {
        return toDateTime();
    }

    public Instant toInstant()
    {
        return this;
    }

    public MutableDateTime toMutableDateTime()
    {
        return new MutableDateTime(getMillis(), ISOChronology.getInstance());
    }

    public MutableDateTime toMutableDateTimeISO()
    {
        return toMutableDateTime();
    }

    public Instant withDurationAdded(long l, int i)
    {
        if (l == 0L || i == 0)
        {
            return this;
        } else
        {
            return withMillis(getChronology().add(getMillis(), l, i));
        }
    }

    public Instant withDurationAdded(ReadableDuration readableduration, int i)
    {
        if (readableduration == null || i == 0)
        {
            return this;
        } else
        {
            return withDurationAdded(readableduration.getMillis(), i);
        }
    }

    public Instant withMillis(long l)
    {
        if (l == iMillis)
        {
            return this;
        } else
        {
            return new Instant(l);
        }
    }
}
