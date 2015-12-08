// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.FollowUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.ui.menu:
//            BoardContextMenu

class val.isFollowing
    implements android.view.r
{

    final BoardContextMenu this$0;
    final boolean val$isFollowing;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.PIN_BOARD_FOLLOW, ComponentType.NAVIGATION, BoardContextMenu.access$000(BoardContextMenu.this).getUid());
        BoardContextMenu.access$000(BoardContextMenu.this).setFollowing(BoardContextMenu.access$000(BoardContextMenu.this).getFollowing());
        view = FollowUtils.getInstance();
        String s = String.valueOf(BoardContextMenu.access$000(BoardContextMenu.this).getUid());
        class _cls1 extends com.pinterest.api.remote.BoardApi.BoardFollowApiResponse
        {

            final BoardContextMenu._cls3 this$1;

            public void onFailure()
            {
                BoardContextMenu.access$000(this$0).setFollowing(BoardContextMenu.access$000(this$0).getFollowing());
            }

            public void onSuccess(Board board)
            {
                BoardContextMenu.access$002(this$0, board);
            }

            _cls1()
            {
                this$1 = BoardContextMenu._cls3.this;
                super();
            }
        }

        boolean flag;
        if (!val$isFollowing)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.followBoard(s, flag, new _cls1(), null);
    }

    _cls1()
    {
        this$0 = final_boardcontextmenu;
        val$isFollowing = Z.this;
        super();
    }
}
