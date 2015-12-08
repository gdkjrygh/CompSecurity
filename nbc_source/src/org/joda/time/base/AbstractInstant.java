// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import java.util.Date;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public abstract class AbstractInstant
    implements ReadableInstant
{

    protected AbstractInstant()
    {
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((ReadableInstant)obj);
    }

    public int compareTo(ReadableInstant readableinstant)
    {
        if (this != readableinstant)
        {
            long l = readableinstant.getMillis();
            long l1 = getMillis();
            if (l1 != l)
            {
                return l1 >= l ? 1 : -1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ReadableInstant))
            {
                return false;
            }
            obj = (ReadableInstant)obj;
            if (getMillis() != ((ReadableInstant) (obj)).getMillis() || !FieldUtils.equals(getChronology(), ((ReadableInstant) (obj)).getChronology()))
            {
                return false;
            }
        }
        return true;
    }

    public int get(DateTimeField datetimefield)
    {
        if (datetimefield == null)
        {
            throw new IllegalArgumentException("The DateTimeField must not be null");
        } else
        {
            return datetimefield.get(getMillis());
        }
    }

    public int get(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        } else
        {
            return datetimefieldtype.getField(getChronology()).get(getMillis());
        }
    }

    public DateTimeZone getZone()
    {
        return getChronology().getZone();
    }

    public int hashCode()
    {
        return (int)(getMillis() ^ getMillis() >>> 32) + getChronology().hashCode();
    }

    public boolean isAfter(long l)
    {
        return getMillis() > l;
    }

    public boolean isAfter(ReadableInstant readableinstant)
    {
        return isAfter(DateTimeUtils.getInstantMillis(readableinstant));
    }

    public boolean isAfterNow()
    {
        return isAfter(DateTimeUtils.currentTimeMillis());
    }

    public boolean isBefore(long l)
    {
        return getMillis() < l;
    }

    public boolean isBefore(ReadableInstant readableinstant)
    {
        return isBefore(DateTimeUtils.getInstantMillis(readableinstant));
    }

    public boolean isBeforeNow()
    {
        return isBefore(DateTimeUtils.currentTimeMillis());
    }

    public boolean isEqual(long l)
    {
        return getMillis() == l;
    }

    public boolean isEqual(ReadableInstant readableinstant)
    {
        return isEqual(DateTimeUtils.getInstantMillis(readableinstant));
    }

    public boolean isEqualNow()
    {
        return isEqual(DateTimeUtils.currentTimeMillis());
    }

    public boolean isSupported(DateTimeFieldType datetimefieldtype)
    {
        if (datetimefieldtype == null)
        {
            return false;
        } else
        {
            return datetimefieldtype.getField(getChronology()).isSupported();
        }
    }

    public Date toDate()
    {
        return new Date(getMillis());
    }

    public DateTime toDateTime()
    {
        return new DateTime(getMillis(), getZone());
    }

    public DateTime toDateTime(Chronology chronology)
    {
        return new DateTime(getMillis(), chronology);
    }

    public DateTime toDateTime(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getChronology(getChronology()).withZone(datetimezone);
        return new DateTime(getMillis(), datetimezone);
    }

    public DateTime toDateTimeISO()
    {
        return new DateTime(getMillis(), ISOChronology.getInstance(getZone()));
    }

    public Instant toInstant()
    {
        return new Instant(getMillis());
    }

    public MutableDateTime toMutableDateTime()
    {
        return new MutableDateTime(getMillis(), getZone());
    }

    public MutableDateTime toMutableDateTime(Chronology chronology)
    {
        return new MutableDateTime(getMillis(), chronology);
    }

    public MutableDateTime toMutableDateTime(DateTimeZone datetimezone)
    {
        datetimezone = DateTimeUtils.getChronology(getChronology()).withZone(datetimezone);
        return new MutableDateTime(getMillis(), datetimezone);
    }

    public MutableDateTime toMutableDateTimeISO()
    {
        return new MutableDateTime(getMillis(), ISOChronology.getInstance(getZone()));
    }

    public String toString()
    {
        return ISODateTimeFormat.dateTime().print(this);
    }

    public String toString(DateTimeFormatter datetimeformatter)
    {
        if (datetimeformatter == null)
        {
            return toString();
        } else
        {
            return datetimeformatter.print(this);
        }
    }
}
