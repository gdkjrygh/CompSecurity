// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.User;
import com.pinterest.base.Colors;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.pin.PinBackgroundDrawable;
import com.pinterest.ui.grid.pin.PinCellDrawable;
import com.pinterest.ui.grid.pin.PinDividerDrawable;
import com.pinterest.ui.grid.pin.PinIconTextDrawable;
import com.pinterest.ui.grid.pin.PinTextDrawable;

public class BoardInfo extends View
{

    protected static final int PADDING_ITEM = (int)Resources.dimension(0x7f0a0191);
    protected static final int PADDING_SIDE = (int)Resources.dimension(0x7f0a0195);
    private PinBackgroundDrawable _backgroundDrawable;
    private Board _board;
    private Rect _cellPadding;
    private PinDividerDrawable _dividerDrawable;
    private PinTextDrawable _infoDrawable;
    private int _measuredHeight;
    private int _measuredWidth;
    private NinePatchDrawable _pinMask;
    private boolean _renderCompactUser;
    private boolean _renderDescription;
    private PinIconTextDrawable _userDrawable;

    public BoardInfo(Context context)
    {
        this(context, null);
    }

    public BoardInfo(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BoardInfo(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _renderCompactUser = true;
        _renderDescription = true;
        _cellPadding = new Rect();
        _measuredHeight = 0;
        _measuredWidth = 0;
        _backgroundDrawable = new PinBackgroundDrawable();
        _infoDrawable = new PinTextDrawable();
        _userDrawable = new PinIconTextDrawable(this);
        _dividerDrawable = new PinDividerDrawable();
        init();
    }

    private void drawBackground(Canvas canvas)
    {
        _backgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        _backgroundDrawable.draw(canvas);
    }

    private void drawInfo(Canvas canvas)
    {
        if (_renderDescription)
        {
            _infoDrawable.draw(canvas);
        }
    }

    private void drawOverlay(Canvas canvas)
    {
        _pinMask.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        _pinMask.draw(canvas);
    }

    private void drawUser(Canvas canvas)
    {
        if (!_renderCompactUser)
        {
            return;
        } else
        {
            _dividerDrawable.setY(_userDrawable.getY() - PinCellDrawable.DIVIDER_HEIGHT);
            _dividerDrawable.draw(canvas);
            _userDrawable.draw(canvas);
            return;
        }
    }

    private void init()
    {
        _userDrawable.setOval(true);
        _pinMask = (NinePatchDrawable)Resources.drawable(0x7f0200be);
        _pinMask.getPadding(_cellPadding);
    }

    protected void onDraw(Canvas canvas)
    {
        if (_board != null)
        {
            drawBackground(canvas);
            drawInfo(canvas);
            drawUser(canvas);
            drawOverlay(canvas);
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        _measuredWidth = android.view.View.MeasureSpec.getSize(i);
        if (_measuredWidth < 0)
        {
            _measuredWidth = 100;
        }
        if (_board != null)
        {
            _dividerDrawable.setWidth(_measuredWidth);
            _dividerDrawable.setHeight(PinCellDrawable.DIVIDER_HEIGHT);
            _measuredHeight = 0;
            if (_board.getDescription().isEmpty())
            {
                _renderDescription = false;
            }
            if (_renderDescription)
            {
                _infoDrawable.setY(_measuredHeight);
                _infoDrawable.setWidth(_measuredWidth);
                _infoDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _infoDrawable.setText(_board.getDescription());
                _infoDrawable.setColor(Colors.TEXT_DARK);
                _infoDrawable.setTextSize(Resources.dimension(0x7f0a01d9));
                _infoDrawable.centerText();
                _infoDrawable.measure();
                _measuredHeight = _measuredHeight + _infoDrawable.getHeight();
            }
            User user = _board.getUser();
            if (_renderCompactUser)
            {
                if (user != null)
                {
                    _userDrawable.setTitle(user.getFullName());
                }
                _userDrawable.setY(_measuredHeight);
                _userDrawable.setWidth(_measuredWidth);
                _userDrawable.setPadding(PADDING_SIDE, PADDING_ITEM, PADDING_SIDE, PADDING_ITEM);
                _userDrawable.setTitleTextSize(Resources.dimension(0x7f0a01e2));
                _userDrawable.centerTextVertically();
                _userDrawable.measure();
                _measuredHeight = _measuredHeight + _userDrawable.getHeight();
            }
            _measuredHeight = _measuredHeight + _cellPadding.height();
        }
        setMeasuredDimension(_measuredWidth, _measuredHeight);
    }

    public void prepareForReuse()
    {
        _infoDrawable.prepareForReuse();
        _userDrawable.prepareForReuse();
    }

    public void setBoard(Board board, boolean flag)
    {
        if (board == null)
        {
            return;
        }
        _board = board;
        prepareForReuse();
        if (!flag)
        {
            board = _board.getUser();
            if (_renderCompactUser && board != null)
            {
                _userDrawable.loadImage(board.getImageMediumUrl());
                _userDrawable.setOval(true);
            }
        }
        requestLayout();
    }

}
