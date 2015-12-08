// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tinder.managers.ManagerApp;
import com.tinder.model.Job;
import com.tinder.views.CustomTextView;
import java.util.ArrayList;
import java.util.List;

public final class f extends BaseAdapter
{
    public static final class a
    {

        public View a;
        public CustomTextView b;
        public ImageView c;

        public a()
        {
        }
    }


    public List a;
    private List b;
    private int c;
    private int d;

    public f(List list)
    {
        a = new ArrayList();
        b = list;
        c = (int)ManagerApp.c().getResources().getDimension(0x7f0900fa);
        d = (int)ManagerApp.c().getResources().getDimension(0x7f0900cc);
    }

    private Job a(int i)
    {
        return (Job)b.get(i);
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        boolean flag;
label0:
        {
            flag = false;
            a a1 = new a();
            if (view != null)
            {
                view1 = view;
                if (view.getTag() != null)
                {
                    break label0;
                }
            }
            view1 = ((LayoutInflater)ManagerApp.c().getSystemService("layout_inflater")).inflate(0x7f0300aa, viewgroup, false);
            a1.a = view1;
            a1.b = (CustomTextView)view1.findViewById(0x7f0e01b5);
            a1.c = (ImageView)view1.findViewById(0x7f0e0320);
            view1.setTag(a1);
        }
        viewgroup = (a)view1.getTag();
        view = a(i);
        ((a) (viewgroup)).b.setText(view.getSpanned());
        Object obj = ((a) (viewgroup)).c;
        int j;
        if (((Job) (view)).companyShown || ((Job) (view)).titleShown)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((ImageView) (obj)).setVisibility(j);
        obj = ((a) (viewgroup)).a;
        if (a.contains(Integer.valueOf(i)))
        {
            i = c;
        } else
        {
            i = d;
        }
        ((View) (obj)).setPadding(0, i, 0, 0);
        viewgroup = ((a) (viewgroup)).a;
        if (view.hasString())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        viewgroup.setVisibility(i);
        return view1;
    }
}
