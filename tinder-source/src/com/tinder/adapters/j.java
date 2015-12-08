// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.managers.ManagerApp;
import com.tinder.model.TinderLocation;
import java.util.List;

public final class j extends BaseAdapter
{
    public static final class a
    {

        public TextView a;
        public ImageView b;
        public ImageView c;

        public a()
        {
        }
    }


    public static int a;
    public static int b;
    public TinderLocation c;
    public List d;

    public j(List list)
    {
        d = list;
        a = ManagerApp.c().getResources().getColor(0x7f0d00ce);
        b = ManagerApp.c().getResources().getColor(0x7f0d0094);
    }

    public final void a(TinderLocation tinderlocation)
    {
        c = tinderlocation;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return d.size();
    }

    public final Object getItem(int i)
    {
        return d.get(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        TinderLocation tinderlocation;
        Pair pair;
        if (view == null || view.getTag() == null)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030026, viewgroup, false);
            viewgroup = new a();
            viewgroup.a = (TextView)view.findViewById(0x7f0e00b1);
            viewgroup.b = (ImageView)view.findViewById(0x7f0e00af);
            viewgroup.c = (ImageView)view.findViewById(0x7f0e00b0);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (a)view.getTag();
        }
        tinderlocation = (TinderLocation)d.get(i);
        pair = tinderlocation.getLabels();
        if (pair != null)
        {
            String s1 = (String)pair.first;
            String s = s1;
            if (!TextUtils.isEmpty((CharSequence)pair.second))
            {
                s = (new StringBuilder()).append(s1).append(", ").append((String)pair.second).toString();
            }
            ((a) (viewgroup)).a.setText(s);
        }
        if (c != null && tinderlocation.equals(c))
        {
            ((a) (viewgroup)).c.setVisibility(0);
            ((a) (viewgroup)).b.setColorFilter(a);
            return view;
        } else
        {
            ((a) (viewgroup)).c.setVisibility(4);
            ((a) (viewgroup)).b.setColorFilter(b);
            return view;
        }
    }
}
