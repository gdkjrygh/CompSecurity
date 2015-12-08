// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.utils;

import android.graphics.Bitmap;
import android.os.Handler;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class c
{

    private static final ConcurrentHashMap c = new ConcurrentHashMap(2);
    private final Handler a = new Handler();
    private final HashMap b = new LinkedHashMap(2, 0.75F, true) {

        final c a;

        protected boolean removeEldestEntry(java.util.Map.Entry entry)
        {
            if (size() > 4)
            {
                c.c().put(entry.getKey(), new SoftReference(entry.getValue()));
                return true;
            } else
            {
                return false;
            }
        }

            
            {
                a = c.this;
                super(i, f, flag);
            }
    };
    private final Runnable d = new SimpleBitmapCache._cls2();

    public c()
    {
    }

    static ConcurrentHashMap c()
    {
        return c;
    }

    public Bitmap a(String s)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Bitmap bitmap = (Bitmap)b.get(s);
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        b.remove(s);
        b.put(s, bitmap);
        obj;
        JVM INSTR monitorexit ;
        return bitmap;
        obj;
        JVM INSTR monitorexit ;
        obj = (SoftReference)c.get(s);
        if (obj != null)
        {
            obj = (Bitmap)((SoftReference) (obj)).get();
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            c.remove(s);
        }
        return null;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        return ((Bitmap) (obj));
    }

    public void a()
    {
        synchronized (b)
        {
            b.clear();
        }
        c.clear();
        return;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(String s, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            synchronized (b)
            {
                b.put(s, bitmap);
            }
            return;
        } else
        {
            return;
        }
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void b()
    {
        a.removeCallbacks(d);
        a.postDelayed(d, 30000L);
    }


    // Unreferenced inner class com/aviary/android/feather/sdk/utils/SimpleBitmapCache$2

/* anonymous class */
    class SimpleBitmapCache._cls2
        implements Runnable
    {

        final c a;

        public void run()
        {
            a.a();
        }

            
            {
                a = c.this;
                super();
            }
    }

}
