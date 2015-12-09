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
import com.jcp.productcategories.modal.Modal;
import com.jcp.views.TypefaceTextView;
import java.util.List;

public class ay extends BaseAdapter
{

    private final Context a;
    private final List b;
    private final LayoutInflater c;
    private String d;

    public ay(Context context, List list)
    {
        a = context;
        b = list;
        c = LayoutInflater.from(context);
    }

    public void a(String s)
    {
        d = s;
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
        String s = ((Modal)b.get(i)).getName();
        if (a.getString(0x7f070215).equalsIgnoreCase(s) || a.getString(0x7f070212).equalsIgnoreCase(s))
        {
            view = c.inflate(0x7f030090, viewgroup, false);
            ((TextView)view.findViewById(0x7f0e0339)).setText(s);
        } else
        {
            view = c.inflate(0x7f03008f, viewgroup, false);
            viewgroup = (TypefaceTextView)view.findViewById(0x7f0e005a);
            viewgroup.setText(s.toUpperCase());
            if (a.getString(0x7f070211).equalsIgnoreCase(s))
            {
                viewgroup.a(0x7f020130, 25);
            } else
            if (a.getString(0x7f07020d).equalsIgnoreCase(s))
            {
                viewgroup.a(0x7f0200df, 25);
            } else
            if (a.getString(0x7f07020c).equalsIgnoreCase(s))
            {
                viewgroup.a(0x7f020043, 25);
            } else
            if (a.getString(0x7f070214).equalsIgnoreCase(s))
            {
                viewgroup.a(0x7f020072, 25);
            } else
            if (a.getString(0x7f07020f).equalsIgnoreCase(s))
            {
                viewgroup.a(0x7f020224, 25);
            } else
            if (a.getString(0x7f070210).equalsIgnoreCase(s))
            {
                viewgroup.a(0x7f020106, 25);
            } else
            if (a.getString(0x7f070213).equalsIgnoreCase(s))
            {
                viewgroup.a(0x7f0201bc, 25);
            } else
            if (a.getString(0x7f07020e).equalsIgnoreCase(s))
            {
                viewgroup.a(0x7f0200e3, 25);
            }
        }
        if (d != null && d.equals(s))
        {
            view.setBackgroundResource(0x7f02011e);
            return view;
        } else
        {
            view.setBackgroundColor(-1);
            return view;
        }
    }
}
