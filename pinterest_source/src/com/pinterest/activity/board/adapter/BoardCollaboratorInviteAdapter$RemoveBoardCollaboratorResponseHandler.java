// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class _uid extends BaseApiResponseHandler
{

    private String _uid;
    final BoardCollaboratorInviteAdapter this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast(apiresponse.getMessage());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Pinalytics.a(EventType.BOARD_REMOVE_COLLABORATOR, _uid);
        BoardCollaboratorInviteAdapter.access$1300(BoardCollaboratorInviteAdapter.this);
    }

    public (String s)
    {
        this$0 = BoardCollaboratorInviteAdapter.this;
        super();
        _uid = s;
    }
}
