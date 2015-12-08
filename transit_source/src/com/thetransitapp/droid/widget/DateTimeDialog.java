// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TimePicker;
import com.github.rtyley.android.sherlock.roboguice.fragment.RoboSherlockDialogFragment;
import java.util.Calendar;
import java.util.Date;

public class DateTimeDialog extends RoboSherlockDialogFragment
    implements android.view.View.OnClickListener, android.app.DatePickerDialog.OnDateSetListener, android.app.TimePickerDialog.OnTimeSetListener
{
    public static interface OnDateTimePickedListener
    {

        public abstract void onDateTimePicked(Date date, boolean flag);
    }


    private boolean arriveBy;
    private Calendar calendar;
    private Button cancelButton;
    private Button datePicker;
    private OnDateTimePickedListener dateTimePickedListener;
    private Button okButton;
    private Button timePicker;
    private Spinner typePicker;

    public DateTimeDialog()
    {
        calendar = Calendar.getInstance();
    }

    private void updateButtonText()
    {
        String s = DateFormat.getLongDateFormat(super.getActivity()).format(calendar.getTime());
        String s1 = DateFormat.getTimeFormat(super.getActivity()).format(calendar.getTime());
        datePicker.setText(s);
        timePicker.setText(s1);
    }

    public void onClick(View view)
    {
        boolean flag = true;
        if (view == datePicker)
        {
            int i = calendar.get(1);
            int k = calendar.get(2);
            int i1 = calendar.get(5);
            (new DatePickerDialog(super.getActivity(), this, i, k, i1)).show();
            return;
        }
        if (view == timePicker)
        {
            int j = calendar.get(11);
            int l = calendar.get(12);
            (new TimePickerDialog(super.getActivity(), this, j, l, DateFormat.is24HourFormat(super.getActivity()))).show();
            return;
        }
        if (view == okButton && dateTimePickedListener != null)
        {
            view = dateTimePickedListener;
            Date date = calendar.getTime();
            if (typePicker.getSelectedItemPosition() != 1)
            {
                flag = false;
            }
            view.onDateTimePicked(date, flag);
        }
        super.dismiss();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030019, viewgroup, false);
    }

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        calendar.set(1, i);
        calendar.set(2, j);
        calendar.set(5, k);
        updateButtonText();
    }

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        calendar.set(11, i);
        calendar.set(12, j);
        updateButtonText();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        super.getDialog().setTitle(0x7f0a0091);
        datePicker.setOnClickListener(this);
        timePicker.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
        okButton.setOnClickListener(this);
        view = typePicker;
        int i;
        if (arriveBy)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        view.setSelection(i);
        updateButtonText();
    }

    public void setArriveBy(boolean flag)
    {
        arriveBy = flag;
    }

    public void setDate(Date date)
    {
        if (date != null)
        {
            calendar.setTime(date);
        }
    }

    public void setDateTimePickedListener(OnDateTimePickedListener ondatetimepickedlistener)
    {
        dateTimePickedListener = ondatetimepickedlistener;
    }
}
