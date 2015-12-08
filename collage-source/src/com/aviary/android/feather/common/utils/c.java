// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class c
{

    static final SimpleDateFormat a;
    static final TimeZone b = TimeZone.getTimeZone("GMT");
    static final TimeZone c = TimeZone.getDefault();

    public c()
    {
    }

    public static long a()
    {
        return System.nanoTime();
    }

    public static long a(long l, String s)
    {
        long l1 = System.nanoTime();
        Log.d("DateTimeUtils", (new StringBuilder()).append(s).append(", time: ").append((double)(l1 - l) / 1000000D).toString());
        return l1;
    }

    public static final String a(long l)
    {
        return a(new Date(l));
    }

    public static final String a(Date date)
    {
        a.setTimeZone(b);
        return a.format(date);
    }

    public static final Date a(String s, boolean flag)
        throws ParseException
    {
        if (flag)
        {
            a.setTimeZone(c);
        } else
        {
            a.setTimeZone(b);
        }
        return a.parse(s);
    }

    static 
    {
        a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        a.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
}
