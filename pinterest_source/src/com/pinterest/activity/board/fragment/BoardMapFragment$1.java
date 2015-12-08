// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.api.model.PinFeed;
import com.twotoasters.clusterkraf.Clusterkraf;
import java.util.List;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardMapFragment

class this._cls0
    implements com.pinterest.base.iber
{

    final BoardMapFragment this$0;

    public void onEventMainThread(com.pinterest.api.model.MapFragment._cls1 _pcls1)
    {
        if (isPinMapReady())
        {
            List list = BoardMapFragment.access$000(BoardMapFragment.this).getItems();
            if (_pcls1.Deleted() && list.contains(_pcls1.Pin()))
            {
                BoardMapFragment.access$000(BoardMapFragment.this).removeItem(_pcls1.Pin());
                list.remove(_pcls1.Pin());
            }
            BoardMapFragment.access$100(BoardMapFragment.this);
        }
    }

    public void onEventMainThread(com.pinterest.kit.view.te te)
    {
        if (isPinMapReady() && te == com.pinterest.kit.view.te.b && BoardMapFragment.access$200(BoardMapFragment.this) != null)
        {
            BoardMapFragment.access$200(BoardMapFragment.this).a();
        }
    }

    ()
    {
        this$0 = BoardMapFragment.this;
        super();
    }
}
