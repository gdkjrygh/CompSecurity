// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;
import ok;
import pm;
import ql;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

final class a
    implements android.view.animation.stener
{

    private SwipeRefreshLayout a;

    public final void onAnimationEnd(Animation animation)
    {
        if (SwipeRefreshLayout.a(a))
        {
            SwipeRefreshLayout.b(a).setAlpha(255);
            SwipeRefreshLayout.b(a).start();
            if (SwipeRefreshLayout.c(a) && SwipeRefreshLayout.d(a) != null)
            {
                SwipeRefreshLayout.d(a).a();
            }
        } else
        {
            SwipeRefreshLayout.b(a).stop();
            SwipeRefreshLayout.e(a).setVisibility(8);
            SwipeRefreshLayout.f(a);
            SwipeRefreshLayout.c();
            SwipeRefreshLayout.a(a, a.b - SwipeRefreshLayout.g(a), true);
        }
        SwipeRefreshLayout.a(a, SwipeRefreshLayout.e(a).getTop());
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    ner(SwipeRefreshLayout swiperefreshlayout)
    {
        a = swiperefreshlayout;
        super();
    }
}
