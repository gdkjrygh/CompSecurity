// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class UtcOffset
{

    private final int hour;
    private final int minute;

    public UtcOffset(int i, int j)
    {
        hour = i;
        minute = j;
    }

    public static UtcOffset parse(String s)
    {
        Matcher matcher = Pattern.compile("^([-\\+])?(\\d{1,2})(:?(\\d{2}))?$").matcher(s);
        if (!matcher.find())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Offset string is not in ISO8610 format: ").append(s).toString());
        }
        int i;
        int j;
        int k;
        if ("-".equals(matcher.group(1)))
        {
            j = 0;
        } else
        {
            j = 1;
        }
        k = Integer.parseInt(matcher.group(2));
        i = k;
        if (j == 0)
        {
            i = k * -1;
        }
        s = matcher.group(4);
        if (s == null)
        {
            j = 0;
        } else
        {
            j = Integer.parseInt(s);
        }
        return new UtcOffset(i, j);
    }

    public static UtcOffset parse(TimeZone timezone)
    {
        long l = timezone.getOffset(System.currentTimeMillis());
        int k = (int)(l / 1000L / 60L / 60L);
        int j = (int)((l / 1000L / 60L) % 60L);
        int i = j;
        if (j < 0)
        {
            i = j * -1;
        }
        return new UtcOffset(k, i);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (UtcOffset)obj;
            if (hour != ((UtcOffset) (obj)).hour)
            {
                return false;
            }
            if (minute != ((UtcOffset) (obj)).minute)
            {
                return false;
            }
        }
        return true;
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int hashCode()
    {
        return (hour + 31) * 31 + minute;
    }

    public String toString()
    {
        return toString(false);
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        char c;
        int i;
        if (hour >= 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            c = '+';
        } else
        {
            c = '-';
        }
        stringbuilder.append(c);
        i = Math.abs(hour);
        if (i < 10)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(i);
        if (flag)
        {
            stringbuilder.append(':');
        }
        if (minute < 10)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(minute);
        return stringbuilder.toString();
    }
}
