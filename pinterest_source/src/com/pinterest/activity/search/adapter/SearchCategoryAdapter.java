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
import com.pinterest.activity.search.model.RelatedQueryItem;
import com.pinterest.activity.search.ui.GuidedSearchFilter;
import com.pinterest.activity.search.ui.GuidedSearchModeFilter;
import com.pinterest.activity.search.ui.GuidedSearchSpecificFilter;
import com.pinterest.api.model.SearchFilter;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import java.util.Collections;
import java.util.List;

public class SearchCategoryAdapter extends BaseAdapter
{

    public static final int TYPE_GUIDED_FILTER = 0;
    public static final int TYPE_GUIDED_MODE_FILTER = 1;
    public static final int TYPE_GUIDED_SPECIFIC_FILTER = 2;
    List _categoryItems;
    private Context _context;
    List _filterItems;
    private Handler _handler;
    private LayoutInflater _li;

    public SearchCategoryAdapter(Context context)
    {
        _categoryItems = Collections.emptyList();
        _filterItems = Collections.emptyList();
        _context = context;
        _li = (LayoutInflater)context.getSystemService("layout_inflater");
        _handler = new Handler();
    }

    private int dividerPosition()
    {
        if (_filterItems == null || _filterItems.size() == 0 || _categoryItems == null || _categoryItems.size() == 0)
        {
            return -1;
        }
        for (int i = _filterItems.size() - 1; i >= 0; i--)
        {
            if (((SearchFilter)_filterItems.get(i)).getType().equals(com.pinterest.api.model.SearchFilter.FilterType.MODE.getValue()))
            {
                return i;
            }
        }

        return -1;
    }

    public void empty()
    {
        _handler.post(new _cls2());
    }

    public int getCount()
    {
        return _categoryItems.size() + _filterItems.size();
    }

    public List getFilterItems()
    {
        return _filterItems;
    }

    public Object getItem(int i)
    {
        if (i >= 0 && i < getCount())
        {
            if (i < _filterItems.size())
            {
                return _filterItems.get(i);
            } else
            {
                return _categoryItems.get(i - _filterItems.size());
            }
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        Object obj = getItem(i);
        if (obj instanceof SearchFilter)
        {
            return !com.pinterest.api.model.SearchFilter.FilterType.MODE.getValue().equals(((SearchFilter)obj).getType()) ? 2 : 1;
        } else
        {
            return 0;
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag1 = true;
        Object obj = getItem(i);
        int j = getItemViewType(i);
        boolean flag;
        if (j == 1)
        {
            view = GuidedSearchModeFilter.get(view, viewgroup);
            viewgroup = (GuidedSearchModeFilter)view;
            viewgroup.setItem((SearchFilter)obj);
            if (dividerPosition() == i)
            {
                viewgroup.setShowDivider(true);
            } else
            {
                viewgroup.setShowDivider(false);
            }
        } else
        if (j == 2)
        {
            view = GuidedSearchSpecificFilter.get(view, viewgroup);
            ((GuidedSearchSpecificFilter)view).setItem((SearchFilter)obj);
        } else
        {
            view = GuidedSearchFilter.get(view, viewgroup);
            ((GuidedSearchFilter)view).setItem((RelatedQueryItem)obj);
        }
        viewgroup = (GuidedSearchFilter)view;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        viewgroup.setFirstFilter(flag);
        viewgroup = (GuidedSearchFilter)view;
        if (i == getCount() - 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        viewgroup.setLastFilter(flag);
        ((GuidedSearchFilter)view).updateUI();
        if (Experiments.d(false))
        {
            view.setBackgroundColor(Resources.color(0x7f0e00bf));
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public void updateData(final List categoryItems, final List filterItems)
    {
        _handler.post(new _cls1());
    }

    private class _cls2
        implements Runnable
    {

        final SearchCategoryAdapter this$0;

        public void run()
        {
            _categoryItems.clear();
            _filterItems.clear();
        }

        _cls2()
        {
            this$0 = SearchCategoryAdapter.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final SearchCategoryAdapter this$0;
        final List val$categoryItems;
        final List val$filterItems;

        public void run()
        {
            _categoryItems = categoryItems;
            if (Experiments.a())
            {
                _filterItems = filterItems;
            }
            notifyDataSetChanged();
        }

        _cls1()
        {
            this$0 = SearchCategoryAdapter.this;
            categoryItems = list;
            filterItems = list1;
            super();
        }
    }

}
