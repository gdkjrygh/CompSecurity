// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.widget.DatePicker;
import java.util.Calendar;
import java.util.TimeZone;

public class DateDialogNormalizer
{

    public DateDialogNormalizer()
    {
    }

    public static void normalize(DatePicker datepicker, android.widget.DatePicker.OnDateChangedListener ondatechangedlistener, int i, int j, int k, int l, int i1, long l1, long l2)
    {
        Calendar calendar;
        calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.clear();
        calendar.set(i, j, k, l, i1, 0);
        if (calendar.getTimeInMillis() >= l1) goto _L2; else goto _L1
_L1:
        calendar.clear();
        calendar.setTimeInMillis(l1);
_L4:
        datepicker.init(calendar.get(1), calendar.get(2), calendar.get(5), ondatechangedlistener);
        setLimits(datepicker, l1, l2);
        return;
_L2:
        if (calendar.getTimeInMillis() > l2)
        {
            calendar.clear();
            calendar.setTimeInMillis(l2);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void setLimits(DatePicker datepicker, long l, long l1)
    {
        if (l1 <= l)
        {
            return;
        } else
        {
            Calendar calendar = trimToDate(l);
            Calendar calendar1 = trimToDate(l1);
            int i = datepicker.getYear();
            int j = datepicker.getMonth();
            int k = datepicker.getDayOfMonth();
            datepicker.updateDate(calendar1.get(1), calendar1.get(2), calendar1.get(5));
            datepicker.setMinDate(calendar.getTimeInMillis());
            datepicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
            datepicker.setMaxDate(calendar1.getTimeInMillis());
            datepicker.updateDate(i, j, k);
            return;
        }
    }

    private static Calendar trimToDate(long l)
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar.clear();
        calendar.setTimeInMillis(l);
        Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        calendar1.clear();
        calendar1.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar1;
    }
}
