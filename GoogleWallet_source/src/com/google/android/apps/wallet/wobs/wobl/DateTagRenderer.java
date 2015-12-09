// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl;

import android.content.Context;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Strings;
import com.google.wallet.wobl.intermediaterepresentation.DateIr;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTagRenderer
{

    private static final String TAG = com/google/android/apps/wallet/wobs/wobl/DateTagRenderer.getSimpleName();
    private final Context context;
    Calendar currentTime;

    public DateTagRenderer(Context context1)
    {
        context = context1;
        currentTime = Calendar.getInstance();
    }

    private static Calendar addTime(Calendar calendar, int i, int j)
    {
        calendar = (Calendar)calendar.clone();
        calendar.add(i, j);
        return calendar;
    }

    private String getApproximateDateDisplayString(DateIr dateir)
    {
        long l = dateir.getDate().getTime();
        Date date = addTime(currentTime, 12, -1).getTime();
        Date date1 = addTime(currentTime, 12, 1).getTime();
        if (date.getTime() < l && l < date1.getTime())
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
        currentTime.setTimeZone(dateir.getDisplayTimeZone());
        date1 = getStartOfDay(currentTime);
        if (date1.getTime() <= l && l <= l1)
        {
            int j = (int)((l1 - l) / TimeUnit.HOURS.toMillis(1L));
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_n_hours_ago, new Object[] {
                Integer.valueOf(j)
            });
        }
        date = getStartOfDay(addTime(currentTime, 5, 1));
        if (date1.getTime() <= l && l < date.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_today);
        }
        if (getStartOfDay(addTime(currentTime, 5, -1)).getTime() <= l && l < date1.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_yesterday);
        }
        date1 = getStartOfDay(addTime(currentTime, 5, 2));
        if (date.getTime() <= l && l < date1.getTime())
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
            return getDisplayStringForSameYearOrOverAYearDate(dateir, currentTime.get(1));
        }
    }

    private static String getDisplayStringForSameYearOrOverAYearDate(DateIr dateir, int i)
    {
        Date date = dateir.getDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTimeZone(dateir.getDisplayTimeZone());
        if (calendar.get(1) == i)
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("MMM dd");
            simpledateformat.setTimeZone(dateir.getDisplayTimeZone());
            return simpledateformat.format(date);
        } else
        {
            SimpleDateFormat simpledateformat1 = new SimpleDateFormat("MMM dd, yyyy");
            simpledateformat1.setTimeZone(dateir.getDisplayTimeZone());
            return simpledateformat1.format(date);
        }
    }

    private String getRelativeDateDisplayString(DateIr dateir)
    {
        Date date = dateir.getDate();
        long l = date.getTime();
        currentTime.setTimeZone(dateir.getDisplayTimeZone());
        Date date1 = getStartOfDay(currentTime);
        Object obj = getStartOfDay(addTime(currentTime, 5, 1));
        if (date1.getTime() <= l && l < ((Date) (obj)).getTime())
        {
            obj = new SimpleDateFormat("h:mm a");
            ((DateFormat) (obj)).setTimeZone(dateir.getDisplayTimeZone());
            return ((DateFormat) (obj)).format(date);
        }
        if (getStartOfDay(addTime(currentTime, 5, -1)).getTime() <= l && l < date1.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_yesterday);
        }
        date = getStartOfDay(addTime(currentTime, 5, 2));
        if (((Date) (obj)).getTime() < l && l < date.getTime())
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.smart_date_tomorrow);
        } else
        {
            return getDisplayStringForSameYearOrOverAYearDate(dateir, currentTime.get(1));
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

    private void processTemplateAttribute(DateIr dateir)
    {
        String s = dateir.getTemplate();
        if ("relative".equalsIgnoreCase(s))
        {
            dateir.setText(getRelativeDateDisplayString(dateir));
            return;
        }
        if ("approximate".equalsIgnoreCase(s))
        {
            dateir.setText(getApproximateDateDisplayString(dateir));
            return;
        }
        SimpleDateFormat simpledateformat1 = new SimpleDateFormat("MMM dd, yyyy");
        SimpleDateFormat simpledateformat = simpledateformat1;
        if (!"absolute".equalsIgnoreCase(s))
        {
            try
            {
                simpledateformat = new SimpleDateFormat(s);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                WLog.efmt(TAG, illegalargumentexception, "Unable to parse date format '%s'", new Object[] {
                    s
                });
                illegalargumentexception = simpledateformat1;
            }
        }
        simpledateformat.setTimeZone(dateir.getDisplayTimeZone());
        dateir.setText(simpledateformat.format(dateir.getDate()));
    }

    public final void render(DateIr dateir)
    {
        if (!Strings.isNullOrEmpty(dateir.getTemplate()))
        {
            processTemplateAttribute(dateir);
        }
    }

}
