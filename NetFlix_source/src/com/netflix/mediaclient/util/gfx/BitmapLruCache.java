// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util.gfx;

import android.graphics.Bitmap;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.LoggingLruCache;

public class BitmapLruCache extends LoggingLruCache
{

    private static final boolean LOG_VERBOSE = false;
    private static final String TAG = "BitmapLruCache";

    public BitmapLruCache(int i)
    {
        super("BitmapLruCache", i);
        Log.v("BitmapLruCache", (new StringBuilder()).append("Max size: ").append(i).toString());
    }

    protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        entryRemoved(flag, (String)obj, (Bitmap)obj1, (Bitmap)obj2);
    }

    protected void entryRemoved(boolean flag, String s, Bitmap bitmap, Bitmap bitmap1)
    {
        super.entryRemoved(flag, s, bitmap, bitmap1);
    }

    public Bitmap getBitmap(String s)
    {
        return (Bitmap)super.get(s);
    }

    public void putBitmap(String s, Bitmap bitmap)
    {
        put(s, bitmap);
    }

    protected volatile int sizeOf(Object obj, Object obj1)
    {
        return sizeOf((String)obj, (Bitmap)obj1);
    }

    protected int sizeOf(String s, Bitmap bitmap)
    {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
