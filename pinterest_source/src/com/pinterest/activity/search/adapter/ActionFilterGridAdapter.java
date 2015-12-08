// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.search.ui.GuidedSearchActionFilterGridCell;
import com.pinterest.api.model.FilterOption;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class ActionFilterGridAdapter extends BaseAdapter
{

    private Context _context;
    private Handler _handler;
    private boolean _hideText;
    List _items;
    private LayoutInflater _li;

    public ActionFilterGridAdapter(Context context)
    {
        _items = Collections.emptyList();
        _hideText = false;
        _context = context;
        _li = (LayoutInflater)context.getSystemService("layout_inflater");
        _handler = new Handler();
    }

    public void empty()
    {
        _handler.post(new _cls1());
    }

    public int getCount()
    {
        return _items.size();
    }

    public FilterOption getItem(int i)
    {
        if (i >= 0 && i < getCount())
        {
            return (FilterOption)_items.get(i);
        } else
        {
            return null;
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
        FilterOption filteroption = getItem(i);
        view = GuidedSearchActionFilterGridCell.get(view, viewgroup);
        if (filteroption == null)
        {
            return view;
        }
        if (StringUtils.isNotEmpty(filteroption.getLargeIconUrl()))
        {
            view.loadFilterImage(filteroption.getLargeIconUrl());
        } else
        if (StringUtils.isNotEmpty(filteroption.getDominantColor()))
        {
            view.setFilterColor(Color.parseColor(filteroption.getDominantColor()));
        }
        if (_hideText)
        {
            view.setFilterText(null);
            return view;
        } else
        {
            view.setFilterText(filteroption.getDisplayName());
            return view;
        }
    }

    public void setHideText(boolean flag)
    {
        _hideText = flag;
    }

    public void updateData(List list)
    {
        _items = list;
        notifyDataSetChanged();
    }

    private class _cls1
        implements Runnable
    {

        final ActionFilterGridAdapter this$0;

        public void run()
        {
            _items.clear();
            notifyDataSetChanged();
        }

        _cls1()
        {
            this$0 = ActionFilterGridAdapter.this;
            super();
        }
    }

}
