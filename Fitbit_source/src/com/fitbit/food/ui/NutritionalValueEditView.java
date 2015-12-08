// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.util.bh;
import com.fitbit.util.format.e;
import java.text.ParseException;

public class NutritionalValueEditView extends DecimalEditText
{
    public static interface a
    {

        public abstract void a(NutritionalValueEditView nutritionalvalueeditview);
    }


    String a;
    private int i;
    private a j;

    public NutritionalValueEditView(Context context)
    {
        super(context);
        i = 0x7f080604;
        a = "";
        a();
    }

    public NutritionalValueEditView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = 0x7f080604;
        a = "";
        a();
    }

    public NutritionalValueEditView(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        i = 0x7f080604;
        a = "";
        a();
    }

    static a a(NutritionalValueEditView nutritionalvalueeditview)
    {
        return nutritionalvalueeditview.j;
    }

    public static String b(double d1)
    {
        return com.fitbit.util.format.e.a(d1, 0);
    }

    public double a(String s)
    {
        Double double1 = Double.valueOf(0.0D);
        double d1 = com.fitbit.util.format.e.a(s);
        s = Double.valueOf(d1);
_L2:
        return s.doubleValue();
        s;
        s = double1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a()
    {
        d(999999D);
        b(0);
        setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final NutritionalValueEditView a;

            public void onFocusChange(View view, boolean flag)
            {
label0:
                {
                    if (view instanceof NutritionalValueEditView)
                    {
                        view = (NutritionalValueEditView)view;
                        if (!flag)
                        {
                            break label0;
                        }
                        view.setText(NutritionalValueEditView.b(a.b()));
                    }
                    return;
                }
                if (NutritionalValueEditView.a(a) != null)
                {
                    NutritionalValueEditView.a(a).a(a);
                }
                if (a.b() < 0.0001D)
                {
                    view.setText("");
                    return;
                } else
                {
                    view.b(a.c(a.b()));
                    return;
                }
            }

            
            {
                a = NutritionalValueEditView.this;
                super();
            }
        });
    }

    public void a(double d1)
    {
        b(c(d1));
    }

    public void a(int k)
    {
        i = k;
    }

    public void a(a a1)
    {
        j = a1;
    }

    public double b()
    {
        return a(getText().toString());
    }

    public void b(String s)
    {
        a = s;
    }

    public String c(double d1)
    {
        return bh.a(getContext(), i, new String[] {
            b(d1), a
        });
    }

    public void c()
    {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        requestFocus();
    }

    public void d()
    {
        ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
        clearFocus();
    }

    public a e()
    {
        return j;
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        setEnabled(flag);
    }
}
