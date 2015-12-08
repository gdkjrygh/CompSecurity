// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.NumberPicker;
import java.util.ArrayList;

public class MultiFieldTimePickerDialog extends AlertDialog
    implements android.content.DialogInterface.OnClickListener
{
    private static class NumberFormatter
        implements android.widget.NumberPicker.Formatter
    {

        private final String mFormat;

        public String format(int i)
        {
            return String.format(mFormat, new Object[] {
                Integer.valueOf(i)
            });
        }

        NumberFormatter(String s)
        {
            mFormat = s;
        }
    }

    public static interface OnMultiFieldTimeSetListener
    {

        public abstract void onTimeSet(int i, int j, int k, int l);
    }


    private static final int HOUR_IN_MILLIS = 0x36ee80;
    private static final int MINUTE_IN_MILLIS = 60000;
    private static final int SECOND_IN_MILLIS = 1000;
    private final NumberPicker mAmPmSpinner;
    private final int mBaseMilli;
    private final NumberPicker mHourSpinner;
    private final boolean mIs24hourFormat;
    private final OnMultiFieldTimeSetListener mListener;
    private final NumberPicker mMilliSpinner;
    private final NumberPicker mMinuteSpinner;
    private final NumberPicker mSecSpinner;
    private final int mStep;

    public MultiFieldTimePickerDialog(Context context, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1, boolean flag, OnMultiFieldTimeSetListener onmultifieldtimesetlistener)
    {
        int i2;
        int k2;
label0:
        {
            super(context, i);
            mListener = onmultifieldtimesetlistener;
            mStep = l1;
            mIs24hourFormat = flag;
            k2 = j1;
            i2 = k1;
            if (j1 >= k1)
            {
                k2 = 0;
                i2 = 0x5265bff;
            }
            if (l1 >= 0)
            {
                k1 = l1;
                if (l1 < 0x5265c00)
                {
                    break label0;
                }
            }
            k1 = 60000;
        }
        onmultifieldtimesetlistener = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(org.chromium.ui.R.layout.multi_field_time_picker_dialog, null);
        setView(onmultifieldtimesetlistener);
        mHourSpinner = (NumberPicker)onmultifieldtimesetlistener.findViewById(org.chromium.ui.R.id.hour);
        mMinuteSpinner = (NumberPicker)onmultifieldtimesetlistener.findViewById(org.chromium.ui.R.id.minute);
        mSecSpinner = (NumberPicker)onmultifieldtimesetlistener.findViewById(org.chromium.ui.R.id.second);
        mMilliSpinner = (NumberPicker)onmultifieldtimesetlistener.findViewById(org.chromium.ui.R.id.milli);
        mAmPmSpinner = (NumberPicker)onmultifieldtimesetlistener.findViewById(org.chromium.ui.R.id.ampm);
        i = k2 / 0x36ee80;
        int l2 = i2 / 0x36ee80;
        int k3 = k2 - 0x36ee80 * i;
        int l3 = i2 - 0x36ee80 * l2;
        if (i == l2)
        {
            mHourSpinner.setEnabled(false);
            j = i;
        }
        int i3;
        if (flag)
        {
            mAmPmSpinner.setVisibility(8);
            j1 = j;
            j = i;
            i = l2;
        } else
        {
            l1 = i / 12;
            k2 = l2 / 12;
            int j2 = j / 12;
            mAmPmSpinner.setMinValue(l1);
            mAmPmSpinner.setMaxValue(k2);
            mAmPmSpinner.setDisplayedValues(new String[] {
                context.getString(org.chromium.ui.R.string.time_picker_dialog_am), context.getString(org.chromium.ui.R.string.time_picker_dialog_pm)
            });
            j %= 12;
            j1 = j;
            if (j == 0)
            {
                j1 = 12;
            }
            if (l1 == k2)
            {
                mAmPmSpinner.setEnabled(false);
                int j3 = i % 12;
                k2 = l2 % 12;
                if (j3 == 0 && k2 == 0)
                {
                    j = 12;
                    i = 12;
                    j2 = l1;
                } else
                if (j3 == 0)
                {
                    j = k2;
                    i = 12;
                    j2 = l1;
                } else
                {
                    j2 = l1;
                    i = k2;
                    j = j3;
                    if (k2 == 0)
                    {
                        i = 12;
                        j2 = l1;
                        j = j3;
                    }
                }
            } else
            {
                j = 1;
                i = 12;
            }
            mAmPmSpinner.setValue(j2);
        }
        if (j == i)
        {
            mHourSpinner.setEnabled(false);
        }
        mHourSpinner.setMinValue(j);
        mHourSpinner.setMaxValue(i);
        mHourSpinner.setValue(j1);
        context = new NumberFormatter("%02d");
        j1 = k3 / 60000;
        i2 = l3 / 60000;
        k2 = k3 - 60000 * j1;
        i3 = l3 - 60000 * i2;
        if (j == i)
        {
            mMinuteSpinner.setMinValue(j1);
            mMinuteSpinner.setMaxValue(i2);
            if (j1 == i2)
            {
                mMinuteSpinner.setDisplayedValues(new String[] {
                    context.format(j1)
                });
                mMinuteSpinner.setEnabled(false);
                k = j1;
            }
        } else
        {
            mMinuteSpinner.setMinValue(0);
            mMinuteSpinner.setMaxValue(59);
        }
        if (k1 >= 0x36ee80)
        {
            mMinuteSpinner.setEnabled(false);
        }
        mMinuteSpinner.setValue(k);
        mMinuteSpinner.setFormatter(context);
        if (k1 >= 60000)
        {
            onmultifieldtimesetlistener.findViewById(org.chromium.ui.R.id.second_colon).setVisibility(8);
            mSecSpinner.setVisibility(8);
        }
        l1 = k2 / 1000;
        l2 = i3 / 1000;
        k = k2 - l1 * 1000;
        k2 = i3 - l2 * 1000;
        if (j == i && j1 == i2)
        {
            mSecSpinner.setMinValue(l1);
            mSecSpinner.setMaxValue(l2);
            if (l1 == l2)
            {
                mSecSpinner.setDisplayedValues(new String[] {
                    context.format(l1)
                });
                mSecSpinner.setEnabled(false);
                l = l1;
            }
        } else
        {
            mSecSpinner.setMinValue(0);
            mSecSpinner.setMaxValue(59);
        }
        mSecSpinner.setValue(l);
        mSecSpinner.setFormatter(context);
        if (k1 >= 1000)
        {
            onmultifieldtimesetlistener.findViewById(org.chromium.ui.R.id.second_dot).setVisibility(8);
            mMilliSpinner.setVisibility(8);
        }
        l = ((k1 / 2 + i1) / k1) * k1;
        if (k1 == 1 || k1 == 10 || k1 == 100)
        {
            if (j == i && j1 == i2 && l1 == l2)
            {
                mMilliSpinner.setMinValue(k / k1);
                mMilliSpinner.setMaxValue(k2 / k1);
                i = l;
                if (k == k2)
                {
                    mMilliSpinner.setEnabled(false);
                    i = k;
                }
            } else
            {
                mMilliSpinner.setMinValue(0);
                mMilliSpinner.setMaxValue(999 / k1);
                i = l;
            }
            if (k1 == 1)
            {
                mMilliSpinner.setFormatter(new NumberFormatter("%03d"));
            } else
            if (k1 == 10)
            {
                mMilliSpinner.setFormatter(new NumberFormatter("%02d"));
            } else
            if (k1 == 100)
            {
                mMilliSpinner.setFormatter(new NumberFormatter("%d"));
            }
            mMilliSpinner.setValue(i / k1);
            mBaseMilli = 0;
            return;
        } else
        if (k1 < 1000)
        {
            context = new ArrayList();
            for (i = k; i < k2; i += k1)
            {
                context.add(String.format("%03d", new Object[] {
                    Integer.valueOf(i)
                }));
            }

            mMilliSpinner.setMinValue(0);
            mMilliSpinner.setMaxValue(context.size() - 1);
            mMilliSpinner.setValue((l - k) / k1);
            mMilliSpinner.setDisplayedValues((String[])context.toArray(new String[context.size()]));
            mBaseMilli = k;
            return;
        } else
        {
            mBaseMilli = 0;
            return;
        }
    }

    private void notifyDateSet()
    {
        int i = mHourSpinner.getValue();
        int k = mMinuteSpinner.getValue();
        int l = mSecSpinner.getValue();
        int i1 = mMilliSpinner.getValue();
        int j1 = mStep;
        int k1 = mBaseMilli;
        int j = i;
        if (!mIs24hourFormat)
        {
            int l1 = mAmPmSpinner.getValue();
            j = i;
            if (i == 12)
            {
                j = 0;
            }
            j += l1 * 12;
        }
        mListener.onTimeSet(j, k, l, i1 * j1 + k1);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        notifyDateSet();
    }
}
