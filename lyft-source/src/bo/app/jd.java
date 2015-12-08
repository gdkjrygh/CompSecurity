// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.res.Resources;

// Referenced classes of package bo.app:
//            jb, it, iw, ks, 
//            ji

final class jd
    implements Runnable
{

    final int a;
    final Throwable b;
    final jb c;

    jd(jb jb1, int i, Throwable throwable)
    {
        c = jb1;
        a = i;
        b = throwable;
        super();
    }

    public final void run()
    {
        it it1 = c.d;
        boolean flag;
        if (it1.f != null || it1.c != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ks ks1 = c.c;
            Object obj = c.d;
            Resources resources = c.a.a;
            if (((it) (obj)).c != 0)
            {
                obj = resources.getDrawable(((it) (obj)).c);
            } else
            {
                obj = ((it) (obj)).f;
            }
            ks1.a(((android.graphics.drawable.Drawable) (obj)));
        }
        obj = c.e;
        obj = c.b;
        c.c.d();
        new ji(a, b);
    }
}
