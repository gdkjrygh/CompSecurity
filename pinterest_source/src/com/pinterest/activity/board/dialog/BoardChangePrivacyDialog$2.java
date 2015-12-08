// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardChangePrivacyDialog

class this._cls0 extends ApiResponseHandler
{

    final BoardChangePrivacyDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToast(0x7f0700a2);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        apiresponse = _board;
        boolean flag;
        if (!_board.getSecret().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        apiresponse.setSecret(Boolean.valueOf(flag));
        ModelHelper.setBoard(_board);
        Events.postSticky(new com.pinterest.events.ted());
        Application.showToastShort(0x7f070092);
        if (_board.getSecret().booleanValue())
        {
            apiresponse = EventType.BOARD_SET_PUBLIC;
        } else
        {
            apiresponse = EventType.BOARD_SET_PRIVATE;
        }
        Pinalytics.a(apiresponse, _board.getUid());
    }

    (boolean flag)
    {
        this$0 = BoardChangePrivacyDialog.this;
        super(flag);
    }
}
