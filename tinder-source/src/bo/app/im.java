// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;

// Referenced classes of package bo.app:
//            iu, in, km, kt, 
//            is, kc, jf, jj

final class im
    implements Runnable
{

    boolean a;
    private final Bitmap b;
    private final String c;
    private final km d;
    private final String e;
    private final kc f;
    private final jf g;
    private final is h;
    private final jj i;

    public im(Bitmap bitmap, iu iu1, is is1, jj jj)
    {
        b = bitmap;
        c = iu1.a;
        d = iu1.c;
        e = iu1.b;
        f = iu1.e.q;
        g = iu1.f;
        h = is1;
        i = jj;
    }

    public final void run()
    {
        if (d.e())
        {
            if (a)
            {
                kt.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] {
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
                kt.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] {
                    e
                });
            }
            d.d();
            return;
        }
        if (a)
        {
            kt.a("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[] {
                i, e
            });
        }
        f.a(b, d);
        g.a(c, d.d(), b);
        h.b(d);
    }
}
