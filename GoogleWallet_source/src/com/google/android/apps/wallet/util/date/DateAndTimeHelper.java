// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.date;

import android.app.Application;
import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.apps.wallet.base.java.System;
import com.google.common.base.Preconditions;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateAndTimeHelper
{

    private static final int DAY_ORDINALS[];
    private final Context application;
    private final String dayOfWeekNames[] = (new DateFormatSymbols()).getWeekdays();
    private final System system;

    public DateAndTimeHelper(System system1, Application application1)
    {
        system = system1;
        application = application1;
    }

    private boolean isTimestampFromThisYear(long l)
    {
        Calendar calendar = GregorianCalendar.getInstance();
        Object obj = system;
        long l1 = System.currentTimeMillis();
        calendar.setTimeInMillis(l1);
        calendar.set(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        obj = GregorianCalendar.getInstance();
        ((Calendar) (obj)).setTimeInMillis(l1);
        ((Calendar) (obj)).set(2, 11);
        ((Calendar) (obj)).set(5, 31);
        ((Calendar) (obj)).set(11, 23);
        ((Calendar) (obj)).set(12, 59);
        ((Calendar) (obj)).set(13, 59);
        ((Calendar) (obj)).set(14, 999);
        return calendar.getTimeInMillis() <= l && l <= ((Calendar) (obj)).getTimeInMillis();
    }

    private boolean isTimestampFromToday(long l)
    {
        boolean flag1 = false;
        Calendar calendar = GregorianCalendar.getInstance();
        Object obj = system;
        long l1 = System.currentTimeMillis();
        calendar.setTimeInMillis(l1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        obj = GregorianCalendar.getInstance();
        ((Calendar) (obj)).setTimeInMillis(l1);
        ((Calendar) (obj)).set(11, 23);
        ((Calendar) (obj)).set(12, 59);
        ((Calendar) (obj)).set(13, 59);
        ((Calendar) (obj)).set(14, 999);
        boolean flag = flag1;
        if (calendar.getTimeInMillis() <= l)
        {
            flag = flag1;
            if (l <= ((Calendar) (obj)).getTimeInMillis())
            {
                flag = true;
            }
        }
        return flag;
    }

    public final String formatAbsoluteDatetime(long l)
    {
        return DateUtils.formatDateTime(application, l, 0x10011);
    }

    public final String formatDate(long l, boolean flag)
    {
        Context context = application;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        return DateUtils.formatDateTime(context, l, i | 0x10010);
    }

    public final String formatIncrementedDate(long l, int i)
    {
        long l1 = l;
        if (i != 0)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(l);
            calendar.add(5, i);
            l1 = calendar.getTimeInMillis();
        }
        return formatDate(l1, false);
    }

    public final String formatSmartDate(long l)
    {
        boolean flag = true;
        if (isTimestampFromToday(l))
        {
            return DateUtils.formatDateTime(application, l, 1);
        }
        if (isTimestampFromThisYear(l))
        {
            flag = false;
        }
        return formatDate(l, flag);
    }

    public final String getDayOfMonthOrdinal(int i)
    {
        boolean flag;
        if (i > 0 && i < 32)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return application.getString(DAY_ORDINALS[i - 1]);
    }

    public final String getDayOfWeekName(int i)
    {
        return dayOfWeekNames[i];
    }

    static 
    {
        DAY_ORDINALS = (new int[] {
            com.google.android.apps.walletnfcrel.R.string.day_ordinal_1, com.google.android.apps.walletnfcrel.R.string.day_ordinal_2, com.google.android.apps.walletnfcrel.R.string.day_ordinal_3, com.google.android.apps.walletnfcrel.R.string.day_ordinal_4, com.google.android.apps.walletnfcrel.R.string.day_ordinal_5, com.google.android.apps.walletnfcrel.R.string.day_ordinal_6, com.google.android.apps.walletnfcrel.R.string.day_ordinal_7, com.google.android.apps.walletnfcrel.R.string.day_ordinal_8, com.google.android.apps.walletnfcrel.R.string.day_ordinal_9, com.google.android.apps.walletnfcrel.R.string.day_ordinal_10, 
            com.google.android.apps.walletnfcrel.R.string.day_ordinal_11, com.google.android.apps.walletnfcrel.R.string.day_ordinal_12, com.google.android.apps.walletnfcrel.R.string.day_ordinal_13, com.google.android.apps.walletnfcrel.R.string.day_ordinal_14, com.google.android.apps.walletnfcrel.R.string.day_ordinal_15, com.google.android.apps.walletnfcrel.R.string.day_ordinal_16, com.google.android.apps.walletnfcrel.R.string.day_ordinal_17, com.google.android.apps.walletnfcrel.R.string.day_ordinal_18, com.google.android.apps.walletnfcrel.R.string.day_ordinal_19, com.google.android.apps.walletnfcrel.R.string.day_ordinal_20, 
            com.google.android.apps.walletnfcrel.R.string.day_ordinal_21, com.google.android.apps.walletnfcrel.R.string.day_ordinal_22, com.google.android.apps.walletnfcrel.R.string.day_ordinal_23, com.google.android.apps.walletnfcrel.R.string.day_ordinal_24, com.google.android.apps.walletnfcrel.R.string.day_ordinal_25, com.google.android.apps.walletnfcrel.R.string.day_ordinal_26, com.google.android.apps.walletnfcrel.R.string.day_ordinal_27, com.google.android.apps.walletnfcrel.R.string.day_ordinal_28, com.google.android.apps.walletnfcrel.R.string.day_ordinal_29, com.google.android.apps.walletnfcrel.R.string.day_ordinal_30, 
            com.google.android.apps.walletnfcrel.R.string.day_ordinal_31
        });
    }
}
