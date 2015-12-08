// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;

// Referenced classes of package bo.app:
//            ja, it, ks, kz, 
//            iy, ki, jl, jp

final class is
    implements Runnable
{

    boolean a;
    private final Bitmap b;
    private final String c;
    private final ks d;
    private final String e;
    private final ki f;
    private final jl g;
    private final iy h;
    private final jp i;

    public is(Bitmap bitmap, ja ja1, iy iy1, jp jp)
    {
        b = bitmap;
        c = ja1.a;
        d = ja1.c;
        e = ja1.b;
        f = ja1.e.q;
        g = ja1.f;
        h = iy1;
        i = jp;
    }

    public final void run()
    {
        if (d.e())
        {
            if (a)
            {
                kz.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] {
                    e
                });
            }
            Object obj = g;
            obj = c;
            d.d();
            return;
        }
        Object obj1 = h.a(d);
        boolean flag;
        if (!e.equals(obj1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (a)
            {
                kz.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] {
                    e
                });
            }
            obj1 = g;
            obj1 = c;
            d.d();
            return;
        }
        if (a)
        {
            kz.a("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[] {
                i, e
            });
        }
        obj1 = f;
        Bitmap bitmap = b;
        ks ks1 = d;
        jp jp = i;
        ((ki) (obj1)).a(bitmap, ks1);
        g.a(c, d.d(), b);
        h.b(d);
    }
}
