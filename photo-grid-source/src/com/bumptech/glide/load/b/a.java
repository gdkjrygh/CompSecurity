// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.util.Log;
import com.bumptech.glide.f.b;
import com.bumptech.glide.i.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.resource.e.c;

// Referenced classes of package com.bumptech.glide.load.b:
//            c, e, x, d, 
//            b, p

final class a
{

    private static final com.bumptech.glide.load.b.c a = new com.bumptech.glide.load.b.c();
    private final p b;
    private final int c;
    private final int d;
    private final com.bumptech.glide.load.a.c e;
    private final b f;
    private final g g;
    private final c h;
    private final com.bumptech.glide.load.b.b i;
    private final com.bumptech.glide.load.b.e j;
    private final int k;
    private final com.bumptech.glide.load.b.c l;
    private volatile boolean m;

    public a(p p1, int i1, int j1, com.bumptech.glide.load.a.c c1, b b1, g g1, c c2, 
            com.bumptech.glide.load.b.b b2, com.bumptech.glide.load.b.e e1, int k1)
    {
        this(p1, i1, j1, c1, b1, g1, c2, b2, e1, k1, a);
    }

    private a(p p1, int i1, int j1, com.bumptech.glide.load.a.c c1, b b1, g g1, c c2, 
            com.bumptech.glide.load.b.b b2, com.bumptech.glide.load.b.e e1, int k1, com.bumptech.glide.load.b.c c3)
    {
        b = p1;
        c = i1;
        d = j1;
        e = c1;
        f = b1;
        g = g1;
        h = c2;
        i = b2;
        j = e1;
        k = k1;
        l = c3;
    }

    static com.bumptech.glide.load.b.c a(a a1)
    {
        return a1.l;
    }

    private x a(x x1)
    {
        long l1 = com.bumptech.glide.i.d.a();
        x x2;
        if (x1 == null)
        {
            x2 = null;
        } else
        {
            x x3 = g.a(x1, c, d);
            x2 = x3;
            if (!x1.equals(x3))
            {
                x1.d();
                x2 = x3;
            }
        }
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Transformed resource from source", l1);
        }
        if (x2 != null && j.b())
        {
            long l2 = com.bumptech.glide.i.d.a();
            x1 = new com.bumptech.glide.load.b.d(this, f.d(), x2);
            i.a().a(b, x1);
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Wrote transformed from source to cache", l2);
            }
        }
        l1 = com.bumptech.glide.i.d.a();
        x1 = b(x2);
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Transcoded transformed from source", l1);
        }
        return x1;
    }

    private x a(com.bumptech.glide.load.c c1)
    {
        Object obj = i.a().a(c1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((x) (obj));
_L2:
        x x1 = f.a().a(obj, c, d);
        obj = x1;
        if (x1 != null) goto _L4; else goto _L3
_L3:
        i.a().b(c1);
        return x1;
        Exception exception;
        exception;
        i.a().b(c1);
        throw exception;
    }

    private void a(String s, long l1)
    {
        (new StringBuilder()).append(s).append(" in ").append(com.bumptech.glide.i.d.a(l1)).append(", key: ").append(b);
    }

    private x b(x x1)
    {
        if (x1 == null)
        {
            return null;
        } else
        {
            return h.a(x1);
        }
    }

    private x e()
    {
        Object obj;
        boolean flag;
        long l1 = com.bumptech.glide.i.d.a();
        obj = e.a(k);
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Fetched data", l1);
        }
        flag = m;
        if (flag)
        {
            e.a();
            return null;
        }
        if (!j.a()) goto _L2; else goto _L1
_L1:
        x x1;
        long l2;
        l2 = com.bumptech.glide.i.d.a();
        obj = new com.bumptech.glide.load.b.d(this, f.c(), obj);
        i.a().a(b.a(), ((com.bumptech.glide.load.b.b.c) (obj)));
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Wrote source to cache", l2);
        }
        l2 = com.bumptech.glide.i.d.a();
        x1 = a(b.a());
        obj = x1;
        if (!Log.isLoggable("DecodeJob", 2))
        {
            break MISSING_BLOCK_LABEL_169;
        }
        obj = x1;
        if (x1 == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        a("Decoded source from cache", l2);
        obj = x1;
_L4:
        e.a();
        return ((x) (obj));
_L2:
        l2 = com.bumptech.glide.i.d.a();
        x1 = f.b().a(obj, c, d);
        obj = x1;
        if (!Log.isLoggable("DecodeJob", 2)) goto _L4; else goto _L3
_L3:
        a("Decoded from source", l2);
        obj = x1;
          goto _L4
        Exception exception;
        exception;
        e.a();
        throw exception;
    }

    public final x a()
    {
        x x1;
        if (!j.b())
        {
            x1 = null;
        } else
        {
            long l1 = com.bumptech.glide.i.d.a();
            x1 = a(((com.bumptech.glide.load.c) (b)));
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Decoded transformed from cache", l1);
            }
            l1 = com.bumptech.glide.i.d.a();
            x x2 = b(x1);
            x1 = x2;
            if (Log.isLoggable("DecodeJob", 2))
            {
                a("Transcoded transformed from cache", l1);
                return x2;
            }
        }
        return x1;
    }

    public final x b()
    {
        if (!j.a())
        {
            return null;
        }
        long l1 = com.bumptech.glide.i.d.a();
        x x1 = a(b.a());
        if (Log.isLoggable("DecodeJob", 2))
        {
            a("Decoded source from cache", l1);
        }
        return a(x1);
    }

    public final x c()
    {
        return a(e());
    }

    public final void d()
    {
        m = true;
        e.c();
    }

}
