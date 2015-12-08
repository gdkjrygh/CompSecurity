// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiFields;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class NetworkStoryApi extends BaseApi
{

    public static void a(StoriesFeedApiResponse storiesfeedapiresponse, String s)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.F);
        a("network_stories/", requestparams, ((com.pinterest.api.BaseApiResponseHandler) (storiesfeedapiresponse)), s);
    }

    public static void a(String s, int i, ApiResponseHandler apiresponsehandler, String s1)
    {
        RequestParams requestparams = new RequestParams();
        String s2;
        if (i == 0)
        {
            s2 = ApiFields.b();
        } else
        if (i == 1)
        {
            s2 = ApiFields.l;
        } else
        if (i == 2)
        {
            s2 = ApiFields.i;
        } else
        {
            s2 = "";
        }
        requestparams.a("fields", s2);
        requestparams.a("page_size", Device.getPageSizeString());
        a((new StringBuilder("network_stories/related_objects/")).append(s).append("/").toString(), requestparams, ((com.pinterest.api.BaseApiResponseHandler) (apiresponsehandler)), s1);
    }

    public static void a(String s, ApiResponseHandler apiresponsehandler, String s1)
    {
        a(String.format("network_stories/story/%s/", new Object[] {
            s
        }), ((com.pinterest.api.BaseApiResponseHandler) (apiresponsehandler)), s1);
    }
}
