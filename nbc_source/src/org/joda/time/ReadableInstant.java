// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            DateTimeFieldType, Chronology, DateTimeZone, Instant

public interface ReadableInstant
    extends Comparable
{

    public abstract boolean equals(Object obj);

    public abstract int get(DateTimeFieldType datetimefieldtype);

    public abstract Chronology getChronology();

    public abstract long getMillis();

    public abstract DateTimeZone getZone();

    public abstract int hashCode();

    public abstract boolean isAfter(ReadableInstant readableinstant);

    public abstract boolean isBefore(ReadableInstant readableinstant);

    public abstract boolean isEqual(ReadableInstant readableinstant);

    public abstract boolean isSupported(DateTimeFieldType datetimefieldtype);

    public abstract Instant toInstant();

    public abstract String toString();
}
