// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.cache;

import com.netflix.mediaclient.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.service.browse.cache:
//            HardCache

public class HardBrowseCache
    implements HardCache
{

    private static final String TAG = "HardBrowseCache";
    private final Map cache = new HashMap();

    public HardBrowseCache()
    {
    }

    public void flush()
    {
        Log.v("HardBrowseCache", "Flushing cache");
        cache.clear();
    }

    public Object get(String s)
    {
        return cache.get(s);
    }

    public Set getKeySet()
    {
        return cache.keySet();
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
