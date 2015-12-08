// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;

import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.format.FormatUtils;

public abstract class AbstractDuration
    implements ReadableDuration
{

    protected AbstractDuration()
    {
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((ReadableDuration)obj);
    }

    public int compareTo(ReadableDuration readableduration)
    {
        long l = getMillis();
        long l1 = readableduration.getMillis();
        if (l < l1)
        {
            return -1;
        }
        return l <= l1 ? 0 : 1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ReadableDuration))
            {
                return false;
            }
            obj = (ReadableDuration)obj;
            if (getMillis() != ((ReadableDuration) (obj)).getMillis())
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        long l = getMillis();
        return (int)(l ^ l >>> 32);
    }

    public boolean isEqual(ReadableDuration readableduration)
    {
        Object obj = readableduration;
        if (readableduration == null)
        {
            obj = Duration.ZERO;
        }
        return compareTo(((ReadableDuration) (obj))) == 0;
    }

    public boolean isLongerThan(ReadableDuration readableduration)
    {
        Object obj = readableduration;
        if (readableduration == null)
        {
            obj = Duration.ZERO;
        }
        return compareTo(((ReadableDuration) (obj))) > 0;
    }

    public boolean isShorterThan(ReadableDuration readableduration)
    {
        Object obj = readableduration;
        if (readableduration == null)
        {
            obj = Duration.ZERO;
        }
        return compareTo(((ReadableDuration) (obj))) < 0;
    }

    public Duration toDuration()
    {
        return new Duration(getMillis());
    }

    public Period toPeriod()
    {
        return new Period(getMillis());
    }

    public String toString()
    {
        long l = getMillis();
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("PT");
        boolean flag;
        if (l < 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        FormatUtils.appendUnpaddedInteger(stringbuffer, l);
        do
        {
            int i = stringbuffer.length();
            byte byte0;
            if (flag)
            {
                byte0 = 7;
            } else
            {
                byte0 = 6;
            }
            if (i >= byte0)
            {
                break;
            }
            if (flag)
            {
                byte0 = 3;
            } else
            {
                byte0 = 2;
            }
            stringbuffer.insert(byte0, "0");
        } while (true);
        if ((l / 1000L) * 1000L == l)
        {
            stringbuffer.setLength(stringbuffer.length() - 3);
        } else
        {
            stringbuffer.insert(stringbuffer.length() - 3, ".");
        }
        stringbuffer.append('S');
        return stringbuffer.toString();
    }
}
