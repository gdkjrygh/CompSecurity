// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package com.squareup.picasso:
//            Cache, Utils

public class LruCache
    implements Cache
{

    private int evictionCount;
    private int hitCount;
    final LinkedHashMap map;
    private final int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("Max size must be positive.");
        } else
        {
            maxSize = i;
            map = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    public LruCache(Context context)
    {
        this(Utils.calculateMemoryCacheSize(context));
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
        String s = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (Bitmap)((java.util.Map.Entry) (obj)).getValue();
        map.remove(s);
        size = size - Utils.getBitmapBytes(((Bitmap) (obj)));
        evictionCount = evictionCount + 1;
        this;
        JVM INSTR monitorexit ;
          goto _L1
    }

    public final void clear()
    {
        this;
        JVM INSTR monitorenter ;
        evictAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void evictAll()
    {
        trimToSize(-1);
    }

    public final int evictionCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = evictionCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public Bitmap get(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        s = (Bitmap)map.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        hitCount = hitCount + 1;
        this;
        JVM INSTR monitorexit ;
        return s;
        missCount = missCount + 1;
        this;
        JVM INSTR monitorexit ;
        return null;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final int hitCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = hitCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final int maxSize()
    {
        this;
        JVM INSTR monitorenter ;
        int i = maxSize;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final int missCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = missCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final int putCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = putCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public void set(String s, Bitmap bitmap)
    {
        if (s == null || bitmap == null)
        {
            throw new NullPointerException("key == null || bitmap == null");
        }
        this;
        JVM INSTR monitorenter ;
        putCount = putCount + 1;
        size = size + Utils.getBitmapBytes(bitmap);
        s = (Bitmap)map.put(s, bitmap);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        size = size - Utils.getBitmapBytes(s);
        this;
        JVM INSTR monitorexit ;
        trimToSize(maxSize);
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i = size;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }
}
