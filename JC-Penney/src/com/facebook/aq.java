// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class aq extends Enum
{

    public static final aq a;
    public static final aq b;
    public static final aq c;
    public static final aq d;
    public static final aq e;
    public static final aq f;
    public static final aq g;
    public static final aq h;
    private static final aq i[];

    private aq(String s, int j)
    {
        super(s, j);
    }

    public static aq valueOf(String s)
    {
        return (aq)Enum.valueOf(com/facebook/aq, s);
    }

    public static aq[] values()
    {
        return (aq[])i.clone();
    }

    static 
    {
        a = new aq("REQUESTS", 0);
        b = new aq("INCLUDE_ACCESS_TOKENS", 1);
        c = new aq("INCLUDE_RAW_RESPONSES", 2);
        d = new aq("CACHE", 3);
        e = new aq("APP_EVENTS", 4);
        f = new aq("DEVELOPER_ERRORS", 5);
        g = new aq("GRAPH_API_DEBUG_WARNING", 6);
        h = new aq("GRAPH_API_DEBUG_INFO", 7);
        i = (new aq[] {
            a, b, c, d, e, f, g, h
        });
    }
}
