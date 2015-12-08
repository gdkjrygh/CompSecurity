// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.User;
import com.pinterest.network.json.PinterestJsonObject;

public class _cls1 extends ApiResponseHandler
{

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        class _cls1 extends BackgroundTask
        {

            User a;
            final PinterestJsonObject b;
            final MyUserApi.MyUserApiResponse c;

            public void onFinish()
            {
                super.onFinish();
                CrashReporting.a(a.getUsername());
                c.onSuccess(a);
                Events.post(new com.pinterest.api.model.MyUser.UpdateEvent(a));
                Events.post(new com.pinterest.api.model.User.UpdateEvent(a));
            }

            public void run()
            {
                a = User.make(b);
                Experiments.a(b.c("gatekeeper_experiments"));
                MyUser.saveMe(a, b);
            }

            _cls1(PinterestJsonObject pinterestjsonobject)
            {
                c = MyUserApi.MyUserApiResponse.this;
                b = pinterestjsonobject;
                super();
            }
        }

        if (apiresponse.getData() instanceof PinterestJsonObject)
        {
            (new _cls1((PinterestJsonObject)apiresponse.getData())).execute();
        }
    }

    public void onSuccess(User user)
    {
    }

    public _cls1()
    {
    }

    protected _cls1(int i)
    {
        super(i);
    }

    protected _cls1(boolean flag)
    {
        super(flag);
    }
}
