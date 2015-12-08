// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.IOException;

// Referenced classes of package com.google.api.client.http:
//            HttpResponseException, HttpResponse, HttpHeaders

public static class message
{

    String content;
    HttpHeaders headers;
    String message;
    int statusCode;
    String statusMessage;

    public HttpResponseException build()
    {
        return new HttpResponseException(this);
    }

    public final String getContent()
    {
        return content;
    }

    public HttpHeaders getHeaders()
    {
        return headers;
    }

    public final String getMessage()
    {
        return message;
    }

    public final int getStatusCode()
    {
        return statusCode;
    }

    public final String getStatusMessage()
    {
        return statusMessage;
    }

    public statusMessage setContent(String s)
    {
        content = s;
        return this;
    }

    public content setHeaders(HttpHeaders httpheaders)
    {
        headers = (HttpHeaders)Preconditions.checkNotNull(httpheaders);
        return this;
    }

    public headers setMessage(String s)
    {
        message = s;
        return this;
    }

    public message setStatusCode(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        statusCode = i;
        return this;
    }

    public statusCode setStatusMessage(String s)
    {
        statusMessage = s;
        return this;
    }

    public (int i, String s, HttpHeaders httpheaders)
    {
        setStatusCode(i);
        setStatusMessage(s);
        setHeaders(httpheaders);
    }

    public setHeaders(HttpResponse httpresponse)
    {
        this(httpresponse.getStatusCode(), httpresponse.getStatusMessage(), httpresponse.getHeaders());
        try
        {
            content = httpresponse.parseAsString();
            if (content.length() == 0)
            {
                content = null;
            }
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        httpresponse = HttpResponseException.computeMessageBuffer(httpresponse);
        if (content != null)
        {
            httpresponse.append(StringUtils.LINE_SEPARATOR).append(content);
        }
        message = httpresponse.toString();
    }
}
