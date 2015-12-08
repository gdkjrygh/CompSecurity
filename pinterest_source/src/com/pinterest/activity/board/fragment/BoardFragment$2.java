// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.activity.FragmentHelper;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.model.PinFeed;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardFragment, BoardMapFragment

class this._cls0
    implements Runnable
{

    final BoardFragment this$0;

    public void run()
    {
        if (BoardFragment.this == null || !isActive())
        {
            return;
        }
        BoardFragment.access$102(BoardFragment.this, new BoardMapFragment());
        BoardFragment.access$100(BoardFragment.this).setMapListener(BoardFragment.access$700(BoardFragment.this));
        if (BoardFragment.access$800(BoardFragment.this) != null && !((PinGridAdapter)BoardFragment.access$900(BoardFragment.this)).isEmpty())
        {
            BoardFragment.access$100(BoardFragment.this).setPinFeed((PinFeed)((PinGridAdapter)BoardFragment.access$1000(BoardFragment.this)).getDataSource());
        }
        FragmentHelper.replaceFragment(BoardFragment.this, 0x7f0f01e0, BoardFragment.access$100(BoardFragment.this), false);
    }

    ()
    {
        this$0 = BoardFragment.this;
        super();
    }
}
