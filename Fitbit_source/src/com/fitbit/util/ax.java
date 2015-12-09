// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import java.text.Format;

public class ax extends BaseAdapter
{

    private Object a[];
    private String b;
    private boolean c;
    private Format d;

    public transient ax(String s, boolean flag, Object aobj[])
    {
        a = aobj;
        b = s;
        c = flag;
    }

    protected String a(Object obj, int i)
    {
        if (d == null)
        {
            return obj.toString();
        } else
        {
            return d.format(obj);
        }
    }

    public Format a()
    {
        return d;
    }

    public void a(Format format)
    {
        d = format;
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public int getCount()
    {
        return a.length;
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = View.inflate(viewgroup.getContext(), 0x7f0400f5, null);
        }
        view = (CheckedTextView)view1.findViewById(0x1020014);
        view.setEnabled(true);
        view.setText(a(a[i], i));
        return view1;
    }

    public Object getItem(int i)
    {
        return a[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = viewgroup.getContext();
        View view1 = view;
        if (view == null)
        {
            if (!c)
            {
                view1 = View.inflate(((android.content.Context) (obj)), 0x7f04010a, null);
            } else
            {
                view1 = View.inflate(((android.content.Context) (obj)), 0x7f0400f6, null);
            }
        }
        view = (TextView)view1.findViewById(0x1020014);
        obj = (TextView)view1.findViewById(0x1020015);
        view.setText(b);
        view.setSelected(true);
        view.setEnabled(viewgroup.isEnabled());
        ((TextView) (obj)).setEnabled(viewgroup.isEnabled());
        ((TextView) (obj)).setText(a(a[i], i));
        return view1;
    }

    public boolean isEnabled(int i)
    {
        return true;
    }
}
