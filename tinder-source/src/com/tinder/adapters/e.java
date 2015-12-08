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
import android.widget.TextView;

public final class e extends BaseAdapter
{
    static final class a
    {

        TextView a;
        TextView b;

        a()
        {
        }
    }


    public final String a[];
    public final String b[];
    private final LayoutInflater c;

    public e(Context context)
    {
        a = context.getResources().getStringArray(0x7f070007);
        b = context.getResources().getStringArray(0x7f070005);
        c = LayoutInflater.from(context);
    }

    public final int getCount()
    {
        return b.length;
    }

    public final volatile Object getItem(int i)
    {
        return a[i];
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = c.inflate(0x7f03007e, viewgroup, false);
            view = new a();
            view.a = (TextView)view1.findViewById(0x7f0e01f9);
            view.b = (TextView)view1.findViewById(0x7f0e01fa);
            view1.setTag(view);
        }
        view = (a)view1.getTag();
        ((a) (view)).a.setText(a[i]);
        ((a) (view)).b.setText((new StringBuilder("+")).append(b[i]).toString());
        return view1;
    }
}
