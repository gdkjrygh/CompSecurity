// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public final class CacheStrategy
{

    public final Response cacheResponse;
    public final Request networkRequest;

    private CacheStrategy(Request request, Response response)
    {
        networkRequest = request;
        cacheResponse = response;
    }

    CacheStrategy(Request request, Response response, _cls1 _pcls1)
    {
        this(request, response);
    }

    public static boolean isCacheable(Response response, Request request)
    {
        response.code();
        JVM INSTR lookupswitch 13: default 120
    //                   200: 162
    //                   203: 162
    //                   204: 162
    //                   300: 162
    //                   301: 162
    //                   302: 122
    //                   307: 122
    //                   308: 162
    //                   404: 162
    //                   405: 162
    //                   410: 162
    //                   414: 162
    //                   501: 162;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        return false;
_L3:
        if (response.header("Expires") == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().isPublic() && !response.cacheControl().isPrivate())
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (!response.cacheControl().noStore() && !request.cacheControl().noStore())
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
