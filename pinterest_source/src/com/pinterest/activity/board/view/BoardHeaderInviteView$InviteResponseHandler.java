// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Application;

// Referenced classes of package com.pinterest.activity.board.view:
//            BoardHeaderInviteView

public class _toastId extends ApiResponseHandler
{

    private int _toastId;
    final BoardHeaderInviteView this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        if (BoardHeaderInviteView.access$000(BoardHeaderInviteView.this) != null)
        {
            ModelHelper.deleteBoardInvite(BoardHeaderInviteView.access$000(BoardHeaderInviteView.this).getUid());
        }
        if (_toastId != 0)
        {
            Application.showToast(_toastId);
        }
        ModelHelper.deleteBoardInvite(BoardHeaderInviteView.access$000(BoardHeaderInviteView.this).getUid());
        setVisibility(8);
    }

    public (int i)
    {
        this$0 = BoardHeaderInviteView.this;
        super();
        _toastId = i;
    }
}
