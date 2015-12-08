// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.api.client.util:
//            Objects

public class ArrayMap extends AbstractMap
    implements Cloneable
{
    final class Entry
        implements java.util.Map.Entry
    {

        private int index;
        final ArrayMap this$0;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof java.util.Map.Entry))
                {
                    return false;
                }
                obj = (java.util.Map.Entry)obj;
                if (!Objects.equal(getKey(), ((java.util.Map.Entry) (obj)).getKey()) || !Objects.equal(getValue(), ((java.util.Map.Entry) (obj)).getValue()))
                {
                    return false;
                }
            }
            return true;
        }

        public Object getKey()
        {
            return ArrayMap.this.getKey(index);
        }

        public Object getValue()
        {
            return ArrayMap.this.getValue(index);
        }

        public int hashCode()
        {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public Object setValue(Object obj)
        {
            return set(index, obj);
        }

        Entry(int i)
        {
            this$0 = ArrayMap.this;
            super();
            index = i;
        }
    }

    final class EntryIterator
        implements Iterator
    {

        private int nextIndex;
        private boolean removed;
        final ArrayMap this$0;

        public boolean hasNext()
        {
            return nextIndex < size;
        }

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            int i = nextIndex;
            if (i == size)
            {
                throw new NoSuchElementException();
            } else
            {
                nextIndex = nextIndex + 1;
                return new ArrayMap.Entry(i);
            }
        }

        public void remove()
        {
            int i = nextIndex - 1;
            if (removed || i < 0)
            {
                throw new IllegalArgumentException();
            } else
            {
                ArrayMap.this.remove(i);
                removed = true;
                return;
            }
        }

        EntryIterator()
        {
            this$0 = ArrayMap.this;
            super();
        }
    }

    final class EntrySet extends AbstractSet
    {

        final ArrayMap this$0;

        public Iterator iterator()
        {
            return new EntryIterator();
        }

        public int size()
        {
            return ArrayMap.this.size;
        }

        EntrySet()
        {
            this$0 = ArrayMap.this;
            super();
        }
    }


    private Object data[];
    int size;

    public ArrayMap()
    {
    }

    public static ArrayMap create()
    {
        return new ArrayMap();
    }

    public static ArrayMap create(int i)
    {
        ArrayMap arraymap = create();
        arraymap.ensureCapacity(i);
        return arraymap;
    }

    private int getDataIndexOfKey(Object obj)
    {
        int j = size;
        Object aobj[] = data;
        for (int i = 0; i < j << 1; i += 2)
        {
            Object obj1 = aobj[i];
            if (obj != null ? obj.equals(obj1) : obj1 == null)
            {
                return i;
            }
        }

        return -2;
    }

    public static transient ArrayMap of(Object aobj[])
    {
        ArrayMap arraymap = create(1);
        int i = aobj.length;
        if (1 == i % 2)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("missing value for last key: ").append(aobj[i - 1]).toString());
        } else
        {
            arraymap.size = aobj.length / 2;
            Object aobj1[] = new Object[i];
            arraymap.data = aobj1;
            System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
            return arraymap;
        }
    }

    private Object removeFromDataIndexOfKey(int i)
    {
        int j = size << 1;
        if (i < 0 || i >= j)
        {
            return null;
        }
        Object obj = valueAtDataIndex(i + 1);
        Object aobj[] = data;
        int k = j - i - 2;
        if (k != 0)
        {
            System.arraycopy(((Object) (aobj)), i + 2, ((Object) (aobj)), i, k);
        }
        size = size - 1;
        setData(j - 2, null, null);
        return obj;
    }

    private void setData(int i, Object obj, Object obj1)
    {
        Object aobj[] = data;
        aobj[i] = obj;
        aobj[i + 1] = obj1;
    }

    private void setDataCapacity(int i)
    {
        if (i == 0)
        {
            data = null;
        } else
        {
            int j = size;
            Object aobj[] = data;
            if (j == 0 || i != aobj.length)
            {
                Object aobj1[] = new Object[i];
                data = aobj1;
                if (j != 0)
                {
                    System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, j << 1);
                    return;
                }
            }
        }
    }

    private Object valueAtDataIndex(int i)
    {
        if (i < 0)
        {
            return null;
        } else
        {
            return data[i];
        }
    }

    public final void add(Object obj, Object obj1)
    {
        set(size, obj, obj1);
    }

    public void clear()
    {
        size = 0;
        data = null;
    }

    public ArrayMap clone()
    {
        ArrayMap arraymap;
        Object aobj[];
        Object aobj1[];
        int i;
        try
        {
            arraymap = (ArrayMap)super.clone();
            aobj = data;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        i = aobj.length;
        aobj1 = new Object[i];
        arraymap.data = aobj1;
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
        return arraymap;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final boolean containsKey(Object obj)
    {
        return -2 != getDataIndexOfKey(obj);
    }

    public final boolean containsValue(Object obj)
    {
        int j = size;
        Object aobj[] = data;
        for (int i = 1; i < j << 1; i += 2)
        {
            Object obj1 = aobj[i];
            if (obj != null ? obj.equals(obj1) : obj1 == null)
            {
                return true;
            }
        }

        return false;
    }

    public final void ensureCapacity(int i)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Object aobj[] = data;
        int k = i << 1;
        if (aobj == null)
        {
            i = 0;
        } else
        {
            i = aobj.length;
        }
        if (k > i)
        {
            int j = (i / 2) * 3 + 1;
            i = j;
            if (j % 2 != 0)
            {
                i = j + 1;
            }
            j = i;
            if (i < k)
            {
                j = k;
            }
            setDataCapacity(j);
        }
    }

    public final Set entrySet()
    {
        return new EntrySet();
    }

    public final Object get(Object obj)
    {
        return valueAtDataIndex(getDataIndexOfKey(obj) + 1);
    }

    public final int getIndexOfKey(Object obj)
    {
        return getDataIndexOfKey(obj) >> 1;
    }

    public final Object getKey(int i)
    {
        if (i < 0 || i >= size)
        {
            return null;
        } else
        {
            return data[i << 1];
        }
    }

    public final Object getValue(int i)
    {
        if (i < 0 || i >= size)
        {
            return null;
        } else
        {
            return valueAtDataIndex((i << 1) + 1);
        }
    }

    public final Object put(Object obj, Object obj1)
    {
        int j = getIndexOfKey(obj);
        int i = j;
        if (j == -1)
        {
            i = size;
        }
        return set(i, obj, obj1);
    }

    public final Object remove(int i)
    {
        return removeFromDataIndexOfKey(i << 1);
    }

    public final Object remove(Object obj)
    {
        return removeFromDataIndexOfKey(getDataIndexOfKey(obj));
    }

    public final Object set(int i, Object obj)
    {
        int j = size;
        if (i < 0 || i >= j)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            i = (i << 1) + 1;
            Object obj1 = valueAtDataIndex(i);
            data[i] = obj;
            return obj1;
        }
    }

    public final Object set(int i, Object obj, Object obj1)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        int j = i + 1;
        ensureCapacity(j);
        i <<= 1;
        Object obj2 = valueAtDataIndex(i + 1);
        setData(i, obj, obj1);
        if (j > size)
        {
            size = j;
        }
        return obj2;
    }

    public final int size()
    {
        return size;
    }

    public final void trim()
    {
        setDataCapacity(size << 1);
    }
}
