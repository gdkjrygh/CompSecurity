// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class am extends Enum
{

    public static final am a;
    public static final am b;
    public static final am c;
    public static final am d;
    public static final am e;
    public static final am f;
    public static final am g;
    public static final am h;
    private static final am i[];

    private am(String s, int j)
    {
        super(s, j);
    }

    public static am valueOf(String s)
    {
        return (am)Enum.valueOf(com/facebook/am, s);
    }

    public static am[] values()
    {
        return (am[])i.clone();
    }

    static 
    {
        a = new am("REQUESTS", 0);
        b = new am("INCLUDE_ACCESS_TOKENS", 1);
        c = new am("INCLUDE_RAW_RESPONSES", 2);
        d = new am("CACHE", 3);
        e = new am("APP_EVENTS", 4);
        f = new am("DEVELOPER_ERRORS", 5);
        g = new am("GRAPH_API_DEBUG_WARNING", 6);
        h = new am("GRAPH_API_DEBUG_INFO", 7);
        i = (new am[] {
            a, b, c, d, e, f, g, h
        });
    }
}
