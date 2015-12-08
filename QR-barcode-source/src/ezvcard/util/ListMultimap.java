// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMultimap
    implements Iterable
{

    private final Map map;

    public ListMultimap()
    {
        map = new LinkedHashMap();
    }

    public ListMultimap(int i)
    {
        map = new LinkedHashMap(i);
    }

    public ListMultimap(ListMultimap listmultimap)
    {
        this();
        java.util.Map.Entry entry;
        ArrayList arraylist;
        for (listmultimap = listmultimap.iterator(); listmultimap.hasNext(); map.put(entry.getKey(), arraylist))
        {
            entry = (java.util.Map.Entry)listmultimap.next();
            arraylist = new ArrayList((Collection)entry.getValue());
        }

    }

    private List get(Object obj, boolean flag)
    {
        Object obj1 = sanitizeKey(obj);
        List list = (List)map.get(obj1);
        obj = list;
        if (list == null)
        {
            ArrayList arraylist = new ArrayList();
            obj = arraylist;
            if (flag)
            {
                map.put(obj1, arraylist);
                obj = arraylist;
            }
        }
        return ((List) (obj));
    }

    public void clear()
    {
        map.clear();
    }

    public boolean containsKey(Object obj)
    {
        return map.containsKey(obj);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (ListMultimap)obj;
                    return map.equals(((ListMultimap) (obj)).map);
                }
            }
        }
        return flag;
    }

    public Object first(Object obj)
    {
        obj = get(obj);
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return null;
        } else
        {
            return ((List) (obj)).get(0);
        }
    }

    public List get(Object obj)
    {
        return get(obj, false);
    }

    public Map getMap()
    {
        return map;
    }

    public int hashCode()
    {
        return map.hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Iterator iterator()
    {
        return map.entrySet().iterator();
    }

    public Set keySet()
    {
        return map.keySet();
    }

    public void put(Object obj, Object obj1)
    {
        get(obj, true).add(obj1);
    }

    public void putAll(Object obj, Collection collection)
    {
        get(obj, true).addAll(collection);
    }

    public boolean remove(Object obj, Object obj1)
    {
        obj = (List)map.get(sanitizeKey(obj));
        if (obj != null)
        {
            return ((List) (obj)).remove(obj1);
        } else
        {
            return false;
        }
    }

    public List removeAll(Object obj)
    {
        List list = (List)map.remove(sanitizeKey(obj));
        obj = list;
        if (list == null)
        {
            obj = Collections.emptyList();
        }
        return ((List) (obj));
    }

    public List replace(Object obj, Object obj1)
    {
        List list = removeAll(obj);
        if (obj1 != null)
        {
            put(obj, obj1);
        }
        return list;
    }

    public List replace(Object obj, Collection collection)
    {
        List list = removeAll(obj);
        if (collection != null && !collection.isEmpty())
        {
            putAll(obj, collection);
        }
        return list;
    }

    protected Object sanitizeKey(Object obj)
    {
        return obj;
    }

    public int size()
    {
        int i = 0;
        for (Iterator iterator1 = map.values().iterator(); iterator1.hasNext();)
        {
            i += ((List)iterator1.next()).size();
        }

        return i;
    }

    public String toString()
    {
        return map.toString();
    }

    public List values()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator1 = map.values().iterator(); iterator1.hasNext(); arraylist.addAll((List)iterator1.next())) { }
        return arraylist;
    }
}
