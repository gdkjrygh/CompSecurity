// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.widget.TextView;

// Referenced classes of package com.pinterest.ui.grid.board:
//            BoardGridCellTitleView, BoardGridCell, BoardGridCellTitleUserView, BoardGridCellImageView

public class 
{

    public static void inject(butterknife.l l, BoardGridCell boardgridcell, Object obj)
    {
        boardgridcell._title = (BoardGridCellTitleView)l.lTitleView(obj, 0x7f0f004f, "field '_title'");
        boardgridcell._titleUser = (BoardGridCellTitleUserView)l.lTitleUserView(obj, 0x7f0f032c, "field '_titleUser'");
        boardgridcell._cover = (BoardGridCellImageView)l.lImageView(obj, 0x7f0f032d, "field '_cover'");
        boardgridcell._followTv = (TextView)l._followTv(obj, 0x7f0f032e, "field '_followTv'");
        boardgridcell._divider = l._divider(obj, 0x7f0f0068, "field '_divider'");
    }

    public static void reset(BoardGridCell boardgridcell)
    {
        boardgridcell._title = null;
        boardgridcell._titleUser = null;
        boardgridcell._cover = null;
        boardgridcell._followTv = null;
        boardgridcell._divider = null;
    }

    public ()
    {
    }
}
