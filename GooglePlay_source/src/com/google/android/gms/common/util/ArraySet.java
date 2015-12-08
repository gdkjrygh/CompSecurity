// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.SimpleArrayMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class ArraySet extends AbstractSet
{

    private final ArrayMap mBackingMap;

    public ArraySet()
    {
        mBackingMap = new ArrayMap();
    }

    public ArraySet(int i)
    {
        mBackingMap = new ArrayMap(i);
    }

    public ArraySet(Collection collection)
    {
        this(collection.size());
        addAll(collection);
    }

    private boolean addAll(ArraySet arrayset)
    {
        boolean flag = false;
        int j = size();
        ArrayMap arraymap = mBackingMap;
        arrayset = arrayset.mBackingMap;
        int k = ((SimpleArrayMap) (arrayset)).mSize;
        arraymap.ensureCapacity(((SimpleArrayMap) (arraymap)).mSize + k);
        if (((SimpleArrayMap) (arraymap)).mSize == 0)
        {
            if (k > 0)
            {
                System.arraycopy(((SimpleArrayMap) (arrayset)).mHashes, 0, ((SimpleArrayMap) (arraymap)).mHashes, 0, k);
                System.arraycopy(((Object) (((SimpleArrayMap) (arrayset)).mArray)), 0, ((Object) (((SimpleArrayMap) (arraymap)).mArray)), 0, k << 1);
                arraymap.mSize = k;
            }
        } else
        {
            int i = 0;
            while (i < k) 
            {
                arraymap.put(arrayset.keyAt(i), arrayset.valueAt(i));
                i++;
            }
        }
        if (size() > j)
        {
            flag = true;
        }
        return flag;
    }

    public final boolean add(Object obj)
    {
        if (mBackingMap.containsKey(obj))
        {
            return false;
        } else
        {
            mBackingMap.put(obj, obj);
            return true;
        }
    }

    public final boolean addAll(Collection collection)
    {
        if (collection instanceof ArraySet)
        {
            return addAll((ArraySet)collection);
        } else
        {
            return super.addAll(collection);
        }
    }

    public final void clear()
    {
        mBackingMap.clear();
    }

    public final boolean contains(Object obj)
    {
        return mBackingMap.containsKey(obj);
    }

    public final Iterator iterator()
    {
        return mBackingMap.keySet().iterator();
    }

    public final boolean remove(Object obj)
    {
        if (!mBackingMap.containsKey(obj))
        {
            return false;
        } else
        {
            mBackingMap.remove(obj);
            return true;
        }
    }

    public final int size()
    {
        return mBackingMap.size();
    }
}
