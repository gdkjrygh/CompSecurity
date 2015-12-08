// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class ExperiencesApi extends BaseApi
{

    public static void a(ExperienceResponseHandler experienceresponsehandler)
    {
        a("experiences/platform/ANDROID/", ((com.pinterest.api.BaseApiResponseHandler) (experienceresponsehandler)), null);
    }

    public static void a(String s)
    {
        b(String.format("experiences/%s/trigger/", new Object[] {
            s
        }), null, null);
    }

    public static void a(String s, ApiResponseHandler apiresponsehandler)
    {
        b((new StringBuilder("experiences/")).append(s).append("/completed/").toString(), apiresponsehandler, null);
    }

    public static void a(String s, Map map, ExperienceResponseHandler experienceresponsehandler, String s1)
    {
        TreeMap treemap = new TreeMap();
        treemap.put("placement_ids", s);
        if (map != null)
        {
            treemap.put("extra_context", (new PinterestJsonObject(map)).toString());
        }
        a("experiences/", ((Map) (treemap)), ((com.pinterest.api.BaseApiResponseHandler) (experienceresponsehandler)), s1);
    }

    public static void b(String s)
    {
        b((new StringBuilder("experiences/")).append(s).append("/viewed/").toString(), null, null);
    }

    public static void b(String s, ApiResponseHandler apiresponsehandler)
    {
        b((new StringBuilder("experiences/")).append(s).append("/dismiss/").toString(), ((com.pinterest.api.BaseApiResponseHandler) (apiresponsehandler)), null);
    }
}
