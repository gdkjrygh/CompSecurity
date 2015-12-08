// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.os.Bundle;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.dialog.OneFieldBaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class BoardEditNameDialog extends OneFieldBaseDialog
{

    protected Board _board;
    protected String _boardUid;
    private ApiResponseHandler onBoardNameEdit;

    public BoardEditNameDialog()
    {
        onBoardNameEdit = new _cls1(true);
    }

    private void showErrorDialog(ApiResponse apiresponse)
    {
        BaseDialog basedialog = new BaseDialog();
        basedialog.setTitle(0x7f0700d9);
        apiresponse = apiresponse.getMessageDetailIfExist();
        if (apiresponse != null)
        {
            basedialog.setMessage(apiresponse);
        }
        basedialog.setPositiveButton(0x7f0705a1, new _cls2());
        basedialog.setNegativeButton(0x7f0700af, null);
        Events.post(new DialogEvent(basedialog));
    }

    public void addBoardUidToArguments(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_BOARD_ID", s);
        setArguments(bundle);
    }

    protected String getDialogTitle()
    {
        return Resources.string(0x7f070215);
    }

    protected String getHint()
    {
        return Resources.string(0x7f0701a1);
    }

    protected String getInitialValue()
    {
        if (_board == null)
        {
            return "";
        } else
        {
            return _board.getName();
        }
    }

    protected String getInvalidToast()
    {
        return Resources.string(0x7f07037c);
    }

    protected boolean isValid(String s)
    {
        return Board.isNameValid(s);
    }

    protected void logSubmitAction()
    {
        Pinalytics.a(ElementType.BOARD_NAME, ComponentType.MODAL_DIALOG, _boardUid);
    }

    public void onActivityCreated(Bundle bundle)
    {
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            _boardUid = bundle1.getString("com.pinterest.EXTRA_BOARD_ID");
            _board = ModelHelper.getBoard(_boardUid);
        }
        super.onActivityCreated(bundle);
    }

    protected void submit(String s, String s1)
    {
        BoardApi.a(_board.getUid(), s1, null, null, null, null, null, onBoardNameEdit, null);
    }


    private class _cls1 extends ApiResponseHandler
    {

        final BoardEditNameDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            showErrorDialog(apiresponse);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            if (_board != null)
            {
                if ((apiresponse = ((ApiResponse) (apiresponse.getData()))) instanceof PinterestJsonObject)
                {
                    apiresponse = ((PinterestJsonObject)apiresponse).a("name", "");
                    if (ModelHelper.isValid(apiresponse))
                    {
                        _board.setName(apiresponse);
                        ModelHelper.setBoard(_board);
                    }
                    Application.showToastShort(Resources.string(0x7f070092));
                    Pinalytics.a(EventType.BOARD_EDIT, _board.getUid());
                    return;
                }
            }
        }

        _cls1(boolean flag)
        {
            this$0 = BoardEditNameDialog.this;
            super(flag);
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final BoardEditNameDialog this$0;

        public void onClick(View view)
        {
            Events.post(new DialogEvent(BoardEditNameDialog.this));
        }

        _cls2()
        {
            this$0 = BoardEditNameDialog.this;
            super();
        }
    }

}
