// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.user.view.UserToast;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class _item extends ApiResponseHandler
{

    private TypeAheadItem _item;
    final BoardCollaboratorInviteAdapter this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast(apiresponse.getMessage());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        Pinalytics.a(EventType.BOARD_INVITE_COLLABORATOR, _item.getUid());
        Events.post(new ToastEvent(new UserToast(Resources.string(0x7f070098), _item.getTitle(), _item.getImageUri())));
        BoardCollaboratorInviteAdapter.access$1300(BoardCollaboratorInviteAdapter.this);
    }

    public (TypeAheadItem typeaheaditem)
    {
        this$0 = BoardCollaboratorInviteAdapter.this;
        super();
        _item = typeaheaditem;
    }
}
