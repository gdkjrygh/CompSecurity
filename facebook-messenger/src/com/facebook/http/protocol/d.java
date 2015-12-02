// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;


public final class d extends Enum
{

    private static final d $VALUES[];
    public static final d API_EC_DOMAIN;
    public static final d GRAPHQL_KERROR_DOMAIN;

    private d(String s, int i)
    {
        super(s, i);
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/facebook/http/protocol/d, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    static 
    {
        API_EC_DOMAIN = new d("API_EC_DOMAIN", 0);
        GRAPHQL_KERROR_DOMAIN = new d("GRAPHQL_KERROR_DOMAIN", 1);
        $VALUES = (new d[] {
            API_EC_DOMAIN, GRAPHQL_KERROR_DOMAIN
        });
    }
}
