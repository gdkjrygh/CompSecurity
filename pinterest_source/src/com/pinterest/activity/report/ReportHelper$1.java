// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.activity.task.dialog.LoadingDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.event.DialogHideEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;

final class val.board extends ApiResponseHandler
{

    final Board val$board;

    public final void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if (apiresponse != null)
        {
            Application.showToast(apiresponse.getMessageDisplay());
            return;
        } else
        {
            Application.showToast(Resources.string(0x7f0705c0));
            return;
        }
    }

    public final void onFinish()
    {
        super.onFinish();
        Events.post(new DialogHideEvent(true));
    }

    public final void onStart()
    {
        Events.post(new DialogEvent(new LoadingDialog(Resources.string(0x7f0705b8))));
    }

    public final void onSuccess(ApiResponse apiresponse)
    {
        Pinalytics.a(EventType.BOARD_UNFOLLOW, val$board.getUid());
        Application.showToastShort(Resources.string(0x7f0705b9));
        val$board.setFollowing(Boolean.valueOf(false));
        ModelHelper.setBoard(val$board);
        Events.post(new com.pinterest.api.model.nt(val$board));
    }

    log()
    {
        val$board = board1;
        super();
    }
}
