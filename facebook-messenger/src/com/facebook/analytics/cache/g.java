// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.cache;


public final class g extends Enum
{

    private static final g $VALUES[];
    public static final g CACHE_FULL;
    public static final g CONTENT_STALE;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/analytics/cache/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        CACHE_FULL = new g("CACHE_FULL", 0);
        CONTENT_STALE = new g("CONTENT_STALE", 1);
        $VALUES = (new g[] {
            CACHE_FULL, CONTENT_STALE
        });
    }
}
