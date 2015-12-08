// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.content.Context;
import android.content.res.Resources;
import android.widget.NumberPicker;
import java.util.Calendar;
import java.util.TimeZone;

// Referenced classes of package org.chromium.ui.picker:
//            TwoFieldDatePicker

public class WeekPicker extends TwoFieldDatePicker
{

    public WeekPicker(Context context, double d, double d1)
    {
        super(context, d, d1);
        getPositionInYearSpinner().setContentDescription(getResources().getString(org.chromium.ui.R.string.accessibility_date_picker_week));
        context = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        context.setFirstDayOfWeek(2);
        context.setMinimalDaysInFirstWeek(4);
        context.setTimeInMillis(System.currentTimeMillis());
        init(getISOWeekYearForDate(context), getWeekForDate(context), null);
    }

    public static Calendar createDateFromValue(double d)
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.setFirstDayOfWeek(2);
        calendar.setMinimalDaysInFirstWeek(4);
        calendar.setTimeInMillis((long)d);
        return calendar;
    }

    public static Calendar createDateFromWeek(int i, int j)
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.setFirstDayOfWeek(2);
        calendar.setMinimalDaysInFirstWeek(4);
        calendar.set(7, 2);
        calendar.set(1, i);
        calendar.set(3, j);
        return calendar;
    }

    public static int getISOWeekYearForDate(Calendar calendar)
    {
        int j = calendar.get(1);
        int k = calendar.get(2);
        int l = calendar.get(3);
        int i;
        if (k == 0 && l > 51)
        {
            i = j - 1;
        } else
        {
            i = j;
            if (k == 11)
            {
                i = j;
                if (l == 1)
                {
                    return j + 1;
                }
            }
        }
        return i;
    }

    private int getNumberOfWeeks(int i)
    {
        return createDateFromWeek(i, 20).getActualMaximum(3);
    }

    public static int getWeekForDate(Calendar calendar)
    {
        return calendar.get(3);
    }

    protected Calendar getDateForValue(double d)
    {
        return createDateFromValue(d);
    }

    protected int getMaxPositionInYear(int i)
    {
        if (i == getISOWeekYearForDate(getMaxDate()))
        {
            return getWeekForDate(getMaxDate());
        } else
        {
            return getNumberOfWeeks(i);
        }
    }

    protected int getMaxYear()
    {
        return getISOWeekYearForDate(getMaxDate());
    }

    protected int getMinPositionInYear(int i)
    {
        if (i == getISOWeekYearForDate(getMinDate()))
        {
            return getWeekForDate(getMinDate());
        } else
        {
            return 1;
        }
    }

    protected int getMinYear()
    {
        return getISOWeekYearForDate(getMinDate());
    }

    public int getPositionInYear()
    {
        return getWeek();
    }

    public int getWeek()
    {
        return getWeekForDate(getCurrentDate());
    }

    public int getYear()
    {
        return getISOWeekYearForDate(getCurrentDate());
    }

    protected void setCurrentDate(int i, int j)
    {
        Calendar calendar = createDateFromWeek(i, j);
        if (calendar.before(getMinDate()))
        {
            setCurrentDate(getMinDate());
            return;
        }
        if (calendar.after(getMaxDate()))
        {
            setCurrentDate(getMaxDate());
            return;
        } else
        {
            setCurrentDate(calendar);
            return;
        }
    }
}
