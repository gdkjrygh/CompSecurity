// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.adapter.LoadMoreListener;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Model;
import java.util.List;

public abstract class StoryAdapter extends BaseAdapter
{

    private static final int DEFAULT_NOTIFICATION = 1;
    private static final int EMPTY_CELL_TYPE = 0;
    protected Feed _dataSource;
    protected LoadMoreListener _listener;
    protected boolean _loading;

    public StoryAdapter()
    {
    }

    public void appendItems(Feed feed)
    {
        if (feed != null)
        {
            _dataSource.appendItems(feed);
            notifyDataSetChanged();
        }
    }

    public final void finishedLoading()
    {
        _loading = false;
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

    public Model getItem(int i)
    {
        return (Model)_dataSource.getItems().get(i);
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
        return !isEmpty() ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition cellposition;
        if (i == 0)
        {
            cellposition = com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition.FIRST;
        } else
        if (i == getCount() - 1)
        {
            cellposition = com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition.LAST;
        } else
        {
            cellposition = com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition.MIDDLE;
        }
        view = updateListCell(view, viewgroup, cellposition, i);
        if (_listener != null)
        {
            loadMoreIfNeeded(i);
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return 2;
    }

    public boolean isEmpty()
    {
        return _dataSource == null || _dataSource.getItems() == null || _dataSource.getItems().size() == 0;
    }

    protected final void loadMoreIfNeeded(int i)
    {
        if (_listener != null && i == getCount() - 1 && !_loading)
        {
            _listener.loadMore();
            _loading = true;
        }
    }

    public void setDataSource(Feed feed)
    {
        _loading = false;
        _dataSource = feed;
        notifyDataSetChanged();
    }

    public void setListener(LoadMoreListener loadmorelistener)
    {
        _listener = loadmorelistener;
    }

    public abstract View updateListCell(View view, ViewGroup viewgroup, com.pinterest.activity.home.view.BaseNotificationListCell.CellPosition cellposition, int i);
}
