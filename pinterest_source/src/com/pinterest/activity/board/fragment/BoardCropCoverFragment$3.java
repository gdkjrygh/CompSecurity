// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardCropCoverFragment

class this._cls0 extends ApiResponseHandler
{

    final BoardCropCoverFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Events.postSticky(new com.pinterest.events.dated());
        Application.showToastShort(Resources.string(0x7f070092));
        Pinalytics.a(EventType.BOARD_EDIT, BoardCropCoverFragment.access$000(BoardCropCoverFragment.this));
        BoardCropCoverFragment.access$200(BoardCropCoverFragment.this).dismiss();
    }

    ()
    {
        this$0 = BoardCropCoverFragment.this;
        super();
    }
}
