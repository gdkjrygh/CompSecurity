// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Feed;
import com.pinterest.network.json.PinterestJsonObject;

public abstract class FeedApiResponseHandler extends ApiResponseHandler
{

    protected FeedApiResponseHandler _handler;
    protected boolean _ignoreError;

    public FeedApiResponseHandler()
    {
        _ignoreError = false;
    }

    public FeedApiResponseHandler(FeedApiResponseHandler feedapiresponsehandler)
    {
        this(feedapiresponsehandler, false);
    }

    public FeedApiResponseHandler(FeedApiResponseHandler feedapiresponsehandler, boolean flag)
    {
        _ignoreError = false;
        _handler = feedapiresponsehandler;
        _ignoreError = flag;
    }

    public FeedApiResponseHandler getHandler()
    {
        return _handler;
    }

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if (!_ignoreError)
        {
            super.onFailure(throwable, apiresponse);
        }
        if (_handler != null)
        {
            _handler.onFailure(throwable, apiresponse);
        }
    }

    public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
    {
        super.onFailure(throwable, pinterestjsonobject);
        if (_handler != null)
        {
            _handler.onFailure(throwable, pinterestjsonobject);
        }
    }

    public void onFinish()
    {
        super.onFinish();
        if (_handler != null)
        {
            _handler.onFinish();
        }
    }

    public void onStart()
    {
        super.onStart();
        if (_handler != null)
        {
            _handler.onStart();
        }
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        if (_handler != null)
        {
            _handler.onSuccess(apiresponse);
        }
    }

    public void onSuccess(Feed feed)
    {
        if (_handler != null)
        {
            _handler.onSuccess(feed);
        }
    }

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        if (_handler != null)
        {
            _handler.onSuccess(pinterestjsonobject);
        }
    }

    public void onSuccess(String s)
    {
        super.onSuccess(s);
        if (_handler != null)
        {
            _handler.onSuccess(s);
        }
    }

    public void setHandler(FeedApiResponseHandler feedapiresponsehandler)
    {
        _handler = feedapiresponsehandler;
    }
}
