// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.model.PinFeed;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardFragment, BoardMapFragment

class this._cls0
    implements com.pinterest.ui.grid.w.OnStateSetListener
{

    final BoardFragment this$0;

    public void onSet(com.pinterest.ui.grid.w.State state)
    {
        if (state == com.pinterest.ui.grid.w.State.LOADED && BoardFragment.access$000(BoardFragment.this) != null && BoardFragment.access$100(BoardFragment.this) != null && BoardFragment.access$200(BoardFragment.this) != null)
        {
            BoardFragment.access$400(BoardFragment.this, BoardFragment.access$300(BoardFragment.this).getEmptyView().getState());
            BoardFragment.access$100(BoardFragment.this).setPinFeed((PinFeed)((PinGridAdapter)BoardFragment.access$500(BoardFragment.this)).getDataSource());
            BoardFragment.access$600(BoardFragment.this);
        }
    }

    ()
    {
        this$0 = BoardFragment.this;
        super();
    }
}
