// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractTable, Maps

class StandardTable extends AbstractTable
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Map backingMap;
    private transient Set columnKeySet;
    private transient ColumnMap columnMap;
    final Supplier factory;
    private transient Map rowMap;

    StandardTable(Map map, Supplier supplier)
    {
        backingMap = map;
        factory = supplier;
    }

    private boolean containsMapping(Object obj, Object obj1, Object obj2)
    {
        return obj2 != null && obj2.equals(get(obj, obj1));
    }

    private Map getOrCreate(Object obj)
    {
        Map map1 = (Map)backingMap.get(obj);
        Map map = map1;
        if (map1 == null)
        {
            map = (Map)factory.get();
            backingMap.put(obj, map);
        }
        return map;
    }

    private Map removeColumn(Object obj)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        Iterator iterator = backingMap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj1 = ((Map)entry.getValue()).remove(obj);
            if (obj1 != null)
            {
                linkedhashmap.put(entry.getKey(), obj1);
                if (((Map)entry.getValue()).isEmpty())
                {
                    iterator.remove();
                }
            }
        } while (true);
        return linkedhashmap;
    }

    private boolean removeMapping(Object obj, Object obj1, Object obj2)
    {
        if (containsMapping(obj, obj1, obj2))
        {
            remove(obj, obj1);
            return true;
        } else
        {
            return false;
        }
    }

    Iterator cellIterator()
    {
        return new CellIterator(null);
    }

    public Set cellSet()
    {
        return super.cellSet();
    }

    public void clear()
    {
        backingMap.clear();
    }

    public Map column(Object obj)
    {
        return new Column(obj);
    }

    public Set columnKeySet()
    {
        Set set = columnKeySet;
        Object obj = set;
        if (set == null)
        {
            obj = new ColumnKeySet(null);
            columnKeySet = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Map columnMap()
    {
        ColumnMap columnmap1 = columnMap;
        ColumnMap columnmap = columnmap1;
        if (columnmap1 == null)
        {
            columnmap = new ColumnMap(null);
            columnMap = columnmap;
        }
        return columnmap;
    }

    public boolean contains(Object obj, Object obj1)
    {
        return obj != null && obj1 != null && super.contains(obj, obj1);
    }

    public boolean containsColumn(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        for (Iterator iterator = backingMap.values().iterator(); iterator.hasNext();)
        {
            if (Maps.safeContainsKey((Map)iterator.next(), obj))
            {
                return true;
            }
        }

        return false;
    }

    public boolean containsRow(Object obj)
    {
        return obj != null && Maps.safeContainsKey(backingMap, obj);
    }

    public boolean containsValue(Object obj)
    {
        return obj != null && super.containsValue(obj);
    }

    Iterator createColumnKeyIterator()
    {
        return new ColumnKeyIterator(null);
    }

    Map createRowMap()
    {
        return new RowMap();
    }

    public Object get(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return null;
        } else
        {
            return super.get(obj, obj1);
        }
    }

    public boolean isEmpty()
    {
        return backingMap.isEmpty();
    }

    public Object put(Object obj, Object obj1, Object obj2)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        Preconditions.checkNotNull(obj2);
        return getOrCreate(obj).put(obj1, obj2);
    }

    public Object remove(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            return null;
        }
        Map map = (Map)Maps.safeGet(backingMap, obj);
        if (map == null)
        {
            return null;
        }
        obj1 = map.remove(obj1);
        if (map.isEmpty())
        {
            backingMap.remove(obj);
        }
        return obj1;
    }

    public Map row(Object obj)
    {
        return new Row(obj);
    }

    public Set rowKeySet()
    {
        return rowMap().keySet();
    }

    public Map rowMap()
    {
        Map map1 = rowMap;
        Map map = map1;
        if (map1 == null)
        {
            map = createRowMap();
            rowMap = map;
        }
        return map;
    }

    public int size()
    {
        Iterator iterator = backingMap.values().iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((Map)iterator.next()).size() + i) { }
        return i;
    }

    public Collection values()
    {
        return super.values();
    }




    /* member class not found */
    class CellIterator {}


    /* member class not found */
    class Column {}


    /* member class not found */
    class ColumnKeySet {}


    /* member class not found */
    class ColumnMap {}


    /* member class not found */
    class ColumnKeyIterator {}


    /* member class not found */
    class RowMap {}


    /* member class not found */
    class Row {}

}
