// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

// Referenced classes of package org.apache.http.message:
//            BasicHttpRequest

public class BasicHttpEntityEnclosingRequest extends BasicHttpRequest
    implements HttpEntityEnclosingRequest
{

    private HttpEntity entity;

    public BasicHttpEntityEnclosingRequest(String s, String s1)
    {
        super(s, s1);
    }

    public BasicHttpEntityEnclosingRequest(String s, String s1, ProtocolVersion protocolversion)
    {
        super(s, s1, protocolversion);
    }

    public BasicHttpEntityEnclosingRequest(RequestLine requestline)
    {
        super(requestline);
    }

    public boolean expectContinue()
    {
        Header header = getFirstHeader("Expect");
        return header != null && "100-continue".equalsIgnoreCase(header.getValue());
    }

    public HttpEntity getEntity()
    {
        return entity;
    }

    public void setEntity(HttpEntity httpentity)
    {
        entity = httpentity;
    }
}
