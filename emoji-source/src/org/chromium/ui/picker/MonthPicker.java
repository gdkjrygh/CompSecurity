// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.content.Context;
import android.content.res.Resources;
import android.widget.NumberPicker;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package org.chromium.ui.picker:
//            TwoFieldDatePicker

public class MonthPicker extends TwoFieldDatePicker
{

    private static final int MONTHS_NUMBER = 12;
    private final String mShortMonths[] = DateFormatSymbols.getInstance(Locale.getDefault()).getShortMonths();

    public MonthPicker(Context context, double d, double d1)
    {
        super(context, d, d1);
        getPositionInYearSpinner().setContentDescription(getResources().getString(org.chromium.ui.R.string.accessibility_date_picker_month));
        context = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        init(context.get(1), context.get(2), null);
    }

    public static Calendar createDateFromValue(double d)
    {
        int i = (int)Math.min(d / 12D + 1970D, 2147483647D);
        int j = (int)(d % 12D);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set(i, j, 1);
        return calendar;
    }

    protected Calendar getDateForValue(double d)
    {
        return createDateFromValue(d);
    }

    protected int getMaxPositionInYear(int i)
    {
        if (i == getMaxDate().get(1))
        {
            return getMaxDate().get(2);
        } else
        {
            return 11;
        }
    }

    protected int getMaxYear()
    {
        return getMaxDate().get(1);
    }

    protected int getMinPositionInYear(int i)
    {
        if (i == getMinDate().get(1))
        {
            return getMinDate().get(2);
        } else
        {
            return 0;
        }
    }

    protected int getMinYear()
    {
        return getMinDate().get(1);
    }

    public int getMonth()
    {
        return getCurrentDate().get(2);
    }

    public int getPositionInYear()
    {
        return getMonth();
    }

    protected void setCurrentDate(int i, int j)
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(i, j, 1);
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

    protected void updateSpinners()
    {
        super.updateSpinners();
        String as[] = (String[])Arrays.copyOfRange(mShortMonths, getPositionInYearSpinner().getMinValue(), getPositionInYearSpinner().getMaxValue() + 1);
        getPositionInYearSpinner().setDisplayedValues(as);
    }
}
