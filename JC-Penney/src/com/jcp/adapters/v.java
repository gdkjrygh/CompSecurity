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

public class v extends BaseAdapter
{

    private WeakReference a;
    private List b;
    private android.view.View.OnClickListener c;

    public v(ac ac1, List list, android.view.View.OnClickListener onclicklistener)
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
            throw new b((new StringBuilder()).append(com/jcp/adapters/v.getName()).append(" activity reference is gone").toString());
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
        view = ((LayoutInflater)a().getSystemService("layout_inflater")).inflate(0x7f030052, null);
        viewgroup = (TextView)view.findViewById(0x7f0e020d);
        TextView textview = (TextView)view.findViewById(0x7f0e0217);
        if (c != null)
        {
            View view1 = view.findViewById(0x7f0e0216);
            view1.setTag(new Integer(i));
            com.jcp.b.b.p = true;
            view1.setOnClickListener(c);
        }
        if ("COUPON".equals(((PromotionDetails)b.get(i)).getType()))
        {
            viewgroup.setText(((PromotionDetails)b.get(i)).getCode());
            textview.setText(((PromotionDetails)b.get(i)).getDescription());
        }
        return view;
    }
}
