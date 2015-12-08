// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            ReadablePeriod, DurationFieldType, ReadableInterval

public interface ReadWritablePeriod
    extends ReadablePeriod
{

    public abstract void add(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1);

    public abstract void add(DurationFieldType durationfieldtype, int i);

    public abstract void add(ReadableInterval readableinterval);

    public abstract void add(ReadablePeriod readableperiod);

    public abstract void addDays(int i);

    public abstract void addHours(int i);

    public abstract void addMillis(int i);

    public abstract void addMinutes(int i);

    public abstract void addMonths(int i);

    public abstract void addSeconds(int i);

    public abstract void addWeeks(int i);

    public abstract void addYears(int i);

    public abstract void clear();

    public abstract void set(DurationFieldType durationfieldtype, int i);

    public abstract void setDays(int i);

    public abstract void setHours(int i);

    public abstract void setMillis(int i);

    public abstract void setMinutes(int i);

    public abstract void setMonths(int i);

    public abstract void setPeriod(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1);

    public abstract void setPeriod(ReadableInterval readableinterval);

    public abstract void setPeriod(ReadablePeriod readableperiod);

    public abstract void setSeconds(int i);

    public abstract void setValue(int i, int j);

    public abstract void setWeeks(int i);

    public abstract void setYears(int i);
}
