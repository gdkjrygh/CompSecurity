// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.c;


public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b FROM_CACHE_HAD_SERVER_ERROR;
    public static final b FROM_CACHE_INCOMPLETE;
    public static final b FROM_CACHE_STALE;
    public static final b FROM_CACHE_UP_TO_DATE;
    public static final b FROM_SERVER;
    public static final b NO_DATA;

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/fbservice/c/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    static 
    {
        FROM_SERVER = new b("FROM_SERVER", 0);
        FROM_CACHE_UP_TO_DATE = new b("FROM_CACHE_UP_TO_DATE", 1);
        FROM_CACHE_STALE = new b("FROM_CACHE_STALE", 2);
        NO_DATA = new b("NO_DATA", 3);
        FROM_CACHE_INCOMPLETE = new b("FROM_CACHE_INCOMPLETE", 4);
        FROM_CACHE_HAD_SERVER_ERROR = new b("FROM_CACHE_HAD_SERVER_ERROR", 5);
        $VALUES = (new b[] {
            FROM_SERVER, FROM_CACHE_UP_TO_DATE, FROM_CACHE_STALE, NO_DATA, FROM_CACHE_INCOMPLETE, FROM_CACHE_HAD_SERVER_ERROR
        });
    }
}
