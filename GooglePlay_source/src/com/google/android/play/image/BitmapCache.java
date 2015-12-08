// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import java.util.ArrayList;

public final class BitmapCache
{
    public static final class BitmapCacheEntry
    {

        public Bitmap bitmap;
        public int requestedHeight;
        public int requestedWidth;

        public BitmapCacheEntry(Bitmap bitmap1, int i, int j)
        {
            bitmap = bitmap1;
            requestedWidth = i;
            requestedHeight = j;
        }
    }

    private final class BitmapListLruCache extends LruCache
    {

        protected final volatile int sizeOf$2838e5a0(Object obj)
        {
            obj = (ArrayList)obj;
            int k = ((ArrayList) (obj)).size();
            int i = 0;
            int j = 0;
            for (; i < k; i++)
            {
                Bitmap bitmap = ((BitmapCacheEntry)((ArrayList) (obj)).get(i)).bitmap;
                int l = bitmap.getRowBytes();
                j += bitmap.getHeight() * l;
            }

            return j;
        }
    }

}
