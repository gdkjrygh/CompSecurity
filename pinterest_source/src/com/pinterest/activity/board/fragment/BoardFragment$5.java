// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.view.View;
import com.pinterest.activity.board.view.PlaceBoardLayout;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardFragment

class this._cls0
    implements android.view.ener
{

    final BoardFragment this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.BOARD_DESCRIPTION, ComponentType.LIST_HEADER);
        view = BoardFragment.access$1300(BoardFragment.this);
        boolean flag;
        if (BoardFragment.access$1200(BoardFragment.this) != com.pinterest.kit.view.State.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.switchMapState(flag);
    }

    ()
    {
        this$0 = BoardFragment.this;
        super();
    }
}
