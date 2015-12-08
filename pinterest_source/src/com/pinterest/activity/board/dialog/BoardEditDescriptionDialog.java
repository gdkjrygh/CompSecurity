// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.os.Bundle;
import com.pinterest.activity.task.dialog.OneFieldBaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class BoardEditDescriptionDialog extends OneFieldBaseDialog
{

    protected Board _board;
    protected String _boardUid;
    private ApiResponseHandler onBoardDescriptionEdit;

    public BoardEditDescriptionDialog()
    {
        onBoardDescriptionEdit = new _cls1(true);
    }

    public void addBoardUidToArguments(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_BOARD_ID", s);
        setArguments(bundle);
    }

    protected String getDialogTitle()
    {
        return Resources.string(0x7f070210);
    }

    protected String getHint()
    {
        return Resources.string(0x7f07008b);
    }

    protected String getInitialValue()
    {
        if (_board == null)
        {
            return "";
        } else
        {
            return _board.getDescription();
        }
    }

    protected void logSubmitAction()
    {
        Pinalytics.a(ElementType.BOARD_DESCRIPTION, ComponentType.MODAL_DIALOG, _boardUid);
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
        _board.setDescription(s1);
        ModelHelper.updateBoard(_board, null, null, s1, null, null, onBoardDescriptionEdit, null);
    }

    private class _cls1 extends ApiResponseHandler
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

        _cls1(boolean flag)
        {
            this$0 = BoardEditDescriptionDialog.this;
            super(flag);
        }
    }

}
