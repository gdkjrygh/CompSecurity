// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl, Fragment

class a
    implements android.view.animation.tener
{

    final Fragment a;
    final FragmentManagerImpl b;

    public void onAnimationEnd(Animation animation)
    {
        if (a.mAnimatingAway != null)
        {
            a.mAnimatingAway = null;
            b.a(a, a.mStateAfterAnimating, 0, 0, false);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    tener(FragmentManagerImpl fragmentmanagerimpl, Fragment fragment)
    {
        b = fragmentmanagerimpl;
        a = fragment;
        super();
    }
}
