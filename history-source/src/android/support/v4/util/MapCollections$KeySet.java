// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package android.support.v4.util:
//            MapCollections

final class this._cls0
    implements Set
{

    final MapCollections this$0;

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public void clear()
    {
        colClear();
    }

    public boolean contains(Object obj)
    {
        return colIndexOfKey(obj) >= 0;
    }

    public boolean containsAll(Collection collection)
    {
        return MapCollections.containsAllHelper(colGetMap(), collection);
    }

    public boolean equals(Object obj)
    {
        return MapCollections.equalsSetHelper(this, obj);
    }

    public int hashCode()
    {
        int j = 0;
        int i = colGetSize() - 1;
        while (i >= 0) 
        {
            Object obj = colGetEntry(i, 0);
            int k;
            if (obj == null)
            {
                k = 0;
            } else
            {
                k = obj.hashCode();
            }
            j += k;
            i--;
        }
        return j;
    }

    public boolean isEmpty()
    {
        return colGetSize() == 0;
    }

    public Iterator iterator()
    {
        return new erator(MapCollections.this, 0);
    }

    public boolean remove(Object obj)
    {
        int i = colIndexOfKey(obj);
        if (i >= 0)
        {
            colRemoveAt(i);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean removeAll(Collection collection)
    {
        return MapCollections.removeAllHelper(colGetMap(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return MapCollections.retainAllHelper(colGetMap(), collection);
    }

    public int size()
    {
        return colGetSize();
    }

    public Object[] toArray()
    {
        return toArrayHelper(0);
    }

    public Object[] toArray(Object aobj[])
    {
        return toArrayHelper(aobj, 0);
    }

    erator()
    {
        this$0 = MapCollections.this;
        super();
    }
}
