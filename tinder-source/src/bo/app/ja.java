// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;
import android.os.Handler;

// Referenced classes of package bo.app:
//            is, iq, iu, kt, 
//            im, in, ko, jj

public final class ja
    implements Runnable
{

    private final is a;
    private final Bitmap b;
    private final iu c;
    private final Handler d;

    public ja(is is1, Bitmap bitmap, iu iu1, Handler handler)
    {
        a = is1;
        b = bitmap;
        c = iu1;
        d = handler;
    }

    public final void run()
    {
        if (a.a.u)
        {
            kt.a("PostProcess image before displaying [%s]", new Object[] {
                c.b
            });
        }
        im im1 = new im(c.e.p.a(), c, a, jj.c);
        im1.a = a.a.u;
        if (c.e.s)
        {
            im1.run();
            return;
        } else
        {
            d.post(im1);
            return;
        }
    }
}
