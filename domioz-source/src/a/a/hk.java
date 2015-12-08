// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.graphics.Bitmap;

// Referenced classes of package a.a:
//            hs, hl, jl, js, 
//            hq, ja, ie, ii

final class hk
    implements Runnable
{

    boolean a;
    private final Bitmap b;
    private final String c;
    private final jl d;
    private final String e;
    private final ja f;
    private final ie g;
    private final hq h;
    private final ii i;

    public hk(Bitmap bitmap, hs hs1, hq hq1, ii ii)
    {
        b = bitmap;
        c = hs1.a;
        d = hs1.c;
        e = hs1.b;
        f = hs1.e.q;
        g = hs1.f;
        h = hq1;
        i = ii;
    }

    public final void run()
    {
        if (d.e())
        {
            if (a)
            {
                js.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] {
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
                js.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] {
                    e
                });
            }
            d.d();
            return;
        }
        if (a)
        {
            js.a("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[] {
                i, e
            });
        }
        f.a(b, d);
        g.a(c, d.d(), b);
        h.b(d);
    }
}
