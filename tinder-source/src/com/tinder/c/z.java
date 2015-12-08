// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.m;
import android.support.v4.view.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.d;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.e;
import com.tinder.adapters.r;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.managers.ai;
import com.tinder.managers.f;
import com.tinder.model.Career;
import com.tinder.model.WhatsNew;
import com.tinder.utils.v;
import com.tinder.views.CustomViewPager;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;

public final class z extends h
{

    ai a;
    ae b;
    f c;
    private d d;

    public z()
    {
        ManagerApp.h().a(this);
        d = new CallbackManagerImpl();
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        d.a(i, j, intent);
    }

    public final Dialog onCreateDialog(Bundle bundle)
    {
        return new Dialog(getContext(), 0x7f0b0120);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = new ArrayList();
        bundle.add(new WhatsNew(0x7f020244, getString(0x7f060270), getString(0x7f06026f)));
        bundle.add(new WhatsNew(0x7f020245, getString(0x7f060272), getString(0x7f060271)));
        bundle.add(new WhatsNew(0x7f020246, getString(0x7f060274), getString(0x7f060273)));
        layoutinflater = layoutinflater.inflate(0x7f030055, viewgroup, false);
        viewgroup = (CustomViewPager)layoutinflater.findViewById(0x7f0e017f);
        viewgroup.setAdapter(new r(bundle, getChildFragmentManager()));
        ((CirclePageIndicator)layoutinflater.findViewById(0x7f0e0180)).setViewPager(viewgroup);
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final z a;

            public final void onClick(View view1)
            {
                a.dismissAllowingStateLoss();
            }

            
            {
                a = z.this;
                super();
            }
        };
        layoutinflater.findViewById(0x7f0e0182).setOnClickListener(onclicklistener);
        layoutinflater.findViewById(0x7f0e0183).setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

            final CustomViewPager a;
            final z b;

            public final void onClick(View view1)
            {
                int i = a.getAdapter().getCount();
                if (a.getCurrentItem() + 1 < i)
                {
                    a.setCurrentItem(a.getCurrentItem() + 1);
                }
            }

            
            {
                b = z.this;
                a = customviewpager;
                super();
            }
        });
        viewgroup.setPageTransformer(false, new android.support.v4.view.ViewPager.g() {

            final z a;

            public final void transformPage(View view1, float f1)
            {
                view1.findViewById(0x7f0e037b).setTranslationX((float)(view1.getWidth() / 4) * f1);
                view1.findViewById(0x7f0e037c).setTranslationX((float)(view1.getWidth() / 2) * f1);
            }

            
            {
                a = z.this;
                super();
            }
        });
        View view = layoutinflater.findViewById(0x7f0e0184);
        view.setOnClickListener(onclicklistener);
        viewgroup.addOnPageChangeListener(new android.support.v4.view.ViewPager.f(bundle, view, layoutinflater) {

            final List a;
            final View b;
            final View c;
            final z d;

            public final void a(int i)
            {
            }

            public final void a(int i, float f1, int j)
            {
                byte byte0 = 8;
                (new StringBuilder("pos = ")).append(i).append(", offset = ").append(f1);
                if (i >= a.size() - 2)
                {
                    float f2 = f1;
                    int k = j;
                    if (i > a.size() - 2)
                    {
                        f2 = f1;
                        k = j;
                        if (f1 == 0.0F)
                        {
                            k = b.getWidth();
                            f2 = 1.0F;
                        }
                    }
                    View view1 = b;
                    i = byte0;
                    if (f2 > 0.0F)
                    {
                        i = 0;
                    }
                    view1.setVisibility(i);
                    b.setAlpha(Math.min(1.0F, 2.0F * f2));
                    b.setTranslationX(-k / 2 + b.getWidth() / 2);
                    c.findViewById(0x7f0e0181).setTranslationX(-k / 2);
                    return;
                } else
                {
                    b.setTranslationX(b.getWidth());
                    b.setAlpha(0.0F);
                    b.setVisibility(8);
                    c.findViewById(0x7f0e0181).setTranslationX(0.0F);
                    return;
                }
            }

            public final void b(int i)
            {
            }

            
            {
                d = z.this;
                a = list;
                b = view;
                c = view1;
                super();
            }
        });
        com.facebook.login.d.a().a(d, new com.facebook.f() {

            final z a;

            public final void a()
            {
            }

            public final void a(FacebookException facebookexception)
            {
                v.a("Failed to log into facebook in order to refresh the user's career", facebookexception);
            }

            public final void a(Object obj)
            {
                AccessToken.a(((e)obj).a);
                Career.forceRefreshCareer(new com.tinder.model.Career.ForceRefreshListener(this) {

                    final _cls5 a;

                    public final void onFailure()
                    {
                        if (a.a.getActivity() != null)
                        {
                            Toast.makeText(a.a.getActivity(), 0x7f060248, 0);
                        }
                    }

                    public final void onProfileLoaded()
                    {
                    }

            
            {
                a = _pcls5;
                super();
            }
                });
            }

            
            {
                a = z.this;
                super();
            }
        });
        c.a(this, new String[] {
            "user_work_history"
        });
        return layoutinflater;
    }

    public final void show(m m, String s)
    {
        String s1 = ae.a.getString("APP VERSION NUM", "");
        if (!s1.isEmpty() && !ManagerApp.n.equals(s1))
        {
            super.show(m, s);
        }
    }
}
