// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;

// Referenced classes of package org.joda.time:
//            ReadableDuration, Days, Hours, Minutes, 
//            Seconds, ReadableInstant

public final class Duration extends BaseDuration
    implements Serializable, ReadableDuration
{

    public static final Duration ZERO = new Duration(0L);
    private static final long serialVersionUID = 0x23f7a51ced6L;

    public Duration(long l)
    {
        super(l);
    }

    public Duration(long l, long l1)
    {
        super(l, l1);
    }

    public Duration(Object obj)
    {
        super(obj);
    }

    public Duration(ReadableInstant readableinstant, ReadableInstant readableinstant1)
    {
        super(readableinstant, readableinstant1);
    }

    public static Duration millis(long l)
    {
        if (l == 0L)
        {
            return ZERO;
        } else
        {
            return new Duration(l);
        }
    }

    public static Duration parse(String s)
    {
        return new Duration(s);
    }

    public static Duration standardDays(long l)
    {
        if (l == 0L)
        {
            return ZERO;
        } else
        {
            return new Duration(FieldUtils.safeMultiply(l, 0x5265c00));
        }
    }

    public static Duration standardHours(long l)
    {
        if (l == 0L)
        {
            return ZERO;
        } else
        {
            return new Duration(FieldUtils.safeMultiply(l, 0x36ee80));
        }
    }

    public static Duration standardMinutes(long l)
    {
        if (l == 0L)
        {
            return ZERO;
        } else
        {
            return new Duration(FieldUtils.safeMultiply(l, 60000));
        }
    }

    public static Duration standardSeconds(long l)
    {
        if (l == 0L)
        {
            return ZERO;
        } else
        {
            return new Duration(FieldUtils.safeMultiply(l, 1000));
        }
    }

    public Duration dividedBy(long l)
    {
        if (l == 1L)
        {
            return this;
        } else
        {
            return new Duration(FieldUtils.safeDivide(getMillis(), l));
        }
    }

    public long getStandardDays()
    {
        return getMillis() / 0x5265c00L;
    }

    public long getStandardHours()
    {
        return getMillis() / 0x36ee80L;
    }

    public long getStandardMinutes()
    {
        return getMillis() / 60000L;
    }

    public long getStandardSeconds()
    {
        return getMillis() / 1000L;
    }

    public Duration minus(long l)
    {
        return withDurationAdded(l, -1);
    }

    public Duration minus(ReadableDuration readableduration)
    {
        if (readableduration == null)
        {
            return this;
        } else
        {
            return withDurationAdded(readableduration.getMillis(), -1);
        }
    }

    public Duration multipliedBy(long l)
    {
        if (l == 1L)
        {
            return this;
        } else
        {
            return new Duration(FieldUtils.safeMultiply(getMillis(), l));
        }
    }

    public Duration negated()
    {
        if (getMillis() == 0x8000000000000000L)
        {
            throw new ArithmeticException("Negation of this duration would overflow");
        } else
        {
            return new Duration(-getMillis());
        }
    }

    public Duration plus(long l)
    {
        return withDurationAdded(l, 1);
    }

    public Duration plus(ReadableDuration readableduration)
    {
        if (readableduration == null)
        {
            return this;
        } else
        {
            return withDurationAdded(readableduration.getMillis(), 1);
        }
    }

    public Duration toDuration()
    {
        return this;
    }

    public Days toStandardDays()
    {
        return Days.days(FieldUtils.safeToInt(getStandardDays()));
    }

    public Hours toStandardHours()
    {
        return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
    }

    public Minutes toStandardMinutes()
    {
        return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
    }

    public Seconds toStandardSeconds()
    {
        return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
    }

    public Duration withDurationAdded(long l, int i)
    {
        if (l == 0L || i == 0)
        {
            return this;
        } else
        {
            l = FieldUtils.safeMultiply(l, i);
            return new Duration(FieldUtils.safeAdd(getMillis(), l));
        }
    }

    public Duration withDurationAdded(ReadableDuration readableduration, int i)
    {
        if (readableduration == null || i == 0)
        {
            return this;
        } else
        {
            return withDurationAdded(readableduration.getMillis(), i);
        }
    }

    public Duration withMillis(long l)
    {
        if (l == getMillis())
        {
            return this;
        } else
        {
            return new Duration(l);
        }
    }

}
