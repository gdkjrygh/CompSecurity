// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.dialogs;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import java.util.Calendar;

public class DatePickerFragment extends DialogFragment
{

    public static String a = "min_date";
    public static String b = "max_date";
    public static String c = "year";
    public static String d = "month";
    public static String e = "day";
    private android.app.DatePickerDialog.OnDateSetListener f;

    public DatePickerFragment()
    {
    }

    public static Bundle a(int i, int j, int k)
    {
        Bundle bundle = new Bundle();
        bundle.putInt(c, i);
        bundle.putInt(d, j);
        bundle.putInt(e, k);
        return bundle;
    }

    public static Bundle a(Calendar calendar)
    {
        return a(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    public void a(android.app.DatePickerDialog.OnDateSetListener ondatesetlistener)
    {
        f = ondatesetlistener;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getArguments();
        Object obj = Calendar.getInstance();
        int j1 = ((Calendar) (obj)).get(1);
        int i1 = ((Calendar) (obj)).get(2);
        int l = ((Calendar) (obj)).get(5);
        int k = j1;
        int j = i1;
        int i = l;
        if (bundle != null)
        {
            k = bundle.getInt(c, j1);
            j = bundle.getInt(d, i1);
            i = bundle.getInt(e, l);
        }
        obj = new DatePickerDialog(getActivity(), f, k, j, i);
        if (bundle != null && bundle.containsKey(a))
        {
            ((DatePickerDialog) (obj)).getDatePicker().setMinDate(bundle.getLong(a));
        }
        if (bundle != null && bundle.containsKey(b))
        {
            ((DatePickerDialog) (obj)).getDatePicker().setMaxDate(bundle.getLong(b));
        }
        return ((Dialog) (obj));
    }

}
