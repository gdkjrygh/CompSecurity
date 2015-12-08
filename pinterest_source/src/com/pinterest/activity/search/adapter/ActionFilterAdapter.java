// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.search.ui.GuidedSearchFilterCell;
import com.pinterest.api.model.FilterOption;
import com.pinterest.ui.listview.SolidTitleDivider;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class ActionFilterAdapter extends BaseAdapter
{

    public static final int TYPE_SECTION_ELEMENT = 1;
    public static final int TYPE_SECTION_TITLE = 0;
    private Context _context;
    private String _filterName;
    private Handler _handler;
    List _items;
    private LayoutInflater _li;
    private String _topFilterName;
    List _topItems;

    public ActionFilterAdapter(Context context)
    {
        _items = Collections.emptyList();
        _topItems = Collections.emptyList();
        _context = context;
        _li = (LayoutInflater)context.getSystemService("layout_inflater");
        _handler = new Handler();
    }

    private boolean hasTopItems()
    {
        return _topItems != null && _topItems.size() > 0;
    }

    public void empty()
    {
        _handler.post(new _cls1());
    }

    public int getCount()
    {
        if (hasTopItems())
        {
            return _topItems.size() + _items.size() + 2;
        } else
        {
            return _items.size() + 1;
        }
    }

    public FilterOption getItem(int i)
    {
        if (hasTopItems())
        {
            if (i > 0 && i < _topItems.size() + 1)
            {
                return (FilterOption)_topItems.get(i - 1);
            }
            if (i >= _topItems.size() + 2 && i < getCount())
            {
                return (FilterOption)_items.get(i - _topItems.size() - 2);
            }
        } else
        if (i > 0 && i < getCount())
        {
            return (FilterOption)_items.get(i - 1);
        }
        return null;
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return i != 0 && (!hasTopItems() || i != _topItems.size() + 1) ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (getItemViewType(i) != 0) goto _L2; else goto _L1
_L1:
        view = SolidTitleDivider.from(view, viewgroup);
        if (!hasTopItems() || i != 0) goto _L4; else goto _L3
_L3:
        view.setText(_topFilterName);
_L6:
        return view;
_L4:
        view.setText(_filterName);
        return view;
_L2:
        viewgroup = GuidedSearchFilterCell.from(view, viewgroup);
        FilterOption filteroption = getItem(i);
        view = viewgroup;
        if (filteroption != null)
        {
            viewgroup.setTitleOnly(false);
            viewgroup.setText(filteroption.getDisplayName());
            viewgroup.setCount(filteroption.getDisplayCount());
            if (StringUtils.isNotEmpty(filteroption.getSmallIconUrl()))
            {
                viewgroup.setIconVisibility(0);
                viewgroup.loadIconImage(filteroption.getSmallIconUrl());
                return viewgroup;
            } else
            {
                viewgroup.setIconVisibility(8);
                return viewgroup;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public void updateData(List list, String s, List list1, String s1)
    {
        _items = list;
        _filterName = s;
        _topItems = list1;
        _topFilterName = s1;
        notifyDataSetChanged();
    }


/*
    static String access$002(ActionFilterAdapter actionfilteradapter, String s)
    {
        actionfilteradapter._filterName = s;
        return s;
    }

*/


/*
    static String access$102(ActionFilterAdapter actionfilteradapter, String s)
    {
        actionfilteradapter._topFilterName = s;
        return s;
    }

*/

    private class _cls1
        implements Runnable
    {

        final ActionFilterAdapter this$0;

        public void run()
        {
            _items.clear();
            _filterName = null;
            _topItems.clear();
            _topFilterName = null;
            notifyDataSetChanged();
        }

        _cls1()
        {
            this$0 = ActionFilterAdapter.this;
            super();
        }
    }

}
