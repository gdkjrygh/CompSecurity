// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;
import android.os.Handler;

// Referenced classes of package bo.app:
//            iy, iw, ja, kz, 
//            it, is, ku, jp

public final class jg
    implements Runnable
{

    private final iy a;
    private final Bitmap b;
    private final ja c;
    private final Handler d;

    public jg(iy iy1, Bitmap bitmap, ja ja1, Handler handler)
    {
        a = iy1;
        b = bitmap;
        c = ja1;
        d = handler;
    }

    public final void run()
    {
        if (a.a.u)
        {
            kz.a("PostProcess image before displaying [%s]", new Object[] {
                c.b
            });
        }
        Object obj = c.e.p;
        Bitmap bitmap = b;
        obj = new is(((ku) (obj)).a(), c, a, jp.c);
        obj.a = a.a.u;
        if (c.e.s)
        {
            ((is) (obj)).run();
            return;
        } else
        {
            d.post(((Runnable) (obj)));
            return;
        }
    }
}
