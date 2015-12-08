// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardEditDescriptionDialog

class this._cls0 extends ApiResponseHandler
{

    final BoardEditDescriptionDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToastShort(0x7f07008a);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Pinalytics.a(EventType.BOARD_EDIT, _boardUid);
        Application.showToastShort(0x7f070092);
    }

    (boolean flag)
    {
        this$0 = BoardEditDescriptionDialog.this;
        super(flag);
    }
}
