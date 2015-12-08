// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b;

import android.content.res.Resources;
import com.b.a.b.a.b;
import com.b.a.b.e.a;

// Referenced classes of package com.b.a.b:
//            i, c, e

final class k
    implements Runnable
{

    final int a;
    final Throwable b;
    final i c;

    k(i j, int l, Throwable throwable)
    {
        c = j;
        a = l;
        b = throwable;
        super();
    }

    public final void run()
    {
        c c1 = c.d;
        boolean flag;
        if (c1.f != null || c1.c != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a a1 = c.c;
            Object obj = c.d;
            Resources resources = c.a.;
            if (((c) (obj)).c != 0)
            {
                obj = resources.getDrawable(((c) (obj)).c);
            } else
            {
                obj = ((c) (obj)).f;
            }
            a1.a(((android.graphics.drawable.Drawable) (obj)));
        }
        c.e.onLoadingFailed(c.b, c.c.d(), new b(a, b));
    }
}
