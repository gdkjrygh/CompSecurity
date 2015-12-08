// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DateTime
    implements Serializable
{

    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final Pattern RFC3339_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d+)?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private static final long serialVersionUID = 1L;
    private final boolean dateOnly;
    private final int tzShift;
    private final long value;

    public DateTime(long l)
    {
        this(false, l, null);
    }

    public DateTime(long l, int i)
    {
        this(false, l, Integer.valueOf(i));
    }

    public DateTime(String s)
    {
        s = parseRfc3339(s);
        dateOnly = ((DateTime) (s)).dateOnly;
        value = ((DateTime) (s)).value;
        tzShift = ((DateTime) (s)).tzShift;
    }

    public DateTime(Date date)
    {
        this(date.getTime());
    }

    public DateTime(Date date, TimeZone timezone)
    {
        long l = date.getTime();
        if (timezone == null)
        {
            date = null;
        } else
        {
            date = Integer.valueOf(timezone.getOffset(date.getTime()) / 60000);
        }
        this(false, l, ((Integer) (date)));
    }

    public DateTime(boolean flag, long l, Integer integer)
    {
        dateOnly = flag;
        value = l;
        int i;
        if (flag)
        {
            i = 0;
        } else
        if (integer == null)
        {
            i = TimeZone.getDefault().getOffset(l) / 60000;
        } else
        {
            i = integer.intValue();
        }
        tzShift = i;
    }

    private static void appendInt(StringBuilder stringbuilder, int i, int j)
    {
        int k = i;
        if (i < 0)
        {
            stringbuilder.append('-');
            k = -i;
        }
        for (i = k; i > 0;)
        {
            i /= 10;
            j--;
        }

        for (i = 0; i < j; i++)
        {
            stringbuilder.append('0');
        }

        if (k != 0)
        {
            stringbuilder.append(k);
        }
    }

    public static DateTime parseRfc3339(String s)
        throws NumberFormatException
    {
        Matcher matcher = RFC3339_PATTERN.matcher(s);
        if (!matcher.matches())
        {
            throw new NumberFormatException((new StringBuilder()).append("Invalid date/time format: ").append(s).toString());
        }
        int j2 = Integer.parseInt(matcher.group(1));
        int k2 = Integer.parseInt(matcher.group(2));
        int l2 = Integer.parseInt(matcher.group(3));
        Object obj;
        String s1;
        boolean flag;
        boolean flag1;
        int j;
        int l;
        int i1;
        boolean flag2;
        if (matcher.group(4) != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s1 = matcher.group(9);
        if (s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = 0;
        l = 0;
        i1 = 0;
        flag2 = false;
        obj = null;
        if (flag && !flag1)
        {
            throw new NumberFormatException((new StringBuilder()).append("Invalid date/time format, cannot specify time zone shift without specifying time: ").append(s).toString());
        }
        int j1 = ((flag2) ? 1 : 0);
        if (flag1)
        {
            int k1 = Integer.parseInt(matcher.group(5));
            int l1 = Integer.parseInt(matcher.group(6));
            int i2 = Integer.parseInt(matcher.group(7));
            j = k1;
            l = l1;
            i1 = i2;
            j1 = ((flag2) ? 1 : 0);
            if (matcher.group(8) != null)
            {
                j1 = Integer.parseInt(matcher.group(8).substring(1));
                i1 = i2;
                l = l1;
                j = k1;
            }
        }
        s = new GregorianCalendar(GMT);
        s.set(j2, k2 - 1, l2, j, l, i1);
        s.set(14, j1);
        long l3 = s.getTimeInMillis();
        s = obj;
        long l4 = l3;
        boolean flag3;
        if (flag1)
        {
            s = obj;
            l4 = l3;
            if (flag)
            {
                int i;
                if (Character.toUpperCase(s1.charAt(0)) == 'Z')
                {
                    i = 0;
                } else
                {
                    int k = Integer.parseInt(matcher.group(11)) * 60 + Integer.parseInt(matcher.group(12));
                    i = k;
                    if (matcher.group(10).charAt(0) == '-')
                    {
                        i = -k;
                    }
                    l3 -= (long)i * 60000L;
                }
                s = Integer.valueOf(i);
                l4 = l3;
            }
        }
        if (!flag1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        return new DateTime(flag3, l4, s);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof DateTime))
            {
                return false;
            }
            obj = (DateTime)obj;
            if (dateOnly != ((DateTime) (obj)).dateOnly || value != ((DateTime) (obj)).value || tzShift != ((DateTime) (obj)).tzShift)
            {
                return false;
            }
        }
        return true;
    }

    public int getTimeZoneShift()
    {
        return tzShift;
    }

    public long getValue()
    {
        return value;
    }

    public int hashCode()
    {
        long l1 = value;
        long l;
        if (dateOnly)
        {
            l = 1L;
        } else
        {
            l = 0L;
        }
        return Arrays.hashCode(new long[] {
            l1, l, (long)tzShift
        });
    }

    public boolean isDateOnly()
    {
        return dateOnly;
    }

    public String toString()
    {
        return toStringRfc3339();
    }

    public String toStringRfc3339()
    {
        StringBuilder stringbuilder = new StringBuilder();
        GregorianCalendar gregoriancalendar = new GregorianCalendar(GMT);
        gregoriancalendar.setTimeInMillis(value + (long)tzShift * 60000L);
        appendInt(stringbuilder, gregoriancalendar.get(1), 4);
        stringbuilder.append('-');
        appendInt(stringbuilder, gregoriancalendar.get(2) + 1, 2);
        stringbuilder.append('-');
        appendInt(stringbuilder, gregoriancalendar.get(5), 2);
        if (!dateOnly)
        {
            stringbuilder.append('T');
            appendInt(stringbuilder, gregoriancalendar.get(11), 2);
            stringbuilder.append(':');
            appendInt(stringbuilder, gregoriancalendar.get(12), 2);
            stringbuilder.append(':');
            appendInt(stringbuilder, gregoriancalendar.get(13), 2);
            if (gregoriancalendar.isSet(14))
            {
                stringbuilder.append('.');
                appendInt(stringbuilder, gregoriancalendar.get(14), 3);
            }
            if (tzShift == 0)
            {
                stringbuilder.append('Z');
            } else
            {
                int i = tzShift;
                if (tzShift > 0)
                {
                    stringbuilder.append('+');
                } else
                {
                    stringbuilder.append('-');
                    i = -i;
                }
                appendInt(stringbuilder, i / 60, 2);
                stringbuilder.append(':');
                appendInt(stringbuilder, i % 60, 2);
            }
        }
        return stringbuilder.toString();
    }

}
