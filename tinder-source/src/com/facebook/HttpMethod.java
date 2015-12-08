// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class HttpMethod extends Enum
{

    public static final HttpMethod a;
    public static final HttpMethod b;
    public static final HttpMethod c;
    private static final HttpMethod d[];

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
        return (HttpMethod[])d.clone();
    }

    static 
    {
        a = new HttpMethod("GET", 0);
        b = new HttpMethod("POST", 1);
        c = new HttpMethod("DELETE", 2);
        d = (new HttpMethod[] {
            a, b, c
        });
    }
}
