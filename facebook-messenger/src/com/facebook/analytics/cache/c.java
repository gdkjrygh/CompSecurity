// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.cache;


public final class c extends Enum
{

    private static final c $VALUES[];
    public static final c BYTES_COUNT;
    public static final c ENTRIES_COUNT;
    public static final c EVICTIONS_ON_CACHE_FULL_CALL;
    public static final c EVICTIONS_ON_CACHE_FULL_ITEM;
    public static final c EVICTIONS_ON_CACHE_FULL_SIZE;
    public static final c EVICTIONS_ON_CONTENT_STALE_CALL;
    public static final c EVICTIONS_ON_CONTENT_STALE_ITEM;
    public static final c EVICTIONS_ON_CONTENT_STALE_SIZE;
    public static final c HITS_COUNT;
    public static final c INSERTION_ITEM;
    public static final c INSERTION_SIZE;
    public static final c MISSES_COUNT;
    private final String name;

    private c(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/facebook/analytics/cache/c, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
    }

    public String toString()
    {
        return name;
    }

    static 
    {
        HITS_COUNT = new c("HITS_COUNT", 0, "hits");
        MISSES_COUNT = new c("MISSES_COUNT", 1, "misses");
        BYTES_COUNT = new c("BYTES_COUNT", 2, "bytes");
        ENTRIES_COUNT = new c("ENTRIES_COUNT", 3, "entries");
        EVICTIONS_ON_CACHE_FULL_CALL = new c("EVICTIONS_ON_CACHE_FULL_CALL", 4, "eviction_on_cache_full_call");
        EVICTIONS_ON_CACHE_FULL_ITEM = new c("EVICTIONS_ON_CACHE_FULL_ITEM", 5, "eviction_on_cache_full_item");
        EVICTIONS_ON_CACHE_FULL_SIZE = new c("EVICTIONS_ON_CACHE_FULL_SIZE", 6, "eviction_on_cache_full_size");
        EVICTIONS_ON_CONTENT_STALE_CALL = new c("EVICTIONS_ON_CONTENT_STALE_CALL", 7, "eviction_on_stale_call");
        EVICTIONS_ON_CONTENT_STALE_ITEM = new c("EVICTIONS_ON_CONTENT_STALE_ITEM", 8, "eviction_on_stale_item");
        EVICTIONS_ON_CONTENT_STALE_SIZE = new c("EVICTIONS_ON_CONTENT_STALE_SIZE", 9, "eviction_on_stale_size");
        INSERTION_ITEM = new c("INSERTION_ITEM", 10, "insertion_item");
        INSERTION_SIZE = new c("INSERTION_SIZE", 11, "insertion_size");
        $VALUES = (new c[] {
            HITS_COUNT, MISSES_COUNT, BYTES_COUNT, ENTRIES_COUNT, EVICTIONS_ON_CACHE_FULL_CALL, EVICTIONS_ON_CACHE_FULL_ITEM, EVICTIONS_ON_CACHE_FULL_SIZE, EVICTIONS_ON_CONTENT_STALE_CALL, EVICTIONS_ON_CONTENT_STALE_ITEM, EVICTIONS_ON_CONTENT_STALE_SIZE, 
            INSERTION_ITEM, INSERTION_SIZE
        });
    }
}
