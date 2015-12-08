// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            BearerToken

static final class 
    implements 
{

    static final String HEADER_PREFIX = "Bearer ";

    public String getAccessTokenFromRequest(HttpRequest httprequest)
    {
label0:
        {
            httprequest = httprequest.getHeaders().getAuthorizationAsList();
            if (httprequest == null)
            {
                break label0;
            }
            httprequest = httprequest.iterator();
            String s;
            do
            {
                if (!httprequest.hasNext())
                {
                    break label0;
                }
                s = (String)httprequest.next();
            } while (!s.startsWith("Bearer "));
            return s.substring("Bearer ".length());
        }
        return null;
    }

    public void intercept(HttpRequest httprequest, String s)
        throws IOException
    {
        HttpHeaders httpheaders = httprequest.getHeaders();
        httprequest = String.valueOf("Bearer ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            httprequest = httprequest.concat(s);
        } else
        {
            httprequest = new String(httprequest);
        }
        httpheaders.setAuthorization(httprequest);
    }

    ()
    {
    }
}
