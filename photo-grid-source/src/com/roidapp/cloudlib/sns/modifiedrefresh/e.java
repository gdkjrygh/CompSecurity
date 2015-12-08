// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.view.animation.Animation;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            g, c

final class e
    implements android.view.animation.Animation.AnimationListener
{

    final g a;
    final c b;

    e(c c1, g g1)
    {
        b = c1;
        a = g1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
    }

    public final void onAnimationRepeat(Animation animation)
    {
        a.m();
        a.c();
        a.b(a.j());
        if (b.a)
        {
            b.a = false;
            animation.setDuration(1332L);
            a.a(false);
            return;
        } else
        {
            c.a(b, (c.a(b) + 1.0F) % 5F);
            return;
        }
    }

    public final void onAnimationStart(Animation animation)
    {
        c.a(b, 0.0F);
    }
}
