// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            Fragment, x

final class ab
    implements android.view.animation.Animation.AnimationListener
{

    final Fragment a;
    final x b;

    ab(x x1, Fragment fragment)
    {
        b = x1;
        a = fragment;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (a.mAnimatingAway != null)
        {
            a.mAnimatingAway = null;
            b.a(a, a.mStateAfterAnimating, 0, 0, false);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
