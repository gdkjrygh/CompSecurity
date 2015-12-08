// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.activities.ActivityVerification;
import com.tinder.e.ar;
import com.tinder.e.s;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.ad;
import com.tinder.utils.v;
import com.tinder.views.CustomActionBar;
import org.json.JSONException;
import org.json.JSONObject;

public final class bh extends Fragment
    implements android.view.View.OnClickListener, s
{

    com.tinder.managers.d a;
    private String b;
    private EditText c;
    private ImageView d;
    private ImageView e;
    private TextView f;
    private TextView g;

    public bh()
    {
    }

    static boolean a(bh bh1)
    {
        return bh1.c.getText().length() > 5;
    }

    static TextView b(bh bh1)
    {
        return bh1.f;
    }

    static EditText c(bh bh1)
    {
        return bh1.c;
    }

    static String d(bh bh1)
    {
        return bh1.b;
    }

    static ImageView e(bh bh1)
    {
        return bh1.d;
    }

    static ImageView f(bh bh1)
    {
        return bh1.e;
    }

    public final void a()
    {
        String s1 = c.getText().toString();
        ((ActivityVerification)getActivity()).e();
        Object obj = a;
        ar ar = new ar() {

            final bh a;

            public final void a()
            {
                bh.e(a).setVisibility(0);
                bh.e(a).setImageResource(0x7f02019c);
                if (a.getActivity() != null)
                {
                    ((ActivityVerification)a.getActivity()).f();
                    int j = a.getResources().getColor(0x7f0d0096);
                    bh.c(a).setTextColor(j);
                    com.tinder.fragments.bh.f(a).setColorFilter(j);
                    ((ActivityVerification)a.getActivity()).g = false;
                    bh.c(a).postDelayed(new Runnable(this) {

                        final _cls4 a;

                        public final void run()
                        {
                            ((ActivityVerification)a.a.getActivity()).g();
                        }

            
            {
                a = _pcls4;
                super();
            }
                    }, 200L);
                    return;
                } else
                {
                    v.a("Not doing shit, activity null");
                    return;
                }
            }

            public final void b()
            {
                bh.e(a).setVisibility(0);
                bh.e(a).setImageResource(0x7f02019b);
                if (a.getActivity() != null)
                {
                    ((ActivityVerification)a.getActivity()).f();
                    int j = a.getResources().getColor(0x7f0d00fb);
                    bh.c(a).setTextColor(j);
                    com.tinder.fragments.bh.f(a).setColorFilter(null);
                    Toast.makeText(a.getActivity(), 0x7f0600a8, 1).show();
                    return;
                } else
                {
                    v.a("Not doing shit, activity null");
                    return;
                }
            }

            
            {
                a = bh.this;
                super();
            }
        };
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("token", s1);
        }
        catch (JSONException jsonexception)
        {
            v.b(jsonexception.toString());
        }
        obj = new d(1, ((com.tinder.managers.d) (obj)).c.t, jsonobject, new com.tinder.managers.d._cls11(((com.tinder.managers.d) (obj)), ar), new com.tinder.managers.d._cls12(((com.tinder.managers.d) (obj)), ar), com.tinder.managers.d.b);
        ManagerApp.b().a(((com.android.volley.Request) (obj)));
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131624821: 
            ((ActivityVerification)getActivity()).e();
            a.a(b, new ar() {

                final bh a;

                public final void a()
                {
                    if (a.getActivity() != null)
                    {
                        ((ActivityVerification)a.getActivity()).f();
                        Toast.makeText(a.getActivity(), String.format(a.getResources().getString(0x7f06007b), new Object[] {
                            com.tinder.fragments.bh.d(a)
                        }), 1).show();
                    }
                }

                public final void b()
                {
                    if (a.getActivity() != null)
                    {
                        ((ActivityVerification)a.getActivity()).f();
                        Toast.makeText(a.getActivity(), 0x7f0600aa, 1).show();
                    }
                }

            
            {
                a = bh.this;
                super();
            }
            });
            return;

        case 2131624822: 
            a();
            return;

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
            b = bundle.getString("phone_number");
            (new StringBuilder("mPhoneNumber=")).append(b);
        }
        ((ActivityVerification)getActivity()).H().setMenu(this);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300b8, viewgroup, false);
    }

    public final void onMenuItemClick(int j)
    {
        getActivity().onBackPressed();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        c = (EditText)view.findViewById(0x7f0e0371);
        d = (ImageView)view.findViewById(0x7f0e0372);
        f = (TextView)view.findViewById(0x7f0e0376);
        g = (TextView)view.findViewById(0x7f0e0375);
        e = (ImageView)view.findViewById(0x7f0e0373);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        ad.b(f);
        ad.b(g);
        c.addTextChangedListener(new TextWatcher() {

            final bh a;

            public final void afterTextChanged(Editable editable)
            {
                editable.toString();
                if (bh.a(a))
                {
                    bh.b(a).setEnabled(true);
                    bh.b(a).setAlpha(1.0F);
                    ad.b(bh.b(a));
                    return;
                } else
                {
                    bh.b(a).setEnabled(false);
                    bh.b(a).setAlpha(0.8F);
                    return;
                }
            }

            public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            
            {
                a = bh.this;
                super();
            }
        });
        c.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final bh a;

            public final boolean onEditorAction(TextView textview, int j, KeyEvent keyevent)
            {
                if (textview == bh.c(a) && j == 2)
                {
                    a.a();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = bh.this;
                super();
            }
        });
    }
}
