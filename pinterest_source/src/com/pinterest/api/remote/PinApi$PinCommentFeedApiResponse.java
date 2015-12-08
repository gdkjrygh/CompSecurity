// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.api.remote:
//            FeedApiResponseHandler

public abstract class _cls1 extends FeedApiResponseHandler
{

    public abstract String getPinUid();

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        class _cls1 extends BackgroundTask
        {

            final PinterestJsonObject a;
            final PinApi.PinCommentFeedApiResponse b;
            private Feed c;

            public void onFinish()
            {
                super.onFinish();
                b.onSuccess(c);
            }

            public void run()
            {
                c = new CommentFeed(b.getPinUid(), a, ((a) (b)).a);
                Collections.reverse(c.getItems());
                c.updateIds();
            }

            _cls1(PinterestJsonObject pinterestjsonobject)
            {
                b = PinApi.PinCommentFeedApiResponse.this;
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
