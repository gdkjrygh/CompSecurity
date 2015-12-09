// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.annotation:
//            JsonFormat

public class timezoneStr
{

    private TimeZone _timezone;
    private final Locale locale;
    private final String pattern;
    private final pattern shape;
    private final String timezoneStr;

    public Locale getLocale()
    {
        return locale;
    }

    public String getPattern()
    {
        return pattern;
    }

    public pattern getShape()
    {
        return shape;
    }

    public TimeZone getTimeZone()
    {
label0:
        {
            TimeZone timezone2 = _timezone;
            TimeZone timezone = timezone2;
            if (timezone2 == null)
            {
                if (timezoneStr != null)
                {
                    break label0;
                }
                timezone = null;
            }
            return timezone;
        }
        TimeZone timezone1 = TimeZone.getTimeZone(timezoneStr);
        _timezone = timezone1;
        return timezone1;
    }

    public boolean hasLocale()
    {
        return locale != null;
    }

    public boolean hasPattern()
    {
        return pattern != null && pattern.length() > 0;
    }

    public ()
    {
        this("", ANY, "", "");
    }

    public ANY(JsonFormat jsonformat)
    {
        this(jsonformat.pattern(), jsonformat.shape(), jsonformat.locale(), jsonformat.timezone());
    }

    public ne(String s, ne ne, String s1, String s2)
    {
        if (s1 == null || s1.length() == 0 || "##default".equals(s1))
        {
            s1 = null;
        } else
        {
            s1 = new Locale(s1);
        }
        if (s2 == null || s2.length() == 0 || "##default".equals(s2))
        {
            s2 = null;
        }
        this(s, ne, ((Locale) (s1)), s2, null);
    }

    public <init>(String s, <init> <init>1, Locale locale1, String s1, TimeZone timezone)
    {
        pattern = s;
        shape = <init>1;
        locale = locale1;
        _timezone = timezone;
        timezoneStr = s1;
    }
}
