// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

// Referenced classes of package com.squareup.a:
//            k, bm

public class ab
    implements k
{

    final LinkedHashMap b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public ab(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("Max size must be positive.");
        } else
        {
            c = i;
            b = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    public ab(Context context)
    {
        this(bm.c(context));
    }

    private void a(int i)
    {
_L1:
        this;
        JVM INSTR monitorenter ;
        if (d < 0 || b.isEmpty() && d != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (d > i && !b.isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj = (java.util.Map.Entry)b.entrySet().iterator().next();
        String s = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (Bitmap)((java.util.Map.Entry) (obj)).getValue();
        b.remove(s);
        d = d - bm.a(((Bitmap) (obj)));
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
          goto _L1
    }

    public final int a()
    {
        this;
        JVM INSTR monitorenter ;
        int i = d;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public Bitmap a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        s = (Bitmap)b.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        g = g + 1;
        this;
        JVM INSTR monitorexit ;
        return s;
        h = h + 1;
        this;
        JVM INSTR monitorexit ;
        return null;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(String s, Bitmap bitmap)
    {
        if (s == null || bitmap == null)
        {
            throw new NullPointerException("key == null || bitmap == null");
        }
        this;
        JVM INSTR monitorenter ;
        e = e + 1;
        d = d + bm.a(bitmap);
        s = (Bitmap)b.put(s, bitmap);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        d = d - bm.a(s);
        this;
        JVM INSTR monitorexit ;
        a(c);
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i = c;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }
}
