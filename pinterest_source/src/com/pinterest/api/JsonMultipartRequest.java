// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.google.gson.JsonElement;
import java.util.Map;

// Referenced classes of package com.pinterest.api:
//            MultipartRequest, RequestParams, BaseApiResponseHandler

public class JsonMultipartRequest extends MultipartRequest
{

    private JsonElement a;

    public JsonMultipartRequest(String s, RequestParams requestparams, Map map, BaseApiResponseHandler baseapiresponsehandler, JsonElement jsonelement)
    {
        super(1, s, requestparams, map, baseapiresponsehandler);
        a = jsonelement;
    }

    public byte[] getBody()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        byte abyte0[] = a.toString().getBytes("UTF-8");
        return abyte0;
        Exception exception;
        exception;
        return null;
    }

    public String getBodyContentType()
    {
        return "application/json";
    }
}
