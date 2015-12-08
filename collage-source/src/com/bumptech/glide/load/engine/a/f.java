// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.a;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load.engine.a:
//            c, g, i, a

public class f
    implements c
{
    private static interface a
    {

        public abstract void a(Bitmap bitmap);

        public abstract void b(Bitmap bitmap);
    }

    private static class b
        implements a
    {

        public void a(Bitmap bitmap)
        {
        }

        public void b(Bitmap bitmap)
        {
        }

        private b()
        {
        }

    }


    private static final android.graphics.Bitmap.Config a;
    private final g b;
    private final Set c;
    private final int d;
    private final a e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    public f(int l)
    {
        this(l, e(), f());
    }

    f(int l, g g1, Set set)
    {
        d = l;
        f = l;
        b = g1;
        c = set;
        e = new b();
    }

    private void b()
    {
        b(f);
    }

    private void b(int l)
    {
        this;
        JVM INSTR monitorenter ;
_L2:
        Bitmap bitmap;
        if (g <= l)
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
            d();
        }
        g = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        e.b(bitmap);
        g = g - b.c(bitmap);
        bitmap.recycle();
        k = k + 1;
        if (Log.isLoggable("LruBitmapPool", 3))
        {
            Log.d("LruBitmapPool", (new StringBuilder()).append("Evicting bitmap=").append(b.b(bitmap)).toString());
        }
        c();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    private void c()
    {
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            d();
        }
    }

    private void d()
    {
        Log.v("LruBitmapPool", (new StringBuilder()).append("Hits=").append(h).append(", misses=").append(i).append(", puts=").append(j).append(", evictions=").append(k).append(", currentSize=").append(g).append(", maxSize=").append(f).append("\nStrategy=").append(b).toString());
    }

    private static g e()
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return new i();
        } else
        {
            return new com.bumptech.glide.load.engine.a.a();
        }
    }

    private static Set f()
    {
        HashSet hashset = new HashSet();
        hashset.addAll(Arrays.asList(android.graphics.Bitmap.Config.values()));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            hashset.add(null);
        }
        return Collections.unmodifiableSet(hashset);
    }

    public Bitmap a(int l, int i1, android.graphics.Bitmap.Config config)
    {
        this;
        JVM INSTR monitorenter ;
        config = b(l, i1, config);
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

    public void a()
    {
        if (Log.isLoggable("LruBitmapPool", 3))
        {
            Log.d("LruBitmapPool", "clearMemory");
        }
        b(0);
    }

    public void a(int l)
    {
        if (Log.isLoggable("LruBitmapPool", 3))
        {
            Log.d("LruBitmapPool", (new StringBuilder()).append("trimMemory, level=").append(l).toString());
        }
        if (l >= 60)
        {
            a();
        } else
        if (l >= 40)
        {
            b(f / 2);
            return;
        }
    }

    public boolean a(Bitmap bitmap)
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
            Log.v("LruBitmapPool", (new StringBuilder()).append("Reject bitmap from pool, bitmap: ").append(b.b(bitmap)).append(", is mutable: ").append(bitmap.isMutable()).append(", is allowed config: ").append(c.contains(bitmap.getConfig())).toString());
        }
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        int l = b.c(bitmap);
        b.a(bitmap);
        e.a(bitmap);
        j = j + 1;
        g = l + g;
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            Log.v("LruBitmapPool", (new StringBuilder()).append("Put bitmap in pool=").append(b.b(bitmap)).toString());
        }
        c();
        b();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Bitmap b(int l, int i1, android.graphics.Bitmap.Config config)
    {
        this;
        JVM INSTR monitorenter ;
        g g1 = b;
        if (config == null) goto _L2; else goto _L1
_L1:
        Object obj = config;
_L7:
        obj = g1.a(l, i1, ((android.graphics.Bitmap.Config) (obj)));
        if (obj != null) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("LruBitmapPool", 3))
        {
            Log.d("LruBitmapPool", (new StringBuilder()).append("Missing bitmap=").append(b.b(l, i1, config)).toString());
        }
        i = i + 1;
_L5:
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            Log.v("LruBitmapPool", (new StringBuilder()).append("Get bitmap=").append(b.b(l, i1, config)).toString());
        }
        c();
        this;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj));
_L2:
        obj = a;
        continue; /* Loop/switch isn't completed */
_L4:
        h = h + 1;
        g = g - b.c(((Bitmap) (obj)));
        e.b(((Bitmap) (obj)));
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
