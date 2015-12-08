// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.jcp.activities.TrackOrderHybridPageActivity;
import com.jcp.views.PhoneTypefaceEditText;
import com.jcp.views.TypefaceButton;
import com.jcp.views.TypefaceEditText;
import com.jcp.views.TypefaceTextView;

// Referenced classes of package com.jcp.fragments:
//            s, gu

public class gt extends s
    implements android.view.View.OnClickListener
{

    private TypefaceEditText a;
    private PhoneTypefaceEditText b;
    private TypefaceTextView c;
    private boolean d;
    private TextWatcher e;

    public gt()
    {
        d = true;
        e = new gu(this);
    }

    private void U()
    {
        View view = i().getCurrentFocus();
        if (view != null)
        {
            ((InputMethodManager)i().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private boolean V()
    {
        if (a.length() == 19 || a.length() == 24)
        {
            b(a);
            return false;
        } else
        {
            c(a);
            return true;
        }
    }

    private boolean W()
    {
        return a(a) & a(b);
    }

    private void X()
    {
        if (a.length() != 0 && b.length() != 0)
        {
            c.setVisibility(8);
        }
    }

    static TypefaceEditText a(gt gt1)
    {
        return gt1.a;
    }

    private void a(View view)
    {
        a = (TypefaceEditText)view.findViewById(0x7f0e031e);
        a.requestFocus();
        b = (PhoneTypefaceEditText)view.findViewById(0x7f0e031f);
        c = (TypefaceTextView)view.findViewById(0x7f0e0321);
        a.addTextChangedListener(e);
    }

    static void a(gt gt1, EditText edittext)
    {
        gt1.b(edittext);
    }

    private boolean a(EditText edittext)
    {
        if (edittext.length() == 0)
        {
            b(edittext);
            return true;
        } else
        {
            c(edittext);
            return false;
        }
    }

    private void b(int i)
    {
        if (c.getVisibility() != i)
        {
            c.setVisibility(i);
        }
    }

    private void b(EditText edittext)
    {
        edittext.setBackgroundResource(0x7f020124);
        edittext.setHintTextColor(j().getColor(0x7f0d005d));
    }

    static void b(gt gt1, EditText edittext)
    {
        gt1.c(edittext);
    }

    static boolean b(gt gt1)
    {
        return gt1.d;
    }

    private void c(EditText edittext)
    {
        edittext.setBackgroundResource(0x7f0201b7);
        edittext.setHintTextColor(j().getColor(0x7f0d006c));
    }

    static void c(gt gt1)
    {
        gt1.X();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030085, viewgroup, false);
        a(a(0x7f070440), ((android.app.Activity) (i())));
        ((TypefaceButton)layoutinflater.findViewById(0x7f0e0322)).setOnClickListener(this);
        a(((View) (layoutinflater)));
        return layoutinflater;
    }

    protected String a()
    {
        return "TRACKORDERS";
    }

    public void b()
    {
        a(a(0x7f070440));
        super.b();
    }

    public void f_()
    {
        super.f_();
        d = true;
        a.setText("");
        b.setText("");
    }

    public void onClick(View view)
    {
        String s1;
label0:
        {
            if (view.getId() == 0x7f0e0322)
            {
                s1 = a.getText().toString().trim();
                view = b.getPhoneNumber();
                if (!W())
                {
                    break label0;
                }
                b(0);
            }
            return;
        }
        if (V())
        {
            b(0);
            a.requestFocus();
            return;
        }
        if (!b.a())
        {
            b(0);
            b.requestFocus();
            return;
        } else
        {
            U();
            s1 = s1.replace("-", "");
            Intent intent = new Intent(i(), com/jcp/activities/TrackOrderHybridPageActivity);
            Bundle bundle = new Bundle();
            bundle.putString("orderNumber", s1);
            bundle.putString("phoneNumber", view);
            intent.putExtras(bundle);
            a(intent);
            return;
        }
    }
}
