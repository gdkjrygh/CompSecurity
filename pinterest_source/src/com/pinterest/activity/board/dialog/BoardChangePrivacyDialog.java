// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.os.Bundle;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardBaseDialog

public class BoardChangePrivacyDialog extends BoardBaseDialog
{

    private ApiResponseHandler onBoardPrivacyChange;

    public BoardChangePrivacyDialog()
    {
        onBoardPrivacyChange = new _cls2(true);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        int i;
        int j;
        int k;
        if (!_board.getSecret().booleanValue())
        {
            k = 0x7f070362;
            j = 0x7f070361;
            i = 0x7f070364;
        } else
        {
            k = 0x7f070360;
            j = 0x7f07035f;
            i = 0x7f070363;
        }
        setTitle(k);
        setMessage(j);
        setPositiveButton(i, new _cls1());
        setNegativeButton(0x7f0700af, null);
    }


    private class _cls2 extends ApiResponseHandler
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
            Events.postSticky(new com.pinterest.events.FeedEvents.MyBoardsInvalidated());
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

        _cls2(boolean flag)
        {
            this$0 = BoardChangePrivacyDialog.this;
            super(flag);
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BoardChangePrivacyDialog this$0;

        public void onClick(View view)
        {
            boolean flag;
            if (_board.getSecret().booleanValue())
            {
                view = ElementType.BOARD_SECRET;
            } else
            {
                view = ElementType.PIN_BOARD;
            }
            Pinalytics.a(view, ComponentType.MODAL_DIALOG, _boardUid);
            view = _board;
            if (!_board.getSecret().booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ModelHelper.updateBoard(view, null, null, null, Boolean.valueOf(flag), null, onBoardPrivacyChange, null);
            dismiss();
        }

        _cls1()
        {
            this$0 = BoardChangePrivacyDialog.this;
            super();
        }
    }

}
