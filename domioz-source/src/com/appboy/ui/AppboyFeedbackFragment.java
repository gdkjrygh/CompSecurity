// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.appboy.a;
import com.appboy.f;
import com.appboy.f.d;
import com.appboy.ui.d.b;

// Referenced classes of package com.appboy.ui:
//            u, i, j, k, 
//            t, s, l

public class AppboyFeedbackFragment extends Fragment
{

    private static final String a;
    private Button b;
    private Button c;
    private CheckBox d;
    private EditText e;
    private EditText f;
    private TextWatcher g;
    private android.view.View.OnClickListener h;
    private android.view.View.OnClickListener i;
    private l j;
    private int k;
    private boolean l;

    public AppboyFeedbackFragment()
    {
    }

    static boolean a(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.l;
    }

    static boolean b(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (appboyfeedbackfragment.e.getText() != null && !com.appboy.ui.d.b.a(appboyfeedbackfragment.e.getText().toString()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            appboyfeedbackfragment.e.setError(null);
        } else
        {
            appboyfeedbackfragment.e.setError(appboyfeedbackfragment.getResources().getString(u.c));
        }
        if (appboyfeedbackfragment.f.getText() != null && !com.appboy.ui.d.b.a(appboyfeedbackfragment.f.getText().toString()) && com.appboy.f.d.a(appboyfeedbackfragment.f.getText().toString()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (appboyfeedbackfragment.f.getText() == null || !com.appboy.ui.d.b.a(appboyfeedbackfragment.f.getText().toString()))
        {
            flag2 = false;
        }
        if (flag1)
        {
            appboyfeedbackfragment.f.setError(null);
        } else
        if (flag2)
        {
            appboyfeedbackfragment.f.setError(appboyfeedbackfragment.getResources().getString(com.appboy.ui.u.a));
        } else
        {
            appboyfeedbackfragment.f.setError(appboyfeedbackfragment.getResources().getString(com.appboy.ui.u.b));
        }
        return flag1 & flag;
    }

    static void c(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = appboyfeedbackfragment.getActivity();
        fragmentactivity.getWindow().setSoftInputMode(appboyfeedbackfragment.k);
        if (fragmentactivity.getCurrentFocus() != null)
        {
            ((InputMethodManager)fragmentactivity.getSystemService("input_method")).hideSoftInputFromWindow(fragmentactivity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    static l d(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.j;
    }

    static void e(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        appboyfeedbackfragment.f.setText("");
        appboyfeedbackfragment.e.setText("");
        appboyfeedbackfragment.d.setChecked(false);
        appboyfeedbackfragment.l = false;
        appboyfeedbackfragment.f.setError(null);
        appboyfeedbackfragment.e.setError(null);
    }

    static CheckBox f(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.d;
    }

    static EditText g(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.e;
    }

    static EditText h(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.f;
    }

    static boolean i(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        appboyfeedbackfragment.l = true;
        return true;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        g = new i(this);
        h = new j(this);
        i = new k(this);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(t.i, viewgroup, false);
        b = (Button)layoutinflater.findViewById(s.s);
        c = (Button)layoutinflater.findViewById(s.w);
        d = (CheckBox)layoutinflater.findViewById(s.u);
        e = (EditText)layoutinflater.findViewById(s.v);
        f = (EditText)layoutinflater.findViewById(s.t);
        e.addTextChangedListener(g);
        f.addTextChangedListener(g);
        b.setOnClickListener(h);
        c.setOnClickListener(i);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        e.removeTextChangedListener(g);
        f.removeTextChangedListener(g);
    }

    public void onResume()
    {
        super.onResume();
        com.appboy.a.a(getActivity()).b();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        Window window = fragmentactivity.getWindow();
        k = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
        com.appboy.a.a(fragmentactivity).b();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/AppboyFeedbackFragment.getName()
        });
    }
}
