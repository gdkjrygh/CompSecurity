// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiFields;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.base.Device;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi, SearchApi

public class PlaceApi extends BaseApi
{

    public static void a(double d1, double d2, PinApi.PinFeedApiResponse pinfeedapiresponse, String s)
    {
        a((new StringBuilder()).append(d1).append(",").append(d2).toString(), pinfeedapiresponse, s, ApiFields.i());
    }

    public static void a(String s, double d1, double d2, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("center", String.format(Locale.ENGLISH, "%f, %f", new Object[] {
            Double.valueOf(d1), Double.valueOf(d2)
        }));
        requestparams.a("query", s);
        a("search/places/", requestparams, baseapiresponsehandler, s1);
    }

    public static void a(String s, PinApi.PinFeedApiResponse pinfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.b());
        requestparams.a("page_size", Device.getPageSizeString());
        a((new StringBuilder("places/")).append(s).append("/related/pin/").toString(), requestparams, ((BaseApiResponseHandler) (pinfeedapiresponse)), s1);
    }

    private static void a(String s, PinApi.PinFeedApiResponse pinfeedapiresponse, String s1, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("center", s);
        requestparams.a("radius", "12000.0");
        requestparams.a("query", "*");
        requestparams.a("fields", s2);
        requestparams.a("page_size", Device.getPageSizeString());
        a("search/pins/", requestparams, ((BaseApiResponseHandler) (pinfeedapiresponse)), s1);
    }

    public static void a(String s, String s1)
    {
        RequestParams requestparams = new RequestParams();
        if (StringUtils.isNotBlank(s1))
        {
            requestparams.a("search_id", s1);
        }
        c(String.format("places/%s/pingback/", new Object[] {
            s
        }), requestparams, null, null);
    }

    public static void b(double d1, double d2, PinApi.PinFeedApiResponse pinfeedapiresponse, String s)
    {
        a((new StringBuilder()).append(d1).append(",").append(d2).toString(), pinfeedapiresponse, s, ApiFields.h());
    }

    public static void d(String s, String s1, BaseApiResponseHandler baseapiresponsehandler, String s2)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("query", s);
        requestparams.a("near", s1);
        requestparams.a("add_fields", "place.access");
        a("search/places/", requestparams, baseapiresponsehandler, s2);
    }

    public static void f(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        SearchApi.a(s, SearchApi.Scope.g, baseapiresponsehandler, s1);
    }

    public static void g(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        s = (new StringBuilder("places/")).append(s).append("/images/").toString();
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.D);
        a(s, requestparams, baseapiresponsehandler, s1);
    }
}
