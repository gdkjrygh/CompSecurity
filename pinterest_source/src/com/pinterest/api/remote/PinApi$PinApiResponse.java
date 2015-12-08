// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Pin;

public class _cls1 extends ApiResponseHandler
{

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        class _cls1 extends BackgroundTask
        {

            final ApiResponse a;
            final PinApi.PinApiResponse b;
            private Pin c;

            public void onFinish()
            {
                super.onFinish();
                b.onSuccess(c);
            }

            public void run()
            {
                c = Pin.make((PinterestJsonObject)a.getData());
            }

            _cls1(ApiResponse apiresponse)
            {
                b = PinApi.PinApiResponse.this;
                a = apiresponse;
                super();
            }
        }

        (new _cls1(apiresponse)).execute();
    }

    public void onSuccess(Pin pin)
    {
    }

    public _cls1()
    {
    }

    public _cls1(boolean flag)
    {
        super(flag);
    }
}
