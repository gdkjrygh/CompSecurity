// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.internal.utils;

import android.util.SparseArray;
import com.millennialmedia.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.millennialmedia.internal.utils:
//            ThreadUtils

public class e
{

    private static final String a = com/millennialmedia/internal/utils/e.getSimpleName();
    private static SparseArray b = new SparseArray();
    private static AtomicInteger c = new AtomicInteger(0);
    private static AtomicBoolean d = new AtomicBoolean();

    public e()
    {
    }

    public static int a(Object obj, Long long1)
    {
        if (obj == null)
        {
            com.millennialmedia.c.d(a, "Nothing to cache, object provided is null");
            return 0;
        }
        int i = c.incrementAndGet();
    /* block-local class not found */
    class a {}

        obj = new a(obj, long1);
        if (com.millennialmedia.c.a())
        {
            com.millennialmedia.c.a(a, (new StringBuilder()).append("CacheItem added.\n\t").append(obj).toString());
        }
        b.put(i, obj);
        d();
        return i;
    }

    public static Object a(int i)
    {
        a a1 = c(i);
        if (a1 == null)
        {
            com.millennialmedia.c.d(a, (new StringBuilder()).append("Cached item for cache ID <").append(i).append("> is null").toString());
            return null;
        } else
        {
            b.remove(i);
            return a1.a;
        }
    }

    static String a()
    {
        return a;
    }

    static SparseArray b()
    {
        return b;
    }

    static a b(int i)
    {
        return c(i);
    }

    private static a c(int i)
    {
        a a2 = (a)b.get(i);
        a a1 = a2;
        if (a2 == null)
        {
            com.millennialmedia.c.d(a, (new StringBuilder()).append("unable to get cached object for cache id <").append(i).append(">, stored object is null ").append("and will be removed from cache").toString());
            b.remove(i);
            a1 = null;
        }
        return a1;
    }

    static AtomicBoolean c()
    {
        return d;
    }

    private static void d()
    {
        if (!d.compareAndSet(false, true))
        {
            if (com.millennialmedia.c.a())
            {
                com.millennialmedia.c.a(a, "Cleaner already running");
            }
            return;
        } else
        {
            com.millennialmedia.internal.utils.ThreadUtils.c(new TimedMemoryCache._cls1());
            return;
        }
    }

}
