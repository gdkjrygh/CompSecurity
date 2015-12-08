// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.content.Context;
import com.google.android.apps.wallet.logging.WLog;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DateRenderingHelper
{

    private static final String TAG = com/google/android/apps/wallet/wobs/wobl/protorenderer/DateRenderingHelper.getSimpleName();
    private final Context context;
    private final Calendar currentTime;

    public DateRenderingHelper(Context context1)
    {
        this(context1, Calendar.getInstance());
    }

    private DateRenderingHelper(Context context1, Calendar calendar)
    {
        context = context1;
        currentTime = calendar;
    }

    private static Calendar addTime(Calendar calendar, int i, int j)
    {
        calendar = (Calendar)calendar.clone();
        calendar.add(i, j);
        return calendar;
    }

    private String getAbsoluteDateDisplayString(com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Date date)
    {
        SimpleDateFormat simpledateformat;
        try
        {
            simpledateformat = new SimpleDateFormat(date.absoluteTemplate);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            WLog.efmt(TAG, illegalargumentexception, "Unable to parse date format '%s'", new Object[] {
                date.absoluteTemplate
            });
            return "";
        }
        simpledateformat.setTimeZone(getTimeZone(date));
        return simpledateformat.format(new Date(date.millisSinceEpoch.longValue()));
    }

    private String getApproximateDateDisplayString(com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Date date)
    {
        long l = date.millisSinceEpoch.longValue();
        Date date1 = addTime(currentTime, 12, -1).getTime();
        Date date2 = addTime(currentTime, 12, 1).getTime();
        if (date1.getTime() < l && l < date2.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_now);
        }
        long l1 = currentTime.getTime().getTime();
        if (addTime(currentTime, 12, -60).getTime().getTime() < l && l <= l1)
        {
            int i = (int)((l1 - l) / TimeUnit.MINUTES.toMillis(1L));
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_n_minutes_ago, new Object[] {
                Integer.valueOf(i)
            });
        }
        currentTime.setTimeZone(getTimeZone(date));
        date2 = getStartOfDay(currentTime);
        if (date2.getTime() <= l && l <= l1)
        {
            int j = (int)((l1 - l) / TimeUnit.HOURS.toMillis(1L));
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_n_hours_ago, new Object[] {
                Integer.valueOf(j)
            });
        }
        date1 = getStartOfDay(addTime(currentTime, 5, 1));
        if (date2.getTime() <= l && l < date1.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_today);
        }
        if (getStartOfDay(addTime(currentTime, 5, -1)).getTime() <= l && l < date2.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_yesterday);
        }
        date2 = getStartOfDay(addTime(currentTime, 5, 2));
        if (date1.getTime() <= l && l < date2.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_tomorrow);
        }
        if (getStartOfDay(addTime(currentTime, 5, -7)).getTime() <= l && l < l1)
        {
            int k = (int)((l1 - l) / TimeUnit.DAYS.toMillis(1L));
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_n_days_ago, new Object[] {
                Integer.valueOf(k)
            });
        } else
        {
            return getDisplayStringForSameYearOrOverAYearDate(date, currentTime.get(1));
        }
    }

    private String getDisplayStringForSameYearOrOverAYearDate(com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Date date, int i)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.millisSinceEpoch.longValue());
        calendar.setTimeZone(getTimeZone(date));
        SimpleDateFormat simpledateformat;
        if (calendar.get(1) == i)
        {
            simpledateformat = new SimpleDateFormat("MMM dd");
        } else
        {
            simpledateformat = new SimpleDateFormat("MMM dd, yyyy");
        }
        simpledateformat.setTimeZone(calendar.getTimeZone());
        return simpledateformat.format(new Date(date.millisSinceEpoch.longValue()));
    }

    private String getRelativeDateDisplayString(com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Date date)
    {
        Date date1 = new Date(date.millisSinceEpoch.longValue());
        long l = date1.getTime();
        currentTime.setTimeZone(getTimeZone(date));
        Date date2 = getStartOfDay(currentTime);
        Object obj = getStartOfDay(addTime(currentTime, 5, 1));
        if (date2.getTime() <= l && l < ((Date) (obj)).getTime())
        {
            obj = new SimpleDateFormat("h:mm a");
            ((DateFormat) (obj)).setTimeZone(getTimeZone(date));
            return ((DateFormat) (obj)).format(date1);
        }
        if (getStartOfDay(addTime(currentTime, 5, -1)).getTime() <= l && l < date2.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_yesterday);
        }
        date1 = getStartOfDay(addTime(currentTime, 5, 2));
        if (((Date) (obj)).getTime() < l && l < date1.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_tomorrow);
        } else
        {
            return getDisplayStringForSameYearOrOverAYearDate(date, currentTime.get(1));
        }
    }

    private static Date getStartOfDay(Calendar calendar)
    {
        calendar = (Calendar)calendar.clone();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    private static TimeZone getTimeZone(com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Date date)
    {
        if (date.timeZone == null)
        {
            return TimeZone.getDefault();
        } else
        {
            return TimeZone.getTimeZone(date.timeZone);
        }
    }

    public final String getDateDisplayString(com.google.wallet.proto.NanoCompiledWobl.InlineTextContent.Date date)
    {
        switch (date.style.intValue())
        {
        default:
            String s = TAG;
            date = String.valueOf(date.style);
            WLog.w(s, (new StringBuilder(String.valueOf(date).length() + 19)).append("Unknown date style ").append(date).toString());
            return "";

        case 1: // '\001'
            return getAbsoluteDateDisplayString(date);

        case 3: // '\003'
            return getApproximateDateDisplayString(date);

        case 2: // '\002'
            return getRelativeDateDisplayString(date);
        }
    }

}
