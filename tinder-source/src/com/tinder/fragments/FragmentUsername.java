// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.b.a;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.Toast;
import com.tinder.a.f;
import com.tinder.c.ao;
import com.tinder.e.ax;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.z;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.utils.v;
import com.tinder.views.CustomEditText;
import com.tinder.views.CustomTextView;
import java.util.Locale;

public class FragmentUsername extends Fragment
{

    z a;
    android.view.View.OnClickListener b;
    private CustomEditText c;
    private CustomTextView d;
    private CustomTextView e;
    private CustomTextView f;
    private ImageView g;
    private String h;
    private View i;

    public FragmentUsername()
    {
        b = new android.view.View.OnClickListener() {

            final FragmentUsername a;

            public final void onClick(View view)
            {
                a.getActivity().finish();
            }

            
            {
                a = FragmentUsername.this;
                super();
            }
        };
        ManagerApp.h().a(this);
    }

    private void a()
    {
        g.setImageResource(0x7f0d0107);
        String s = c.getText().toString();
        CustomTextView customtextview = d;
        android.content.Context context;
        int j;
        boolean flag;
        if (!s.equals(h) && !s.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        customtextview.setEnabled(flag);
        customtextview = d;
        context = getContext();
        if (d.isEnabled())
        {
            j = 0x7f0d0101;
        } else
        {
            j = 0x7f0d0103;
        }
        customtextview.setTextColor(android.support.v4.b.a.b(context, j));
        e.animate().alpha(0.0F);
        f.setText(String.format(Locale.getDefault(), "%d", new Object[] {
            Integer.valueOf(20 - s.length())
        }));
    }

    static void a(FragmentUsername fragmentusername)
    {
        fragmentusername.a();
    }

    static void a(FragmentUsername fragmentusername, int j, String s)
    {
        i k = fragmentusername.getActivity();
        if (k == null)
        {
            v.b("Unable to handle username response, no longer attached to the activity.");
            return;
        } else
        {
            k.runOnUiThread(fragmentusername. new Runnable(j, s) {

                final int a;
                final String b;
                final FragmentUsername c;

                public final void run()
                {
                    User user = c.a.b();
                    (new StringBuilder("Response code: ")).append(a);
                    switch (a)
                    {
                    default:
                        com.tinder.fragments.FragmentUsername.a(c, "Error");
                        return;

                    case 201: 
                    case 204: 
                        FragmentUsername.d(c).setImageResource(0x7f020242);
                        FragmentUsername.e(c).setEnabled(false);
                        com.tinder.fragments.FragmentUsername.f(c).setEnabled(false);
                        if (user != null)
                        {
                            user.setUsername(b);
                        }
                        com.tinder.fragments.FragmentUsername.a(c, c.getString(0x7f060213));
                        (new Handler()).postDelayed(new Runnable(this) {

                            final _cls4 a;

                            public final void run()
                            {
                                a.c.b.onClick(null);
                            }

            
            {
                a = _pcls4;
                super();
            }
                        }, 1000L);
                        return;

                    case 405: 
                    case 409: 
                    case 410: 
                    case 422: 
                        FragmentUsername.d(c).setImageResource(0x7f020243);
                        FragmentUsername.g(c).setText(0x7f060214);
                        FragmentUsername.g(c).setTextColor(c.getResources().getColor(0x7f0d0018));
                        FragmentUsername.g(c).animate().alpha(1.0F);
                        return;
                    }
                }

            
            {
                c = FragmentUsername.this;
                a = j;
                b = s;
                super();
            }
            });
            return;
        }
    }

    static void a(FragmentUsername fragmentusername, String s)
    {
        (new Handler(Looper.getMainLooper())).post(fragmentusername. new Runnable(s) {

            final String a;
            final FragmentUsername b;

            public final void run()
            {
                Toast.makeText(ManagerApp.c(), a, 0).show();
            }

            
            {
                b = FragmentUsername.this;
                a = s;
                super();
            }
        });
    }

    static CustomEditText b(FragmentUsername fragmentusername)
    {
        return fragmentusername.c;
    }

    static String c(FragmentUsername fragmentusername)
    {
        return fragmentusername.h;
    }

    static ImageView d(FragmentUsername fragmentusername)
    {
        return fragmentusername.g;
    }

    static CustomTextView e(FragmentUsername fragmentusername)
    {
        return fragmentusername.d;
    }

    static View f(FragmentUsername fragmentusername)
    {
        return fragmentusername.i;
    }

    static CustomTextView g(FragmentUsername fragmentusername)
    {
        return fragmentusername.e;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b7, viewgroup, false);
        c = (CustomEditText)layoutinflater.findViewById(0x7f0e01a0);
        viewgroup = layoutinflater.findViewById(0x7f0e008a);
        bundle = layoutinflater.findViewById(0x7f0e008c);
        View view = layoutinflater.findViewById(0x7f0e008b);
        d = (CustomTextView)layoutinflater.findViewById(0x7f0e036c);
        e = (CustomTextView)layoutinflater.findViewById(0x7f0e036a);
        f = (CustomTextView)layoutinflater.findViewById(0x7f0e036b);
        g = (ImageView)layoutinflater.findViewById(0x7f0e0369);
        i = layoutinflater.findViewById(0x7f0e036d);
        view.setOnClickListener(b);
        viewgroup.setOnClickListener(b);
        bundle.setOnClickListener(b);
        viewgroup = a.b();
        if (viewgroup != null)
        {
            h = viewgroup.getUsername();
            c.setText(h);
        }
        c.requestFocus();
        c.addTextChangedListener(new TextWatcher() {

            final FragmentUsername a;

            public final void afterTextChanged(Editable editable)
            {
                com.tinder.fragments.FragmentUsername.a(a);
            }

            public final void beforeTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int j, int k, int l)
            {
            }

            
            {
                a = FragmentUsername.this;
                super();
            }
        });
        d.setOnClickListener(new android.view.View.OnClickListener() {

            final FragmentUsername a;

            public final void onClick(View view1)
            {
                view1 = FragmentUsername.b(a).getText().toString();
                if (FragmentUsername.c(a).isEmpty())
                {
                    com.tinder.managers.a.a("DeepLink.CreateID");
                    z z1 = a.a;
                    ax ax = new ax(this, view1) {

                        final String a;
                        final _cls2 b;

                        public final void a(int j)
                        {
                            com.tinder.fragments.FragmentUsername.a(b.a, j, a);
                        }

            
            {
                b = _pcls2;
                a = s;
                super();
            }
                    };
                    view1 = new com.tinder.a.a(1, z1.a.T, com.tinder.a.a.k(), z.b(view1), ax);
                    ManagerApp.b().a(view1);
                } else
                {
                    com.tinder.managers.a.a("DeepLink.ChangeID");
                    z z2 = a.a;
                    ax ax1 = new ax(this, view1) {

                        final String a;
                        final _cls2 b;

                        public final void a(int j)
                        {
                            com.tinder.fragments.FragmentUsername.a(b.a, j, a);
                        }

            
            {
                b = _pcls2;
                a = s;
                super();
            }
                    };
                    view1 = new com.tinder.a.a(2, z2.a.V, com.tinder.a.a.k(), z.b(view1), ax1);
                    ManagerApp.b().a(view1);
                }
                com.tinder.fragments.FragmentUsername.a(a);
            }

            
            {
                a = FragmentUsername.this;
                super();
            }
        });
        bundle = i;
        byte byte0;
        if (h.isEmpty())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        bundle.setVisibility(byte0);
        i.setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

