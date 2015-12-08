// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.app.Activity;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.model.FacebookPhoto;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.List;

public final class b extends BaseAdapter
{
    static final class a
    {

        View a;
        ImageView b;

        a()
        {
        }
    }


    public List a;
    private final Activity b;
    private final LayoutInflater c;
    private final int d;

    public b(Activity activity)
    {
        b = activity;
        c = LayoutInflater.from(activity);
        a = new ArrayList();
        d = ad.b(activity).x / 3;
    }

    public final String a(int i)
    {
        return ((FacebookPhoto)a.get(i)).sourceUrl;
    }

    public final void a(List list)
    {
        a.addAll(list);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return Integer.valueOf(a.indexOf(Integer.valueOf(i)));
    }

    public final long getItemId(int i)
    {
        return (long)a.indexOf(Integer.valueOf(i));
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = c.inflate(0x7f03005b, viewgroup, false);
            view = new a();
            view.a = view1;
            view.b = (ImageView)view1.findViewById(0x7f0e0199);
            view1.setTag(view);
        }
        view = (a)view1.getTag();
        Picasso.a(b).a(((FacebookPhoto)a.get(i)).thumbnailUrl).b(d, d).b().a(((a) (view)).b, null);
        ((a) (view)).a.setMinimumHeight(d);
        ((a) (view)).a.setMinimumWidth(d);
        ((a) (view)).b.setMinimumWidth(d);
        ((a) (view)).b.setMinimumHeight(d);
        ((a) (view)).b.setBackgroundResource(0x7f0d0094);
        return view1;
    }
}
