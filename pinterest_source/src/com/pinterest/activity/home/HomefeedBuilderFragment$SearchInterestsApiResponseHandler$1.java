// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import com.pinterest.api.model.Feed;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.network.json.PinterestJsonObject;

class val.response extends BackgroundTask
{

    private Feed _feed;
    final this._cls1 this$1;
    final PinterestJsonObject val$response;

    public void onFinish()
    {
        super.onFinish();
        Success(_feed);
    }

    public void run()
    {
        _feed = new _feed(_fld0, val$response, cess._mth000(this._cls1.this), cess._mth100(this._cls1.this));
    }

    ()
    {
        this$1 = final_;
        val$response = PinterestJsonObject.this;
        super();
    }
}
