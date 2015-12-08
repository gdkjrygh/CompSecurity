// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.i18n.phonenumbers.a;
import com.google.i18n.phonenumbers.b;
import com.tinder.activities.ActivityVerification;
import com.tinder.e.ar;
import com.tinder.e.s;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.d;
import com.tinder.utils.ad;
import com.tinder.utils.u;
import com.tinder.utils.v;
import com.tinder.views.CustomActionBar;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.tinder.fragments:
//            bh

public final class bk extends Fragment
    implements android.view.View.OnClickListener, ar, s
{

    public TextView a;
    public EditText b;
    public TextView c;
    d d;
    private String e;
    private String f;
    private String g;
    private String h;
    private b i;
    private a j;
    private boolean k;
    private int l;
    private int m;

    public bk()
    {
        h = "1";
    }

    static int a(bk bk1, int i1)
    {
        bk1.l = i1;
        return i1;
    }

    static String a(bk bk1, String s1)
    {
        return bk1.b(s1);
    }

    static String a(String s1)
    {
        return c(s1);
    }

    static boolean a(bk bk1)
    {
        return bk1.k;
    }

    static boolean a(bk bk1, boolean flag)
    {
        bk1.k = flag;
        return flag;
    }

    static int b(bk bk1)
    {
        return bk1.l;
    }

    static int b(bk bk1, int i1)
    {
        bk1.m = i1;
        return i1;
    }

    private String b(String s1)
    {
        String s2 = null;
        for (int i1 = 0; i1 < s1.length(); i1++)
        {
            s2 = j.a(s1.charAt(i1));
        }

        return s2;
    }

    static int c(bk bk1)
    {
        return bk1.m;
    }

    private static String c(String s1)
    {
        return s1.replace(" ", "").replace("-", "").replace("(", "").replace(")", "");
    }

    static a d(bk bk1)
    {
        return bk1.j;
    }

    public final void a()
    {
        if (getActivity() != null)
        {
            ((ActivityVerification)getActivity()).f();
            ActivityVerification activityverification = (ActivityVerification)getActivity();
            String s1 = g;
            Bundle bundle = new Bundle();
            bundle.putString("phone_number", s1);
            activityverification.f.setArguments(bundle);
            activityverification.a(activityverification.f);
        }
    }

    public final void b()
    {
        if (getActivity() != null)
        {
            ((ActivityVerification)getActivity()).f();
            Toast.makeText(getActivity(), 0x7f0600aa, 1).show();
        }
    }

    public final void onClick(View view)
    {
        (new StringBuilder("view=")).append(view);
        switch (view.getId())
        {
        default:
            return;

        case 2131624825: 
            view = c(b.getText().toString());
            boolean flag;
            if (view != null && view.length() > 0 && view.length() <= 11)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                g = (new StringBuilder("+")).append(h).append(view).toString();
                d.a(g, this);
                ((ActivityVerification)getActivity()).e();
                return;
            } else
            {
                Toast.makeText(getActivity(), 0x7f0600ae, 1).show();
                return;
            }

        case 2131624455: 
            getActivity().onBackPressed();
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        (new StringBuilder("bundle=")).append(bundle);
        super.onCreate(bundle);
        ManagerApp.h().a(this);
        bundle = getArguments();
        if (bundle != null)
        {
            e = bundle.getString("country_name");
            h = bundle.getString("country_code");
            (new StringBuilder("mCountryName=")).append(e).append(", mCountryCode=").append(h);
        }
        ((ActivityVerification)getActivity()).H().setMenu(this);
        i = com.google.i18n.phonenumbers.b.a();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300ba, viewgroup, false);
    }

    public final void onMenuItemClick(int i1)
    {
        getActivity().onBackPressed();
    }

    public final void onPause()
    {
        super.onPause();
        ((ActivityVerification)getActivity()).j = c(b.getText().toString());
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c = (TextView)view.findViewById(0x7f0e0379);
        b = (EditText)view.findViewById(0x7f0e0378);
        a = (TextView)view.findViewById(0x7f0e01f9);
        c.setOnClickListener(this);
        ad.b(c);
        if (e == null || TextUtils.isEmpty(h))
        {
            e = Locale.getDefault().getDisplayCountry();
            f = Locale.getDefault().getCountry();
            (new StringBuilder("mCountryName=")).append(e).append(", mRegionCode=").append(f);
            try
            {
                h = u.a(getActivity());
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                e = Locale.US.getDisplayCountry();
                h = "1";
                f = "US";
                v.b(String.valueOf(view));
            }
        }
        if (f == null)
        {
            f = i.b(Integer.parseInt(h));
        }
        (new StringBuilder("mCountryName=")).append(e).append(", mRegionCode=").append(f).append(", mcountryCode=").append(h);
        j = com.google.i18n.phonenumbers.b.d(f);
        a.setText((new StringBuilder()).append(e).append(" (+").append(h).append(")").toString());
        bundle = ((ActivityVerification)getActivity()).j;
        view = bundle;
        if (bundle == null)
        {
            view = (TelephonyManager)getActivity().getSystemService("phone");
            if (view == null)
            {
                view = "0000000000";
            } else
            if (view.getLine1Number() == null)
            {
                view = "0000000000";
            } else
            {
                view = view.getLine1Number();
            }
            if (view == null)
            {
                view = "0000000000";
            } else
            {
                view = view.substring(Math.max(0, view.length() - 10));
            }
            ((ActivityVerification)getActivity()).j = view;
        }
        m = view.length();
        b.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final bk a;

            public final boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
            {
                if (textview == a.b && i1 == 2)
                {
                    a.c.performClick();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = bk.this;
                super();
            }
        });
        b.addTextChangedListener(new TextWatcher() {

            final bk a;

            public final void afterTextChanged(Editable editable)
            {
                editable.toString();
                if (!com.tinder.fragments.bk.a(a))
                {
                    String s1 = editable.toString();
                    editable = com.tinder.fragments.bk.a(s1);
                    com.tinder.fragments.bk.a(a, editable.length());
                    if (com.tinder.fragments.bk.b(a) > bk.c(a))
                    {
                        editable = com.tinder.fragments.bk.d(a).a(s1.charAt(s1.length() - 1));
                    } else
                    {
                        a a1 = com.tinder.fragments.bk.d(a);
                        a1.a = "";
                        a1.d.setLength(0);
                        a1.e.setLength(0);
                        a1.b.setLength(0);
                        a1.m = 0;
                        a1.c = "";
                        a1.p.setLength(0);
                        a1.r = "";
                        a1.s.setLength(0);
                        a1.f = true;
                        a1.g = false;
                        a1.o = 0;
                        a1.n = 0;
                        a1.h = false;
                        a1.i = false;
                        a1.t.clear();
                        a1.q = false;
                        if (!a1.l.equals(a1.k))
                        {
                            a1.l = a1.a(a1.j);
                        }
                        editable = com.tinder.fragments.bk.a(a, editable);
                    }
                    com.tinder.fragments.bk.b(a, com.tinder.fragments.bk.b(a));
                    com.tinder.fragments.bk.a(a, true);
                    a.b.setText(editable);
                } else
                {
                    com.tinder.fragments.bk.a(a, false);
                }
                a.b.setSelection(a.b.getText().length());
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = bk.this;
                super();
            }
        });
        if (view != null && !view.equals("") && !view.equals("0000000000"))
        {
            k = true;
            b.setText(b(view));
        }
    }
}
