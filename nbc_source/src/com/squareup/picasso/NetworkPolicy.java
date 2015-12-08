// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


public final class NetworkPolicy extends Enum
{

    private static final NetworkPolicy $VALUES[];
    public static final NetworkPolicy NO_CACHE;
    public static final NetworkPolicy NO_STORE;
    public static final NetworkPolicy OFFLINE;
    final int index;

    private NetworkPolicy(String s, int i, int j)
    {
        super(s, i);
        index = j;
    }

    public static boolean isOfflineOnly(int i)
    {
        return (OFFLINE.index & i) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i)
    {
        return (NO_CACHE.index & i) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i)
    {
        return (NO_STORE.index & i) == 0;
    }

    public static NetworkPolicy valueOf(String s)
    {
        return (NetworkPolicy)Enum.valueOf(com/squareup/picasso/NetworkPolicy, s);
    }

    public static NetworkPolicy[] values()
    {
        return (NetworkPolicy[])$VALUES.clone();
    }

    static 
    {
        NO_CACHE = new NetworkPolicy("NO_CACHE", 0, 1);
        NO_STORE = new NetworkPolicy("NO_STORE", 1, 2);
        OFFLINE = new NetworkPolicy("OFFLINE", 2, 4);
        $VALUES = (new NetworkPolicy[] {
            NO_CACHE, NO_STORE, OFFLINE
        });
    }
}
