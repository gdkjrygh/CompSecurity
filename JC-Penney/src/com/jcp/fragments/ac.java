// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.jcp.adapters.CouponAdapter;
import com.jcp.c.m;
import com.jcp.e.i;
import com.jcp.h.f;
import com.jcp.model.Coupons;
import com.jcp.util.au;

// Referenced classes of package com.jcp.fragments:
//            s

public class ac extends s
    implements i
{

    private ListView a;
    private ProgressBar b;

    public ac()
    {
    }

    protected f S()
    {
        return f.b();
    }

    protected String T()
    {
        return "Mobile|pg40027800029";
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (i() != null && i().getActionBar() != null)
        {
            i().getActionBar().show();
            i().findViewById(0x7f0e0164).setVisibility(8);
        }
        layoutinflater = layoutinflater.inflate(0x7f03004f, viewgroup, false);
        a = (ListView)layoutinflater.findViewById(0x7f0e0201);
        b = (ProgressBar)layoutinflater.findViewById(0x7f0e0200);
        a(j().getString(0x7f070133), ((android.app.Activity) (i())));
        viewgroup = new m(i());
        viewgroup.a();
        viewgroup.a(this);
        return layoutinflater;
    }

    protected String a()
    {
        return "Promotion Landing Page:jcp coupon (pg40027800029)";
    }

    public void a(String s1, int j)
    {
        if (i() != null)
        {
            au.a(i(), s1);
            b.setVisibility(8);
        }
    }

    public void a(Coupons acoupons[], int j)
    {
        if (acoupons != null)
        {
            if (i() != null)
            {
                b.setVisibility(8);
                acoupons = CouponAdapter.a(i(), acoupons);
                a.setAdapter(acoupons);
                acoupons.notifyDataSetChanged();
            }
            return;
        } else
        {
            b.setVisibility(8);
            return;
        }
    }

    public void b()
    {
        a(j().getString(0x7f070133));
        super.b();
    }
}
