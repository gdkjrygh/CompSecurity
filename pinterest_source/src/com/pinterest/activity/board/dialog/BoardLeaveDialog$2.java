// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.support.v4.app.FragmentActivity;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Application;
import com.pinterest.base.Constants;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardLeaveDialog

class this._cls0 extends ApiResponseHandler
{

    final BoardLeaveDialog this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        Pinalytics.a(EventType.BOARD_REMOVE_COLLABORATOR, MyUser.getUid());
        Application.showToastShort(0x7f070326);
        _board.setCollaborator(Boolean.valueOf(false));
        if (Constants.isTrue(_board.getSecret()))
        {
            if (getActivity() != null)
            {
                getActivity().onBackPressed();
            }
            ModelHelper.deleteBoard(_board.getUid());
            return;
        } else
        {
            ModelHelper.setBoard(_board);
            return;
        }
    }

    ()
    {
        this$0 = BoardLeaveDialog.this;
        super();
    }
}
