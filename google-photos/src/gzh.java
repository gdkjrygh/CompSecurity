// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageButton;

final class gzh
    implements ds
{

    private gzf a;

    gzh(gzf gzf1)
    {
        a = gzf1;
        super();
    }

    public final void b_(Object obj)
    {
        if (gzf.b(a).c && !gzf.c(a))
        {
            gzf.a(a, true);
            if (gzf.d(a))
            {
                gzf.f(a).startAnimation(gzf.e(a));
            }
        } else
        if (!gzf.b(a).c && gzf.c(a))
        {
            gzf.a(a, false);
            if (gzf.d(a))
            {
                gzf.f(a).startAnimation(gzf.g(a));
                return;
            }
        }
    }
}
