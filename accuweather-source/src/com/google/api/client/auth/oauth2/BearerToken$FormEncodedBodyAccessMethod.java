// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            BearerToken

static final class 
    implements 
{

    private static Map getData(HttpRequest httprequest)
    {
        return Data.mapOf(UrlEncodedContent.getContent(httprequest).getData());
    }

    public String getAccessTokenFromRequest(HttpRequest httprequest)
    {
        httprequest = ((HttpRequest) (getData(httprequest).get("access_token")));
        if (httprequest == null)
        {
            return null;
        } else
        {
            return httprequest.toString();
        }
    }

    public void intercept(HttpRequest httprequest, String s)
        throws IOException
    {
        boolean flag;
        if (!"GET".equals(httprequest.getRequestMethod()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "HTTP GET method is not supported");
        getData(httprequest).put("access_token", s);
    }

    ()
    {
    }
}
