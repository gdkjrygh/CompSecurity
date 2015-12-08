// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.modifiedrefresh;

import android.view.animation.Animation;

// Referenced classes of package com.roidapp.cloudlib.sns.modifiedrefresh:
//            SwipeRefreshLayout2

final class i
    implements android.view.animation.Animation.AnimationListener
{

    final SwipeRefreshLayout2 a;

    i(SwipeRefreshLayout2 swiperefreshlayout2)
    {
        a = swiperefreshlayout2;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (!SwipeRefreshLayout2.h(a))
        {
            SwipeRefreshLayout2.r(a);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
