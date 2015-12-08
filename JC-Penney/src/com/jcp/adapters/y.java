// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.support.v4.app.ac;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.jcp.d.b;
import com.jcp.model.PromotionDetails;
import java.lang.ref.WeakReference;
import java.util.List;

public class y extends BaseAdapter
{

    private WeakReference a;
    private List b;
    private android.view.View.OnClickListener c;

    public y(ac ac1, List list, android.view.View.OnClickListener onclicklistener)
    {
        a = new WeakReference(null);
        a = new WeakReference(ac1);
        b = list;
        c = onclicklistener;
    }

    private ac a()
    {
        if (a == null)
        {
            throw new b((new StringBuilder()).append(com/jcp/adapters/y.getName()).append(" activity reference is gone").toString());
        } else
        {
            return (ac)a.get();
        }
    }

    public int getCount()
    {
        return b.size();
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
        view = ((LayoutInflater)a().getSystemService("layout_inflater")).inflate(0x7f0300d6, null);
        viewgroup = (TextView)view.findViewById(0x7f0e0452);
        TextView textview = (TextView)view.findViewById(0x7f0e0453);
        if (c != null)
        {
            View view1 = view.findViewById(0x7f0e0450);
            view1.setTag(new Integer(i));
            view1.setOnClickListener(c);
            com.jcp.b.b.q = true;
        }
        if ("REWARDS".equals(((PromotionDetails)b.get(i)).getType()))
        {
            viewgroup.setText(((PromotionDetails)b.get(i)).getCode());
            textview.setText((new StringBuilder()).append(" - $").append(String.valueOf(((PromotionDetails)b.get(i)).getAmount())).toString());
        }
        return view;
    }
}
