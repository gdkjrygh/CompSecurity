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
            final NetworkStoryApi.StoriesFeedApiResponse b;
            private StoryFeed c;

            public void onFinish()
            {
                b.onSuccess(c);
            }

            public void run()
            {
                c = new StoryFeed(a, ((a) (b)).a);
            }

            _cls1(PinterestJsonObject pinterestjsonobject)
            {
                b = NetworkStoryApi.StoriesFeedApiResponse.this;
                a = pinterestjsonobject;
                super();
            }
        }

        (new _cls1(pinterestjsonobject)).execute();
    }


    public _cls1()
    {
    }
}
