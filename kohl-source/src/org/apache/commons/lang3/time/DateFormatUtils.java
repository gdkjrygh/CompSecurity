// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.apache.commons.lang3.time:
//            FastDateFormat

public class DateFormatUtils
{

    public static final FastDateFormat ISO_DATETIME_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss");
    public static final FastDateFormat ISO_DATETIME_TIME_ZONE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZZ");
    public static final FastDateFormat ISO_DATE_FORMAT = FastDateFormat.getInstance("yyyy-MM-dd");
    public static final FastDateFormat ISO_DATE_TIME_ZONE_FORMAT = FastDateFormat.getInstance("yyyy-MM-ddZZ");
    public static final FastDateFormat ISO_TIME_FORMAT = FastDateFormat.getInstance("'T'HH:mm:ss");
    public static final FastDateFormat ISO_TIME_NO_T_FORMAT = FastDateFormat.getInstance("HH:mm:ss");
    public static final FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT = FastDateFormat.getInstance("HH:mm:ssZZ");
    public static final FastDateFormat ISO_TIME_TIME_ZONE_FORMAT = FastDateFormat.getInstance("'T'HH:mm:ssZZ");
    public static final FastDateFormat SMTP_DATETIME_FORMAT;
    private static final TimeZone UTC_TIME_ZONE = TimeZone.getTimeZone("GMT");

    public DateFormatUtils()
    {
    }

    public static String format(long l, String s)
    {
        return format(new Date(l), s, null, null);
    }

    public static String format(long l, String s, Locale locale)
    {
        return format(new Date(l), s, null, locale);
    }

    public static String format(long l, String s, TimeZone timezone)
    {
        return format(new Date(l), s, timezone, null);
    }

    public static String format(long l, String s, TimeZone timezone, Locale locale)
    {
        return format(new Date(l), s, timezone, locale);
    }

    public static String format(Calendar calendar, String s)
    {
        return format(calendar, s, null, null);
    }

    public static String format(Calendar calendar, String s, Locale locale)
    {
        return format(calendar, s, null, locale);
    }

    public static String format(Calendar calendar, String s, TimeZone timezone)
    {
        return format(calendar, s, timezone, null);
    }

    public static String format(Calendar calendar, String s, TimeZone timezone, Locale locale)
    {
        return FastDateFormat.getInstance(s, timezone, locale).format(calendar);
    }

    public static String format(Date date, String s)
    {
        return format(date, s, null, null);
    }

    public static String format(Date date, String s, Locale locale)
    {
        return format(date, s, null, locale);
    }

    public static String format(Date date, String s, TimeZone timezone)
    {
        return format(date, s, timezone, null);
    }

    public static String format(Date date, String s, TimeZone timezone, Locale locale)
    {
        return FastDateFormat.getInstance(s, timezone, locale).format(date);
    }

    public static String formatUTC(long l, String s)
    {
        return format(new Date(l), s, UTC_TIME_ZONE, null);
    }

    public static String formatUTC(long l, String s, Locale locale)
    {
        return format(new Date(l), s, UTC_TIME_ZONE, locale);
    }

    public static String formatUTC(Date date, String s)
    {
        return format(date, s, UTC_TIME_ZONE, null);
    }

    public static String formatUTC(Date date, String s, Locale locale)
    {
        return format(date, s, UTC_TIME_ZONE, locale);
    }

    static 
    {
        SMTP_DATETIME_FORMAT = FastDateFormat.getInstance("EEE, dd MMM yyyy HH:mm:ss Z", Locale.US);
    }
}
