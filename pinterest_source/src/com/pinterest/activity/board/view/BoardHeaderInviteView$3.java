// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.app.Activity;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.base.Constants;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.view:
//            BoardHeaderInviteView

class viteResponseHandler extends viteResponseHandler
{

    final BoardHeaderInviteView this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Pinalytics.a(EventType.BOARD_DECLINE_INVITE_COLLABORATOR, BoardHeaderInviteView.access$000(BoardHeaderInviteView.this).getUid());
        if ((getContext() instanceof Activity) && Constants.isTrue(BoardHeaderInviteView.access$000(BoardHeaderInviteView.this).getSecret()))
        {
            ((Activity)getContext()).onBackPressed();
        }
    }

    viteResponseHandler(int i)
    {
        this$0 = BoardHeaderInviteView.this;
        super(BoardHeaderInviteView.this, i);
    }
}
