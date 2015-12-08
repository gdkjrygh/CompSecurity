// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import java.net.HttpURLConnection;
import java.util.List;
import javax.inject.Provider;

public class HttpResponse
{
    public static class Factory
    {

        Provider a;

        public Factory()
        {
        }
    }


    public HttpURLConnection a;
    public int b;
    List c;
    private String d;

    HttpResponse()
    {
    }

    static int a(HttpResponse httpresponse, int i)
    {
        httpresponse.b = i;
        return i;
    }

    static String a(HttpResponse httpresponse, String s)
    {
        httpresponse.d = s;
        return s;
    }

    static HttpURLConnection a(HttpResponse httpresponse, HttpURLConnection httpurlconnection)
    {
        httpresponse.a = httpurlconnection;
        return httpurlconnection;
    }

    static List a(HttpResponse httpresponse, List list)
    {
        httpresponse.c = list;
        return list;
    }
}
