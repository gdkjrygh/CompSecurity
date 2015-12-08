// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.memory.MemoryCacheAware;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LruMemoryCache
    implements MemoryCacheAware
{

    private final LinkedHashMap map;
    private final int maxSize;
    private int size;

    public LruMemoryCache(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        } else
        {
            maxSize = i;
            map = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    private int sizeOf(String s, Bitmap bitmap)
    {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    private void trimToSize(int i)
    {
_L1:
        this;
        JVM INSTR monitorenter ;
        if (size < 0 || map.isEmpty() && size != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (size > i && !map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj = (java.util.Map.Entry)map.entrySet().iterator().next();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        String s = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (Bitmap)((java.util.Map.Entry) (obj)).getValue();
        map.remove(s);
        size = size - sizeOf(s, ((Bitmap) (obj)));
        this;
        JVM INSTR monitorexit ;
          goto _L1
    }

    public void clear()
    {
        trimToSize(-1);
    }

    public final Bitmap get(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        s = (Bitmap)map.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public volatile Object get(Object obj)
    {
        return get((String)obj);
    }

    public Collection keys()
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset = new HashSet(map.keySet());
        this;
        JVM INSTR monitorexit ;
        return hashset;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public volatile boolean put(Object obj, Object obj1)
    {
        return put((String)obj, (Bitmap)obj1);
    }

    public final boolean put(String s, Bitmap bitmap)
    {
        if (s == null || bitmap == null)
        {
            throw new NullPointerException("key == null || value == null");
        }
        this;
        JVM INSTR monitorenter ;
        size = size + sizeOf(s, bitmap);
        bitmap = (Bitmap)map.put(s, bitmap);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        size = size - sizeOf(s, bitmap);
        this;
        JVM INSTR monitorexit ;
        trimToSize(maxSize);
        return true;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public volatile void remove(Object obj)
    {
        remove((String)obj);
    }

    public final void remove(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap = (Bitmap)map.remove(s);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        size = size - sizeOf(s, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = String.format("LruCache[maxSize=%d]", new Object[] {
            Integer.valueOf(maxSize)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
