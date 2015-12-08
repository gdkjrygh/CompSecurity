// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;

public final class cd extends DatePickerDialog
{

    private String a;

    public cd(Context context, android.app.DatePickerDialog.OnDateSetListener ondatesetlistener, int i, int j, int k)
    {
        super(context, ondatesetlistener, i, j, k);
        a = null;
    }

    public final void a(String s)
    {
        a = s;
        setTitle(s);
    }

    public final void onDateChanged(DatePicker datepicker, int i, int j, int k)
    {
        super.onDateChanged(datepicker, i, j, k);
        if (a != null)
        {
            setTitle(a);
        }
    }
}
