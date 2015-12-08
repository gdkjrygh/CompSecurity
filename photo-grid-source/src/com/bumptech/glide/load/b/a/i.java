// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load.b.a:
//            e, n, a, k, 
//            l, j

public final class i
    implements e
{

    private static final android.graphics.Bitmap.Config a;
    private final l b;
    private final Set c;
    private final int d;
    private final j e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public i(int i1)
    {
        Object obj;
        HashSet hashset;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = new n();
        } else
        {
            obj = new a();
        }
        hashset = new HashSet();
        hashset.addAll(Arrays.asList(android.graphics.Bitmap.Config.values()));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            hashset.add(null);
        }
        this(i1, ((l) (obj)), Collections.unmodifiableSet(hashset));
    }

    private i(int i1, l l1, Set set)
    {
        d = i1;
        f = i1;
        b = l1;
        c = set;
        e = new k((byte)0);
    }

    private void b()
    {
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            c();
        }
    }

    private void b(int i1)
    {
        this;
        JVM INSTR monitorenter ;
_L2:
        Bitmap bitmap;
        if (g <= i1)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        bitmap = b.a();
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (Log.isLoggable("LruBitmapPool", 5))
        {
            Log.w("LruBitmapPool", "Size mismatch, resetting");
            c();
        }
        g = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        g = g - b.c(bitmap);
        bitmap.recycle();
        k = k + 1;
        if (Log.isLoggable("LruBitmapPool", 3))
        {
            (new StringBuilder("Evicting bitmap=")).append(b.b(bitmap));
        }
        b();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    private void c()
    {
        (new StringBuilder("Hits=")).append(h).append(", misses=").append(i).append(", puts=").append(j).append(", evictions=").append(k).append(", currentSize=").append(g).append(", maxSize=").append(f).append("\nStrategy=").append(b);
    }

    public final Bitmap a(int i1, int j1, android.graphics.Bitmap.Config config)
    {
        this;
        JVM INSTR monitorenter ;
        config = b(i1, j1, config);
        if (config == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        config.eraseColor(0);
        this;
        JVM INSTR monitorexit ;
        return config;
        config;
        throw config;
    }

    public final void a()
    {
        Log.isLoggable("LruBitmapPool", 3);
        b(0);
    }

    public final void a(int i1)
    {
        Log.isLoggable("LruBitmapPool", 3);
        if (i1 >= 60)
        {
            a();
        } else
        if (i1 >= 40)
        {
            b(f / 2);
            return;
        }
    }

    public final boolean a(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("Bitmap must not be null");
        bitmap;
        this;
        JVM INSTR monitorexit ;
        throw bitmap;
        if (bitmap.isMutable() && b.c(bitmap) <= f && c.contains(bitmap.getConfig())) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            (new StringBuilder("Reject bitmap from pool, bitmap: ")).append(b.b(bitmap)).append(", is mutable: ").append(bitmap.isMutable()).append(", is allowed config: ").append(c.contains(bitmap.getConfig()));
        }
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        int i1 = b.c(bitmap);
        b.a(bitmap);
        j = j + 1;
        g = i1 + g;
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            (new StringBuilder("Put bitmap in pool=")).append(b.b(bitmap));
        }
        b();
        b(f);
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Bitmap b(int i1, int j1, android.graphics.Bitmap.Config config)
    {
        this;
        JVM INSTR monitorenter ;
        l l1 = b;
        if (config == null) goto _L2; else goto _L1
_L1:
        Object obj = config;
_L7:
        obj = l1.a(i1, j1, ((android.graphics.Bitmap.Config) (obj)));
        if (obj != null) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("LruBitmapPool", 3))
        {
            (new StringBuilder("Missing bitmap=")).append(b.b(i1, j1, config));
        }
        i = i + 1;
_L5:
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            (new StringBuilder("Get bitmap=")).append(b.b(i1, j1, config));
        }
        b();
        this;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj));
_L2:
        obj = a;
        continue; /* Loop/switch isn't completed */
_L4:
        h = h + 1;
        g = g - b.c(((Bitmap) (obj)));
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            ((Bitmap) (obj)).setHasAlpha(true);
        }
          goto _L5
        config;
        throw config;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        a = android.graphics.Bitmap.Config.ARGB_8888;
    }
}
