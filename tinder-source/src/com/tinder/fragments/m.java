// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.Bundle;
import android.support.v4.app.i;
import android.support.v4.app.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.tinder.a.f;
import com.tinder.d.a;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.z;
import com.tinder.model.User;

public abstract class m extends t
{

    protected View a;
    protected User b;
    public View c;
    f d;
    a e;
    z f;
    android.view.View.OnClickListener g;
    private View h;
    private View i;
    private View j;

    public m()
    {
        g = new android.view.View.OnClickListener() {

            final m a;

            public final void onClick(View view)
            {
                if (a.getActivity() != null)
                {
                    a.getActivity().finish();
                }
            }

            
            {
                a = m.this;
                super();
            }
        };
        ManagerApp.h().a(this);
    }

    public final void a()
    {
        getListView().addFooterView(c);
    }

    public final void a(boolean flag)
    {
        View view = a.findViewById(0x7f0e0320);
        int k;
        if (flag)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        view.setVisibility(k);
    }

    public abstract void b();

    public abstract int c();

    public abstract int d();

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        b = f.b();
        c = LayoutInflater.from(getActivity()).inflate(d(), null);
        a = c.findViewById(0x7f0e0011);
        ((TextView)a.findViewById(0x7f0e01b5)).setText(getString(0x7f06013c));
        b();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(c(), viewgroup, false);
        h = layoutinflater.findViewById(0x7f0e008a);
        i = layoutinflater.findViewById(0x7f0e008c);
        j = layoutinflater.findViewById(0x7f0e008b);
        j.setOnClickListener(g);
        h.setOnClickListener(g);
        i.setOnClickListener(g);
        return layoutinflater;
    }
}
