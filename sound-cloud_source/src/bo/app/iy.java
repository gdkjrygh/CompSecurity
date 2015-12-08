// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.res.Resources;

// Referenced classes of package bo.app:
//            iw, io, ir, kn, 
//            jd

final class iy
    implements Runnable
{

    final int a;
    final Throwable b;
    final iw c;

    iy(iw iw1, int i, Throwable throwable)
    {
        c = iw1;
        a = i;
        b = throwable;
        super();
    }

    public final void run()
    {
        io io1 = c.d;
        boolean flag;
        if (io1.f != null || io1.c != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            kn kn1 = c.c;
            Object obj = c.d;
            Resources resources = c.a.a;
            if (((io) (obj)).c != 0)
            {
                obj = resources.getDrawable(((io) (obj)).c);
            } else
            {
                obj = ((io) (obj)).f;
            }
            kn1.a(((android.graphics.drawable.Drawable) (obj)));
        }
        c.c.d();
        new jd(a, b);
    }
}
