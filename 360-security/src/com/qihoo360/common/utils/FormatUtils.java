// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.text.format.DateUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatUtils
{

    public static final String FORMAT_SHOW_DATE_NO_YEAR = "dd/MM HH:mm";
    public static final String FORMAT_SHOW_YEAR = "yyyy";

    public FormatUtils()
    {
    }

    public static String getFormatedTime(long l)
    {
        String s;
        if (DateUtils.isToday(l))
        {
            s = "HH:mm";
        } else
        {
            s = "dd/MM/yyyy";
        }
        return getFormatedTime(l, s);
    }

    public static String getFormatedTime(long l, String s)
    {
        Date date = new Date(l);
        s = new SimpleDateFormat(s);
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(s.format(date));
        return stringbuffer.toString();
    }
}
