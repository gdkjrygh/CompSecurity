// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout, MaterialProgressDrawable, CircleImageView

class this._cls0
    implements android.view.animation.stener
{

    final SwipeRefreshLayout this$0;

    public void onAnimationEnd(Animation animation)
    {
        if (SwipeRefreshLayout.access$000(SwipeRefreshLayout.this))
        {
            SwipeRefreshLayout.access$100(SwipeRefreshLayout.this).setAlpha(255);
            SwipeRefreshLayout.access$100(SwipeRefreshLayout.this).start();
            if (SwipeRefreshLayout.access$200(SwipeRefreshLayout.this) && SwipeRefreshLayout.access$300(SwipeRefreshLayout.this) != null)
            {
                SwipeRefreshLayout.access$300(SwipeRefreshLayout.this).onRefresh();
            }
        } else
        {
            SwipeRefreshLayout.access$100(SwipeRefreshLayout.this).stop();
            SwipeRefreshLayout.access$400(SwipeRefreshLayout.this).setVisibility(8);
            SwipeRefreshLayout.access$500(SwipeRefreshLayout.this, 255);
            if (SwipeRefreshLayout.access$600(SwipeRefreshLayout.this))
            {
                SwipeRefreshLayout.access$700(SwipeRefreshLayout.this, 0.0F);
            } else
            {
                SwipeRefreshLayout.access$900(SwipeRefreshLayout.this, mOriginalOffsetTop - SwipeRefreshLayout.access$800(SwipeRefreshLayout.this), true);
            }
        }
        SwipeRefreshLayout.access$802(SwipeRefreshLayout.this, SwipeRefreshLayout.access$400(SwipeRefreshLayout.this).getTop());
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    RefreshListener()
    {
        this$0 = SwipeRefreshLayout.this;
        super();
    }
}
