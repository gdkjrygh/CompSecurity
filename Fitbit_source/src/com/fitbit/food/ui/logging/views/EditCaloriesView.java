// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.util.format.e;
import java.text.ParseException;

public class EditCaloriesView extends LinearLayout
{

    private DecimalEditText a;

    public EditCaloriesView(Context context)
    {
        super(context);
        d();
    }

    public EditCaloriesView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d();
    }

    public EditCaloriesView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d();
    }

    static DecimalEditText a(EditCaloriesView editcaloriesview)
    {
        return editcaloriesview.a;
    }

    private void d()
    {
        a = (DecimalEditText)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0401d2, this).findViewById(0x7f1104a9);
        a.d(999999D);
        a.b(0);
    }

    public int a()
    {
        int i;
        try
        {
            i = e.c(a.getText().toString());
        }
        catch (ParseException parseexception)
        {
            return 0;
        }
        return i;
    }

    public void a(int i)
    {
        a.setText(e.g(i));
    }

    public void a(TextWatcher textwatcher)
    {
        a.addTextChangedListener(textwatcher);
    }

    public void a(android.widget.TextView.OnEditorActionListener oneditoractionlistener)
    {
        a.setOnEditorActionListener(oneditoractionlistener);
    }

    public void b()
    {
        postDelayed(new Runnable() {

            final EditCaloriesView a;

            public void run()
            {
                EditCaloriesView.a(a).requestFocus();
                ((InputMethodManager)a.getContext().getSystemService("input_method")).showSoftInput(EditCaloriesView.a(a), 1);
            }

            
            {
                a = EditCaloriesView.this;
                super();
            }
        }, 200L);
    }

    public void c()
    {
        ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(a.getWindowToken(), 0);
    }
}
