// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import com.fitbit.util.TimeListenerFragment;

public class TimePickerDialogFragment extends TimeListenerFragment
    implements android.app.TimePickerDialog.OnTimeSetListener
{

    private static final String d = "titleFormatResId";
    private int e;
    private TimePicker f;

    public TimePickerDialogFragment()
    {
    }

    public TimePickerDialogFragment(android.app.TimePickerDialog.OnTimeSetListener ontimesetlistener, int i, int j, int k)
    {
        super(i, j);
        a(ontimesetlistener);
        e = k;
    }

    static int a(TimePickerDialogFragment timepickerdialogfragment)
    {
        return timepickerdialogfragment.b;
    }

    static int b(TimePickerDialogFragment timepickerdialogfragment)
    {
        return timepickerdialogfragment.c;
    }

    static int c(TimePickerDialogFragment timepickerdialogfragment)
    {
        return timepickerdialogfragment.e;
    }

    static TimePicker d(TimePickerDialogFragment timepickerdialogfragment)
    {
        return timepickerdialogfragment.f;
    }

    static int e(TimePickerDialogFragment timepickerdialogfragment)
    {
        return timepickerdialogfragment.b;
    }

    static int f(TimePickerDialogFragment timepickerdialogfragment)
    {
        return timepickerdialogfragment.c;
    }

    static android.app.TimePickerDialog.OnTimeSetListener g(TimePickerDialogFragment timepickerdialogfragment)
    {
        return timepickerdialogfragment.a;
    }

    protected Dialog a(Bundle bundle)
    {
        if (bundle != null)
        {
            e = bundle.getInt("titleFormatResId");
        }
        return new _cls1(getActivity(), this, b, c, DateFormat.is24HourFormat(getActivity()));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("titleFormatResId", e);
    }

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        f = timepicker;
        b = i;
        c = j;
    }

    /* member class not found */
    class _cls1 {}

}
