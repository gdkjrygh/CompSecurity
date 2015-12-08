// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;


public final class HttpMethod extends Enum
{

    public static final HttpMethod a;
    public static final HttpMethod b;
    public static final HttpMethod c;
    public static final HttpMethod d;
    private static final HttpMethod e[];

    private HttpMethod(String s, int i)
    {
        super(s, i);
    }

    public static HttpMethod valueOf(String s)
    {
        return (HttpMethod)Enum.valueOf(io/fabric/sdk/android/services/network/HttpMethod, s);
    }

    public static HttpMethod[] values()
    {
        return (HttpMethod[])e.clone();
    }

    static 
    {
        a = new HttpMethod("GET", 0);
        b = new HttpMethod("POST", 1);
        c = new HttpMethod("PUT", 2);
        d = new HttpMethod("DELETE", 3);
        e = (new HttpMethod[] {
            a, b, c, d
        });
    }
}
