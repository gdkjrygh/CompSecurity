// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package bo.app:
//            ih

public final class ij
    implements ih
{

    private final LinkedHashMap a;
    private final int b;
    private int c;

    public ij(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        } else
        {
            b = i;
            a = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    private static int a(Bitmap bitmap)
    {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    private Bitmap a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        s = (Bitmap)a.get(s);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    private void a(int i)
    {
_L1:
        this;
        JVM INSTR monitorenter ;
        if (c < 0 || a.isEmpty() && c != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (c > i && !a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj = (java.util.Map.Entry)a.entrySet().iterator().next();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        String s = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (Bitmap)((java.util.Map.Entry) (obj)).getValue();
        a.remove(s);
        c = c - a(((Bitmap) (obj)));
        this;
        JVM INSTR monitorexit ;
          goto _L1
    }

    private boolean a(String s, Bitmap bitmap)
    {
        if (s == null || bitmap == null)
        {
            throw new NullPointerException("key == null || value == null");
        }
        this;
        JVM INSTR monitorenter ;
        c = c + a(bitmap);
        s = (Bitmap)a.put(s, bitmap);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        c = c - a(((Bitmap) (s)));
        this;
        JVM INSTR monitorexit ;
        a(b);
        return true;
        s;
        throw s;
    }

    public final volatile Object a(Object obj)
    {
        return a((String)obj);
    }

    public final Collection a()
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset = new HashSet(a.keySet());
        this;
        JVM INSTR monitorexit ;
        return hashset;
        Exception exception;
        exception;
        throw exception;
    }

    public final volatile boolean a(Object obj, Object obj1)
    {
        return a((String)obj, (Bitmap)obj1);
    }

    public final void b(Object obj)
    {
        obj = (String)obj;
        if (obj == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        obj = (Bitmap)a.remove(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        c = c - a(((Bitmap) (obj)));
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = String.format("LruCache[maxSize=%d]", new Object[] {
            Integer.valueOf(b)
        });
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
