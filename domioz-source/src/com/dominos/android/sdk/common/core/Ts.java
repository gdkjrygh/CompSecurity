// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import com.dominos.android.sdk.common.StringHelper;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class Ts
    implements Comparable
{

    public static final Ts EMPTY = new Ts(0L);
    private static final int MILLIS_DIGITS = 3;
    private static final int PARSE_DAY_POSN = 3;
    private static final int PARSE_HOUR_POSN = 4;
    private static final int PARSE_MILLIS_POSN = 7;
    private static final int PARSE_MINUTE_POSN = 5;
    private static final int PARSE_MONTH_POSN = 2;
    private static final int PARSE_SECOND_POSN = 6;
    private static final int PARSE_YEAR_POSN = 1;
    private static final String YMDHMSS_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
    private static final Pattern YMDHMSS_PARSE = Pattern.compile("(\\d{1,4})\\D*(\\d{1,2})\\D*(\\d{1,2})(?:\\D*(\\d{1,2})\\D*(\\d{1,2})(?:\\D*(\\d{1,2})(?:\\.(\\d{1,3}))?)?)?");
    private long millis;
    private String timestampStr;

    public Ts(int i, int j, int k)
    {
        this(i, j, k, 0, 0, 0, 0);
    }

    public Ts(int i, int j, int k, int l, int i1, int j1)
    {
        this(i, j, k, l, i1, j1, 0);
    }

    public Ts(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, j - 1, k, l, i1, j1);
        calendar.set(14, k1);
        millis = calendar.getTimeInMillis();
    }

    public Ts(long l)
    {
        millis = l;
    }

    public static Ts create(String s)
    {
        if (StringHelper.isEmpty(s))
        {
            return null;
        } else
        {
            return (new DateParser(null)).parse(s);
        }
    }

    public static boolean isEmpty(Ts ts)
    {
        return ts == null || ts.millis == 0L;
    }

    public boolean after(Ts ts)
    {
        return compareTo(ts) > 0;
    }

    public boolean before(Ts ts)
    {
        return compareTo(ts) < 0;
    }

    public int compareTo(Ts ts)
    {
        if (millis < ts.millis)
        {
            return -1;
        }
        return millis <= ts.millis ? 0 : 1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Ts)obj);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof Ts) && millis == ((Ts)obj).millis;
    }

    public String format(String s)
    {
        return format(new SimpleDateFormat(s, Locale.US));
    }

    public String format(SimpleDateFormat simpledateformat)
    {
        if (millis == 0L)
        {
            return "";
        } else
        {
            return simpledateformat.format(toDate());
        }
    }

    public Calendar getCalendar()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar;
    }

    public int getMinute()
    {
        return getCalendar().get(12);
    }

    public int getMonth()
    {
        return getCalendar().get(2) + 1;
    }

    public int getSecond()
    {
        return getCalendar().get(13);
    }

    public int hashCode()
    {
        return Long.valueOf(millis).hashCode();
    }

    public Date toDate()
    {
        return getCalendar().getTime();
    }

    public long toMillis()
    {
        return millis;
    }

    public String toString()
    {
        return toYmdHmss();
    }

    public String toYmdHmss()
    {
        if (timestampStr == null)
        {
            timestampStr = format("yyyy-MM-dd HH:mm:ss.SSS");
        }
        return timestampStr;
    }



    private class DateParser
    {

        private Matcher matcher;

        public int extractInt(int i)
        {
            String s = matcher.group(i);
            if (s == null)
            {
                return 0;
            } else
            {
                return Integer.parseInt(s);
            }
        }

        public int extractMillis()
        {
            String s1 = matcher.group(7);
            String s = s1;
            if (StringHelper.isEmpty(s1))
            {
                return 0;
            }
            for (; s.length() < 3; s = (new StringBuilder()).append(s).append("0").toString()) { }
            return Integer.parseInt(s);
        }

        public Ts parse(String s)
        {
            matcher = Ts.YMDHMSS_PARSE.matcher(s);
            if (!matcher.find())
            {
                throw new RuntimeException("Invalid date format");
            } else
            {
                return new Ts(extractInt(1), extractInt(2), extractInt(3), extractInt(4), extractInt(5), extractInt(6), extractMillis());
            }
        }

        private DateParser()
        {
        }

        DateParser(_cls1 _pcls1)
        {
            this();
        }
    }

}
