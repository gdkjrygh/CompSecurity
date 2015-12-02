// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.animation.Animation;

// Referenced classes of package android.support.v4.app:
//            Fragment, s

class x
    implements android.view.animation.Animation.AnimationListener
{

    final Fragment a;
    final s b;

    x(s s1, Fragment fragment)
    {
        b = s1;
        a = fragment;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        if (a.k != null)
        {
            a.k = null;
            b.a(a, a.l, 0, 0, false);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
