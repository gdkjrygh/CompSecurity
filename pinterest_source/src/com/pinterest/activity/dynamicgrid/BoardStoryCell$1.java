// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import com.pinterest.api.model.Board;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            BoardStoryCell

class this._cls0
    implements com.pinterest.base.criber
{

    final BoardStoryCell this$0;

    public void onEventMainThread(com.pinterest.api.model. )
    {
        if (_board != null && _board.equals(.getBoard()))
        {
            _board.setFollowing(.getBoard().getFollowing());
            updateFollowing();
        }
    }

    _cls9()
    {
        this$0 = BoardStoryCell.this;
        super();
    }
}
