// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.api.model.Feed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderFragment

public class _handlerMode extends FeedApiResponseHandler
{

    private _cls1.execute _handlerMode;
    final HomefeedBuilderFragment this$0;

    public void onSuccess(Feed feed)
    {
        if (_handlerMode != _mode)
        {
            return;
        } else
        {
            super.onSuccess(feed);
            return;
        }
    }

    public void onSuccess(final PinterestJsonObject response)
    {
        super.onSuccess(response);
        class _cls1 extends BackgroundTask
        {

            private Feed _feed;
            final HomefeedBuilderFragment.SearchInterestsApiResponseHandler this$1;
            final PinterestJsonObject val$response;

            public void onFinish()
            {
                super.onFinish();
                onSuccess(_feed);
            }

            public void run()
            {
                _feed = new HomefeedBuilderFragment.SearchInterestsFeed(this$0, response, 
// JavaClassFileOutputException: get_constant: invalid tag

            _cls1()
            {
                this$1 = HomefeedBuilderFragment.SearchInterestsApiResponseHandler.this;
                response = pinterestjsonobject;
                super();
            }
        }

        (new _cls1()).execute();
    }



    public _cls1()
    {
        this$0 = HomefeedBuilderFragment.this;
        super();
    }

    public this._cls0(this._cls0 _pcls0)
    {
        this$0 = HomefeedBuilderFragment.this;
        super();
        _handlerMode = _pcls0;
    }

    public _handlerMode(FeedApiResponseHandler feedapiresponsehandler)
    {
        this$0 = HomefeedBuilderFragment.this;
        super(feedapiresponsehandler);
    }

    public this._cls0(FeedApiResponseHandler feedapiresponsehandler, this._cls0 _pcls0)
    {
        this(feedapiresponsehandler);
        _handlerMode = _pcls0;
    }
}
