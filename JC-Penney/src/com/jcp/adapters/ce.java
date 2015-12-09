// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class ce extends BaseAdapter
{

    private Context a;
    private List b;

    public ce(Context context, List list)
    {
        b = list;
        a = context;
    }

    public int getCount()
    {
        return b.size() - 1;
    }

    public Object getItem(int i)
    {
        return b.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(a).inflate(0x7f0300e8, viewgroup, false);
        }
        ((TextView)view1.findViewById(0x7f0e04e0)).setText(((Integer)b.get(i)).toString());
        return view1;
    }
}
