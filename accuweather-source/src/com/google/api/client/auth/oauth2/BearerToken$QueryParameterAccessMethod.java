// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            BearerToken

static final class 
    implements 
{

    public String getAccessTokenFromRequest(HttpRequest httprequest)
    {
        httprequest = ((HttpRequest) (httprequest.getUrl().get("access_token")));
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
        httprequest.getUrl().set("access_token", s);
    }

    ()
    {
    }
}
