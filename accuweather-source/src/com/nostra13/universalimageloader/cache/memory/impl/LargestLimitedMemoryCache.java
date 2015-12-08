// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.memory.impl;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.cache.memory.LimitedMemoryCache;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LargestLimitedMemoryCache extends LimitedMemoryCache
{

    private final Map valueSizes = Collections.synchronizedMap(new HashMap());

    public LargestLimitedMemoryCache(int i)
    {
        super(i);
    }

    public void clear()
    {
        valueSizes.clear();
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
            valueSizes.put(bitmap, Integer.valueOf(getSize(bitmap)));
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
        Bitmap bitmap = (Bitmap)super.get(s);
        if (bitmap != null)
        {
            valueSizes.remove(bitmap);
        }
        super.remove(s);
    }

    protected Bitmap removeNext()
    {
        Bitmap bitmap;
        Integer integer;
        Object obj;
        integer = null;
        bitmap = null;
        obj = valueSizes.entrySet();
        Map map = valueSizes;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = ((Set) (obj)).iterator();
_L1:
        java.util.Map.Entry entry;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_120;
        }
        entry = (java.util.Map.Entry)iterator.next();
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        bitmap = (Bitmap)entry.getKey();
        integer = (Integer)entry.getValue();
          goto _L1
        obj = (Integer)entry.getValue();
        if (((Integer) (obj)).intValue() <= integer.intValue()) goto _L1; else goto _L2
_L2:
        integer = ((Integer) (obj));
        bitmap = (Bitmap)entry.getKey();
          goto _L1
        map;
        JVM INSTR monitorexit ;
        valueSizes.remove(bitmap);
        return bitmap;
        Exception exception;
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
