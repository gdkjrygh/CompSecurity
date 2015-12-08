// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Pin;

public class _pin extends ApiResponseHandler
{

    private Pin _pin;

    private void setPinLiked(boolean flag)
    {
        class _cls1 extends BackgroundTask
        {

            final boolean a;
            final PinApi.PinLikeApiResponse b;

            public void run()
            {
                Pin pin = ModelHelper.getPin(b._pin.getUid());
                if (pin != null)
                {
                    pin.setLiked(Boolean.valueOf(a));
                    ModelHelper.setPin(pin);
                }
            }

            _cls1(boolean flag)
            {
                b = PinApi.PinLikeApiResponse.this;
                a = flag;
                super();
            }
        }

        (new _cls1(flag)).execute();
    }

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
    }


    public _cls1(Pin pin)
    {
        _pin = pin;
    }
}
