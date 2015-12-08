// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import com.kik.g.p;
import com.kik.g.s;
import com.kik.sdkutils.b.a;
import com.kik.sdkutils.b.b;
import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.kik.cache:
//            d, b, h, g

public final class c extends d
{

    private boolean a;
    private final com.kik.cache.b b;
    private final b c;
    private final d d = null;

    public c(d d1, a a1, b b1, long l)
    {
        super(d1, a1);
        a = true;
        b = new com.kik.cache.b(l);
        if (l <= 0L)
        {
            a = false;
        }
        c = b1;
    }

    private g b(Object obj, h h1)
    {
        g g2 = (g)h1.a();
        com.kik.cache.b b1 = b;
        b1;
        JVM INSTR monitorenter ;
        Object obj1 = (h)b.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        if (((SoftReference)((h) (obj1)).a()).get() == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        g g1 = g2;
        if (((Long)((h) (obj1)).b()).equals(h1.b()))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        obj1 = (g)c.a(h1.a());
        g1 = g2;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        b.put(obj, new h(new SoftReference(((g) (obj1)).a()), new Long(((Long)h1.b()).longValue())));
        g1 = ((g) (obj1));
        b1;
        JVM INSTR monitorexit ;
        return g1;
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected final p a(Object obj)
    {
        p p1 = new p();
        com.kik.cache.b b1 = b;
        b1;
        JVM INSTR monitorenter ;
        if (!b.containsKey(obj)) goto _L2; else goto _L1
_L1:
        h h1 = (h)b.get(obj);
        if (h1 == null) goto _L4; else goto _L3
_L3:
        Bitmap bitmap = (Bitmap)((SoftReference)h1.a()).get();
        if (bitmap == null) goto _L6; else goto _L5
_L5:
        if (bitmap.isRecycled()) goto _L6; else goto _L7
_L7:
        obj = s.a(new h(new g(bitmap), new Long(((Long)h1.b()).longValue())));
_L8:
        b1;
        JVM INSTR monitorexit ;
        return ((p) (obj));
_L6:
        b.remove(obj);
        p1.a(new Exception("Not Found"));
        obj = p1;
          goto _L8
_L4:
        b.remove(obj);
        p1.a(new Exception("Not Found"));
        obj = p1;
          goto _L8
_L2:
        p1.a(new Exception("Not Found"));
        obj = p1;
          goto _L8
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final Object a(Object obj, h h1)
    {
        return b(obj, h1);
    }

    protected final Set a()
    {
        HashSet hashset;
        synchronized (b)
        {
            hashset = new HashSet(b.keySet());
        }
        return hashset;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void b(Object obj)
    {
        synchronized (b)
        {
            b.remove(obj);
        }
        return;
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
    }
}
