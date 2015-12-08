// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            CBSwipeRefreshLayout

class this._cls0
    implements android.view.animation.ener
{

    final CBSwipeRefreshLayout this$0;

    public void onAnimationEnd(Animation animation)
    {
        if (!CBSwipeRefreshLayout.access$600(CBSwipeRefreshLayout.this))
        {
            CBSwipeRefreshLayout.access$1000(CBSwipeRefreshLayout.this, null);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    r()
    {
        this$0 = CBSwipeRefreshLayout.this;
        super();
    }
}
