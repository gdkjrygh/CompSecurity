// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardEditFragment

class this._cls0
    implements com.pinterest.base.ber
{

    final BoardEditFragment this$0;

    public void onEventMainThread(com.pinterest.api.model.ditFragment._cls2 _pcls2)
    {
        BoardEditFragment.access$002(BoardEditFragment.this, _pcls2.tBoard());
        BoardEditFragment.access$100(BoardEditFragment.this);
        if (_pcls2.sDeleted())
        {
            _pcls2 = new com.pinterest.activity.task.model.nit>();
            _pcls2.d(new Navigation(Location.BOARD, BoardEditFragment.access$000(BoardEditFragment.this).getUid()));
            _pcls2.d(new Navigation(Location.BOARD_EDIT, BoardEditFragment.access$000(BoardEditFragment.this).getUid()));
            Events.post(_pcls2);
        }
    }

    ()
    {
        this$0 = BoardEditFragment.this;
        super();
    }
}
