// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appsflyer.cache;

import java.util.Scanner;

public class RequestCacheData
{

    private String cacheKey;
    private String postData;
    private String requestURL;
    private String version;

    public RequestCacheData(String s, String s1, String s2)
    {
        requestURL = s;
        postData = s1;
        version = s2;
    }

    public RequestCacheData(char ac[])
    {
        ac = new Scanner(new String(ac));
        do
        {
            if (!ac.hasNextLine())
            {
                break;
            }
            String s = ac.nextLine();
            if (s.startsWith("url="))
            {
                requestURL = s.substring("url=".length()).trim();
            } else
            if (s.startsWith("version="))
            {
                version = s.substring("version=".length()).trim();
            } else
            if (s.startsWith("data="))
            {
                postData = s.substring("data=".length()).trim();
            }
        } while (true);
        ac.close();
    }

    public String getCacheKey()
    {
        return cacheKey;
    }

    public String getPostData()
    {
        return postData;
    }

    public String getRequestURL()
    {
        return requestURL;
    }

    public String getVersion()
    {
        return version;
    }

    public void setCacheKey(String s)
    {
        cacheKey = s;
    }

    public void setPostData(String s)
    {
        postData = s;
    }

    public void setRequestURL(String s)
    {
        requestURL = s;
    }

    public void setVersion(String s)
    {
        version = s;
    }
}
