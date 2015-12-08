// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.widget:
//            SwipeRefreshLayout

class ah
    implements android.view.animation.Animation.AnimationListener
{

    final SwipeRefreshLayout b;

    private ah(SwipeRefreshLayout swiperefreshlayout)
    {
        b = swiperefreshlayout;
        super();
    }

    ah(SwipeRefreshLayout swiperefreshlayout, byte byte0)
    {
        this(swiperefreshlayout);
    }

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
