// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import com.fitbit.mixpanel.f;
import com.fitbit.ui.FitbitActivity;

public class MixPanelSettingsActivity extends FitbitActivity
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    protected RadioButton a;
    protected RadioButton b;
    protected RadioButton c;
    protected RadioButton d;
    protected RadioButton e;
    protected EditText f;
    protected View g;

    public MixPanelSettingsActivity()
    {
    }

    protected void e()
    {
        f.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final MixPanelSettingsActivity a;

            public void onFocusChange(View view, boolean flag)
            {
                InputMethodManager inputmethodmanager = (InputMethodManager)a.getSystemService("input_method");
                if (flag)
                {
                    a.e.setChecked(true);
                    inputmethodmanager.toggleSoftInput(1, 0);
                    return;
                } else
                {
                    inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return;
                }
            }

            
            {
                a = MixPanelSettingsActivity.this;
                super();
            }
        });
        a.setOnCheckedChangeListener(this);
        b.setOnCheckedChangeListener(this);
        c.setOnCheckedChangeListener(this);
        d.setOnCheckedChangeListener(this);
        e.setOnCheckedChangeListener(this);
        String s = com.fitbit.mixpanel.f.a();
        if (s.equals("82d19845b298fcc8b8713861c9cf67c0"))
        {
            a.setChecked(true);
            return;
        }
        if (s.equals("45b3cbfc56ddb35a099bc7f38fc74f4c"))
        {
            b.setChecked(true);
            return;
        }
        if (s.equals("e31a715632b1757efef0c96194b0a8c4"))
        {
            c.setChecked(true);
            return;
        }
        if (s.equals("01a4d3dc24652dbcb0ab51f755ae680d"))
        {
            d.setChecked(true);
            return;
        } else
        {
            e.setChecked(true);
            f.setText(s);
            return;
        }
    }

    protected void f()
    {
        if (!a.isChecked()) goto _L2; else goto _L1
_L1:
        com.fitbit.mixpanel.f.a(this, "82d19845b298fcc8b8713861c9cf67c0");
_L4:
        finish();
        return;
_L2:
        if (b.isChecked())
        {
            com.fitbit.mixpanel.f.a(this, "45b3cbfc56ddb35a099bc7f38fc74f4c");
        } else
        if (c.isChecked())
        {
            com.fitbit.mixpanel.f.a(this, "e31a715632b1757efef0c96194b0a8c4");
        } else
        if (d.isChecked())
        {
            com.fitbit.mixpanel.f.a(this, "01a4d3dc24652dbcb0ab51f755ae680d");
        } else
        if (e.isChecked())
        {
            com.fitbit.mixpanel.f.a(this, f.getText().toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
label0:
        {
            if (flag)
            {
                if (compoundbutton != e)
                {
                    break label0;
                }
                f.requestFocus();
            }
            return;
        }
        g.requestFocus();
    }
}
