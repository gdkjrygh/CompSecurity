// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class ivc
{

    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    public static long a(long l)
    {
        return (long)TimeZone.getDefault().getOffset(l);
    }

    public static long a(long l, long l1)
    {
        return l + l1;
    }

    public static Calendar a()
    {
        return Calendar.getInstance(a);
    }

    public static Date b(long l)
    {
        return new Date(l - (long)TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    }

    public static TimeZone b()
    {
        return a;
    }

}
