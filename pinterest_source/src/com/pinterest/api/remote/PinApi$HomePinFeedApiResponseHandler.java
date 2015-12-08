// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.network.json.PinterestJsonObject;
import java.util.Map;

// Referenced classes of package com.pinterest.api.remote:
//            FeedApiResponseHandler

public class _cls2 extends FeedApiResponseHandler
{

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
            final PinApi.HomePinFeedApiResponseHandler b;
            private Feed c;

            public void onFinish()
            {
                super.onFinish();
                b.onSuccess(c);
                long l = DiskCache.getCacheFile("MY_HOME_FEED").length();
                StopWatch.get().putAuxData("ttrfp_tmp_log", "sts_hf_fsize_post_write", new JsonPrimitive(new Long(l)));
            }

            public void run()
            {
                c = new PinFeed(a, 
// JavaClassFileOutputException: get_constant: invalid tag

            _cls1(PinterestJsonObject pinterestjsonobject)
            {
                b = PinApi.HomePinFeedApiResponseHandler.this;
                a = pinterestjsonobject;
                super();
            }
        }

        (new _cls1(pinterestjsonobject)).execute();
    }

    public void onSuccess(String s)
    {
        onSuccess(s);
        class _cls2 extends BackgroundTask
        {

            final String a;
            final PinApi.HomePinFeedApiResponseHandler b;
            private Feed c;

            public void onFinish()
            {
                onFinish();
                b.onSuccess(c);
                long l = DiskCache.getCacheFile("MY_HOME_FEED").length();
                StopWatch.get().putAuxData("ttrfp_tmp_log", "sts_hf_fsize_post_write", new JsonPrimitive(new Long(l)));
            }

            public void run()
            {
                c = PinFeed.parseJson(a, 
// JavaClassFileOutputException: get_constant: invalid tag

            _cls2(String s)
            {
                b = PinApi.HomePinFeedApiResponseHandler.this;
                a = s;
                BackgroundTask();
            }
        }

        (new _cls2(s)).execute();
    }





    public _cls2()
    {
    }

    public _cls2(FeedApiResponseHandler feedapiresponsehandler)
    {
        super(feedapiresponsehandler);
    }

    public _cls2(FeedApiResponseHandler feedapiresponsehandler, boolean flag)
    {
        super(feedapiresponsehandler, flag);
    }
}
