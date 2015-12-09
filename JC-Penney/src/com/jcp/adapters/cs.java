// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class cs extends ArrayAdapter
{

    private List a;
    private LayoutInflater b;

    public cs(ac ac1, int i, List list)
    {
        super(ac1, i, list);
        a = list;
        b = (LayoutInflater)ac1.getSystemService("layout_inflater");
    }

    public View a(int i, View view, ViewGroup viewgroup)
    {
        view = b.inflate(0x7f0300e8, viewgroup, false);
        viewgroup = (String)a.get(i);
        TextView textview = (TextView)view.findViewById(0x7f0e04e0);
        if (i == 0)
        {
            textview.setText("state");
            textview.setTextColor(0xff888888);
            return view;
        } else
        {
            textview.setText(viewgroup);
            return view;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return a(i, view, viewgroup);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        return a(i, view, viewgroup);
    }
}
