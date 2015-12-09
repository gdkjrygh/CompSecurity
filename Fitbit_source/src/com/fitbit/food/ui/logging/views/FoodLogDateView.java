// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.dialogs.DatePickerFragment;
import com.fitbit.util.bn;
import com.fitbit.util.format.e;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FoodLogDateView extends LinearLayout
    implements android.app.DatePickerDialog.OnDateSetListener
{
    public static interface a
    {

        public abstract void a(FoodLogDateView foodlogdateview);
    }


    private static final String f = (new StringBuilder()).append(com/fitbit/food/ui/logging/views/FoodLogDateView.getName()).append(".FRAGMENT_DATE_PICKER").toString();
    private TextView a;
    private Date b;
    private FitbitActivity c;
    private boolean d;
    private a e;

    public FoodLogDateView(Context context)
    {
        this(context, null);
    }

    public FoodLogDateView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FoodLogDateView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        View.inflate(context, 0x7f040162, this);
        if (context instanceof FitbitActivity)
        {
            context = (DatePickerFragment)((FitbitActivity)context).getSupportFragmentManager().findFragmentByTag(f);
            if (context != null)
            {
                context.a(this);
            }
        }
    }

    static void a(FoodLogDateView foodlogdateview)
    {
        foodlogdateview.b();
    }

    private void b()
    {
        if (!d)
        {
            return;
        }
        Object obj = c.getSupportFragmentManager().findFragmentByTag(f);
        if (obj != null)
        {
            c.getSupportFragmentManager().beginTransaction().remove(((android.support.v4.app.Fragment) (obj)));
        }
        obj = new DatePickerFragment();
        Object obj1 = e();
        ((Calendar) (obj1)).setTime(b);
        obj1 = DatePickerFragment.a(((Calendar) (obj1)));
        ((Bundle) (obj1)).putLong(DatePickerFragment.b, d().longValue());
        ((Bundle) (obj1)).putLong(DatePickerFragment.a, c().longValue());
        ((DatePickerFragment) (obj)).setArguments(((Bundle) (obj1)));
        ((DatePickerFragment) (obj)).a(this);
        ((DatePickerFragment) (obj)).show(c.getSupportFragmentManager(), f);
    }

    private Long c()
    {
        GregorianCalendar gregoriancalendar = e();
        gregoriancalendar.add(2, -2);
        return Long.valueOf(gregoriancalendar.getTime().getTime());
    }

    private Long d()
    {
        GregorianCalendar gregoriancalendar = e();
        gregoriancalendar.add(2, 1);
        return Long.valueOf(gregoriancalendar.getTime().getTime());
    }

    private GregorianCalendar e()
    {
        return new GregorianCalendar(bn.a());
    }

    public Date a()
    {
        return b;
    }

    public void a(a a1)
    {
        e = a1;
    }

    public void a(FitbitActivity fitbitactivity, boolean flag)
    {
        c = fitbitactivity;
        d = flag;
        a.setEnabled(flag);
    }

    public void a(Date date)
    {
        if (date == null)
        {
            b = new Date();
        } else
        {
            b = date;
        }
        a.setText(com.fitbit.util.format.e.h(getContext(), date));
    }

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        datepicker = e();
        datepicker.set(1, i);
        datepicker.set(2, j);
        datepicker.set(5, k);
        a(datepicker.getTime());
        if (e != null)
        {
            e.a(this);
        }
    }

    protected void onFinishInflate()
    {
        a = (TextView)findViewById(0x7f110238);
        a.setOnClickListener(new android.view.View.OnClickListener() {

            final FoodLogDateView a;

            public void onClick(View view)
            {
                FoodLogDateView.a(a);
            }

            
            {
                a = FoodLogDateView.this;
                super();
            }
        });
        super.onFinishInflate();
    }

}
