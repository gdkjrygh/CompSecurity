// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.Args;

// Referenced classes of package org.apache.http.message:
//            AbstractHttpMessage, BasicRequestLine

public class BasicHttpRequest extends AbstractHttpMessage
    implements HttpRequest
{

    private final String method;
    private RequestLine requestline;
    private final String uri;

    public BasicHttpRequest(String s, String s1)
    {
        method = (String)Args.notNull(s, "Method name");
        uri = (String)Args.notNull(s1, "Request URI");
        requestline = null;
    }

    public RequestLine getRequestLine()
    {
        if (requestline == null)
        {
            requestline = new BasicRequestLine(method, uri, HttpVersion.HTTP_1_1);
        }
        return requestline;
    }

    public String toString()
    {
        return (new StringBuilder()).append(method).append(" ").append(uri).append(" ").append(headergroup).toString();
    }
}
