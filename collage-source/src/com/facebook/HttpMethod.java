// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class HttpMethod extends Enum
{

    private static final HttpMethod $VALUES[];
    public static final HttpMethod DELETE;
    public static final HttpMethod GET;
    public static final HttpMethod POST;

    private HttpMethod(String s, int i)
    {
        super(s, i);
    }

    public static HttpMethod valueOf(String s)
    {
        return (HttpMethod)Enum.valueOf(com/facebook/HttpMethod, s);
    }

    public static HttpMethod[] values()
    {
        return (HttpMethod[])$VALUES.clone();
    }

    static 
    {
        GET = new HttpMethod("GET", 0);
        POST = new HttpMethod("POST", 1);
        DELETE = new HttpMethod("DELETE", 2);
        $VALUES = (new HttpMethod[] {
            GET, POST, DELETE
        });
    }
}
