// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiFields;
import com.pinterest.api.RequestParams;
import com.pinterest.base.Device;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class CSRApi extends BaseApi
{

    public static void a(String s, PinApi.PinFeedApiResponse pinfeedapiresponse, String s1)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("fields", ApiFields.c());
        requestparams.a("page_size", Device.getPageSizeString());
        a(String.format("web_results/%s/related/web_result/", new Object[] {
            s
        }), requestparams, ((com.pinterest.api.BaseApiResponseHandler) (pinfeedapiresponse)), s1);
    }

    public static void a(String s, boolean flag, PinApi.PinApiResponse pinapiresponse, String s1)
    {
        s = String.format("web_results/%s/", new Object[] {
            s
        });
        TreeMap treemap = new TreeMap();
        treemap.put("fields", ApiFields.z);
        a(s, flag, ((Map) (treemap)), ((com.pinterest.api.BaseApiResponseHandler) (pinapiresponse)), s1);
    }
}
