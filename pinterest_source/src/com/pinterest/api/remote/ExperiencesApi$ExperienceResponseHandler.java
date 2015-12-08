// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;

public class _cls1 extends ApiResponseHandler
{

    public void onSuccess()
    {
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        class _cls1 extends BackgroundTask
        {

            final ApiResponse a;
            final ExperiencesApi.ExperienceResponseHandler b;

            public void onFinish()
            {
                b.onSuccess();
            }

            public void run()
            {
                PinterestJsonObject pinterestjsonobject = (PinterestJsonObject)a.getData();
                if (pinterestjsonobject != null)
                {
                    Experiences.c().a(pinterestjsonobject.b());
                }
            }

            _cls1(ApiResponse apiresponse)
            {
                b = ExperiencesApi.ExperienceResponseHandler.this;
                a = apiresponse;
                super();
            }
        }

        (new _cls1(apiresponse)).execute();
    }

    public _cls1()
    {
    }
}
