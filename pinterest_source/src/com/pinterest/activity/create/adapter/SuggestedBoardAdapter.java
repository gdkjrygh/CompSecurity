// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.adapter;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.create.view.BoardLoadingListCell;
import com.pinterest.activity.create.view.BoardPickerListCell;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.MyUserApi;
import java.util.List;

public class SuggestedBoardAdapter extends BaseAdapter
{

    public static final int TYPE_BOARD = 0;
    public static final int TYPE_LOADING = 2;
    private String _apiTag;
    Runnable _apiTimeout;
    private BoardFeed _cachedBoards;
    private boolean _failedApi;
    private Handler _handler;
    private boolean _loadingSuggestions;
    private Pin _pin;
    private int _suggestedCount;
    private BoardFeed _suggestedSource;
    protected com.pinterest.api.remote.MyUserApi.SuggestedBoardPickerApiResponse onSuggestedBoardsLoaded;

    public SuggestedBoardAdapter()
    {
        _suggestedCount = 0;
        _loadingSuggestions = true;
        _failedApi = false;
        _apiTimeout = new _cls1();
        onSuggestedBoardsLoaded = new _cls2();
    }

    private void removeTimeout()
    {
        _handler.removeCallbacks(_apiTimeout);
    }

    public int getCount()
    {
        if (_loadingSuggestions)
        {
            return _suggestedCount + 1;
        } else
        {
            return _suggestedCount;
        }
    }

    public Board getItem(int i)
    {
        return (Board)_suggestedSource.get(i);
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
        return !_loadingSuggestions || i != _suggestedCount ? 0 : 2;
    }

    public int getSuggestedCount()
    {
        return _suggestedCount;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (_loadingSuggestions && i == _suggestedCount)
        {
            return BoardLoadingListCell.get(view, viewgroup);
        } else
        {
            view = BoardPickerListCell.get(view, viewgroup);
            view.setTouchResource(0x7f02028b);
            view.setBoard(getItem(i));
            return view;
        }
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setCachedBoards(BoardFeed boardfeed, Pin pin, boolean flag)
    {
        _cachedBoards = boardfeed;
        _pin = pin;
        _loadingSuggestions = flag;
        if (_loadingSuggestions && boardfeed != null)
        {
            if (boardfeed.hasItems())
            {
                BoardFeed boardfeed1 = new BoardFeed();
                boardfeed1.setItems(boardfeed.getItems().subList(0, 1));
                setDataSource(boardfeed1);
            }
            MyUserApi.a(pin.getUid(), onSuggestedBoardsLoaded, _apiTag);
            _handler = new Handler();
            _handler.postDelayed(_apiTimeout, 3000L);
            return;
        } else
        {
            setDataSource(_cachedBoards);
            return;
        }
    }

    public void setDataSource(BoardFeed boardfeed)
    {
        _suggestedSource = boardfeed;
        int i;
        if (_suggestedSource == null)
        {
            i = 0;
        } else
        {
            i = _suggestedSource.getCount();
        }
        _suggestedCount = i;
        notifyDataSetChanged();
    }



/*
    static boolean access$002(SuggestedBoardAdapter suggestedboardadapter, boolean flag)
    {
        suggestedboardadapter._failedApi = flag;
        return flag;
    }

*/


/*
    static boolean access$102(SuggestedBoardAdapter suggestedboardadapter, boolean flag)
    {
        suggestedboardadapter._loadingSuggestions = flag;
        return flag;
    }

*/



    private class _cls1
        implements Runnable
    {

        final SuggestedBoardAdapter this$0;

        public void run()
        {
            _failedApi = true;
            _loadingSuggestions = false;
            setDataSource(_cachedBoards);
        }

        _cls1()
        {
            this$0 = SuggestedBoardAdapter.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.api.remote.MyUserApi.SuggestedBoardPickerApiResponse
    {

        final SuggestedBoardAdapter this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            _loadingSuggestions = false;
            setDataSource(_cachedBoards);
        }

        public void onSuccess(Feed feed)
        {
            if (!_failedApi)
            {
                _loadingSuggestions = false;
                setDataSource((BoardFeed)feed);
                removeTimeout();
            }
        }

        _cls2()
        {
            this$0 = SuggestedBoardAdapter.this;
            super();
        }
    }

}
