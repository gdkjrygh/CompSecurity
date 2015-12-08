// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;
import p.bt.a;

public abstract class ag extends p
{

    protected a b;
    protected Context c;
    protected View d;
    protected int e;

    public ag(Context context)
    {
        d = null;
        c = context;
        b = new a();
        b.a(d());
    }

    protected abstract View a(int i, View view);

    public Object a(ViewGroup viewgroup, int i)
    {
        int j = b(i);
        View view = null;
        if (j != -1)
        {
            view = b.b(i, j);
        }
        view = a(i, view);
        viewgroup.addView(view);
        b.a(view, i, j);
        return view;
    }

    public void a(ViewGroup viewgroup)
    {
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (View)obj;
        viewgroup.removeView(((View) (obj)));
        int j = c(((View) (obj)));
        if (j != -1)
        {
            b.b(((View) (obj)), i, j);
        }
    }

    public boolean a(View view, Object obj)
    {
        return obj == view;
    }

    public int b(int i)
    {
        return 0;
    }

    public void b(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup = (View)obj;
        if (viewgroup != d)
        {
            if (viewgroup != null)
            {
                ((FragmentActivity)viewgroup.getContext()).d();
            }
            d = viewgroup;
            e = i;
        }
    }

    public int c(View view)
    {
        return 0;
    }

    public void c()
    {
        super.c();
    }

    public int d()
    {
        return 1;
    }
}
