// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.adapter;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Feed;

// Referenced classes of package com.pinterest.activity.create.adapter:
//            SuggestedBoardAdapter

class onse extends com.pinterest.api.remote.PickerApiResponse
{

    final SuggestedBoardAdapter this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        SuggestedBoardAdapter.access$102(SuggestedBoardAdapter.this, false);
        setDataSource(SuggestedBoardAdapter.access$200(SuggestedBoardAdapter.this));
    }

    public void onSuccess(Feed feed)
    {
        if (!SuggestedBoardAdapter.access$000(SuggestedBoardAdapter.this))
        {
            SuggestedBoardAdapter.access$102(SuggestedBoardAdapter.this, false);
            setDataSource((BoardFeed)feed);
            SuggestedBoardAdapter.access$300(SuggestedBoardAdapter.this);
        }
    }

    onse()
    {
        this$0 = SuggestedBoardAdapter.this;
        super();
    }
}
