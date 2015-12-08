// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Hero;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.api.remote:
//            FeedApiResponseHandler

public class _onlyBrowsable extends FeedApiResponseHandler
{

    private boolean _onlyBrowsable;
    private boolean _withLocal;

    public void onSuccess(Feed feed, Hero hero)
    {
        onSuccess(feed);
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        class _cls1 extends BackgroundTask
        {

            final PinterestJsonObject a;
            final CategoryApi.CategoriesFeedApiResponse b;
            private CategoryFeed c;
            private Hero d;

            public void onFinish()
            {
                super.onFinish();
                b.onSuccess(c, d);
            }

            public void run()
            {
                if (CommerceHelper.isCommerceEnabled() && a.f("hero"))
                {
                    d = (Hero)a.c("hero").a(com/pinterest/api/model/Hero);
                }
                c = new CategoryFeed(a, b._withLocal, b._onlyBrowsable);
            }

            _cls1(PinterestJsonObject pinterestjsonobject)
            {
                b = CategoryApi.CategoriesFeedApiResponse.this;
                a = pinterestjsonobject;
                super();
            }
        }

        (new _cls1(pinterestjsonobject)).execute();
    }



    public _cls1(FeedApiResponseHandler feedapiresponsehandler)
    {
        this(true, feedapiresponsehandler);
    }

    public <init>(boolean flag, FeedApiResponseHandler feedapiresponsehandler)
    {
        super(feedapiresponsehandler);
        _withLocal = true;
        _onlyBrowsable = true;
        _withLocal = flag;
    }

    public _withLocal(boolean flag, boolean flag1)
    {
        _withLocal = true;
        _onlyBrowsable = true;
        _withLocal = flag;
        _onlyBrowsable = flag1;
    }
}
