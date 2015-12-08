// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.DisplayMetrics;
import com.accuweather.android.utilities.DateUtils;
import com.accuweather.android.utilities.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class BitmapCache
{

    private static final int CACHE_EXPIRATION_TIME_MILLIS = 0x75300;
    private static HashMap mMapBitmaps = new HashMap();
    private Bitmap mBitmap;
    private long mCacheTime;
    private String mLocationKey;

    public BitmapCache(Bitmap bitmap, String s, long l)
    {
        mLocationKey = s;
        mCacheTime = l;
        mBitmap = bitmap;
    }

    public static void cleanupMapImages()
    {
        Iterator iterator = mMapBitmaps.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = (BitmapCache)mMapBitmaps.get(obj);
            if (obj != null)
            {
                ((BitmapCache) (obj)).cleanup();
            }
        } while (true);
        mMapBitmaps.clear();
    }

    public static boolean doesMarkerExist(Bitmap bitmap, Context context)
    {
        if (context == null)
        {
            return false;
        }
        float f = context.getResources().getDisplayMetrics().density;
        context = new int[(int)(300F * f)];
        int i = (int)Math.sqrt(context.length);
        bitmap.getPixels(context, 0, i, (int)(151F * f), (int)(48F * f), i, i);
        int k = 0;
        for (int j = 0; j < context.length;)
        {
            int i1 = Color.red(context[j]);
            int j1 = Color.green(context[j]);
            int k1 = Color.blue(context[j]);
            int l = k;
            if (i1 >= 190)
            {
                l = k;
                if (j1 == 0)
                {
                    l = k;
                    if (k1 <= 27)
                    {
                        l = k + 1;
                    }
                }
            }
            j++;
            k = l;
        }

        return (float)k >= 50F * f;
    }

    public static HashMap getMapHashMap()
    {
        return mMapBitmaps;
    }

    public static boolean isCacheTimeValid(long l)
    {
        return !DateUtils.isExpired(new SystemClock(), l, 0x75300);
    }

    public static void setMapHashMap(HashMap hashmap)
    {
        Iterator iterator = mMapBitmaps.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            if (hashmap.containsKey(obj))
            {
                BitmapCache bitmapcache = (BitmapCache)mMapBitmaps.get(obj);
                obj = (BitmapCache)hashmap.get(obj);
                if (bitmapcache != null && bitmapcache.getBitmap() != null && obj != null && bitmapcache.getBitmap() != ((BitmapCache) (obj)).getBitmap())
                {
                    bitmapcache.getBitmap().recycle();
                    bitmapcache.setBitmap(null);
                }
            }
        } while (true);
        mMapBitmaps.putAll(hashmap);
    }

    public void cleanup()
    {
        if (mBitmap != null && !mBitmap.isRecycled())
        {
            mBitmap.recycle();
            mBitmap = null;
        }
        mCacheTime = 0L;
    }

    public boolean doesMarkerExist(Context context)
    {
        if (mBitmap == null || mBitmap.isRecycled())
        {
            return false;
        } else
        {
            return doesMarkerExist(mBitmap, context);
        }
    }

    public Bitmap getBitmap()
    {
        return mBitmap;
    }

    public long getCacheTime()
    {
        return mCacheTime;
    }

    public String getLocationKey()
    {
        return mLocationKey;
    }

    public boolean isImageExpired()
    {
        return !isCacheTimeValid(getCacheTime());
    }

    public boolean isImageValid(Context context)
    {
        return mBitmap != null && !mBitmap.isRecycled() && !isImageExpired() && doesMarkerExist(context);
    }

    public void setBitmap(Bitmap bitmap)
    {
        mBitmap = bitmap;
    }

    public void setCacheTime(long l)
    {
        mCacheTime = l;
    }

    public void setLocationKey(String s)
    {
        mLocationKey = s;
    }

}
