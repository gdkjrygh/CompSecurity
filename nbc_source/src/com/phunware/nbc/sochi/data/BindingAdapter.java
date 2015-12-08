// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.data;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class BindingAdapter extends BaseAdapter
{

    public BindingAdapter()
    {
    }

    public abstract void bindView(int i, int j, View view, ViewGroup viewgroup);

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = getItemViewType(i);
        View view1 = view;
        if (view == null)
        {
            view1 = newView(j, viewgroup);
        }
        bindView(i, j, view1, viewgroup);
        return view1;
    }

    public abstract View newView(int i, ViewGroup viewgroup);
}
