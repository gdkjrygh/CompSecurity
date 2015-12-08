// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import com.pinterest.api.model.Board;

// Referenced classes of package com.pinterest.ui.menu:
//            BoardContextMenu

class owApiResponse extends com.pinterest.api.remote.piResponse
{

    final is._cls0 this$1;

    public void onFailure()
    {
        BoardContextMenu.access$000(_fld0).setFollowing(BoardContextMenu.access$000(_fld0).getFollowing());
    }

    public void onSuccess(Board board)
    {
        BoardContextMenu.access$002(_fld0, board);
    }

    owApiResponse()
    {
        this$1 = this._cls1.this;
        super();
    }
}
