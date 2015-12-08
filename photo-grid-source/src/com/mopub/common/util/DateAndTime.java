// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateAndTime
{

    protected static DateAndTime a = new DateAndTime();

    public DateAndTime()
    {
    }

    public static String getTimeZoneOffsetString()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("Z", Locale.US);
        simpledateformat.setTimeZone(localTimeZone());
        return simpledateformat.format(now());
    }

    public static TimeZone localTimeZone()
    {
        return a.internalLocalTimeZone();
    }

    public static Date now()
    {
        return a.internalNow();
    }

    public static void setInstance(DateAndTime dateandtime)
    {
        a = dateandtime;
    }

    public TimeZone internalLocalTimeZone()
    {
        return TimeZone.getDefault();
    }

    public Date internalNow()
    {
        return new Date();
    }

}
