// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class SafeSimpleDateFormat
{

    private final ThreadLocal dateFormatterThreadLocal = new ThreadLocal() {

        final SafeSimpleDateFormat this$0;

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat(format, locale);
        }

            
            {
                this$0 = SafeSimpleDateFormat.this;
                super();
            }
    };
    private String format;
    private Locale locale;

    public SafeSimpleDateFormat(String s, Locale locale1)
    {
        format = s;
        locale = locale1;
    }

    public void cleanup()
    {
        dateFormatterThreadLocal.remove();
    }

    public String format(Date date)
    {
        return ((SimpleDateFormat)dateFormatterThreadLocal.get()).format(date);
    }

    public Date parse(String s)
        throws ParseException
    {
        return ((SimpleDateFormat)dateFormatterThreadLocal.get()).parse(s);
    }


}
