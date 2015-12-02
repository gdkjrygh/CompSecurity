// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.annotation:
//            JsonFormat

public class timezone
{

    private final Locale locale;
    private final String pattern;
    private final timezone shape;
    private final TimeZone timezone;

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
        return timezone;
    }

    public (JsonFormat jsonformat)
    {
        this(jsonformat.pattern(), jsonformat.shape(), jsonformat.locale(), jsonformat.timezone());
    }

    public ne(String s, ne ne, String s1, String s2)
    {
        pattern = s;
        shape = ne;
        if (s1 == null || s1.length() == 0 || "##default".equals(s1))
        {
            locale = null;
        } else
        {
            locale = new Locale(s1);
        }
        if (s2 == null || s2.length() == 0 || "##default".equals(s2))
        {
            timezone = null;
            return;
        } else
        {
            timezone = TimeZone.getTimeZone(s2);
            return;
        }
    }
}
