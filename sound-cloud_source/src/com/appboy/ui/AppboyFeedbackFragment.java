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
import com.appboy.f.e;
import com.appboy.ui.d.d;

// Referenced classes of package com.appboy.ui:
//            h, i, j

public class AppboyFeedbackFragment extends Fragment
{
    public static interface a
    {

        public abstract String a();
    }

    public static final class b extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    private Button a;
    private Button b;
    private CheckBox c;
    private EditText d;
    private EditText e;
    private TextWatcher f;
    private android.view.View.OnClickListener g;
    private android.view.View.OnClickListener h;
    private a i;
    private int j;
    private boolean k;

    public AppboyFeedbackFragment()
    {
    }

    static boolean a(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.k;
    }

    static boolean b(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        if (appboyfeedbackfragment.d.getText() != null && !com.appboy.ui.d.d.a(appboyfeedbackfragment.d.getText().toString()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            appboyfeedbackfragment.d.setError(null);
        } else
        {
            appboyfeedbackfragment.d.setError(appboyfeedbackfragment.getResources().getString(n.e.com_appboy_feedback_form_invalid_message));
        }
        if (appboyfeedbackfragment.e.getText() != null && !com.appboy.ui.d.d.a(appboyfeedbackfragment.e.getText().toString()) && com.appboy.f.e.a(appboyfeedbackfragment.e.getText().toString()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (appboyfeedbackfragment.e.getText() == null || !com.appboy.ui.d.d.a(appboyfeedbackfragment.e.getText().toString()))
        {
            flag2 = false;
        }
        if (flag1)
        {
            appboyfeedbackfragment.e.setError(null);
        } else
        if (flag2)
        {
            appboyfeedbackfragment.e.setError(appboyfeedbackfragment.getResources().getString(n.e.com_appboy_feedback_form_empty_email));
        } else
        {
            appboyfeedbackfragment.e.setError(appboyfeedbackfragment.getResources().getString(n.e.com_appboy_feedback_form_invalid_email));
        }
        return flag1 & flag;
    }

    static void c(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = appboyfeedbackfragment.getActivity();
        fragmentactivity.getWindow().setSoftInputMode(appboyfeedbackfragment.j);
        if (fragmentactivity.getCurrentFocus() != null)
        {
            ((InputMethodManager)fragmentactivity.getSystemService("input_method")).hideSoftInputFromWindow(fragmentactivity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    static a d(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.i;
    }

    static void e(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        appboyfeedbackfragment.e.setText("");
        appboyfeedbackfragment.d.setText("");
        appboyfeedbackfragment.c.setChecked(false);
        appboyfeedbackfragment.k = false;
        appboyfeedbackfragment.e.setError(null);
        appboyfeedbackfragment.d.setError(null);
    }

    static CheckBox f(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.c;
    }

    static EditText g(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.d;
    }

    static EditText h(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        return appboyfeedbackfragment.e;
    }

    static boolean i(AppboyFeedbackFragment appboyfeedbackfragment)
    {
        appboyfeedbackfragment.k = true;
        return true;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        f = new h(this);
        g = new i(this);
        h = new j(this);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(n.d.com_appboy_feedback, viewgroup, false);
        a = (Button)layoutinflater.findViewById(n.c.com_appboy_feedback_cancel);
        b = (Button)layoutinflater.findViewById(n.c.com_appboy_feedback_send);
        c = (CheckBox)layoutinflater.findViewById(n.c.com_appboy_feedback_is_bug);
        d = (EditText)layoutinflater.findViewById(n.c.com_appboy_feedback_message);
        e = (EditText)layoutinflater.findViewById(n.c.com_appboy_feedback_email);
        d.addTextChangedListener(f);
        e.addTextChangedListener(f);
        a.setOnClickListener(g);
        b.setOnClickListener(h);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        d.removeTextChangedListener(f);
        e.removeTextChangedListener(f);
    }

    public void onResume()
    {
        super.onResume();
        com.appboy.a.a(getActivity()).b();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        Window window = fragmentactivity.getWindow();
        j = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
        com.appboy.a.a(fragmentactivity).b();
    }
}
