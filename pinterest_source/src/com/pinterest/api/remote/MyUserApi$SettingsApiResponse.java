// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.User;
import com.pinterest.network.json.PinterestJsonObject;

public abstract class _cls1 extends ApiResponseHandler
{

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        class _cls1 extends BackgroundTask
        {

            final PinterestJsonObject a;
            final MyUserApi.SettingsApiResponse b;

            public void onFinish()
            {
                super.onFinish();
                User user = MyUser.get();
                b.onSuccess(user);
                CrashReporting.a(user.getUsername());
                Events.postSticky(new com.pinterest.api.model.MyUser.UpdateEvent(user));
                Events.post(new com.pinterest.api.model.User.UpdateEvent(user));
            }

            public void run()
            {
                MyUser.updateMe(a);
            }

            _cls1(PinterestJsonObject pinterestjsonobject)
            {
                b = MyUserApi.SettingsApiResponse.this;
                a = pinterestjsonobject;
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

    public _cls1(boolean flag)
    {
        super(flag);
    }
}
