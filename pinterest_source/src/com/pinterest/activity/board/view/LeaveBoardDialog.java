// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.app.Activity;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;

public class LeaveBoardDialog
{

    public LeaveBoardDialog()
    {
    }

    public static void show(final Activity activity, final Board board)
    {
        final BaseDialog dialog = new BaseDialog();
        dialog.setTitle(0x7f070322);
        dialog.setMessage(0x7f070323);
        dialog.setPositiveButton(0x7f070321, new _cls1());
        dialog.setNegativeButton(0x7f0700af, null);
        Events.post(new DialogEvent(dialog));
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final Activity val$activity;
        final Board val$board;
        final BaseDialog val$dialog;

        public final void onClick(View view)
        {
            Pinalytics.a(ElementType.BOARD_LEAVE_BUTTON, ComponentType.MODAL_DIALOG);
            view = String.valueOf(MyUser.getUid());
            BoardApi.a(String.valueOf(board.getUid()), view, false, new LeaveBoardResponseHandler(activity, board), null);
            dialog.dismiss();
        }

        _cls1()
        {
            board = board1;
            activity = activity1;
            dialog = basedialog;
            super();
        }

        private class LeaveBoardResponseHandler extends ApiResponseHandler
        {

            private Activity _activity;
            private Board _board;

            public void onSuccess(ApiResponse apiresponse)
            {
label0:
                {
                    super.onSuccess(apiresponse);
                    Pinalytics.a(EventType.BOARD_REMOVE_COLLABORATOR, MyUser.getUid());
                    if (_board != null)
                    {
                        _board.setCollaborator(Boolean.valueOf(false));
                        Application.showToastShort(Resources.string(0x7f070326));
                        if (!Constants.isTrue(_board.getSecret()))
                        {
                            break label0;
                        }
                        if (_activity != null)
                        {
                            _activity.onBackPressed();
                        }
                        ModelHelper.deleteBoard(_board.getUid());
                    }
                    return;
                }
                Events.post(new com.pinterest.api.model.Board.RequestUpdateEvent());
            }

            public LeaveBoardResponseHandler(Activity activity1, Board board1)
            {
                _activity = activity1;
                _board = board1;
            }
        }

    }

}
