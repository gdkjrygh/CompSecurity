// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            ReadableInstant, DurationFieldType, ReadableDuration, ReadablePeriod, 
//            DateTimeFieldType, Chronology, DateTimeZone

public interface ReadWritableInstant
    extends ReadableInstant
{

    public abstract void add(long l);

    public abstract void add(DurationFieldType durationfieldtype, int i);

    public abstract void add(ReadableDuration readableduration);

    public abstract void add(ReadableDuration readableduration, int i);

    public abstract void add(ReadablePeriod readableperiod);

    public abstract void add(ReadablePeriod readableperiod, int i);

    public abstract void set(DateTimeFieldType datetimefieldtype, int i);

    public abstract void setChronology(Chronology chronology);

    public abstract void setMillis(long l);

    public abstract void setMillis(ReadableInstant readableinstant);

    public abstract void setZone(DateTimeZone datetimezone);

    public abstract void setZoneRetainFields(DateTimeZone datetimezone);
}
