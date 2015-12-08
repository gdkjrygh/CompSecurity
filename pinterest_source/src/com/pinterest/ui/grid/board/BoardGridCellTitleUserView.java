// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.activity.dynamicgrid.IconTwoLineView;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;

public class BoardGridCellTitleUserView extends IconTwoLineView
{

    public BoardGridCellTitleUserView(Context context)
    {
        this(context, null);
    }

    public BoardGridCellTitleUserView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void init()
    {
        super.init();
        setBackgroundResource(0x7f0e00bf);
    }

    public void setBoard(Board board)
    {
        setBoard(board, true);
    }

    public void setBoard(Board board, boolean flag)
    {
        int i = 0;
        if (board != null)
        {
            setTitle(board.getName());
            if (flag)
            {
                board = board.getUser();
                if (board != null)
                {
                    ViewHelper.setVisibility(_icon, true);
                    setImageUrl(board.getImageMediumUrl());
                    setSubtitle(board.getFullName());
                    return;
                }
            } else
            {
                ViewHelper.setVisibility(_icon, false);
                if (board.getPinCount().intValue() >= 0)
                {
                    i = board.getPinCount().intValue();
                }
                setSubtitle(Resources.stringPlural(0x7f090016, Integer.valueOf(i)));
                return;
            }
        }
    }
}
