// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RangeStartMap
    implements Map
{

    TreeMap base;

    public RangeStartMap()
    {
        base = new TreeMap(new _cls1());
    }

    public RangeStartMap(Comparable comparable, Object obj)
    {
        base = new TreeMap(new _cls1());
        put(comparable, obj);
    }

    public void clear()
    {
        base.clear();
    }

    public boolean containsKey(Object obj)
    {
        return base.get(obj) != null;
    }

    public boolean containsValue(Object obj)
    {
        return false;
    }

    public Set entrySet()
    {
        return base.entrySet();
    }

    public Object get(Object obj)
    {
        if (obj instanceof Comparable)
        {
            Comparable comparable = (Comparable)obj;
            if (!isEmpty())
            {
                Iterator iterator = base.keySet().iterator();
                obj = (Comparable)iterator.next();
                while (iterator.hasNext()) 
                {
                    if (comparable.compareTo(obj) < 0)
                    {
                        obj = (Comparable)iterator.next();
                    } else
                    {
                        return base.get(obj);
                    }
                }
                return base.get(obj);
            }
        }
        return null;
    }

    public boolean isEmpty()
    {
        return base.isEmpty();
    }

    public Set keySet()
    {
        return base.keySet();
    }

    public Object put(Comparable comparable, Object obj)
    {
        return base.put(comparable, obj);
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((Comparable)obj, (Object)obj1);
    }

    public void putAll(Map map)
    {
        base.putAll(map);
    }

    public Object remove(Object obj)
    {
        if (obj instanceof Comparable)
        {
            Comparable comparable = (Comparable)obj;
            if (!isEmpty())
            {
                Iterator iterator = base.keySet().iterator();
                obj = (Comparable)iterator.next();
                while (iterator.hasNext()) 
                {
                    if (comparable.compareTo(obj) < 0)
                    {
                        obj = (Comparable)iterator.next();
                    } else
                    {
                        return base.remove(obj);
                    }
                }
                return base.remove(obj);
            }
        }
        return null;
    }

    public int size()
    {
        return base.size();
    }

    public Collection values()
    {
        return base.values();
    }

    private class _cls1
        implements Comparator
    {

        final RangeStartMap this$0;

        public int compare(Comparable comparable, Comparable comparable1)
        {
            return -comparable.compareTo(comparable1);
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((Comparable)obj, (Comparable)obj1);
        }

        _cls1()
        {
            this$0 = RangeStartMap.this;
            super();
        }
    }

}
