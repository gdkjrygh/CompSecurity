// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.app.Activity;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Application;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.EventType;

class _board extends ApiResponseHandler
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
        Events.post(new com.pinterest.api.model.seHandler._board());
    }

    public (Activity activity, Board board)
    {
        _activity = activity;
        _board = board;
    }
}
