// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import com.fitbit.util.bn;
import java.util.Date;
import java.util.GregorianCalendar;

// Referenced classes of package com.fitbit.ui.dialogs:
//            CalendarPickerDialogFragment_

public class CalendarPickerDialogFragment extends DialogFragment
    implements android.app.DatePickerDialog.OnDateSetListener
{

    protected int a;
    protected int b;
    protected int c;
    protected long d;
    protected long e;
    private DatePicker f;
    private android.app.DatePickerDialog.OnDateSetListener g;

    public CalendarPickerDialogFragment()
    {
        b = 1;
        c = 1;
        d = 0L;
        e = 0L;
    }

    static android.app.DatePickerDialog.OnDateSetListener a(CalendarPickerDialogFragment calendarpickerdialogfragment)
    {
        return calendarpickerdialogfragment.g;
    }

    public static CalendarPickerDialogFragment a(android.app.DatePickerDialog.OnDateSetListener ondatesetlistener, int i, int j, int k, long l, long l1)
    {
        CalendarPickerDialogFragment calendarpickerdialogfragment = CalendarPickerDialogFragment_.c().c(i).a(j).b(k).a(l1).b(l).a();
        calendarpickerdialogfragment.a(ondatesetlistener);
        return calendarpickerdialogfragment;
    }

    static DatePicker b(CalendarPickerDialogFragment calendarpickerdialogfragment)
    {
        return calendarpickerdialogfragment.f;
    }

    protected Dialog a()
    {
        _cls1 _lcls1 = new _cls1(getActivity(), this, a, b, c);
    /* block-local class not found */
    class a {}

        if (e != 0L)
        {
            _lcls1.getDatePicker().setMinDate(e);
        }
        if (d != 0L && e < d)
        {
            _lcls1.getDatePicker().setMaxDate(d);
        }
        return _lcls1;
    }

    public void a(android.app.DatePickerDialog.OnDateSetListener ondatesetlistener)
    {
        g = ondatesetlistener;
    }

    public android.app.DatePickerDialog.OnDateSetListener b()
    {
        return g;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return a();
    }

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        f = datepicker;
        datepicker = new GregorianCalendar(bn.a());
        datepicker.set(1, i);
        datepicker.set(2, j);
        datepicker.set(5, k);
        if (d < datepicker.getTime().getTime())
        {
            datepicker.clear();
            datepicker.setTime(new Date(d));
            a = datepicker.get(1);
            b = datepicker.get(2);
            c = datepicker.get(5);
            return;
        } else
        {
            a = i;
            b = j;
            c = k;
            return;
        }
    }

    /* member class not found */
    class _cls1 {}

}
