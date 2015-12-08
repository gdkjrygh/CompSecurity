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
        if (set != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (Set)obj;
        boolean flag;
        try
        {
            if (set.size() != ((Set) (obj)).size())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = set.containsAll(((Collection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
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
        if (aobj.length < k)
        {
            aobj = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), k);
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

    private class EntrySet
        implements Set
    {

        final MapCollections this$0;

        public final volatile boolean add(Object obj)
        {
            return add((java.util.Map.Entry)obj);
        }

        public final boolean add(java.util.Map.Entry entry)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection)
        {
            int i = colGetSize();
            java.util.Map.Entry entry;
            for (collection = collection.iterator(); collection.hasNext(); colPut(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)collection.next();
            }

            return i != colGetSize();
        }

        public final void clear()
        {
            colClear();
        }

        public final boolean contains(Object obj)
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

        public final boolean containsAll(Collection collection)
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

        public final boolean equals(Object obj)
        {
            return MapCollections.equalsSetHelper(this, obj);
        }

        public final int hashCode()
        {
            int j = colGetSize() - 1;
            int i = 0;
            while (j >= 0) 
            {
                Object obj = colGetEntry(j, 0);
                Object obj1 = colGetEntry(j, 1);
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
                j--;
                i += l ^ k;
            }
            return i;
        }

        public final boolean isEmpty()
        {
            return colGetSize() == 0;
        }

        public final Iterator iterator()
        {
            return new MapIterator();
        }

        public final boolean remove(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public final int size()
        {
            return colGetSize();
        }

        public final Object[] toArray()
        {
            throw new UnsupportedOperationException();
        }

        public final Object[] toArray(Object aobj[])
        {
            throw new UnsupportedOperationException();
        }

        EntrySet()
        {
            this$0 = MapCollections.this;
            super();
        }

        private class MapIterator
            implements Iterator, java.util.Map.Entry
        {

            int mEnd;
            boolean mEntryValid;
            int mIndex;
            final MapCollections this$0;

            public final boolean equals(Object obj)
            {
                if (!mEntryValid)
                {
                    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
                }
                if (obj instanceof java.util.Map.Entry)
                {
                    if (ContainerHelpers.equal(((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getKey(), colGetEntry(mIndex, 0)) && ContainerHelpers.equal(((java.util.Map.Entry) (obj)).getValue(), colGetEntry(mIndex, 1)))
                    {
                        return true;
                    }
                }
                return false;
            }

            public final Object getKey()
            {
                if (!mEntryValid)
                {
                    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
                } else
                {
                    return colGetEntry(mIndex, 0);
                }
            }

            public final Object getValue()
            {
                if (!mEntryValid)
                {
                    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
                } else
                {
                    return colGetEntry(mIndex, 1);
                }
            }

            public final boolean hasNext()
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

            public final volatile Object next()
            {
                return next();
            }

            public final java.util.Map.Entry next()
            {
                mIndex = mIndex + 1;
                mEntryValid = true;
                return this;
            }

            public final void remove()
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

            public final Object setValue(Object obj)
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

    }


    private class KeySet
        implements Set
    {

        final MapCollections this$0;

        public final boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public final void clear()
        {
            colClear();
        }

        public final boolean contains(Object obj)
        {
            return colIndexOfKey(obj) >= 0;
        }

        public final boolean containsAll(Collection collection)
        {
            return MapCollections.containsAllHelper(colGetMap(), collection);
        }

        public final boolean equals(Object obj)
        {
            return MapCollections.equalsSetHelper(this, obj);
        }

        public final int hashCode()
        {
            int i = colGetSize() - 1;
            int j = 0;
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

        public final boolean isEmpty()
        {
            return colGetSize() == 0;
        }

        public final Iterator iterator()
        {
            return new ArrayIterator(0);
        }

        public final boolean remove(Object obj)
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

        public final boolean removeAll(Collection collection)
        {
            return MapCollections.removeAllHelper(colGetMap(), collection);
        }

        public final boolean retainAll(Collection collection)
        {
            return MapCollections.retainAllHelper(colGetMap(), collection);
        }

        public final int size()
        {
            return colGetSize();
        }

        public final Object[] toArray()
        {
            return toArrayHelper(0);
        }

        public final Object[] toArray(Object aobj[])
        {
            return toArrayHelper(aobj, 0);
        }

        KeySet()
        {
            this$0 = MapCollections.this;
            super();
        }

        private class ArrayIterator
            implements Iterator
        {

            boolean mCanRemove;
            int mIndex;
            final int mOffset;
            int mSize;
            final MapCollections this$0;

            public final boolean hasNext()
            {
                return mIndex < mSize;
            }

            public final Object next()
            {
                Object obj = colGetEntry(mIndex, mOffset);
                mIndex = mIndex + 1;
                mCanRemove = true;
                return obj;
            }

            public final void remove()
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

    }


    private class ValuesCollection
        implements Collection
    {

        final MapCollections this$0;

        public final boolean add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection collection)
        {
            throw new UnsupportedOperationException();
        }

        public final void clear()
        {
            colClear();
        }

        public final boolean contains(Object obj)
        {
            return colIndexOfValue(obj) >= 0;
        }

        public final boolean containsAll(Collection collection)
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

        public final boolean isEmpty()
        {
            return colGetSize() == 0;
        }

        public final Iterator iterator()
        {
            return new ArrayIterator(1);
        }

        public final boolean remove(Object obj)
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

        public final boolean removeAll(Collection collection)
        {
            int i = 0;
            int j = colGetSize();
            boolean flag = false;
            int k;
            for (; i < j; j = k)
            {
                int l = i;
                k = j;
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

        public final boolean retainAll(Collection collection)
        {
            int i = 0;
            int j = colGetSize();
            boolean flag = false;
            int k;
            for (; i < j; j = k)
            {
                int l = i;
                k = j;
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

        public final int size()
        {
            return colGetSize();
        }

        public final Object[] toArray()
        {
            return toArrayHelper(1);
        }

        public final Object[] toArray(Object aobj[])
        {
            return toArrayHelper(aobj, 1);
        }

        ValuesCollection()
        {
            this$0 = MapCollections.this;
            super();
        }
    }

}
