// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;
import android.os.Handler;

// Referenced classes of package bo.app:
//            it, ir, iv, ku, 
//            in, io, kp, jk

public final class jb
    implements Runnable
{

    private final it a;
    private final Bitmap b;
    private final iv c;
    private final Handler d;

    public jb(it it1, Bitmap bitmap, iv iv1, Handler handler)
    {
        a = it1;
        b = bitmap;
        c = iv1;
        d = handler;
    }

    public final void run()
    {
        if (a.a.u)
        {
            ku.a("PostProcess image before displaying [%s]", new Object[] {
                c.b
            });
        }
        in in1 = new in(c.e.p.a(), c, a, jk.c);
        in1.a = a.a.u;
        if (c.e.s)
        {
            in1.run();
            return;
        } else
        {
            d.post(in1);
            return;
        }
    }
}
