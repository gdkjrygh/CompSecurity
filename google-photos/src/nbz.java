// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;

public final class nbz
    implements mvx
{

    private static final int b = (int)Math.round(Math.sqrt(16D));
    private static final oni c = new oni("debug.social.bitmap_pool");
    private static final String d[] = {
        "put", "evict", "hit", "inexact hit", "miss"
    };
    private final nbv e;
    private final ncc f = new ncc();
    private final ncg g = new ncg();
    private final int h;
    private int i;
    private final Map j = new HashMap();

    public nbz(int k)
    {
        h = k;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            e = new nce();
            return;
        } else
        {
            e = new nca();
            return;
        }
    }

    private void a(int k)
    {
        Object obj;
        nbw nbw1;
        if (k < 0)
        {
            throw new IllegalArgumentException(String.format("Target byte size must be >= 0, got: %s", new Object[] {
                Integer.valueOf(k)
            }));
        }
_L3:
        if (i > k)
        {
            obj = f.a();
            nbw1 = e.a(((Bitmap) (obj)));
            g.a(nbw1);
            i = (int)((long)i - nbw1.c);
            if (obj == null)
            {
                throw new IllegalStateException("Pool is larger than its max size, but has no more bitmaps to evict.");
            }
        } else
        {
            return;
        }
        if (true) goto _L2; else goto _L1
_L2:
        ((Bitmap) (obj)).recycle();
        if (Log.isLoggable("BitmapPoolLru", 2))
        {
            obj = String.valueOf(nbw1);
            (new StringBuilder(String.valueOf(obj).length() + 16)).append("Evicted bitmap: ").append(((String) (obj)));
        }
        if (true) goto _L3; else goto _L1
_L1:
    }

    public Bitmap a(int k, int l, nby nby)
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap;
        nbw nbw1;
        nbw1 = e.a(k, l);
        bitmap = f.a(nbw1);
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        nbw nbw2;
        Object obj = e.a(b * k, b * l);
        obj = g.a.navigableKeySet().subSet(nbw1, obj);
        nbw2 = e.a(nbw1, ((java.util.SortedSet) (obj)), nby);
        Object obj1;
        obj1 = nbw2;
        if (nbw2 == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        bitmap = f.a(nbw2);
        obj1 = nbw2;
_L8:
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        e.a(nbw1, bitmap);
        i = (int)((long)i - ((nbw) (obj1)).c);
        g.a(((nbw) (obj1)));
        if (Log.isLoggable("BitmapPoolLru", 2))
        {
            nby = String.valueOf(obj1);
            obj1 = String.valueOf(nbw1);
            (new StringBuilder(String.valueOf(nby).length() + 18 + String.valueOf(obj1).length())).append("Got bitmap: ").append(nby).append(" for: ").append(((String) (obj1)));
        }
_L6:
        this;
        JVM INSTR monitorexit ;
        return bitmap;
_L4:
        if (!Log.isLoggable("BitmapPoolLru", 3)) goto _L6; else goto _L5
_L5:
        obj1 = String.valueOf(nbw1);
        nby = String.valueOf(nby);
        (new StringBuilder(String.valueOf(obj1).length() + 29 + String.valueOf(nby).length())).append("Missing bitmap: ").append(((String) (obj1))).append(" match type: ").append(nby);
          goto _L6
        nby;
        throw nby;
_L2:
        obj1 = nbw1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final String a()
    {
        return "BitmapPoolLru";
    }

    public final void a(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        nbw nbw1 = e.a(bitmap);
        if (nbw1.c <= (long)h && bitmap.getConfig() == android.graphics.Bitmap.Config.ARGB_8888 && bitmap.isMutable()) goto _L2; else goto _L1
_L1:
        bitmap.recycle();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ncd ncd1;
        ncc ncc1;
        ncc1 = f;
        ncd1 = (ncd)ncc1.a.get(nbw1);
        Object obj;
        obj = ncd1;
        if (ncd1 != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj = new ncd(nbw1);
        ncc1.a.put(nbw1, obj);
        obj.b = ncc1.b.b;
        obj.a = ncc1.b;
        ((ncd) (obj)).b.a = ((ncd) (obj));
        ncc1.b.b = ((ncd) (obj));
        if (((ncd) (obj)).d == null)
        {
            obj.d = new ArrayList();
        }
        ((ncd) (obj)).d.add(bitmap);
        obj = g;
        bitmap = (Integer)((ncg) (obj)).a.get(nbw1);
        obj = ((ncg) (obj)).a;
        int k;
        if (bitmap != null)
        {
            break; /* Loop/switch isn't completed */
        }
        k = 1;
_L5:
        ((NavigableMap) (obj)).put(nbw1, Integer.valueOf(k));
        if (Log.isLoggable("BitmapPoolLru", 2))
        {
            bitmap = String.valueOf(nbw1);
            (new StringBuilder(String.valueOf(bitmap).length() + 24)).append("Putting bitmap in pool: ").append(bitmap);
        }
        long l = i;
        i = (int)(nbw1.c + l);
        a(h);
        if (true) goto _L4; else goto _L3
        bitmap;
        throw bitmap;
_L3:
        k = bitmap.intValue();
        k++;
          goto _L5
    }

    public final void a(PrintWriter printwriter)
    {
        this;
        JVM INSTR monitorenter ;
        printwriter.print("current size: ");
        printwriter.println(i);
        printwriter.println("Profiling is currently inactive; to activate set the property debug.social.bitmap_pool to true.");
        this;
        JVM INSTR monitorexit ;
        return;
        printwriter;
        throw printwriter;
    }

    public final String b()
    {
        return "The current size of the pool. With profiling, hit and miss counts for each bitmap size.";
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        a(0);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final float d()
    {
        this;
        JVM INSTR monitorenter ;
        float f1;
        int k;
        f1 = i;
        k = h;
        f1 /= k;
        this;
        JVM INSTR monitorexit ;
        return f1;
        Exception exception;
        exception;
        throw exception;
    }

}
