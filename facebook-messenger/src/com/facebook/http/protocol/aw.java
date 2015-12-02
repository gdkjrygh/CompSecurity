// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.facebook.http.protocol:
//            s

public class aw
    implements ResponseHandler
{

    private final s a;
    private HttpResponse b;

    public aw(s s1)
    {
        a = s1;
    }

    public String a(HttpResponse httpresponse)
    {
        b = httpresponse;
        Object obj = httpresponse.getStatusLine();
        httpresponse = httpresponse.getEntity();
        int i;
        if (httpresponse == null)
        {
            httpresponse = null;
        } else
        {
            httpresponse = EntityUtils.toString(httpresponse);
        }
        i = ((StatusLine) (obj)).getStatusCode();
        if (i >= 300)
        {
            if (i == 400)
            {
                a.a(httpresponse);
            }
            obj = ((StatusLine) (obj)).getReasonPhrase();
            if (httpresponse != null)
            {
                httpresponse = (new StringBuilder()).append(((String) (obj))).append("\n").append(httpresponse).toString();
            } else
            {
                httpresponse = ((HttpResponse) (obj));
            }
            throw new HttpResponseException(i, httpresponse);
        } else
        {
            return httpresponse;
        }
    }

    public HttpResponse a()
    {
        return b;
    }

    public Object handleResponse(HttpResponse httpresponse)
    {
        return a(httpresponse);
    }
}
