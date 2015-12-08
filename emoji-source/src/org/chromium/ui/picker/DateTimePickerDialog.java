// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;

// Referenced classes of package org.chromium.ui.picker:
//            DateDialogNormalizer

public class DateTimePickerDialog extends AlertDialog
    implements android.content.DialogInterface.OnClickListener, android.widget.DatePicker.OnDateChangedListener, android.widget.TimePicker.OnTimeChangedListener
{
    public static interface OnDateTimeSetListener
    {

        public abstract void onDateTimeSet(DatePicker datepicker, TimePicker timepicker, int i, int j, int k, int l, int i1);
    }


    private final OnDateTimeSetListener mCallBack;
    private final DatePicker mDatePicker;
    private final long mMaxTimeMillis;
    private final long mMinTimeMillis;
    private final TimePicker mTimePicker;

    public DateTimePickerDialog(Context context, OnDateTimeSetListener ondatetimesetlistener, int i, int j, int k, int l, int i1, 
            boolean flag, double d, double d1)
    {
        super(context, 0);
        mMinTimeMillis = (long)d;
        mMaxTimeMillis = (long)d1;
        mCallBack = ondatetimesetlistener;
        setButton(-1, context.getText(org.chromium.ui.R.string.date_picker_dialog_set), this);
        setButton(-2, context.getText(0x1040000), (android.content.DialogInterface.OnClickListener)null);
        setIcon(0);
        setTitle(context.getText(org.chromium.ui.R.string.date_time_picker_dialog_title));
        context = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(org.chromium.ui.R.layout.date_time_picker_dialog, null);
        setView(context);
        mDatePicker = (DatePicker)context.findViewById(org.chromium.ui.R.id.date_picker);
        DateDialogNormalizer.normalize(mDatePicker, this, i, j, k, l, i1, mMinTimeMillis, mMaxTimeMillis);
        mTimePicker = (TimePicker)context.findViewById(org.chromium.ui.R.id.time_picker);
        mTimePicker.setIs24HourView(Boolean.valueOf(flag));
        mTimePicker.setCurrentHour(Integer.valueOf(l));
        mTimePicker.setCurrentMinute(Integer.valueOf(i1));
        mTimePicker.setOnTimeChangedListener(this);
        onTimeChanged(mTimePicker, mTimePicker.getCurrentHour().intValue(), mTimePicker.getCurrentMinute().intValue());
    }

    private void tryNotifyDateTimeSet()
    {
        if (mCallBack != null)
        {
            mDatePicker.clearFocus();
            mCallBack.onDateTimeSet(mDatePicker, mTimePicker, mDatePicker.getYear(), mDatePicker.getMonth(), mDatePicker.getDayOfMonth(), mTimePicker.getCurrentHour().intValue(), mTimePicker.getCurrentMinute().intValue());
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        tryNotifyDateTimeSet();
    }

    public void onDateChanged(DatePicker datepicker, int i, int j, int k)
    {
        if (mTimePicker != null)
        {
            onTimeChanged(mTimePicker, mTimePicker.getCurrentHour().intValue(), mTimePicker.getCurrentMinute().intValue());
        }
    }

    public void onTimeChanged(TimePicker timepicker, int i, int j)
    {
        timepicker = new Time();
        timepicker.set(0, mTimePicker.getCurrentMinute().intValue(), mTimePicker.getCurrentHour().intValue(), mDatePicker.getDayOfMonth(), mDatePicker.getMonth(), mDatePicker.getYear());
        if (timepicker.toMillis(true) >= mMinTimeMillis) goto _L2; else goto _L1
_L1:
        timepicker.set(mMinTimeMillis);
_L4:
        mTimePicker.setCurrentHour(Integer.valueOf(((Time) (timepicker)).hour));
        mTimePicker.setCurrentMinute(Integer.valueOf(((Time) (timepicker)).minute));
        return;
_L2:
        if (timepicker.toMillis(true) > mMaxTimeMillis)
        {
            timepicker.set(mMaxTimeMillis);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void updateDateTime(int i, int j, int k, int l, int i1)
    {
        mDatePicker.updateDate(i, j, k);
        mTimePicker.setCurrentHour(Integer.valueOf(l));
        mTimePicker.setCurrentMinute(Integer.valueOf(i1));
    }
}
