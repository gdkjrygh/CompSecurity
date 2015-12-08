// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Pin;

class val.pin extends com.pinterest.api.remote..pin
{

    final ecute this$1;
    final Pin val$pin;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.pin(throwable, apiresponse);
        (new (_fld0, null))._mth0(new Pin[] {
            val$pin
        });
    }

    public void onSuccess(Feed feed)
    {
        super.pin(feed);
        feed = new <init>(_fld0, val$pin, feed.getItems());
        (new nit>(_fld0, null)).ecute(new ecute[] {
            feed
        });
    }

    A()
    {
        this$1 = final_a;
        val$pin = Pin.this;
        super();
    }
}
