// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.util.DisplayMetrics;

public class LruBitmapCache extends LruCache
    implements com.android.volley.toolbox.ImageLoader.ImageCache
{

    public LruBitmapCache(int i)
    {
        super(i);
    }

    public LruBitmapCache(Context context)
    {
        this(getCacheSize(context));
    }

    public static int getCacheSize(Context context)
    {
        context = context.getResources().getDisplayMetrics();
        return ((DisplayMetrics) (context)).widthPixels * ((DisplayMetrics) (context)).heightPixels * 4 * 3;
    }

    public Bitmap getBitmap(String s)
    {
        return (Bitmap)get(s);
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
