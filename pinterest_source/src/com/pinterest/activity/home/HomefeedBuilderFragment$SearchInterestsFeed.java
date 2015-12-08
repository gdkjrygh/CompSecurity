// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.api.model.InterestsFeed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderFragment

class _handlerMode extends InterestsFeed
{

    private _handlerMode _handlerMode;
    final HomefeedBuilderFragment this$0;

    public FeedApiResponseHandler newApiHandler()
    {
        return new sponseHandler(HomefeedBuilderFragment.this, _handlerMode);
    }

    public sponseHandler()
    {
        this$0 = HomefeedBuilderFragment.this;
        super(null, null);
    }

    public this._cls0(PinterestJsonObject pinterestjsonobject, String s)
    {
        this$0 = HomefeedBuilderFragment.this;
        super(pinterestjsonobject, s);
    }

    public this._cls0(PinterestJsonObject pinterestjsonobject, String s, this._cls0 _pcls0)
    {
        this$0 = HomefeedBuilderFragment.this;
        super(pinterestjsonobject, s);
        _handlerMode = _pcls0;
    }
}
