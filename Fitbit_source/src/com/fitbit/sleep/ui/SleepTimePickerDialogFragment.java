// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.TimePicker;
import com.fitbit.util.TimeListenerFragment;

public class SleepTimePickerDialogFragment extends TimeListenerFragment
    implements android.app.TimePickerDialog.OnTimeSetListener
{
    private class a extends TimePickerDialog
    {

        final SleepTimePickerDialogFragment b;

        private void a()
        {
            setButton(-1, getContext().getString(0x7f08042e), this);
            setButton(-2, getContext().getString(0x7f0802c2), this);
            setOnShowListener(new android.content.DialogInterface.OnShowListener(this) {

                final a a;

                public void onShow(DialogInterface dialoginterface)
                {
                    a.getButton(-2).setTextAppearance(a.b.getActivity(), 0x7f0c00e7);
                    a.getButton(-1).setTextAppearance(a.b.getActivity(), 0x7f0c00e8);
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        public void setTitle(int i)
        {
        }

        public void setTitle(CharSequence charsequence)
        {
        }

        public a(Context context, int i, android.app.TimePickerDialog.OnTimeSetListener ontimesetlistener, int j, int k, boolean flag)
        {
            b = SleepTimePickerDialogFragment.this;
            super(context, i, ontimesetlistener, j, k, flag);
            a();
        }

        a(Context context, android.app.TimePickerDialog.OnTimeSetListener ontimesetlistener, int i, int j, boolean flag)
        {
            b = SleepTimePickerDialogFragment.this;
            super(context, ontimesetlistener, i, j, flag);
            a();
        }
    }


    private TimePicker d;

    public SleepTimePickerDialogFragment()
    {
    }

    public SleepTimePickerDialogFragment(android.app.TimePickerDialog.OnTimeSetListener ontimesetlistener, int i, int j)
    {
        super(i, j);
        a(ontimesetlistener);
    }

    static TimePicker a(SleepTimePickerDialogFragment sleeptimepickerdialogfragment)
    {
        return sleeptimepickerdialogfragment.d;
    }

    static int b(SleepTimePickerDialogFragment sleeptimepickerdialogfragment)
    {
        return sleeptimepickerdialogfragment.b;
    }

    static int c(SleepTimePickerDialogFragment sleeptimepickerdialogfragment)
    {
        return sleeptimepickerdialogfragment.c;
    }

    static android.app.TimePickerDialog.OnTimeSetListener d(SleepTimePickerDialogFragment sleeptimepickerdialogfragment)
    {
        return sleeptimepickerdialogfragment.a;
    }

    protected Dialog a(Bundle bundle)
    {
        return new a(getActivity(), this, b, c, DateFormat.is24HourFormat(getActivity())) {

            final SleepTimePickerDialogFragment a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                super.onClick(dialoginterface, i);
                if (i == -1)
                {
                    SleepTimePickerDialogFragment.d(a).onTimeSet(SleepTimePickerDialogFragment.a(a), SleepTimePickerDialogFragment.b(a), SleepTimePickerDialogFragment.c(a));
                }
            }

            
            {
                a = SleepTimePickerDialogFragment.this;
                super(context, ontimesetlistener, i, j, flag);
            }
        };
    }

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        d = timepicker;
        b = i;
        c = j;
    }
}
