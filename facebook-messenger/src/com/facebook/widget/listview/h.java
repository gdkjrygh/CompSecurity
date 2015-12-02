// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.common.base.Preconditions;

public abstract class h extends BaseAdapter
{

    public h()
    {
    }

    public abstract View a(int i, ViewGroup viewgroup);

    public abstract void a(Object obj, View view, int i, ViewGroup viewgroup);

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        int j = getItemViewType(i);
        View view1 = view;
        if (view == null)
        {
            view1 = a(j, viewgroup);
            boolean flag;
            if (view1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "createView() shall not return null value!");
        }
        a(getItem(i), view1, j, viewgroup);
        return view1;
    }
}
