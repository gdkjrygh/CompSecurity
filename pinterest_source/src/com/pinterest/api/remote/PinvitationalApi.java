// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.ApiHttpClient;
import com.pinterest.api.BaseApiResponseHandler;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.pinterest.api.remote:
//            BaseApi

public class PinvitationalApi extends BaseApi
{

    public static void a(String s, BaseApiResponseHandler baseapiresponsehandler)
    {
        TreeMap treemap = new TreeMap();
        treemap.put("email_address", s);
        ApiHttpClient.signedCall("pinvitational/join_request/email/", "POST", treemap, baseapiresponsehandler, null, null);
    }
}
