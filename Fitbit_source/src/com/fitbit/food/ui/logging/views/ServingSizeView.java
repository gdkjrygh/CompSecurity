// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.fitbit.data.domain.h;
import com.fitbit.food.ui.logging.a;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.util.format.e;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ServingSizeView extends LinearLayout
{
    public static interface a
    {

        public abstract void a(ServingSizeView servingsizeview);
    }


    private static final String c = "ServingSizeView";
    protected DecimalEditText a;
    protected Spinner b;
    private boolean d;
    private a e;
    private com.fitbit.food.ui.logging.a f;
    private List g;

    public ServingSizeView(Context context)
    {
        super(context);
        d = false;
        g = new ArrayList();
    }

    public ServingSizeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = false;
        g = new ArrayList();
    }

    public ServingSizeView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = false;
        g = new ArrayList();
    }

    static a a(ServingSizeView servingsizeview)
    {
        return servingsizeview.e;
    }

    private void a(double d1)
    {
        if (d1 == 1.0D)
        {
            f.b();
            return;
        } else
        {
            f.a();
            return;
        }
    }

    static void a(ServingSizeView servingsizeview, double d1)
    {
        servingsizeview.a(d1);
    }

    static boolean a(ServingSizeView servingsizeview, boolean flag)
    {
        servingsizeview.d = flag;
        return flag;
    }

    private void b(double d1)
    {
        a.setText(com.fitbit.util.format.e.a(d1, 2));
    }

    static boolean b(ServingSizeView servingsizeview)
    {
        return servingsizeview.d;
    }

    protected void a()
    {
        a.d(999D);
        a.b(2);
        a.addTextChangedListener(new TextWatcher() {

            final ServingSizeView a;

            public void afterTextChanged(Editable editable)
            {
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                double d1 = a.b();
                com.fitbit.food.ui.logging.views.ServingSizeView.a(a, d1);
                if (com.fitbit.food.ui.logging.views.ServingSizeView.a(a) != null)
                {
                    com.fitbit.food.ui.logging.views.ServingSizeView.a(a).a(a);
                }
                if (ServingSizeView.b(a))
                {
                    a.a(true);
                }
            }

            
            {
                a = ServingSizeView.this;
                super();
            }
        });
        a.setOnTouchListener(new android.view.View.OnTouchListener() {

            final ServingSizeView a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                com.fitbit.food.ui.logging.views.ServingSizeView.a(a, true);
                return false;
            }

            
            {
                a = ServingSizeView.this;
                super();
            }
        });
        a.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final ServingSizeView a;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                a.e();
                a.b.performClick();
                return false;
            }

            
            {
                a = ServingSizeView.this;
                super();
            }
        });
        b.setSelection(0);
        b.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final ServingSizeView a;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                if (com.fitbit.food.ui.logging.views.ServingSizeView.a(a) != null)
                {
                    com.fitbit.food.ui.logging.views.ServingSizeView.a(a).a(a);
                }
                if (view != null)
                {
                    a.a(true);
                }
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                a = ServingSizeView.this;
                super();
            }
        });
        b.setOnTouchListener(new android.view.View.OnTouchListener() {

            final ServingSizeView a;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                boolean flag;
                if (!ServingSizeView.b(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    com.fitbit.food.ui.logging.views.ServingSizeView.a(a, true);
                    a.d();
                }
                return flag;
            }

            
            {
                a = ServingSizeView.this;
                super();
            }
        });
        f = new com.fitbit.food.ui.logging.a(getContext(), 0x7f0401a4);
        f.setDropDownViewResource(0x1090009);
    }

    public void a(double d1, h h1)
    {
        b(d1);
        a(d1);
        int i = g.indexOf(h1);
        if (i >= 0)
        {
            b.setSelection(i);
        }
    }

    public void a(a a1)
    {
        e = a1;
    }

    public void a(List list)
    {
        com.fitbit.e.a.a("ServingSizeView", "setServingUnits %s", new Object[] {
            list
        });
        g = list;
        f.clear();
        for (int i = 0; i < list.size(); i++)
        {
            h h1 = (h)list.get(i);
            f.a(h1);
        }

        b.setAdapter(f);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            a.setTextColor(getContext().getResources().getColor(0x7f0f0029));
        }
        f.a(flag);
    }

    public double b()
    {
        Double double1 = Double.valueOf(1.0D);
        double d1 = com.fitbit.util.format.e.a(a.getText().toString());
        double1 = Double.valueOf(d1);
_L2:
        return double1.doubleValue();
        ParseException parseexception;
        parseexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public h c()
    {
        int i = b.getSelectedItemPosition();
        com.fitbit.e.a.a("ServingSizeView", "selected position = %s, array = %s", new Object[] {
            Integer.valueOf(i), g
        });
        if (i < 0)
        {
            return null;
        } else
        {
            return (h)g.get(i);
        }
    }

    public void d()
    {
        a.requestFocus();
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(a, 0);
    }

    public void e()
    {
        a.clearFocus();
        ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(a.getWindowToken(), 0);
    }

    public a f()
    {
        return e;
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        a.setEnabled(flag);
        b.setEnabled(flag);
    }
}
