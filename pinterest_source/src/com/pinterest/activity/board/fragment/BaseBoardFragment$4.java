// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class this._cls0
    implements android.view.
{

    final BaseBoardFragment this$0;

    public void onClick(View view)
    {
        Events.post(new Navigation(Location.BOARD_EDIT, _board));
    }

    ()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
