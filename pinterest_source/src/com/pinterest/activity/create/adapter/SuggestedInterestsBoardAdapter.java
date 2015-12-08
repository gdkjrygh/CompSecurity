// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.create.view.BoardPickerListCell;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.listview.SolidTitleDivider;

public class SuggestedInterestsBoardAdapter extends BaseAdapter
{

    public static final int TYPE_SUGGESTED_BOARD = 3;
    private int _suggestedCount;
    private BoardFeed _suggestedSource;

    public SuggestedInterestsBoardAdapter()
    {
        _suggestedCount = 0;
    }

    public int getCount()
    {
        return _suggestedCount;
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
        return 3;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = BoardPickerListCell.get(view, viewgroup);
        view.setTouchResource(0x7f02028b);
        view.setBoard(getItem(i));
        view.setPlusIcon();
        viewgroup = view.getSuperTitleView();
        if (i == 0)
        {
            viewgroup.setText(Resources.string(0x7f070577));
            viewgroup.setVisibility(0);
            return view;
        } else
        {
            viewgroup.setVisibility(8);
            return view;
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
}
