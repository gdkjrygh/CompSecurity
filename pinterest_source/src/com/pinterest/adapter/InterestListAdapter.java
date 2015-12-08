// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.InterestsFeed;
import com.pinterest.ui.listview.ListCellBasic;

public class InterestListAdapter extends BaseAdapter
{

    private InterestsFeed _dataSource;
    private boolean _neverEmpty;

    public InterestListAdapter()
    {
    }

    public int getCount()
    {
        if (_dataSource == null)
        {
            return 0;
        } else
        {
            return _dataSource.getCount();
        }
    }

    public Interest getItem(int i)
    {
        if (_dataSource == null)
        {
            return null;
        } else
        {
            return (Interest)_dataSource.get(i);
        }
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
        view = ListCellBasic.get(view, viewgroup);
        viewgroup = getItem(i);
        if (viewgroup != null)
        {
            view.setImageUrl(viewgroup.getImageSmallUrl());
            view.setText(viewgroup.getName());
        }
        return view;
    }

    public boolean isEmpty()
    {
        if (_neverEmpty)
        {
            return false;
        } else
        {
            return super.isEmpty();
        }
    }

    public void setDataSource(InterestsFeed interestsfeed)
    {
        _dataSource = interestsfeed;
        notifyDataSetChanged();
    }

    public void setNeverEmpty(boolean flag)
    {
        _neverEmpty = flag;
    }
}
