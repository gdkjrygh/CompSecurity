// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.res.Resources;

// Referenced classes of package a.a:
//            ht, hl, ho, jl, 
//            ia

final class hv
    implements Runnable
{

    final int a;
    final Throwable b;
    final ht c;

    hv(ht ht1, int i, Throwable throwable)
    {
        c = ht1;
        a = i;
        b = throwable;
        super();
    }

    public final void run()
    {
        hl hl1 = c.d;
        boolean flag;
        if (hl1.f != null || hl1.c != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            jl jl1 = c.c;
            Object obj = c.d;
            Resources resources = c.a.a;
            if (((hl) (obj)).c != 0)
            {
                obj = resources.getDrawable(((hl) (obj)).c);
            } else
            {
                obj = ((hl) (obj)).f;
            }
            jl1.a(((android.graphics.drawable.Drawable) (obj)));
        }
        c.c.d();
        new ia(a, b);
    }
}
