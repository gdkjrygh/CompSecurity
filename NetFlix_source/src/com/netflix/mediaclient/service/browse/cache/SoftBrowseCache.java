// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.cache;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.LoggingLruCache;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.service.browse.cache:
//            SoftCache

public class SoftBrowseCache
    implements SoftCache
{

    private static final String TAG = "SoftBrowseCache";
    private final LoggingLruCache cache;

    public SoftBrowseCache(int i)
    {
        cache = new LoggingLruCache("SoftBrowseCache", i);
    }

    public void flush()
    {
        Log.v("SoftBrowseCache", "- Flushing cache");
        cache.evictAll();
    }

    public Object get(String s)
    {
        return cache.get(s);
    }

    public Set getKeySet()
    {
        return cache.snapshot().keySet();
    }

    public Object put(String s, Object obj)
    {
        return cache.put(s, obj);
    }

    public Object remove(String s)
    {
        return cache.remove(s);
    }
}
