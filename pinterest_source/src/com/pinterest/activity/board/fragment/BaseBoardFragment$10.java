// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class this._cls0 extends FeedApiResponseHandler
{

    final BaseBoardFragment this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        BaseBoardFragment.access$1202(BaseBoardFragment.this, feed);
        if (BaseBoardFragment.access$1400(BaseBoardFragment.this))
        {
            BaseBoardFragment.access$1300(BaseBoardFragment.this);
        }
    }

    ()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
