// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout, MaterialProgressDrawable, CircleImageView

class a
    implements android.view.animation.stener
{

    final SwipeRefreshLayout a;

    public void onAnimationEnd(Animation animation)
    {
        if (SwipeRefreshLayout.a(a))
        {
            SwipeRefreshLayout.b(a).setAlpha(255);
            SwipeRefreshLayout.b(a).start();
            if (SwipeRefreshLayout.c(a) && SwipeRefreshLayout.d(a) != null)
            {
                SwipeRefreshLayout.d(a).onRefresh();
            }
        } else
        {
            SwipeRefreshLayout.b(a).stop();
            SwipeRefreshLayout.e(a).setVisibility(8);
            SwipeRefreshLayout.a(a, 255);
            if (SwipeRefreshLayout.f(a))
            {
                SwipeRefreshLayout.a(a, 0.0F);
            } else
            {
                SwipeRefreshLayout.a(a, a.b - SwipeRefreshLayout.g(a), true);
            }
        }
        SwipeRefreshLayout.b(a, SwipeRefreshLayout.e(a).getTop());
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    RefreshListener(SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super();
    }
}
