// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.apache;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpRequestBase;

final class ApacheHttpResponse extends LowLevelHttpResponse
{

    private final Header allHeaders[];
    private final HttpRequestBase request;
    private final HttpResponse response;

    ApacheHttpResponse(HttpRequestBase httprequestbase, HttpResponse httpresponse)
    {
        request = httprequestbase;
        response = httpresponse;
        allHeaders = httpresponse.getAllHeaders();
    }

    public void disconnect()
    {
        request.abort();
    }

    public InputStream getContent()
        throws IOException
    {
        HttpEntity httpentity = response.getEntity();
        if (httpentity == null)
        {
            return null;
        } else
        {
            return httpentity.getContent();
        }
    }

    public String getContentEncoding()
    {
        Object obj = response.getEntity();
        if (obj != null)
        {
            obj = ((HttpEntity) (obj)).getContentEncoding();
            if (obj != null)
            {
                return ((Header) (obj)).getValue();
            }
        }
        return null;
    }

    public long getContentLength()
    {
        HttpEntity httpentity = response.getEntity();
        if (httpentity == null)
        {
            return -1L;
        } else
        {
            return httpentity.getContentLength();
        }
    }

    public String getContentType()
    {
        Object obj = response.getEntity();
        if (obj != null)
        {
            obj = ((HttpEntity) (obj)).getContentType();
            if (obj != null)
            {
                return ((Header) (obj)).getValue();
            }
        }
        return null;
    }

    public int getHeaderCount()
    {
        return allHeaders.length;
    }

    public String getHeaderName(int i)
    {
        return allHeaders[i].getName();
    }

    public String getHeaderValue(int i)
    {
        return allHeaders[i].getValue();
    }

    public String getHeaderValue(String s)
    {
        return response.getLastHeader(s).getValue();
    }

    public String getReasonPhrase()
    {
        StatusLine statusline = response.getStatusLine();
        if (statusline == null)
        {
            return null;
        } else
        {
            return statusline.getReasonPhrase();
        }
    }

    public int getStatusCode()
    {
        StatusLine statusline = response.getStatusLine();
        if (statusline == null)
        {
            return 0;
        } else
        {
            return statusline.getStatusCode();
        }
    }

    public String getStatusLine()
    {
        StatusLine statusline = response.getStatusLine();
        if (statusline == null)
        {
            return null;
        } else
        {
            return statusline.toString();
        }
    }
}
