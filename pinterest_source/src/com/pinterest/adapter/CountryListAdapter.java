// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.pinterest.activity.settings.Country;
import java.util.ArrayList;
import java.util.List;

public class CountryListAdapter extends BaseAdapter
{

    private List _dataSource;

    public CountryListAdapter()
    {
        _dataSource = new ArrayList();
    }

    public int getCount()
    {
        return _dataSource.size();
    }

    public Country getItem(int i)
    {
        return (Country)_dataSource.get(i);
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
        Country country;
        if (view == null || view.getTag() == null)
        {
            view = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030151, viewgroup, false);
            viewgroup = new CategoryHolder(null);
            viewgroup.titleTv = (TextView)view.findViewById(0x7f0f0077);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (CategoryHolder)view.getTag();
        }
        country = getItem(i);
        if (country != null)
        {
            ((CategoryHolder) (viewgroup)).titleTv.setText(country.name);
        }
        return view;
    }

    public void setDataSource(List list)
    {
        _dataSource = list;
        notifyDataSetChanged();
    }

    private class CategoryHolder
    {

        public TextView titleTv;

        private CategoryHolder()
        {
        }

        CategoryHolder(_cls1 _pcls1)
        {
            this();
        }
    }

}
