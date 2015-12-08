// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import android.graphics.Bitmap;
import android.os.Handler;
import com.a.a.b.a.g;
import com.a.a.b.g.a;
import com.a.a.c.e;

// Referenced classes of package com.a.a.b:
//            i, g, k, d, 
//            c, l

final class q
    implements Runnable
{

    private final i a;
    private final Bitmap b;
    private final k c;
    private final Handler d;

    public q(i j, Bitmap bitmap, k k1, Handler handler)
    {
        a = j;
        b = bitmap;
        c = k1;
        d = handler;
    }

    public final void run()
    {
        if (a.a.u)
        {
            e.a("PostProcess image before displaying [%s]", new Object[] {
                c.b
            });
        }
        Object obj = c.e.p();
        Bitmap bitmap = b;
        obj = new c(((a) (obj)).a(), c, a, g.c);
        ((c) (obj)).a(a.a.u);
        com.a.a.b.l.a(((Runnable) (obj)), c.e.s(), d);
    }
}
