// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import java.net.URI;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicHeader;

// Referenced classes of package retrofit.client:
//            ApacheClient, Request, Header

private static class addHeader extends HttpRequestBase
{

    private final String method;

    public String getMethod()
    {
        return method;
    }

    public (Request request)
    {
        method = request.getMethod();
        setURI(URI.create(request.getUrl()));
        Header header;
        for (request = request.getHeaders().iterator(); request.hasNext(); addHeader(new BasicHeader(header.getName(), header.getValue())))
        {
            header = (Header)request.next();
        }

    }
}
