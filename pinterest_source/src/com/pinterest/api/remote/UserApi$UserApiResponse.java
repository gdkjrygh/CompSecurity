// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.User;

public class _cls1 extends ApiResponseHandler
{

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        class _cls1 extends BackgroundTask
        {

            public User a;
            final ApiResponse b;
            final UserApi.UserApiResponse c;

            public void onFinish()
            {
                c.onSuccess(a);
            }

            public void run()
            {
                a = User.make((PinterestJsonObject)b.getData(), false);
                ModelHelper.setUser(a);
                ModelHelper.setPartner(a.getPartner());
            }

            _cls1(ApiResponse apiresponse)
            {
                c = UserApi.UserApiResponse.this;
                b = apiresponse;
                super();
            }
        }

        (new _cls1(apiresponse)).execute();
    }

    public void onSuccess(User user)
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
