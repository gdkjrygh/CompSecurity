// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiFields;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Device;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class SiteApi extends BaseApi
{

    public static void a(String s, BaseApiResponseHandler baseapiresponsehandler)
    {
        a(s, null, null, baseapiresponsehandler, null);
    }

    public static void a(String s, Pin pin, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        String s2 = null;
        if (pin != null)
        {
            if (pin.isCSR())
            {
                s2 = "csr";
            } else
            {
                s2 = "pin_id";
            }
            pin = pin.getUid();
        } else
        {
            Object obj = null;
            pin = s2;
            s2 = obj;
        }
        a(s, s2, ((String) (pin)), baseapiresponsehandler, s1);
    }

    public static void a(String s, PinApi.PinFeedApiResponse pinfeedapiresponse)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.N);
        requestparams.a("page_size", "4");
        a((new StringBuilder("domains/")).append(s).append("/pins/recent/").toString(), requestparams, ((BaseApiResponseHandler) (pinfeedapiresponse)), null);
    }

    public static void a(String s, PinApi.PinFeedApiResponse pinfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.b());
        requestparams.a("page_size", Device.getPageSizeString());
        a((new StringBuilder("domains/")).append(s).append("/pins/").toString(), requestparams, ((BaseApiResponseHandler) (pinfeedapiresponse)), s1);
    }

    private static void a(String s, String s1, String s2, BaseApiResponseHandler baseapiresponsehandler, String s3)
    {
        TreeMap treemap = new TreeMap();
        treemap.put("url", s);
        if (s1 != null && s2 != null)
        {
            treemap.put(s1, s2);
        }
        a("offsite/", ((Map) (treemap)), baseapiresponsehandler, s3);
    }

    public static void f(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        String s2 = URLEncoder.encode(s, "utf-8");
        s = s2;
_L2:
        a("offsite/check/?url=%s", s, baseapiresponsehandler, s1);
        return;
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
