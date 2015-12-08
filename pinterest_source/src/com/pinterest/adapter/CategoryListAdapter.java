// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Category;
import com.pinterest.ui.imageview.WebImageView;
import java.util.ArrayList;
import java.util.List;

public class CategoryListAdapter extends BaseAdapter
{

    private Board _board;
    private List _dataSource;
    private LayoutInflater _inflater;

    public CategoryListAdapter(Activity activity)
    {
        _dataSource = new ArrayList();
        if (activity != null)
        {
            _inflater = LayoutInflater.from(activity);
        }
    }

    public CategoryListAdapter(Activity activity, Board board)
    {
        _dataSource = new ArrayList();
        if (activity != null)
        {
            _inflater = LayoutInflater.from(activity);
        }
        _board = board;
    }

    public int getCount()
    {
        return _dataSource.size();
    }

    public Category getItem(int i)
    {
        return (Category)_dataSource.get(i);
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
        Object obj;
        if (view == null || view.getTag() == null)
        {
            if (_inflater == null)
            {
                _inflater = (LayoutInflater)viewgroup.getContext().getSystemService("layout_inflater");
            }
            view = _inflater.inflate(0x7f030151, viewgroup, false);
            viewgroup = new CategoryHolder(null);
            viewgroup.iconIv = (WebImageView)view.findViewById(0x7f0f0325);
            viewgroup.titleTv = (TextView)view.findViewById(0x7f0f0077);
            viewgroup.checkIv = view.findViewById(0x7f0f0354);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (CategoryHolder)view.getTag();
        }
        obj = getItem(i);
        if (obj == null || _board == null)
        {
            return view;
        }
        ((CategoryHolder) (viewgroup)).iconIv.loadUrl(((Category) (obj)).getImageSmallUrl());
        ((CategoryHolder) (viewgroup)).iconIv.setVisibility(0);
        String s = ((Category) (obj)).getName();
        obj = ((Category) (obj)).getKey();
        ((CategoryHolder) (viewgroup)).titleTv.setText(s);
        if (((String) (obj)).equals(_board.getCategory()))
        {
            ((CategoryHolder) (viewgroup)).titleTv.setTypeface(null, 1);
            view.setBackgroundResource(0x7f020286);
            return view;
        } else
        {
            ((CategoryHolder) (viewgroup)).titleTv.setTypeface(null, 0);
            view.setBackgroundResource(0x7f020283);
            return view;
        }
    }

    public void setBoard(Board board)
    {
        _board = board;
    }

    public void setDataSource(List list)
    {
        _dataSource = list;
        notifyDataSetChanged();
    }

    private class CategoryHolder
    {

        public View checkIv;
        public WebImageView iconIv;
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
