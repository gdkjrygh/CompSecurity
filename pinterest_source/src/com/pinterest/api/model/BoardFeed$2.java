// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            BoardFeed, Board

class this._cls0
    implements com.pinterest.base.sSubscriber
{

    final BoardFeed this$0;

    public void onEventMainThread(Event event)
    {
        Board board;
        board = event.getBoard();
        break MISSING_BLOCK_LABEL_5;
        if (board != null && _items != null && _items.size() > 0)
        {
            int i = _ids.indexOf(board.getUid());
            if (i >= 0 && i < _items.size())
            {
                boolean flag = false;
                if (event.wasDeleted())
                {
                    _items.remove(i);
                    flag = true;
                } else
                {
                    _items.set(i, board);
                }
                if (_dataListener != null)
                {
                    _dataListener.onChange(i, flag);
                    return;
                }
            }
        }
        return;
    }

    Event()
    {
        this$0 = BoardFeed.this;
        super();
    }
}
