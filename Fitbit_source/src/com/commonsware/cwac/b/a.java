// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.commonsware.cwac.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

public class a extends BaseAdapter
{

    private List a;

    public a(int i)
    {
        a = null;
        a = new ArrayList(i);
        for (int j = 0; j < i; j++)
        {
            a.add(null);
        }

    }

    public a(List list)
    {
        a = null;
        a = list;
    }

    protected View a(int i, ViewGroup viewgroup)
    {
        throw new RuntimeException("You must override newView()!");
    }

    public boolean areAllItemsEnabled()
    {
        return false;
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = (View)a.get(i);
        view = view1;
        if (view1 == null)
        {
            view = a(i, viewgroup);
            a.set(i, view);
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return getCount();
    }

    public boolean isEnabled(int i)
    {
        return false;
    }
}
