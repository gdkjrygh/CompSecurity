// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.ui.listview.ListCellOverflow;

public class SettingsListAdapter extends BaseAdapter
{

    public String dataSource[];

    public SettingsListAdapter()
    {
    }

    public SettingsListAdapter(String as[])
    {
        dataSource = as;
    }

    public int getCount()
    {
        return dataSource.length;
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public String getItem(int i)
    {
        return dataSource[i];
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = ListCellOverflow.get(view, viewgroup);
        view.setText(getItem(i));
        return view;
    }

    public void setDataSource(String as[])
    {
        dataSource = as;
        notifyDataSetChanged();
    }
}
