// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.graphics.Bitmap;
import com.a.a.b.a.g;
import com.a.a.b.e.a;
import com.a.a.c.e;

// Referenced classes of package com.a.a.b:
//            k, d, i

final class c
    implements Runnable
{

    private final Bitmap a;
    private final String b;
    private final a c;
    private final String d;
    private final com.a.a.b.c.a e;
    private final com.a.a.b.f.a f;
    private final i g;
    private final g h;
    private boolean i;

    public c(Bitmap bitmap, k k1, i j, g g1)
    {
        a = bitmap;
        b = k1.a;
        c = k1.c;
        d = k1.b;
        e = k1.e.q();
        f = k1.f;
        g = j;
        h = g1;
    }

    final void a(boolean flag)
    {
        i = flag;
    }

    public final void run()
    {
        if (c.e())
        {
            if (i)
            {
                com.a.a.c.e.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] {
                    d
                });
            }
            Object obj = f;
            obj = b;
            c.d();
            return;
        }
        Object obj1 = g.a(c);
        boolean flag;
        if (!d.equals(obj1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (i)
            {
                com.a.a.c.e.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] {
                    d
                });
            }
            obj1 = f;
            obj1 = b;
            c.d();
            return;
        }
        if (i)
        {
            com.a.a.c.e.a("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[] {
                h, d
            });
        }
        obj1 = e;
        Object obj2 = a;
        a a1 = c;
        g g1 = h;
        ((com.a.a.b.c.a) (obj1)).a(((Bitmap) (obj2)), a1);
        obj1 = f;
        obj2 = b;
        c.d();
        obj2 = a;
        ((com.a.a.b.f.a) (obj1)).b();
        g.b(c);
    }
}
