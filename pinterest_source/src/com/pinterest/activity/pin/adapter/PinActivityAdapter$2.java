// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.view.View;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.pin.adapter:
//            PinActivityAdapter

class val.followBoardButton
    implements android.view..PinActivityAdapter._cls2
{

    final PinActivityAdapter this$0;
    final FollowBoardButton val$followBoardButton;

    public void onClick(View view)
    {
        val$followBoardButton.onClick(view);
        Pinalytics.a(ElementType.PIN_BOARD_FOLLOW);
    }

    ()
    {
        this$0 = final_pinactivityadapter;
        val$followBoardButton = FollowBoardButton.this;
        super();
    }
}
