// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.Map;

// Referenced classes of package com.pinterest.api.remote:
//            FeedApiResponseHandler

public class isHomeFeed extends FeedApiResponseHandler
{

    public boolean isHomeFeed;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
    }

    public void onHeaderReceived(Map map)
    {
        boolean flag;
        boolean flag1;
        if (map != null && map.containsKey("X-Pinterest-Response-Type") && ((String)map.get("X-Pinterest-Response-Type")).equals("static"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        _useJsonParser = Boolean.valueOf(flag1);
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        class _cls1 extends BackgroundTask
        {

            final PinterestJsonObject a;
            final PinApi.PinFeedApiResponse b;
            private PinFeed c;

            public void onFinish()
            {
                super.onFinish();
                b.onSuccess(c);
            }

            public void run()
            {
                c = new PinFeed(a, ((_cls1) (b)).c);
                if (b.isHomeFeed)
                {
                    StopWatch.get().putAuxData("ttlnhf", "ttlnhf_streaming_applied", new JsonPrimitive(new Boolean(false)));
                    StopWatch.get().complete("ttlnhf");
                }
                PinApi.a(c);
            }

            _cls1(PinterestJsonObject pinterestjsonobject)
            {
                b = PinApi.PinFeedApiResponse.this;
                a = pinterestjsonobject;
                super();
            }
        }

        (new _cls1(pinterestjsonobject)).execute();
    }

    public void onSuccess(String s)
    {
        super.onSuccess(s);
        class _cls2 extends BackgroundTask
        {

            final String a;
            final PinApi.PinFeedApiResponse b;
            private PinFeed c;

            public void onFinish()
            {
                super.onFinish();
                b.onSuccess(c);
            }

            public void run()
            {
                c = PinFeed.parseJson(a, ((_cls2) (b)).c);
                if (b.isHomeFeed)
                {
                    StopWatch.get().putAuxData("ttlnhf", "ttlnhf_streaming_applied", new JsonPrimitive(new Boolean(true)));
                    StopWatch.get().complete("ttlnhf");
                }
                PinApi.a(c);
            }

            _cls2(String s)
            {
                b = PinApi.PinFeedApiResponse.this;
                a = s;
                super();
            }
        }

        (new _cls2(s)).execute();
    }



    public _cls2()
    {
        isHomeFeed = false;
    }

    public isHomeFeed(FeedApiResponseHandler feedapiresponsehandler)
    {
        super(feedapiresponsehandler);
        isHomeFeed = false;
    }

    public isHomeFeed(FeedApiResponseHandler feedapiresponsehandler, boolean flag)
    {
        super(feedapiresponsehandler, flag);
        isHomeFeed = false;
    }
}
