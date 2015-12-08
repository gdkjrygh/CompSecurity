// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Constants;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.listview.SolidTitleDivider;

public class BoardPickerListCell extends LinearLayout
{

    private Board _board;
    private View _cellDivider;
    private View _collabIv;
    private WebImageView _iconIv;
    private View _placeIv;
    private View _secretIv;
    private TextView _subTitleTv;
    private SolidTitleDivider _superTitleTv;
    private TextView _titleTv;
    private View _touchContainer;

    public BoardPickerListCell(Context context)
    {
        this(context, null);
    }

    public BoardPickerListCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static BoardPickerListCell get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof BoardPickerListCell))
        {
            return new BoardPickerListCell(viewgroup.getContext());
        } else
        {
            return (BoardPickerListCell)view;
        }
    }

    private void hideAllIcons()
    {
        _placeIv.setVisibility(8);
        _secretIv.setVisibility(8);
        _collabIv.setVisibility(8);
    }

    private void init()
    {
        setOrientation(1);
        setBackgroundResource(0x7f02028b);
        inflate(getContext(), 0x7f03014a, this);
        _cellDivider = findViewById(0x7f0f0068);
        _titleTv = (TextView)findViewById(0x7f0f0077);
        _subTitleTv = (TextView)findViewById(0x7f0f01d1);
        _superTitleTv = (SolidTitleDivider)findViewById(0x7f0f032f);
        _iconIv = (WebImageView)findViewById(0x7f0f0325);
        _touchContainer = findViewById(0x7f0f034a);
        _placeIv = findViewById(0x7f0f031f);
        _secretIv = findViewById(0x7f0f0331);
        _collabIv = findViewById(0x7f0f0320);
    }

    private void updateUi()
    {
        _titleTv.setText(_board.getName());
        Board board;
        if (!ModelHelper.isValid(_board.getImageCoverThumbnail()))
        {
            _iconIv.setImageDrawable(null);
        } else
        {
            _iconIv.loadUrl(_board.getImageCoverThumbnail());
        }
        hideAllIcons();
        board = _board;
        if (!board.isPlaceBoard() && !Constants.isTrue(board.getSecret()))
        {
            Constants.isTrue(board.getCollaborative());
        }
        ViewHelper.setVisibility(_placeIv, board.isPlaceBoard());
        ViewHelper.setVisibility(_secretIv, Constants.isTrue(board.getSecret()));
        ViewHelper.setVisibility(_collabIv, Constants.isTrue(board.getCollaborative()));
        _subTitleTv.setVisibility(8);
        _superTitleTv.setVisibility(8);
    }

    public TextView getSubTitleView()
    {
        return _subTitleTv;
    }

    public SolidTitleDivider getSuperTitleView()
    {
        return _superTitleTv;
    }

    public void hideAllViews()
    {
        _touchContainer.setVisibility(8);
        _cellDivider.setVisibility(8);
    }

    public void restoreDefaultViews()
    {
        _touchContainer.setVisibility(0);
        _cellDivider.setVisibility(0);
    }

    public void setBoard(Board board)
    {
        _board = board;
        if (_board != null)
        {
            updateUi();
        }
    }

    public void setPlusIcon()
    {
        _iconIv.setBackgroundResource(0x7f02028b);
        int i = (int)Resources.dimension(0x7f0a0162);
        _iconIv.setPadding(i, i, i, i);
        _iconIv.setTintedDrawable(Resources.drawable(0x7f020180), 0x7f0e009c);
    }

    public void setTouchResource(int i)
    {
        setBackgroundDrawable(null);
        _touchContainer.setBackgroundResource(i);
    }
}
