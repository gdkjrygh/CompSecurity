// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class MapCollections
{

    EntrySet mEntrySet;
    KeySet mKeySet;
    ValuesCollection mValues;

    MapCollections()
    {
    }

    public static boolean containsAllHelper(Map map, Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!map.containsKey(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean equalsSetHelper(Set set, Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = false;
        if (set != obj) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        if (!(obj instanceof Set)) goto _L4; else goto _L3
_L3:
        obj = (Set)obj;
        if (set.size() != ((Set) (obj)).size()) goto _L6; else goto _L5
_L5:
        flag = set.containsAll(((Collection) (obj)));
        if (!flag) goto _L6; else goto _L7
_L7:
        flag = flag1;
_L9:
        return flag;
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        set;
        return false;
        set;
        return false;
    }

    public static boolean removeAllHelper(Map map, Collection collection)
    {
        int i = map.size();
        for (collection = collection.iterator(); collection.hasNext(); map.remove(collection.next())) { }
        return i != map.size();
    }

    public static boolean retainAllHelper(Map map, Collection collection)
    {
        int i = map.size();
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!collection.contains(iterator.next()))
            {
                iterator.remove();
            }
        } while (true);
        return i != map.size();
    }

    protected abstract void colClear();

    protected abstract Object colGetEntry(int i, int j);

    protected abstract Map colGetMap();

    protected abstract int colGetSize();

    protected abstract int colIndexOfKey(Object obj);

    protected abstract int colIndexOfValue(Object obj);

    protected abstract void colPut(Object obj, Object obj1);

    protected abstract void colRemoveAt(int i);

    protected abstract Object colSetValue(int i, Object obj);

    public Set getEntrySet()
    {
    /* block-local class not found */
    class EntrySet {}

        if (mEntrySet == null)
        {
            mEntrySet = new EntrySet();
        }
        return mEntrySet;
    }

    public Set getKeySet()
    {
    /* block-local class not found */
    class KeySet {}

        if (mKeySet == null)
        {
            mKeySet = new KeySet();
        }
        return mKeySet;
    }

    public Collection getValues()
    {
    /* block-local class not found */
    class ValuesCollection {}

        if (mValues == null)
        {
            mValues = new ValuesCollection();
        }
        return mValues;
    }

    public Object[] toArrayHelper(int i)
    {
        int k = colGetSize();
        Object aobj[] = new Object[k];
        for (int j = 0; j < k; j++)
        {
            aobj[j] = colGetEntry(j, i);
        }

        return aobj;
    }

    public Object[] toArrayHelper(Object aobj[], int i)
    {
        int k = colGetSize();
        if (aobj.length < k)
        {
            aobj = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), k);
        }
        for (int j = 0; j < k; j++)
        {
            aobj[j] = colGetEntry(j, i);
        }

        if (aobj.length > k)
        {
            aobj[k] = null;
        }
        return aobj;
    }

    // Unreferenced inner class android/support/v4/util/MapCollections$ArrayIterator
    /* block-local class not found */
    class ArrayIterator {}


    // Unreferenced inner class android/support/v4/util/MapCollections$MapIterator
    /* block-local class not found */
    class MapIterator {}

}
