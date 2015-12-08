// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.api.model.Board;
import com.pinterest.base.Constants;
import com.pinterest.ui.ViewHelper;

public class BoardGridCellTitleView extends LinearLayout
{

    private boolean _alignLeft;
    View _collabIv;
    View _placeIv;
    View _secretIv;
    TextView _titleTv;

    public BoardGridCellTitleView(Context context)
    {
        this(context, null);
    }

    public BoardGridCellTitleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void hideAllIcons()
    {
        _placeIv.setVisibility(8);
        _secretIv.setVisibility(8);
        _collabIv.setVisibility(8);
    }

    private void init()
    {
        inflate(getContext(), 0x7f030140, this);
        ButterKnife.a(this);
    }

    public void setBoard(Board board)
    {
        if (board == null)
        {
            return;
        }
        _titleTv.setText(board.getName());
        hideAllIcons();
        TextView textview;
        int i;
        byte byte0;
        if (board.isPlaceBoard() || Constants.isTrue(board.getSecret()) || Constants.isTrue(board.getCollaborative()))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (_alignLeft || i != 0)
        {
            byte0 = 19;
        } else
        {
            byte0 = 17;
        }
        setGravity(byte0);
        textview = _titleTv;
        if (i != 0)
        {
            i = Constants.MARGIN;
        } else
        {
            i = 0;
        }
        textview.setPadding(0, 0, i, 0);
        ViewHelper.setVisibility(_placeIv, board.isPlaceBoard());
        ViewHelper.setVisibility(_secretIv, Constants.isTrue(board.getSecret()));
        ViewHelper.setVisibility(_collabIv, Constants.isTrue(board.getCollaborative()));
    }

    public void setLeftAlign(boolean flag)
    {
        _alignLeft = flag;
    }
}
