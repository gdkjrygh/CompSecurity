// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duration
{

    private static final Pattern DURATION_PATTERN = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);
    final long millis;

    public Duration(long l)
    {
        millis = l;
    }

    public static Duration buildByDays(double d)
    {
        return new Duration((long)(86400000D * d));
    }

    public static Duration buildByHours(double d)
    {
        return new Duration((long)(3600000D * d));
    }

    public static Duration buildByMilliseconds(double d)
    {
        return new Duration((long)d);
    }

    public static Duration buildByMinutes(double d)
    {
        return new Duration((long)(60000D * d));
    }

    public static Duration buildBySeconds(double d)
    {
        return new Duration((long)(1000D * d));
    }

    public static Duration valueOf(String s)
    {
        Object obj = DURATION_PATTERN.matcher(s);
        if (((Matcher) (obj)).matches())
        {
            s = ((Matcher) (obj)).group(1);
            obj = ((Matcher) (obj)).group(3);
            double d = Double.valueOf(s).doubleValue();
            if (((String) (obj)).equalsIgnoreCase("milli") || ((String) (obj)).equalsIgnoreCase("millisecond") || ((String) (obj)).length() == 0)
            {
                return buildByMilliseconds(d);
            }
            if (((String) (obj)).equalsIgnoreCase("second") || ((String) (obj)).equalsIgnoreCase("seconde"))
            {
                return buildBySeconds(d);
            }
            if (((String) (obj)).equalsIgnoreCase("minute"))
            {
                return buildByMinutes(d);
            }
            if (((String) (obj)).equalsIgnoreCase("hour"))
            {
                return buildByHours(d);
            }
            if (((String) (obj)).equalsIgnoreCase("day"))
            {
                return buildByDays(d);
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Unexpected ").append(((String) (obj))).toString());
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("String value [").append(s).append("] is not in the expected format.").toString());
        }
    }

    public long getMilliseconds()
    {
        return millis;
    }

    public String toString()
    {
        if (millis < 1000L)
        {
            return (new StringBuilder()).append(millis).append(" milliseconds").toString();
        }
        if (millis < 60000L)
        {
            return (new StringBuilder()).append(millis / 1000L).append(" seconds").toString();
        }
        if (millis < 0x36ee80L)
        {
            return (new StringBuilder()).append(millis / 60000L).append(" minutes").toString();
        } else
        {
            return (new StringBuilder()).append(millis / 0x36ee80L).append(" hours").toString();
        }
    }

}
