// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.signin.view.SubtitleListCell;
import com.pinterest.api.model.BusinessType;
import java.util.ArrayList;
import java.util.List;

public class BusinessTypeListAdapter extends BaseAdapter
{

    private List _dataSource;
    private LayoutInflater _inflater;

    public BusinessTypeListAdapter(Activity activity)
    {
        _dataSource = new ArrayList();
        if (activity != null)
        {
            _inflater = LayoutInflater.from(activity);
        }
    }

    public int getCount()
    {
        return _dataSource.size();
    }

    public BusinessType getItem(int i)
    {
        return (BusinessType)_dataSource.get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = SubtitleListCell.from(view, viewgroup);
        viewgroup = getItem(i);
        view.setText(viewgroup.getName());
        view.setSubTitle(viewgroup.getHelpClean());
        return view;
    }

    public void setDataSource(List list)
    {
        _dataSource = list;
        notifyDataSetChanged();
    }
}
