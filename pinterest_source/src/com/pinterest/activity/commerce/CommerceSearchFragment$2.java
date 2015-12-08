// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceSearchFragment

class <init> extends com.pinterest.api.remote.sponse
{

    final CommerceSearchFragment this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        CommerceSearchFragment.access$000(CommerceSearchFragment.this);
    }

    (FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = CommerceSearchFragment.this;
        super(feedapiresponsehandler);
    }
}
