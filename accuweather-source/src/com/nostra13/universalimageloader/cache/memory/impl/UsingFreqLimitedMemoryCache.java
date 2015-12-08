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

public class UsingFreqLimitedMemoryCache extends LimitedMemoryCache
{

    private final Map usingCounts = Collections.synchronizedMap(new HashMap());

    public UsingFreqLimitedMemoryCache(int i)
    {
        super(i);
    }

    public void clear()
    {
        usingCounts.clear();
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
        s = (Bitmap)super.get(s);
        if (s != null)
        {
            Integer integer = (Integer)usingCounts.get(s);
            if (integer != null)
            {
                usingCounts.put(s, Integer.valueOf(integer.intValue() + 1));
            }
        }
        return s;
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
        boolean flag = false;
        if (super.put(s, bitmap))
        {
            usingCounts.put(bitmap, Integer.valueOf(0));
            flag = true;
        }
        return flag;
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
            usingCounts.remove(bitmap);
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
        obj = usingCounts.entrySet();
        Map map = usingCounts;
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
        if (((Integer) (obj)).intValue() >= integer.intValue()) goto _L1; else goto _L2
_L2:
        integer = ((Integer) (obj));
        bitmap = (Bitmap)entry.getKey();
          goto _L1
        map;
        JVM INSTR monitorexit ;
        usingCounts.remove(bitmap);
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