            final User a;
            final FragmentUsername b;

            public final void onClick(View view1)
            {
                (new ao(b.getContext(), new com.tinder.c.ao.a(this, view1) {

                    final View a;
                    final _cls3 b;

                    public final void a()
                    {
                        com.tinder.managers.a.a(new SparksEvent("DeepLink.DeleteID"));
                        Object obj = b.b.a;
                        ax ax = new ax(this) {

                            final _cls1 a;

                            public final void a(int j)
                            {
                                switch (j)
                                {
                                default:
                                    return;

                                case 204: 
                                    com.tinder.fragments.FragmentUsername.a(a.b.b, a.b.b.getString(0x7f060212));
                                    if (a.b.a != null)
                                    {
                                        a.b.a.setUsername(null);
                                    }
                                    a.b.b.b.onClick(a.a);
                                    return;

                                case 410: 
                                    com.tinder.fragments.FragmentUsername.a(a.b.b, a.b.b.getString(0x7f06013b));
                                    return;
                                }
                            }

            
            {
                a = _pcls1;
                super();
            }
                        };
                        obj = new com.tinder.a.a(3, ((z) (obj)).a.U, com.tinder.a.a.k(), null, ax);
                        ManagerApp.b().a(((com.android.volley.Request) (obj)));
                    }

            
            {
                b = _pcls3;
                a = view;
                super();
            }
                })).show();
            }

            
            {
                b = FragmentUsername.this;
                a = user;
                super();
            }
        });
        a();
        return layoutinflater;
    }
}
