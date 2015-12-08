// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiDateFormat extends StdDateFormat
{

    private static ThreadLocal threadLocal = new ThreadLocal();
    private final DateFormat dateFormat;

    public ApiDateFormat()
    {
        dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss Z", Locale.US);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    public static String formatDate(long l)
    {
        return instance().format(Long.valueOf(l));
    }

    public static Date fromString(String s)
    {
        try
        {
            s = instance().parse(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    private static ApiDateFormat instance()
    {
        ApiDateFormat apidateformat1 = (ApiDateFormat)threadLocal.get();
        ApiDateFormat apidateformat = apidateformat1;
        if (apidateformat1 == null)
        {
            apidateformat = new ApiDateFormat();
            threadLocal.set(apidateformat);
        }
        return apidateformat;
    }

    public static long toTime(String s)
    {
        return fromString(s).getTime();
    }

    public volatile StdDateFormat clone()
    {
        return clone();
    }

    public ApiDateFormat clone()
    {
        return instance();
    }

    public volatile Object clone()
    {
        return clone();
    }

    public StringBuffer format(Date date, StringBuffer stringbuffer, FieldPosition fieldposition)
    {
        return dateFormat.format(date, stringbuffer, fieldposition);
    }

    public Date parse(String s, ParsePosition parseposition)
    {
        Date date1 = dateFormat.parse(s, parseposition);
        Date date = date1;
        if (date1 == null)
        {
            date = super.parse(s, parseposition);
        }
        return date;
    }

}
