// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtils
{

    static CalendarProvider CALENDAR_PROVIDER;
    static final ThreadLocal DATE_FORMAT = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected DateFormat initialValue()
        {
            DateFormat dateformat = DateUtils.createDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            dateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return dateformat;
        }

    };
    static final String FORMAT_ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    static final String FORMAT_RFC_3339 = "yyyy-MM-dd'T'HH:mm:ssZZZZZ";

    public DateUtils()
    {
    }

    public static String convertEpochToISO(long l)
    {
        Date date = new Date(l);
        return ((DateFormat)DATE_FORMAT.get()).format(date);
    }

    public static long convertISOtoEpoch(String s)
    {
        return ((DateFormat)DATE_FORMAT.get()).parse(s).getTime();
    }

    public static long convertISOtoEpochOrDefault(String s, long l)
    {
        long l1;
        try
        {
            l1 = convertISOtoEpoch(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public static Date createDate(int i, int j, int k)
    {
        Calendar calendar = CALENDAR_PROVIDER.getInstance();
        calendar.set(1, i);
        calendar.set(2, j);
        calendar.set(5, k);
        return calendar.getTime();
    }

    public static DateFormat createDateFormat(String s)
    {
        return new SimpleDateFormat(s, Locale.US);
    }

    public static Date decode(String s)
    {
        Object obj;
        if (s.endsWith("Z"))
        {
            obj = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        } else
        {
            obj = "yyyy-MM-dd'T'HH:mm:ssZZZZZ";
        }
        obj = createDateFormat(((String) (obj)));
        ((DateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
        return ((DateFormat) (obj)).parse(s);
    }

    public static String encode(long l)
    {
        return createDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format(new Date(l));
    }

    public static Calendar fromDate(Date date)
    {
        Calendar calendar = CALENDAR_PROVIDER.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static boolean hasMonthPassed(int i, int j)
    {
        Calendar calendar = CALENDAR_PROVIDER.getInstance();
        return hasYearPassed(i) || normalizeYear(i) == calendar.get(1) && j < calendar.get(2) + 1;
    }

    public static boolean hasYearPassed(int i)
    {
        return normalizeYear(i) < CALENDAR_PROVIDER.getInstance().get(1);
    }

    public static int normalizeYear(int i)
    {
        int j = i;
        if (i < 100)
        {
            j = i;
            if (i >= 0)
            {
                int k = CALENDAR_PROVIDER.getInstance().get(1);
                j = k;
                if (i > 50)
                {
                    j = k;
                    if (Math.abs(k % 100 - i) > 30)
                    {
                        j = k - i;
                    }
                }
                String s = String.valueOf(j);
                s = s.substring(0, s.length() - 2);
                j = Integer.parseInt(String.format(Locale.US, "%s%02d", new Object[] {
                    s, Integer.valueOf(i)
                }));
            }
        }
        return j;
    }

    static 
    {
        CALENDAR_PROVIDER = DefaultCalendarProvider.INSTANCE;
    }

    private class CalendarProvider
    {

        public abstract Calendar getInstance();
    }


    private class DefaultCalendarProvider
        implements CalendarProvider
    {

        public static final CalendarProvider INSTANCE = new DefaultCalendarProvider();

        public Calendar getInstance()
        {
            return Calendar.getInstance();
        }


        DefaultCalendarProvider()
        {
        }
    }

}
