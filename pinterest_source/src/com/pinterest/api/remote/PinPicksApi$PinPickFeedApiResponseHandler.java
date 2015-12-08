// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.api.remote:
//            FeedApiResponseHandler

public class _cls1 extends FeedApiResponseHandler
{

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        class _cls1 extends BackgroundTask
        {

            final PinterestJsonObject a;
            final PinPicksApi.PinPickFeedApiResponseHandler b;
            private Feed c;

            public void onFinish()
            {
                super.onFinish();
                b.onSuccess(c);
            }

            public void run()
            {
                c = new PinPicksFeed(a, ((<init>) (b)).<init>);
                DiskCache.setJsonObject("MY_PINPICKS_FEED", a);
            }

            _cls1(PinterestJsonObject pinterestjsonobject)
            {
                b = PinPicksApi.PinPickFeedApiResponseHandler.this;
                a = pinterestjsonobject;
                super();
            }
        }

        (new _cls1(pinterestjsonobject)).execute();
    }


    public _cls1()
    {
    }

    public _cls1(FeedApiResponseHandler feedapiresponsehandler)
    {
        super(feedapiresponsehandler);
    }
}
