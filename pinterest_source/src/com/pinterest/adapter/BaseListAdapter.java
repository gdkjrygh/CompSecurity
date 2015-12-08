// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.Arrays;
import java.util.List;

public abstract class BaseListAdapter extends BaseAdapter
{

    private List _ids;
    public List dataSource;

    public BaseListAdapter()
    {
    }

    public int getCount()
    {
        return dataSource.size();
    }

    public Object getItem(int i)
    {
        return dataSource.get(i);
    }

    public long getItemId(int i)
    {
        if (_ids != null)
        {
            return (long)((Integer)_ids.get(i)).intValue();
        } else
        {
            return (long)i;
        }
    }

    public abstract View getView(int i, View view, ViewGroup viewgroup);

    public void setDataSource(List list)
    {
        dataSource = list;
        notifyDataSetChanged();
    }

    public void setDataSource(Object aobj[])
    {
        dataSource = Arrays.asList(aobj);
        notifyDataSetChanged();
    }

    public void setIds(List list)
    {
        _ids = list;
        notifyDataSetChanged();
    }
}
