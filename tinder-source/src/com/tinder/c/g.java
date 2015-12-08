// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import com.tinder.utils.ad;
import java.util.Calendar;
import java.util.Locale;

public final class g extends Dialog
    implements android.view.View.OnClickListener, android.widget.DatePicker.OnDateChangedListener
{

    private final DatePicker a = (DatePicker)findViewById(0x7f0e0248);
    private final android.app.DatePickerDialog.OnDateSetListener b;
    private Calendar c;

    public g(Context context, android.app.DatePickerDialog.OnDateSetListener ondatesetlistener)
    {
        super(context, 0x7f0b0166);
        requestWindowFeature(1);
        setContentView(0x7f030093);
        context = getWindow();
        context.setLayout(-2, -2);
        context.setGravity(17);
        ad.a(this);
        context = (TextView)findViewById(0x7f0e0249);
        context.setOnClickListener(this);
        ad.b(context);
        a.setCalendarViewShown(false);
        context = Calendar.getInstance(Locale.getDefault());
        context.set(1, context.get(1) - 13);
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.set(1, context.get(1) - 125);
        a.setMinDate(calendar.getTimeInMillis());
        a.setMaxDate(context.getTimeInMillis());
        a.init(context.get(1), context.get(2), context.get(5), this);
        b = ondatesetlistener;
        c = Calendar.getInstance(Locale.getDefault());
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624521: 
            b.onDateSet(a, c.get(1), c.get(2), c.get(5));
            break;
        }
        dismiss();
    }

    public final void onDateChanged(DatePicker datepicker, int i, int j, int k)
    {
        if (c == null)
        {
            c = Calendar.getInstance(Locale.getDefault());
        }
        c.set(i, j, k);
    }
}
