// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.creativerepackaging;

import android.util.Log;
import com.auditude.ads.util.StringUtil;
import java.util.ArrayList;
import java.util.HashMap;

public class Cache
{

    private static final String LOG_CATEGORY = "CreativeRepackagingService";
    public static HashMap streamCache = new HashMap();
    public static int streamCacheSize = 2;
    public static ArrayList streamIdCache = new ArrayList();

    public Cache()
    {
    }

    public static void addPlaylistToCache(String s, String s1)
    {
        if (streamIdCache.size() >= streamCacheSize)
        {
            removeFirstStreamFromCache();
        }
        if (StringUtil.isNotNullOrEmpty(s1) && StringUtil.isNotNullOrEmpty(s))
        {
            Log.d("CreativeRepackagingService", (new StringBuilder("Cache: Adding stream for id ")).append(s1).append("to cache. Cache size: ").append(streamIdCache.size()).toString());
            streamIdCache.add(streamIdCache.size(), s1);
            streamCache.put(s1, s);
        }
    }

    public static String playlistFromCacheForId(String s)
    {
        Log.d("CreativeRepackagingService", (new StringBuilder("Cache: Looking for stream with id ")).append(s).toString());
        if (StringUtil.isNotNullOrEmpty(s))
        {
            return (String)streamCache.get(s);
        } else
        {
            return null;
        }
    }

    public static void removeFirstStreamFromCache()
    {
        if (streamIdCache.size() > 0)
        {
            String s = (String)streamIdCache.get(0);
            if (StringUtil.isNotNullOrEmpty(s) && streamCache.containsKey(s))
            {
                streamCache.remove(s);
                streamIdCache.remove(0);
            }
        }
    }

}
