// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.activity.board.view.BoardHeaderView;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardFragment

class this._cls0
    implements com.pinterest.base.scriber
{

    final BoardFragment this$0;

    public void onEventMainThread(com.pinterest.api.model.t t)
    {
        Events.removeStickyEvent(t);
        BoardFragment.access$1600(BoardFragment.this, getView());
        if (BoardFragment.access$1700(BoardFragment.this) != null)
        {
            BoardFragment.access$400(BoardFragment.this, BoardFragment.access$1800(BoardFragment.this).getEmptyView().getState());
        }
    }

    public void onEventMainThread(com.pinterest.events.ewPin ewpin)
    {
        if (BoardFragment.access$1900(BoardFragment.this) != null)
        {
            AdapterEmptyView adapteremptyview = BoardFragment.access$2000(BoardFragment.this).getEmptyView();
            ewpin = ewpin.a().getBoard();
            if (ewpin != null && ewpin.getUid().equals(_boardId) && adapteremptyview != null && adapteremptyview.getState() == 1)
            {
                loadData();
                return;
            }
        }
    }

    public void onEventMainThread(com.pinterest.kit.view.State state)
    {
        BoardFragment.access$1202(BoardFragment.this, state);
        BoardFragment boardfragment = BoardFragment.this;
        boolean flag;
        if (state == com.pinterest.kit.view.State.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        BoardFragment.access$1502(boardfragment, flag);
        if (_header != null)
        {
            _header.onMapStateChanged(state);
        }
    }

    ()
    {
        this$0 = BoardFragment.this;
        super();
    }
}
