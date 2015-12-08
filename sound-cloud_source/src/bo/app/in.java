// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;

// Referenced classes of package bo.app:
//            iv, io, kn, ku, 
//            it, kd, jg, jk

final class in
    implements Runnable
{

    boolean a;
    private final Bitmap b;
    private final String c;
    private final kn d;
    private final String e;
    private final kd f;
    private final jg g;
    private final it h;
    private final jk i;

    public in(Bitmap bitmap, iv iv1, it it1, jk jk)
    {
        b = bitmap;
        c = iv1.a;
        d = iv1.c;
        e = iv1.b;
        f = iv1.e.q;
        g = iv1.f;
        h = it1;
        i = jk;
    }

    public final void run()
    {
        if (d.e())
        {
            if (a)
            {
                ku.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] {
                    e
                });
            }
            d.d();
            return;
        }
        String s = h.a(d);
        boolean flag;
        if (!e.equals(s))
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
                ku.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] {
                    e
                });
            }
            d.d();
            return;
        }
        if (a)
        {
            ku.a("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[] {
                i, e
            });
        }
        f.a(b, d);
        g.a(c, d.d(), b);
        h.b(d);
    }
}
