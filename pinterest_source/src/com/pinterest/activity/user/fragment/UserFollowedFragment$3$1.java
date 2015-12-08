// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.activity.user.view.UserFollowedBoardsView;
import com.pinterest.adapter.BoardGridAdapter;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedFragment

class this._cls1 extends com.pinterest.api.remote.onse
{

    final pter this$1;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        if (getView() == null)
        {
            return;
        }
        BoardGridAdapter boardgridadapter;
        boolean flag;
        if (feed.getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(_seeAllBoardsBt, flag);
        feed = (BoardFeed)feed;
        boardgridadapter = new BoardGridAdapter();
        boardgridadapter.setDataSource(feed);
        _followedBoards.setAdapter(boardgridadapter);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
