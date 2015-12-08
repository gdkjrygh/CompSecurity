// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            CBSwipeRefreshLayout, MaterialProgressDrawable, CircleImageView

class this._cls0
    implements android.view.animation.ener
{

    final CBSwipeRefreshLayout this$0;

    public void onAnimationEnd(Animation animation)
    {
        if (CBSwipeRefreshLayout.access$000(CBSwipeRefreshLayout.this))
        {
            CBSwipeRefreshLayout.access$100(CBSwipeRefreshLayout.this).setAlpha(255);
            CBSwipeRefreshLayout.access$100(CBSwipeRefreshLayout.this).start();
            if (CBSwipeRefreshLayout.access$200(CBSwipeRefreshLayout.this) && CBSwipeRefreshLayout.access$300(CBSwipeRefreshLayout.this) != null)
            {
                CBSwipeRefreshLayout.access$300(CBSwipeRefreshLayout.this).onRefresh();
            }
        } else
        {
            CBSwipeRefreshLayout.access$100(CBSwipeRefreshLayout.this).stop();
            CBSwipeRefreshLayout.access$400(CBSwipeRefreshLayout.this).setVisibility(8);
            CBSwipeRefreshLayout.access$500(CBSwipeRefreshLayout.this, 255);
            if (CBSwipeRefreshLayout.access$600(CBSwipeRefreshLayout.this))
            {
                CBSwipeRefreshLayout.access$700(CBSwipeRefreshLayout.this, 0.0F);
            } else
            {
                CBSwipeRefreshLayout.access$900(CBSwipeRefreshLayout.this, mOriginalOffsetTop - CBSwipeRefreshLayout.access$800(CBSwipeRefreshLayout.this), true);
            }
        }
        CBSwipeRefreshLayout.access$802(CBSwipeRefreshLayout.this, CBSwipeRefreshLayout.access$400(CBSwipeRefreshLayout.this).getTop());
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    RefreshListener()
    {
        this$0 = CBSwipeRefreshLayout.this;
        super();
    }
}
