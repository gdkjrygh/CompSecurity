// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardEditCategoryDialog

class this._cls0 extends ApiResponseHandler
{

    final BoardEditCategoryDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Application.showToastShort(0x7f070080);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Application.showToastShort(Resources.string(0x7f070092));
        Pinalytics.a(EventType.BOARD_EDIT, _board.getUid());
    }

    (boolean flag)
    {
        this$0 = BoardEditCategoryDialog.this;
        super(flag);
    }
}
