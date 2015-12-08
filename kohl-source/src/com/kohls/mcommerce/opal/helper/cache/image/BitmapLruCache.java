// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.helper.cache.image;

import android.graphics.Bitmap;
import android.util.LruCache;

public class BitmapLruCache extends LruCache
    implements com.android.volley.toolbox.ImageLoader.ImageCache
{

    private static BitmapLruCache mInstance;

    private BitmapLruCache()
    {
        super(getDefaultLruCacheSize());
    }

    private static int getDefaultLruCacheSize()
    {
        return (int)(Runtime.getRuntime().maxMemory() / 1024L) / 8;
    }

    public static BitmapLruCache open()
    {
        com/kohls/mcommerce/opal/helper/cache/image/BitmapLruCache;
        JVM INSTR monitorenter ;
        BitmapLruCache bitmaplrucache;
        if (mInstance == null)
        {
            mInstance = new BitmapLruCache();
        }
        bitmaplrucache = mInstance;
        com/kohls/mcommerce/opal/helper/cache/image/BitmapLruCache;
        JVM INSTR monitorexit ;
        return bitmaplrucache;
        Exception exception;
        exception;
        throw exception;
    }

    public Bitmap getBitmap(String s)
    {
        return (Bitmap)super.get(s);
    }

    public void putBitmap(String s, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        if (get(s) != null)
        {
            super.remove(s);
        }
        this;
        JVM INSTR monitorexit ;
        try
        {
            super.put(s, bitmap);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            super.evictAll();
        }
        break MISSING_BLOCK_LABEL_36;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    protected volatile int sizeOf(Object obj, Object obj1)
    {
        return sizeOf((String)obj, (Bitmap)obj1);
    }

    protected int sizeOf(String s, Bitmap bitmap)
    {
        return bitmap.getByteCount() / 1024;
    }
}
