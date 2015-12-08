// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;


// Referenced classes of package org.joda.time:
//            Duration, Period

public interface ReadableDuration
    extends Comparable
{

    public abstract boolean equals(Object obj);

    public abstract long getMillis();

    public abstract int hashCode();

    public abstract boolean isEqual(ReadableDuration readableduration);

    public abstract boolean isLongerThan(ReadableDuration readableduration);

    public abstract boolean isShorterThan(ReadableDuration readableduration);

    public abstract Duration toDuration();

    public abstract Period toPeriod();

    public abstract String toString();
}
