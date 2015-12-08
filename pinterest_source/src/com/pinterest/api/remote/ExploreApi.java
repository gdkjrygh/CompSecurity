// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiFields;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.RequestParams;
import com.pinterest.kit.time.TimeDifference;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class ExploreApi extends BaseApi
{

    public static void a(BaseApiResponseHandler baseapiresponsehandler, String s)
    {
        RequestParams requestparams = new RequestParams();
        String.format("contextual_items/featured", new Object[0]);
        requestparams.a("timezone", TimeDifference.c());
        requestparams.a("fields", ApiFields.q);
        requestparams.a("country_code", Locale.getDefault().getCountry());
        a("contextual_items/featured/", requestparams, baseapiresponsehandler, s);
    }

    public static void f(String s, BaseApiResponseHandler baseapiresponsehandler, String s1)
    {
        TreeMap treemap = new TreeMap();
        s = String.format("contextual_items/%s/related_objects", new Object[] {
            s
        });
        treemap.put("fields", ApiFields.q);
        a(s, treemap, baseapiresponsehandler, s1);
    }
}
