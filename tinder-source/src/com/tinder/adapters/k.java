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
import com.tinder.model.School;
import com.tinder.views.CustomTextView;
import java.util.List;

public final class k extends BaseAdapter
{
    public final class a
    {

        public View a;
        public CustomTextView b;
        public ImageView c;
        final k d;

        public a()
        {
            d = k.this;
            super();
        }
    }


    private List a;
    private int b;

    public k(List list)
    {
        a = list;
        b = (int)ManagerApp.c().getResources().getDimension(0x7f0900cc);
    }

    private School a(int i)
    {
        return (School)a.get(i);
    }

    public final int getCount()
    {
        return a.size();
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
        School school;
        ImageView imageview;
        int j;
        if (view == null || view.getTag() == null)
        {
            view = new a();
            View view1 = ((LayoutInflater)ManagerApp.c().getSystemService("layout_inflater")).inflate(0x7f0300aa, viewgroup, false);
            view.a = view1;
            view.b = (CustomTextView)view1.findViewById(0x7f0e01b5);
            view.c = (ImageView)view1.findViewById(0x7f0e0320);
            view1.setTag(view);
            viewgroup = view;
            view = view1;
        } else
        {
            viewgroup = (a)view.getTag();
        }
        school = a(i);
        ((a) (viewgroup)).b.setText(school.getSpanned());
        imageview = ((a) (viewgroup)).c;
        if (school.isDisplayed)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        imageview.setVisibility(j);
        viewgroup = ((a) (viewgroup)).a;
        if (i == 0)
        {
            i = 0;
        } else
        {
            i = b;
        }
        viewgroup.setPadding(0, i, 0, 0);
        return view;
    }
}
