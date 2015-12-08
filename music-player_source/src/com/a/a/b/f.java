// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.a.a.b.a.g;
import com.a.a.b.e.a;
import com.a.a.b.e.b;
import com.a.a.b.f.c;
import com.a.a.c.e;

// Referenced classes of package com.a.a.b:
//            d, g, i, k, 
//            q, l

public class f
{

    public static final String a = com/a/a/b/f.getSimpleName();
    private static volatile f e;
    private com.a.a.b.g b;
    private i c;
    private final com.a.a.b.f.a d = new c();

    protected f()
    {
    }

    private static Handler a(d d1)
    {
        Handler handler = d1.r();
        if (d1.s())
        {
            d1 = null;
        } else
        {
            d1 = handler;
            if (handler == null)
            {
                d1 = handler;
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                    return new Handler();
                }
            }
        }
        return d1;
    }

    public static f a()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        com/a/a/b/f;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new f();
        }
        com/a/a/b/f;
        JVM INSTR monitorexit ;
_L2:
        return e;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(com.a.a.b.g g1)
    {
        this;
        JVM INSTR monitorenter ;
        if (g1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("ImageLoader configuration can not be initialized with null");
        g1;
        this;
        JVM INSTR monitorexit ;
        throw g1;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        if (g1.u)
        {
            com.a.a.c.e.a("Initialize ImageLoader with configuration", new Object[0]);
        }
        c = new i(g1);
        b = g1;
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        com.a.a.c.e.c("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
          goto _L1
    }

    public final void a(String s, ImageView imageview, d d1, com.a.a.b.f.a a1)
    {
        b b1 = new b(imageview);
        if (b == null)
        {
            throw new IllegalStateException("ImageLoader must be init with configuration before using");
        }
        Object obj;
        String s1;
        int j;
        int i1;
        int j1;
        if (a1 == null)
        {
            imageview = d;
        } else
        {
            imageview = a1;
        }
        if (d1 == null)
        {
            d1 = b.t;
        }
        if (TextUtils.isEmpty(s))
        {
            c.b(b1);
            b1.d();
            imageview.a();
            if (d1.b())
            {
                b1.a(d1.b(b.a));
            } else
            {
                b1.a(null);
            }
            b1.d();
            imageview.b();
            return;
        }
        a1 = b;
        obj = ((com.a.a.b.g) (a1)).a.getDisplayMetrics();
        i1 = ((com.a.a.b.g) (a1)).b;
        j = i1;
        if (i1 <= 0)
        {
            j = ((DisplayMetrics) (obj)).widthPixels;
        }
        j1 = ((com.a.a.b.g) (a1)).c;
        i1 = j1;
        if (j1 <= 0)
        {
            i1 = ((DisplayMetrics) (obj)).heightPixels;
        }
        obj = com.a.a.c.a.a(b1, new com.a.a.b.a.f(j, i1));
        s1 = (new StringBuilder(s)).append("_").append(((com.a.a.b.a.f) (obj)).a()).append("x").append(((com.a.a.b.a.f) (obj)).b()).toString();
        c.a(b1, s1);
        b1.d();
        imageview.a();
        a1 = (Bitmap)b.p.a(s1);
        if (a1 != null && !a1.isRecycled())
        {
            if (b.u)
            {
                com.a.a.c.e.a("Load image from memory cache [%s]", new Object[] {
                    s1
                });
            }
            if (d1.e())
            {
                s = new k(s, b1, ((com.a.a.b.a.f) (obj)), s1, d1, imageview, c.a(s));
                s = new q(c, a1, s, a(d1));
                if (d1.s())
                {
                    s.run();
                    return;
                } else
                {
                    c.a(s);
                    return;
                }
            } else
            {
                s = d1.q();
                d1 = g.c;
                s.a(a1, b1);
                b1.d();
                imageview.b();
                return;
            }
        }
        if (d1.a())
        {
            b1.a(d1.a(b.a));
        } else
        if (d1.g())
        {
            b1.a(null);
        }
        s = new k(s, b1, ((com.a.a.b.a.f) (obj)), s1, d1, imageview, c.a(s));
        s = new l(c, s, a(d1));
        if (d1.s())
        {
            s.run();
            return;
        } else
        {
            c.a(s);
            return;
        }
    }

}
