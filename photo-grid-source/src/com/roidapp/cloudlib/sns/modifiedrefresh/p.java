// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.view.animation.Animation;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            SwipeRefreshLayout2, c, w, a

final class p
    implements android.view.animation.Animation.AnimationListener
{

    final SwipeRefreshLayout2 a;

    p(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        a = swiperefreshlayout2;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (SwipeRefreshLayout2.j(a))
        {
            SwipeRefreshLayout2.k(a).setAlpha(255);
            SwipeRefreshLayout2.k(a).start();
            if (SwipeRefreshLayout2.l(a))
            {
                SwipeRefreshLayout2.m(a);
                if (SwipeRefreshLayout2.n(a) != null)
                {
                    SwipeRefreshLayout2.n(a).h();
                }
            }
        } else
        {
            SwipeRefreshLayout2.k(a).stop();
            SwipeRefreshLayout2.o(a).setVisibility(8);
            SwipeRefreshLayout2.p(a);
            if (SwipeRefreshLayout2.h(a))
            {
                SwipeRefreshLayout2.b(a, 0.0F);
            } else
            {
                SwipeRefreshLayout2.b(a, (a.d + a.getHeight()) - SwipeRefreshLayout2.o(a).getTop(), true);
            }
        }
        SwipeRefreshLayout2.b(a, SwipeRefreshLayout2.o(a).getTop() - a.getHeight());
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
