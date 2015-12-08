// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.b.a.b.a.f;
import com.b.a.b.a.h;
import com.b.a.b.e.a;
import com.b.a.c.c;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.b.a.b:
//            c, f, e, h, 
//            m, i, g

public class d
{

    public static final String a = com/b/a/b/d.getSimpleName();
    private static volatile d e;
    public e b;
    private com.b.a.b.f c;
    private final com.b.a.b.f.a d = new com.b.a.b.f.d();

    protected d()
    {
    }

    private static Handler a(com.b.a.b.c c1)
    {
        Handler handler = c1.r;
        if (c1.s)
        {
            c1 = null;
        } else
        {
            c1 = handler;
            if (handler == null)
            {
                c1 = handler;
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                    return new Handler();
                }
            }
        }
        return c1;
    }

    public static d a()
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        com/b/a/b/d;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new d();
        }
        com/b/a/b/d;
        JVM INSTR monitorexit ;
_L2:
        return e;
        Exception exception;
        exception;
        com/b/a/b/d;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null) goto _L2; else goto _L1
_L1:
        com.b.a.c.c.a("Initialize ImageLoader with configuration", new Object[0]);
        c = new com.b.a.b.f(e1);
        b = e1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.b.a.c.c.c("Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first.", new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
        e1;
        throw e1;
    }

    public final void a(String s, com.b.a.b.c c1, com.b.a.b.f.a a1)
    {
        b();
        com.b.a.b.a.e e1 = b.();
        com.b.a.b.c c2 = c1;
        if (c1 == null)
        {
            c2 = b.r;
        }
        b(s, new com.b.a.b.e.c(s, e1, h.b), c2, a1);
    }

    public final void a(String s, a a1, com.b.a.b.c c1, com.b.a.b.f.a a2)
    {
        b(s, a1, c1, a2);
    }

    public final void b()
    {
        if (b == null)
        {
            throw new IllegalStateException("ImageLoader must be init with configuration before using");
        } else
        {
            return;
        }
    }

    public final void b(String s, a a1, com.b.a.b.c c1, com.b.a.b.f.a a2)
    {
        boolean flag = false;
        b();
        if (a1 == null)
        {
            throw new IllegalArgumentException("Wrong arguments were passed to displayImage() method (ImageView reference must not be null)");
        }
        if (a2 == null)
        {
            a2 = d;
        }
        if (c1 == null)
        {
            c1 = b.r;
        }
        if (TextUtils.isEmpty(s))
        {
            c.b(a1);
            a2.onLoadingStarted(s, a1.d());
            if (c1.e != null || c1.b != 0)
            {
                flag = true;
            }
            if (flag)
            {
                Resources resources = b.;
                if (c1.b != 0)
                {
                    c1 = resources.getDrawable(c1.b);
                } else
                {
                    c1 = c1.e;
                }
                a1.a(c1);
            } else
            {
                a1.a(null);
            }
            a2.onLoadingComplete(s, a1.d(), null);
            return;
        }
        com.b.a.b.a.e e1 = com.b.a.c.a.a(a1, b.());
        String s1 = com.b.a.c.d.a(s, e1);
        c.e.put(Integer.valueOf(a1.f()), s1);
        a2.onLoadingStarted(s, a1.d());
        Bitmap bitmap = (Bitmap)b.n.a(s1);
        if (bitmap != null && !bitmap.isRecycled())
        {
            com.b.a.c.c.a("Load image from memory cache [%s]", new Object[] {
                s1
            });
            if (c1.a())
            {
                s = new com.b.a.b.h(s, a1, e1, s1, c1, a2, c.a(s));
                s = new m(c, bitmap, s, a(c1));
                if (c1.s)
                {
                    s.run();
                    return;
                } else
                {
                    a1 = c;
                    a1.a();
                    ((com.b.a.b.f) (a1)).c.execute(s);
                    return;
                }
            } else
            {
                c1.q.display(bitmap, a1, f.c);
                a2.onLoadingComplete(s, a1.d(), bitmap);
                return;
            }
        }
        if (c1.d != null || c1.a != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Object obj = b.;
            if (c1.a != 0)
            {
                obj = ((Resources) (obj)).getDrawable(c1.a);
            } else
            {
                obj = c1.d;
            }
            a1.a(((android.graphics.drawable.Drawable) (obj)));
        } else
        if (c1.g)
        {
            a1.a(null);
        }
        s = new com.b.a.b.h(s, a1, e1, s1, c1, a2, c.a(s));
        s = new i(c, s, a(c1));
        if (c1.s)
        {
            s.run();
            return;
        } else
        {
            a1 = c;
            ((com.b.a.b.f) (a1)).d.execute(new g(a1, s));
            return;
        }
    }

    public final void c()
    {
        c.f.set(true);
    }

    public final void d()
    {
        com.b.a.b.f f1 = c;
        f1.f.set(false);
        synchronized (f1.i)
        {
            f1.i.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
