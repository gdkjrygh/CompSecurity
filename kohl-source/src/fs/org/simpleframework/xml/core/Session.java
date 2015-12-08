// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class Session
    implements Map
{

    private final Map map;
    private final boolean strict;

    public Session()
    {
        this(true);
    }

    public Session(boolean flag)
    {
        map = new HashMap();
        strict = flag;
    }

    public void clear()
    {
        map.clear();
    }

    public boolean containsKey(Object obj)
    {
        return map.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return map.containsValue(obj);
    }

    public Set entrySet()
    {
        return map.entrySet();
    }

    public Object get(Object obj)
    {
        return map.get(obj);
    }

    public Map getMap()
    {
        return map;
    }

    public boolean isEmpty()
    {
        return map.isEmpty();
    }

    public boolean isStrict()
    {
        return strict;
    }

    public Set keySet()
    {
        return map.keySet();
    }

    public Object put(Object obj, Object obj1)
    {
        return map.put(obj, obj1);
    }

    public void putAll(Map map1)
    {
        map.putAll(map1);
    }

    public Object remove(Object obj)
    {
        return map.remove(obj);
    }

    public int size()
    {
        return map.size();
    }

    public Collection values()
    {
        return map.values();
    }
}
