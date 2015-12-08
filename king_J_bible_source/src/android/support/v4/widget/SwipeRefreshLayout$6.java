// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

class this._cls0
    implements Runnable
{

    final SwipeRefreshLayout this$0;

    public void run()
    {
        SwipeRefreshLayout.access$902(SwipeRefreshLayout.this, true);
        if (SwipeRefreshLayout.access$500(SwipeRefreshLayout.this) != null)
        {
            SwipeRefreshLayout.access$402(SwipeRefreshLayout.this, SwipeRefreshLayout.access$800(SwipeRefreshLayout.this));
            SwipeRefreshLayout.access$1300(SwipeRefreshLayout.this).setDuration(SwipeRefreshLayout.access$1200(SwipeRefreshLayout.this));
            SwipeRefreshLayout.access$1300(SwipeRefreshLayout.this).setAnimationListener(SwipeRefreshLayout.access$1400(SwipeRefreshLayout.this));
            SwipeRefreshLayout.access$1300(SwipeRefreshLayout.this).reset();
            SwipeRefreshLayout.access$1300(SwipeRefreshLayout.this).setInterpolator(SwipeRefreshLayout.access$1500(SwipeRefreshLayout.this));
            startAnimation(SwipeRefreshLayout.access$1300(SwipeRefreshLayout.this));
        }
        SwipeRefreshLayout.access$1100(SwipeRefreshLayout.this, SwipeRefreshLayout.access$700(SwipeRefreshLayout.this) + getPaddingTop(), SwipeRefreshLayout.access$1000(SwipeRefreshLayout.this));
    }

    ()
    {
        this$0 = SwipeRefreshLayout.this;
        super();
    }
}
