// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.graphics.Bitmap;
import android.os.Handler;

// Referenced classes of package a.a:
//            hq, ho, hs, js, 
//            hk, hl, jn, ii

public final class hy
    implements Runnable
{

    private final hq a;
    private final Bitmap b;
    private final hs c;
    private final Handler d;

    public hy(hq hq1, Bitmap bitmap, hs hs1, Handler handler)
    {
        a = hq1;
        b = bitmap;
        c = hs1;
        d = handler;
    }

    public final void run()
    {
        if (a.a.u)
        {
            js.a("PostProcess image before displaying [%s]", new Object[] {
                c.b
            });
        }
        hk hk1 = new hk(c.e.p.a(), c, a, ii.c);
        hk1.a = a.a.u;
        if (c.e.s)
        {
            hk1.run();
            return;
        } else
        {
            d.post(hk1);
            return;
        }
    }
}
