// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionFactory
{

    public HttpURLConnectionFactory()
    {
    }

    public static HttpURLConnection a(String s)
        throws MalformedURLException, IOException
    {
        return (HttpURLConnection)(new URL(s)).openConnection();
    }
}
