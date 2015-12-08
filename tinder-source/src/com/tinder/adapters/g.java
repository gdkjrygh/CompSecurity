// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tinder.model.TinderLocation;
import java.util.ArrayList;
import java.util.List;

public final class g extends BaseAdapter
{
    private static final class a
    {

        TextView a;
        TextView b;

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }


    public List a;

    public g()
    {
        a = new ArrayList();
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        boolean flag;
label0:
        {
            flag = false;
            if (view != null)
            {
                view1 = view;
                if (view.getTag() != null)
                {
                    break label0;
                }
            }
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030023, viewgroup, false);
            view = new a((byte)0);
            view.a = (TextView)view1.findViewById(0x7f0e00ac);
            view.b = (TextView)view1.findViewById(0x7f0e00ad);
            view1.setTag(view);
        }
        view = ((TinderLocation)a.get(i)).getLabels();
        TextView textview;
        if (!TextUtils.isEmpty((CharSequence)((Pair) (view)).second))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        viewgroup = (a)view1.getTag();
        ((a) (viewgroup)).a.setText((CharSequence)((Pair) (view)).first);
        textview = ((a) (viewgroup)).b;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        ((a) (viewgroup)).b.setText((CharSequence)((Pair) (view)).second);
        return view1;
    }
}
