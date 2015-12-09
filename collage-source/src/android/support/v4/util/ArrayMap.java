// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.util:
//            SimpleArrayMap, MapCollections

public class ArrayMap extends SimpleArrayMap
    implements Map
{

    MapCollections mCollections;

    public ArrayMap()
    {
    }

    public ArrayMap(int i)
    {
        super(i);
    }

    public ArrayMap(SimpleArrayMap simplearraymap)
    {
        super(simplearraymap);
    }

    private MapCollections getCollection()
    {
        if (mCollections == null)
        {
            mCollections = new MapCollections() {

                final ArrayMap this$0;

                protected void colClear()
                {
                    clear();
                }

                protected Object colGetEntry(int i, int j)
                {
                    return mArray[(i << 1) + j];
                }

                protected Map colGetMap()
                {
                    return ArrayMap.this;
                }

                protected int colGetSize()
                {
                    return mSize;
                }

                protected int colIndexOfKey(Object obj)
                {
                    return indexOfKey(obj);
                }

                protected int colIndexOfValue(Object obj)
                {
                    return indexOfValue(obj);
                }

                protected void colPut(Object obj, Object obj1)
                {
                    put(obj, obj1);
                }

                protected void colRemoveAt(int i)
                {
                    removeAt(i);
                }

                protected Object colSetValue(int i, Object obj)
                {
                    return setValueAt(i, obj);
                }

            
            {
                this$0 = ArrayMap.this;
                super();
            }
            };
        }
        return mCollections;
    }

    public boolean containsAll(Collection collection)
    {
        return MapCollections.containsAllHelper(this, collection);
    }

    public Set entrySet()
    {
        return getCollection().getEntrySet();
    }

    public Set keySet()
    {
        return getCollection().getKeySet();
    }

    public void putAll(Map map)
    {
        ensureCapacity(mSize + map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public boolean removeAll(Collection collection)
    {
        return MapCollections.removeAllHelper(this, collection);
    }

    public boolean retainAll(Collection collection)
    {
        return MapCollections.retainAllHelper(this, collection);
    }

    public Collection values()
    {
        return getCollection().getValues();
    }
}
