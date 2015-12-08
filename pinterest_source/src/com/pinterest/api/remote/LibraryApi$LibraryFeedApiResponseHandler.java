// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.activity.library.model.LibraryFeed;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.api.remote:
//            FeedApiResponseHandler

public class  extends FeedApiResponseHandler
{

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        pinterestjsonobject = new LibraryFeed(pinterestjsonobject, _baseUrl, "board");
        super.onFinish();
        onSuccess(((com.pinterest.api.model.Feed) (pinterestjsonobject)));
    }

    public (FeedApiResponseHandler feedapiresponsehandler)
    {
        super(feedapiresponsehandler);
    }
}
