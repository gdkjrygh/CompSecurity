// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.pinterest.activity.pin.fragment.PinFragment;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.LoadMoreListener;
import com.pinterest.api.model.Feed;

public class PinSwipeAdapter extends FixedFragmentStatePagerAdapter
{

    private static final int LOAD_MORE_INDEX = 3;
    private Feed _dataSource;
    private LoadMoreListener _loadMoreListener;
    private boolean _loading;
    private int _positionOfInitiallyClickedPin;

    public PinSwipeAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        _loading = false;
        _positionOfInitiallyClickedPin = -1;
    }

    private boolean shouldLoadMore(int i)
    {
        int j;
        if (!_loading)
        {
            if ((j = getCount()) > 3 && i >= j - 3)
            {
                return true;
            }
        }
        return false;
    }

    public void appendDataSource(Feed feed)
    {
        Feed feed1 = getDataSource();
        if (feed1 == null)
        {
            setDataSource(feed);
            return;
        } else
        {
            feed1.appendItems(feed);
            notifyDataSetChanged();
            return;
        }
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

    public Feed getDataSource()
    {
        return _dataSource;
    }

    public Fragment getItem(int i)
    {
        if (_dataSource != null && i < _dataSource.getCount())
        {
            PinFragment pinfragment = new PinFragment();
            pinfragment.setNavigation(new Navigation(Location.PIN, _dataSource.get(i)));
            if (i == _positionOfInitiallyClickedPin)
            {
                ((PinFragment)pinfragment).setPositionOfInitiallyClickedPin(_positionOfInitiallyClickedPin);
            }
            loadMore(i);
            return pinfragment;
        } else
        {
            return null;
        }
    }

    public int getItemPosition(Object obj)
    {
        return -2;
    }

    protected void loadMore(int i)
    {
        if (_loadMoreListener != null && shouldLoadMore(i))
        {
            _loadMoreListener.loadMore();
            setLoading(true);
        }
    }

    public void setDataSource(Feed feed)
    {
        _dataSource = feed;
        notifyDataSetChanged();
    }

    public void setLoadMoreListener(LoadMoreListener loadmorelistener)
    {
        _loadMoreListener = loadmorelistener;
    }

    public void setLoading(boolean flag)
    {
        _loading = flag;
    }

    public void setPositionOfInitiallyClickedPin(int i)
    {
        _positionOfInitiallyClickedPin = i;
    }
}
