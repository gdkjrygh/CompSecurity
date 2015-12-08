// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app:
//            ListItemMenuDialog

protected static class disabledTextColor extends ArrayAdapter
{

    private int defaultTextColor;
    private int disabledTextColor;

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x1090003, viewgroup, false);
        }
        view = (TextView)view1.findViewById(0x1020014);
        int j = getContext().getResources().getDimensionPixelSize(0x7f0c00c0);
        view.setPadding(getContext().getResources().getDimensionPixelSize(0x7f0c020c), j, j, j);
        viewgroup = (MenuItem)getItem(i);
        if (viewgroup.isEnabled())
        {
            i = defaultTextColor;
        } else
        {
            i = disabledTextColor;
        }
        view.setTextColor(i);
        view.setText(viewgroup.getTitle());
        return view1;
    }

    public boolean isEnabled(int i)
    {
        return ((MenuItem)getItem(i)).isEnabled();
    }

    public (Context context, int i)
    {
        this(context, i, i);
    }

    public <init>(Context context, int i, int j)
    {
        super(context, 0x1090003);
        defaultTextColor = i;
        disabledTextColor = j;
    }
}
