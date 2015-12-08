// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.basic;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import oauth.signpost.http.HttpRequest;

public class UrlStringRequestAdapter
    implements HttpRequest
{

    private String url;

    public UrlStringRequestAdapter(String s)
    {
        url = s;
    }

    public Map getAllHeaders()
    {
        return Collections.emptyMap();
    }

    public String getContentType()
    {
        return null;
    }

    public String getHeader(String s)
    {
        return null;
    }

    public InputStream getMessagePayload()
        throws IOException
    {
        return null;
    }

    public String getMethod()
    {
        return "GET";
    }

    public String getRequestUrl()
    {
        return url;
    }

    public void setHeader(String s, String s1)
    {
    }

    public void setRequestUrl(String s)
    {
        url = s;
    }

    public Object unwrap()
    {
        return url;
    }
}
