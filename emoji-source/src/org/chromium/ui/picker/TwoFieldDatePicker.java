// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public abstract class TwoFieldDatePicker extends FrameLayout
{
    public static interface OnMonthOrWeekChangedListener
    {

        public abstract void onMonthOrWeekChanged(TwoFieldDatePicker twofielddatepicker, int i, int j);
    }


    private Calendar mCurrentDate;
    private Calendar mMaxDate;
    private Calendar mMinDate;
    private OnMonthOrWeekChangedListener mMonthOrWeekChangedListener;
    private final NumberPicker mPositionInYearSpinner;
    private final NumberPicker mYearSpinner;

    public TwoFieldDatePicker(Context context, double d, double d1)
    {
        super(context, null, 0x101035c);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(org.chromium.ui.R.layout.two_field_date_picker, this, true);
        context = new android.widget.NumberPicker.OnValueChangeListener() {

            final TwoFieldDatePicker this$0;

            public void onValueChange(NumberPicker numberpicker, int i, int j)
            {
                int k;
                int j1;
                j1 = getYear();
                k = getPositionInYear();
                if (numberpicker != mPositionInYearSpinner) goto _L2; else goto _L1
_L1:
                int i1 = j;
                if (i != numberpicker.getMaxValue() || j != numberpicker.getMinValue()) goto _L4; else goto _L3
_L3:
                int l;
                l = j1 + 1;
                k = getMinPositionInYear(l);
_L6:
                setCurrentDate(l, k);
                updateSpinners();
                notifyDateChanged();
                return;
_L4:
                k = i1;
                l = j1;
                if (i == numberpicker.getMinValue())
                {
                    k = i1;
                    l = j1;
                    if (j == numberpicker.getMaxValue())
                    {
                        l = j1 - 1;
                        k = getMaxPositionInYear(l);
                    }
                }
                continue; /* Loop/switch isn't completed */
_L2:
                if (numberpicker == mYearSpinner)
                {
                    l = j;
                } else
                {
                    throw new IllegalArgumentException();
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = TwoFieldDatePicker.this;
                super();
            }
        };
        mCurrentDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (d >= d1)
        {
            mMinDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            mMinDate.set(0, 0, 1);
            mMaxDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            mMaxDate.set(9999, 0, 1);
        } else
        {
            mMinDate = getDateForValue(d);
            mMaxDate = getDateForValue(d1);
        }
        mPositionInYearSpinner = (NumberPicker)findViewById(org.chromium.ui.R.id.position_in_year);
        mPositionInYearSpinner.setOnLongPressUpdateInterval(200L);
        mPositionInYearSpinner.setOnValueChangedListener(context);
        mYearSpinner = (NumberPicker)findViewById(org.chromium.ui.R.id.year);
        mYearSpinner.setOnLongPressUpdateInterval(100L);
        mYearSpinner.setOnValueChangedListener(context);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        onPopulateAccessibilityEvent(accessibilityevent);
        return true;
    }

    protected Calendar getCurrentDate()
    {
        return mCurrentDate;
    }

    protected abstract Calendar getDateForValue(double d);

    protected Calendar getMaxDate()
    {
        return mMaxDate;
    }

    protected abstract int getMaxPositionInYear(int i);

    protected abstract int getMaxYear();

    protected Calendar getMinDate()
    {
        return mMinDate;
    }

    protected abstract int getMinPositionInYear(int i);

    protected abstract int getMinYear();

    public abstract int getPositionInYear();

    protected NumberPicker getPositionInYearSpinner()
    {
        return mPositionInYearSpinner;
    }

    public int getYear()
    {
        return mCurrentDate.get(1);
    }

    protected NumberPicker getYearSpinner()
    {
        return mYearSpinner;
    }

    public void init(int i, int j, OnMonthOrWeekChangedListener onmonthorweekchangedlistener)
    {
        setCurrentDate(i, j);
        updateSpinners();
        mMonthOrWeekChangedListener = onmonthorweekchangedlistener;
    }

    public boolean isNewDate(int i, int j)
    {
        return getYear() != i || getPositionInYear() != j;
    }

    protected void notifyDateChanged()
    {
        sendAccessibilityEvent(4);
        if (mMonthOrWeekChangedListener != null)
        {
            mMonthOrWeekChangedListener.onMonthOrWeekChanged(this, getYear(), getPositionInYear());
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        String s = DateUtils.formatDateTime(getContext(), mCurrentDate.getTimeInMillis(), 20);
        accessibilityevent.getText().add(s);
    }

    protected abstract void setCurrentDate(int i, int j);

    protected void setCurrentDate(Calendar calendar)
    {
        mCurrentDate = calendar;
    }

    public void updateDate(int i, int j)
    {
        if (!isNewDate(i, j))
        {
            return;
        } else
        {
            setCurrentDate(i, j);
            updateSpinners();
            notifyDateChanged();
            return;
        }
    }

    protected void updateSpinners()
    {
        mPositionInYearSpinner.setDisplayedValues(null);
        mPositionInYearSpinner.setMinValue(getMinPositionInYear(getYear()));
        mPositionInYearSpinner.setMaxValue(getMaxPositionInYear(getYear()));
        NumberPicker numberpicker = mPositionInYearSpinner;
        boolean flag;
        if (!mCurrentDate.equals(mMinDate) && !mCurrentDate.equals(mMaxDate))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        numberpicker.setWrapSelectorWheel(flag);
        mYearSpinner.setMinValue(getMinYear());
        mYearSpinner.setMaxValue(getMaxYear());
        mYearSpinner.setWrapSelectorWheel(false);
        mYearSpinner.setValue(getYear());
        mPositionInYearSpinner.setValue(getPositionInYear());
    }


}
