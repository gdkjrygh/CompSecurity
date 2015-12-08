// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            ReadWritableInstant, ReadableDateTime

public interface ReadWritableDateTime
    extends ReadWritableInstant, ReadableDateTime
{

    public abstract void addDays(int i);

    public abstract void addHours(int i);

    public abstract void addMillis(int i);

    public abstract void addMinutes(int i);

    public abstract void addMonths(int i);

    public abstract void addSeconds(int i);

    public abstract void addWeeks(int i);

    public abstract void addWeekyears(int i);

    public abstract void addYears(int i);

    public abstract void setDate(int i, int j, int k);

    public abstract void setDateTime(int i, int j, int k, int l, int i1, int j1, int k1);

    public abstract void setDayOfMonth(int i);

    public abstract void setDayOfWeek(int i);

    public abstract void setDayOfYear(int i);

    public abstract void setHourOfDay(int i);

    public abstract void setMillisOfDay(int i);

    public abstract void setMillisOfSecond(int i);

    public abstract void setMinuteOfDay(int i);

    public abstract void setMinuteOfHour(int i);

    public abstract void setMonthOfYear(int i);

    public abstract void setSecondOfDay(int i);

    public abstract void setSecondOfMinute(int i);

    public abstract void setTime(int i, int j, int k, int l);

    public abstract void setWeekOfWeekyear(int i);

    public abstract void setWeekyear(int i);

    public abstract void setYear(int i);
}
