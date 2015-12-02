// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.facebook.http.protocol:
//            s

public class al
    implements ResponseHandler
{

    private final ObjectMapper a;
    private final s b;
    private HttpResponse c;

    public al(ObjectMapper objectmapper, s s1)
    {
        a = objectmapper;
        b = s1;
    }

    public JsonNode a(HttpResponse httpresponse)
    {
        c = httpresponse;
        Object obj = httpresponse.getStatusLine();
        httpresponse = httpresponse.getEntity();
        int i = ((StatusLine) (obj)).getStatusCode();
        if (i >= 300)
        {
            String s1;
            if (httpresponse == null)
            {
                httpresponse = null;
            } else
            {
                httpresponse = EntityUtils.toString(httpresponse);
            }
            if (i == 400)
            {
                b.a(httpresponse);
            }
            s1 = ((StatusLine) (obj)).getReasonPhrase();
            obj = s1;
            if (httpresponse != null)
            {
                obj = (new StringBuilder()).append(s1).append("\n").append(httpresponse).toString();
            }
            throw new HttpResponseException(i, ((String) (obj)));
        } else
        {
            return a.readTree(httpresponse.getContent());
        }
    }

    public HttpResponse a()
    {
        return c;
    }

    public Object handleResponse(HttpResponse httpresponse)
    {
        return a(httpresponse);
    }
}
