// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.memory.LimitedMemoryCache;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LRULimitedMemoryCache extends LimitedMemoryCache
{

    private static final int INITIAL_CAPACITY = 10;
    private static final float LOAD_FACTOR = 1.1F;
    private final Map lruCache = Collections.synchronizedMap(new LinkedHashMap(10, 1.1F, true));

    public LRULimitedMemoryCache(int i)
    {
        super(i);
    }

    public void clear()
    {
        lruCache.clear();
        super.clear();
    }

    protected Reference createReference(Bitmap bitmap)
    {
        return new WeakReference(bitmap);
    }

    protected volatile Reference createReference(Object obj)
    {
        return createReference((Bitmap)obj);
    }

    public Bitmap get(String s)
    {
        lruCache.get(s);
        return (Bitmap)super.get(s);
    }

    public volatile Object get(Object obj)
    {
        return get((String)obj);
    }

    protected int getSize(Bitmap bitmap)
    {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    protected volatile int getSize(Object obj)
    {
        return getSize((Bitmap)obj);
    }

    public volatile boolean put(Object obj, Object obj1)
    {
        return put((String)obj, (Bitmap)obj1);
    }

    public boolean put(String s, Bitmap bitmap)
    {
        if (super.put(s, bitmap))
        {
            lruCache.put(s, bitmap);
            return true;
        } else
        {
            return false;
        }
    }

    public volatile void remove(Object obj)
    {
        remove((String)obj);
    }

    public void remove(String s)
    {
        lruCache.remove(s);
        super.remove(s);
    }

    protected Bitmap removeNext()
    {
        Bitmap bitmap = null;
        synchronized (lruCache)
        {
            Iterator iterator = lruCache.entrySet().iterator();
            if (iterator.hasNext())
            {
                bitmap = (Bitmap)((java.util.Map.Entry)iterator.next()).getValue();
                iterator.remove();
            }
        }
        return bitmap;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected volatile Object removeNext()
    {
        return removeNext();
    }
}
