// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.google.gson.JsonObject;
import com.pinterest.api.ApiResponseHandler;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class ExperimentsApi extends BaseApi
{

    public static void a(ApiResponseHandler apiresponsehandler)
    {
        a("gatekeeper/experiments/", null, ((com.pinterest.api.BaseApiResponseHandler) (apiresponsehandler)), null);
    }

    public static void a(String s, ApiResponseHandler apiresponsehandler)
    {
        TreeMap treemap = new TreeMap();
        JsonObject jsonobject = new JsonObject();
        jsonobject.addProperty("key", s);
        treemap.put("experiment_data", jsonobject.toString());
        a("gatekeeper/activate/", ((Map) (treemap)), ((com.pinterest.api.BaseApiResponseHandler) (apiresponsehandler)));
    }
}
