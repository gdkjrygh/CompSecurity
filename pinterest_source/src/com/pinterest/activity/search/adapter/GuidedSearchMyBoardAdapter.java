// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.search.ui.GuidedSearchBoardCell;
import com.pinterest.adapter.BoardGridAdapter;
import com.pinterest.api.model.Board;

public class GuidedSearchMyBoardAdapter extends BoardGridAdapter
{

    private int _brickPadding;
    private int _columnCount;
    private int _columnWidth;
    private Context _context;
    private LayoutInflater _li;
    private int _outerPadding;

    public GuidedSearchMyBoardAdapter(Context context)
    {
        _context = context;
        _li = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        boolean flag1 = true;
        if (view instanceof GuidedSearchBoardCell)
        {
            view = (GuidedSearchBoardCell)view;
        } else
        {
            view = (GuidedSearchBoardCell)_li.inflate(0x7f030156, viewgroup, false);
        }
        if (_columnWidth <= 0)
        {
            updateColumnWidth(viewgroup.getMeasuredWidth(), _columnCount);
        }
        view.setShowFollowButton(false);
        view.setColumnWidth(_columnWidth);
        view.setBoard((Board)getItem(i));
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setFirstFilter(flag);
        if (i == getCount() - 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        view.setLastFilter(flag);
        view.setListener(boardCellListener);
        view.updateUI();
        return view;
    }

    public void setBrickPadding(int i)
    {
        _brickPadding = i;
    }

    public void setColumnCount(int i)
    {
        _columnCount = i;
    }

    public void setOuterPadding(int i)
    {
        _outerPadding = i;
    }

    public void updateColumnWidth(int i, int j)
    {
        if (i == 0)
        {
            return;
        } else
        {
            _columnCount = Math.max(1, j);
            _columnWidth = (i - _brickPadding - _outerPadding * 2) / _columnCount - _brickPadding;
            return;
        }
    }
}
