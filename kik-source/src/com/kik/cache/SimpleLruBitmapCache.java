// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SimpleLruBitmapCache extends LruCache
    implements ad.b
{
    public static abstract class a
    {

        public abstract boolean a(String s);

        public a()
        {
        }
    }


    public SimpleLruBitmapCache(int i)
    {
        super(i);
    }

    public final Bitmap a(String s)
    {
        return (Bitmap)get(s);
    }

    public final void a(a a1)
    {
        if (a1 != null)
        {
            Iterator iterator = snapshot().keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                if (a1.a(s))
                {
                    remove(s);
                }
            }
        }
    }

    public final void a(String s, Bitmap bitmap)
    {
        put(s, bitmap);
    }

    protected volatile void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        super.entryRemoved(flag, (String)obj, (Bitmap)obj1, (Bitmap)obj2);
    }

    protected int sizeOf(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        return ((Bitmap) (obj)).getRowBytes() * ((Bitmap) (obj)).getHeight();
    }
}
