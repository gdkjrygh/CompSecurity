// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

class a
    implements Runnable
{

    final SwipeRefreshLayout a;

    public void run()
    {
        SwipeRefreshLayout.a(a, true);
        if (SwipeRefreshLayout.e(a) != null)
        {
            SwipeRefreshLayout.b(a, SwipeRefreshLayout.h(a));
            SwipeRefreshLayout.j(a).setDuration(SwipeRefreshLayout.i(a));
            SwipeRefreshLayout.j(a).setAnimationListener(SwipeRefreshLayout.k(a));
            SwipeRefreshLayout.j(a).reset();
            SwipeRefreshLayout.j(a).setInterpolator(SwipeRefreshLayout.l(a));
            a.startAnimation(SwipeRefreshLayout.j(a));
        }
        SwipeRefreshLayout.a(a, SwipeRefreshLayout.f(a) + a.getPaddingTop(), SwipeRefreshLayout.g(a));
    }

    (SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super();
    }
}
