// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.view.animation.Animation;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            SwipeRefreshLayout2, c, x, a

final class h
    implements android.view.animation.Animation.AnimationListener
{

    final SwipeRefreshLayout2 a;

    h(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        a = swiperefreshlayout2;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (SwipeRefreshLayout2.a(a))
        {
            SwipeRefreshLayout2.b(a).setAlpha(255);
            SwipeRefreshLayout2.b(a).start();
            if (SwipeRefreshLayout2.c(a))
            {
                SwipeRefreshLayout2.d(a);
                if (SwipeRefreshLayout2.e(a) != null)
                {
                    SwipeRefreshLayout2.e(a).onRefresh();
                }
            }
        } else
        {
            SwipeRefreshLayout2.b(a).stop();
            SwipeRefreshLayout2.f(a).setVisibility(8);
            SwipeRefreshLayout2.g(a);
            if (SwipeRefreshLayout2.h(a))
            {
                SwipeRefreshLayout2.a(a, 0.0F);
            } else
            {
                SwipeRefreshLayout2.a(a, a.c - SwipeRefreshLayout2.i(a), true);
            }
        }
        SwipeRefreshLayout2.a(a, SwipeRefreshLayout2.f(a).getTop());
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
