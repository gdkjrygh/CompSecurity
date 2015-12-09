// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.dominos.android.sdk.common.core:
//            NodeAdapter

public class MapNode extends NodeAdapter
    implements Iterable
{

    private Map map;

    public MapNode(Map map1)
    {
        Map map2 = map1;
        if (map1 == null)
        {
            map2 = Collections.EMPTY_MAP;
        }
        map = map2;
    }

    public Map asMap()
    {
        return map;
    }

    public volatile boolean contains(Object obj)
    {
        return contains((String)obj);
    }

    public boolean contains(String s)
    {
        return map.containsKey(s);
    }

    public boolean equals(Object obj)
    {
        boolean flag = false;
        if (obj instanceof MapNode)
        {
            obj = (MapNode)obj;
            flag = map.equals(((MapNode) (obj)).map);
        }
        return flag;
    }

    public volatile Object find(Object obj)
    {
        return find((String)obj);
    }

    public Object find(String s)
    {
        return map.get(s);
    }

    public int hashCode()
    {
        return map.hashCode();
    }

    public boolean isEmpty()
    {
        return map.isEmpty();
    }

    public Iterator iterator()
    {
        return map.keySet().iterator();
    }

    public MapNode put(String s, Object obj)
    {
        map.put(s, obj);
        return this;
    }

    public MapNode remove(String s)
    {
        map.remove(s);
        return this;
    }

    public int size()
    {
        return map.size();
    }

    public String toString()
    {
        return map.toString();
    }
}
