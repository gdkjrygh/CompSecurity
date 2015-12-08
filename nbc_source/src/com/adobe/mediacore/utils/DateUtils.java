// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.utils;

import java.util.Date;

public class DateUtils
{

    public DateUtils()
    {
    }

    public static long getMillisecondsSince(Date date)
    {
        Date date1;
        if (date != null)
        {
            if ((date1 = new Date()).compareTo(date) > 0)
            {
                return date1.getTime() - date.getTime();
            }
        }
        return 0L;
    }
}
