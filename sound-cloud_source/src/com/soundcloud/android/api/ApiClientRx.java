// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import com.soundcloud.java.reflect.TypeToken;
import rx.b;

// Referenced classes of package com.soundcloud.android.api:
//            ApiClient, ApiRequest

public class ApiClientRx
{

    private final ApiClient apiClient;

    public ApiClientRx(ApiClient apiclient)
    {
        apiClient = apiclient;
    }

    public ApiClient getApiClient()
    {
        return apiClient;
    }

    public b mappedResponse(final ApiRequest request, final TypeToken resourceType)
    {
        return b.create(new _cls2());
    }

    public b mappedResponse(ApiRequest apirequest, Class class1)
    {
        return mappedResponse(apirequest, TypeToken.of(class1));
    }

    public b response(final ApiRequest request)
    {
        return b.create(new _cls1());
    }


    private class _cls2
        implements rx.b.f
    {

        final ApiClientRx this$0;
        final ApiRequest val$request;
        final TypeToken val$resourceType;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            ApiResponse apiresponse;
            apiresponse = apiClient.fetchResponse(request);
            if (apiresponse.isSuccess())
            {
                x.onNext(apiClient.mapResponse(apiresponse, resourceType));
                x.onCompleted();
                return;
            }
            x.onError(apiresponse.getFailure());
            return;
            Object obj;
            obj;
_L2:
            x.onError(((Throwable) (obj)));
            return;
            obj;
            continue; /* Loop/switch isn't completed */
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

        _cls2()
        {
            this$0 = ApiClientRx.this;
            request = apirequest;
            resourceType = typetoken;
            super();
        }
    }


    private class _cls1
        implements rx.b.f
    {

        final ApiClientRx this$0;
        final ApiRequest val$request;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            ApiResponse apiresponse = apiClient.fetchResponse(request);
            if (apiresponse.isSuccess())
            {
                x.onNext(apiresponse);
                x.onCompleted();
                return;
            } else
            {
                x.onError(apiresponse.getFailure());
                return;
            }
        }

        _cls1()
        {
            this$0 = ApiClientRx.this;
            request = apirequest;
            super();
        }
    }

}
