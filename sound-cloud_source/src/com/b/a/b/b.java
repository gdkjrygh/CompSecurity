// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import android.graphics.Bitmap;
import com.b.a.b.a.f;
import com.b.a.b.e.a;
import com.b.a.c.c;

// Referenced classes of package com.b.a.b:
//            h, c, f

final class b
    implements Runnable
{

    private final Bitmap a;
    private final String b;
    private final a c;
    private final String d;
    private final com.b.a.b.c.a e;
    private final com.b.a.b.f.a f;
    private final com.b.a.b.f g;
    private final f h;

    public b(Bitmap bitmap, h h1, com.b.a.b.f f1, f f2)
    {
        a = bitmap;
        b = h1.a;
        c = h1.c;
        d = h1.b;
        e = h1.e.q;
        f = h1.f;
        g = f1;
        h = f2;
    }

    public final void run()
    {
        if (c.e())
        {
            com.b.a.c.c.a("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] {
                d
            });
            f.onLoadingCancelled(b, c.d());
            return;
        }
        String s = g.a(c);
        boolean flag;
        if (!d.equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            com.b.a.c.c.a("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] {
                d
            });
            f.onLoadingCancelled(b, c.d());
            return;
        } else
        {
            com.b.a.c.c.a("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[] {
                h, d
            });
            e.display(a, c, h);
            g.b(c);
            f.onLoadingComplete(b, c.d(), a);
            return;
        }
    }
}
