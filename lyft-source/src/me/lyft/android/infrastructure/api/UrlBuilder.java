// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlBuilder
{

    private StringBuilder queryParams;
    private String url;

    public UrlBuilder(String s)
    {
        url = s;
    }

    private UrlBuilder addPathParam(String s, String s1, boolean flag)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Path replacement name must not be null.");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Path replacement \"").append(s).append("\" value must not be null.").toString());
        }
        if (flag)
        {
            try
            {
                String s2 = URLEncoder.encode(s1, "UTF-8").replace("+", "%20");
                url = url.replace((new StringBuilder()).append("{").append(s).append("}").toString(), s2);
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                throw new RuntimeException((new StringBuilder()).append("Unable to convert path parameter \"").append(s).append("\" value to UTF-8:").append(s1).toString(), unsupportedencodingexception);
            }
            return this;
        }
        url = url.replace((new StringBuilder()).append("{").append(s).append("}").toString(), s1);
        return this;
    }

    public UrlBuilder addEncodedPathParam(String s, String s1)
    {
        return addPathParam(s, s1, false);
    }

    public UrlBuilder addEncodedQueryParam(String s, String s1)
    {
        return addQueryParam(s, s1, false);
    }

    public UrlBuilder addPathParam(String s, String s1)
    {
        return addPathParam(s, s1, true);
    }

    public UrlBuilder addQueryParam(String s, String s1)
    {
        return addQueryParam(s, s1, true);
    }

    public UrlBuilder addQueryParam(String s, String s1, boolean flag)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Query param \"").append(s).append("\" value must not be null.").toString());
        }
        String s2 = s1;
        if (flag)
        {
            String s3 = s1;
            char c;
            try
            {
                s2 = URLEncoder.encode(s1, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw new RuntimeException((new StringBuilder()).append("Unable to convert query parameter \"").append(s).append("\" value to UTF-8: ").append(s3).toString(), s1);
            }
        }
        s3 = s2;
        s1 = queryParams;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        s3 = s2;
        s1 = new StringBuilder();
        s3 = s2;
        queryParams = s1;
        s3 = s2;
        if (s1.length() > 0)
        {
            c = '&';
        } else
        {
            c = '?';
        }
        s3 = s2;
        s1.append(c);
        s3 = s2;
        s1.append(s).append('=').append(s2);
        return this;
    }

    public String build()
    {
        if (queryParams != null)
        {
            url = (new StringBuilder()).append(url).append(queryParams.toString()).toString();
        }
        return url;
    }
}
