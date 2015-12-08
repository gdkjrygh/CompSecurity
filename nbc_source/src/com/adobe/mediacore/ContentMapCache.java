// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.adobe.mediacore:
//            ContentCache, AdHandle

final class ContentMapCache
    implements ContentCache
{

    private final Map cache = new ConcurrentHashMap();

    ContentMapCache()
    {
    }

    public boolean addContent(String s, AdHandle adhandle)
    {
        if (s == null || adhandle == null)
        {
            return false;
        } else
        {
            cache.put(s, adhandle);
            return true;
        }
    }

    public void clearCache()
    {
        String s;
        for (Iterator iterator = cache.keySet().iterator(); iterator.hasNext(); cache.remove(s))
        {
            s = (String)iterator.next();
        }

    }

    public Set getCachedUrls()
    {
        return cache.keySet();
    }

    public AdHandle getHandle(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (AdHandle)cache.get(s);
        }
    }

    public boolean isCached(String s)
    {
        return s != null && cache.containsKey(s);
    }
}
