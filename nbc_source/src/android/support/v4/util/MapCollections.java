// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.util:
//            ContainerHelpers

abstract class MapCollections
{
    final class ArrayIterator
        implements Iterator
    {

        boolean mCanRemove;
        int mIndex;
        final int mOffset;
        int mSize;
        final MapCollections this$0;

        public boolean hasNext()
        {
            return mIndex < mSize;
        }

        public Object next()
        {
            Object obj = colGetEntry(mIndex, mOffset);
            mIndex = mIndex + 1;
            mCanRemove = true;
            return obj;
        }

        public void remove()
        {
            if (!mCanRemove)
            {
                throw new IllegalStateException();
            } else
            {
                mIndex = mIndex - 1;
                mSize = mSize - 1;
                mCanRemove = false;
                colRemoveAt(mIndex);
                return;
            }
        }

        ArrayIterator(int i)
        {
            this$0 = MapCollections.this;
            super();
            mCanRemove = false;
            mOffset = i;
            mSize = colGetSize();
        }
    }

    final class EntrySet
        implements Set
    {

        final MapCollections this$0;

        public volatile boolean add(Object obj)
        {
            return add((java.util.Map.Entry)obj);
        }

        public boolean add(java.util.Map.Entry entry)
        {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection)
        {
            int i = colGetSize();
            java.util.Map.Entry entry;
            for (collection = collection.iterator(); collection.hasNext(); colPut(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)collection.next();
            }

            return i != colGetSize();
        }

        public void clear()
        {
            colClear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                int i = colIndexOfKey(((java.util.Map.Entry) (obj)).getKey());
                if (i >= 0)
                {
                    return ContainerHelpers.equal(colGetEntry(i, 1), ((java.util.Map.Entry) (obj)).getValue());
                }
            }
            return false;
        }

        public boolean containsAll(Collection collection)
        {
            for (collection = collection.iterator(); collection.hasNext();)
            {
                if (!contains(collection.next()))
                {
                    return false;
                }
            }

            return true;
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
                Object obj1 = colGetEntry(i, 1);
                int k;
                int l;
                if (obj == null)
                {
                    k = 0;
                } else
                {
                    k = obj.hashCode();
                }
                if (obj1 == null)
                {
                    l = 0;
                } else
                {
                    l = obj1.hashCode();
                }
                j += l ^ k;
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
            return new MapIterator();
        }

        public boolean remove(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public int size()
        {
            return colGetSize();
        }

        public Object[] toArray()
        {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray(Object aobj[])
        {
            throw new UnsupportedOperationException();
        }

        EntrySet()
        {
            this$0 = MapCollections.this;
            super();
        }
    }

    final class KeySet
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
            return new ArrayIterator(0);
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

        KeySet()
        {
            this$0 = MapCollections.this;
            super();
        }
    }

    final class MapIterator
        implements Iterator, java.util.Map.Entry
    {

        int mEnd;
        boolean mEntryValid;
        int mIndex;
        final MapCollections this$0;

        public final boolean equals(Object obj)
        {
            boolean flag = true;
            if (!mEntryValid)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            }
            obj = (java.util.Map.Entry)obj;
            if (!ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getKey(), colGetEntry(mIndex, 0)) || !ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getValue(), colGetEntry(mIndex, 1)))
            {
                flag = false;
            }
            return flag;
        }

        public Object getKey()
        {
            if (!mEntryValid)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else
            {
                return colGetEntry(mIndex, 0);
            }
        }

        public Object getValue()
        {
            if (!mEntryValid)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else
            {
                return colGetEntry(mIndex, 1);
            }
        }

        public boolean hasNext()
        {
            return mIndex < mEnd;
        }

        public final int hashCode()
        {
            int j = 0;
            if (!mEntryValid)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object obj = colGetEntry(mIndex, 0);
            Object obj1 = colGetEntry(mIndex, 1);
            int i;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = obj.hashCode();
            }
            if (obj1 != null)
            {
                j = obj1.hashCode();
            }
            return j ^ i;
        }

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            mIndex = mIndex + 1;
            mEntryValid = true;
            return this;
        }

        public void remove()
        {
            if (!mEntryValid)
            {
                throw new IllegalStateException();
            } else
            {
                colRemoveAt(mIndex);
                mIndex = mIndex - 1;
                mEnd = mEnd - 1;
                mEntryValid = false;
                return;
            }
        }

        public Object setValue(Object obj)
        {
            if (!mEntryValid)
            {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else
            {
                return colSetValue(mIndex, obj);
            }
        }

        public final String toString()
        {
            return (new StringBuilder()).append(getKey()).append("=").append(getValue()).toString();
        }

        MapIterator()
        {
            this$0 = MapCollections.this;
            super();
            mEntryValid = false;
            mEnd = colGetSize() - 1;
            mIndex = -1;
        }
    }

    final class ValuesCollection
        implements Collection
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
            return colIndexOfValue(obj) >= 0;
        }

        public boolean containsAll(Collection collection)
        {
            for (collection = collection.iterator(); collection.hasNext();)
            {
                if (!contains(collection.next()))
                {
                    return false;
                }
            }

            return true;
        }

        public boolean isEmpty()
        {
            return colGetSize() == 0;
        }

        public Iterator iterator()
        {
            return new ArrayIterator(1);
        }

        public boolean remove(Object obj)
        {
            int i = colIndexOfValue(obj);
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
            int j = colGetSize();
            boolean flag = false;
            int k;
            for (int i = 0; i < j; j = k)
            {
                k = j;
                int l = i;
                if (collection.contains(colGetEntry(i, 1)))
                {
                    colRemoveAt(i);
                    l = i - 1;
                    k = j - 1;
                    flag = true;
                }
                i = l + 1;
            }

            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            int j = colGetSize();
            boolean flag = false;
            int k;
            for (int i = 0; i < j; j = k)
            {
                k = j;
                int l = i;
                if (!collection.contains(colGetEntry(i, 1)))
                {
                    colRemoveAt(i);
                    l = i - 1;
                    k = j - 1;
                    flag = true;
                }
                i = l + 1;
            }

            return flag;
        }

        public int size()
        {
            return colGetSize();
        }

        public Object[] toArray()
        {
            return toArrayHelper(1);
        }

        public Object[] toArray(Object aobj[])
        {
            return toArrayHelper(aobj, 1);
        }

        ValuesCollection()
        {
            this$0 = MapCollections.this;
            super();
        }
    }


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
        if (mEntrySet == null)
        {
            mEntrySet = new EntrySet();
        }
        return mEntrySet;
    }

    public Set getKeySet()
    {
        if (mKeySet == null)
        {
            mKeySet = new KeySet();
        }
        return mKeySet;
    }

    public Collection getValues()
    {
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
        Object aobj1[] = aobj;
        if (aobj.length < k)
        {
            aobj1 = (Object[])(Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), k);
        }
        for (int j = 0; j < k; j++)
        {
            aobj1[j] = colGetEntry(j, i);
        }

        if (aobj1.length > k)
        {
            aobj1[k] = null;
        }
        return aobj1;
    }
}
