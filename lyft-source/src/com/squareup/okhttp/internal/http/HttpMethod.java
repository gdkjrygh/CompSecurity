// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;


public final class HttpMethod
{

    private HttpMethod()
    {
    }

    public static boolean invalidatesCache(String s)
    {
        return s.equals("POST") || s.equals("PATCH") || s.equals("PUT") || s.equals("DELETE");
    }

    public static boolean permitsRequestBody(String s)
    {
        return requiresRequestBody(s) || s.equals("DELETE");
    }

    public static boolean requiresRequestBody(String s)
    {
        return s.equals("POST") || s.equals("PUT") || s.equals("PATCH");
    }
}
