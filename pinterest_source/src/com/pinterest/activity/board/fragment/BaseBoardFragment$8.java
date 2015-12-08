// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class this._cls0
    implements android.view.
{

    final BaseBoardFragment this$0;

    public void onClick(View view)
    {
        view = new Navigation(Location.PLACE_PICKER);
        view.putExtra("com.pinterest.EXTRA_MODE", com.pinterest.activity.place.fragment.Mode.CREATE);
        view.putExtra("com.pinterest.EXTRA_BOARD_ID", _board.getUid());
        Events.post(view);
    }

    Mode()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
