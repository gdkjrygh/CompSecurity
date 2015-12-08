// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.adobe.mediacore:
//            ContentCache, AdHandle

final class ContentNoCache
    implements ContentCache
{
    private class Pair
    {

        private AdHandle _adHandle;
        private String _url;
        final ContentNoCache this$0;

        AdHandle getAdHandle()
        {
            return _adHandle;
        }

        String getUrl()
        {
            return _url;
        }

        public Pair(String s, AdHandle adhandle)
        {
            this$0 = ContentNoCache.this;
            super();
            _url = s;
            _adHandle = adhandle;
        }
    }


    private final List cache = new CopyOnWriteArrayList();
    private final Map requestedCount = new ConcurrentHashMap();

    ContentNoCache()
    {
    }

    public boolean addContent(String s, AdHandle adhandle)
    {
        if (s == null || adhandle == null)
        {
            return false;
        } else
        {
            cache.add(new Pair(s, adhandle));
            return true;
        }
    }

    public void clearCache()
    {
        cache.clear();
    }

    public Set getCachedUrls()
    {
        TreeSet treeset = new TreeSet();
        for (Iterator iterator = cache.iterator(); iterator.hasNext(); treeset.add(((Pair)iterator.next()).getUrl())) { }
        return treeset;
    }

    public AdHandle getHandle(String s)
    {
label0:
        {
            if (s == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList();
            Iterator iterator = cache.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Pair pair = (Pair)iterator.next();
                if (pair.getUrl().equals(s))
                {
                    arraylist.add(pair);
                }
            } while (true);
            if (arraylist.isEmpty())
            {
                return null;
            }
            int i;
            int j;
            if (requestedCount.containsKey(s))
            {
                i = ((Integer)requestedCount.get(s)).intValue();
            } else
            {
                i = 0;
            }
            if (i < arraylist.size())
            {
                j = i;
                if (i >= 0)
                {
                    break label0;
                }
            }
            j = 0;
        }
        requestedCount.put(s, Integer.valueOf(j + 1));
        return ((Pair)arraylist.get(j)).getAdHandle();
    }

    public boolean isCached(String s)
    {
        if (s == null)
        {
            return false;
        }
        for (Iterator iterator = cache.iterator(); iterator.hasNext();)
        {
            if (((Pair)iterator.next()).getUrl().equals(s))
            {
                return true;
            }
        }

        return false;
    }
}
