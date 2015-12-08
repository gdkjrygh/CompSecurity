// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.explore.view.ExploreInterestsListCell;
import com.pinterest.api.model.Interest;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;

public class ExploreInterestsAdapter extends BaseAdapter
{

    protected ArrayList _dataSource;
    protected ArrayList _interestsToPrepend;
    protected boolean _loading;
    protected ArrayList _recentInterests;
    protected ArrayList _trendingInterests;
    private HashMap scrollPositions;

    public ExploreInterestsAdapter()
    {
        _dataSource = new ArrayList();
        _trendingInterests = new ArrayList();
        _interestsToPrepend = new ArrayList();
        scrollPositions = new HashMap();
    }

    private int getScrollPosition(Interest interest)
    {
        if (interest != null && scrollPositions != null)
        {
            interest = (Integer)scrollPositions.get(interest.getName());
            if (interest == null)
            {
                return 0;
            } else
            {
                return interest.intValue();
            }
        } else
        {
            return 0;
        }
    }

    private void updateInterestsToPrepend()
    {
        _interestsToPrepend.clear();
        if (CollectionUtils.isNotEmpty(_recentInterests))
        {
            Interest interest = new Interest();
            interest.setName(Resources.string(0x7f070486));
            interest.setChildInterests(_recentInterests);
            _interestsToPrepend.add(interest);
        }
        if (CollectionUtils.isNotEmpty(_trendingInterests))
        {
            Interest interest1 = new Interest();
            interest1.setUid("3");
            interest1.setName(Resources.string(0x7f0705a0));
            interest1.setChildInterests(_trendingInterests);
            _interestsToPrepend.add(interest1);
        }
    }

    public int getCount()
    {
        int j = 0;
        int i;
        if (_dataSource == null)
        {
            i = 0;
        } else
        {
            i = _dataSource.size();
        }
        if (_interestsToPrepend != null)
        {
            j = _interestsToPrepend.size();
        }
        return i + j;
    }

    public Interest getItem(int i)
    {
        if (i < 0)
        {
            return null;
        }
        if (i < _interestsToPrepend.size())
        {
            return (Interest)_interestsToPrepend.get(i);
        } else
        {
            return (Interest)_dataSource.get(i - _interestsToPrepend.size());
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
        view = ExploreInterestsListCell.from(view, viewgroup);
        viewgroup = view.getInterest();
        if (viewgroup != null)
        {
            scrollPositions.put(viewgroup.getName(), Integer.valueOf(view.getScrollPosition()));
        }
        viewgroup = getItem(i);
        view.setInterest(viewgroup);
        view.setScrollPosition(getScrollPosition(viewgroup));
        if (i == getCount() - 1)
        {
            view.setDividerVisibility(8);
        } else
        {
            view.setDividerVisibility(0);
        }
        view.updateUI();
        return view;
    }

    public void setDataSource(ArrayList arraylist)
    {
        _loading = false;
        _dataSource = arraylist;
        notifyDataSetChanged();
    }

    public void setRecentInterests(ArrayList arraylist)
    {
        _recentInterests = arraylist;
        updateInterestsToPrepend();
        notifyDataSetChanged();
    }

    public void setTrendingInterests(ArrayList arraylist)
    {
        _trendingInterests.clear();
        Interest interest = new Interest();
        interest.setName(Resources.string(0x7f070377));
        interest.setUid("3");
        _trendingInterests.add(interest);
        _trendingInterests.addAll(arraylist);
        arraylist = new Interest();
        arraylist.setName(Resources.string(0x7f07027c));
        arraylist.setUid("2");
        arraylist.setDominantColor("#23326C");
        _trendingInterests.add(arraylist);
        updateInterestsToPrepend();
        notifyDataSetChanged();
    }
}
