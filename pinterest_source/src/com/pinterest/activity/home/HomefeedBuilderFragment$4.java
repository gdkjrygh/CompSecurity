// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.StopWatch;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderFragment

class Response extends com.pinterest.api.remote.ApiResponse
{

    final HomefeedBuilderFragment this$0;

    public void onSuccess(Feed feed)
    {
        if (_mode != DE.BROWSE)
        {
            return;
        }
        if (StopWatch.get().isActive("hf_builder_ttrfp"))
        {
            StopWatch.get().complete("hf_builder_ttrfp");
        }
        super.onSuccess(feed);
    }

    DE(FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = HomefeedBuilderFragment.this;
        super(feedapiresponsehandler);
    }
}
