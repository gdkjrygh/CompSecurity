// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import java.util.List;

// Referenced classes of package com.pinterest.adapter:
//            BoardGridAdapter

class this._cls0
    implements com.pinterest.ui.grid.board.ner
{

    final BoardGridAdapter this$0;

    public void onBoardChanged(Board board)
    {
        if (board != null && _dataSource != null && _dataSource.getItems() != null)
        {
            int i = _dataSource.getItems().indexOf(board);
            if (i >= 0)
            {
                _dataSource.setItem(i, board);
            }
        }
    }

    .Listener()
    {
        this$0 = BoardGridAdapter.this;
        super();
    }
}
