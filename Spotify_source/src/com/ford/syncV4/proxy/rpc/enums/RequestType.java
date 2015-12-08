// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class RequestType extends Enum
{

    public static final RequestType a;
    private static RequestType b;
    private static RequestType c;
    private static RequestType d;
    private static RequestType e;
    private static RequestType f;
    private static final RequestType g[];

    private RequestType(String s, int i)
    {
        super(s, i);
    }

    public static RequestType a(String s)
    {
        return valueOf(s);
    }

    public static RequestType valueOf(String s)
    {
        return (RequestType)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/RequestType, s);
    }

    public static RequestType[] values()
    {
        return (RequestType[])g.clone();
    }

    static 
    {
        b = new RequestType("HTTP", 0);
        c = new RequestType("FILE_RESUME", 1);
        d = new RequestType("AUTH_REQUEST", 2);
        e = new RequestType("AUTH_CHALLENGE", 3);
        f = new RequestType("AUTH_ACK", 4);
        a = new RequestType("PROPRIETARY", 5);
        g = (new RequestType[] {
            b, c, d, e, f, a
        });
    }
}
