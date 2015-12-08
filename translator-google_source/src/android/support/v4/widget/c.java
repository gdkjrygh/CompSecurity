// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.bt;
import android.view.animation.AnimationUtils;

// Referenced classes of package android.support.v4.widget:
//            a, b

final class c
    implements Runnable
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        boolean flag1 = false;
        if (!android.support.v4.widget.a.a(a))
        {
            return;
        }
        if (android.support.v4.widget.a.b(a))
        {
            android.support.v4.widget.a.c(a);
            b b1 = android.support.v4.widget.a.d(a);
            b1.e = AnimationUtils.currentAnimationTimeMillis();
            b1.i = -1L;
            b1.f = b1.e;
            b1.j = 0.5F;
            b1.g = 0;
            b1.h = 0;
        }
        b b2 = android.support.v4.widget.a.d(a);
        boolean flag = flag1;
        if (b2.i > 0L)
        {
            flag = flag1;
            if (AnimationUtils.currentAnimationTimeMillis() > b2.i + (long)b2.k)
            {
                flag = true;
            }
        }
        if (flag || !android.support.v4.widget.a.e(a))
        {
            android.support.v4.widget.a.f(a);
            return;
        }
        if (android.support.v4.widget.a.g(a))
        {
            android.support.v4.widget.a.h(a);
            android.support.v4.widget.a.i(a);
        }
        if (b2.f == 0L)
        {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        } else
        {
            long l = AnimationUtils.currentAnimationTimeMillis();
            float f = b2.a(l);
            f = f * 4F + -4F * f * f;
            long l1 = l - b2.f;
            b2.f = l;
            b2.g = (int)((float)l1 * f * b2.c);
            b2.h = (int)(f * (float)l1 * b2.d);
            int i = b2.h;
            a.a(i);
            bt.a(android.support.v4.widget.a.j(a), this);
            return;
        }
    }
}
