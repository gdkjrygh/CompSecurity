// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.FollowUtils;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class FollowSimilarBoardToast extends BaseToast
{

    private static final int TOAST_DURATION = 4000;
    private Board _board;

    public FollowSimilarBoardToast(Board board)
    {
        _board = board;
    }

    public View getView(ToastContainer toastcontainer)
    {
        setLayoutGravity(81);
        setImageUrl(_board.getImagePreviewUrl());
        setImageOval(false);
        setMessage(0x7f0702b4);
        setSecondaryMessage(_board.getName());
        setButtonText(Resources.string(0x7f0705b2));
        setDuration(4000);
        return super.getView(toastcontainer);
    }

    public void onToastCancelled(Context context)
    {
        super.onToastCancelled(context);
        Pinalytics.a(ElementType.UNDO_BUTTON, ComponentType.TOAST);
        FollowUtils.getInstance().followBoard(String.valueOf(_board.getUid()), false, new _cls1(), null);
    }



/*
    static Board access$002(FollowSimilarBoardToast followsimilarboardtoast, Board board)
    {
        followsimilarboardtoast._board = board;
        return board;
    }

*/

    private class _cls1 extends com.pinterest.api.remote.BoardApi.BoardFollowApiResponse
    {

        final FollowSimilarBoardToast this$0;

        public void onFailure()
        {
            Board board = _board;
            boolean flag;
            if (!Constants.isTrue(_board.getFollowing()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            board.setFollowing(Boolean.valueOf(flag));
        }

        public void onSuccess(Board board)
        {
            _board = board;
        }

        _cls1()
        {
            this$0 = FollowSimilarBoardToast.this;
            super();
        }
    }

}
