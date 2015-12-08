// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.os.Bundle;
import com.pinterest.api.ApiResponseHandler;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardBaseDialog

public class BoardLeaveDialog extends BoardBaseDialog
{

    private ApiResponseHandler onLeaveBoard;

    public BoardLeaveDialog()
    {
        onLeaveBoard = new _cls2();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setTitle(0x7f070322);
        setMessage(0x7f070323);
        setPositiveButton(0x7f070321, new _cls1());
        setNegativeButton(0x7f0700af, null);
    }


    private class _cls2 extends ApiResponseHandler
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

        _cls2()
        {
            this$0 = BoardLeaveDialog.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BoardLeaveDialog this$0;

        public void onClick(View view)
        {
            view = String.valueOf(MyUser.getUid());
            BoardApi.a(String.valueOf(_boardUid), view, false, onLeaveBoard, null);
            dismiss();
        }

        _cls1()
        {
            this$0 = BoardLeaveDialog.this;
            super();
        }
    }

}
