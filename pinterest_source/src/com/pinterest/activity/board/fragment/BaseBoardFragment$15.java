// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.Feed;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class <init> extends com.pinterest.api.remote.FeedResponse
{

    final BaseBoardFragment this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        BaseBoardFragment.access$2100(BaseBoardFragment.this, (BoardInviteFeed)feed);
    }

    ()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
