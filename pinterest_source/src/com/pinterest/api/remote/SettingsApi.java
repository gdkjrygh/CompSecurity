// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class SettingsApi extends BaseApi
{

    public static void a(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        a("users/settings/", baseapiresponsehandler, s);
    }

    public static void b(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        a("notifications/push/settings/", baseapiresponsehandler, s);
    }

    public static void c(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        a("countries/", baseapiresponsehandler, s);
    }

    public static void d(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a(s, s1);
        c("notifications/push/settings/", requestparams, baseapiresponsehandler, s2);
    }

    public static void e(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a(s, s1);
        c("users/settings/", requestparams, baseapiresponsehandler, s2);
    }
}
