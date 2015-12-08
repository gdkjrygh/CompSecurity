// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import com.pinterest.activity.create.dialog.CreateBoardDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.create.helper:
//            CreateBoardHelper

public class _shouldNavigateToBoardOnCreate extends ApiResponseHandler
{

    public boolean _shouldNavigateToBoardOnCreate;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
        if (apiresponse != null && ModelHelper.isValid(apiresponse.getMessageDetailIfExist()))
        {
            Application.showToast(apiresponse.getMessageDetailIfExist());
            return;
        } else
        {
            Application.showToast(0x7f0701a0);
            return;
        }
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        apiresponse = (PinterestJsonObject)apiresponse.getData();
        Board board = Board.make(apiresponse);
        PinterestJsonObject _tmp = CreateBoardHelper.access$000(apiresponse);
        MyUser.setLastSelectedBoardId(board.getUid());
        Events.postSticky(new com.pinterest.events.s._cls000());
        Events.postSticky(new it>(board.getUid()));
        if (!EducationHelper.c())
        {
            Application.showToast(0x7f0701a3);
        }
        if (_shouldNavigateToBoardOnCreate)
        {
            Events.post(new Navigation(Location.BOARD, board.getUid()));
        }
    }

    public Q(Boolean boolean1)
    {
        _shouldNavigateToBoardOnCreate = boolean1.booleanValue();
    }
}
