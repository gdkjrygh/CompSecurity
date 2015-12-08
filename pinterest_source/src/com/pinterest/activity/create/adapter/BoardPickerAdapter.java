// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.create.fragment.view.CreateBoardListCell;
import com.pinterest.activity.create.view.BoardPickerListCell;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.experiment.Experiments;
import com.pinterest.ui.listview.SolidTitleDivider;

// Referenced classes of package com.pinterest.activity.create.adapter:
//            SuggestedBoardAdapter, SuggestedInterestsBoardAdapter

public class BoardPickerAdapter extends BaseAdapter
{

    public static final int TYPE_BOARD = 0;
    public static final int TYPE_CREATE = 1;
    public static final int TYPE_LOADING = 2;
    private String _apiTag;
    private int _boardCount;
    private BoardFeed _dataSource;
    protected boolean _fastRepinMode;
    protected boolean _publicOnly;
    private SuggestedBoardAdapter _suggestedBoardAdapter;
    private DataSetObserver _suggestedBoardAdapterObserver;
    private SuggestedInterestsBoardAdapter _suggestedInterestsBoardAdapter;

    public BoardPickerAdapter()
    {
        _fastRepinMode = false;
        _publicOnly = false;
        _boardCount = 0;
        _suggestedBoardAdapterObserver = new _cls1();
        _suggestedBoardAdapter = new SuggestedBoardAdapter();
        _suggestedBoardAdapter.setApiTag(_apiTag);
        _suggestedBoardAdapter.registerDataSetObserver(_suggestedBoardAdapterObserver);
        _suggestedInterestsBoardAdapter = new SuggestedInterestsBoardAdapter();
    }

    private int getAllBoardIndex(int i)
    {
        return i - (_suggestedBoardAdapter.getCount() + _suggestedInterestsBoardAdapter.getCount() + 1);
    }

    private boolean isCreateCell(int i)
    {
        return i == _suggestedBoardAdapter.getCount();
    }

    private boolean isLoadingCell(int i)
    {
        return _suggestedBoardAdapter.getItemViewType(i) == 2;
    }

    private boolean isSuggestedCell(int i)
    {
        return i < _suggestedBoardAdapter.getCount();
    }

    private boolean isSuggestedInterestBoardCell(int i)
    {
        return i > _suggestedBoardAdapter.getCount() && i <= _suggestedBoardAdapter.getCount() + _suggestedInterestsBoardAdapter.getCount() && Experiments.B();
    }

    public int getCount()
    {
        return _suggestedBoardAdapter.getCount() + _suggestedInterestsBoardAdapter.getCount() + _boardCount + 1;
    }

    public Board getItem(int i)
    {
        if (isLoadingCell(i) || isCreateCell(i))
        {
            return null;
        }
        if (i < _suggestedBoardAdapter.getSuggestedCount())
        {
            return _suggestedBoardAdapter.getItem(i);
        }
        if (isSuggestedInterestBoardCell(i))
        {
            return _suggestedInterestsBoardAdapter.getItem(i - (_suggestedBoardAdapter.getCount() + 1));
        } else
        {
            i = getAllBoardIndex(i);
            return (Board)_dataSource.get(i);
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

    public int getItemViewType(int i)
    {
        if (isSuggestedCell(i))
        {
            return _suggestedBoardAdapter.getItemViewType(i);
        }
        if (isSuggestedInterestBoardCell(i))
        {
            return _suggestedInterestsBoardAdapter.getItemViewType(i);
        }
        return i != _suggestedBoardAdapter.getCount() ? 0 : 1;
    }

    public boolean getPublicOnly()
    {
        return _publicOnly;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (isSuggestedCell(i))
        {
            return _suggestedBoardAdapter.getView(i, view, viewgroup);
        }
        if (isSuggestedInterestBoardCell(i))
        {
            return _suggestedInterestsBoardAdapter.getView(i - (_suggestedBoardAdapter.getCount() + 1), view, viewgroup);
        }
        if (isCreateCell(i))
        {
            return CreateBoardListCell.get(view, viewgroup);
        }
        view = BoardPickerListCell.get(view, viewgroup);
        int j;
        if (!_fastRepinMode)
        {
            j = 0x7f020283;
        } else
        {
            j = 0x7f02028b;
        }
        view.setTouchResource(j);
        i = getAllBoardIndex(i);
        viewgroup = (Board)_dataSource.get(i);
        view.setBoard(viewgroup);
        if (_publicOnly)
        {
            if (viewgroup != null && Constants.isTrue(viewgroup.getSecret()))
            {
                view.hideAllViews();
            } else
            {
                view.restoreDefaultViews();
            }
        }
        viewgroup = view.getSuperTitleView();
        if (i == 0)
        {
            viewgroup.setText(0x7f070197);
            viewgroup.setVisibility(0);
            return view;
        } else
        {
            viewgroup.setVisibility(8);
            return view;
        }
    }

    public int getViewTypeCount()
    {
        return 4;
    }

    public boolean isFastRepinMode()
    {
        return _fastRepinMode;
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setCachedSuggestions(BoardFeed boardfeed, Pin pin, boolean flag)
    {
        _suggestedBoardAdapter.setCachedBoards(boardfeed, pin, flag);
    }

    public void setDataSource(BoardFeed boardfeed)
    {
        _dataSource = boardfeed;
        int i;
        if (_dataSource == null)
        {
            i = 0;
        } else
        {
            i = _dataSource.getCount();
        }
        _boardCount = i;
        notifyDataSetChanged();
    }

    public void setFastRepinMode(boolean flag)
    {
        _fastRepinMode = flag;
    }

    public void setPublicOnly(boolean flag)
    {
        _publicOnly = flag;
    }

    public void setSuggestedBoardSuggestions(BoardFeed boardfeed)
    {
        _suggestedInterestsBoardAdapter.setDataSource(boardfeed);
        notifyDataSetChanged();
    }

    private class _cls1 extends DataSetObserver
    {

        final BoardPickerAdapter this$0;

        public void onChanged()
        {
            notifyDataSetChanged();
        }

        public void onInvalidated()
        {
            notifyDataSetChanged();
        }

        _cls1()
        {
            this$0 = BoardPickerAdapter.this;
            super();
        }
    }

}
