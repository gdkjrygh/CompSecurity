// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.d;
import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.LoginButton;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.f;

public final class ba extends Fragment
{

    protected LoginButton a;
    FragmentIntro.a b;
    f c;

    public ba()
    {
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        d d1 = b.z_();
        if (d1 != null)
        {
            d1.a(i, j, intent);
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ManagerApp.h().a(this);
        if (activity instanceof FragmentIntro.a)
        {
            b = (FragmentIntro.a)activity;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300a9, viewgroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a = (LoginButton)view.findViewById(0x7f0e02eb);
        a.setReadPermissions(c.b());
        view.findViewById(0x7f0e02ea).setOnClickListener(new android.view.View.OnClickListener() {

            final ba a;

            public final void onClick(View view1)
            {
                if (a.b != null)
                {
                    a.b.d();
                }
                LoginButton loginbutton = a.a;
                if (ManagerApp.b)
                {
                    view1 = LoginBehavior.a;
                } else
                {
                    view1 = LoginBehavior.c;
                }
                loginbutton.setLoginBehavior(view1);
                a.a.performClick();
            }

            
            {
                a = ba.this;
                super();
            }
        });
    }
}
