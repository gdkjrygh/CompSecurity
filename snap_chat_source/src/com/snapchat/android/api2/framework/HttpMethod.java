// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2.framework;


public final class HttpMethod extends Enum
{

    private static final HttpMethod $VALUES[];
    public static final HttpMethod DELETE;
    public static final HttpMethod GET;
    public static final HttpMethod POST;
    public static final HttpMethod PUT;

    private HttpMethod(String s, int i)
    {
        super(s, i);
    }

    public static HttpMethod valueOf(String s)
    {
        return (HttpMethod)Enum.valueOf(com/snapchat/android/api2/framework/HttpMethod, s);
    }

    public static HttpMethod[] values()
    {
        return (HttpMethod[])$VALUES.clone();
    }

    static 
    {
        GET = new HttpMethod("GET", 0);
        PUT = new HttpMethod("PUT", 1);
        POST = new HttpMethod("POST", 2);
        DELETE = new HttpMethod("DELETE", 3);
        $VALUES = (new HttpMethod[] {
            GET, PUT, POST, DELETE
        });
    }
}
