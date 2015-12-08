// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import javax.inject.Provider;

public class HttpRequestChainElement
{
    public static class Factory
    {

        Provider a;

        public Factory()
        {
        }
    }


    public String a;
    public int b;
    public Long c;
    private String d;

    public HttpRequestChainElement()
    {
    }

    static int a(HttpRequestChainElement httprequestchainelement, int i)
    {
        httprequestchainelement.b = i;
        return i;
    }

    static Long a(HttpRequestChainElement httprequestchainelement, Long long1)
    {
        httprequestchainelement.c = long1;
        return long1;
    }

    static String a(HttpRequestChainElement httprequestchainelement, String s)
    {
        httprequestchainelement.a = s;
        return s;
    }

    static String b(HttpRequestChainElement httprequestchainelement, String s)
    {
        httprequestchainelement.d = s;
        return s;
    }
}
