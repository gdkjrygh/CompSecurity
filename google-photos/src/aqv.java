// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class aqv
    implements aqm
{

    private static final android.graphics.Bitmap.Config a;
    private final aqx b;
    private final Set c;
    private final aqw d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public aqv(int k)
    {
        Object obj;
        HashSet hashset;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = new aqz();
        } else
        {
            obj = new aqi();
        }
        hashset = new HashSet();
        hashset.addAll(Arrays.asList(android.graphics.Bitmap.Config.values()));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            hashset.add(null);
        }
        this(k, ((aqx) (obj)), Collections.unmodifiableSet(hashset));
    }

    private aqv(int k, aqx aqx1, Set set)
    {
        e = k;
        b = aqx1;
        c = set;
        d = new aqw();
    }

    private void b()
    {
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            c();
        }
    }

    private void b(int k)
    {
        this;
        JVM INSTR monitorenter ;
_L1:
        Bitmap bitmap;
        if (f <= k)
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
        f = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        f = f - b.c(bitmap);
        j = j + 1;
        if (Log.isLoggable("LruBitmapPool", 3))
        {
            String s = String.valueOf(b.b(bitmap));
            if (s.length() == 0)
            {
                break MISSING_BLOCK_LABEL_135;
            }
            "Evicting bitmap=".concat(s);
        }
_L2:
        b();
        bitmap.recycle();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        new String("Evicting bitmap=");
          goto _L2
    }

    private Bitmap c(int k, int l, android.graphics.Bitmap.Config config)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj1 = b;
        if (config == null) goto _L2; else goto _L1
_L1:
        Object obj = config;
_L9:
        obj = ((aqx) (obj1)).a(k, l, ((android.graphics.Bitmap.Config) (obj)));
        if (obj != null) goto _L4; else goto _L3
_L3:
        if (!Log.isLoggable("LruBitmapPool", 3)) goto _L6; else goto _L5
_L5:
        obj1 = String.valueOf(b.b(k, l, config));
        if (((String) (obj1)).length() == 0) goto _L8; else goto _L7
_L7:
        "Missing bitmap=".concat(((String) (obj1)));
_L6:
        h = h + 1;
_L10:
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            config = String.valueOf(b.b(k, l, config));
            if (config.length() == 0)
            {
                break MISSING_BLOCK_LABEL_220;
            }
            "Get bitmap=".concat(config);
        }
_L11:
        b();
        this;
        JVM INSTR monitorexit ;
        return ((Bitmap) (obj));
_L2:
        obj = a;
          goto _L9
_L8:
        new String("Missing bitmap=");
          goto _L6
        config;
        throw config;
_L4:
        g = g + 1;
        f = f - b.c(((Bitmap) (obj)));
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            ((Bitmap) (obj)).setHasAlpha(true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            ((Bitmap) (obj)).setPremultiplied(true);
        }
          goto _L10
        new String("Get bitmap=");
          goto _L11
    }

    private void c()
    {
        int k = g;
        int l = h;
        int i1 = i;
        int j1 = j;
        int k1 = f;
        int l1 = e;
        String s = String.valueOf(b);
        (new StringBuilder(String.valueOf(s).length() + 133)).append("Hits=").append(k).append(", misses=").append(l).append(", puts=").append(i1).append(", evictions=").append(j1).append(", currentSize=").append(k1).append(", maxSize=").append(l1).append("\nStrategy=").append(s);
    }

    public final Bitmap a(int k, int l, android.graphics.Bitmap.Config config)
    {
        Bitmap bitmap = c(k, l, config);
        if (bitmap != null)
        {
            bitmap.eraseColor(0);
            return bitmap;
        } else
        {
            return Bitmap.createBitmap(k, l, config);
        }
    }

    public final void a()
    {
        b(0);
    }

    public final void a(int k)
    {
        if (Log.isLoggable("LruBitmapPool", 3))
        {
            (new StringBuilder(29)).append("trimMemory, level=").append(k);
        }
        if (k >= 40)
        {
            b(0);
        } else
        if (k >= 20)
        {
            b(e / 2);
            return;
        }
    }

    public final void a(Bitmap bitmap)
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
        if (bitmap.isRecycled())
        {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
        if (bitmap.isMutable() && b.c(bitmap) <= e && c.contains(bitmap.getConfig())) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            String s = String.valueOf("Reject bitmap from pool, bitmap: ");
            String s1 = String.valueOf(b.b(bitmap));
            boolean flag = bitmap.isMutable();
            boolean flag1 = c.contains(bitmap.getConfig());
            (new StringBuilder(String.valueOf(s).length() + 45 + String.valueOf(s1).length())).append(s).append(s1).append(", is mutable: ").append(flag).append(", is allowed config: ").append(flag1);
        }
        bitmap.recycle();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int k = b.c(bitmap);
        b.a(bitmap);
        i = i + 1;
        f = k + f;
        if (Log.isLoggable("LruBitmapPool", 2))
        {
            bitmap = String.valueOf(b.b(bitmap));
            if (bitmap.length() == 0)
            {
                break MISSING_BLOCK_LABEL_284;
            }
            "Put bitmap in pool=".concat(bitmap);
        }
_L4:
        b();
        b(e);
          goto _L3
        new String("Put bitmap in pool=");
          goto _L4
    }

    public final Bitmap b(int k, int l, android.graphics.Bitmap.Config config)
    {
        Bitmap bitmap1 = c(k, l, config);
        Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            bitmap = Bitmap.createBitmap(k, l, config);
        }
        return bitmap;
    }

    static 
    {
        a = android.graphics.Bitmap.Config.ARGB_8888;
    }
}
