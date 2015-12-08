// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.view:
//            BoardHeaderInviteView

class viteResponseHandler extends viteResponseHandler
{

    final BoardHeaderInviteView this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Events.post(new com.pinterest.api.model.());
        Pinalytics.a(EventType.BOARD_ACCEPT_INVITE_COLLABORATOR, BoardHeaderInviteView.access$000(BoardHeaderInviteView.this).getUid());
    }

    viteResponseHandler(int i)
    {
        this$0 = BoardHeaderInviteView.this;
        super(BoardHeaderInviteView.this, i);
    }
}
