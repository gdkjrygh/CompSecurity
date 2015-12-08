// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.date;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.google.common.base.Optional;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class SimpleDatePicker extends FrameLayout
{
    public static interface OnDateChangedListener
    {

        public abstract void onDateChanged(SimpleDatePicker simpledatepicker, int i, int j, int k);
    }

    static final class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            private static SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final int mDay;
        private final int mMonth;
        private final Optional mYear;

        public final int getDay()
        {
            return mDay;
        }

        public final int getMonth()
        {
            return mMonth;
        }

        public final Optional getYear()
        {
            return mYear;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            if (mYear.isPresent())
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
            if (mYear.isPresent())
            {
                parcel.writeInt(((Integer)mYear.get()).intValue());
            }
            parcel.writeInt(mMonth);
            parcel.writeInt(mDay);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            Optional optional;
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                optional = Optional.of(Integer.valueOf(parcel.readInt()));
            } else
            {
                optional = Optional.absent();
            }
            mYear = optional;
            mMonth = parcel.readInt();
            mDay = parcel.readInt();
        }


        private SavedState(Parcelable parcelable, Optional optional, int i, int j)
        {
            super(parcelable);
            mYear = optional;
            mMonth = i;
            mDay = j;
        }

    }


    private static final android.widget.NumberPicker.Formatter TWO_DIGIT_FORMATTER = new android.widget.NumberPicker.Formatter() {

        final StringBuilder builder = new StringBuilder();
        final Formatter fmt;

        public final String format(int i)
        {
            builder.delete(0, builder.length());
            fmt.format("%02d", new Object[] {
                Integer.valueOf(i)
            });
            return fmt.toString();
        }

            
            {
                fmt = new Formatter(builder, Locale.getDefault());
            }
    };
    private int day;
    private final NumberPicker dayPicker;
    private int month;
    private final NumberPicker monthPicker;
    private OnDateChangedListener onDateChangedListener;
    private final LinearLayout pickerContainer;
    private Optional year;
    private final NumberPicker yearPicker;

    public SimpleDatePicker(Context context)
    {
        this(context, null);
    }

    public SimpleDatePicker(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SimpleDatePicker(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.google.android.apps.walletnfcrel.R.layout.date_picker, this, true);
        pickerContainer = (LinearLayout)findViewById(com.google.android.apps.walletnfcrel.R.id.parent);
        dayPicker = (NumberPicker)findViewById(com.google.android.apps.walletnfcrel.R.id.day);
        dayPicker.setFormatter(TWO_DIGIT_FORMATTER);
        dayPicker.setOnLongPressUpdateInterval(100L);
        dayPicker.setOnValueChangedListener(new android.widget.NumberPicker.OnValueChangeListener() {

            final SimpleDatePicker this$0;

            public final void onValueChange(NumberPicker numberpicker, int j, int k)
            {
                day = k;
                notifyDateChanged();
            }

            
            {
                this$0 = SimpleDatePicker.this;
                super();
            }
        });
        monthPicker = (NumberPicker)findViewById(com.google.android.apps.walletnfcrel.R.id.month);
        monthPicker.setFormatter(TWO_DIGIT_FORMATTER);
        context = (new DateFormatSymbols()).getShortMonths();
        if (context.length == 13 && context[12].isEmpty())
        {
            attributeset = new String[12];
            System.arraycopy(context, 0, attributeset, 0, 12);
            context = attributeset;
        }
        yearPicker = (NumberPicker)findViewById(com.google.android.apps.walletnfcrel.R.id.year);
        attributeset = Calendar.getInstance();
        i = attributeset.get(1);
        yearPicker.setMinValue(i - 120);
        yearPicker.setMaxValue(i);
        yearPicker.setOnValueChangedListener(new android.widget.NumberPicker.OnValueChangeListener() {

            final SimpleDatePicker this$0;

            public final void onValueChange(NumberPicker numberpicker, int j, int k)
            {
                year = Optional.of(Integer.valueOf(k));
                adjustMaxDay();
                notifyDateChanged();
                updateDaySpinner();
            }

            
            {
                this$0 = SimpleDatePicker.this;
                super();
            }
        });
        if (context[0].startsWith("1"))
        {
            for (i = 0; i < context.length; i++)
            {
                context[i] = String.valueOf(i + 1);
            }

            monthPicker.setMinValue(1);
            monthPicker.setMaxValue(12);
        } else
        {
            monthPicker.setMinValue(1);
            monthPicker.setMaxValue(12);
            monthPicker.setDisplayedValues(context);
        }
        monthPicker.setOnLongPressUpdateInterval(200L);
        monthPicker.setOnValueChangedListener(new android.widget.NumberPicker.OnValueChangeListener() {

            final SimpleDatePicker this$0;

            public final void onValueChange(NumberPicker numberpicker, int j, int k)
            {
                month = k - 1;
                adjustMaxDay();
                notifyDateChanged();
                updateDaySpinner();
            }

            
            {
                this$0 = SimpleDatePicker.this;
                super();
            }
        });
        init(Optional.of(Integer.valueOf(attributeset.get(1))), attributeset.get(2), attributeset.get(5), null);
        reorderPickers(context);
        pickerContainer.setLayoutTransition(new LayoutTransition());
        if (!isEnabled())
        {
            setEnabled(false);
        }
    }

    private void adjustMaxDay()
    {
        int i = getMaxDaysInMonth(month);
        if (day > i)
        {
            day = i;
        }
    }

    private int getMaxDaysInMonth(int i)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(1, getYearOrDefault());
        calendar.set(2, i);
        return calendar.getActualMaximum(5);
    }

    private void init(Optional optional, int i, int j, OnDateChangedListener ondatechangedlistener)
    {
        year = optional;
        month = i;
        day = j;
        onDateChangedListener = ondatechangedlistener;
        updateSpinners();
    }

    private void notifyDateChanged()
    {
        if (onDateChangedListener != null)
        {
            onDateChangedListener.onDateChanged(this, getYearOrDefault(), month, day);
        }
    }

    private void reorderPickers(String as[])
    {
        int i;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (as[0].startsWith("1"))
        {
            as = DateFormat.getDateFormat(getContext());
        } else
        {
            as = DateFormat.getMediumDateFormat(getContext());
        }
        if (as instanceof SimpleDateFormat)
        {
            as = ((SimpleDateFormat)as).toPattern();
        } else
        {
            as = new String(DateFormat.getDateFormatOrder(getContext()));
        }
        pickerContainer.removeAllViews();
        flag4 = false;
        flag3 = false;
        flag2 = false;
        flag1 = false;
        i = 0;
        while (i < as.length()) 
        {
            char c = as.charAt(i);
            boolean flag = flag4;
            boolean flag5;
            boolean flag6;
            if (c == '\'')
            {
                if (!flag4)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            flag4 = flag3;
            flag5 = flag2;
            flag6 = flag1;
            if (!flag)
            {
                if (c == 'd' && !flag3)
                {
                    pickerContainer.addView(dayPicker);
                    flag4 = true;
                    flag6 = flag1;
                    flag5 = flag2;
                } else
                if ((c == 'M' || c == 'L') && !flag2)
                {
                    pickerContainer.addView(monthPicker);
                    flag5 = true;
                    flag4 = flag3;
                    flag6 = flag1;
                } else
                {
                    flag4 = flag3;
                    flag5 = flag2;
                    flag6 = flag1;
                    if (c == 'y')
                    {
                        flag4 = flag3;
                        flag5 = flag2;
                        flag6 = flag1;
                        if (!flag1)
                        {
                            pickerContainer.addView(yearPicker);
                            flag6 = true;
                            flag4 = flag3;
                            flag5 = flag2;
                        }
                    }
                }
            }
            i++;
            flag3 = flag4;
            flag2 = flag5;
            flag1 = flag6;
            flag4 = flag;
        }
        if (!flag1)
        {
            pickerContainer.addView(yearPicker);
        }
        if (!flag2)
        {
            pickerContainer.addView(monthPicker);
        }
        if (!flag3)
        {
            pickerContainer.addView(dayPicker);
        }
    }

    private void updateDaySpinner()
    {
        int i = getMaxDaysInMonth(month);
        dayPicker.setMinValue(1);
        dayPicker.setMaxValue(i);
        dayPicker.setValue(day);
    }

    private void updateSpinners()
    {
        updateDaySpinner();
        monthPicker.setValue(month + 1);
        if (year.isPresent())
        {
            yearPicker.setValue(getYearOrDefault());
            yearPicker.setVisibility(0);
            return;
        } else
        {
            yearPicker.setVisibility(8);
            return;
        }
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    public final int getDayOfMonth()
    {
        return day;
    }

    public final int getMonth()
    {
        return month;
    }

    public final Optional getYear()
    {
        return year;
    }

    public final int getYearOrDefault()
    {
        return ((Integer)year.or(Integer.valueOf(1992))).intValue();
    }

    public final void init(int i, int j, int k, OnDateChangedListener ondatechangedlistener)
    {
        init(Optional.of(Integer.valueOf(i)), j, k, ondatechangedlistener);
    }

    public final void init(int i, int j, OnDateChangedListener ondatechangedlistener)
    {
        init(Optional.absent(), i, j, ondatechangedlistener);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        year = parcelable.getYear();
        month = parcelable.getMonth();
        day = parcelable.getDay();
        updateSpinners();
    }

    protected Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), year, month, day);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        yearPicker.setEnabled(flag);
        dayPicker.setEnabled(flag);
        monthPicker.setEnabled(flag);
    }

    public final void updateDate(int i, int j, int k)
    {
        if (!year.equals(Optional.of(Integer.valueOf(i))) || month != j || day != k)
        {
            year = Optional.of(Integer.valueOf(i));
            month = j;
            day = k;
            updateSpinners();
            reorderPickers((new DateFormatSymbols()).getShortMonths());
            notifyDateChanged();
        }
    }



/*
    static int access$002(SimpleDatePicker simpledatepicker, int i)
    {
        simpledatepicker.day = i;
        return i;
    }

*/



/*
    static Optional access$202(SimpleDatePicker simpledatepicker, Optional optional)
    {
        simpledatepicker.year = optional;
        return optional;
    }

*/




/*
    static int access$502(SimpleDatePicker simpledatepicker, int i)
    {
        simpledatepicker.month = i;
        return i;
    }

*/
}
