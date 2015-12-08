// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class YY
    implements YO
{

    private LinkedHashMap a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public YY(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("Max size must be positive.");
        } else
        {
            b = i;
            a = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    public YY(Context context)
    {
        this(Zp.c(context));
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
        String s = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = (Bitmap)((java.util.Map.Entry) (obj)).getValue();
        a.remove(s);
        c = c - Zp.a(((Bitmap) (obj)));
        e = e + 1;
        this;
        JVM INSTR monitorexit ;
          goto _L1
    }

    public final int a()
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

    public final Bitmap a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException("key == null");
        }
        this;
        JVM INSTR monitorenter ;
        s = (Bitmap)a.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        f = f + 1;
        this;
        JVM INSTR monitorexit ;
        return s;
        g = g + 1;
        this;
        JVM INSTR monitorexit ;
        return null;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a(String s, Bitmap bitmap)
    {
        if (s == null || bitmap == null)
        {
            throw new NullPointerException("key == null || bitmap == null");
        }
        this;
        JVM INSTR monitorenter ;
        d = d + 1;
        c = c + Zp.a(bitmap);
        s = (Bitmap)a.put(s, bitmap);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        c = c - Zp.a(s);
        this;
        JVM INSTR monitorexit ;
        a(b);
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
        int i = b;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        a(-1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
