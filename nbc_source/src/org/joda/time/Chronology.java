// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            ReadablePeriod, DurationField, DateTimeField, ReadablePartial, 
//            DateTimeZone

public abstract class Chronology
{

    public Chronology()
    {
    }

    public abstract long add(long l, long l1, int i);

    public abstract long add(ReadablePeriod readableperiod, long l, int i);

    public abstract DurationField centuries();

    public abstract DateTimeField centuryOfEra();

    public abstract DateTimeField clockhourOfDay();

    public abstract DateTimeField clockhourOfHalfday();

    public abstract DateTimeField dayOfMonth();

    public abstract DateTimeField dayOfWeek();

    public abstract DateTimeField dayOfYear();

    public abstract DurationField days();

    public abstract DateTimeField era();

    public abstract DurationField eras();

    public abstract int[] get(ReadablePartial readablepartial, long l);

    public abstract int[] get(ReadablePeriod readableperiod, long l);

    public abstract int[] get(ReadablePeriod readableperiod, long l, long l1);

    public abstract long getDateTimeMillis(int i, int j, int k, int l);

    public abstract long getDateTimeMillis(int i, int j, int k, int l, int i1, int j1, int k1);

    public abstract long getDateTimeMillis(long l, int i, int j, int k, int i1);

    public abstract DateTimeZone getZone();

    public abstract DateTimeField halfdayOfDay();

    public abstract DurationField halfdays();

    public abstract DateTimeField hourOfDay();

    public abstract DateTimeField hourOfHalfday();

    public abstract DurationField hours();

    public abstract DurationField millis();

    public abstract DateTimeField millisOfDay();

    public abstract DateTimeField millisOfSecond();

    public abstract DateTimeField minuteOfDay();

    public abstract DateTimeField minuteOfHour();

    public abstract DurationField minutes();

    public abstract DateTimeField monthOfYear();

    public abstract DurationField months();

    public abstract DateTimeField secondOfDay();

    public abstract DateTimeField secondOfMinute();

    public abstract DurationField seconds();

    public abstract long set(ReadablePartial readablepartial, long l);

    public abstract String toString();

    public abstract void validate(ReadablePartial readablepartial, int ai[]);

    public abstract DateTimeField weekOfWeekyear();

    public abstract DurationField weeks();

    public abstract DateTimeField weekyear();

    public abstract DateTimeField weekyearOfCentury();

    public abstract DurationField weekyears();

    public abstract Chronology withUTC();

    public abstract Chronology withZone(DateTimeZone datetimezone);

    public abstract DateTimeField year();

    public abstract DateTimeField yearOfCentury();

    public abstract DateTimeField yearOfEra();

    public abstract DurationField years();
}
